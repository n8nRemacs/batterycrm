package leakcanary.internal;

import Y41.l;
import Y61.k;
import android.app.Application;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.v0;
import leakcanary.A;

/* compiled from: LeakCanaryDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lleakcanary/internal/e;", "", "<init>", "()V", "a", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final e f414089b = new e();

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f414088a = C42727D.c(b.f414091l);

    /* compiled from: LeakCanaryDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function1;", "Landroid/app/Application;", "Lkotlin/G0;", "invoke", "()LY41/l;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends N implements Y41.a<l<? super Application, ? extends G0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f414091l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final l<? super Application, ? extends G0> invoke() {
            try {
                Object obj = Class.forName("leakcanary.internal.InternalLeakCanary").getDeclaredField("INSTANCE").get(null);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type (android.app.Application) -> kotlin.Unit");
                }
                v0.e(1, obj);
                return (l) obj;
            } catch (Throwable unused) {
                return a.f414090b;
            }
        }
    }

    /* compiled from: LeakCanaryDelegate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lleakcanary/internal/e$a;", "Lkotlin/Function1;", "Landroid/app/Application;", "Lkotlin/G0;", "Lleakcanary/A;", "<init>", "()V", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    public static final class a implements l<Application, G0>, A {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f414090b = new a();

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Application application) {
            return G0.f406611a;
        }

        @Override // leakcanary.A
        public final void a() {
        }
    }
}
