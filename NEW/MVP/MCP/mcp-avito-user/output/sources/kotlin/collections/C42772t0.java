package kotlin.collections;

import kotlin.Metadata;

/* compiled from: _Collections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "it", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42772t0 extends kotlin.jvm.internal.N implements Y41.l<Integer, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f406744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42772t0(int i12) {
        super(1);
        this.f406744l = i12;
    }

    @Override // Y41.l
    public final Object invoke(Integer num) {
        num.intValue();
        throw new IndexOutOfBoundsException(androidx.appcompat.app.r.t(new StringBuilder("Collection doesn't contain element at index "), this.f406744l, '.'));
    }
}
