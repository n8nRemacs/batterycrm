package com.avito.android.evidence_request.details.files.view;

import Rz.InterfaceC15097a;
import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.evidence_request.details.files.o;
import com.avito.android.evidence_request.details.files.p;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FilesItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/files/view/a;", "LTV0/b;", "Lcom/avito/android/evidence_request/details/files/o;", "Lcom/avito/android/category_parameters/ParameterElement$y;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<o, ParameterElement.y> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f148466a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f148467b;

    /* compiled from: FilesItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/evidence_request/details/files/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/evidence_request/details/files/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.details.files.view.a$a, reason: collision with other inner class name */
    public static final class C4348a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15097a f148468l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4348a(InterfaceC15097a interfaceC15097a) {
            super(2);
            this.f148468l = interfaceC15097a;
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view, new g(this.f148468l));
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k InterfaceC15097a interfaceC15097a) {
        this.f148466a = cVar;
        this.f148467b = new g.a<>(R.layout.evidence_files_container, new C4348a(interfaceC15097a));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f148466a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f148467b;
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
