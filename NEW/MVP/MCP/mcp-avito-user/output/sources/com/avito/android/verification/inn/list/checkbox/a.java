package com.avito.android.verification.inn.list.checkbox;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.inn.list.Hidable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckboxItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/checkbox/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/verification/inn/list/Hidable;", "LGM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, Hidable, GM0.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323933b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Hidable.Hidden f323934c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Boolean> f323935d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f323936e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AttributedText f323937f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f323938g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323939h;

    /* renamed from: i, reason: collision with root package name */
    public final int f323940i;

    /* renamed from: j, reason: collision with root package name */
    public final int f323941j;

    public a(@k String str, @k Hidable.Hidden hidden, @k Map<String, Boolean> map, boolean z12, @l AttributedText attributedText, @k String str2, boolean z13, int i12, int i13) {
        this.f323933b = str;
        this.f323934c = hidden;
        this.f323935d = map;
        this.f323936e = z12;
        this.f323937f = attributedText;
        this.f323938g = str2;
        this.f323939h = z13;
        this.f323940i = i12;
        this.f323941j = i13;
    }

    public static a L(a aVar, Hidable.Hidden hidden, AttributedText attributedText, int i12) {
        String str = aVar.f323933b;
        if ((i12 & 2) != 0) {
            hidden = aVar.f323934c;
        }
        Hidable.Hidden hidden2 = hidden;
        Map<String, Boolean> map = aVar.f323935d;
        boolean z12 = aVar.f323936e;
        if ((i12 & 16) != 0) {
            attributedText = aVar.f323937f;
        }
        String str2 = aVar.f323938g;
        boolean z13 = aVar.f323939h;
        int i13 = aVar.f323940i;
        int i14 = aVar.f323941j;
        aVar.getClass();
        return new a(str, hidden2, map, z12, attributedText, str2, z13, i13, i14);
    }

    @Override // GM0.a
    public final com.avito.conveyor_item.a S0(AttributedText attributedText) {
        return L(this, null, attributedText, 495);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    public final com.avito.conveyor_item.a a(Hidable.Hidden hidden) {
        return L(this, hidden, null, 509);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    public final Map<String, Boolean> b() {
        return this.f323935d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f323933b, aVar.f323933b) && this.f323934c == aVar.f323934c && L.f(this.f323935d, aVar.f323935d) && this.f323936e == aVar.f323936e && L.f(this.f323937f, aVar.f323937f) && L.f(this.f323938g, aVar.f323938g) && this.f323939h == aVar.f323939h && this.f323940i == aVar.f323940i && this.f323941j == aVar.f323941j;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @k
    /* renamed from: f, reason: from getter */
    public final Hidable.Hidden getF323934c() {
        return this.f323934c;
    }

    @Override // GM0.a
    @l
    /* renamed from: getError, reason: from getter */
    public final AttributedText getF323937f() {
        return this.f323937f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return getF322911b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF322911b() {
        return this.f323933b;
    }

    public final int hashCode() {
        int i12 = r.i(AK.c.c((this.f323934c.hashCode() + (this.f323933b.hashCode() * 31)) * 31, 31, this.f323935d), 31, this.f323936e);
        AttributedText attributedText = this.f323937f;
        return Integer.hashCode(this.f323941j) + r.e(this.f323940i, r.i(H.d((i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f323938g), 31, this.f323939h), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxItem(stringId=");
        sb2.append(this.f323933b);
        sb2.append(", hidden=");
        sb2.append(this.f323934c);
        sb2.append(", hiddenIf=");
        sb2.append(this.f323935d);
        sb2.append(", isDisabled=");
        sb2.append(this.f323936e);
        sb2.append(", error=");
        sb2.append(this.f323937f);
        sb2.append(", title=");
        sb2.append(this.f323938g);
        sb2.append(", isChecked=");
        sb2.append(this.f323939h);
        sb2.append(", marginTop=");
        sb2.append(this.f323940i);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f323941j, ')');
    }

    public /* synthetic */ a(String str, Hidable.Hidden hidden, Map map, boolean z12, AttributedText attributedText, String str2, boolean z13, int i12, int i13, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? Hidable.Hidden.f323896b : hidden, map, z12, attributedText, str2, z13, (i14 & 128) != 0 ? 0 : i12, (i14 & 256) != 0 ? 0 : i13);
    }
}
