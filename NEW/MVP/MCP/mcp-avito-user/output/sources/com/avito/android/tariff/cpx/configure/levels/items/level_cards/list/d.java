package com.avito.android.tariff.cpx.configure.levels.items.level_cards.list;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LevelCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/d;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f296160b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f296161c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ButtonAction f296162d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<a> f296163e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final l f296164f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f296165g;

    public d(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l ButtonAction buttonAction, @Y61.k List<a> list, @Y61.l l lVar, boolean z12) {
        this.f296160b = str;
        this.f296161c = attributedText;
        this.f296162d = buttonAction;
        this.f296163e = list;
        this.f296164f = lVar;
        this.f296165g = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f296160b, dVar.f296160b) && L.f(this.f296161c, dVar.f296161c) && L.f(this.f296162d, dVar.f296162d) && L.f(this.f296163e, dVar.f296163e) && L.f(this.f296164f, dVar.f296164f) && this.f296165g == dVar.f296165g;
    }

    @Override // TV0.a
    public final long getId() {
        return getF286342b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF286342b() {
        return this.f296160b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f296160b.hashCode() * 31, 31, this.f296161c);
        ButtonAction buttonAction = this.f296162d;
        int iE2 = H.e((iB2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31, 31, this.f296163e);
        l lVar = this.f296164f;
        return Boolean.hashCode(this.f296165g) + ((iE2 + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LevelCardItem(stringId=");
        sb2.append(this.f296160b);
        sb2.append(", title=");
        sb2.append(this.f296161c);
        sb2.append(", button=");
        sb2.append(this.f296162d);
        sb2.append(", advantages=");
        sb2.append(this.f296163e);
        sb2.append(", otherAdvantages=");
        sb2.append(this.f296164f);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f296165g, ')');
    }

    public /* synthetic */ d(String str, AttributedText attributedText, ButtonAction buttonAction, List list, l lVar, boolean z12, int i12, C42822w c42822w) {
        this(str, attributedText, buttonAction, list, lVar, (i12 & 32) != 0 ? false : z12);
    }
}
