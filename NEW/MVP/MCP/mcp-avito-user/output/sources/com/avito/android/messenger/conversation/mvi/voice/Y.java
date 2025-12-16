package com.avito.android.messenger.conversation.mvi.voice;

import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/media3/session/J;", "kotlin.jvm.PlatformType", "mediaController", "Lio/reactivex/rxjava3/core/g;", "apply", "(Landroidx/media3/session/J;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195094b;

    public Y(a0 a0Var) {
        this.f195094b = a0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        androidx.media3.session.J j12 = (androidx.media3.session.J) obj;
        a0 a0Var = this.f195094b;
        a0Var.f195127N = j12;
        j12.F(a0Var.f195142c0);
        a0Var.f195132S.b(a0Var.f195129P.y0(new n0(a0Var)).t0(new o0(a0Var)));
        a0.ke(a0Var, Boolean.valueOf(j12.k()), Integer.valueOf(j12.getPlaybackState()));
        com.jakewharton.rxrelay3.c<N> cVar = a0Var.f195123J.f195086a;
        V v12 = new V(a0Var);
        cVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.Z(new C41936b0(cVar, v12).j0(a0Var.f195122E.e()), new X(a0Var, j12));
    }
}
