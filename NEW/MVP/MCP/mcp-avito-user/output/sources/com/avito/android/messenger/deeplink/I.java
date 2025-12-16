package com.avito.android.messenger.deeplink;

import com.avito.android.messenger.deeplink.C;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", RequestReviewResultKt.INFO_TYPE, "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f195344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f195346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f195347e;

    public I(C c12, String str, String str2, String str3) {
        this.f195344b = c12;
        this.f195345c = str;
        this.f195346d = str2;
        this.f195347e = str3;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (!ru.avito.messenger.o0.b(messengerUserHashInfo)) {
            return io.reactivex.rxjava3.core.I.l(new C.a());
        }
        return this.f195344b.f195298j.a(messengerUserHashInfo, this.f195345c, (28 & 4) != 0 ? null : this.f195346d, null, (28 & 16) != 0 ? null : this.f195347e).r(new H(messengerUserHashInfo));
    }
}
