package com.avito.android.tariff_cpt.info.ui.items.level_header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoLevelHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_header/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298396b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C9113a f298397c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f298398d;

    /* compiled from: CptInfoLevelHeaderItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_header/a$a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff_cpt.info.ui.items.level_header.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9113a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f298399a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f298400b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f298401c;

        /* renamed from: d, reason: collision with root package name */
        public final int f298402d;

        public C9113a(@InterfaceC42150f int i12, @k DeepLink deepLink, @InterfaceC42150f @l Integer num, @l String str) {
            this.f298399a = deepLink;
            this.f298400b = str;
            this.f298401c = num;
            this.f298402d = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9113a)) {
                return false;
            }
            C9113a c9113a = (C9113a) obj;
            return L.f(this.f298399a, c9113a.f298399a) && L.f(this.f298400b, c9113a.f298400b) && L.f(this.f298401c, c9113a.f298401c) && this.f298402d == c9113a.f298402d;
        }

        public final int hashCode() {
            int iHashCode = this.f298399a.hashCode() * 31;
            String str = this.f298400b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f298401c;
            return Integer.hashCode(this.f298402d) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(deeplink=");
            sb2.append(this.f298399a);
            sb2.append(", title=");
            sb2.append(this.f298400b);
            sb2.append(", iconAttr=");
            sb2.append(this.f298401c);
            sb2.append(", styleAttr=");
            return r.t(sb2, this.f298402d, ')');
        }
    }

    public a(@k String str, @l C9113a c9113a, @l AttributedText attributedText) {
        this.f298396b = str;
        this.f298397c = c9113a;
        this.f298398d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f298396b, aVar.f298396b) && L.f(this.f298397c, aVar.f298397c) && L.f(this.f298398d, aVar.f298398d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return -595228927;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF293121b() {
        return "cpt_info_level_header";
    }

    public final int hashCode() {
        int iD2 = H.d(-1272227553, 31, this.f298396b);
        C9113a c9113a = this.f298397c;
        int iHashCode = (iD2 + (c9113a == null ? 0 : c9113a.hashCode())) * 31;
        AttributedText attributedText = this.f298398d;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoLevelHeaderItem(stringId=cpt_info_level_header, title=");
        sb2.append(this.f298396b);
        sb2.append(", titleButton=");
        sb2.append(this.f298397c);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f298398d, ')');
    }
}
