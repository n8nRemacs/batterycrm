package ru.cyberity.ml.badphotos;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.cyberity.log.logger.Logger;

/* compiled from: BadPhotosDetectorFeature.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001\u0019B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015¨\u00063"}, d2 = {"Lru/cyberity/ml/badphotos/b;", "", "", "enabled", "", "model", "", "highQualityThreshold", "lowQualityThreshold", "", "executionTimeoutMs", "allowCache", "", "allowedSteps", "", "maxBlockedAttemptsCount", "<init>", "(ZLjava/lang/String;FFJZLjava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "()Z", "b", "Ljava/lang/String;", "p", "c", "F", "m", "()F", "d", "n", "e", "J", "l", "()J", "f", "i", "g", "Ljava/util/List;", "j", "()Ljava/util/List;", "h", "I", "o", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String model;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float highQualityThreshold;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float lowQualityThreshold;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long executionTimeoutMs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowCache;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<String> allowedSteps;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxBlockedAttemptsCount;

    /* compiled from: BadPhotosDetectorFeature.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/cyberity/ml/badphotos/b$a;", "", "Lru/cyberity/ml/badphotos/b;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.badphotos.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final b a() {
            String strF = ru.cyberity.ff.a.f435638a.v().f();
            if (strF == null) {
                return new b(false, null, 0.0f, 0.0f, 0L, false, null, 0, 255, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(strF).getJSONObject("android_v127");
                JSONArray jSONArray = jSONObject.getJSONArray("allowed_steps");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    arrayList.add(jSONArray.getString(i12));
                }
                b bVar = new b(jSONObject.getBoolean("enabled"), jSONObject.getString("model"), Float.parseFloat(jSONObject.getString("high_quality_threshold")), Float.parseFloat(jSONObject.getString("low_quality_threshold")), jSONObject.getLong("execution_timeout_ms"), jSONObject.getBoolean("allow_cache"), arrayList, jSONObject.getInt("max_blocked_attempts"));
                Logger.d$default(ru.cyberity.log.a.f436064a, "BadPhotosDetectorFeature", "Parsed FF: " + bVar, null, 4, null);
                return bVar;
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "BadPhotosDetectorFeature", "Failed to parse badPhotoDetectorConfig FF", th2);
                return new b(false, null, 0.0f, 0.0f, 0L, false, null, 0, 255, null);
            }
        }

        private Companion() {
        }
    }

    public b() {
        this(false, null, 0.0f, 0.0f, 0L, false, null, 0, 255, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return this.enabled == bVar.enabled && L.f(this.model, bVar.model) && Float.valueOf(this.highQualityThreshold).equals(Float.valueOf(bVar.highQualityThreshold)) && Float.valueOf(this.lowQualityThreshold).equals(Float.valueOf(bVar.lowQualityThreshold)) && this.executionTimeoutMs == bVar.executionTimeoutMs && this.allowCache == bVar.allowCache && L.f(this.allowedSteps, bVar.allowedSteps) && this.maxBlockedAttemptsCount == bVar.maxBlockedAttemptsCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z12 = this.enabled;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int iG2 = r.g(r.d(this.lowQualityThreshold, r.d(this.highQualityThreshold, H.d(r02 * 31, 31, this.model), 31), 31), 31, this.executionTimeoutMs);
        boolean z13 = this.allowCache;
        return Integer.hashCode(this.maxBlockedAttemptsCount) + H.e((iG2 + (z13 ? 1 : z13 ? 1 : 0)) * 31, 31, this.allowedSteps);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getAllowCache() {
        return this.allowCache;
    }

    @k
    public final List<String> j() {
        return this.allowedSteps;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: l, reason: from getter */
    public final long getExecutionTimeoutMs() {
        return this.executionTimeoutMs;
    }

    /* renamed from: m, reason: from getter */
    public final float getHighQualityThreshold() {
        return this.highQualityThreshold;
    }

    /* renamed from: n, reason: from getter */
    public final float getLowQualityThreshold() {
        return this.lowQualityThreshold;
    }

    /* renamed from: o, reason: from getter */
    public final int getMaxBlockedAttemptsCount() {
        return this.maxBlockedAttemptsCount;
    }

    @k
    /* renamed from: p, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BadPhotosDetectorFeature(enabled=");
        sb2.append(this.enabled);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", highQualityThreshold=");
        sb2.append(this.highQualityThreshold);
        sb2.append(", lowQualityThreshold=");
        sb2.append(this.lowQualityThreshold);
        sb2.append(", executionTimeoutMs=");
        sb2.append(this.executionTimeoutMs);
        sb2.append(", allowCache=");
        sb2.append(this.allowCache);
        sb2.append(", allowedSteps=");
        sb2.append(this.allowedSteps);
        sb2.append(", maxBlockedAttemptsCount=");
        return r.t(sb2, this.maxBlockedAttemptsCount, ')');
    }

    public b(boolean z12, @k String str, float f12, float f13, long j12, boolean z13, @k List<String> list, int i12) {
        this.enabled = z12;
        this.model = str;
        this.highQualityThreshold = f12;
        this.lowQualityThreshold = f13;
        this.executionTimeoutMs = j12;
        this.allowCache = z13;
        this.allowedSteps = list;
        this.maxBlockedAttemptsCount = i12;
    }

    public /* synthetic */ b(boolean z12, String str, float f12, float f13, long j12, boolean z13, List list, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? false : z12, (i13 & 2) != 0 ? "unsatisfactory_photos_v1.tflite" : str, (i13 & 4) != 0 ? 0.75f : f12, (i13 & 8) != 0 ? 0.2f : f13, (i13 & 16) != 0 ? 3000L : j12, (i13 & 32) != 0 ? true : z13, (i13 & 64) != 0 ? C42745f0.U("IDENTITY", "IDENTITY2", "IDENTITY3", "IDENTITY4") : list, (i13 & 128) == 0 ? i12 : 1);
    }
}
