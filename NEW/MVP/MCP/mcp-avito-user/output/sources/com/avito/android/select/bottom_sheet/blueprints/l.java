package com.avito.android.select.bottom_sheet.blueprints;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.select.InterfaceC34610a;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableItemIconRightView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f265158d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34610a f265159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ListItemCheckbox f265160c;

    public l(@Y61.k ListItemCheckbox listItemCheckbox, @Y61.k InterfaceC34610a interfaceC34610a) throws Resources.NotFoundException {
        super(listItemCheckbox);
        this.f265159b = interfaceC34610a;
        this.f265160c = listItemCheckbox;
        int dimensionPixelSize = listItemCheckbox.getContext().getResources().getDimensionPixelSize(R.dimen.color_indicator_size);
        listItemCheckbox.n(dimensionPixelSize, dimensionPixelSize);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f265160c.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(19, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f265160c.setEnabled(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void f(@Y61.l String str) {
        this.f265160c.setSubtitle(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void iw(@Y61.l BaseListItem.Alignment alignment) {
        this.f265160c.setAlignment(alignment);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l(@Y61.l Image image) {
        ListItemCheckbox listItemCheckbox = this.f265160c;
        com.avito.android.image_loader.fresco.s.c(listItemCheckbox.getImageContainer(), C35829k2.c(image, listItemCheckbox, 1, 22).b(), true, null, null);
        listItemCheckbox.l();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@Y61.k String str) {
        ListItemCheckbox listItemCheckbox = this.f265160c;
        listItemCheckbox.setImageColor((ColorStateList) null);
        Drawable drawableA = this.f265159b.a(listItemCheckbox.getContext(), str, null);
        if (drawableA == null) {
            listItemCheckbox.k();
        } else {
            listItemCheckbox.setImageDrawable(drawableA);
            listItemCheckbox.l();
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
        this.f265160c.k();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setChecked(boolean z12) {
        this.f265160c.setChecked(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
        ListItemCheckbox listItemCheckbox = this.f265160c;
        listItemCheckbox.setImageColor((ColorStateList) null);
        Drawable drawableA = this.f265159b.a(listItemCheckbox.getContext(), null, Integer.valueOf(i12));
        if (drawableA == null) {
            listItemCheckbox.k();
        } else {
            listItemCheckbox.setImageDrawable(drawableA);
            listItemCheckbox.l();
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@Y61.k String str) {
        this.f265160c.setTitle(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void HC(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void s(@Y61.k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@Y61.l UniversalImage universalImage, @Y61.l Size size) {
    }
}
