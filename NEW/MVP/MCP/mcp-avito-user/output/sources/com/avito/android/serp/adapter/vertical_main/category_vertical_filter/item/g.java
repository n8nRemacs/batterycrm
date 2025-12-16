package com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.util.I5;
import j.I;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CategoryVerticalFilterView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/item/g;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/item/f;", "Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.android.serp.c implements f, com.avito.android.serp.adapter.vertical_main.category_vertical_filter.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d f272685b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f272686c;

    public g(@k View view) {
        super(view);
        this.f272685b = new com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d(view);
        this.f272686c = (TextView) view.findViewById(R.id.category_vertical_filter_title);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void AQ(@l StyleBlock styleBlock) {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void HW(@k Y41.a aVar) {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void OD(@l Integer num) {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Of(@l String str, boolean z12) {
        this.f272685b.Of(str, z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Sj() {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void YI(@l Integer num) {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item.f
    public final void b(@k String str) {
        I5.a(this.f272686c, str, false);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void bg(@k View.OnClickListener onClickListener) {
        this.f272685b.bg(onClickListener);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void c20(@l BottomContent bottomContent, @k Y41.l<? super DeepLink, G0> lVar) {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void s1(@k List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e> list) {
        this.f272685b.s1(list);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void xO(int i12, @k Y41.a aVar, @k String str) {
        this.f272685b.getClass();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void yM(@InterfaceC42150f int i12, @I int i13) {
        this.f272685b.getClass();
    }
}
