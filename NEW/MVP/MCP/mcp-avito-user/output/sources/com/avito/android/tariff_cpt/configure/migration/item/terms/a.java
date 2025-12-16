package com.avito.android.tariff_cpt.configure.migration.item.terms;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMigrationTermsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/item/terms/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f298059c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f298060d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f298061e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f298062f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f298063g;

    public a(@k String str, @k AttributedText attributedText, @l AttributedText attributedText2, @InterfaceC42150f @l Integer num, @l UniversalColor universalColor, @l AttributedText attributedText3) {
        this.f298058b = str;
        this.f298059c = attributedText;
        this.f298060d = attributedText2;
        this.f298061e = num;
        this.f298062f = universalColor;
        this.f298063g = attributedText3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f298058b, aVar.f298058b) && L.f(this.f298059c, aVar.f298059c) && L.f(this.f298060d, aVar.f298060d) && L.f(this.f298061e, aVar.f298061e) && L.f(this.f298062f, aVar.f298062f) && L.f(this.f298063g, aVar.f298063g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74860b() {
        return getF273161b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273161b() {
        return this.f298058b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f298058b.hashCode() * 31, 31, this.f298059c);
        AttributedText attributedText = this.f298060d;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.f298061e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UniversalColor universalColor = this.f298062f;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        AttributedText attributedText2 = this.f298063g;
        return iHashCode3 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptMigrationTermsItem(stringId=");
        sb2.append(this.f298058b);
        sb2.append(", title=");
        sb2.append(this.f298059c);
        sb2.append(", subtitle=");
        sb2.append(this.f298060d);
        sb2.append(", iconDrawableAttr=");
        sb2.append(this.f298061e);
        sb2.append(", iconColor=");
        sb2.append(this.f298062f);
        sb2.append(", textIcon=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f298063g, ')');
    }
}
