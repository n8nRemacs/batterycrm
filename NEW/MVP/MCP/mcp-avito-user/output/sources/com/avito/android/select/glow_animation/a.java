package com.avito.android.select.glow_animation;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GlowAnimationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/glow_animation/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f265384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f265385c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<UniversalColor> f265386d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f265387e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f265388f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f265389g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f265390h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f265391i;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k List<UniversalColor> list, @Y61.k DeepLink deepLink, @Y61.l Integer num, boolean z12, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2) {
        this.f265384b = str;
        this.f265385c = str2;
        this.f265386d = list;
        this.f265387e = deepLink;
        this.f265388f = num;
        this.f265389g = z12;
        this.f265390h = universalImage;
        this.f265391i = universalImage2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f265384b, aVar.f265384b) && L.f(this.f265385c, aVar.f265385c) && L.f(this.f265386d, aVar.f265386d) && L.f(this.f265387e, aVar.f265387e) && L.f(this.f265388f, aVar.f265388f) && this.f265389g == aVar.f265389g && L.f(this.f265390h, aVar.f265390h) && L.f(this.f265391i, aVar.f265391i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF251639b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF251639b() {
        return this.f265384b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f265387e, H.e(H.d(this.f265384b.hashCode() * 31, 31, this.f265385c), 31, this.f265386d), 31);
        Integer num = this.f265388f;
        int i12 = r.i((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f265389g);
        UniversalImage universalImage = this.f265390h;
        int iHashCode = (i12 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f265391i;
        return iHashCode + (universalImage2 != null ? universalImage2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GlowAnimationItem(stringId=");
        sb2.append(this.f265384b);
        sb2.append(", text=");
        sb2.append(this.f265385c);
        sb2.append(", gradientColors=");
        sb2.append(this.f265386d);
        sb2.append(", deeplink=");
        sb2.append(this.f265387e);
        sb2.append(", horizontalPadding=");
        sb2.append(this.f265388f);
        sb2.append(", withCheckbox=");
        sb2.append(this.f265389g);
        sb2.append(", leftIcon=");
        sb2.append(this.f265390h);
        sb2.append(", rightIcon=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f265391i, ')');
    }

    public /* synthetic */ a(String str, String str2, List list, DeepLink deepLink, Integer num, boolean z12, UniversalImage universalImage, UniversalImage universalImage2, int i12, C42822w c42822w) {
        this(str, str2, list, deepLink, (i12 & 16) != 0 ? null : num, z12, (i12 & 64) != 0 ? null : universalImage, (i12 & 128) != 0 ? null : universalImage2);
    }
}
