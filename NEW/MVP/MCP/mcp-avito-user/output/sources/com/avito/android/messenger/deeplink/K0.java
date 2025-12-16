package com.avito.android.messenger.deeplink;

import androidx.view.C23060r0;
import kotlin.Metadata;

/* compiled from: SendMessageByItemDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class K0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0 f195360b;

    public K0(O0 o02) {
        this.f195360b = o02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        O0 o02 = this.f195360b;
        o02.f195391j.g(o02.d(), true);
        C23060r0 c23060r0 = o02.f395446d;
        if (c23060r0 == null) {
            c23060r0 = null;
        }
        c23060r0.e(Boolean.TRUE, "sendingStatus");
    }
}
