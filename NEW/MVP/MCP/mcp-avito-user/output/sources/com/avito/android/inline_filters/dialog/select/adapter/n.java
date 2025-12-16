package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersDialogItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/n;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n extends com.avito.konveyor.adapter.b implements TV0.e, m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f172117c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f172118b;

    public n(@Y61.k View view) {
        super(view);
        this.f172118b = view;
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void ZH(@Y61.k Y41.a<G0> aVar) {
        View view = this.f172118b;
        ListItemCheckbox listItemCheckbox = view instanceof ListItemCheckbox ? (ListItemCheckbox) view : null;
        if (listItemCheckbox != null) {
            listItemCheckbox.setImageClickedListener(new com.avito.android.guests_selector.items.children_add_button.g(19, aVar));
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f172118b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(18, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setChecked(boolean z12) {
        KeyEvent.Callback callback = this.f172118b;
        Checkable checkable = callback instanceof Checkable ? (Checkable) callback : null;
        if (checkable != null) {
            checkable.setChecked(z12);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setIcon(@Y61.l Drawable drawable) {
        View view = this.f172118b;
        ListItemCheckbox listItemCheckbox = view instanceof ListItemCheckbox ? (ListItemCheckbox) view : null;
        if (listItemCheckbox != null) {
            listItemCheckbox.setImageDrawable(drawable);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        View view = this.f172118b;
        if (view instanceof TextView) {
            ((TextView) view).setText(str);
            return;
        }
        if (view instanceof ListItemCheckbox) {
            ((ListItemCheckbox) view).setTitle(str);
            return;
        }
        if (view instanceof ListItemCheckmark) {
            ((ListItemCheckmark) view).setTitle(str);
        } else if (view instanceof ListItemRadio) {
            ((ListItemRadio) view).setTitle(str);
        } else {
            view.setContentDescription(str);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void MY(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void gE(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void UV(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void rF(@Y61.l Boolean bool, @Y61.l UniversalImage universalImage) {
    }
}
