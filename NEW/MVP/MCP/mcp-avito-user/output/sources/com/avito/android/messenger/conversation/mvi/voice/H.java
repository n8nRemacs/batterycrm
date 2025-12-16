package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.messenger.conversation.mvi.voice.E;
import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: VoiceMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f195064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E.d f195065c;

    public H(E e12, E.d dVar) {
        this.f195064b = e12;
        this.f195065c = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        X2 x22 = X2.f318778a;
        E e12 = this.f195064b;
        String str = e12.f207131E;
        StringBuilder sb2 = new StringBuilder("VoiceMessageCancelClicked: messageEraser.deleteLocalMessage() failed - userId = ");
        E.d dVar = this.f195065c;
        sb2.append(dVar.f195053d.getUserId());
        sb2.append(", channelId = ");
        sb2.append(e12.f195039V);
        sb2.append(", localId = ");
        sb2.append(dVar.f195053d.getLocalId());
        x22.a(str, sb2.toString(), (Throwable) obj);
    }
}
