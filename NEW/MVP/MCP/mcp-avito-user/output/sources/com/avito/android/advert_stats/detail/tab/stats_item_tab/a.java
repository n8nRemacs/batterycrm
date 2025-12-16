package com.avito.android.advert_stats.detail.tab.stats_item_tab;

import android.os.Bundle;
import eb.InterfaceC40078a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/G6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatsItemTabMviFragment f86485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f86486c;

    public a(StatsItemTabMviFragment statsItemTabMviFragment, Bundle bundle) {
        this.f86485b = statsItemTabMviFragment;
        this.f86486c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((e) this.f86485b.f86468o0.getValue()).accept(new InterfaceC40078a.g(this.f86486c.getLong("requestKeyLastDate")));
    }
}
