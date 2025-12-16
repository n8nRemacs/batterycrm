package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadException;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: FileDownloadWorkerDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "currentUserInfo", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f190771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f190774f;

    public B(x xVar, Integer num, String str, String str2, MessengerUserHashInfo messengerUserHashInfo) {
        this.f190770b = messengerUserHashInfo;
        this.f190771c = xVar;
        this.f190772d = str;
        this.f190773e = str2;
        this.f190774f = num;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        MessengerUserHashInfo messengerUserHashInfo2 = this.f190770b;
        String str = messengerUserHashInfo.f430682d;
        String str2 = messengerUserHashInfo2.f430682d;
        if (!kotlin.jvm.internal.L.f(str, str2)) {
            return AbstractC41768a.o(new FileDownloadException.Unauthorized(str, str2));
        }
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        MessengerUserType messengerUserType2 = messengerUserHashInfo2.f430681c;
        if (!kotlin.jvm.internal.L.f(messengerUserType, messengerUserType2)) {
            return AbstractC41768a.o(new FileDownloadException.IllegalUserTypeState(com.avito.android.messenger.util.i.e(messengerUserType), com.avito.android.messenger.util.i.e(messengerUserType2)));
        }
        InterfaceC32024m interfaceC32024m = this.f190771c.f190961b;
        String str3 = this.f190772d;
        String str4 = this.f190773e;
        return interfaceC32024m.M(str3, str4, messengerUserHashInfo2).o(new z(this.f190771c, this.f190774f, str3, str4, messengerUserHashInfo2));
    }
}
