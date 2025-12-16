package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes.dex */
public final class W0 extends kotlin.jvm.internal.N implements Y41.l<Long, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f38161l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public W0(Y41.l<? super Long, Object> lVar) {
        super(1);
        this.f38161l = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Object invoke(Long l12) {
        return this.f38161l.invoke(Long.valueOf(l12.longValue() / 1000000));
    }
}
