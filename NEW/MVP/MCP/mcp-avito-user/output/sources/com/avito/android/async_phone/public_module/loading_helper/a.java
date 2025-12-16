package com.avito.android.async_phone.public_module.loading_helper;

import Fc1.E0;
import Y41.l;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: AsyncPhoneRequestLoadingHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/async_phone/public_module/loading_helper/a;", "", "a", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f92237c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f92238a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f92239b;

    /* compiled from: AsyncPhoneRequestLoadingHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/async_phone/public_module/loading_helper/a$a;", "", "<init>", "()V", "", "LOADING_STATE_DELAY", "J", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.async_phone.public_module.loading_helper.a$a, reason: collision with other inner class name */
    public static final class C2724a {
        public /* synthetic */ C2724a(C42822w c42822w) {
            this();
        }

        public C2724a() {
        }
    }

    static {
        new C2724a(null);
    }

    public a(@k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar) {
        this.f92238a = interfaceC35745a5;
        this.f92239b = fVar;
    }

    @k
    public final y a(@k T0 t02, @k l lVar, @k l lVar2, @Y61.l l lVar3, @k l lVar4, @k Y41.a aVar) {
        C41998x0 c41998x0C0 = z.c0(P2.c.f318721a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f92238a;
        I0 i0J0 = new C41934a1(z.g0(c41998x0C0.z(250L, timeUnit, interfaceC35745a5.c()).A0(t02), t02).l0(new c(this)), new f(this, lVar4, lVar)).j0(interfaceC35745a5.e());
        g gVar = new g(lVar);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return (y) i0J0.J(interfaceC43543a, gVar).J(new GL.a(aVar, lVar), io.reactivex.rxjava3.internal.functions.a.f401994d).F(new E0(lVar)).v0(new h(lVar, lVar2, lVar3), new i(lVar), interfaceC43543a);
    }
}
