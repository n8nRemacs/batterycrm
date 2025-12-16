package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformFrom;", "", "field", "", "page", "(Ljava/lang/String;Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "getPage", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransformFrom {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final String field;

    @k
    private final String page;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformFrom$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TransformFrom;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final TransformFrom parseJson(@k JSONObject json) {
            return new TransformFrom(R7.b(json, "field"), json.getString("page"));
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TransformFrom(@l String str, @k String str2) {
        this.field = str;
        this.page = str2;
    }

    @l
    public final String getField() {
        return this.field;
    }

    @k
    public final String getPage() {
        return this.page;
    }
}
