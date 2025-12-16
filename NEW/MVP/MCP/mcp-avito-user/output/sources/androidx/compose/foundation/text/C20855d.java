package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21006e;
import androidx.compose.ui.graphics.U;
import kotlin.Metadata;

/* compiled from: AndroidCursorHandle.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20855d extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draw.i, androidx.compose.ui.draw.p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f30673l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20855d(long j12) {
        super(1);
        this.f30673l = j12;
    }

    @Override // Y41.l
    public final androidx.compose.ui.draw.p invoke(androidx.compose.ui.draw.i iVar) {
        androidx.compose.ui.draw.i iVar2 = iVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (iVar2.f39046b.i() >> 32)) / 2.0f;
        return iVar2.m(new C20851c(fIntBitsToFloat, C21006e.d(iVar2, fIntBitsToFloat), U.a.a(androidx.compose.ui.graphics.U.f39332b, this.f30673l)));
    }
}
