package com.avito.android.beduin_shared.model.form;

import Y61.k;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import lj.c;

/* compiled from: ParamsSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "Landroid/os/Parcelable;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ParamsSource extends Parcelable {
    @k
    Map<String, Object> extractParams(@k c cVar);
}
