package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.v0;
import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.input.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20882b0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f31051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f31052m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20882b0(int i12, int i13) {
        super(1);
        this.f31051l = i12;
        this.f31052m = i13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.text.input.i iVar) {
        androidx.compose.foundation.text.input.i iVar2 = iVar;
        int i12 = this.f31052m;
        int i13 = this.f31051l;
        if (i13 < 0 || i12 < 0) {
            androidx.compose.foundation.internal.e.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i12 + " respectively.");
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= i13) {
                break;
            }
            int i17 = i16 + 1;
            long j12 = iVar2.f30759f;
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            int i18 = (int) (j12 >> 32);
            if (i18 <= i17) {
                i16 = i18;
                break;
            }
            C0 c02 = iVar2.f30757d;
            i16 = (Character.isHighSurrogate(c02.charAt((i18 - i17) + (-1))) && Character.isLowSurrogate(c02.charAt(((int) (iVar2.f30759f >> 32)) - i17))) ? i16 + 2 : i17;
            i15++;
        }
        int length = 0;
        while (true) {
            if (i14 >= i12) {
                break;
            }
            int i19 = length + 1;
            long j13 = iVar2.f30759f;
            v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
            int i22 = ((int) (j13 & 4294967295L)) + i19;
            C0 c03 = iVar2.f30757d;
            if (i22 >= c03.length()) {
                length = c03.length() - ((int) (iVar2.f30759f & 4294967295L));
                break;
            }
            length = (Character.isHighSurrogate(c03.charAt((((int) (iVar2.f30759f & 4294967295L)) + i19) + (-1))) && Character.isLowSurrogate(c03.charAt(((int) (4294967295L & iVar2.f30759f)) + i19))) ? length + 2 : i19;
            i14++;
        }
        long j14 = iVar2.f30759f;
        v0.a aVar3 = androidx.compose.ui.text.v0.f42734b;
        int i23 = (int) (j14 & 4294967295L);
        C20892g0.a(iVar2, i23, length + i23);
        int i24 = (int) (iVar2.f30759f >> 32);
        C20892g0.a(iVar2, i24 - i16, i24);
        return kotlin.G0.f406611a;
    }
}
