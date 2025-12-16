package com.avito.android.ui.fragments;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.Y;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.deeplink_handler.view.impl.h;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.z;
import com.avito.android.memory.consumption.f;
import com.avito.android.ui.fragments.a;
import com.avito.android.util.C35739a;
import com.avito.android.util.C35960v2;
import j.I;
import j.InterfaceC42150f;
import j.InterfaceC42153i;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BaseFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ui/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "a", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final long f304596f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f304597g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f304598h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public Context f304599i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final a f304600j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f304601k0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f304602l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f304603m0;

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/fragments/BaseFragment$a;", "", "<init>", "()V", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Inject
        public com.avito.android.deeplink_handler.view.d f304604a;

        /* renamed from: b, reason: collision with root package name */
        @Inject
        public InterfaceC28373a f304605b;

        /* renamed from: c, reason: collision with root package name */
        @Inject
        public f.a f304606c;
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Resources resources;
            Context context = BaseFragment.this.getContext();
            return Boolean.valueOf((context == null || (resources = context.getResources()) == null) ? false : resources.getBoolean(R.bool.is_tablet));
        }
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/Y;", "invoke", "()Lcom/avito/android/analytics/Y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Y> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Y invoke() {
            Context context = BaseFragment.this.getContext();
            Object applicationContext = context != null ? context.getApplicationContext() : null;
            Y.a aVar = applicationContext instanceof Y.a ? (Y.a) applicationContext : null;
            if (aVar != null) {
                return aVar.getF67629f();
            }
            return null;
        }
    }

    public BaseFragment() {
        this(0, 1, null);
    }

    public final void b5(@InterfaceC42150f @l Integer num, @l Boolean bool) {
        if (bool == null) {
            z.c(z.f181429a, requireActivity().getWindow(), requireContext(), num);
            return;
        }
        z zVar = z.f181429a;
        Window window = requireActivity().getWindow();
        Context contextRequireContext = requireContext();
        boolean zBooleanValue = bool.booleanValue();
        zVar.getClass();
        z.b(window, contextRequireContext, num, zBooleanValue);
    }

    public final void c5(@InterfaceC42150f @l Integer num, @l Boolean bool) {
        if (bool == null) {
            z.e(z.f181429a, requireActivity().getWindow(), requireContext(), num);
            return;
        }
        z zVar = z.f181429a;
        Window window = requireActivity().getWindow();
        Context contextRequireContext = requireContext();
        boolean zBooleanValue = bool.booleanValue();
        zVar.getClass();
        z.d(window, contextRequireContext, num, zBooleanValue);
    }

    @k
    public a.InterfaceC4053a d5() {
        return new d.a(this);
    }

    @k
    public a.g e5() {
        return new i(requireActivity());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public a.i f5() {
        return new com.avito.android.deeplink_handler.view.impl.k(requireActivity(), null, 2, 0 == true ? 1 : 0);
    }

    @k
    public final f.a g5() {
        f.a aVar = this.f304600j0.f304606c;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final Context getContext() {
        Context context = this.f304599i0;
        return context == null ? super.getContext() : context;
    }

    /* renamed from: h5, reason: from getter */
    public boolean getF304598h0() {
        return this.f304598h0;
    }

    public boolean i5() {
        return getF304598h0();
    }

    public boolean j5() {
        return false;
    }

    public void k5(@k View view) {
        if (getF304598h0()) {
            com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
            boolean zJ5 = j5();
            iVar.getClass();
            com.avito.android.lib.util.i.i(view, zJ5);
        }
        if (!i5() || j5()) {
            return;
        }
        com.avito.android.lib.util.i.f(com.avito.android.lib.util.i.f181373a, view);
    }

    public final void l5() {
        if (this.f304601k0 || getContext() == null) {
            return;
        }
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Sb().a(this, cv.c.d(this)).a(this.f304600j0);
        this.f304601k0 = true;
    }

    @l
    public Context m5(@k Context context, @l Bundle bundle) {
        return null;
    }

    public final void o5(@l Toolbar toolbar) {
        C35739a c35739a = C35739a.f318787a;
        m mVar = (m) l1();
        c35739a.getClass();
        C35739a.a(mVar, toolbar);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public void onActivityResult(int i12, int i13, @l Intent intent) {
        ActivityC22955m activityC22955mL1 = l1();
        a aVar = this.f304600j0;
        if (activityC22955mL1 != null && intent != null) {
            InterfaceC28373a interfaceC28373a = aVar.f304605b;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C35960v2.a(intent, activityC22955mL1, interfaceC28373a);
        }
        super.onActivityResult(i12, i13, intent);
        l5();
        if (this.f304601k0) {
            com.avito.android.deeplink_handler.view.d dVar = aVar.f304604a;
            (dVar != null ? dVar : null).a(i12, i13, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        l5();
        if (this.f304597g0) {
            return;
        }
        p5(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f304599i0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final LayoutInflater onGetLayoutInflater(@l Bundle bundle) {
        this.f304599i0 = m5(requireContext(), bundle);
        return LayoutInflater.from(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Y y12 = (Y) this.f304602l0.getValue();
        if (y12 != null) {
            y12.f89689c.remove(getClass().getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Y y12 = (Y) this.f304602l0.getValue();
        if (y12 != null) {
            String simpleName = getClass().getSimpleName();
            boolean zBooleanValue = ((Boolean) this.f304603m0.getValue()).booleanValue();
            y12.f89689c.add(simpleName);
            y12.f89690d = zBooleanValue;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.deeplink_handler.view.d dVar = this.f304600j0.f304604a;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b(this, e5(), f5(), new h(requireActivity()), d5());
        k5(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void startActivity(@k Intent intent, @l Bundle bundle) {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        InterfaceC28373a interfaceC28373a = this.f304600j0.f304605b;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C35960v2.a(intent, activityC22955mRequireActivity, interfaceC28373a);
        super.startActivity(intent, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void startActivityForResult(@k Intent intent, int i12, @l Bundle bundle) {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        InterfaceC28373a interfaceC28373a = this.f304600j0.f304605b;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C35960v2.a(intent, activityC22955mRequireActivity, interfaceC28373a);
        super.startActivityForResult(intent, i12, bundle);
    }

    public BaseFragment(@I int i12) {
        super(i12);
        com.avito.android.time.c.f301452a.getClass();
        this.f304596f0 = com.avito.android.time.c.f301453b.a();
        this.f304598h0 = true;
        this.f304600j0 = new a();
        this.f304602l0 = C42727D.c(new c());
        this.f304603m0 = C42727D.c(new b());
    }

    public /* synthetic */ BaseFragment(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    public void p5(@l Bundle bundle) {
    }
}
