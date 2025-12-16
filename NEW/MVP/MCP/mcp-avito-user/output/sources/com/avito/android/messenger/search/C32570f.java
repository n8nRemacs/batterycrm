package com.avito.android.messenger.search;

import com.avito.android.messenger.search.h;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.search.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32570f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197141b;

    public C32570f(h hVar) {
        this.f197141b = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        h hVar = this.f197141b;
        hVar.le().s(new h.e(hVar, (MessengerUserHashInfo) obj));
    }
}
