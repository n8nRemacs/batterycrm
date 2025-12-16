package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserReviewsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/u;", "Lcom/avito/android/rating/details/interactor/s;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f247167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f247168b;

    @Inject
    public u(@Y61.k InterfaceC14487a interfaceC14487a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f247167a = interfaceC14487a;
        this.f247168b = interfaceC35745a5;
    }

    @Override // com.avito.android.rating.details.interactor.s
    @Y61.k
    public final B0 a(@Y61.k String str) {
        return this.f247167a.a(str).x0(this.f247168b.a()).d0(t.f247166b);
    }
}
