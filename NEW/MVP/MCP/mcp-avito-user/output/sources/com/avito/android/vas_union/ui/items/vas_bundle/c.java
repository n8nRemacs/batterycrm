package com.avito.android.vas_union.ui.items.vas_bundle;

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

/* compiled from: VasUnionV2BundleItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/c;", "Lcom/avito/conveyor_item/a;", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f323276b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f323277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<a> f323278d;

    /* compiled from: VasUnionV2BundleItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/c$a;", "Lcom/avito/android/lib/design/selector_card/r;", "a", "b", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements r {

        /* renamed from: b, reason: collision with root package name */
        public final int f323279b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f323280c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f323281d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final b f323282e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f323283f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final AttributedText f323284g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final List<C9993a> f323285h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final AttributedText f323286i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final AttributedText f323287j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final MnzFloatingFooterContact f323288k;

        /* compiled from: VasUnionV2BundleItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/c$a$a;", "", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_union.ui.items.vas_bundle.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9993a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AttributedText f323289a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AttributedText f323290b;

            public C9993a(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
                this.f323289a = attributedText;
                this.f323290b = attributedText2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9993a)) {
                    return false;
                }
                C9993a c9993a = (C9993a) obj;
                return L.f(this.f323289a, c9993a.f323289a) && L.f(this.f323290b, c9993a.f323290b);
            }

            public final int hashCode() {
                return this.f323290b.hashCode() + (this.f323289a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Benefit(text=");
                sb2.append(this.f323289a);
                sb2.append(", icon=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f323290b, ')');
            }
        }

        /* compiled from: VasUnionV2BundleItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/c$a$b;", "", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f323291a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f323292b;

            public b(@Y61.k String str, @Y61.k String str2) {
                this.f323291a = str;
                this.f323292b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f323291a, bVar.f323291a) && L.f(this.f323292b, bVar.f323292b);
            }

            public final int hashCode() {
                return this.f323292b.hashCode() + (this.f323291a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Discount(title=");
                sb2.append(this.f323291a);
                sb2.append(", style=");
                return C22026a.c(sb2, this.f323292b, ')');
            }
        }

        public a(int i12, boolean z12, @l AttributedText attributedText, @l b bVar, @Y61.k UniversalImage universalImage, @Y61.k AttributedText attributedText2, @Y61.k List<C9993a> list, @Y61.k AttributedText attributedText3, @l AttributedText attributedText4, @l MnzFloatingFooterContact mnzFloatingFooterContact) {
            this.f323279b = i12;
            this.f323280c = z12;
            this.f323281d = attributedText;
            this.f323282e = bVar;
            this.f323283f = universalImage;
            this.f323284g = attributedText2;
            this.f323285h = list;
            this.f323286i = attributedText3;
            this.f323287j = attributedText4;
            this.f323288k = mnzFloatingFooterContact;
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
            return this.f323279b == aVar.f323279b && this.f323280c == aVar.f323280c && L.f(this.f323281d, aVar.f323281d) && L.f(this.f323282e, aVar.f323282e) && L.f(this.f323283f, aVar.f323283f) && L.f(this.f323284g, aVar.f323284g) && L.f(this.f323285h, aVar.f323285h) && L.f(this.f323286i, aVar.f323286i) && L.f(this.f323287j, aVar.f323287j) && L.f(this.f323288k, aVar.f323288k);
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(Integer.hashCode(this.f323279b) * 31, 31, this.f323280c);
            AttributedText attributedText = this.f323281d;
            int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            b bVar = this.f323282e;
            int iB2 = com.avito.android.actions_sheet.a.b(H.e(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.a((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f323283f), 31, this.f323284g), 31, this.f323285h), 31, this.f323286i);
            AttributedText attributedText2 = this.f323287j;
            int iHashCode2 = (iB2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            MnzFloatingFooterContact mnzFloatingFooterContact = this.f323288k;
            return iHashCode2 + (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.hashCode() : 0);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @Y61.k
        public final String toString() {
            return "SelectorItem(bundleId=" + this.f323279b + ", selected=" + this.f323280c + ", priceHint=" + this.f323281d + ", discount=" + this.f323282e + ", image=" + this.f323283f + ", title=" + this.f323284g + ", benefits=" + this.f323285h + ", price=" + this.f323286i + ", oldPrice=" + this.f323287j + ", bblContact=" + this.f323288k + ')';
        }
    }

    public c(@Y61.k String str, @l AttributedText attributedText, @Y61.k List<a> list) {
        this.f323276b = str;
        this.f323277c = attributedText;
        this.f323278d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f323276b, cVar.f323276b) && L.f(this.f323277c, cVar.f323277c) && L.f(this.f323278d, cVar.f323278d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return getF327254b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF327254b() {
        return this.f323276b;
    }

    public final int hashCode() {
        int iHashCode = this.f323276b.hashCode() * 31;
        AttributedText attributedText = this.f323277c;
        return this.f323278d.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionV2BundleItem(stringId=");
        sb2.append(this.f323276b);
        sb2.append(", description=");
        sb2.append(this.f323277c);
        sb2.append(", selectItems=");
        return H.p(sb2, this.f323278d, ')');
    }
}
