package com.avito.android.beduin.common.form.actionbus;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import nj.InterfaceC44433a;

/* compiled from: FormsUpdateObservers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/form/actionbus/d;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onResume", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44433a f103331b;

    public d(InterfaceC44433a interfaceC44433a) {
        this.f103331b = interfaceC44433a;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        this.f103331b.a();
    }
}
