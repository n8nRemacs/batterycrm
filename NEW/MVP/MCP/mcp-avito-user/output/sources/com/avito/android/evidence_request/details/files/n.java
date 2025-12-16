package com.avito.android.evidence_request.details.files;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.evidence_request.details.files.FilesInteractor;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_cache.q;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.K;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.J0;
import io.reactivex.rxjava3.internal.operators.observable.Z;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/files/n;", "Lcom/avito/android/evidence_request/details/files/FilesInteractor;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements FilesInteractor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f148452a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f148453b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b0 f148454c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f148455d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f148456e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final K f148457f;

    /* renamed from: g, reason: collision with root package name */
    public int f148458g;

    public n(@Y61.k String str, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k b0 b0Var, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k K k12) {
        this.f148452a = str;
        this.f148453b = bVar;
        this.f148454c = b0Var;
        this.f148455d = jVar;
        this.f148456e = interfaceC35745a5;
        this.f148457f = k12;
    }

    @Override // com.avito.android.evidence_request.details.files.FilesInteractor
    public final void a(@Y61.k List<? extends Uri> list) {
        for (Uri uri : list) {
            int i12 = this.f148458g;
            this.f148458g = i12 + 1;
            Parcelable.Creator<PhotoSource> creator = PhotoSource.CREATOR;
            this.f148453b.i("evidence files", this.f148452a, null, i12, 2, uri, (384 & 64) != 0 ? null : null, (384 & 512) != 0 ? EnhanceState.f216287c : null);
        }
        b0.a.a(this.f148454c, null, 3);
    }

    @Override // com.avito.android.evidence_request.details.files.FilesInteractor
    @Y61.k
    public final io.reactivex.rxjava3.internal.observers.l b() {
        return new Z(this.f148453b.a(this.f148452a).d0(g.f148444b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).f(2, 1).N(h.f148445b).d0(i.f148446b).U(j.f148447b), new k(this)).v(new com.avito.android.advert_core.task.a(10), l.f148449b);
    }

    @Override // com.avito.android.evidence_request.details.files.FilesInteractor
    @Y61.k
    public final y c(@Y61.k Y41.a aVar, @Y61.k com.avito.android.evidence_request.details.h hVar) {
        I0 i0J0 = this.f148455d.b().j0(this.f148456e.e());
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        return (y) new J0(i0J0, rVar).t0(new m(aVar, hVar));
    }

    @Override // com.avito.android.evidence_request.details.files.FilesInteractor
    @Y61.k
    public final U d() {
        return this.f148455d.b().S().s(this.f148456e.e()).v(new q.a(new FilesInteractor.ValidatorError()));
    }
}
