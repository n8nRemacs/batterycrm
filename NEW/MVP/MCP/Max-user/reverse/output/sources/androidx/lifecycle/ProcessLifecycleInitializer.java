package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.a48;
import defpackage.aac;
import defpackage.bac;
import defpackage.hc8;
import defpackage.hd5;
import defpackage.k38;
import defpackage.ul7;
import defpackage.z38;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lul7;", "Lj48;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ul7 {
    @Override // defpackage.ul7
    public final List a() {
        return hd5.a;
    }

    @Override // defpackage.ul7
    public final Object b(Context context) {
        if (!((HashSet) hc8.D(context).c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!a48.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new z38());
        }
        bac bacVar = bac.s0;
        bacVar.getClass();
        bacVar.o = new Handler();
        bacVar.X.d(k38.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new aac(bacVar));
        return bacVar;
    }
}
