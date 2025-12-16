package com.avito.android.verification.inn.list.inn_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.verification.inn.list.Hidable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InnInfoItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/list/inn_info/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/verification/inn/list/Hidable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, Hidable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Hidable.Hidden f324013c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Boolean> f324014d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f324015e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f324016f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f324017g;

    /* renamed from: h, reason: collision with root package name */
    public final int f324018h;

    /* renamed from: i, reason: collision with root package name */
    public final int f324019i;

    public a(@k String str, @k Hidable.Hidden hidden, @k Map<String, Boolean> map, @k String str2, @k String str3, boolean z12, int i12, int i13) {
        this.f324012b = str;
        this.f324013c = hidden;
        this.f324014d = map;
        this.f324015e = str2;
        this.f324016f = str3;
        this.f324017g = z12;
        this.f324018h = i12;
        this.f324019i = i13;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    public final com.avito.conveyor_item.a a(Hidable.Hidden hidden) {
        return new a(this.f324012b, hidden, this.f324014d, this.f324015e, this.f324016f, this.f324017g, this.f324018h, this.f324019i);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    public final Map<String, Boolean> b() {
        return this.f324014d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324012b, aVar.f324012b) && this.f324013c == aVar.f324013c && L.f(this.f324014d, aVar.f324014d) && L.f(this.f324015e, aVar.f324015e) && L.f(this.f324016f, aVar.f324016f) && this.f324017g == aVar.f324017g && this.f324018h == aVar.f324018h && this.f324019i == aVar.f324019i;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    /* renamed from: f, reason: from getter */
    public final Hidable.Hidden getF323957c() {
        return this.f324013c;
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
        return this.f324012b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f324019i) + r.e(this.f324018h, r.i(H.d(H.d(AK.c.c((this.f324013c.hashCode() + (this.f324012b.hashCode() * 31)) * 31, 31, this.f324014d), 31, this.f324015e), 31, this.f324016f), 31, this.f324017g), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InnInfoItem(stringId=");
        sb2.append(this.f324012b);
        sb2.append(", hidden=");
        sb2.append(this.f324013c);
        sb2.append(", hiddenIf=");
        sb2.append(this.f324014d);
        sb2.append(", title=");
        sb2.append(this.f324015e);
        sb2.append(", value=");
        sb2.append(this.f324016f);
        sb2.append(", iconVisible=");
        sb2.append(this.f324017g);
        sb2.append(", marginTop=");
        sb2.append(this.f324018h);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f324019i, ')');
    }

    public /* synthetic */ a(String str, Hidable.Hidden hidden, Map map, String str2, String str3, boolean z12, int i12, int i13, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? Hidable.Hidden.f323896b : hidden, map, str2, str3, z12, (i14 & 64) != 0 ? 0 : i12, (i14 & 128) != 0 ? 0 : i13);
    }
}
