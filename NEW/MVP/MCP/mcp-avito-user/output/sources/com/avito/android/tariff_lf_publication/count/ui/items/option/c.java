package com.avito.android.tariff_lf_publication.count.ui.items.option;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationCountOptionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/ui/items/option/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f300858c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f300859d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f300860e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f300861f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final LD0.a f300862g;

    public c(@k String str, long j12, @k String str2, boolean z12, @l AttributedText attributedText, @l LD0.a aVar) {
        this.f300857b = str;
        this.f300858c = j12;
        this.f300859d = str2;
        this.f300860e = z12;
        this.f300861f = attributedText;
        this.f300862g = aVar;
    }

    public static c a(c cVar, boolean z12, AttributedText attributedText, LD0.a aVar, int i12) {
        String str = cVar.f300857b;
        long j12 = cVar.f300858c;
        String str2 = cVar.f300859d;
        if ((i12 & 8) != 0) {
            z12 = cVar.f300860e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            attributedText = cVar.f300861f;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 32) != 0) {
            aVar = cVar.f300862g;
        }
        cVar.getClass();
        return new c(str, j12, str2, z13, attributedText2, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f300857b, cVar.f300857b) && this.f300858c == cVar.f300858c && L.f(this.f300859d, cVar.f300859d) && this.f300860e == cVar.f300860e && L.f(this.f300861f, cVar.f300861f) && L.f(this.f300862g, cVar.f300862g);
    }

    @Override // TV0.a
    public final long getId() {
        return getF295013b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF295013b() {
        return this.f300857b;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(r.g(this.f300857b.hashCode() * 31, 31, this.f300858c), 31, this.f300859d), 31, this.f300860e);
        AttributedText attributedText = this.f300861f;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        LD0.a aVar = this.f300862g;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TariffLfPublicationCountOptionItem(stringId=" + this.f300857b + ", countId=" + this.f300858c + ", title=" + this.f300859d + ", isChecked=" + this.f300860e + ", description=" + this.f300861f + ", priceInfo=" + this.f300862g + ')';
    }
}
