package ru.avito.messenger;

import kotlin.Metadata;

/* compiled from: CloseScreenCommandViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "it", "Lkotlin/G0;", "invoke", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47731c extends kotlin.jvm.internal.N implements Y41.l<MessengerUserHashInfo, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C47733d f430741l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47731c(C47733d c47733d) {
        super(1);
        this.f430741l = c47733d;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(MessengerUserHashInfo messengerUserHashInfo) {
        com.avito.android.util.architecture_components.D<kotlin.G0> d12 = this.f430741l.f430743J;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        d12.postValue(g02);
        return g02;
    }
}
