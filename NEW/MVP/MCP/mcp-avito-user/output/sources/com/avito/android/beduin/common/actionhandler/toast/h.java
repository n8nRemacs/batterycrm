package com.avito.android.beduin.common.actionhandler.toast;

import Y61.k;
import Y61.l;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22983P;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import gj.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinToastScreenConnector.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/toast/h;", "Lgj/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f100438a;

    @Inject
    public h(@k c cVar) {
        this.f100438a = cVar;
    }

    @Override // gj.j
    public final void a(@k InterfaceC40691b interfaceC40691b, @l gj.l lVar, @k gj.i iVar, @k InterfaceC22983P interfaceC22983P, @k ActivityC22955m activityC22955m) {
        this.f100438a.a(iVar, interfaceC22983P.getLifecycle());
    }
}
