package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import android.annotation.SuppressLint;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sL.AbstractC48067b;
import tL.C48568a;
import uL.C48915a;
import vL.C49229a;
import wL.C49531a;
import xL.C49856a;

/* compiled from: IacWatcherObserver.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/i;", "Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/d;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a f168169a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C49229a f168170b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C49856a f168171c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C49531a f168172d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C48568a f168173e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<C48915a> f168174f;

    @Inject
    public i(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar, @Y61.k C49229a c49229a, @Y61.k C49856a c49856a, @Y61.k C49531a c49531a, @Y61.k C48568a c48568a, @Y61.k h31.e<C48915a> eVar) {
        this.f168169a = aVar;
        this.f168170b = c49229a;
        this.f168171c = c49856a;
        this.f168172d = c49531a;
        this.f168173e = c48568a;
        this.f168174f = eVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.watcher.d
    @SuppressLint({"CheckResult"})
    public final void a(@Y61.k a aVar) {
        com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar2 = this.f168169a;
        aVar2.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a.f168141e[1];
        List<AbstractC48067b> listU = C42745f0.U(this.f168170b, this.f168171c, this.f168172d, this.f168173e, ((Boolean) aVar2.f168143c.a().invoke()).booleanValue() ? this.f168174f.get() : null);
        ArrayList arrayList = new ArrayList();
        for (AbstractC48067b abstractC48067b : listU) {
            if (abstractC48067b != null) {
                arrayList.add(abstractC48067b);
            }
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacWatcher", "watcher listeners: ".concat(C42745f0.O(arrayList, null, null, null, e.f168165l, 31)), null);
        A1.h(aVar.f168152e.f(2, 1).d0(f.f168166b), g.f168167l, new h(arrayList), 2);
    }
}
