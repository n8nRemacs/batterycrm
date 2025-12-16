package androidx.compose.ui.window;

import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDialog.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.window.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22716c extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f43075l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22716c(J j12) {
        super(1);
        this.f43075l = j12;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        J j12 = this.f43075l;
        j12.show();
        return new C22715b(j12);
    }
}
