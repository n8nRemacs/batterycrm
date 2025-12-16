package androidx.view;

import Fc1.G3;
import X41.n;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.view.FragmentC23058q0;
import androidx.view.Lifecycle;
import j.InterfaceC42164u;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProcessLifecycleOwner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/m0;", "Landroidx/lifecycle/P;", "<init>", "()V", "a", "b", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23050m0 implements InterfaceC22983P {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final b f46822j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final C23050m0 f46823k = new C23050m0();

    /* renamed from: b, reason: collision with root package name */
    public int f46824b;

    /* renamed from: c, reason: collision with root package name */
    public int f46825c;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Handler f46828f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46826d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46827e = true;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C22985S f46829g = new C22985S(this, true);

    /* renamed from: h, reason: collision with root package name */
    @k
    public final G3 f46830h = new G3(this, 13);

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f46831i = new c();

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/m0$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "Lkotlin/G0;", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.lifecycle.m0$a */
    public static final class a {
        static {
            new a();
        }

        @n
        @InterfaceC42164u
        public static final void a(@k Activity activity, @k Application.ActivityLifecycleCallbacks callback) {
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/m0$b;", "", "<init>", "()V", "Landroidx/lifecycle/m0;", "newInstance", "Landroidx/lifecycle/m0;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.m0$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/m0$c", "Landroidx/lifecycle/q0$a;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.m0$c */
    public static final class c implements FragmentC23058q0.a {
        public c() {
        }
    }

    public final void a() {
        int i12 = this.f46825c + 1;
        this.f46825c = i12;
        if (i12 == 1) {
            if (!this.f46826d) {
                this.f46828f.removeCallbacks(this.f46830h);
            } else {
                this.f46829g.f(Lifecycle.Event.ON_RESUME);
                this.f46826d = false;
            }
        }
    }

    @Override // androidx.view.InterfaceC22983P
    @k
    public final Lifecycle getLifecycle() {
        return this.f46829g;
    }
}
