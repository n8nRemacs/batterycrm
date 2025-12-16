package com.avito.android.advertising.ui.buzzoola;

import com.google.android.exoplayer2.d0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: CommercialVideoViewHolderImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lkotlin/Q;", "", "apply", "(J)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f88624b;

    public o(m mVar) {
        this.f88624b = mVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        m mVar = this.f88624b;
        d0 player = mVar.f88611m.getPlayer();
        long currentPosition = player != null ? player.getCurrentPosition() : 0L;
        float duration = mVar.f88611m.getPlayer() != null ? r8.getDuration() : 0.0f;
        return (currentPosition < 0 || duration < 0.0f) ? new Q(Float.valueOf(-1.0f), 0L) : new Q(Float.valueOf(currentPosition / duration), Long.valueOf(currentPosition));
    }
}
