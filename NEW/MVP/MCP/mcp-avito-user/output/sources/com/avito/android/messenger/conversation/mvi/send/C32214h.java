package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: OnboardingsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/e$a;", VoiceInfo.STATE, "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/send/e$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32214h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Onboarding f194516b;

    public C32214h(Onboarding onboarding) {
        this.f194516b = onboarding;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(((InterfaceC32208e.a) obj).f194496a.get(this.f194516b) == OnboardingState.f194342b);
    }
}
