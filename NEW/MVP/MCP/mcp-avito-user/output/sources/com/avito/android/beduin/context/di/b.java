package com.avito.android.beduin.context.di;

import Y61.k;
import android.app.Application;
import android.content.Context;
import com.avito.android.B2;
import com.avito.android.H0;
import com.avito.android.advert.viewed.persistance.j;
import com.avito.android.beduin.di.InterfaceC28860w;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.search.filter.C34600v;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import com.google.gson.Gson;
import gF.C40578b;
import hZ.C40896b;
import kotlin.Metadata;

/* compiled from: BeduinContextDependencies.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/context/di/b;", "Lcom/avito/android/di/h;", "Lkj/c;", "Lcom/avito/android/beduin/di/w;", "LoC/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b extends InterfaceC29971h, kj.c, InterfaceC28860w, oC.b {
    @k
    B2 D();

    @k
    H0 M();

    @k
    C40896b Yd();

    @k
    Context g();

    @k
    C40578b g1();

    @k
    com.avito.android.clientEventBus.a h0();

    @k
    C j();

    @k
    Application k();

    @k
    C34600v n2();

    @k
    com.avito.android.remote.error.f o();

    @k
    j q0();

    @k
    Gson s();

    @k
    com.avito.android.master_plan.d xh();

    @k
    L0 z();
}
