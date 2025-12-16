package Yh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LotViewItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYh0/d;", "", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f19614a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f19615b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C22602e f19616c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f19617d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f19618e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C22602e f19619f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f19620g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f19621h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19622i;

    public d(long j12, @l Image image, @k C22602e c22602e, @k String str, @k String str2, @l C22602e c22602e2, @k String str3, @k String str4, long j13) {
        this.f19614a = j12;
        this.f19615b = image;
        this.f19616c = c22602e;
        this.f19617d = str;
        this.f19618e = str2;
        this.f19619f = c22602e2;
        this.f19620g = str3;
        this.f19621h = str4;
        this.f19622i = j13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19614a == dVar.f19614a && L.f(this.f19615b, dVar.f19615b) && L.f(this.f19616c, dVar.f19616c) && L.f(this.f19617d, dVar.f19617d) && L.f(this.f19618e, dVar.f19618e) && L.f(this.f19619f, dVar.f19619f) && L.f(this.f19620g, dVar.f19620g) && L.f(this.f19621h, dVar.f19621h) && this.f19622i == dVar.f19622i;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f19614a) * 31;
        Image image = this.f19615b;
        int iD2 = H.d(H.d((this.f19616c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.f19617d), 31, this.f19618e);
        C22602e c22602e = this.f19619f;
        return Long.hashCode(this.f19622i) + H.d(H.d((iD2 + (c22602e != null ? c22602e.hashCode() : 0)) * 31, 31, this.f19620g), 31, this.f19621h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LotViewItem(id=");
        sb2.append(this.f19614a);
        sb2.append(", image=");
        sb2.append(this.f19615b);
        sb2.append(", title=");
        sb2.append((Object) this.f19616c);
        sb2.append(", price=");
        sb2.append(this.f19617d);
        sb2.append(", pricePerMeter=");
        sb2.append(this.f19618e);
        sb2.append(", agentCommission=");
        sb2.append((Object) this.f19619f);
        sb2.append(", additionalInfo=");
        sb2.append(this.f19620g);
        sb2.append(", building=");
        sb2.append(this.f19621h);
        sb2.append(", developmentId=");
        return r.u(sb2, this.f19622i, ')');
    }
}
