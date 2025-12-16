package com.avito.android.upload_doc.mvi.logic;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.remote.H;
import com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigUploadDocActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/upload_doc/mvi/logic/b;", "Lcom/avito/android/arch/mvi/a;", "LOG0/a;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "LOG0/d;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.arch.mvi.a<OG0.a, GigUploadDocInternalAction, OG0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.upload_doc.mvi.interactor.a f306943a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigUploadDocDeeplink.FlowType f306944b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f306945c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f306946d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f306947e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f306948f;

    @Inject
    public b(@Y61.k com.avito.android.upload_doc.mvi.interactor.a aVar, @Y61.k GigUploadDocDeeplink.FlowType flowType, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k H h12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f306943a = aVar;
        this.f306944b = flowType;
        this.f306945c = interfaceC28373a;
        this.f306946d = e12;
        this.f306947e = h12;
        this.f306948f = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<GigUploadDocInternalAction> b(OG0.a aVar, OG0.d dVar) {
        return C43175k.G(new a(aVar, this, dVar, null));
    }
}
