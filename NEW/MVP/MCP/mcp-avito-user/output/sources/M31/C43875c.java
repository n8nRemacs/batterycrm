package m31;

import java.net.SocketException;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* renamed from: m31.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43875c implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ub1.b f414287b;

    public C43875c(Ub1.b bVar) {
        this.f414287b = bVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) throws SocketException {
        if (!((Boolean) obj).booleanValue()) {
            return G0.f406611a;
        }
        this.f414287b.f16508r.invoke();
        return G0.f406611a;
    }
}
