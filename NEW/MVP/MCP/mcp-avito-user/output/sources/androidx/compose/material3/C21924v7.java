package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: ExposedDropdownMenu.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21924v7 extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f37542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f37543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21924v7(Y41.a aVar, View view) {
        super(1);
        this.f37542l = view;
        this.f37543m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        return new C21880t7(new ViewOnAttachStateChangeListenerC21902u7(this.f37543m, this.f37542l));
    }
}
