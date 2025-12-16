package com.avito.android.loyalty.ui.quality_service.items.effect;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EffectItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effect/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183809b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183810c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f183811d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f183812e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f183813f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f183814g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Content f183815h;

    public a(@k String str, @k String str2, @l AttributedText attributedText, @k String str3, @l UniversalImage universalImage, boolean z12, @l Content content) {
        this.f183809b = str;
        this.f183810c = str2;
        this.f183811d = attributedText;
        this.f183812e = str3;
        this.f183813f = universalImage;
        this.f183814g = z12;
        this.f183815h = content;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183809b, aVar.f183809b) && L.f(this.f183810c, aVar.f183810c) && L.f(this.f183811d, aVar.f183811d) && L.f(this.f183812e, aVar.f183812e) && L.f(this.f183813f, aVar.f183813f) && this.f183814g == aVar.f183814g && L.f(this.f183815h, aVar.f183815h);
    }

    @Override // TV0.a
    public final long getId() {
        return getF288408b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288408b() {
        return this.f183809b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f183809b.hashCode() * 31, 31, this.f183810c);
        AttributedText attributedText = this.f183811d;
        int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f183812e);
        UniversalImage universalImage = this.f183813f;
        int i12 = r.i((iD3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f183814g);
        Content content = this.f183815h;
        return i12 + (content != null ? content.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "EffectItem(stringId=" + this.f183809b + ", title=" + this.f183810c + ", description=" + this.f183811d + ", hint=" + this.f183812e + ", image=" + this.f183813f + ", disabled=" + this.f183814g + ", content=" + this.f183815h + ')';
    }
}
