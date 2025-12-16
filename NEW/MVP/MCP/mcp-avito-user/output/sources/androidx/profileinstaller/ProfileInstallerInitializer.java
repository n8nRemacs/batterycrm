package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import b2.InterfaceC25391b;
import j.N;
import j.X;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC25391b<b> {

    @X
    public static class a {
    }

    public static class b {
    }

    @Override // b2.InterfaceC25391b
    @N
    public final b a(@N Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j12) {
                this.f53623b.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new b();
    }

    @Override // b2.InterfaceC25391b
    @N
    public final List<Class<? extends InterfaceC25391b<?>>> b() {
        return Collections.emptyList();
    }
}
