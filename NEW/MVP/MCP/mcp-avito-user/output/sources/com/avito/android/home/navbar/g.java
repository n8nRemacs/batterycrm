package com.avito.android.home.navbar;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Lifecycles.kt */
@s0
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/avito/android/util/architecture_components/g", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onDestroyEvent", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f162458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L91.e f162459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f162460d;

    public g(f fVar, L91.e eVar, y yVar) {
        this.f162458b = fVar;
        this.f162459c = eVar;
        this.f162460d = yVar;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyEvent() {
        this.f162458b.f162450d.f176464O.removeObserver(this.f162459c);
        DisposableHelper.a(this.f162460d);
    }
}
