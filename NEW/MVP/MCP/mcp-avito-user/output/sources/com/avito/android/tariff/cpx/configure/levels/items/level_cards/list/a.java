package com.avito.android.tariff.cpx.configure.levels.items.level_cards.list;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LevelCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f296155a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f296156b;

    public a(@Y61.l UniversalImage universalImage, @Y61.k AttributedText attributedText) {
        this.f296155a = universalImage;
        this.f296156b = attributedText;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f296155a, aVar.f296155a) && L.f(this.f296156b, aVar.f296156b);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f296155a;
        return this.f296156b.hashCode() + ((universalImage == null ? 0 : universalImage.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Advantage(icon=");
        sb2.append(this.f296155a);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f296156b, ')');
    }
}
