package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W1 f30156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(W1 w12) {
        super(0);
        this.f30156l = w12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f30156l.onStop();
        return kotlin.G0.f406611a;
    }
}
