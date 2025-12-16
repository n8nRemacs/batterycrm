package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandspaceNodeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/k;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f171422e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f171423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f171424c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f171425d;

    public b(@Y61.k View view) {
        super(view);
        this.f171423b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f171424c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171425d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f171423b.setOnClickListener(new C(1, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void nP(@Y61.l String str) {
        if (str != null) {
            ImageRequest.a aVarA = C35949t5.a(this.f171424c);
            aVarA.f(Uri.parse(str));
            aVarA.c();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void setTitle(@Y61.k String str) {
        this.f171425d.setText(str);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void yZ(int i12) {
        D6.f(this.f171423b, (y6.b(20) * i12) + y6.b(24), 0, 0, 0, 14);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void CQ() {
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void f(@Y61.k String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void setChecked(boolean z12) {
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void mW(@Y61.k UniversalImage universalImage, @Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void Lv(boolean z12, boolean z13, boolean z14) {
    }
}
