package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.messenger.deeplink.C;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.o0;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", RequestReviewResultKt.INFO_TYPE, "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197588c;

    public e(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink) {
        this.f197587b = aVar;
        this.f197588c = messengerIcebreakerDialogDeeplink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!o0.b(messengerUserHashInfo)) {
            return I.l(new C.a());
        }
        a aVar = this.f197587b;
        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = this.f197588c;
        I iA2 = aVar.f197562k.a(messengerUserHashInfo, messengerIcebreakerDialogDeeplink.f197547b, (28 & 4) != 0 ? null : messengerIcebreakerDialogDeeplink.f197549d, null, (28 & 16) != 0 ? null : messengerIcebreakerDialogDeeplink.f197550e);
        InterfaceC35745a5 interfaceC35745a5 = aVar.f197565n;
        return iA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).r(new b(messengerUserHashInfo)).n(new d(aVar));
    }
}
