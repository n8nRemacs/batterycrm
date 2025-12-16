package com.avito.android.mortgage.api.model.dictionary;

import Y61.k;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: Parameter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/api/model/dictionary/Parameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/mortgage/api/model/dictionary/IconParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/MonthParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/ProgramParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/UsualParameter;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Parameter extends Parcelable {
    @k
    String getLabel();

    @k
    String getValue();
}
