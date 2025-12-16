package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f188353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f188355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f188356e;

    public J0(U0 u02, MessengerUserHashInfo messengerUserHashInfo, String str, long j12) {
        this.f188353b = u02;
        this.f188354c = messengerUserHashInfo;
        this.f188355d = str;
        this.f188356e = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        U0 u02 = this.f188353b;
        InterfaceC32024m interfaceC32024m = u02.f188393a;
        MessengerUserHashInfo messengerUserHashInfo = this.f188354c;
        return interfaceC32024m.h0(this.f188356e, this.f188355d, messengerUserHashInfo).x(u02.f188396d.a());
    }
}
