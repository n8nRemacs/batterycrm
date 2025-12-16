package com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StickersCountItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers_count/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f320681b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f320682c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f320683d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f320684e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f320685f;

    public a(@k String str, @k String str2, @l AttributedText attributedText, @l Image image, @l Image image2) {
        this.f320681b = str;
        this.f320682c = str2;
        this.f320683d = attributedText;
        this.f320684e = image;
        this.f320685f = image2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f320681b, aVar.f320681b) && L.f(this.f320682c, aVar.f320682c) && L.f(this.f320683d, aVar.f320683d) && L.f(this.f320684e, aVar.f320684e) && L.f(this.f320685f, aVar.f320685f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78464b() {
        return getF78466d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f320681b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f320681b.hashCode() * 31, 31, this.f320682c);
        AttributedText attributedText = this.f320683d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f320684e;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f320685f;
        return iHashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickersCountItem(stringId=");
        sb2.append(this.f320681b);
        sb2.append(", title=");
        sb2.append(this.f320682c);
        sb2.append(", price=");
        sb2.append(this.f320683d);
        sb2.append(", icon=");
        sb2.append(this.f320684e);
        sb2.append(", lightningIcon=");
        return AK.c.o(sb2, this.f320685f, ')');
    }
}
