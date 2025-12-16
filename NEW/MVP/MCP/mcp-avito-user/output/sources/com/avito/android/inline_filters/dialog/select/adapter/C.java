package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersDialogSingleLineView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/C;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f172050f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f172051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f172052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f172053d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Checkmark f172054e;

    public C(@Y61.k View view) {
        super(view);
        this.f172051b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f172052c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f172053d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkmark);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        this.f172054e = (Checkmark) viewFindViewById3;
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f172051b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(22, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void gE(@Y61.l String str) {
        I5.a(this.f172053d, str, false);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setChecked(boolean z12) {
        this.f172054e.setChecked(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        I5.a(this.f172052c, str, false);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void MY(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void ZH(@Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setIcon(@Y61.l Drawable drawable) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void UV(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void rF(@Y61.l Boolean bool, @Y61.l UniversalImage universalImage) {
    }
}
