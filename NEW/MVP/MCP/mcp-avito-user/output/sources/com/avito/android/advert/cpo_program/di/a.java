package com.avito.android.advert.cpo_program.di;

import Y61.k;
import com.avito.android.advert.cpo_program.AutotekaCpoProgramActivity;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import h31.d;
import kotlin.Metadata;

/* compiled from: AutotekaCpoProgramComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/cpo_program/di/a;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@d
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AutotekaCpoProgramComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/cpo_program/di/a$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.cpo_program.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2155a {
        @h31.b
        @k
        InterfaceC2155a a(@k C28478k c28478k);

        @h31.b
        @k
        InterfaceC2155a b(@k CpoDescription cpoDescription);

        @k
        a build();

        @k
        InterfaceC2155a c(@k b bVar);
    }

    void a(@k AutotekaCpoProgramActivity autotekaCpoProgramActivity);
}
