package com.avito.android.player;

import com.avito.android.player.ExoPlayerController;
import kotlin.Metadata;

/* compiled from: ExoPlayerController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Lkotlin/G0;", "accept", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f220134b;

    public e(a aVar) {
        this.f220134b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        ExoPlayerController.a aVar = this.f220134b.f220034d;
        if (aVar != null) {
            aVar.UB(fFloatValue);
        }
    }
}
