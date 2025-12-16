package com.avito.android.verification.inn.list.disclosure;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.verification.inn.list.Hidable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DisclosureItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/list/disclosure/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/verification/inn/list/Hidable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, Hidable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323956b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Hidable.Hidden f323957c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Boolean> f323958d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323959e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f323960f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f323961g;

    /* renamed from: h, reason: collision with root package name */
    public final int f323962h;

    /* renamed from: i, reason: collision with root package name */
    public final int f323963i;

    public a(@k String str, @k Hidable.Hidden hidden, @k Map<String, Boolean> map, boolean z12, @k String str2, @k List<String> list, int i12, int i13) {
        this.f323956b = str;
        this.f323957c = hidden;
        this.f323958d = map;
        this.f323959e = z12;
        this.f323960f = str2;
        this.f323961g = list;
        this.f323962h = i12;
        this.f323963i = i13;
    }

    public static a L(a aVar, Hidable.Hidden hidden, int i12) {
        String str = aVar.f323956b;
        if ((i12 & 2) != 0) {
            hidden = aVar.f323957c;
        }
        Hidable.Hidden hidden2 = hidden;
        Map<String, Boolean> map = aVar.f323958d;
        boolean z12 = (i12 & 8) != 0 ? aVar.f323959e : true;
        String str2 = aVar.f323960f;
        List<String> list = aVar.f323961g;
        int i13 = aVar.f323962h;
        int i14 = aVar.f323963i;
        aVar.getClass();
        return new a(str, hidden2, map, z12, str2, list, i13, i14);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    public final com.avito.conveyor_item.a a(Hidable.Hidden hidden) {
        return L(this, hidden, 253);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    public final Map<String, Boolean> b() {
        return this.f323958d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f323956b, aVar.f323956b) && this.f323957c == aVar.f323957c && L.f(this.f323958d, aVar.f323958d) && this.f323959e == aVar.f323959e && L.f(this.f323960f, aVar.f323960f) && L.f(this.f323961g, aVar.f323961g) && this.f323962h == aVar.f323962h && this.f323963i == aVar.f323963i;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    /* renamed from: f, reason: from getter */
    public final Hidable.Hidden getF323957c() {
        return this.f323957c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return getF323956b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323956b() {
        return this.f323956b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f323963i) + r.e(this.f323962h, H.e(H.d(r.i(AK.c.c((this.f323957c.hashCode() + (this.f323956b.hashCode() * 31)) * 31, 31, this.f323958d), 31, this.f323959e), 31, this.f323960f), 31, this.f323961g), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclosureItem(stringId=");
        sb2.append(this.f323956b);
        sb2.append(", hidden=");
        sb2.append(this.f323957c);
        sb2.append(", hiddenIf=");
        sb2.append(this.f323958d);
        sb2.append(", isExpanded=");
        sb2.append(this.f323959e);
        sb2.append(", title=");
        sb2.append(this.f323960f);
        sb2.append(", hides=");
        sb2.append(this.f323961g);
        sb2.append(", marginTop=");
        sb2.append(this.f323962h);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f323963i, ')');
    }

    public /* synthetic */ a(String str, Hidable.Hidden hidden, Map map, boolean z12, String str2, List list, int i12, int i13, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? Hidable.Hidden.f323896b : hidden, map, (i14 & 8) != 0 ? false : z12, str2, list, (i14 & 64) != 0 ? 0 : i12, (i14 & 128) != 0 ? 0 : i13);
    }
}
