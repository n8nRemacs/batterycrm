package com.avito.android.messenger_icebreakers_dialog.deeplink;

import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197605e;

    public k(a aVar, String str, String str2, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink) {
        this.f197602b = aVar;
        this.f197603c = str;
        this.f197604d = str2;
        this.f197605e = messengerIcebreakerDialogDeeplink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        a aVar = this.f197602b;
        return aVar.f197562k.f(messengerUserHashInfo, this.f197603c, aVar.f197564m.a(), C43066x.A0(this.f197604d).toString(), null, null, null, this.f197605e.f197550e, null);
    }
}
