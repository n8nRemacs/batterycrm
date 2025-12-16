package com.avito.android.rating_form.item.promo_block;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/promo_block/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f248569b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f248570c;

    public a(@l AttributedText attributedText, @l String str) {
        this.f248569b = attributedText;
        this.f248570c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f248569b.equals(aVar.f248569b) && L.f(this.f248570c, aVar.f248570c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return 148285789;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF245163b() {
        return "promo_block";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(301892163, 31, this.f248569b);
        String str = this.f248570c;
        return iB2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBlockItem(stringId=promo_block, attributedText=");
        sb2.append(this.f248569b);
        sb2.append(", iconName=");
        return C22026a.c(sb2, this.f248570c, ')');
    }
}
