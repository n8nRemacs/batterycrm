package com.avito.android.remote.model.category_parameters.slot.auto_group_block.car_body_condition;

import X41.n;
import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;

/* compiled from: GroupBodyConditionBlockActiveSlotIdProvider_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/car_body_condition/GroupBodyConditionBlockActiveSlotIdProvider_Factory;", "Ldagger/internal/h;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/car_body_condition/GroupBodyConditionBlockActiveSlotIdProvider;", "<init>", "()V", "create", "()Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/car_body_condition/GroupBodyConditionBlockActiveSlotIdProvider_Factory;", "newInstance", "()Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/car_body_condition/GroupBodyConditionBlockActiveSlotIdProvider;", "get", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupBodyConditionBlockActiveSlotIdProvider_Factory implements h<GroupBodyConditionBlockActiveSlotIdProvider> {

    @k
    public static final GroupBodyConditionBlockActiveSlotIdProvider_Factory INSTANCE = new GroupBodyConditionBlockActiveSlotIdProvider_Factory();

    private GroupBodyConditionBlockActiveSlotIdProvider_Factory() {
    }

    @n
    @k
    public static final GroupBodyConditionBlockActiveSlotIdProvider_Factory create() {
        return INSTANCE;
    }

    @n
    @k
    public static final GroupBodyConditionBlockActiveSlotIdProvider newInstance() {
        return new GroupBodyConditionBlockActiveSlotIdProvider();
    }

    @Override // javax.inject.Provider
    @k
    public GroupBodyConditionBlockActiveSlotIdProvider get() {
        return newInstance();
    }
}
