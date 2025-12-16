package com.avito.android.util.architecture_components;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: OnResumeLiveData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/architecture_components/B;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onResume", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23040h0<Object> f318798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f318799c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f318800d;

    public B(InterfaceC23040h0<Object> interfaceC23040h0, Object obj, InterfaceC22983P interfaceC22983P) {
        this.f318798b = interfaceC23040h0;
        this.f318799c = obj;
        this.f318800d = interfaceC22983P;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.f318798b.onChanged(this.f318799c);
        this.f318800d.getLifecycle().c(this);
    }
}
