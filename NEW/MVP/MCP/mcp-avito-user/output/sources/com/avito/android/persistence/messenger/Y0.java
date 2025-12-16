package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23458l0;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessageDao.kt */
@androidx.room.A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/Y0;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Y0 {

    /* compiled from: MessageDao.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @InterfaceC23458l0
    int A(@Y61.k String str, @Y61.k List<String> list, long j12, @Y61.k IsReadStatus isReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C41933a0 B(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C42006d C(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 D(@Y61.k String str, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C41933a0 E(long j12, @Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2);

    @InterfaceC23458l0
    @Y61.l
    Long F(@Y61.k String str, @Y61.k String str2, int i12, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    int a(long j12, @Y61.k String... strArr);

    @InterfaceC23458l0
    int b(@Y61.k String str, @Y61.k String str2, long j12, @Y61.k IsReadStatus isReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 c(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 d();

    @InterfaceC23458l0
    long e(@Y61.k String str, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 f(@Y61.k String str, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    int g(@Y61.k String str, @Y61.k String str2, @Y61.k IsReadStatus isReadStatus, @Y61.k IsReadStatus isReadStatus2, @Y61.l Long l12, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C42006d h(long j12, @Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2);

    @InterfaceC23458l0
    int i(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @androidx.room.V0
    int j(@Y61.k O1 o12);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 k(@Y61.k String str, @Y61.k IsReadStatus isReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C42006d l(@Y61.k String str, @Y61.k List list, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C42006d m(long j12, @Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C42006d n(long j12, @Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2);

    @InterfaceC23458l0
    int o(@Y61.k String str, @Y61.k String str2, long j12, @Y61.k IsReadStatus isReadStatus, @Y61.k UserEntityType userEntityType);

    @androidx.room.Q0
    void p(@Y61.k O1 o12, @Y61.k Q1 q12);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 q(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    long r(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 s(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType, @Y61.k IsReadStatus isReadStatus);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 t(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @InterfaceC23458l0
    int u(@Y61.k String... strArr);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    C42006d v(long j12, @Y61.k String str, @Y61.k String str2, long j13, @Y61.k UserEntityType userEntityType);

    @androidx.room.W
    long w(@Y61.k O1 o12);

    @androidx.room.Q0
    @Y61.k
    ArrayList x(@Y61.k ArrayList arrayList);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 y(@Y61.k String str, @Y61.k Collection collection, @Y61.k UserEntityType userEntityType);

    @androidx.room.Q0
    void z(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);
}
