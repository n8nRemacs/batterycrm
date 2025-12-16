package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23458l0;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessageUploadPartDao.kt */
@androidx.room.A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/y2;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.persistence.messenger.y2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC33140y2 {
    @Y61.k
    @androidx.room.F
    io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k List list);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r c(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k TransferStatus transferStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C42006d e(@Y61.k String str);

    @InterfaceC23458l0
    @Y61.k
    C42006d f();

    @InterfaceC23458l0
    @Y61.k
    C42006d g(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r h(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k String str4, @Y61.k TransferStatus transferStatus, @Y61.k UserEntityType userEntityType);

    @androidx.room.W
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r i(@Y61.k C33136x2 c33136x2);
}
