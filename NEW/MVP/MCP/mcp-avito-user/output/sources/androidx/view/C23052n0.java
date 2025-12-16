package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.view.C23050m0;
import androidx.view.Lifecycle;
import j.X;
import kotlin.Metadata;

/* compiled from: ProcessLifecycleOwner.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/n0;", "Landroidx/lifecycle/v;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23052n0 extends C23067v {
    final /* synthetic */ C23050m0 this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/n0$a", "Landroidx/lifecycle/v;", "Landroid/app/Activity;", "activity", "Lkotlin/G0;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.n0$a */
    public static final class a extends C23067v {
        final /* synthetic */ C23050m0 this$0;

        public a(C23050m0 c23050m0) {
            this.this$0 = c23050m0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@k Activity activity) {
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@k Activity activity) {
            C23050m0 c23050m0 = this.this$0;
            int i12 = c23050m0.f46824b + 1;
            c23050m0.f46824b = i12;
            if (i12 == 1 && c23050m0.f46827e) {
                c23050m0.f46829g.f(Lifecycle.Event.ON_START);
                c23050m0.f46827e = false;
            }
        }
    }

    public C23052n0(C23050m0 c23050m0) {
        this.this$0 = c23050m0;
    }

    @Override // androidx.view.C23067v, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@k Activity activity, @l Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT < 29) {
            FragmentC23058q0.f46869c.getClass();
            ((FragmentC23058q0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f46870b = this.this$0.f46831i;
        }
    }

    @Override // androidx.view.C23067v, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@k Activity activity) {
        C23050m0 c23050m0 = this.this$0;
        int i12 = c23050m0.f46825c - 1;
        c23050m0.f46825c = i12;
        if (i12 == 0) {
            c23050m0.f46828f.postDelayed(c23050m0.f46830h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @X
    public void onActivityPreCreated(@k Activity activity, @l Bundle savedInstanceState) {
        C23050m0.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.view.C23067v, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@k Activity activity) {
        C23050m0 c23050m0 = this.this$0;
        int i12 = c23050m0.f46824b - 1;
        c23050m0.f46824b = i12;
        if (i12 == 0 && c23050m0.f46826d) {
            c23050m0.f46829g.f(Lifecycle.Event.ON_STOP);
            c23050m0.f46827e = true;
        }
    }
}
