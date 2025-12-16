package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.U;
import kotlin.Metadata;

/* compiled from: AndroidSelectionHandles.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.selection.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21012g extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draw.i, androidx.compose.ui.draw.p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f32013l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f32014m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f32015n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21012g(long j12, Y41.a<Boolean> aVar, boolean z12) {
        super(1);
        this.f32013l = j12;
        this.f32014m = aVar;
        this.f32015n = z12;
    }

    @Override // Y41.l
    public final androidx.compose.ui.draw.p invoke(androidx.compose.ui.draw.i iVar) {
        androidx.compose.ui.draw.i iVar2 = iVar;
        return iVar2.m(new C21009f(this.f32014m, this.f32015n, C21006e.d(iVar2, Float.intBitsToFloat((int) (iVar2.f39046b.i() >> 32)) / 2.0f), U.a.a(androidx.compose.ui.graphics.U.f39332b, this.f32013l)));
    }
}
