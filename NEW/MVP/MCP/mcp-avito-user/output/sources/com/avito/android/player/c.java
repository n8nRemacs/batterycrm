package com.avito.android.player;

import kotlin.Metadata;
import l41.o;

/* compiled from: ExoPlayerController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(J)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f220051b;

    public c(a aVar) {
        this.f220051b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        a aVar = this.f220051b;
        Float fValueOf = aVar.f220033c != null ? Float.valueOf(r0.getCurrentPosition()) : null;
        Float fValueOf2 = aVar.f220033c != null ? Float.valueOf(r5.getDuration()) : null;
        return Float.valueOf((fValueOf == null || fValueOf.floatValue() < 0.0f || fValueOf2 == null || fValueOf2.floatValue() < 0.0f) ? -1.0f : fValueOf.floatValue() / fValueOf2.floatValue());
    }
}
