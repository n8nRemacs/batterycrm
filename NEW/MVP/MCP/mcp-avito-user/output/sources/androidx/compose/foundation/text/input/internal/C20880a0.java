package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.v0;
import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.input.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20880a0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f31030l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f31031m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20880a0(int i12, int i13) {
        super(1);
        this.f31030l = i12;
        this.f31031m = i13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.text.input.i iVar) {
        androidx.compose.foundation.text.input.i iVar2 = iVar;
        int i12 = this.f31031m;
        int i13 = this.f31030l;
        if (i13 < 0 || i12 < 0) {
            androidx.compose.foundation.internal.e.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i12 + " respectively.");
        }
        long j12 = iVar2.f30759f;
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        int i14 = (int) (j12 & 4294967295L);
        int length = i14 + i12;
        int i15 = (i12 ^ length) & (i14 ^ length);
        C0 c02 = iVar2.f30757d;
        if (i15 < 0) {
            length = c02.length();
        }
        C20892g0.a(iVar2, (int) (4294967295L & iVar2.f30759f), Math.min(length, c02.length()));
        int i16 = (int) (iVar2.f30759f >> 32);
        int i17 = i16 - i13;
        if (((i13 ^ i16) & (i16 ^ i17)) < 0) {
            i17 = 0;
        }
        C20892g0.a(iVar2, Math.max(0, i17), (int) (iVar2.f30759f >> 32));
        return kotlin.G0.f406611a;
    }
}
