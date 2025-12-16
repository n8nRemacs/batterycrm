package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: AndroidCompositionLocals.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f41190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f41191m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Context context, S s5) {
        super(1);
        this.f41190l = context;
        this.f41191m = s5;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        Context context = this.f41190l;
        Context applicationContext = context.getApplicationContext();
        S s5 = this.f41191m;
        applicationContext.registerComponentCallbacks(s5);
        return new P(context, s5);
    }
}
