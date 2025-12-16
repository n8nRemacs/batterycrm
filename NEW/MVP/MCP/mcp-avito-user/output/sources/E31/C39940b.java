package e31;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* renamed from: e31.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39940b implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f394934b;

    public C39940b(f fVar) {
        this.f394934b = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        n31.d dVar = (n31.d) obj;
        f fVar = this.f394934b;
        if (!L.f(fVar.f394943d, dVar)) {
            fVar.f394943d = dVar;
            fVar.f394944e = fVar.a(dVar);
        }
        return G0.f406611a;
    }
}
