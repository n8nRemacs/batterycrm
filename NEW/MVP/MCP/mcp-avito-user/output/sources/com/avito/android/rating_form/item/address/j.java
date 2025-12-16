package com.avito.android.rating_form.item.address;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddressItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/address/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/address/i;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f248279d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f248280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f248281c;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.address_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f248280b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.address);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f248281c = (Input) viewFindViewById2;
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void M5(@k Y41.a<G0> aVar) {
        this.f248281c.setClearButtonListener(aVar);
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void X0(@l Boolean bool) {
        this.f248280b.setEnabled(bool != null ? bool.booleanValue() : true);
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f248281c.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(12, aVar));
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void f(@l String str) {
        this.f248280b.setSubtitle(str);
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void m(@l String str) {
        Input.t(this.f248281c, str, false, 6);
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void o(@l String str) {
        this.f248281c.setHint(str);
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void s0(@l PrintableText printableText) {
        ComponentContainer componentContainer = this.f248280b;
        if (printableText != null) {
            ComponentContainer.l(componentContainer, new int[]{R.id.address}, printableText.k0(componentContainer.getContext()), 4);
        } else {
            componentContainer.k();
        }
    }

    @Override // com.avito.android.rating_form.item.address.i
    public final void setTitle(@l String str) {
        this.f248280b.setTitle(str);
    }
}
