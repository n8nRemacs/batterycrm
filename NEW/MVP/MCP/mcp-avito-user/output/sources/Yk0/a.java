package YK0;

import SK0.f;
import Y61.k;
import Y61.l;
import com.avito.android.ux.feedback.remote.UxFeedbackAttributes;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UxFeedbackConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ux-feedback_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @l
    public static final SK0.a a(@k UxFeedbackConfig uxFeedbackConfig) {
        UxFeedbackAttributes uxFeedbackAttributesC = uxFeedbackConfig.getAttributes();
        if (uxFeedbackAttributesC == null) {
            return null;
        }
        SK0.a aVar = new SK0.a();
        Map<String, String> mapG = uxFeedbackAttributesC.g();
        if (mapG != null) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        Map<String, Integer> mapF = uxFeedbackAttributesC.f();
        if (mapF != null) {
            for (Map.Entry<String, Integer> entry2 : mapF.entrySet()) {
                aVar.f14904e.put(entry2.getKey(), Integer.valueOf(entry2.getValue().intValue()));
            }
        }
        Map<String, Double> mapE = uxFeedbackAttributesC.e();
        if (mapE != null) {
            for (Map.Entry<String, Double> entry3 : mapE.entrySet()) {
                aVar.f14902c.put(entry3.getKey(), Double.valueOf(entry3.getValue().doubleValue()));
            }
        }
        Map<String, Boolean> mapC = uxFeedbackAttributesC.c();
        if (mapC != null) {
            for (Map.Entry<String, Boolean> entry4 : mapC.entrySet()) {
                String key = entry4.getKey();
                Boolean value = entry4.getValue();
                value.getClass();
                aVar.f14901b.put(key, value);
            }
        }
        Map<String, Date> mapD = uxFeedbackAttributesC.d();
        if (mapD == null) {
            return aVar;
        }
        for (Map.Entry<String, Date> entry5 : mapD.entrySet()) {
            aVar.f14900a.put(entry5.getKey(), entry5.getValue());
        }
        return aVar;
    }

    @l
    public static final f b(@k UxFeedbackConfig uxFeedbackConfig) {
        Map<String, String> mapD = uxFeedbackConfig.d();
        if (mapD == null) {
            return null;
        }
        f fVar = new f();
        for (Map.Entry<String, String> entry : mapD.entrySet()) {
            fVar.a(entry.getKey(), entry.getValue());
        }
        return fVar;
    }
}
