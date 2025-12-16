package com.avito.android.beduin_shared.model.utils;

import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: BeduinContexts.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUi/f;", VoiceInfo.STATE, "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(LUi/f;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f105328b = new c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        P2<BeduinActionsResponse> p22 = ((Ui.f) obj).f16555b;
        if (p22 instanceof P2.a) {
            return new P2.a(((P2.a) p22).f318719a);
        }
        if (p22 instanceof P2.b) {
            return new P2.b(G0.f406611a);
        }
        P2.c cVar = P2.c.f318721a;
        if (L.f(p22, cVar)) {
            return cVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
