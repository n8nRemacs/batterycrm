package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23458l0;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DraftDao.kt */
@androidx.room.A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/G0;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface G0 {
    @androidx.room.W
    long a(@Y61.k P0 p02);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 b(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 c(@Y61.k String str, @Y61.k List list, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    int d(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    int e(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);
}
