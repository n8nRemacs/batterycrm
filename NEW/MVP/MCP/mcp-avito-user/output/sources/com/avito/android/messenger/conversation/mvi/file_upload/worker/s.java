package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: FileUploadWorkerInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "currentUserInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f191310c;

    public s(MessengerUserHashInfo messengerUserHashInfo, r rVar) {
        this.f191309b = messengerUserHashInfo;
        this.f191310c = rVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        MessengerUserHashInfo messengerUserHashInfo2 = this.f191309b;
        String str = messengerUserHashInfo2.f430682d;
        String str2 = messengerUserHashInfo.f430682d;
        if (!L.f(str2, str)) {
            StringBuilder sbA = androidx.appcompat.app.r.A("Unauthorized currentUserId = ", str2, ", messageOwnerId = ");
            sbA.append(messengerUserHashInfo2.f430682d);
            return I.l(new b(sbA.toString()));
        }
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        MessengerUserType messengerUserType2 = messengerUserHashInfo2.f430681c;
        if (L.f(messengerUserType, messengerUserType2)) {
            return this.f191310c.f191307c.getConfig();
        }
        return I.l(new b("IllegalUserTypeState: current = " + com.avito.android.messenger.util.i.e(messengerUserType) + ", messageOwner = " + com.avito.android.messenger.util.i.e(messengerUserType2)));
    }
}
