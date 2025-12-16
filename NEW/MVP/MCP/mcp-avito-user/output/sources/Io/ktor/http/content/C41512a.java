package io.ktor.http.content;

import java.lang.reflect.Method;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;

/* compiled from: BlockingBridge.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.content.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41512a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f399955a = C42727D.c(C11411a.f399956l);

    /* compiled from: BlockingBridge.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Method;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.content.a$a, reason: collision with other inner class name */
    public static final class C11411a extends N implements Y41.a<Method> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11411a f399956l = new C11411a();

        public C11411a() {
            super(0);
        }

        @Override // Y41.a
        public final Method invoke() {
            try {
                ThreadLocal<io.ktor.utils.io.jvm.javaio.i<Thread>> threadLocal = io.ktor.utils.io.jvm.javaio.j.f401129a;
                return io.ktor.utils.io.jvm.javaio.j.class.getMethod("isParkingAllowed", new Class[0]);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @Y61.l
    public static final Object a(@Y61.k Y41.l lVar, @Y61.k SuspendLambda suspendLambda) {
        boolean zF2;
        Method method = (Method) f399955a.getValue();
        boolean z12 = false;
        if (method != null) {
            try {
                zF2 = L.f(method.invoke(null, new Object[0]), Boolean.TRUE);
            } catch (Throwable unused) {
                zF2 = false;
            }
            if (zF2) {
                z12 = true;
            }
        }
        if (z12) {
            Object objInvoke = lVar.invoke(suspendLambda);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }
        Object objG = C43259k.g(C43262l0.f411947c, new C41513b(lVar, null), suspendLambda);
        if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objG = G0.f406611a;
        }
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
