package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23458l0;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: UserDao.kt */
@androidx.room.A
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/Q2;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class Q2 {
    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 a(long j12, @Y61.k Collection collection);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d b(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d c(@Y61.k String str, @Y61.k String str2, @Y61.k Collection collection, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 d(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 e(@Y61.k String str, @Y61.k Collection collection, @Y61.k UserEntityType userEntityType);

    @androidx.room.W
    @Y61.k
    public abstract kotlin.collections.builders.b f(@Y61.k ArrayList arrayList);

    @InterfaceC23458l0
    @Y61.k
    public abstract io.reactivex.rxjava3.internal.operators.completable.r g(@Y61.l Long l12, @Y61.l Long l13, @Y61.k String str);

    @androidx.room.Q0
    public void h(@Y61.k Collection<d3> collection) {
        for (d3 d3Var : collection) {
            g(d3Var.f215443b, d3Var.f215444c, d3Var.f215442a).i();
        }
    }
}
