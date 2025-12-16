package com.avito.android.util.architecture_components;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.publish.details.C33796v0;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/architecture_components/w;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onResume", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33796v0 f318818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f318819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f318820d;

    public w(C33796v0 c33796v0, Object obj, InterfaceC22983P interfaceC22983P) {
        this.f318818b = c33796v0;
        this.f318819c = obj;
        this.f318820d = interfaceC22983P;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.f318818b.onChanged(this.f318819c);
        this.f318820d.getLifecycle().c(this);
    }
}
