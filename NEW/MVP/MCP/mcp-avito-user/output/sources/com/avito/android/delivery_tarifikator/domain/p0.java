package com.avito.android.delivery_tarifikator.domain;

import cw.C39420a;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43189o1;

/* compiled from: TarifikatorSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/p0;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface p0 {
    void a(@Y61.k C39420a c39420a);

    void b(@Y61.l Long l12, @Y61.k List<Ov.d> list);

    void c(@Y61.l Long l12, @Y61.k List<Ov.d> list);

    void clear();

    @Y61.k
    I d();

    boolean e();

    void f();

    void g(@Y61.l Long l12, @Y61.k List<Ov.d> list);

    @Y61.k
    C43189o1 getSettings();

    void h(@Y61.k Ov.k kVar, @Y61.k List<Ov.d> list);
}
