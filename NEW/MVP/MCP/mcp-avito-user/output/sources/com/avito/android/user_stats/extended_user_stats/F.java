package com.avito.android.user_stats.extended_user_stats;

import android.content.res.Resources;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedUserStatsViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/F;", "Landroidx/lifecycle/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f317117d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Resources f317118e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final m f317119f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f317120g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.b f317121h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final lE.g f317122i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317123j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f317124k;

    @Inject
    public F(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Resources resources, @Y61.k m mVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.user_stats.b bVar, @Y61.k lE.g gVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.deep_linking.x xVar) {
        super(interfaceC23487e, null);
        this.f317117d = interfaceC28373a;
        this.f317118e = resources;
        this.f317119f = mVar;
        this.f317120g = interfaceC35745a5;
        this.f317121h = bVar;
        this.f317122i = gVar;
        this.f317123j = interfaceC35863o4;
        this.f317124k = xVar;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(ExtendedUserStatsViewModel.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new ExtendedUserStatsViewModel(c23060r0, this.f317117d, this.f317118e, this.f317119f, this.f317120g, this.f317121h, this.f317122i, this.f317123j, this.f317124k);
    }
}
