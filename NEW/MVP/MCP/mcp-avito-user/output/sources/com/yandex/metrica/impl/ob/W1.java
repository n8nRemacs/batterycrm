package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.ob.C39173uf;

/* loaded from: classes7.dex */
class W1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Revenue f379798a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC38813fn<String> f379799b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC38813fn<String> f379800c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC38813fn<String> f379801d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38737cm f379802e;

    public W1(@j.N Revenue revenue, @j.N C38737cm c38737cm) {
        this.f379802e = c38737cm;
        this.f379798a = revenue;
        this.f379799b = new C38738cn(30720, "revenue payload", c38737cm);
        this.f379800c = new C38788en(new C38738cn(184320, "receipt data", c38737cm), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f379801d = new C38788en(new C38763dn(1000, "receipt signature", c38737cm), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    @j.N
    public Pair<byte[], Integer> a() {
        C39173uf c39173uf = new C39173uf();
        c39173uf.f381938c = this.f379798a.currency.getCurrencyCode().getBytes();
        if (A2.a(this.f379798a.price)) {
            c39173uf.f381937b = this.f379798a.price.doubleValue();
        }
        if (A2.a(this.f379798a.priceMicros)) {
            c39173uf.f381942g = this.f379798a.priceMicros.longValue();
        }
        c39173uf.f381939d = C38689b.e(new C38763dn(200, "revenue productID", this.f379802e).a(this.f379798a.productID));
        Integer num = this.f379798a.quantity;
        if (num == null) {
            num = 1;
        }
        c39173uf.f381936a = num.intValue();
        c39173uf.f381940e = C38689b.e(this.f379799b.a(this.f379798a.payload));
        if (A2.a(this.f379798a.receipt)) {
            C39173uf.a aVar = new C39173uf.a();
            String strA = this.f379800c.a(this.f379798a.receipt.data);
            length = C38689b.b(this.f379798a.receipt.data, strA) ? this.f379798a.receipt.data.length() : 0;
            String strA2 = this.f379801d.a(this.f379798a.receipt.signature);
            aVar.f381948a = C38689b.e(strA);
            aVar.f381949b = C38689b.e(strA2);
            c39173uf.f381941f = aVar;
        }
        return new Pair<>(MessageNano.toByteArray(c39173uf), Integer.valueOf(length));
    }
}
