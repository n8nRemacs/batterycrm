package ru.cyberity.cbr.core.data.source.applicant.remote;

import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: KeyValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "delimeter", "Lru/cyberity/cbr/core/data/source/applicant/remote/i;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class j {
    @Y61.l
    public static final i a(@Y61.k String str, @Y61.k String str2) {
        List listF0 = C43066x.f0(str, new String[]{str2}, 0, 6);
        if (listF0.size() == 2) {
            return new i((String) listF0.get(0), (String) listF0.get(1));
        }
        return null;
    }
}
