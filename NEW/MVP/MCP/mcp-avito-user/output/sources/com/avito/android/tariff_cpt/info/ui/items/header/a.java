package com.avito.android.tariff_cpt.info.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/header/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f298341b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f298342c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f298343d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C9112a f298344e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<b> f298345f;

    /* compiled from: CptInfoHeaderItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/header/a$a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff_cpt.info.ui.items.header.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9112a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f298346a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f298347b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f298348c;

        public C9112a(@k DeepLink deepLink, @InterfaceC42150f @l Integer num, @l String str) {
            this.f298346a = num;
            this.f298347b = str;
            this.f298348c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9112a)) {
                return false;
            }
            C9112a c9112a = (C9112a) obj;
            return L.f(this.f298346a, c9112a.f298346a) && L.f(this.f298347b, c9112a.f298347b) && L.f(this.f298348c, c9112a.f298348c);
        }

        public final int hashCode() {
            Integer num = this.f298346a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f298347b;
            return this.f298348c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HeaderButton(icon=");
            sb2.append(this.f298346a);
            sb2.append(", style=");
            sb2.append(this.f298347b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f298348c, ')');
        }
    }

    /* compiled from: CptInfoHeaderItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/header/a$b;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Boolean f298349a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f298350b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f298351c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f298352d;

        public b(@l Boolean bool, boolean z12, @k String str, @k DeepLink deepLink) {
            this.f298349a = bool;
            this.f298350b = z12;
            this.f298351c = str;
            this.f298352d = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f298349a, bVar.f298349a) && this.f298350b == bVar.f298350b && L.f(this.f298351c, bVar.f298351c) && L.f(this.f298352d, bVar.f298352d);
        }

        public final int hashCode() {
            Boolean bool = this.f298349a;
            return this.f298352d.hashCode() + H.d(r.i((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f298350b), 31, this.f298351c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabEntity(hasDotNotification=");
            sb2.append(this.f298349a);
            sb2.append(", isSelected=");
            sb2.append(this.f298350b);
            sb2.append(", title=");
            sb2.append(this.f298351c);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f298352d, ')');
        }
    }

    public a(@k String str, @k String str2, @l AttributedText attributedText, @l C9112a c9112a, @l List<b> list) {
        this.f298341b = str;
        this.f298342c = str2;
        this.f298343d = attributedText;
        this.f298344e = c9112a;
        this.f298345f = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f298341b, aVar.f298341b) && L.f(this.f298342c, aVar.f298342c) && L.f(this.f298343d, aVar.f298343d) && L.f(this.f298344e, aVar.f298344e) && L.f(this.f298345f, aVar.f298345f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF290899d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290899d() {
        return this.f298341b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f298341b.hashCode() * 31, 31, this.f298342c);
        AttributedText attributedText = this.f298343d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        C9112a c9112a = this.f298344e;
        int iHashCode2 = (iHashCode + (c9112a == null ? 0 : c9112a.hashCode())) * 31;
        List<b> list = this.f298345f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoHeaderItem(stringId=");
        sb2.append(this.f298341b);
        sb2.append(", title=");
        sb2.append(this.f298342c);
        sb2.append(", description=");
        sb2.append(this.f298343d);
        sb2.append(", button=");
        sb2.append(this.f298344e);
        sb2.append(", tabs=");
        return H.p(sb2, this.f298345f, ')');
    }

    public /* synthetic */ a(String str, String str2, AttributedText attributedText, C9112a c9112a, List list, int i12, C42822w c42822w) {
        this(str, str2, attributedText, c9112a, (i12 & 16) != 0 ? null : list);
    }
}
