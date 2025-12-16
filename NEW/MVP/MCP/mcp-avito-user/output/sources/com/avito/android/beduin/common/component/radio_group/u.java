package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RadioGroupWithTypes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/u;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u implements com.avito.android.beduin.common.component.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final u f102237a = new u();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final List<String> f102238b = Collections.singletonList("radiogroup");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Class<? extends BeduinModel> f102239c = BeduinRadioGroupModel.class;

    @Override // com.avito.android.beduin.common.component.b
    @Y61.k
    public final Class<? extends BeduinModel> S() {
        return f102239c;
    }

    @Override // com.avito.android.beduin.common.component.b
    @Y61.k
    public final List<String> a() {
        return f102238b;
    }
}
