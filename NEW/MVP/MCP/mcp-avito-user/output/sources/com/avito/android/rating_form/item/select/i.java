package com.avito.android.rating_form.item.select;

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

/* compiled from: SelectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/select/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/select/h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f248598d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f248599b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f248600c;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f248599b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f248600c = (Input) viewFindViewById2;
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void X0(@l Boolean bool) {
        this.f248599b.setEnabled(bool != null ? bool.booleanValue() : true);
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f248600c.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(14, aVar));
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void f(@l String str) {
        this.f248599b.setSubtitle(str);
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void m(@l String str) {
        Input.t(this.f248600c, str, false, 6);
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void o(@l String str) {
        this.f248600c.setHint(str);
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void s0(@l PrintableText printableText) {
        ComponentContainer componentContainer = this.f248599b;
        if (printableText != null) {
            ComponentContainer.l(componentContainer, new int[]{R.id.select}, printableText.k0(componentContainer.getContext()), 4);
        } else {
            componentContainer.k();
        }
    }

    @Override // com.avito.android.rating_form.item.select.h
    public final void setTitle(@l String str) {
        this.f248599b.setTitle(str);
    }
}
