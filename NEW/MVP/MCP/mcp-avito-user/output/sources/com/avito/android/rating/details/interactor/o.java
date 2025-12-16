package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: RatingDetailsNetworkRequestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/o;", "Lcom/avito/android/rating/details/interactor/m;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f247141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f247142b;

    @Inject
    public o(@Y61.k InterfaceC14487a interfaceC14487a, @Y61.k R0 r02) {
        this.f247141a = interfaceC14487a;
        this.f247142b = r02;
    }

    @Override // com.avito.android.rating.details.interactor.m
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str2, @Y61.k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f247142b.a(), new n(this, str, num, num2, num3, str2, null), continuationImpl);
    }
}
