package com.avito.android.avito_finance_user_profile.view.item;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/f;", "Lcom/avito/conveyor_item/a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97993b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f97994c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f97995d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f97996e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f97997f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final h f97998g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final i f97999h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f98000i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ArrayList f98001j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ArrayList f98002k;

    public f(@k String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l String str4, @l h hVar, @l i iVar, @l Integer num, @l ArrayList arrayList, @l ArrayList arrayList2) {
        this.f97993b = str;
        this.f97994c = str2;
        this.f97995d = str3;
        this.f97996e = universalImage;
        this.f97997f = str4;
        this.f97998g = hVar;
        this.f97999h = iVar;
        this.f98000i = num;
        this.f98001j = arrayList;
        this.f98002k = arrayList2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f97993b, fVar.f97993b) && L.f(this.f97994c, fVar.f97994c) && L.f(this.f97995d, fVar.f97995d) && L.f(this.f97996e, fVar.f97996e) && L.f(this.f97997f, fVar.f97997f) && L.f(this.f97998g, fVar.f97998g) && L.f(this.f97999h, fVar.f97999h) && L.f(this.f98000i, fVar.f98000i) && L.f(this.f98001j, fVar.f98001j) && L.f(this.f98002k, fVar.f98002k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return getF84934b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84934b() {
        return this.f97993b;
    }

    public final int hashCode() {
        int iHashCode = this.f97993b.hashCode() * 31;
        String str = this.f97994c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97995d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f97996e;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.f97997f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h hVar = this.f97998g;
        int iHashCode6 = (iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.f97999h;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Integer num = this.f98000i;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList arrayList = this.f98001j;
        int iHashCode9 = (iHashCode8 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f98002k;
        return iHashCode9 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceItem(stringId=");
        sb2.append(this.f97993b);
        sb2.append(", title=");
        sb2.append(this.f97994c);
        sb2.append(", subtitle=");
        sb2.append(this.f97995d);
        sb2.append(", image=");
        sb2.append(this.f97996e);
        sb2.append(", imagePosition=");
        sb2.append(this.f97997f);
        sb2.append(", background=");
        sb2.append(this.f97998g);
        sb2.append(", button=");
        sb2.append(this.f97999h);
        sb2.append(", weight=");
        sb2.append(this.f98000i);
        sb2.append(", onSelect=");
        sb2.append(this.f98001j);
        sb2.append(", onAppear=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f98002k, ')');
    }
}
