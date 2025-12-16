package com.avito.android.select.bottom_sheet.blueprints;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableItemViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/r;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemCompoundButton f265180b;

    /* renamed from: c, reason: collision with root package name */
    public final int f265181c;

    /* renamed from: d, reason: collision with root package name */
    public final int f265182d;

    public r(@Y61.k View view) {
        super(view);
        this.f265180b = (ListItemCompoundButton) view;
        this.f265181c = view.getResources().getDimensionPixelSize(R.dimen.select_item_horizontal_margin);
        this.f265182d = view.getResources().getDimensionPixelSize(R.dimen.select_sub_item_start_margin);
    }

    public static void B80(r rVar, Y41.a aVar) {
        rVar.f265180b.toggle();
        aVar.invoke();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void HC(boolean z12) {
        D6.f(this.f265180b, z12 ? this.f265182d : this.f265181c, 0, 0, 0, 14);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f265180b.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(this, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f265180b.setEnabled(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void f(@Y61.l String str) {
        this.f265180b.setMessage(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void s(@Y61.k String str) {
        this.f265180b.setTag(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setChecked(boolean z12) {
        this.f265180b.setChecked(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@Y61.k String str) {
        this.f265180b.setTitle(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void iw(@Y61.l BaseListItem.Alignment alignment) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@Y61.k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@Y61.l UniversalImage universalImage, @Y61.l Size size) {
    }
}
