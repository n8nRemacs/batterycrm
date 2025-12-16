package yE0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: LongExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_timestamp-storage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: yE0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50105a {
    public static final boolean a(long j12, @l Long l12, @l Long l13) {
        if (l12 == null || l13 == null) {
            if (l12 != null) {
                if (j12 < l12.longValue()) {
                    return false;
                }
            } else if (l13 != null && j12 > l13.longValue()) {
                return false;
            }
        } else if (l12.longValue() > j12 || j12 > l13.longValue()) {
            return false;
        }
        return true;
    }
}
