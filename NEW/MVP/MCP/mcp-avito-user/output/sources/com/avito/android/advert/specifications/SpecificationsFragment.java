package com.avito.android.advert.specifications;

import U9.g;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.advert.specifications.di.b;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.ModelSpecifications;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SpecificationsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/specifications/SpecificationsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpecificationsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public d f80982n0;

    /* compiled from: SpecificationsFragment.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/specifications/SpecificationsFragment$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SpecificationsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ActivityC22955m activityC22955mL1 = SpecificationsFragment.this.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SpecificationsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ActivityC22955m activityC22955mL1 = SpecificationsFragment.this.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.onBackPressed();
            }
            return G0.f406611a;
        }
    }

    public SpecificationsFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_specifications, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        d dVar = this.f80982n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e0();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        g gVar = new g(new c(), view);
        d dVar = this.f80982n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(gVar, new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        if (getContext() == null) {
            throw new IllegalArgumentException("context is null");
        }
        Bundle arguments = getArguments();
        ModelSpecifications modelSpecifications = arguments != null ? (ModelSpecifications) arguments.getParcelable("specifications") : null;
        b.a aVarA = com.avito.android.advert.specifications.di.a.a();
        aVarA.a(modelSpecifications);
        aVarA.b((com.avito.android.advert.specifications.di.c) C29972i.a(C29972i.b(this), com.avito.android.advert.specifications.di.c.class));
        aVarA.build().a(this);
    }
}
