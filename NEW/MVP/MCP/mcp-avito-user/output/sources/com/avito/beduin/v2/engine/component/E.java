package com.avito.beduin.v2.engine.component;

import XT0.a;
import com.avito.beduin.v2.engine.core.C36264n;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.exception.ExceptionTagWrapper;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Reader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E {

    /* compiled from: Reader.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lcom/avito/beduin/v2/engine/component/c;", "invoke", "(Ljava/lang/Exception;)Lcom/avito/beduin/v2/engine/component/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Exception, InterfaceC36243c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.core.z f336557l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f336558m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.core.u<InterfaceC36243c> f336559n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.beduin.v2.engine.core.z zVar, String str, com.avito.beduin.v2.engine.core.u<InterfaceC36243c> uVar) {
            super(1);
            this.f336557l = zVar;
            this.f336558m = str;
            this.f336559n = uVar;
        }

        @Override // Y41.l
        public final InterfaceC36243c invoke(Exception exc) {
            Exception exc2;
            Exception exc3 = exc;
            boolean z12 = exc3 instanceof ExceptionTagWrapper;
            ExceptionTagWrapper exceptionTagWrapper = z12 ? (ExceptionTagWrapper) exc3 : null;
            String str = exceptionTagWrapper != null ? exceptionTagWrapper.f336731b : null;
            ExceptionTagWrapper exceptionTagWrapper2 = z12 ? (ExceptionTagWrapper) exc3 : null;
            com.avito.beduin.v2.engine.field.entity.c cVarA = k.a(this.f336557l, this.f336558m, (exceptionTagWrapper2 == null || (exc2 = exceptionTagWrapper2.f336732c) == null) ? exc3 : exc2, null, str, 32);
            com.avito.beduin.v2.engine.core.z zVar = this.f336557l;
            com.avito.beduin.v2.engine.core.z zVarI = zVar.getF336594a().i();
            com.avito.beduin.v2.engine.field.m.f336868b.getClass();
            InterfaceC36243c interfaceC36243c = (InterfaceC36243c) cVarA.o(zVarI, com.avito.beduin.v2.engine.field.m.f336869c);
            zVar.getF336594a().G(new dU0.f(a.C1333a.f18889b.f393887a, new XT0.a(new D(this.f336559n, interfaceC36243c)), null, 4, null));
            return interfaceC36243c;
        }
    }

    @Y61.k
    public static final Q<K<Object>, String> a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.l Object obj, @Y61.k String str, @Y61.k Y41.p<? super com.avito.beduin.v2.engine.core.z, ? super Y41.l<? super Exception, ? extends Object>, ? extends K<? extends Object>> pVar) {
        com.avito.beduin.v2.engine.core.u uVarF = zVar.d(zVar.getF336594a(), "@error", obj) ? (com.avito.beduin.v2.engine.core.u) zVar.C("@error") : zVar.f(zVar.t(zVar.getF336594a(), "@error"), obj, null);
        InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336594a(), "@onFailure", uVarF);
        zVar.w(interfaceC36252bE);
        if (!interfaceC36252bE.getF336701b()) {
            try {
                interfaceC36252bE.l(new a(interfaceC36252bE.g(), str, uVarF));
            } catch (Throwable th2) {
                interfaceC36252bE.l(null);
                throw th2;
            }
        }
        K<? extends Object> kInvoke = pVar.invoke(zVar, (Y41.l) interfaceC36252bE.getF336702c());
        InterfaceC36243c interfaceC36243c = (InterfaceC36243c) uVarF.k(zVar);
        if (interfaceC36243c == null || !kInvoke.getF336683f()) {
            uVarF.set(null);
            return new Q<>(kInvoke, str);
        }
        zVar.w(kInvoke);
        return new Q<>(new C36264n(com.avito.beduin.v2.engine.field.e.f336775a, interfaceC36243c), "StateException");
    }

    public static final <T> T b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k Y41.l<? super G, ? extends T> lVar) {
        return lVar.invoke(new w(zVar, mVar));
    }
}
