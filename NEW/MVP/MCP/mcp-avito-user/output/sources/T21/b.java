package T21;

import androidx.compose.foundation.H;
import com.yandex.metrica.billing_interface.e;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final e f15323a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final String f15324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15325c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15326d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final String f15327e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15328f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final com.yandex.metrica.billing_interface.c f15329g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15330h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final com.yandex.metrica.billing_interface.c f15331i;

    /* renamed from: j, reason: collision with root package name */
    @N
    public final String f15332j;

    /* renamed from: k, reason: collision with root package name */
    @N
    public final String f15333k;

    /* renamed from: l, reason: collision with root package name */
    public final long f15334l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15335m;

    /* renamed from: n, reason: collision with root package name */
    @N
    public final String f15336n;

    public b(@N e eVar, @N String str, int i12, long j12, @N String str2, long j13, @P com.yandex.metrica.billing_interface.c cVar, int i13, @P com.yandex.metrica.billing_interface.c cVar2, @N String str3, @N String str4, long j14, boolean z12, @N String str5) {
        this.f15323a = eVar;
        this.f15324b = str;
        this.f15325c = i12;
        this.f15326d = j12;
        this.f15327e = str2;
        this.f15328f = j13;
        this.f15329g = cVar;
        this.f15330h = i13;
        this.f15331i = cVar2;
        this.f15332j = str3;
        this.f15333k = str4;
        this.f15334l = j14;
        this.f15335m = z12;
        this.f15336n = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15325c != bVar.f15325c || this.f15326d != bVar.f15326d || this.f15328f != bVar.f15328f || this.f15330h != bVar.f15330h || this.f15334l != bVar.f15334l || this.f15335m != bVar.f15335m || this.f15323a != bVar.f15323a || !this.f15324b.equals(bVar.f15324b) || !this.f15327e.equals(bVar.f15327e)) {
            return false;
        }
        com.yandex.metrica.billing_interface.c cVar = bVar.f15329g;
        com.yandex.metrica.billing_interface.c cVar2 = this.f15329g;
        if (cVar2 == null ? cVar != null : !cVar2.equals(cVar)) {
            return false;
        }
        com.yandex.metrica.billing_interface.c cVar3 = bVar.f15331i;
        com.yandex.metrica.billing_interface.c cVar4 = this.f15331i;
        if (cVar4 == null ? cVar3 != null : !cVar4.equals(cVar3)) {
            return false;
        }
        if (this.f15332j.equals(bVar.f15332j) && this.f15333k.equals(bVar.f15333k)) {
            return this.f15336n.equals(bVar.f15336n);
        }
        return false;
    }

    public final int hashCode() {
        int iD2 = (H.d(this.f15323a.hashCode() * 31, 31, this.f15324b) + this.f15325c) * 31;
        long j12 = this.f15326d;
        int iD3 = H.d((iD2 + ((int) (j12 ^ (j12 >>> 32)))) * 31, 31, this.f15327e);
        long j13 = this.f15328f;
        int i12 = (iD3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        com.yandex.metrica.billing_interface.c cVar = this.f15329g;
        int iHashCode = (((i12 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f15330h) * 31;
        com.yandex.metrica.billing_interface.c cVar2 = this.f15331i;
        int iD4 = H.d(H.d((iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31, 31, this.f15332j), 31, this.f15333k);
        long j14 = this.f15334l;
        return this.f15336n.hashCode() + ((((iD4 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f15335m ? 1 : 0)) * 31);
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProductInfo{type=");
        sb2.append(this.f15323a);
        sb2.append(", sku='");
        sb2.append(this.f15324b);
        sb2.append("', quantity=");
        sb2.append(this.f15325c);
        sb2.append(", priceMicros=");
        sb2.append(this.f15326d);
        sb2.append(", priceCurrency='");
        sb2.append(this.f15327e);
        sb2.append("', introductoryPriceMicros=");
        sb2.append(this.f15328f);
        sb2.append(", introductoryPricePeriod=");
        sb2.append(this.f15329g);
        sb2.append(", introductoryPriceCycles=");
        sb2.append(this.f15330h);
        sb2.append(", subscriptionPeriod=");
        sb2.append(this.f15331i);
        sb2.append(", signature='");
        sb2.append(this.f15332j);
        sb2.append("', purchaseToken='");
        sb2.append(this.f15333k);
        sb2.append("', purchaseTime=");
        sb2.append(this.f15334l);
        sb2.append(", autoRenewing=");
        sb2.append(this.f15335m);
        sb2.append(", purchaseOriginalJson='");
        return AK.c.s(sb2, this.f15336n, "'}");
    }
}
