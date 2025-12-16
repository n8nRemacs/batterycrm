package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: ChunkedVideoUploadWorkerInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "currentUserInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/a0;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f194982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f194983c;

    public y(AbstractC32094s0.b bVar, x xVar) {
        this.f194982b = bVar;
        this.f194983c = xVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        MessengerUserHashInfo messengerUserHashInfo2 = this.f194982b.f191222b;
        String str = messengerUserHashInfo2.f430682d;
        String str2 = messengerUserHashInfo.f430682d;
        if (!L.f(str2, str)) {
            StringBuilder sbA = androidx.appcompat.app.r.A("Unauthorized currentUserId = ", str2, ", messageOwnerId = ");
            sbA.append(messengerUserHashInfo2.f430682d);
            return I.l(new C32302a(sbA.toString()));
        }
        MessengerUserType messengerUserType = messengerUserHashInfo2.f430681c;
        MessengerUserType messengerUserType2 = messengerUserHashInfo.f430681c;
        if (L.f(messengerUserType2, messengerUserType)) {
            return this.f194983c.f194980c.getConfig();
        }
        return I.l(new C32302a("IllegalUserTypeState: currentUserType = " + com.avito.android.messenger.util.i.e(messengerUserType2) + ", messageOwnerType = " + messengerUserHashInfo2.f430681c));
    }
}
