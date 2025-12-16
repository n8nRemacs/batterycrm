package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import BL.a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sL.AbstractC48067b;

/* compiled from: IacWatcherObserver.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "LBL/a$b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<Q<? extends a.b, ? extends a.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f168168l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ArrayList arrayList) {
        super(1);
        this.f168168l = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends a.b, ? extends a.b> q12) {
        Q<? extends a.b, ? extends a.b> q13 = q12;
        a.b bVar = (a.b) q13.f406619b;
        a.b bVar2 = (a.b) q13.f406620c;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacWatcher", "Watcher state change: \n            prev: " + bVar + "\n             cur: " + bVar2, null);
        for (AbstractC48067b abstractC48067b : this.f168168l) {
            try {
                Object objB = abstractC48067b.b(bVar);
                Object objB2 = abstractC48067b.b(bVar2);
                if (!objB.equals(objB2)) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(abstractC48067b.getF440691b(), abstractC48067b.getF440692c() + '=' + objB2, null);
                    abstractC48067b.d(objB, objB2);
                }
            } catch (Exception e12) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacWatcher", "error in watcher listeners " + abstractC48067b.getF440691b(), e12);
            }
        }
        return G0.f406611a;
    }
}
