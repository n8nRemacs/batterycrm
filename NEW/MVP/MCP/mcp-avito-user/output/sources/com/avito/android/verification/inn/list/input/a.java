package com.avito.android.verification.inn.list.input;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.inn.list.Hidable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/input/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/verification/inn/list/Hidable;", "LGM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, Hidable, GM0.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324032b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Hidable.Hidden f324033c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Boolean> f324034d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f324035e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f324036f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public String f324037g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f324038h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public AttributedText f324039i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<com.avito.android.verification.inn.validation.a> f324040j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f324041k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final FormatterType f324042l;

    /* renamed from: m, reason: collision with root package name */
    public final int f324043m;

    /* renamed from: n, reason: collision with root package name */
    public final int f324044n;

    public a(@k String str, @k Hidable.Hidden hidden, @k Map<String, Boolean> map, boolean z12, @k String str2, @k String str3, @k String str4, @l AttributedText attributedText, @k List<com.avito.android.verification.inn.validation.a> list, boolean z13, @k FormatterType formatterType, int i12, int i13) {
        this.f324032b = str;
        this.f324033c = hidden;
        this.f324034d = map;
        this.f324035e = z12;
        this.f324036f = str2;
        this.f324037g = str3;
        this.f324038h = str4;
        this.f324039i = attributedText;
        this.f324040j = list;
        this.f324041k = z13;
        this.f324042l = formatterType;
        this.f324043m = i12;
        this.f324044n = i13;
    }

    public static a L(a aVar, Hidable.Hidden hidden, AttributedText attributedText, int i12) {
        String str = aVar.f324032b;
        Hidable.Hidden hidden2 = (i12 & 2) != 0 ? aVar.f324033c : hidden;
        Map<String, Boolean> map = aVar.f324034d;
        boolean z12 = aVar.f324035e;
        String str2 = aVar.f324036f;
        String str3 = aVar.f324037g;
        String str4 = aVar.f324038h;
        AttributedText attributedText2 = (i12 & 128) != 0 ? aVar.f324039i : attributedText;
        List<com.avito.android.verification.inn.validation.a> list = aVar.f324040j;
        boolean z13 = aVar.f324041k;
        FormatterType formatterType = aVar.f324042l;
        int i13 = aVar.f324043m;
        int i14 = aVar.f324044n;
        aVar.getClass();
        return new a(str, hidden2, map, z12, str2, str3, str4, attributedText2, list, z13, formatterType, i13, i14);
    }

    @Override // GM0.a
    public final com.avito.conveyor_item.a S0(AttributedText attributedText) {
        return L(this, null, attributedText, 8063);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    public final com.avito.conveyor_item.a a(Hidable.Hidden hidden) {
        return L(this, hidden, null, 8189);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    public final Map<String, Boolean> b() {
        return this.f324034d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324032b, aVar.f324032b) && this.f324033c == aVar.f324033c && L.f(this.f324034d, aVar.f324034d) && this.f324035e == aVar.f324035e && L.f(this.f324036f, aVar.f324036f) && L.f(this.f324037g, aVar.f324037g) && L.f(this.f324038h, aVar.f324038h) && L.f(this.f324039i, aVar.f324039i) && L.f(this.f324040j, aVar.f324040j) && this.f324041k == aVar.f324041k && L.f(this.f324042l, aVar.f324042l) && this.f324043m == aVar.f324043m && this.f324044n == aVar.f324044n;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    /* renamed from: f, reason: from getter */
    public final Hidable.Hidden getF324099d() {
        return this.f324033c;
    }

    @Override // GM0.a
    @l
    /* renamed from: getError, reason: from getter */
    public final AttributedText getF324039i() {
        return this.f324039i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return getF83628f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83628f() {
        return this.f324032b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(r.i(AK.c.c((this.f324033c.hashCode() + (this.f324032b.hashCode() * 31)) * 31, 31, this.f324034d), 31, this.f324035e), 31, this.f324036f), 31, this.f324037g), 31, this.f324038h);
        AttributedText attributedText = this.f324039i;
        return Integer.hashCode(this.f324044n) + r.e(this.f324043m, (this.f324042l.hashCode() + r.i(H.e((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f324040j), 31, this.f324041k)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputItem(stringId=");
        sb2.append(this.f324032b);
        sb2.append(", hidden=");
        sb2.append(this.f324033c);
        sb2.append(", hiddenIf=");
        sb2.append(this.f324034d);
        sb2.append(", multiline=");
        sb2.append(this.f324035e);
        sb2.append(", title=");
        sb2.append(this.f324036f);
        sb2.append(", value=");
        sb2.append(this.f324037g);
        sb2.append(", hint=");
        sb2.append(this.f324038h);
        sb2.append(", error=");
        sb2.append(this.f324039i);
        sb2.append(", validations=");
        sb2.append(this.f324040j);
        sb2.append(", isEnabled=");
        sb2.append(this.f324041k);
        sb2.append(", formatterType=");
        sb2.append(this.f324042l);
        sb2.append(", marginTop=");
        sb2.append(this.f324043m);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f324044n, ')');
    }

    public /* synthetic */ a(String str, Hidable.Hidden hidden, Map map, boolean z12, String str2, String str3, String str4, AttributedText attributedText, List list, boolean z13, FormatterType formatterType, int i12, int i13, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? Hidable.Hidden.f323896b : hidden, map, z12, str2, str3, str4, attributedText, list, z13, formatterType, (i14 & 2048) != 0 ? 0 : i12, (i14 & 4096) != 0 ? 0 : i13);
    }
}
