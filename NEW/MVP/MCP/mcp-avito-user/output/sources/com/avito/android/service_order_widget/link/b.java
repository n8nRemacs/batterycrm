package com.avito.android.service_order_widget.link;

import Cu0.InterfaceC13353a;
import bv.C25719a;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_order_widget.link.o;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_widget/link/b;", "Lcom/avito/android/service_order_widget/link/j;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f278948b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A f278949c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final F0 f278950d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f278951e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C25719a f278952f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_widget.domain.a f278953g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f278954h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f278955i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f278956j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13353a f278957k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final B2 f278958l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f278959m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public N0 f278960n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C43238h f278961o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public AbstractC40161a<?> f278962p;

    /* compiled from: SendServiceOrderRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_order_widget/link/b$a;", "", "a", "b", "Lcom/avito/android/service_order_widget/link/b$a$a;", "Lcom/avito/android/service_order_widget/link/b$a$b;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: SendServiceOrderRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/link/b$a$a;", "Lcom/avito/android/service_order_widget/link/b$a;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_order_widget.link.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8295a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f278963a;

            public C8295a() {
                this(null, 1, null);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8295a) && L.f(this.f278963a, ((C8295a) obj).f278963a);
            }

            public final int hashCode() {
                Throwable th2 = this.f278963a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f278963a, ')');
            }

            public C8295a(Throwable th2, int i12, C42822w c42822w) {
                this.f278963a = (i12 & 1) != 0 ? null : th2;
            }
        }

        /* compiled from: SendServiceOrderRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/b$a$b;", "Lcom/avito/android/service_order_widget/link/b$a;", "<init>", "()V", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_order_widget.link.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C8296b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C8296b f278964a = new C8296b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C8296b);
            }

            public final int hashCode() {
                return -1670900076;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }
    }

    public b(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k A a12, @Y61.k F0 f02, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k C25719a c25719a, @Y61.k com.avito.android.service_order_widget.domain.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k a.i iVar, @Y61.k InterfaceC13353a interfaceC13353a, @Y61.k B2 b22, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f278948b = interfaceC47842z;
        this.f278949c = a12;
        this.f278950d = f02;
        this.f278951e = interfaceC35863o4;
        this.f278952f = c25719a;
        this.f278953g = aVar;
        this.f278954h = r02;
        this.f278955i = aVar2;
        this.f278956j = iVar;
        this.f278957k = interfaceC13353a;
        this.f278958l = b22;
        this.f278959m = interfaceC28373a;
        this.f278961o = U.a(r02.a());
    }

    public static final void a(b bVar, ApiError apiError, String str) {
        bVar.getClass();
        a.i.C4057a.d(bVar.f278956j, ((apiError instanceof ApiError.UnknownError) || C43066x.K(apiError.getF244063c())) ? com.avito.android.printable_text.a.a(R.string.unknown_service_order_error) : com.avito.android.printable_text.a.b(R.string.unknown_service_order_error, apiError.getF244063c()), null, null, new f.c(apiError), 0, null, null, null, 2030);
        AbstractC40161a<?> abstractC40161a = bVar.f278962p;
        if (abstractC40161a != null) {
            abstractC40161a.j(new o.a(str, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.service_order_widget.link.b r12, java.lang.String r13, java.util.List r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.avito.android.service_order_widget.link.g
            if (r0 == 0) goto L16
            r0 = r15
            com.avito.android.service_order_widget.link.g r0 = (com.avito.android.service_order_widget.link.g) r0
            int r1 = r0.f278986s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f278986s = r1
            goto L1b
        L16:
            com.avito.android.service_order_widget.link.g r0 = new com.avito.android.service_order_widget.link.g
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f278984q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f278986s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> La1
            goto La1
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.C42729a0.b(r15)
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L41
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto La3
        L41:
            com.avito.android.util.o4 r15 = r12.f278951e
            java.lang.String r2 = r15.a()
            int r2 = r2.hashCode()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r14, r5)
            r4.<init>(r5)
            java.util.Iterator r14 = r14.iterator()
        L5c:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r14.next()
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r8 = r15.a()
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            ru.avito.messenger.z r6 = r12.f278948b
            r10 = 0
            r7 = r13
            io.reactivex.rxjava3.core.I r5 = r6.sendImageMessage(r7, r8, r9, r10, r11)
            r4.add(r5)
            goto L5c
        L7d:
            int r12 = io.reactivex.rxjava3.core.AbstractC41777j.f401972b     // Catch: java.lang.Throwable -> La1
            io.reactivex.rxjava3.internal.operators.flowable.o0 r12 = new io.reactivex.rxjava3.internal.operators.flowable.o0     // Catch: java.lang.Throwable -> La1
            r12.<init>(r4)     // Catch: java.lang.Throwable -> La1
            l41.o<java.lang.Object, java.lang.Object> r13 = io.reactivex.rxjava3.internal.functions.a.f401991a     // Catch: java.lang.Throwable -> La1
            java.lang.String r14 = "mapper is null"
            java.util.Objects.requireNonNull(r13, r14)     // Catch: java.lang.Throwable -> La1
            java.lang.String r14 = "prefetch"
            r15 = 2
            io.reactivex.rxjava3.internal.functions.b.a(r15, r14)     // Catch: java.lang.Throwable -> La1
            io.reactivex.rxjava3.internal.operators.mixed.h r14 = new io.reactivex.rxjava3.internal.operators.mixed.h     // Catch: java.lang.Throwable -> La1
            io.reactivex.rxjava3.internal.util.ErrorMode r15 = io.reactivex.rxjava3.internal.util.ErrorMode.f404820c     // Catch: java.lang.Throwable -> La1
            r14.<init>(r12, r13, r15)     // Catch: java.lang.Throwable -> La1
            r0.f278986s = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r12 = kotlinx.coroutines.reactive.e.a(r14, r0)     // Catch: java.lang.Throwable -> La1
            if (r12 != r1) goto La1
            goto La3
        La1:
            kotlin.G0 r1 = kotlin.G0.f406611a
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_widget.link.b.b(com.avito.android.service_order_widget.link.b, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(@Y61.k com.avito.android.service_order_widget.link.a aVar) {
        N0 n02 = this.f278960n;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f278960n = C43259k.d(U.f(this.f278961o, new d(N.f410714t2, this, aVar.getItemId())), null, null, new f(this, aVar, null), 3);
    }
}
