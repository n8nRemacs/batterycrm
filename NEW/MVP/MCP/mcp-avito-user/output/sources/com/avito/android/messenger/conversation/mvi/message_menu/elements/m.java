package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.d0;
import kotlin.Metadata;

/* compiled from: RetrySendingMessageElementProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f191719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.message_menu.h f191720c;

    public m(com.avito.android.messenger.conversation.mvi.message_menu.h hVar, j jVar) {
        this.f191719b = jVar;
        this.f191720c = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC28373a interfaceC28373a = this.f191719b.f191710c;
        com.avito.android.messenger.conversation.mvi.message_menu.h hVar = this.f191720c;
        interfaceC28373a.c(new d0.a(hVar.f191747b, hVar.f191753h, hVar.f191748c, false));
    }
}
