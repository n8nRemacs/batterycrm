package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.C34429s0;
import com.avito.android.remote.model.User;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001c\u0010\u0004\u001a\u0018\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/voice/N;", "kotlin.jvm.PlatformType", "Lcom/avito/android/remote/model/User;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.J f195093c;

    public X(a0 a0Var, androidx.media3.session.J j12) {
        this.f195092b = a0Var;
        this.f195093c = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        return new C41826q(new C34429s0((N) q12.f406619b, this.f195092b, this.f195093c, (User) q12.f406620c, 4)).l(W.f195091b).r();
    }
}
