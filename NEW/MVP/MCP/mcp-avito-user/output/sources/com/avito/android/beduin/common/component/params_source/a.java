package com.avito.android.beduin.common.component.params_source;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.google.gson.h;
import kotlin.Metadata;

/* compiled from: BeduinParamsSourceWithTypes.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BeduinParamsSourceWithTypes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.params_source.a$a, reason: collision with other inner class name */
    public static final class C3053a {
    }

    @l
    h<?> a();

    @k
    String getType();

    @k
    Class<? extends ParamsSource> getValue();
}
