package com.avito.android.beduin.common.actionhandler.contextHolder;

import Ui.InterfaceC15522a;
import Y61.k;
import Y61.l;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinActionContextHolderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/contextHolder/a;", "LUi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15522a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public ActivityC22955m f100204a;

    /* compiled from: BeduinActionContextHolderImpl.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/avito/android/beduin/common/actionhandler/contextHolder/a$a", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onDestroy", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.actionhandler.contextHolder.a$a, reason: collision with other inner class name */
    public static final class C3013a implements InterfaceC22982O {
        public C3013a() {
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            a.this.f100204a = null;
        }
    }

    @Inject
    public a() {
    }

    @Override // Ui.InterfaceC15522a
    public final void a(@k ActivityC22955m activityC22955m) {
        this.f100204a = activityC22955m;
        activityC22955m.getLifecycle().a(new C3013a());
    }

    @Override // Ui.InterfaceC15522a
    public final void b(@k InterfaceC15522a.InterfaceC1136a interfaceC1136a) {
        ActivityC22955m activityC22955m = this.f100204a;
        if (activityC22955m != null) {
            interfaceC1136a.g(activityC22955m);
        }
    }
}
