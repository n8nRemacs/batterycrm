package com.avito.android.util;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypedResults.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.util.a6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35746a6<T, R> implements l41.o {
    static {
        new C35746a6();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (p22 instanceof P2.c) {
            return io.reactivex.rxjava3.internal.operators.observable.H0.f403644b;
        }
        if (p22 instanceof P2.b) {
            return io.reactivex.rxjava3.core.z.c0(((P2.b) p22).f318720a);
        }
        if (p22 instanceof P2.a) {
            return io.reactivex.rxjava3.core.z.M(C35936s.a(((P2.a) p22).f318719a, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
