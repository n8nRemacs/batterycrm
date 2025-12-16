package com.avito.android.ux.feedback.impl;

import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41953h;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AvitoUxFeedbackRxDelegate.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ux/feedback/impl/j;", "Lcom/avito/android/ux/feedback/impl/f;", "LSK0/b;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements f, SK0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SK0.b f319158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f319159b;

    @Inject
    public j(@Y61.k SK0.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f319158a = bVar;
        this.f319159b = interfaceC35745a5;
    }

    @Override // SK0.b
    public final void a(@Y61.k SK0.c cVar, @Y61.l SK0.a aVar, @Y61.l SK0.f fVar, @Y61.l SK0.d dVar) {
        this.f319158a.a(cVar, aVar, fVar, dVar);
    }

    @Override // com.avito.android.ux.feedback.impl.f
    @Y61.k
    public final C41981q0 b(@Y61.k SK0.c cVar) {
        io.reactivex.rxjava3.subjects.b bVarN0 = io.reactivex.rxjava3.subjects.b.N0();
        List listU = C42745f0.U(bVarN0, z.F0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(new i(cVar)));
        Objects.requireNonNull(listU, "sources is null");
        return new C41981q0(new C41953h(null, listU).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new h(this, cVar, bVarN0)).j0(this.f319159b.e()));
    }
}
