package com.avito.android.employee_bug_reporter_impl;

import Oy.InterfaceC14754g;
import Oy.InterfaceC14755h;
import Ry.C15095a;
import Y61.k;
import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import com.avito.android.util.AbstractC35776d5;
import com.avito.android.webview.m;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;

/* compiled from: EmployeeBugReporterLifecycleCallbacksImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/f;", "LOy/h;", "Lcom/avito/android/util/d5;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends AbstractC35776d5 implements InterfaceC14755h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC14754g f147305c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m f147306d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C15095a f147307e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final IdentityHashMap<Activity, Sy.b> f147308f = new IdentityHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f147309g = C42745f0.U("DebugActivity", "WebViewActivity", "LeakActivity");

    @Inject
    public f(@k InterfaceC14754g interfaceC14754g, @k m mVar, @k C15095a c15095a) {
        this.f147305c = interfaceC14754g;
        this.f147306d = mVar;
        this.f147307e = c15095a;
    }

    @Override // Oy.InterfaceC14755h
    public final void a(@k Application application) {
        C15095a c15095a = this.f147307e;
        c15095a.getClass();
        n<Object> nVar = C15095a.f14752d[0];
        if (((Boolean) c15095a.f14753b.a().invoke()).booleanValue()) {
            application.registerActivityLifecycleCallbacks(this.f318859a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.util.AbstractC35776d5
    public final void c(@k Activity activity) {
        if (this.f147309g.contains(activity.getClass().getSimpleName())) {
            return;
        }
        c cVar = new c(this, activity);
        Sy.b bVar = new Sy.b(activity, null, 0, 6, null);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bVar.setOnPositionOnScreenChanged(new a(1, this.f147305c, InterfaceC14754g.class, "updatePosition", "updatePosition(Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen;)V", 0));
        bVar.setOnDrag(cVar);
        this.f147308f.put(activity, bVar);
        View rootView = activity.getWindow().getDecorView().getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView(bVar);
        }
        InterfaceC22983P interfaceC22983P = activity instanceof InterfaceC22983P ? (InterfaceC22983P) activity : null;
        if (interfaceC22983P != null) {
            C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new e(this, interfaceC22983P, activity, bVar, null), 3);
        }
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void d(@k Activity activity) {
        IdentityHashMap<Activity, Sy.b> identityHashMap = this.f147308f;
        if (identityHashMap.containsKey(activity)) {
            identityHashMap.remove(activity);
        }
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void f(@k Activity activity) {
        Sy.b bVar = this.f147308f.get(activity);
        if (bVar != null) {
            bVar.setPositionOnScreen(this.f147305c.b());
        }
    }
}
