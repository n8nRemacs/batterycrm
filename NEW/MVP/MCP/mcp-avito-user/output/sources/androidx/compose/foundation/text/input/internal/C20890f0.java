package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.C20893h;
import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.input.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20890f0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20893h.d f31082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f31083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31084n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20890f0(C20893h.d dVar, int i12, int i13) {
        super(1);
        this.f31082l = dVar;
        this.f31083m = i12;
        this.f31084n = i13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.text.input.i iVar) {
        androidx.compose.foundation.text.input.i iVar2 = iVar;
        long jA2 = androidx.compose.ui.text.w0.a(0, iVar2.f30757d.length());
        J j12 = this.f31082l.f31111a;
        long jG2 = j12.f30847a.g(jA2);
        int iG2 = androidx.compose.ui.text.v0.g(jG2);
        int iF2 = androidx.compose.ui.text.v0.f(jG2);
        int i12 = this.f31083m;
        if (i12 >= iG2) {
            iG2 = i12;
        }
        if (iG2 <= iF2) {
            iF2 = iG2;
        }
        int iG3 = androidx.compose.ui.text.v0.g(jG2);
        int iF3 = androidx.compose.ui.text.v0.f(jG2);
        int i13 = this.f31084n;
        if (i13 >= iG3) {
            iG3 = i13;
        }
        if (iG3 <= iF3) {
            iF3 = iG3;
        }
        iVar2.g(j12.f30847a.f(androidx.compose.ui.text.w0.a(iF2, iF3)));
        return kotlin.G0.f406611a;
    }
}
