package ru.cyberity.ml.autocapture;

import Y61.k;
import Y61.l;
import android.util.Size;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

/* compiled from: DocumentAutocaptureFeature.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u0000 72\u00020\u0001:\u0003\u001f#%B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010 \u001a\u0004\bB\u0010\"¨\u0006C"}, d2 = {"Lru/cyberity/ml/autocapture/a;", "", "", "enabled", "showBounds", "enableInsideFrameAutoShot", "", "insideFrameAutoShotTimeoutMs", "", "requiredFrameFillRatio", "requiredLargestSizeOffsetRatio", "frameAspectRatio", "enableCropToFrame", "Lru/cyberity/ml/autocapture/a$a;", "autoCaptureModel", "Lru/cyberity/ml/autocapture/a$c;", "badPhotosModel", "Landroid/util/Size;", "frameSize", "imageCaptureUseCaseEnabled", "<init>", "(ZZZJFFFZLru/cyberity/ml/autocapture/a$a;Lru/cyberity/ml/autocapture/a$c;Landroid/util/Size;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Z", "q", "()Z", "b", "x", "c", "p", "d", "J", "u", "()J", "e", "F", "v", "()F", "f", "w", "g", "r", "h", "o", "i", "Lru/cyberity/ml/autocapture/a$a;", "m", "()Lru/cyberity/ml/autocapture/a$a;", "j", "Lru/cyberity/ml/autocapture/a$c;", "n", "()Lru/cyberity/ml/autocapture/a$c;", "k", "Landroid/util/Size;", "s", "()Landroid/util/Size;", "l", "t", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean showBounds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enableInsideFrameAutoShot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long insideFrameAutoShotTimeoutMs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float requiredFrameFillRatio;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float requiredLargestSizeOffsetRatio;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float frameAspectRatio;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean enableCropToFrame;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final C12565a autoCaptureModel;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final c badPhotosModel;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    private final Size frameSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean imageCaptureUseCaseEnabled;

    /* compiled from: DocumentAutocaptureFeature.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lru/cyberity/ml/autocapture/a$a;", "Lru/cyberity/ml/autocapture/a$c;", "", "name", "", "threshold", "", "allowCache", "Landroid/util/Size;", "inputSize", "", "outputSize", "<init>", "(Ljava/lang/String;FZLandroid/util/Size;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "F", "c", "()F", "f", "Z", "a", "()Z", "g", "Landroid/util/Size;", "i", "()Landroid/util/Size;", "h", "I", "j", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.autocapture.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12565a extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @k
        private final String name;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float threshold;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean allowCache;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @k
        private final Size inputSize;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final int outputSize;

        public C12565a() {
            this(null, 0.0f, false, null, 0, 31, null);
        }

        @Override // ru.cyberity.ml.autocapture.a.c
        /* renamed from: a, reason: from getter */
        public boolean getAllowCache() {
            return this.allowCache;
        }

        @Override // ru.cyberity.ml.autocapture.a.c
        @k
        /* renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // ru.cyberity.ml.autocapture.a.c
        /* renamed from: c, reason: from getter */
        public float getThreshold() {
            return this.threshold;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12565a)) {
                return false;
            }
            C12565a c12565a = (C12565a) other;
            return L.f(getName(), c12565a.getName()) && Float.valueOf(getThreshold()).equals(Float.valueOf(c12565a.getThreshold())) && getAllowCache() == c12565a.getAllowCache() && L.f(this.inputSize, c12565a.inputSize) && this.outputSize == c12565a.outputSize;
        }

        public int hashCode() {
            int iHashCode = (Float.hashCode(getThreshold()) + (getName().hashCode() * 31)) * 31;
            boolean allowCache = getAllowCache();
            int i12 = allowCache;
            if (allowCache) {
                i12 = 1;
            }
            return Integer.hashCode(this.outputSize) + ((this.inputSize.hashCode() + ((iHashCode + i12) * 31)) * 31);
        }

        @k
        /* renamed from: i, reason: from getter */
        public final Size getInputSize() {
            return this.inputSize;
        }

        /* renamed from: j, reason: from getter */
        public final int getOutputSize() {
            return this.outputSize;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AutoCaptureModel(name=");
            sb2.append(getName());
            sb2.append(", threshold=");
            sb2.append(getThreshold());
            sb2.append(", allowCache=");
            sb2.append(getAllowCache());
            sb2.append(", inputSize=");
            sb2.append(this.inputSize);
            sb2.append(", outputSize=");
            return r.t(sb2, this.outputSize, ')');
        }

        public /* synthetic */ C12565a(String str, float f12, boolean z12, Size size, int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? "model.tflite" : str, (i13 & 2) != 0 ? 0.3f : f12, (i13 & 4) != 0 ? true : z12, (i13 & 8) != 0 ? new Size(0, 0) : size, (i13 & 16) != 0 ? 0 : i12);
        }

        public C12565a(@k String str, float f12, boolean z12, @k Size size, int i12) {
            super(str, f12, z12);
            this.name = str;
            this.threshold = f12;
            this.allowCache = z12;
            this.inputSize = size;
            this.outputSize = i12;
        }
    }

    /* compiled from: DocumentAutocaptureFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru/cyberity/ml/autocapture/a$b;", "", "Lru/cyberity/ml/autocapture/a;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.autocapture.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a() {
            String strF = ru.cyberity.ff.a.f435638a.e().f();
            if (strF == null) {
                return new a(false, false, false, 0L, 0.0f, 0.0f, 0.0f, false, null, null, null, false, 4095, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(strF).getJSONObject("android");
                JSONObject jSONObject2 = jSONObject.getJSONObject("autoCaptureModel");
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("inputSize");
                C12565a c12565a = new C12565a(jSONObject2.getString("name"), (float) jSONObject2.getDouble("threshold"), jSONObject2.getBoolean("allowCache"), jSONObjectOptJSONObject != null ? new Size(jSONObjectOptJSONObject.optInt("width", 384), jSONObjectOptJSONObject.optInt("height", 640)) : new Size(384, 640), jSONObject2.getInt("outputSize"));
                JSONObject jSONObject3 = jSONObject.getJSONObject("badPhotosModel");
                c cVar = new c(jSONObject3.getString("name"), (float) jSONObject3.getDouble("threshold"), jSONObject3.getBoolean("allowCache"));
                JSONObject jSONObject4 = jSONObject.getJSONObject("frameSize");
                return new a(jSONObject.getBoolean("enabled"), jSONObject.getBoolean("showBounds"), false, 4000L, (float) jSONObject.getDouble("requiredFrameFillRatio"), (float) jSONObject.getDouble("requiredLargestSizeOffsetRatio"), (float) jSONObject.getDouble("frameAspectRatio"), false, c12565a, cVar, new Size(jSONObject4.getInt("height"), jSONObject4.getInt("width")), jSONObject.getBoolean("imageCaptureUseCaseEnabled"));
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(a.INSTANCE), "Failed to parse documentAutocaptureConfig FF", th2);
                return new a(false, false, false, 0L, 0.0f, 0.0f, 0.0f, false, null, null, null, false, 4095, null);
            }
        }

        private Companion() {
        }
    }

    /* compiled from: DocumentAutocaptureFeature.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/cyberity/ml/autocapture/a$c;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "", "F", "c", "()F", "threshold", "", "Z", "()Z", "allowCache", "<init>", "(Ljava/lang/String;FZ)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float threshold;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean allowCache;

        public c() {
            this(null, 0.0f, false, 7, null);
        }

        /* renamed from: a, reason: from getter */
        public boolean getAllowCache() {
            return this.allowCache;
        }

        @k
        /* renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        /* renamed from: c, reason: from getter */
        public float getThreshold() {
            return this.threshold;
        }

        public c(@k String str, float f12, boolean z12) {
            this.name = str;
            this.threshold = f12;
            this.allowCache = z12;
        }

        public /* synthetic */ c(String str, float f12, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "model.tflite" : str, (i12 & 2) != 0 ? 0.3f : f12, (i12 & 4) != 0 ? true : z12);
        }
    }

    public a() {
        this(false, false, false, 0L, 0.0f, 0.0f, 0.0f, false, null, null, null, false, 4095, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.enabled == aVar.enabled && this.showBounds == aVar.showBounds && this.enableInsideFrameAutoShot == aVar.enableInsideFrameAutoShot && this.insideFrameAutoShotTimeoutMs == aVar.insideFrameAutoShotTimeoutMs && Float.valueOf(this.requiredFrameFillRatio).equals(Float.valueOf(aVar.requiredFrameFillRatio)) && Float.valueOf(this.requiredLargestSizeOffsetRatio).equals(Float.valueOf(aVar.requiredLargestSizeOffsetRatio)) && Float.valueOf(this.frameAspectRatio).equals(Float.valueOf(aVar.frameAspectRatio)) && this.enableCropToFrame == aVar.enableCropToFrame && L.f(this.autoCaptureModel, aVar.autoCaptureModel) && L.f(this.badPhotosModel, aVar.badPhotosModel) && L.f(this.frameSize, aVar.frameSize) && this.imageCaptureUseCaseEnabled == aVar.imageCaptureUseCaseEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    public int hashCode() {
        boolean z12 = this.enabled;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        ?? r32 = this.showBounds;
        int i13 = r32;
        if (r32 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r33 = this.enableInsideFrameAutoShot;
        int i15 = r33;
        if (r33 != 0) {
            i15 = 1;
        }
        int iD2 = r.d(this.frameAspectRatio, r.d(this.requiredLargestSizeOffsetRatio, r.d(this.requiredFrameFillRatio, r.g((i14 + i15) * 31, 31, this.insideFrameAutoShotTimeoutMs), 31), 31), 31);
        ?? r34 = this.enableCropToFrame;
        int i16 = r34;
        if (r34 != 0) {
            i16 = 1;
        }
        int iHashCode = (this.badPhotosModel.hashCode() + ((this.autoCaptureModel.hashCode() + ((iD2 + i16) * 31)) * 31)) * 31;
        Size size = this.frameSize;
        int iHashCode2 = (iHashCode + (size == null ? 0 : size.hashCode())) * 31;
        boolean z13 = this.imageCaptureUseCaseEnabled;
        return iHashCode2 + (z13 ? 1 : z13 ? 1 : 0);
    }

    @k
    /* renamed from: m, reason: from getter */
    public final C12565a getAutoCaptureModel() {
        return this.autoCaptureModel;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final c getBadPhotosModel() {
        return this.badPhotosModel;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getEnableCropToFrame() {
        return this.enableCropToFrame;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getEnableInsideFrameAutoShot() {
        return this.enableInsideFrameAutoShot;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: r, reason: from getter */
    public final float getFrameAspectRatio() {
        return this.frameAspectRatio;
    }

    @l
    /* renamed from: s, reason: from getter */
    public final Size getFrameSize() {
        return this.frameSize;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getImageCaptureUseCaseEnabled() {
        return this.imageCaptureUseCaseEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentAutocaptureFeature(enabled=");
        sb2.append(this.enabled);
        sb2.append(", showBounds=");
        sb2.append(this.showBounds);
        sb2.append(", enableInsideFrameAutoShot=");
        sb2.append(this.enableInsideFrameAutoShot);
        sb2.append(", insideFrameAutoShotTimeoutMs=");
        sb2.append(this.insideFrameAutoShotTimeoutMs);
        sb2.append(", requiredFrameFillRatio=");
        sb2.append(this.requiredFrameFillRatio);
        sb2.append(", requiredLargestSizeOffsetRatio=");
        sb2.append(this.requiredLargestSizeOffsetRatio);
        sb2.append(", frameAspectRatio=");
        sb2.append(this.frameAspectRatio);
        sb2.append(", enableCropToFrame=");
        sb2.append(this.enableCropToFrame);
        sb2.append(", autoCaptureModel=");
        sb2.append(this.autoCaptureModel);
        sb2.append(", badPhotosModel=");
        sb2.append(this.badPhotosModel);
        sb2.append(", frameSize=");
        sb2.append(this.frameSize);
        sb2.append(", imageCaptureUseCaseEnabled=");
        return r.x(sb2, this.imageCaptureUseCaseEnabled, ')');
    }

    /* renamed from: u, reason: from getter */
    public final long getInsideFrameAutoShotTimeoutMs() {
        return this.insideFrameAutoShotTimeoutMs;
    }

    /* renamed from: v, reason: from getter */
    public final float getRequiredFrameFillRatio() {
        return this.requiredFrameFillRatio;
    }

    /* renamed from: w, reason: from getter */
    public final float getRequiredLargestSizeOffsetRatio() {
        return this.requiredLargestSizeOffsetRatio;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getShowBounds() {
        return this.showBounds;
    }

    public a(boolean z12, boolean z13, boolean z14, long j12, float f12, float f13, float f14, boolean z15, @k C12565a c12565a, @k c cVar, @l Size size, boolean z16) {
        this.enabled = z12;
        this.showBounds = z13;
        this.enableInsideFrameAutoShot = z14;
        this.insideFrameAutoShotTimeoutMs = j12;
        this.requiredFrameFillRatio = f12;
        this.requiredLargestSizeOffsetRatio = f13;
        this.frameAspectRatio = f14;
        this.enableCropToFrame = z15;
        this.autoCaptureModel = c12565a;
        this.badPhotosModel = cVar;
        this.frameSize = size;
        this.imageCaptureUseCaseEnabled = z16;
    }

    public /* synthetic */ a(boolean z12, boolean z13, boolean z14, long j12, float f12, float f13, float f14, boolean z15, C12565a c12565a, c cVar, Size size, boolean z16, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) != 0 ? 0.0f : f12, (i12 & 32) != 0 ? 0.1f : f13, (i12 & 64) != 0 ? 1.75f : f14, (i12 & 128) != 0 ? false : z15, (i12 & 256) != 0 ? new C12565a("autocapture_v1.tflite", 0.0f, false, null, 0, 30, null) : c12565a, (i12 & 512) != 0 ? new c("unsatisfactory_photos_v2.tflite", 0.0f, false, 6, null) : cVar, (i12 & 1024) != 0 ? null : size, (i12 & 2048) == 0 ? z16 : false);
    }
}
