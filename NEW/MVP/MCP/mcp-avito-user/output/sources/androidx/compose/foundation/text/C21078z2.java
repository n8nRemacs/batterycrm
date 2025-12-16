package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextFieldPressGestureFilter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21078z2 extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<o.b> f32284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32285m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21078z2(InterfaceC22204y1<o.b> interfaceC22204y1, androidx.compose.foundation.interaction.m mVar) {
        super(1);
        this.f32284l = interfaceC22204y1;
        this.f32285m = mVar;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        return new C21074y2(this.f32284l, this.f32285m);
    }
}
