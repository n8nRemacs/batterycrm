package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35847m4;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Vertical.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/C;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/B;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C extends com.avito.konveyor.adapter.b implements B {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f211989d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ListItemRadio f211990b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Drawable f211991c;

    public C(@Y61.k View view) {
        super(view);
        ListItemRadio listItemRadio = (ListItemRadio) view.findViewById(R.id.item_verical_radio_item);
        this.f211990b = listItemRadio;
        this.f211991c = C35835l0.h(R.attr.ic_help24, this.itemView.getContext());
        listItemRadio.setIconDuplicateParentStateEnabled(false);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void Ow(@Y61.k Y41.a<G0> aVar) {
        ListItemRadio listItemRadio = this.f211990b;
        listItemRadio.setImageDrawable(this.f211991c);
        listItemRadio.setImageClickedListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(11, aVar));
        listItemRadio.setIconEnabled(true);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void Xr() {
        ListItemRadio listItemRadio = this.f211990b;
        listItemRadio.setImageDrawable(null);
        listItemRadio.setImageClickedListener(null);
        listItemRadio.setIconEnabled(false);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f211990b.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(12, aVar));
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void a4(boolean z12) {
        C35847m4.a(this.f211990b, z12);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void h(@Y61.k String str) {
        this.f211990b.setSubtitle(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f211990b.setOnClickListener(null);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void setChecked(boolean z12) {
        this.f211990b.setChecked(z12);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void setEnabled(boolean z12) {
        this.f211990b.setEnabled(z12);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.B
    public final void setTitle(@Y61.k String str) {
        this.f211990b.setTitle(str);
    }
}
