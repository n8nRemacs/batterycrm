package androidx.view.fragment;

import Y41.l;
import androidx.fragment.app.Fragment;
import androidx.view.C23395u;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.fragment.i;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FragmentNavigator.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/P;", "kotlin.jvm.PlatformType", SearchParamsConverterKt.OWNER, "Lkotlin/G0;", "invoke", "(Landroidx/lifecycle/P;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class k extends N implements l<InterfaceC22983P, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f53156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Fragment f53157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C23395u f53158n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, Fragment fragment, C23395u c23395u) {
        super(1);
        this.f53156l = iVar;
        this.f53157m = fragment;
        this.f53158n = c23395u;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22983P interfaceC22983P) {
        InterfaceC22983P interfaceC22983P2 = interfaceC22983P;
        i iVar = this.f53156l;
        ArrayList arrayList = iVar.f53142g;
        Fragment fragment = this.f53157m;
        boolean z12 = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (L.f(((Q) it.next()).f406619b, fragment.getTag())) {
                    z12 = true;
                    break;
                }
            }
        }
        if (interfaceC22983P2 != null && !z12) {
            Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.getF46705d().a(Lifecycle.State.f46681d)) {
                lifecycle.a((InterfaceC22982O) ((i.g) iVar.f53144i).invoke(this.f53158n));
            }
        }
        return G0.f406611a;
    }
}
