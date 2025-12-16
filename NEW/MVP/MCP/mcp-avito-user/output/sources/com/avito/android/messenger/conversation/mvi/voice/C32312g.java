package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.messenger.conversation.mvi.voice.r0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/voice/r0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32312g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32306a f195158b;

    public C32312g(C32306a c32306a) {
        this.f195158b = c32306a;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        r0 r0Var = (r0) obj;
        r0.b bVar = r0Var instanceof r0.b ? (r0.b) r0Var : null;
        String str = bVar != null ? bVar.f195199c : null;
        String str2 = bVar != null ? bVar.f195200d : null;
        MessengerUserHashInfo messengerUserHashInfo = bVar != null ? bVar.f195201e : null;
        if (str == null || str2 == null || messengerUserHashInfo == null) {
            return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        C32306a c32306a = this.f195158b;
        return c32306a.f195099L.i(str2, str, messengerUserHashInfo).x0(c32306a.f195097J.a()).N(C32310e.f195152b).z0(1L).d0(C32311f.f195156b);
    }
}
