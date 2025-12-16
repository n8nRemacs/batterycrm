package com.avito.android.verification.inn.list.text;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.inn.list.Hidable;
import j.InterfaceC42150f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/list/text/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/verification/inn/list/Hidable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, Hidable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324097b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Boolean> f324098c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Hidable.Hidden f324099d;

    /* renamed from: e, reason: collision with root package name */
    public final int f324100e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f324101f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f324102g;

    /* renamed from: h, reason: collision with root package name */
    public final int f324103h;

    /* renamed from: i, reason: collision with root package name */
    public final int f324104i;

    /* renamed from: j, reason: collision with root package name */
    public final int f324105j;

    public a(@k String str, @k Map<String, Boolean> map, @k Hidable.Hidden hidden, @InterfaceC42150f int i12, @k AttributedText attributedText, @l String str2, @InterfaceC42150f int i13, int i14, int i15) {
        this.f324097b = str;
        this.f324098c = map;
        this.f324099d = hidden;
        this.f324100e = i12;
        this.f324101f = attributedText;
        this.f324102g = str2;
        this.f324103h = i13;
        this.f324104i = i14;
        this.f324105j = i15;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    public final com.avito.conveyor_item.a a(Hidable.Hidden hidden) {
        return new a(this.f324097b, this.f324098c, hidden, this.f324100e, this.f324101f, this.f324102g, this.f324103h, this.f324104i, this.f324105j);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    public final Map<String, Boolean> b() {
        return this.f324098c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324097b, aVar.f324097b) && L.f(this.f324098c, aVar.f324098c) && this.f324099d == aVar.f324099d && this.f324100e == aVar.f324100e && L.f(this.f324101f, aVar.f324101f) && L.f(this.f324102g, aVar.f324102g) && this.f324103h == aVar.f324103h && this.f324104i == aVar.f324104i && this.f324105j == aVar.f324105j;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    /* renamed from: f, reason: from getter */
    public final Hidable.Hidden getF324099d() {
        return this.f324099d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF271695b() {
        return getF271696c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF271696c() {
        return this.f324097b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(r.e(this.f324100e, (this.f324099d.hashCode() + AK.c.c(this.f324097b.hashCode() * 31, 31, this.f324098c)) * 31, 31), 31, this.f324101f);
        String str = this.f324102g;
        return Integer.hashCode(this.f324105j) + r.e(this.f324104i, r.e(this.f324103h, (iB2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextItem(stringId=");
        sb2.append(this.f324097b);
        sb2.append(", hiddenIf=");
        sb2.append(this.f324098c);
        sb2.append(", hidden=");
        sb2.append(this.f324099d);
        sb2.append(", textAppearanceAttrRes=");
        sb2.append(this.f324100e);
        sb2.append(", text=");
        sb2.append(this.f324101f);
        sb2.append(", value=");
        sb2.append(this.f324102g);
        sb2.append(", colorAttrRes=");
        sb2.append(this.f324103h);
        sb2.append(", marginTop=");
        sb2.append(this.f324104i);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f324105j, ')');
    }

    public /* synthetic */ a(String str, Map map, Hidable.Hidden hidden, int i12, AttributedText attributedText, String str2, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this(str, map, (i16 & 4) != 0 ? Hidable.Hidden.f323896b : hidden, i12, attributedText, str2, i13, (i16 & 128) != 0 ? 0 : i14, (i16 & 256) != 0 ? 0 : i15);
    }
}
