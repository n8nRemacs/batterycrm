package T21;

import com.yandex.metrica.billing_interface.e;
import j.N;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final e f15318a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final String f15319b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final String f15320c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15321d;

    /* renamed from: e, reason: collision with root package name */
    public long f15322e;

    public a(@N e eVar, @N String str, @N String str2, long j12, long j13) {
        this.f15318a = eVar;
        this.f15319b = str;
        this.f15320c = str2;
        this.f15321d = j12;
        this.f15322e = j13;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BillingInfo{type=");
        sb2.append(this.f15318a);
        sb2.append("sku='");
        sb2.append(this.f15319b);
        sb2.append("'purchaseToken='");
        sb2.append(this.f15320c);
        sb2.append("'purchaseTime=");
        sb2.append(this.f15321d);
        sb2.append("sendTime=");
        return AK.c.j(this.f15322e, "}", sb2);
    }
}
