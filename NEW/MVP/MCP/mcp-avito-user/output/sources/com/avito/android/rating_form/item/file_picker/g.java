package com.avito.android.rating_form.item.file_picker;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.rating_form.FieldIdentifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormFilePickerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/file_picker/g;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class g implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FieldIdentifier f248428c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f248429d;

    /* renamed from: e, reason: collision with root package name */
    public final int f248430e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.rating_form.step.e> f248431f;

    public g(@Y61.k String str, @Y61.k FieldIdentifier fieldIdentifier, @Y61.k String str2, int i12, @Y61.k List<com.avito.android.rating_form.step.e> list) {
        this.f248427b = str;
        this.f248428c = fieldIdentifier;
        this.f248429d = str2;
        this.f248430e = i12;
        this.f248431f = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f248427b, gVar.f248427b) && L.f(this.f248428c, gVar.f248428c) && L.f(this.f248429d, gVar.f248429d) && this.f248430e == gVar.f248430e && L.f(this.f248431f, gVar.f248431f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return getF244695b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244695b() {
        return this.f248427b;
    }

    public final int hashCode() {
        return this.f248431f.hashCode() + r.e(this.f248430e, H.d((this.f248428c.hashCode() + (this.f248427b.hashCode() * 31)) * 31, 31, this.f248429d), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormFilePickerItem(stringId=");
        sb2.append(this.f248427b);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248428c);
        sb2.append(", description=");
        sb2.append(this.f248429d);
        sb2.append(", maxItemCount=");
        sb2.append(this.f248430e);
        sb2.append(", fileList=");
        return H.p(sb2, this.f248431f, ')');
    }
}
