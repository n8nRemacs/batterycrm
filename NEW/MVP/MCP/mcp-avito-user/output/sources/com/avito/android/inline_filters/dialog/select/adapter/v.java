package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35829k2;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersDialogMultiselectImageRightView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/v;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "Lcom/avito/konveyor/adapter/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f172132c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemCheckbox f172133b;

    public v(@Y61.k ListItemCheckbox listItemCheckbox) {
        super(listItemCheckbox);
        this.f172133b = listItemCheckbox;
        D6.f(listItemCheckbox, 0, 0, 0, 0, 14);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f172133b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(20, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
        ListItemCheckbox listItemCheckbox = this.f172133b;
        com.avito.android.image_loader.fresco.s.c(listItemCheckbox.getImageContainer(), C35829k2.c(image, listItemCheckbox, 1, 22).b(), true, null, null);
        listItemCheckbox.l();
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setChecked(boolean z12) {
        this.f172133b.setChecked(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        this.f172133b.setTitle(str);
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
    public final void gE(@Y61.l String str) {
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
