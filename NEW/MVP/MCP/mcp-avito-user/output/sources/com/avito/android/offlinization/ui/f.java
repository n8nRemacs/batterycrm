package com.avito.android.offlinization.ui;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.view.InterfaceC22983P;
import com.avito.android.util.AbstractC35776d5;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43197r1;
import w40.InterfaceC49441a;

/* compiled from: OfflinizationLifecycleCallbacks.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/ui/f;", "Lcom/avito/android/util/d5;", "Lcom/avito/android/offlinization/ui/d;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends AbstractC35776d5 implements d {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49441a f208634c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<i> f208635d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final IdentityHashMap<Activity, b> f208636e = new IdentityHashMap<>();

    @Inject
    public f(@Y61.k InterfaceC49441a interfaceC49441a, @Y61.k h31.e<i> eVar) {
        this.f208634c = interfaceC49441a;
        this.f208635d = eVar;
    }

    @Override // com.avito.android.offlinization.ui.d
    public final void b(@Y61.k Application application) {
        application.registerActivityLifecycleCallbacks(this.f318859a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.util.AbstractC35776d5
    public final void c(@Y61.k Activity activity) {
        b bVar = new b(activity, null, 0, 6, null);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        bVar.setId(View.generateViewId());
        bVar.setToastProvider(this.f208635d.get());
        this.f208636e.put(activity, bVar);
        View rootView = activity.getWindow().getDecorView().getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView(bVar);
        }
        InterfaceC22983P interfaceC22983P = activity instanceof InterfaceC22983P ? (InterfaceC22983P) activity : null;
        if (interfaceC22983P == null) {
            return;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new e(bVar, null), this.f208634c.a()));
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void d(@Y61.k Activity activity) {
        IdentityHashMap<Activity, b> identityHashMap = this.f208636e;
        if (identityHashMap.containsKey(activity)) {
            identityHashMap.remove(activity);
        }
    }
}
