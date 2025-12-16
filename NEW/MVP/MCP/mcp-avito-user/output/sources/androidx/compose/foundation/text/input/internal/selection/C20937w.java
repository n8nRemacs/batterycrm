package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "change", "Ll0/g;", "dragAmount", "Lkotlin/G0;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20937w extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.input.pointer.C, l0.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.g f31432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31433m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.g f31434n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20937w(TextFieldSelectionState textFieldSelectionState, l0.g gVar, l0.g gVar2) {
        super(2);
        this.f31432l = gVar;
        this.f31433m = textFieldSelectionState;
        this.f31434n = gVar2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.ui.input.pointer.C c12, l0.g gVar) {
        long j12 = gVar.f413387a;
        l0.g gVar2 = this.f31432l;
        long j13 = l0.g.j(gVar2.f406841b, j12);
        gVar2.f406841b = j13;
        Handle handle = Handle.f30328b;
        long j14 = l0.g.j(this.f31434n.f406841b, j13);
        TextFieldSelectionState textFieldSelectionState = this.f31433m;
        textFieldSelectionState.y(handle, j14);
        textFieldSelectionState.n();
        textFieldSelectionState.getClass();
        throw null;
    }
}
