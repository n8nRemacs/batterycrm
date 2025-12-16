package com.avito.android.evidence_request.details.files;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.photo_list_view.I;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilesItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/details/files/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/evidence_request/details/files/o;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.details.files.view.g f148459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f148460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f148461d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f148462e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f148463f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f148464g;

    public p(@Y61.k View view, @Y61.k com.avito.android.evidence_request.details.files.view.g gVar) {
        super(view);
        this.f148459b = gVar;
        this.f148460c = view.getResources().getDimensionPixelSize(R.dimen.photo_with_title_padding_top);
        this.f148461d = view.getResources().getDimensionPixelSize(R.dimen.photo_without_title_padding_top);
        this.f148462e = (ComponentContainer) view.findViewById(R.id.photo_param_container);
        View viewFindViewById = view.findViewById(R.id.image_list_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f148463f = recyclerView;
        recyclerView.l(new I(view.getContext(), 0, 0, 6, null), -1);
    }

    @Override // com.avito.android.evidence_request.details.files.o
    public final void B2(@Y61.k s sVar) {
        sVar.A(new z(this.f148463f, sVar, this.f148459b));
    }

    @Override // com.avito.android.evidence_request.details.files.o
    public final void H(@Y61.l CharSequence charSequence) {
        ComponentContainer.n(this.f148462e, charSequence, 2);
    }

    @Override // com.avito.android.evidence_request.details.files.o
    public final void T(@Y61.l CharSequence charSequence) {
        this.f148462e.setSubtitle(charSequence);
    }

    @Override // com.avito.android.evidence_request.details.files.o
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f148464g = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f148464g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.evidence_request.details.files.o
    public final void setTitle(@Y61.l CharSequence charSequence) {
        ComponentContainer componentContainer = this.f148462e;
        componentContainer.setTitle(charSequence);
        componentContainer.setPadding(componentContainer.getPaddingLeft(), (charSequence == null || charSequence.length() == 0) ? this.f148461d : this.f148460c, componentContainer.getPaddingRight(), componentContainer.getPaddingBottom());
    }

    @Override // com.avito.android.evidence_request.details.files.o
    public final void u(@Y61.l CharSequence charSequence) {
        this.f148462e.q(charSequence);
    }
}
