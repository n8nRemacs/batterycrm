package com.avito.android.cart_similar_items.konveyor.snippet;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_similar_items.konveyor.g;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SnippetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/snippet/c;", "Lcom/avito/android/cart_similar_items/konveyor/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.android.cart_similar_items.konveyor.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f115873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.cart_similar_items.konveyor.g f115874c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f115875d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f115876e;

    /* renamed from: f, reason: collision with root package name */
    public final double f115877f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Stepper f115878g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f115879h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f115880i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<BeduinModel> f115881j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f115882k;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k com.avito.android.cart_similar_items.konveyor.g gVar, @l Image image, @k String str2, double d12, @l Stepper stepper, boolean z12, @k DeepLink deepLink, @l List<? extends BeduinModel> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2) {
        this.f115873b = str;
        this.f115874c = gVar;
        this.f115875d = image;
        this.f115876e = str2;
        this.f115877f = d12;
        this.f115878g = stepper;
        this.f115879h = z12;
        this.f115880i = deepLink;
        this.f115881j = list;
        this.f115882k = list2;
    }

    public static c a(c cVar, Stepper stepper, boolean z12, int i12) {
        String str = cVar.f115873b;
        com.avito.android.cart_similar_items.konveyor.g gVar = cVar.f115874c;
        Image image = cVar.f115875d;
        String str2 = cVar.f115876e;
        double d12 = cVar.f115877f;
        if ((i12 & 32) != 0) {
            stepper = cVar.f115878g;
        }
        Stepper stepper2 = stepper;
        if ((i12 & 64) != 0) {
            z12 = cVar.f115879h;
        }
        DeepLink deepLink = cVar.f115880i;
        List<BeduinModel> list = cVar.f115881j;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list2 = cVar.f115882k;
        cVar.getClass();
        return new c(str, gVar, image, str2, d12, stepper2, z12, deepLink, list, list2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f115873b, cVar.f115873b) && L.f(this.f115874c, cVar.f115874c) && L.f(this.f115875d, cVar.f115875d) && L.f(this.f115876e, cVar.f115876e) && Double.compare(this.f115877f, cVar.f115877f) == 0 && L.f(this.f115878g, cVar.f115878g) && this.f115879h == cVar.f115879h && L.f(this.f115880i, cVar.f115880i) && L.f(this.f115881j, cVar.f115881j) && L.f(this.f115882k, cVar.f115882k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145224b() {
        return this.f115873b;
    }

    public final int hashCode() {
        int iHashCode = (this.f115874c.hashCode() + (this.f115873b.hashCode() * 31)) * 31;
        Image image = this.f115875d;
        int iD2 = androidx.compose.ui.graphics.colorspace.e.d(H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f115876e), 31, this.f115877f);
        Stepper stepper = this.f115878g;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f115880i, r.i((iD2 + (stepper == null ? 0 : stepper.hashCode())) * 31, 31, this.f115879h), 31);
        List<BeduinModel> list = this.f115881j;
        return this.f115882k.hashCode() + ((iE2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.cart_similar_items.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final com.avito.android.cart_similar_items.konveyor.g getF115848c() {
        return this.f115874c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnippetItem(stringId=");
        sb2.append(this.f115873b);
        sb2.append(", spanType=");
        sb2.append(this.f115874c);
        sb2.append(", image=");
        sb2.append(this.f115875d);
        sb2.append(", title=");
        sb2.append(this.f115876e);
        sb2.append(", price=");
        sb2.append(this.f115877f);
        sb2.append(", stepper=");
        sb2.append(this.f115878g);
        sb2.append(", isFavorite=");
        sb2.append(this.f115879h);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.f115880i);
        sb2.append(", children=");
        sb2.append(this.f115881j);
        sb2.append(", childrenConverted=");
        return H.p(sb2, this.f115882k, ')');
    }

    public /* synthetic */ c(String str, com.avito.android.cart_similar_items.konveyor.g gVar, Image image, String str2, double d12, Stepper stepper, boolean z12, DeepLink deepLink, List list, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? g.b.f115844a : gVar, image, str2, d12, stepper, z12, deepLink, list, list2);
    }
}
