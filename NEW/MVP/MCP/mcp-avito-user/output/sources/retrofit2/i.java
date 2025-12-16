package retrofit2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes9.dex */
abstract class i<ResponseT, ReturnT> extends A<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final x f430001a;

    /* renamed from: b, reason: collision with root package name */
    public final Call.Factory f430002b;

    /* renamed from: c, reason: collision with root package name */
    public final f<ResponseBody, ResponseT> f430003c;

    /* compiled from: HttpServiceMethod.java */
    public static final class a<ResponseT, ReturnT> extends i<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC47647c<ResponseT, ReturnT> f430004d;

        public a(x xVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, InterfaceC47647c<ResponseT, ReturnT> interfaceC47647c) {
            super(xVar, factory, fVar);
            this.f430004d = interfaceC47647c;
        }

        @Override // retrofit2.i
        public final ReturnT c(InterfaceC47646b<ResponseT> interfaceC47646b, Object[] objArr) {
            return this.f430004d.adapt(interfaceC47646b);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC47647c<ResponseT, InterfaceC47646b<ResponseT>> f430005d;

        public b(x xVar, Call.Factory factory, f fVar, InterfaceC47647c interfaceC47647c) {
            super(xVar, factory, fVar);
            this.f430005d = interfaceC47647c;
        }

        @Override // retrofit2.i
        public final Object c(InterfaceC47646b<ResponseT> interfaceC47646b, Object[] objArr) {
            InterfaceC47646b<ResponseT> interfaceC47646bAdapt = this.f430005d.adapt(interfaceC47646b);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
                rVar.r(new k(interfaceC47646bAdapt));
                interfaceC47646bAdapt.enqueue(new m(rVar));
                Object objO = rVar.o();
                if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objO;
            } catch (Exception e12) {
                return q.a(e12, continuation);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC47647c<ResponseT, InterfaceC47646b<ResponseT>> f430006d;

        public c(x xVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, InterfaceC47647c<ResponseT, InterfaceC47646b<ResponseT>> interfaceC47647c) {
            super(xVar, factory, fVar);
            this.f430006d = interfaceC47647c;
        }

        @Override // retrofit2.i
        public final Object c(InterfaceC47646b<ResponseT> interfaceC47646b, Object[] objArr) {
            InterfaceC47646b<ResponseT> interfaceC47646bAdapt = this.f430006d.adapt(interfaceC47646b);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
                rVar.r(new o(interfaceC47646bAdapt));
                interfaceC47646bAdapt.enqueue(new p(rVar));
                Object objO = rVar.o();
                if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objO;
            } catch (Exception e12) {
                return q.a(e12, continuation);
            }
        }
    }

    public i(x xVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar) {
        this.f430001a = xVar;
        this.f430002b = factory;
        this.f430003c = fVar;
    }

    @Override // retrofit2.A
    @I41.h
    public final ReturnT a(Object[] objArr) {
        return c(new OkHttpCall(this.f430001a, objArr, this.f430002b, this.f430003c), objArr);
    }

    @I41.h
    public abstract ReturnT c(InterfaceC47646b<ResponseT> interfaceC47646b, Object[] objArr);
}
