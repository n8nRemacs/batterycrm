package vp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import tp.InterfaceC48699a;

/* compiled from: DigitalRegistrationItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lvp/a;", "Ltp/a;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49363a implements InterfaceC48699a, b.InterfaceC10495b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440966b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f440967c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f440968d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f440969e;

    public C49363a(@k String str, @k String str2, boolean z12, boolean z13) {
        this.f440966b = str;
        this.f440967c = z12;
        this.f440968d = str2;
        this.f440969e = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49363a)) {
            return false;
        }
        C49363a c49363a = (C49363a) obj;
        return L.f(this.f440966b, c49363a.f440966b) && this.f440967c == c49363a.f440967c && L.f(this.f440968d, c49363a.f440968d) && this.f440969e == c49363a.f440969e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289965c() {
        return this.f440966b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF83932t() {
        return this.f440966b.hashCode();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f440969e) + H.d(r.i(this.f440966b.hashCode() * 31, 31, this.f440967c), 31, this.f440968d);
    }

    @Override // tp.InterfaceC48699a
    /* renamed from: isVisible, reason: from getter */
    public final boolean getF440969e() {
        return this.f440969e;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DigitalRegistrationItem(stringId=");
        sb2.append(this.f440966b);
        sb2.append(", isBig=");
        sb2.append(this.f440967c);
        sb2.append(", requestId=");
        sb2.append(this.f440968d);
        sb2.append(", isVisible=");
        return r.x(sb2, this.f440969e, ')');
    }
}
