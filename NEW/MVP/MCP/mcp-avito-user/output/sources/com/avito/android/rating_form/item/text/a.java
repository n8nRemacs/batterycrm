package com.avito.android.rating_form.item.text;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/text/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f248679b;

    public a(@l AttributedText attributedText) {
        this.f248679b = attributedText;
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
        return this.f248679b.equals(aVar.f248679b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return 3556653;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF245886b() {
        return "text";
    }

    public final int hashCode() {
        return this.f248679b.hashCode() + 110256243;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("TextItem(stringId=text, attributedText="), this.f248679b, ')');
    }
}
