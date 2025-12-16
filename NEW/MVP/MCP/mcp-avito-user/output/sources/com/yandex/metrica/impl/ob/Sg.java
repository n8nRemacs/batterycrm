package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.impl.ob.C38730cf;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes7.dex */
public final class Sg {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC38813fn<String> f379382a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC38813fn<String> f379383b;

    /* renamed from: c, reason: collision with root package name */
    private final AdRevenue f379384c;

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38730cf c38730cf) {
            super(1);
            this.f379385a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379385a.f380333e = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379386a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38730cf c38730cf) {
            super(1);
            this.f379386a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379386a.f380336h = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379387a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38730cf c38730cf) {
            super(1);
            this.f379387a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379387a.f380337i = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public static final class d extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38730cf c38730cf) {
            super(1);
            this.f379388a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379388a.f380334f = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public static final class e extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38730cf c38730cf) {
            super(1);
            this.f379389a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379389a.f380335g = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public static final class f extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38730cf c38730cf) {
            super(1);
            this.f379390a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379390a.f380338j = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public static final class g extends kotlin.jvm.internal.N implements Y41.l<byte[], kotlin.G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38730cf f379391a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C38730cf c38730cf) {
            super(1);
            this.f379391a = c38730cf;
        }

        @Override // Y41.l
        public kotlin.G0 invoke(byte[] bArr) {
            this.f379391a.f380331c = bArr;
            return kotlin.G0.f406611a;
        }
    }

    public Sg(@Y61.k AdRevenue adRevenue, @Y61.k C38737cm c38737cm) {
        this.f379384c = adRevenue;
        this.f379382a = new C38763dn(100, "ad revenue strings", c38737cm);
        this.f379383b = new C38738cn(30720, "ad revenue payload", c38737cm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final kotlin.Q<byte[], Integer> a() {
        C38730cf c38730cf = new C38730cf();
        int length = 0;
        for (kotlin.Q q12 : C42745f0.U(new kotlin.Q(this.f379384c.adNetwork, new a(c38730cf)), new kotlin.Q(this.f379384c.adPlacementId, new b(c38730cf)), new kotlin.Q(this.f379384c.adPlacementName, new c(c38730cf)), new kotlin.Q(this.f379384c.adUnitId, new d(c38730cf)), new kotlin.Q(this.f379384c.adUnitName, new e(c38730cf)), new kotlin.Q(this.f379384c.precision, new f(c38730cf)), new kotlin.Q(this.f379384c.currency.getCurrencyCode(), new g(c38730cf)))) {
            String str = (String) q12.f406619b;
            Y41.l lVar = (Y41.l) q12.f406620c;
            String strA = this.f379382a.a(str);
            byte[] bArrE = C38689b.e(str);
            byte[] bArrE2 = C38689b.e(strA);
            lVar.invoke(bArrE2);
            length += bArrE.length - bArrE2.length;
        }
        Integer num = (Integer) Tg.f379528a.get(this.f379384c.adType);
        c38730cf.f380332d = num != null ? num.intValue() : 0;
        C38730cf.a aVar = new C38730cf.a();
        kotlin.Q qA2 = Ol.a(this.f379384c.adRevenue);
        Nl nl2 = new Nl(((Number) qA2.f406619b).longValue(), ((Number) qA2.f406620c).intValue());
        aVar.f380340a = nl2.b();
        aVar.f380341b = nl2.a();
        c38730cf.f380330b = aVar;
        Map<String, String> map = this.f379384c.payload;
        if (map != null) {
            String strG = Tl.g(map);
            byte[] bArrE3 = C38689b.e(this.f379383b.a(strG));
            c38730cf.f380339k = bArrE3;
            length += C38689b.e(strG).length - bArrE3.length;
        }
        return new kotlin.Q<>(MessageNano.toByteArray(c38730cf), Integer.valueOf(length));
    }
}
