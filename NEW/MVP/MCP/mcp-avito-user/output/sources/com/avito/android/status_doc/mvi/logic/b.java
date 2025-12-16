package com.avito.android.status_doc.mvi.logic;

import Ax0.C13100d;
import Ax0.InterfaceC13098b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.status_doc.mvi.entities.GigStatusDocInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigStatusDocActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/status_doc/mvi/logic/b;", "Lcom/avito/android/arch/mvi/a;", "LAx0/b;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "LAx0/d;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13098b, GigStatusDocInternalAction, C13100d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.status_doc.mvi.interactor.a f284935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f284936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f284937c;

    @Inject
    public b(@Y61.k com.avito.android.status_doc.mvi.interactor.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f284935a = aVar;
        this.f284936b = interfaceC28373a;
        this.f284937c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<GigStatusDocInternalAction> b(InterfaceC13098b interfaceC13098b, C13100d c13100d) {
        return C43175k.G(new a(interfaceC13098b, this, null));
    }
}
