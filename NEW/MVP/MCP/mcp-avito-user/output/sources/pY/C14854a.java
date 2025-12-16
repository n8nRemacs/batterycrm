package Py;

import Oy.InterfaceC14748a;
import Oy.InterfaceC14750c;
import Oy.InterfaceC14751d;
import Oy.InterfaceC14752e;
import Oy.InterfaceC14754g;
import Y61.k;
import Y61.l;
import com.avito.android.account.G;
import com.avito.android.employee_bug_reporter_impl.domain.PositionOnScreen;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EmployeeBugReporterInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPy/a;", "LOy/g;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Py.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14854a implements InterfaceC14754g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14752e f13382a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14750c f13383b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC14748a f13384c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final G f13385d;

    @Inject
    public C14854a(@k InterfaceC14752e interfaceC14752e, @k InterfaceC14750c interfaceC14750c, @k InterfaceC14748a interfaceC14748a, @k G g12) {
        this.f13382a = interfaceC14752e;
        this.f13383b = interfaceC14750c;
        this.f13384c = interfaceC14748a;
        this.f13385d = g12;
    }

    @Override // Oy.InterfaceC14754g
    public final void a() {
        this.f13384c.a(this.f13385d.e().getUserId());
    }

    @Override // Oy.InterfaceC14754g
    @k
    public final PositionOnScreen b() {
        return this.f13382a.getF147285b();
    }

    @Override // Oy.InterfaceC14754g
    @l
    public final Object c(@k Continuation<? super G0> continuation) {
        Object objB = this.f13384c.b(this.f13385d.e().getUserId(), continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }

    @Override // Oy.InterfaceC14754g
    @k
    public final InterfaceC43160i<InterfaceC14751d> d() {
        return this.f13383b.b();
    }

    @Override // Oy.InterfaceC14754g
    public final void e(@k PositionOnScreen positionOnScreen) {
        this.f13382a.a(positionOnScreen);
    }

    @Override // Oy.InterfaceC14754g
    @l
    public final Object f(@k Continuation<? super G0> continuation) {
        Object objA = this.f13383b.a((ContinuationImpl) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
