package com.avito.android.tariff.cpx.configure.levels.items.level_cards.list;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LevelCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/l;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f296181a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f296182b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f296183c;

    public l(@Y61.l UniversalImage universalImage, @Y61.k AttributedText attributedText, @Y61.k DeepLink deepLink) {
        this.f296181a = universalImage;
        this.f296182b = attributedText;
        this.f296183c = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f296181a, lVar.f296181a) && L.f(this.f296182b, lVar.f296182b) && L.f(this.f296183c, lVar.f296183c);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f296181a;
        return this.f296183c.hashCode() + com.avito.android.actions_sheet.a.b((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.f296182b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OtherAdvantagesButton(icon=");
        sb2.append(this.f296181a);
        sb2.append(", title=");
        sb2.append(this.f296182b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f296183c, ')');
    }
}
