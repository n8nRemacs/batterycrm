package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.os.Bundle;
import androidx.view.FragmentC23058q0;
import j.k0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: LifecycleDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/K;", "", "<init>", "()V", "a", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22978K {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final AtomicBoolean f46676a;

    /* compiled from: LifecycleDispatcher.kt */
    @k0
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/K$a;", "Landroidx/lifecycle/v;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.K$a */
    public static final class a extends C23067v {
        @Override // androidx.view.C23067v, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@k Activity activity, @l Bundle savedInstanceState) {
            FragmentC23058q0.f46869c.getClass();
            FragmentC23058q0.b.b(activity);
        }
    }

    static {
        new C22978K();
        f46676a = new AtomicBoolean(false);
    }
}
