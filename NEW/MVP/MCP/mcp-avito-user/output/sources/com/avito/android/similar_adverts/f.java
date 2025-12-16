package com.avito.android.similar_adverts;

import com.avito.android.rec.ScreenSource;
import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: SimilarAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/f;", "Lcom/avito/android/similar_adverts/d;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40383a f283926a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f283927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenSource f283928c;

    @Inject
    public f(@Y61.k InterfaceC40383a interfaceC40383a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenSource screenSource) {
        this.f283926a = interfaceC40383a;
        this.f283927b = interfaceC35745a5;
        this.f283928c = screenSource;
    }

    @Override // com.avito.android.similar_adverts.d
    @Y61.k
    public final C41982q1 a(@Y61.k String str) {
        return this.f283926a.c(str, this.f283928c.f251773b, P0.c()).d0(e.f283925b).x0(this.f283927b.a());
    }
}
