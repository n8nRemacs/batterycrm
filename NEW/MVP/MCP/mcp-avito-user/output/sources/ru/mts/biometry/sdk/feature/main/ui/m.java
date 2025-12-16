package ru.mts.biometry.sdk.feature.main.ui;

import Au.ViewOnClickListenerC13080b;
import B91.p;
import Ba1.AbstractC13130h;
import Ba1.k;
import C91.a;
import H91.c;
import H91.e;
import H91.f;
import W91.h;
import X91.i;
import X91.j;
import X91.l;
import X91.o;
import X91.x;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23038g0;
import com.avito.android.R;
import g2.d;
import java.util.Collection;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/mts/biometry/sdk/feature/main/ui/m;", "Lru/mts/biometry/sdk/base/b;", "LB91/p;", "<init>", "()V", "ru/mts/biometry/sdk/feature/main/ui/h", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class m extends b<p> {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436474l0 = {m0.f406844a.i(new h0(m.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/main/ui/BiometryIntroViewModel;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    public static final int f436475m0 = c.a(8);

    /* renamed from: h0, reason: collision with root package name */
    public h f436476h0;

    /* renamed from: i0, reason: collision with root package name */
    public final x f436477i0;

    /* renamed from: j0, reason: collision with root package name */
    public final k f436478j0;

    /* renamed from: k0, reason: collision with root package name */
    public final InterfaceC42726C f436479k0;

    public m() {
        super(0);
        this.f436477i0 = new x();
        this.f436478j0 = new k(o.class, new X91.m(this));
        this.f436479k0 = C42727D.c(new X91.k(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final g2.c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_biometry_intro, (ViewGroup) null, false);
        int i12 = R.id.btn_layout;
        LinearLayout linearLayout = (LinearLayout) d.a(viewInflate, R.id.btn_layout);
        if (linearLayout != null) {
            i12 = R.id.rv_steps;
            RecyclerView recyclerView = (RecyclerView) d.a(viewInflate, R.id.rv_steps);
            if (recyclerView != null) {
                i12 = R.id.scroll_layout;
                NestedScrollView nestedScrollView = (NestedScrollView) d.a(viewInflate, R.id.scroll_layout);
                if (nestedScrollView != null) {
                    i12 = R.id.startButton;
                    SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.startButton);
                    if (sdkBioButton != null) {
                        i12 = R.id.toolbar;
                        SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                        if (sdkBioToolbar != null) {
                            i12 = R.id.tv_main_title;
                            if (((TextView) d.a(viewInflate, R.id.tv_main_title)) != null) {
                                return new p((ConstraintLayout) viewInflate, linearLayout, recyclerView, nestedScrollView, sdkBioButton, sdkBioToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(g2.c cVar) {
        p pVar = (p) cVar;
        f.a(this, new l(pVar));
        e.a(this, !f.b(this));
        pVar.f1158f.setOnBackListener(new A91.p(this, 19));
        Ca1.d.a(new ViewOnClickListenerC13080b(21, pVar, this), pVar.f1157e);
        n[] nVarArr = f436474l0;
        n nVar = nVarArr[0];
        k kVar = this.f436478j0;
        ((o) kVar.a(this)).f18747K.observe(getViewLifecycleOwner(), new L91.e(new j(this), 2));
        RecyclerView recyclerView = pVar.f1155c;
        recyclerView.setAdapter(this.f436477i0);
        recyclerView.l(new i(f436475m0), -1);
        n nVar2 = nVarArr[0];
        o oVar = (o) kVar.a(this);
        C23038g0 c23038g0 = oVar.f18747K;
        oVar.f18745E.getClass();
        Collection collection = a.f2016c;
        if (collection == null) {
            collection = C42784z0.f406748b;
        }
        c23038g0.postValue(collection);
        p pVar2 = (p) this.f436376g0;
        if (pVar2 != null) {
            AbstractC13130h.a(pVar2.f1154b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436476h0 = sVar.b();
        super.onAttach(context);
    }
}
