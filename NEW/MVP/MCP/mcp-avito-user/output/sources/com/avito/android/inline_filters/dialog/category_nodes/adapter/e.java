package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NdTrxEntryPointNodeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/k;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f171429d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f171430b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f171431c;

    public e(@Y61.k View view) {
        super(view);
        this.f171430b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171431c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f171430b.setOnClickListener(new C(2, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void setTitle(@Y61.k String str) {
        this.f171431c.setText(str);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void yZ(int i12) {
        D6.f(this.f171430b, (y6.b(20) * i12) + y6.b(24), 0, 0, 0, 14);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void CQ() {
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void f(@Y61.k String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void nP(@Y61.l String str) {
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
