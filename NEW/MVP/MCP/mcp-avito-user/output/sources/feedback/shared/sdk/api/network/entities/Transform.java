package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Transform;", "", "id", "", "version", "", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lfeedback/shared/sdk/api/network/entities/TransformTo;", "scenarios", "", "Lfeedback/shared/sdk/api/network/entities/TransformScenario;", "(Ljava/lang/String;ILfeedback/shared/sdk/api/network/entities/TransformTo;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getScenarios", "()Ljava/util/List;", "getTo", "()Lfeedback/shared/sdk/api/network/entities/TransformTo;", "getVersion", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Transform {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String id;

    @k
    private final List<TransformScenario> scenarios;

    @k
    private final TransformTo to;
    private final int version;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Transform$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Transform;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Transform parseJson(@k JSONObject json) {
            return new Transform(json.getString("id"), json.getInt("version"), TransformTo.INSTANCE.parseJson(json.getJSONObject(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)), TransformScenario.INSTANCE.parseJsonArray(json.getJSONArray("scenarios")));
        }

        @l
        public final List<Transform> parseJsonArray(@l JSONArray jsonArray) {
            if (jsonArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(Transform.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Transform(@k String str, int i12, @k TransformTo transformTo, @k List<TransformScenario> list) {
        this.id = str;
        this.version = i12;
        this.to = transformTo;
        this.scenarios = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Transform copy$default(Transform transform, String str, int i12, TransformTo transformTo, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = transform.id;
        }
        if ((i13 & 2) != 0) {
            i12 = transform.version;
        }
        if ((i13 & 4) != 0) {
            transformTo = transform.to;
        }
        if ((i13 & 8) != 0) {
            list = transform.scenarios;
        }
        return transform.copy(str, i12, transformTo, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final TransformTo getTo() {
        return this.to;
    }

    @k
    public final List<TransformScenario> component4() {
        return this.scenarios;
    }

    @k
    public final Transform copy(@k String id2, int version, @k TransformTo to2, @k List<TransformScenario> scenarios) {
        return new Transform(id2, version, to2, scenarios);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) other;
        return L.f(this.id, transform.id) && this.version == transform.version && L.f(this.to, transform.to) && L.f(this.scenarios, transform.scenarios);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final List<TransformScenario> getScenarios() {
        return this.scenarios;
    }

    @k
    public final TransformTo getTo() {
        return this.to;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.scenarios.hashCode() + ((this.to.hashCode() + r.e(this.version, this.id.hashCode() * 31, 31)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Transform(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", to=");
        sb2.append(this.to);
        sb2.append(", scenarios=");
        return H.p(sb2, this.scenarios, ')');
    }
}
