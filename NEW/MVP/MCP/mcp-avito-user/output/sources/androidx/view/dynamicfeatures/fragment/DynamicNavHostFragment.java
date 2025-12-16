package androidx.view.dynamicfeatures.fragment;

import Y61.k;
import androidx.view.C23278A0;
import androidx.view.C23303N0;
import androidx.view.C23317W;
import androidx.view.C23404y0;
import androidx.view.dynamicfeatures.f;
import androidx.view.dynamicfeatures.fragment.a;
import androidx.view.dynamicfeatures.fragment.ui.DefaultProgressFragment;
import androidx.view.dynamicfeatures.g;
import androidx.view.dynamicfeatures.j;
import androidx.view.fragment.NavHostFragment;
import com.avito.android.R;
import com.google.android.play.core.splitinstall.C37202d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicNavHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/DynamicNavHostFragment;", "Landroidx/navigation/fragment/NavHostFragment;", "<init>", "()V", "a", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DynamicNavHostFragment extends NavHostFragment {

    /* compiled from: DynamicNavHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/DynamicNavHostFragment$a;", "", "<init>", "()V", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DynamicNavHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/W;", "invoke", "()Landroidx/navigation/W;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<C23317W> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.view.dynamicfeatures.fragment.a f53057l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.view.dynamicfeatures.fragment.a aVar) {
            super(0);
            this.f53057l = aVar;
        }

        @Override // Y41.a
        public final C23317W invoke() {
            androidx.view.dynamicfeatures.fragment.a aVar = this.f53057l;
            aVar.getClass();
            a.C1871a c1871a = new a.C1871a(aVar);
            c1871a.f53146l = DefaultProgressFragment.class.getName();
            c1871a.s(R.id.dfn_progress_fragment);
            return c1871a;
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.view.fragment.NavHostFragment
    public final void c5(@k C23404y0 c23404y0) {
        super.c5(c23404y0);
        j jVar = new j(requireContext(), C37202d.a(requireContext()));
        C23303N0 c23303n0 = c23404y0.f53227w;
        c23303n0.a(new androidx.view.dynamicfeatures.b(requireActivity(), jVar));
        androidx.view.dynamicfeatures.fragment.a aVar = new androidx.view.dynamicfeatures.fragment.a(requireContext(), getChildFragmentManager(), getId(), jVar);
        c23303n0.a(aVar);
        f fVar = new f(c23303n0, jVar);
        fVar.f53050f = new b(aVar);
        c23303n0.a(fVar);
        c23303n0.a(new g(requireContext(), c23303n0, (C23278A0) c23404y0.f53202D.getValue(), jVar));
    }
}
