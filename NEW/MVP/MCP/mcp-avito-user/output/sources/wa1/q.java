package wa1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes9.dex */
public abstract class q {
    public static InterpreterApi a(Context context, String str) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str);
        return InterpreterApi.create(new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength()), new Interpreter.Options().setNumThreads(Runtime.getRuntime().availableProcessors()).setUseXNNPACK(true));
    }
}
