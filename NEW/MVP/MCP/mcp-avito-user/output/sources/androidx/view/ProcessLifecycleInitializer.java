package androidx.view;

import Y61.k;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.view.C22978K;
import androidx.view.Lifecycle;
import b2.C25390a;
import b2.InterfaceC25391b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ProcessLifecycleInitializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lb2/b;", "Landroidx/lifecycle/P;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC25391b<InterfaceC22983P> {
    @Override // b2.InterfaceC25391b
    public final InterfaceC22983P a(Context context) {
        if (!C25390a.c(context).f56821b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!C22978K.f46676a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C22978K.a());
        }
        C23050m0.f46822j.getClass();
        C23050m0 c23050m0 = C23050m0.f46823k;
        c23050m0.getClass();
        c23050m0.f46828f = new Handler();
        c23050m0.f46829g.f(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C23052n0(c23050m0));
        return c23050m0;
    }

    @Override // b2.InterfaceC25391b
    @k
    public final List<Class<? extends InterfaceC25391b<?>>> b() {
        return C42784z0.f406748b;
    }
}
