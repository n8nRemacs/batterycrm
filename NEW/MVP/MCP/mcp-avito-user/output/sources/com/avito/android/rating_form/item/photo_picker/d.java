package com.avito.android.rating_form.item.photo_picker;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormPhotoPickerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/d;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f248508b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f248509c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f248510d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f248511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f248512f;

    public d(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, int i12) {
        this.f248508b = j12;
        this.f248509c = str;
        this.f248510d = str2;
        this.f248511e = attributedText;
        this.f248512f = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f248508b == dVar.f248508b && L.f(this.f248509c, dVar.f248509c) && L.f(this.f248510d, dVar.f248510d) && L.f(this.f248511e, dVar.f248511e) && this.f248512f == dVar.f248512f;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f248508b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248649b() {
        return this.f248509c;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f248508b) * 31, 31, this.f248509c), 31, this.f248510d);
        AttributedText attributedText = this.f248511e;
        return Integer.hashCode(this.f248512f) + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormPhotoPickerItem(id=");
        sb2.append(this.f248508b);
        sb2.append(", stringId=");
        sb2.append(this.f248509c);
        sb2.append(", description=");
        sb2.append(this.f248510d);
        sb2.append(", attributedText=");
        sb2.append(this.f248511e);
        sb2.append(", maxItemCount=");
        return androidx.appcompat.app.r.t(sb2, this.f248512f, ')');
    }
}
