package com.avito.android.travel_guest_profile.items.empty_state_banner;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyStateBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/empty_state_banner/d;", "Lcom/avito/conveyor_item/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f302049b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f302050c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.arch.mvi.utils.c<AttributedText, PrintableText> f302051d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f302052e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f302053f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k String str, @l String str2, @k com.avito.android.arch.mvi.utils.c<AttributedText, ? extends PrintableText> cVar, @l AttributedText attributedText, @l a aVar) {
        this.f302049b = str;
        this.f302050c = str2;
        this.f302051d = cVar;
        this.f302052e = attributedText;
        this.f302053f = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f302049b, dVar.f302049b) && L.f(this.f302050c, dVar.f302050c) && L.f(this.f302051d, dVar.f302051d) && L.f(this.f302052e, dVar.f302052e) && L.f(this.f302053f, dVar.f302053f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF299239b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299239b() {
        return this.f302049b;
    }

    public final int hashCode() {
        int iHashCode = this.f302049b.hashCode() * 31;
        String str = this.f302050c;
        int iHashCode2 = (this.f302051d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        AttributedText attributedText = this.f302052e;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        a aVar = this.f302053f;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "EmptyStateBannerItem(stringId=" + this.f302049b + ", bannerType=" + this.f302050c + ", title=" + this.f302051d + ", subtitle=" + this.f302052e + ", button=" + this.f302053f + ')';
    }
}
