package Xy0;

import Xy0.AbstractC17061a;
import Y61.k;
import androidx.fragment.app.FragmentManager;
import com.avito.android.str_insurance.screen.StrInsuranceFragment;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrInsuranceRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXy0/i;", "LXy0/h;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FragmentManager f19178a;

    @Inject
    public i(@k FragmentManager fragmentManager) {
        this.f19178a = fragmentManager;
    }

    @Override // Xy0.h
    public final void a() {
        StrInsuranceFragment.f288620p0.getClass();
        new StrInsuranceFragment().show(this.f19178a, AbstractC17061a.c.f19175e.f19173c);
    }

    @Override // Xy0.h
    public final void b() {
        StrInsuranceFragment.f288620p0.getClass();
        new StrInsuranceFragment().show(this.f19178a, AbstractC17061a.d.f19176e.f19173c);
    }

    @Override // Xy0.h
    public final void c() {
        StrInsuranceFragment.f288620p0.getClass();
        new StrInsuranceFragment().show(this.f19178a, AbstractC17061a.b.f19174e.f19173c);
    }
}
