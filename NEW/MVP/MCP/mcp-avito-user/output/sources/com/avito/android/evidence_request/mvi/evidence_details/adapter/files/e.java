package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import android.content.Context;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/d;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f148775b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f148776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f148777d;

    /* renamed from: e, reason: collision with root package name */
    public final int f148778e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f148779f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f148780g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f148781h;

    public e(@Y61.k View view, @Y61.k i iVar) {
        super(view);
        this.f148775b = view;
        this.f148776c = iVar;
        this.f148777d = view.getResources().getDimensionPixelSize(R.dimen.photo_with_title_padding_top);
        this.f148778e = view.getResources().getDimensionPixelSize(R.dimen.photo_without_title_padding_top);
        View viewFindViewById = view.findViewById(R.id.photo_param_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f148779f = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image_list_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f148780g = recyclerView;
        recyclerView.l(new I(view.getContext(), 0, 0, 6, null), -1);
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    public final void B2(@Y61.k s sVar) {
        sVar.A(new z(this.f148780g, sVar, this.f148776c));
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    public final void H(@Y61.l CharSequence charSequence) {
        ComponentContainer.n(this.f148779f, charSequence, 2);
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    public final void T(@Y61.l CharSequence charSequence) {
        this.f148779f.setSubtitle(charSequence);
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f148781h = aVar;
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    @Y61.k
    public final Context getContext() {
        return this.f148775b.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f148781h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    public final void setTitle(@Y61.l CharSequence charSequence) {
        int i12 = (charSequence == null || charSequence.length() == 0) ? this.f148778e : this.f148777d;
        ComponentContainer componentContainer = this.f148779f;
        componentContainer.setTitle(charSequence);
        componentContainer.setPadding(componentContainer.getPaddingLeft(), i12, componentContainer.getPaddingRight(), componentContainer.getPaddingBottom());
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.files.d
    public final void u(@Y61.l CharSequence charSequence) {
        this.f148779f.q(charSequence);
    }
}
