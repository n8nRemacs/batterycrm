package gv;

import Y61.k;
import androidx.view.C22985S;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.S0;
import androidx.view.T0;
import kotlin.Metadata;

/* compiled from: AppDeeplinkHandlerParent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgv/b;", "Lgv/c;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40740b implements InterfaceC40741c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final S0 f396941a = new S0();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C22985S f396942b = new C22985S(new a(), true);

    /* compiled from: AppDeeplinkHandlerParent.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"gv/b$a", "Landroidx/lifecycle/P;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gv.b$a */
    public static final class a implements InterfaceC22983P {
        public a() {
        }

        @Override // androidx.view.InterfaceC22983P
        @k
        public final Lifecycle getLifecycle() {
            return C40740b.this.f396942b;
        }
    }

    /* compiled from: AppDeeplinkHandlerParent.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"gv/b$b", "Landroidx/lifecycle/T0;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gv.b$b, reason: collision with other inner class name */
    public static final class C11236b implements T0 {
        public C11236b() {
        }

        @Override // androidx.view.T0
        @k
        /* renamed from: getViewModelStore */
        public final S0 getF42820b() {
            return C40740b.this.f396941a;
        }
    }

    @Override // gv.InterfaceC40741c
    public final InterfaceC23487e a() {
        throw new IllegalStateException("You can't instantiate SavedStateRegistry in an application class");
    }

    @Override // gv.InterfaceC40741c
    @k
    public final InterfaceC22983P b() {
        return new a();
    }

    @Override // gv.InterfaceC40741c
    @k
    public final T0 c() {
        return new C11236b();
    }
}
