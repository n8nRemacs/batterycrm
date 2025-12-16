package com.avito.android.util;

import android.annotation.SuppressLint;
import com.avito.android.remote.model.category_parameters.SelectionType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateTimeSelectionFormatter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/E0;", "Lcom/avito/android/util/D0;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E0 implements D0 {
    @Inject
    public E0() {
    }

    @Override // com.avito.android.util.D0
    @Y61.k
    @SuppressLint({"SimpleDateFormat", "HardcodeStringDetector"})
    public final String a(long j12, @Y61.k SelectionType selectionType) {
        ArrayList arrayList = new ArrayList();
        if (selectionType.hasMinute() && selectionType.hasHour()) {
            arrayList.add("HH:mm");
        } else {
            if (selectionType.hasHour()) {
                arrayList.add("HH");
            }
            if (selectionType.hasMinute()) {
                arrayList.add("mm");
            }
        }
        if (selectionType.hasDay()) {
            arrayList.add("d");
        }
        if (selectionType.hasMonth()) {
            arrayList.add("MMMM");
        }
        if (selectionType.hasYear()) {
            arrayList.add("yyyy");
        }
        String strO = C42745f0.O(arrayList, " ", null, null, null, 62);
        fu0.d.f396183a.getClass();
        return new SimpleDateFormat(strO, fu0.d.f396184b).format(Long.valueOf(j12));
    }
}
