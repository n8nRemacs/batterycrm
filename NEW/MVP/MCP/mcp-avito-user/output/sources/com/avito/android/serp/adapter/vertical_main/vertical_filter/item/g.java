package com.avito.android.serp.adapter.vertical_main.vertical_filter.item;

import Oi0.C14700d;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.L;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import j.I;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerticalFilterItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/g;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/lib/util/groupable_item/e;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.android.serp.c implements com.avito.android.lib.util.groupable_item.e, f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f273557b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f273558c;

    public g(@k View view, @k com.avito.konveyor.adapter.a aVar, @k C14700d c14700d, @k M m12, @l com.avito.konveyor.a aVar2, @k com.avito.android.serp.adapter.vertical_main.c cVar) {
        super(view);
        this.f273557b = new L(view, aVar, c14700d, m12, aVar2, null, null, null, cVar, 224, null);
        this.f273558c = (Banner) view;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void AQ(@l StyleBlock styleBlock) {
        this.f273557b.AQ(styleBlock);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void HW(@k Y41.a aVar) {
        this.f273557b.HW(aVar);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void OD(@l Integer num) {
        this.f273557b.OD(num);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Of(@l String str, boolean z12) {
        this.f273557b.Of(str, z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Sj() {
        this.f273557b.Sj();
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f273558c.Tz(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void YI(@l Integer num) {
        this.f273557b.YI(num);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void bg(@k View.OnClickListener onClickListener) {
        this.f273557b.bg(onClickListener);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void c20(@l BottomContent bottomContent, @k Y41.l<? super DeepLink, G0> lVar) {
        this.f273557b.c20(bottomContent, lVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f273557b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void s1(@k List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e> list) {
        this.f273557b.s1(list);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void setTitle(@l String str) {
        this.f273557b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void xO(int i12, @k Y41.a aVar, @k String str) {
        this.f273557b.xO(i12, aVar, str);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void yM(@InterfaceC42150f int i12, @I int i13) {
        this.f273557b.yM(i12, i13);
    }

    public /* synthetic */ g(View view, com.avito.konveyor.adapter.a aVar, C14700d c14700d, M m12, com.avito.konveyor.a aVar2, com.avito.android.serp.adapter.vertical_main.c cVar, int i12, C42822w c42822w) {
        this(view, aVar, c14700d, m12, (i12 & 16) != 0 ? null : aVar2, cVar);
    }
}
