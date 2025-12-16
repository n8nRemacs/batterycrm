package com.avito.android.success.konveyor.charity;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessCharityBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/konveyor/charity/c;", "Lcom/avito/conveyor_item/a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f291623b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f291624c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f291625d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f291626e;

    public c(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage, @k DeepLink deepLink) {
        this.f291623b = attributedText;
        this.f291624c = attributedText2;
        this.f291625d = universalImage;
        this.f291626e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f291623b, cVar.f291623b) && L.f(this.f291624c, cVar.f291624c) && L.f(this.f291625d, cVar.f291625d) && L.f(this.f291626e, cVar.f291626e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return -1197147534;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF57589l() {
        return "success_charity_block_item_id";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(1543132110, 31, this.f291623b);
        AttributedText attributedText = this.f291624c;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f291625d;
        return this.f291626e.hashCode() + ((iHashCode + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessCharityBlockItem(stringId=success_charity_block_item_id, title=");
        sb2.append(this.f291623b);
        sb2.append(", subtitle=");
        sb2.append(this.f291624c);
        sb2.append(", image=");
        sb2.append(this.f291625d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f291626e, ')');
    }
}
