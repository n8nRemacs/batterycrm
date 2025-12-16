package com.avito.android.beduin.common.component.switcher;

import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinSwitcherWithTypes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/switcher/f;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.beduin.common.component.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f102746a = Collections.singletonList("switcher");

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<? extends BeduinModel> f102747b = BeduinSwitcherModel.class;

    @Override // com.avito.android.beduin.common.component.b
    @k
    public final Class<? extends BeduinModel> S() {
        return this.f102747b;
    }

    @Override // com.avito.android.beduin.common.component.b
    @k
    public final List<String> a() {
        return this.f102746a;
    }
}
