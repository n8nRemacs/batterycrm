package com.avito.android.util.rx3;

import kotlin.Metadata;

/* compiled from: RetryWhen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "n", "", "apply", "(I)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class G0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f318999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f319000c;

    public G0(double d12, long j12) {
        this.f318999b = d12;
        this.f319000c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return Long.valueOf(Math.round(Math.pow(this.f318999b, ((Number) obj).intValue() - 1) * this.f319000c));
    }
}
