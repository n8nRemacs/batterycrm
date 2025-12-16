package com.avito.android.messenger.conversation.mvi.message_menu;

import com.avito.android.messenger.conversation.mvi.message_menu.m;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MessageMenuPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "LY81/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/m$e;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f191800b;

    public p(m mVar) {
        this.f191800b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        Y81.a aVar = (Y81.a) q12.f406619b;
        m.e eVar = (m.e) q12.f406620c;
        this.f191800b.le().s(new m.b(aVar, eVar.f191792a, eVar.f191793b));
    }
}
