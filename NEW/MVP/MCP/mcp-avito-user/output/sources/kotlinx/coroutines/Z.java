package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: DefaultExecutor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC43082c0 f410747a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC43082c0 interfaceC43082c0;
        String strC = kotlinx.coroutines.internal.d0.c("kotlinx.coroutines.main.delay");
        if (strC != null ? Boolean.parseBoolean(strC) : false) {
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            AbstractC43129d1 abstractC43129d1 = kotlinx.coroutines.internal.K.f411877a;
            interfaceC43082c0 = (kotlinx.coroutines.internal.L.a(abstractC43129d1) || !(abstractC43129d1 instanceof InterfaceC43082c0)) ? Y.f410745j : (InterfaceC43082c0) abstractC43129d1;
        } else {
            interfaceC43082c0 = Y.f410745j;
        }
        f410747a = interfaceC43082c0;
    }
}
