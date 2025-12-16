package com.avito.android.vas_union.ui.items.vas_performance_select;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2PerformanceSelectItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/c;", "Lcom/avito/conveyor_item/a;", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f323346b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<a> f323347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f323348d;

    /* compiled from: VasUnionV2PerformanceSelectItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/c$a;", "Lcom/avito/android/lib/design/selector_card/r;", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements r {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f323349b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f323350c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C9995a f323351d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final AttributedText f323352e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AttributedText f323353f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final AttributedText f323354g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final UniversalImage f323355h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final MnzFloatingFooterContact f323356i;

        /* compiled from: VasUnionV2PerformanceSelectItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/c$a$a;", "", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_union.ui.items.vas_performance_select.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9995a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f323357a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f323358b;

            public C9995a(@Y61.k String str, @Y61.k String str2) {
                this.f323357a = str;
                this.f323358b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9995a)) {
                    return false;
                }
                C9995a c9995a = (C9995a) obj;
                return L.f(this.f323357a, c9995a.f323357a) && L.f(this.f323358b, c9995a.f323358b);
            }

            public final int hashCode() {
                return this.f323358b.hashCode() + (this.f323357a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Discount(title=");
                sb2.append(this.f323357a);
                sb2.append(", style=");
                return C22026a.c(sb2, this.f323358b, ')');
            }
        }

        public a(@Y61.k String str, boolean z12, @l C9995a c9995a, @Y61.k AttributedText attributedText, @l AttributedText attributedText2, @Y61.k AttributedText attributedText3, @l UniversalImage universalImage, @l MnzFloatingFooterContact mnzFloatingFooterContact) {
            this.f323349b = str;
            this.f323350c = z12;
            this.f323351d = c9995a;
            this.f323352e = attributedText;
            this.f323353f = attributedText2;
            this.f323354g = attributedText3;
            this.f323355h = universalImage;
            this.f323356i = mnzFloatingFooterContact;
        }

        @Override // com.avito.android.lib.design.selector_card.r
        public final boolean a(@Y61.k r rVar) {
            return (rVar instanceof a) && equals(rVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f323349b, aVar.f323349b) && this.f323350c == aVar.f323350c && L.f(this.f323351d, aVar.f323351d) && L.f(this.f323352e, aVar.f323352e) && L.f(this.f323353f, aVar.f323353f) && L.f(this.f323354g, aVar.f323354g) && L.f(this.f323355h, aVar.f323355h) && L.f(this.f323356i, aVar.f323356i);
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(this.f323349b.hashCode() * 31, 31, this.f323350c);
            C9995a c9995a = this.f323351d;
            int iB2 = com.avito.android.actions_sheet.a.b((i12 + (c9995a == null ? 0 : c9995a.hashCode())) * 31, 31, this.f323352e);
            AttributedText attributedText = this.f323353f;
            int iB3 = com.avito.android.actions_sheet.a.b((iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f323354g);
            UniversalImage universalImage = this.f323355h;
            int iHashCode = (iB3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            MnzFloatingFooterContact mnzFloatingFooterContact = this.f323356i;
            return iHashCode + (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.hashCode() : 0);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @Y61.k
        public final String toString() {
            return "SelectorItem(slug=" + this.f323349b + ", selected=" + this.f323350c + ", discount=" + this.f323351d + ", price=" + this.f323352e + ", oldPrice=" + this.f323353f + ", title=" + this.f323354g + ", image=" + this.f323355h + ", bblContact=" + this.f323356i + ')';
        }
    }

    public c(@Y61.k String str, @Y61.k List<a> list, int i12) {
        this.f323346b = str;
        this.f323347c = list;
        this.f323348d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f323346b, cVar.f323346b) && L.f(this.f323347c, cVar.f323347c) && this.f323348d == cVar.f323348d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF323346b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323346b() {
        return this.f323346b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f323348d) + H.e(this.f323346b.hashCode() * 31, 31, this.f323347c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionV2PerformanceSelectItem(stringId=");
        sb2.append(this.f323346b);
        sb2.append(", selectItems=");
        sb2.append(this.f323347c);
        sb2.append(", chipsId=");
        return androidx.appcompat.app.r.t(sb2, this.f323348d, ')');
    }
}
