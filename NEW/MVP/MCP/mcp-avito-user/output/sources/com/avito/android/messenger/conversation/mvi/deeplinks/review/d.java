package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import Mg0.InterfaceC14487a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.deeplinks.review.b;
import io.reactivex.rxjava3.internal.operators.observable.O;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RequestReviewInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/d;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/review/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14487a f190653a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<b.a> f190654b = com.jakewharton.rxrelay3.b.N0(b.a.C5638a.f190649a);

    @Inject
    public d(@k InterfaceC14487a interfaceC14487a) {
        this.f190653a = interfaceC14487a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.review.b
    @k
    public final O d(@k String str) {
        return this.f190653a.d(str).K(new c(this));
    }
}
