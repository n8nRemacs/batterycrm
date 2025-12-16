package com.avito.android.mortgage.root.list.items.navigation;

import KZ.A;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavigationItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/navigation/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f202703b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final A f202704c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final A f202705d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ApplicationProcessType f202706e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AttributedText f202707f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f202708g;

    public c(@Y61.k String str, @Y61.l A a12, @Y61.l A a13, @Y61.l ApplicationProcessType applicationProcessType, @Y61.l AttributedText attributedText, boolean z12) {
        this.f202703b = str;
        this.f202704c = a12;
        this.f202705d = a13;
        this.f202706e = applicationProcessType;
        this.f202707f = attributedText;
        this.f202708g = z12;
    }

    public static c a(c cVar, ApplicationProcessType applicationProcessType, int i12) {
        String str = cVar.f202703b;
        A a12 = cVar.f202704c;
        A a13 = cVar.f202705d;
        if ((i12 & 8) != 0) {
            applicationProcessType = cVar.f202706e;
        }
        ApplicationProcessType applicationProcessType2 = applicationProcessType;
        AttributedText attributedText = cVar.f202707f;
        boolean z12 = (i12 & 32) != 0 ? cVar.f202708g : false;
        cVar.getClass();
        return new c(str, a12, a13, applicationProcessType2, attributedText, z12);
    }

    @Override // a10.InterfaceC19664a
    @Y61.k
    public final InterfaceC19665b N() {
        return a(this, null, 31);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202703b, cVar.f202703b) && L.f(this.f202704c, cVar.f202704c) && L.f(this.f202705d, cVar.f202705d) && this.f202706e == cVar.f202706e && L.f(this.f202707f, cVar.f202707f) && this.f202708g == cVar.f202708g;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202444j() {
        return this.f202708g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85138b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85139c() {
        return this.f202703b;
    }

    public final int hashCode() {
        int iHashCode = this.f202703b.hashCode() * 31;
        A a12 = this.f202704c;
        int iHashCode2 = (iHashCode + (a12 == null ? 0 : a12.hashCode())) * 31;
        A a13 = this.f202705d;
        int iHashCode3 = (iHashCode2 + (a13 == null ? 0 : a13.hashCode())) * 31;
        ApplicationProcessType applicationProcessType = this.f202706e;
        int iHashCode4 = (iHashCode3 + (applicationProcessType == null ? 0 : applicationProcessType.hashCode())) * 31;
        AttributedText attributedText = this.f202707f;
        return Boolean.hashCode(this.f202708g) + ((iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationItem(stringId=");
        sb2.append(this.f202703b);
        sb2.append(", nextButtonAction=");
        sb2.append(this.f202704c);
        sb2.append(", previousButtonAction=");
        sb2.append(this.f202705d);
        sb2.append(", loadingButtonType=");
        sb2.append(this.f202706e);
        sb2.append(", legalText=");
        sb2.append(this.f202707f);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202708g, ')');
    }

    public /* synthetic */ c(String str, A a12, A a13, ApplicationProcessType applicationProcessType, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(str, a12, a13, (i12 & 8) != 0 ? null : applicationProcessType, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? true : z12);
    }
}
