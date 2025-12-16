package shark.internal;

import kotlin.Metadata;

/* compiled from: SortedBytesMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "keyIndex", "Lshark/internal/hppc/f;", "Lshark/internal/t;", "invoke", "(I)Lshark/internal/hppc/f;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class G0 extends kotlin.jvm.internal.N implements Y41.l<Integer, shark.internal.hppc.f<? extends C48296t>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H0 f438352l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(H0 h02) {
        super(1);
        this.f438352l = h02;
    }

    @Override // Y41.l
    public final shark.internal.hppc.f<? extends C48296t> invoke(Integer num) {
        int iIntValue = num.intValue();
        H0 h02 = this.f438352l;
        int i12 = h02.f438357b;
        int i13 = (iIntValue * i12) + h02.f438356a;
        int i14 = iIntValue * i12;
        byte[] bArr = h02.f438361f;
        boolean z12 = h02.f438359d;
        return new shark.internal.hppc.f<>(z12 ? C48297u.b(i14, bArr) : C48297u.a(i14, bArr), new C48296t(bArr, i13, h02.f438360e, z12));
    }
}
