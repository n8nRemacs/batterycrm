package androidx.compose.material.internal;

import androidx.compose.material.Z3;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class f extends N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f33667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z3 f33668m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, Z3 z32) {
        super(1);
        this.f33667l = sVar;
        this.f33668m = z32;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        Z3 z32 = this.f33668m;
        s sVar = this.f33667l;
        sVar.f33692m = z32;
        sVar.k();
        return new e();
    }
}
