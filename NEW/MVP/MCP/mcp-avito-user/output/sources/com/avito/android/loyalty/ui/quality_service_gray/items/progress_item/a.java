package com.avito.android.loyalty.ui.quality_service_gray.items.progress_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.remote.model.quality_service.GradeColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProgressItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/progress_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f184093b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f184094c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f184095d;

    /* renamed from: e, reason: collision with root package name */
    public final int f184096e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184097f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final GradeColor f184098g;

    public a(@k String str, @k String str2, @l AttributedText attributedText, int i12, int i13, @k GradeColor gradeColor) {
        this.f184093b = str;
        this.f184094c = str2;
        this.f184095d = attributedText;
        this.f184096e = i12;
        this.f184097f = i13;
        this.f184098g = gradeColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f184093b, aVar.f184093b) && L.f(this.f184094c, aVar.f184094c) && L.f(this.f184095d, aVar.f184095d) && this.f184096e == aVar.f184096e && this.f184097f == aVar.f184097f && this.f184098g == aVar.f184098g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return getF268425c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268425c() {
        return this.f184093b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f184093b.hashCode() * 31, 31, this.f184094c);
        AttributedText attributedText = this.f184095d;
        return this.f184098g.hashCode() + r.e(this.f184097f, r.e(this.f184096e, (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "ProgressItem(stringId=" + this.f184093b + ", title=" + this.f184094c + ", description=" + this.f184095d + ", greenThreshold=" + this.f184096e + ", value=" + this.f184097f + ", color=" + this.f184098g + ')';
    }
}
