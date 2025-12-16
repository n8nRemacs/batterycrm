package com.avito.android.util;

import com.avito.android.remote.model.CloseableDataSource;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CloseableDatasources.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_konveyor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Y {
    @Y61.k
    public static final ArrayList a(@Y61.k CloseableDataSource closeableDataSource) {
        try {
            ArrayList arrayList = new ArrayList(closeableDataSource.getCount());
            int count = closeableDataSource.getCount();
            for (int i12 = 0; i12 < count; i12++) {
                arrayList.add(closeableDataSource.getItem(i12));
            }
            kotlin.io.c.a(closeableDataSource, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(closeableDataSource, th2);
                throw th3;
            }
        }
    }
}
