package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: LogParams.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/LogParams;", "", "", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class s {
    @Y61.k
    public static final Map<String, String> a(@Y61.k LogParams logParams) {
        return ru.cyberity.cbr.core.common.s.a(P0.g(new Q("errorType", logParams.getErrorType()), new Q("location", logParams.getLocation()), new Q("externalUserId", logParams.getExternalUserId()), new Q("fileName", logParams.getFileName()), new Q("applicantId", logParams.getApplicantId()), new Q("message", logParams.getMessage()), new Q(MessageBody.Location.KIND, logParams.getKind()), new Q("stacktrace", logParams.getStacktrace())));
    }
}
