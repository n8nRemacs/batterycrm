package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformScenario;", "", "name", "", "id", "conditions", "", "Lfeedback/shared/sdk/api/network/entities/TransformCondition;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getConditions", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransformScenario {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final List<TransformCondition> conditions;

    @k
    private final String id;

    @k
    private final String name;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformScenario$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TransformScenario;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final TransformScenario parseJson(@k JSONObject json) {
            return new TransformScenario(json.getString("name"), json.getString("id"), TransformCondition.INSTANCE.parseJsonArray(json.getJSONArray("conditions")));
        }

        @k
        public final List<TransformScenario> parseJsonArray(@k JSONArray jsonArray) {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(TransformScenario.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TransformScenario(@k String str, @k String str2, @k List<TransformCondition> list) {
        this.name = str;
        this.id = str2;
        this.conditions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransformScenario copy$default(TransformScenario transformScenario, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = transformScenario.name;
        }
        if ((i12 & 2) != 0) {
            str2 = transformScenario.id;
        }
        if ((i12 & 4) != 0) {
            list = transformScenario.conditions;
        }
        return transformScenario.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<TransformCondition> component3() {
        return this.conditions;
    }

    @k
    public final TransformScenario copy(@k String name, @k String id2, @k List<TransformCondition> conditions) {
        return new TransformScenario(name, id2, conditions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformScenario)) {
            return false;
        }
        TransformScenario transformScenario = (TransformScenario) other;
        return L.f(this.name, transformScenario.name) && L.f(this.id, transformScenario.id) && L.f(this.conditions, transformScenario.conditions);
    }

    @k
    public final List<TransformCondition> getConditions() {
        return this.conditions;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.conditions.hashCode() + H.d(this.name.hashCode() * 31, 31, this.id);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransformScenario(name=");
        sb2.append(this.name);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", conditions=");
        return H.p(sb2, this.conditions, ')');
    }
}
