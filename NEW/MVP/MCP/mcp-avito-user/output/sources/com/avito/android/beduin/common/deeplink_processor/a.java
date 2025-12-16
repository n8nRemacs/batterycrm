package com.avito.android.beduin.common.deeplink_processor;

import Ba1.F;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import gj.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Lifecycles.kt */
@s0
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/avito/android/util/architecture_components/g", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onDestroyEvent", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f103277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f103278c;

    public a(h hVar, F f12) {
        this.f103277b = hVar;
        this.f103278c = f12;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyEvent() {
        this.f103277b.getF103281K().removeObserver(this.f103278c);
    }
}
