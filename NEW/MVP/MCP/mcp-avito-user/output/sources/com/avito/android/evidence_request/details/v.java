package com.avito.android.evidence_request.details;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.evidence_request.details.files.FilesInteractor;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceDetailsViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/v;", "Landroidx/lifecycle/P0$c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f148560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.details.params.a f148561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f148562c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f148563d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final y f148564e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f148565f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FilesInteractor f148566g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f148567h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.details.validation.f f148568i;

    @Inject
    public v(@Y61.k g gVar, @Y61.k y yVar, @Y61.k FilesInteractor filesInteractor, @Y61.k com.avito.android.evidence_request.details.params.a aVar, @Y61.k com.avito.android.evidence_request.details.validation.f fVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k String str, @Y61.k Set set) {
        this.f148560a = gVar;
        this.f148561b = aVar;
        this.f148562c = interfaceC36030r0;
        this.f148563d = set;
        this.f148564e = yVar;
        this.f148565f = interfaceC35741a1;
        this.f148566g = filesInteractor;
        this.f148567h = str;
        this.f148568i = fVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(h.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        InterfaceC35741a1 interfaceC35741a1 = this.f148565f;
        FilesInteractor filesInteractor = this.f148566g;
        return new h(this.f148560a, this.f148564e, filesInteractor, this.f148561b, this.f148568i, interfaceC35741a1, this.f148562c, this.f148567h, this.f148563d);
    }
}
