package com.avito.android.rating_form.item.development;

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

/* compiled from: DevelopmentItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/development/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/development/i;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f248407d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f248408b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f248409c;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.development_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f248408b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.development);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f248409c = (Input) viewFindViewById2;
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void M5(@k Y41.a<G0> aVar) {
        this.f248409c.setClearButtonListener(aVar);
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void X0(@l Boolean bool) {
        this.f248408b.setEnabled(bool != null ? bool.booleanValue() : true);
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f248409c.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(13, aVar));
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void f(@l String str) {
        this.f248408b.setSubtitle(str);
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void i40(@l String str) {
        if (str == null) {
            str = "";
        }
        Input.t(this.f248409c, str, false, 6);
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void o(@l String str) {
        this.f248409c.setHint(str);
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void s0(@l PrintableText printableText) {
        ComponentContainer componentContainer = this.f248408b;
        if (printableText != null) {
            ComponentContainer.l(componentContainer, new int[]{R.id.development}, printableText.k0(componentContainer.getContext()), 4);
        } else {
            componentContainer.k();
        }
    }

    @Override // com.avito.android.rating_form.item.development.i
    public final void setTitle(@l String str) {
        this.f248408b.setTitle(str);
    }
}
