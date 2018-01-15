/**
 * Created by agupta on 1/11/18.
 */
package underthehood.benchmarking;


import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public  class FirstJMHInvalidBenchmark {



        @Benchmark
        public void testMethod() {
            // This is a demo/sample template for building your JMH benchmarks. Edit as needed.
            // Put your benchmark code here.

            int a = 1;
            int b = 2;
            int sum = a + b;
        }

        public static void main(String[] args) throws RunnerException {
            Options opt = new OptionsBuilder()
                    .include(FirstJMHInvalidBenchmark.class.getSimpleName())
                    .forks(1)
                    .build();

            new Runner(opt).run();
        }

}
