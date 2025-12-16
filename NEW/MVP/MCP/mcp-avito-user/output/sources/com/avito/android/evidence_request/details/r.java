package com.avito.android.evidence_request.details;

import com.avito.android.photo_cache.q;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EvidenceDetailsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "filesState", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/photo_cache/q;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<AbstractC41768a> f148555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f148556c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Y41.a<? extends AbstractC41768a> aVar, h hVar) {
        this.f148555b = aVar;
        this.f148556c = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.photo_cache.q qVar = (com.avito.android.photo_cache.q) obj;
        return qVar instanceof q.c ? (InterfaceC41774g) ((j) this.f148555b).invoke() : new C41826q(new GL.a(10, this.f148556c, qVar));
    }
}
