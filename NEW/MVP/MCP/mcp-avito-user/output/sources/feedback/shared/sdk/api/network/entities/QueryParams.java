package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/QueryParams;", "", ChannelContext.System.TYPE, "", "", ChannelContext.UserToUser.TYPE, "(Ljava/util/List;Ljava/util/List;)V", "getSystem", "()Ljava/util/List;", "getUser", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QueryParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final List<String> system;

    @k
    private final List<String> user;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/QueryParams$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/QueryParams;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final QueryParams parseJson(@l JSONObject json) {
            if (json != null) {
                return new QueryParams(R7.a(ChannelContext.System.TYPE, json), R7.a(ChannelContext.UserToUser.TYPE, json));
            }
            return null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public QueryParams(@k List<String> list, @k List<String> list2) {
        this.system = list;
        this.user = list2;
    }

    @k
    public final List<String> getSystem() {
        return this.system;
    }

    @k
    public final List<String> getUser() {
        return this.user;
    }
}
