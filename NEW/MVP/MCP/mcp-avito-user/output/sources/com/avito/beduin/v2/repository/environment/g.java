package com.avito.beduin.v2.repository.environment;

import Y41.p;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.InterfaceC23040h0;
import androidx.view.n;
import java.util.LinkedHashSet;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: AndroidEnvironmentClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/g;", "Lcom/avito/beduin/v2/repository/environment/i;", "environment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class g implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Context f338227b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public FV0.a f338228c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z1<C22771k> f338229d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z1<Configuration> f338230e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C1 f338231f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f338232g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final f f338233h;

    /* compiled from: AndroidEnvironmentClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f338234b;

        public a(Y41.l lVar) {
            this.f338234b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f338234b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f338234b;
        }

        public final int hashCode() {
            return this.f338234b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f338234b.invoke(obj);
        }
    }

    public g(@Y61.k Context context) {
        this.f338227b = context instanceof Application ? context : context.getApplicationContext();
        Z1<C22771k> z1A = p2.a(null);
        this.f338229d = z1A;
        Z1<Configuration> z1A2 = p2.a(null);
        this.f338230e = z1A2;
        this.f338231f = new C1(new C43189o1(z1A2), new C43189o1(z1A), new d(this, null));
        this.f338232g = new LinkedHashSet();
        this.f338233h = new f(this);
    }

    @Override // FV0.h
    public final void P() {
        n nVarRequireActivity;
        FV0.a aVar = this.f338228c;
        if (aVar != null) {
            if (aVar instanceof FV0.b) {
                nVarRequireActivity = ((FV0.b) aVar).N3();
            } else {
                if (!(aVar instanceof FV0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVarRequireActivity = ((FV0.c) aVar).j1().requireActivity();
            }
            nVarRequireActivity.unregisterComponentCallbacks(this.f338233h);
        }
        this.f338228c = null;
        this.f338229d.setValue(null);
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f338228c = aVar;
        boolean z12 = aVar instanceof FV0.c;
        f fVar = this.f338233h;
        if (z12) {
            Fragment fragmentJ1 = ((FV0.c) aVar).j1();
            fragmentJ1.getViewLifecycleOwnerLiveData().observe(fragmentJ1, new a(new b(new c(fragmentJ1, this))));
            C43259k.d(C22981N.a(fragmentJ1.getLifecycle()), null, null, new e(fragmentJ1, this, null), 3);
            ActivityC22955m activityC22955mRequireActivity = fragmentJ1.requireActivity();
            activityC22955mRequireActivity.registerComponentCallbacks(fVar);
            fVar.onConfigurationChanged(activityC22955mRequireActivity.getResources().getConfiguration());
            return;
        }
        if (aVar instanceof FV0.b) {
            n nVarN3 = ((FV0.b) aVar).N3();
            Window window = nVarN3.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                b(viewGroup, nVarN3, com.avito.beduin.v2.repository.environment.a.f338208l);
            }
            C43259k.d(C22981N.a(nVarN3.getLifecycle()), null, null, new e(nVarN3, this, null), 3);
            nVarN3.registerComponentCallbacks(fVar);
            fVar.onConfigurationChanged(nVarN3.getResources().getConfiguration());
        }
    }

    public final void b(ViewGroup viewGroup, Context context, p<? super View, ? super J0, ? extends J0> pVar) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        frameLayout.setVisibility(4);
        C22823h0.K(frameLayout, new com.avito.android.gig_shift_action.ui.a(pVar, this));
        viewGroup.addView(frameLayout);
    }

    @Override // com.avito.beduin.v2.repository.environment.i
    @Y61.k
    public final com.avito.android.gig_shift_action.ui.a c(@Y61.k Y41.l lVar) {
        this.f338232g.add(lVar);
        lVar.invoke(e());
        return new com.avito.android.gig_shift_action.ui.a(13, this, lVar);
    }

    @Override // com.avito.beduin.v2.repository.environment.i
    @Y61.k
    public final h e() {
        Configuration value = this.f338230e.getValue();
        if (value == null) {
            value = this.f338227b.getResources().getConfiguration();
        }
        C22771k value2 = this.f338229d.getValue();
        if (value2 == null) {
            value2 = C22771k.f44774e;
        }
        return k(value, value2);
    }

    public final h k(Configuration configuration, C22771k c22771k) {
        String str = "API: " + Build.VERSION.SDK_INT;
        Context context = this.f338227b;
        String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        Orientation orientation = configuration.orientation == 1 ? Orientation.f338202c : Orientation.f338201b;
        Platform platform = Platform.f338205b;
        return new h(str, orientation, configuration.screenWidthDp, configuration.screenHeightDp, str2 == null ? "" : str2, new k(o(c22771k.f44775a), o(c22771k.f44777c), o(c22771k.f44778d), o(c22771k.f44776b)));
    }

    public final int o(int i12) {
        return (int) (i12 / this.f338227b.getResources().getDisplayMetrics().density);
    }
}
