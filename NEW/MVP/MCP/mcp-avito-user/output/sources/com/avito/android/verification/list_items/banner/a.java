package com.avito.android.verification.list_items.banner;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324780b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f324781c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f324782d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f324783e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f324784f;

    /* renamed from: g, reason: collision with root package name */
    public final int f324785g;

    /* renamed from: h, reason: collision with root package name */
    public final int f324786h;

    public a(@k String str, @l String str2, @l AttributedText attributedText, @k String str3, @l String str4, int i12, int i13) {
        this.f324780b = str;
        this.f324781c = str2;
        this.f324782d = attributedText;
        this.f324783e = str3;
        this.f324784f = str4;
        this.f324785g = i12;
        this.f324786h = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f324780b, aVar.f324780b) && L.f(this.f324781c, aVar.f324781c) && L.f(this.f324782d, aVar.f324782d) && L.f(this.f324783e, aVar.f324783e) && L.f(this.f324784f, aVar.f324784f) && this.f324785g == aVar.f324785g && this.f324786h == aVar.f324786h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        return getF279229b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279229b() {
        return this.f324780b;
    }

    public final int hashCode() {
        int iHashCode = this.f324780b.hashCode() * 31;
        String str = this.f324781c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f324782d;
        int iD2 = H.d((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f324783e);
        String str2 = this.f324784f;
        return Integer.hashCode(this.f324786h) + r.e(this.f324785g, (iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerItem(stringId=");
        sb2.append(this.f324780b);
        sb2.append(", title=");
        sb2.append(this.f324781c);
        sb2.append(", body=");
        sb2.append(this.f324782d);
        sb2.append(", style=");
        sb2.append(this.f324783e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f324784f);
        sb2.append(", marginTop=");
        sb2.append(this.f324785g);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f324786h, ')');
    }

    public /* synthetic */ a(String str, String str2, AttributedText attributedText, String str3, String str4, int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, attributedText, str3, str4, (i14 & 32) != 0 ? 0 : i12, (i14 & 64) != 0 ? 0 : i13);
    }
}
