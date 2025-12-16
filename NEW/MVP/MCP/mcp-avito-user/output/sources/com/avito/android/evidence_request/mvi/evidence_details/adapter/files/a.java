package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FilesItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/a;", "LTV0/b;", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/d;", "Lcom/avito/android/category_parameters/ParameterElement$y;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<d, ParameterElement.y> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f148770a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<e> f148771b;

    /* compiled from: FilesItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.mvi.evidence_details.adapter.files.a$a, reason: collision with other inner class name */
    public static final class C4361a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC30381a f148772l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4361a(InterfaceC30381a interfaceC30381a) {
            super(2);
            this.f148772l = interfaceC30381a;
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view, new i(this.f148772l));
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k InterfaceC30381a interfaceC30381a) {
        this.f148770a = cVar;
        this.f148771b = new g.a<>(R.layout.evidence_files_container, new C4361a(interfaceC30381a));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f148770a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<e> b() {
        return this.f148771b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ParameterElement.y;
    }
}
