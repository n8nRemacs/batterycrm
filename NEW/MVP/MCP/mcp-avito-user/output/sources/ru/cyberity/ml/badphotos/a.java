package ru.cyberity.ml.badphotos;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import okhttp3.OkHttpClient;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.ml.core.a;
import ru.cyberity.ml.core.d;
import ru.cyberity.ml.core.pipeline.c;

/* compiled from: BadPhotosDetector.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b,\u0010'R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00120\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.R\u001a\u00104\u001a\u0002008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b2\u00103R\u001a\u00106\u001a\u00020\b8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b5\u0010'¨\u00069"}, d2 = {"Lru/cyberity/ml/badphotos/a;", "Lru/cyberity/ml/core/b;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "", "modelUrl", "", "executionTimeoutMs", "modelName", "", "allowCache", "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;JLjava/lang/String;Z)V", "input", "", "", "a", "(Landroid/graphics/Bitmap;)[Ljava/lang/Object;", "", "", "g", "()Ljava/util/Map;", "executionTimeMs", "(Landroid/graphics/Bitmap;J)Lru/cyberity/ml/badphotos/models/a;", "i", "Landroid/content/Context;", "m", "()Landroid/content/Context;", "j", "Lokhttp3/OkHttpClient;", "p", "()Lokhttp3/OkHttpClient;", "k", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "l", "J", "c", "()J", "n", "", "[[[[F", "output", "Lru/cyberity/ml/core/a;", "Lru/cyberity/ml/core/a;", "e", "()Lru/cyberity/ml/core/a;", "mlModel", "h", "solutionName", "q", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.ml.core.b<Bitmap, ru.cyberity.ml.badphotos.models.a> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    private static final C12566a f436132s = new C12566a();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final Context context;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final OkHttpClient okHttpClient;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private final String modelUrl;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long executionTimeoutMs;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    private final String modelName;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private final float[][][][] output;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.ml.core.a mlModel;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @k
    private final String solutionName;

    /* compiled from: BadPhotosDetector.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"ru/cyberity/ml/badphotos/a$a", "Lru/cyberity/ml/core/d;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "input", "Lru/cyberity/ml/core/d$a;", "a", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.badphotos.a$a, reason: collision with other inner class name */
    public static final class C12566a implements d<Bitmap, ru.cyberity.ml.badphotos.models.a> {
        @Override // ru.cyberity.ml.core.d
        @l
        public Object a(@k Bitmap bitmap, @k Continuation<? super d.a<ru.cyberity.ml.badphotos.models.a>> continuation) {
            return new d.a.b();
        }
    }

    /* compiled from: BadPhotosDetector.kt */
    @Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ:\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/cyberity/ml/badphotos/a$b;", "", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "", "baseUrl", "Lru/cyberity/cbr/core/data/model/DocumentType;", "documentType", "Lru/cyberity/ml/core/d;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "a", "modelName", "", "allowCache", "ru/cyberity/ml/badphotos/a$a", "NOOP_DETECTOR", "Lru/cyberity/ml/badphotos/a$a;", "", "TARGET_SIZE", "I", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.badphotos.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final d<Bitmap, ru.cyberity.ml.badphotos.models.a> a(@k Context context, @k OkHttpClient okHttpClient, @k String baseUrl, @k DocumentType documentType) {
            d<Bitmap, ru.cyberity.ml.badphotos.models.a> aVar;
            try {
                b bVarA = b.INSTANCE.a();
                if (bVarA.getEnabled() && bVarA.j().contains(documentType.getValue())) {
                    aVar = new a(context, okHttpClient, baseUrl + "resources/embeddedModels/" + bVarA.getModel(), bVarA.getExecutionTimeoutMs(), bVarA.getModel(), bVarA.getAllowCache());
                } else {
                    aVar = a.f436132s;
                }
                return aVar;
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "BadPhotosDetector", "Can't create instance. Using dummy detector.", th2);
                return a.f436132s;
            }
        }

        private Companion() {
        }

        @k
        public final d<Bitmap, ru.cyberity.ml.badphotos.models.a> a(@k Context context, @k OkHttpClient okHttpClient, @k String baseUrl, @k String modelName, boolean allowCache) {
            return new a(context, okHttpClient, r.r(baseUrl, "resources/embeddedModels/", modelName), 0L, modelName, allowCache);
        }
    }

    public /* synthetic */ a(Context context, OkHttpClient okHttpClient, String str, long j12, String str2, boolean z12, int i12, C42822w c42822w) {
        this(context, okHttpClient, str, j12, str2, (i12 & 32) != 0 ? true : z12);
    }

    @Override // ru.cyberity.ml.core.b
    /* renamed from: c, reason: from getter */
    public long getExecutionTimeoutMs() {
        return this.executionTimeoutMs;
    }

    @Override // ru.cyberity.ml.core.b
    @k
    /* renamed from: e, reason: from getter */
    public ru.cyberity.ml.core.a getMlModel() {
        return this.mlModel;
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public Map<Integer, Object> g() {
        HashMap map = new HashMap();
        map.put(0, this.output);
        return map;
    }

    @Override // ru.cyberity.ml.core.b
    @k
    /* renamed from: h, reason: from getter */
    public String getSolutionName() {
        return this.solutionName;
    }

    public a(@k Context context, @k OkHttpClient okHttpClient, @k String str, long j12, @k String str2, boolean z12) {
        this.context = context;
        this.okHttpClient = okHttpClient;
        this.modelUrl = str;
        this.executionTimeoutMs = j12;
        this.modelName = str2;
        this.output = new float[][][][]{new float[][][]{new float[][]{new float[]{0.0f}}, new float[][]{new float[]{0.0f}}}};
        this.mlModel = new a.c(context, okHttpClient, str, z12);
        this.solutionName = "Unsatisfactory photos detector";
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public Object[] a(@k Bitmap input) {
        return new Object[]{((ru.cyberity.ml.core.buffer.a) new ru.cyberity.ml.core.pipeline.core.a(new c(512, 512, true, false)).a((ru.cyberity.ml.core.pipeline.core.b) new ru.cyberity.ml.core.pipeline.a()).a((ru.cyberity.ml.core.pipeline.core.b) new ru.cyberity.ml.badphotos.pipeline.a(this.context)).a((ru.cyberity.ml.core.pipeline.core.a) input)).a()};
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public ru.cyberity.ml.badphotos.models.a a(@k Bitmap input, long executionTimeMs) {
        return new ru.cyberity.ml.badphotos.models.a(this.modelName, this.output[0][0][0][0], executionTimeMs);
    }
}
