package ru.mts.biometry.sdk.feature.main.ui;

import A91.p;
import Ba1.k;
import H91.e;
import H91.f;
import H91.g;
import X91.q;
import X91.s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.C22981N;
import com.avito.android.R;
import g2.c;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/main/ui/r;", "Lru/mts/biometry/sdk/base/b;", "LB91/r;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class r extends b<B91.r> {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436480i0 = {m0.f406844a.i(new h0(r.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/main/ui/BiometryViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final k f436481h0;

    public r() {
        super(0);
        this.f436481h0 = new k(s.class, new q(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_biometry_load, (ViewGroup) null, false);
        int i12 = R.id.progress;
        if (((ProgressBar) d.a(viewInflate, R.id.progress)) != null) {
            i12 = R.id.toolbar;
            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
            if (sdkBioToolbar != null) {
                return new B91.r((ConstraintLayout) viewInflate, sdkBioToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        SdkBioToolbar sdkBioToolbar;
        B91.r rVar = (B91.r) this.f436376g0;
        if (rVar == null || (sdkBioToolbar = rVar.f1162b) == null) {
            return;
        }
        g.a(i12, 0, 13, sdkBioToolbar);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        ((B91.r) cVar).f1162b.setOnCloseListener(new p(this, 20));
        e.a(this, !f.b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C43259k.d(C22981N.a(getLifecycle()), C43262l0.f411947c, null, new X91.p(this, null), 2);
    }
}
