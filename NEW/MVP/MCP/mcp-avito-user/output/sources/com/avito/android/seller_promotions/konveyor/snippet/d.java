package com.avito.android.seller_promotions.konveyor.snippet;

import Sq0.C15214a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.seller_promotions.konveyor.g;
import com.avito.conveyor_item.a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SnippetItem.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u001c\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u00180\u0013¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/snippet/d;", "Lcom/avito/android/seller_promotions/konveyor/c;", "", "stringId", "Lcom/avito/android/seller_promotions/konveyor/g;", "spanType", "Lcom/avito/android/remote/model/Image;", "image", "title", "", "price", "LSq0/a;", "discount", "Lcom/avito/android/cart_snippet_actions/models/ui/Stepper;", "stepper", "", "isFavorite", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lej/a;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "childrenConverted", "<init>", "(Ljava/lang/String;Lcom/avito/android/seller_promotions/konveyor/g;Lcom/avito/android/remote/model/Image;Ljava/lang/String;DLSq0/a;Lcom/avito/android/cart_snippet_actions/models/ui/Stepper;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d implements com.avito.android.seller_promotions.konveyor.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267834b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.seller_promotions.konveyor.g f267835c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f267836d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f267837e;

    /* renamed from: f, reason: collision with root package name */
    public final double f267838f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C15214a f267839g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Stepper f267840h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f267841i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final DeepLink f267842j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<BeduinModel> f267843k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f267844l;

    public d() {
        throw null;
    }

    public d(String str, com.avito.android.seller_promotions.konveyor.g gVar, Image image, String str2, double d12, C15214a c15214a, Stepper stepper, boolean z12, DeepLink deepLink, List list, List list2, C42822w c42822w) {
        this.f267834b = str;
        this.f267835c = gVar;
        this.f267836d = image;
        this.f267837e = str2;
        this.f267838f = d12;
        this.f267839g = c15214a;
        this.f267840h = stepper;
        this.f267841i = z12;
        this.f267842j = deepLink;
        this.f267843k = list;
        this.f267844l = list2;
    }

    public static d a(d dVar, C15214a c15214a, Stepper stepper, boolean z12, int i12) {
        String str = dVar.f267834b;
        com.avito.android.seller_promotions.konveyor.g gVar = dVar.f267835c;
        Image image = dVar.f267836d;
        String str2 = dVar.f267837e;
        double d12 = dVar.f267838f;
        C15214a c15214a2 = (i12 & 32) != 0 ? dVar.f267839g : c15214a;
        Stepper stepper2 = (i12 & 64) != 0 ? dVar.f267840h : stepper;
        boolean z13 = (i12 & 128) != 0 ? dVar.f267841i : z12;
        DeepLink deepLink = dVar.f267842j;
        List<BeduinModel> list = dVar.f267843k;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list2 = dVar.f267844l;
        dVar.getClass();
        return new d(str, gVar, image, str2, d12, c15214a2, stepper2, z13, deepLink, list, list2, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f267834b, dVar.f267834b) && L.f(this.f267835c, dVar.f267835c) && L.f(this.f267836d, dVar.f267836d) && L.f(this.f267837e, dVar.f267837e) && Double.compare(this.f267838f, dVar.f267838f) == 0 && L.f(this.f267839g, dVar.f267839g) && L.f(this.f267840h, dVar.f267840h) && this.f267841i == dVar.f267841i && L.f(this.f267842j, dVar.f267842j) && L.f(this.f267843k, dVar.f267843k) && L.f(this.f267844l, dVar.f267844l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77948b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77949c() {
        return this.f267834b;
    }

    public final int hashCode() {
        int iHashCode = (this.f267835c.hashCode() + (this.f267834b.hashCode() * 31)) * 31;
        Image image = this.f267836d;
        int iD2 = androidx.compose.ui.graphics.colorspace.e.d(H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f267837e), 31, this.f267838f);
        C15214a c15214a = this.f267839g;
        int iHashCode2 = (iD2 + (c15214a == null ? 0 : Integer.hashCode(c15214a.f15166a))) * 31;
        Stepper stepper = this.f267840h;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f267842j, r.i((iHashCode2 + (stepper == null ? 0 : stepper.hashCode())) * 31, 31, this.f267841i), 31);
        List<BeduinModel> list = this.f267843k;
        return this.f267844l.hashCode() + ((iE2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.seller_promotions.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final com.avito.android.seller_promotions.konveyor.g getF267809c() {
        return this.f267835c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnippetItem(stringId=");
        sb2.append(this.f267834b);
        sb2.append(", spanType=");
        sb2.append(this.f267835c);
        sb2.append(", image=");
        sb2.append(this.f267836d);
        sb2.append(", title=");
        sb2.append(this.f267837e);
        sb2.append(", price=");
        sb2.append(this.f267838f);
        sb2.append(", discount=");
        sb2.append(this.f267839g);
        sb2.append(", stepper=");
        sb2.append(this.f267840h);
        sb2.append(", isFavorite=");
        sb2.append(this.f267841i);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.f267842j);
        sb2.append(", children=");
        sb2.append(this.f267843k);
        sb2.append(", childrenConverted=");
        return H.p(sb2, this.f267844l, ')');
    }

    public /* synthetic */ d(String str, com.avito.android.seller_promotions.konveyor.g gVar, Image image, String str2, double d12, C15214a c15214a, Stepper stepper, boolean z12, DeepLink deepLink, List list, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? g.b.f267805a : gVar, image, str2, d12, c15214a, stepper, z12, deepLink, list, list2, null);
    }
}
