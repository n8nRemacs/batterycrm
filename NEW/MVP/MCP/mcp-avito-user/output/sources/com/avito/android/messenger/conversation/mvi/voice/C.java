package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.messenger.conversation.mvi.voice.A;
import com.avito.android.messenger.conversation.mvi.voice.N;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.TransferStatus;
import kotlin.Metadata;

/* compiled from: VoiceMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/Q1;", "metaInfo", "Lkotlin/G0;", "accept", "(Lcom/avito/android/persistence/messenger/Q1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f195036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.a.C5762a f195037c;

    public C(E e12, A.a.C5762a c5762a) {
        this.f195036b = e12;
        this.f195037c = c5762a;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Q1 q12 = (Q1) obj;
        if (q12.f215288g != TransferStatus.SUCCESS || q12.f215285d == null) {
            return;
        }
        this.f195036b.f195046c0.f195086a.accept(new N.a(this.f195037c.f195032a, q12));
    }
}
