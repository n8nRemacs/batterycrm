package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_cache.q;
import com.avito.android.photo_picker.b0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: FilesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/J;", "Lcom/avito/android/evidence_request/mvi/domain/evidence_details/FilesInteractor;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class J implements FilesInteractor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AppealId f148668a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.K f148669b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f148670c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b0 f148671d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f148672e;

    /* renamed from: f, reason: collision with root package name */
    public int f148673f;

    @Inject
    public J(@Y61.k AppealId appealId, @Y61.k com.avito.android.remote.K k12, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k b0 b0Var, @Y61.k com.avito.android.photo_cache.j jVar) {
        this.f148668a = appealId;
        this.f148669b = k12;
        this.f148670c = bVar;
        this.f148671d = b0Var;
        this.f148672e = jVar;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor
    public final void a(@Y61.k List<? extends Uri> list) {
        for (Uri uri : list) {
            String str = this.f148668a.f148723b;
            int i12 = this.f148673f;
            this.f148673f = i12 + 1;
            Parcelable.Creator<PhotoSource> creator = PhotoSource.CREATOR;
            this.f148670c.i("evidence files", str, null, i12, 2, uri, (384 & 64) != 0 ? null : null, (384 & 512) != 0 ? EnhanceState.f216287c : null);
        }
        b0.a.a(this.f148671d, null, 3);
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor
    @Y61.k
    public final C43197r1 b() {
        return new C43197r1(new I(this, null), kotlinx.coroutines.rx3.y.a(this.f148670c.a(this.f148668a.f148723b).d0(E.f148658b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).f(2, 1).N(F.f148662b).d0(G.f148663b).U(H.f148664b)));
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor
    @Y61.k
    public final InterfaceC43160i<com.avito.android.photo_cache.q> c() {
        return kotlinx.coroutines.rx3.y.a(this.f148672e.b());
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor
    @Y61.l
    public final Object d(@Y61.k Continuation<? super com.avito.android.photo_cache.q> continuation) {
        return C43292o.d(this.f148672e.b(), new q.a(new FilesInteractor.ValidatorError()), continuation);
    }
}
