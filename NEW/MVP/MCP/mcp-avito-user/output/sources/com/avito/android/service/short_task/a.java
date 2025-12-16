package com.avito.android.service.short_task;

import android.os.Bundle;
import androidx.work.C23544h;
import com.avito.android.util.V2;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Bundles.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_job-scheduler_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    @Y61.k
    public static final Bundle a(@Y61.k C23544h c23544h, boolean z12) throws Throwable {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : Collections.unmodifiableMap(c23544h.f55510a).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Number) value).intValue());
            } else {
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder("Error creating Bundle from ");
                androidx.appcompat.app.r.C(C23544h.class, sb2, " due to unhandled ");
                sb2.append(value != null ? value.getClass().getSimpleName() : null);
                sb2.append(" extra value.\n                    Add corresponding 'is'-check in 'when' expression.\n                ");
                v22.m(new IllegalArgumentException(C43066x.E0(sb2.toString())), z12);
            }
        }
        return bundle;
    }
}
