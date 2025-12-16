package ru.cyberity.ml.facedetector;

import Y61.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import org.tensorflow.lite.InterpreterApi;
import ru.cyberity.ml.core.a;
import ru.cyberity.ml.core.pipeline.c;
import ru.cyberity.ml.facedetector.models.d;
import ru.cyberity.ml.facedetector.models.e;
import ru.cyberity.ml.facedetector.models.f;

/* compiled from: TfFaceDetection.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u0012J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\r\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0014X\u0094D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/cyberity/ml/facedetector/a;", "Lru/cyberity/ml/core/b;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/facedetector/models/e;", "Landroid/content/Context;", "context", "Lru/cyberity/ml/facedetector/models/d;", "options", "<init>", "(Landroid/content/Context;Lru/cyberity/ml/facedetector/models/d;)V", "Lorg/tensorflow/lite/InterpreterApi;", "interpreterApi", "Lkotlin/G0;", "a", "(Lorg/tensorflow/lite/InterpreterApi;)V", "input", "", "", "(Landroid/graphics/Bitmap;)[Ljava/lang/Object;", "", "", "g", "()Ljava/util/Map;", "", "executionTimeMs", "(Landroid/graphics/Bitmap;J)Lru/cyberity/ml/facedetector/models/e;", "i", "Lru/cyberity/ml/facedetector/models/d;", "", "j", "[[[F", "regressionOutput", "k", "classificationOutput", "", "Lru/cyberity/ml/facedetector/models/a;", "l", "Ljava/util/List;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "Lru/cyberity/ml/facedetector/models/f;", "m", "Lru/cyberity/ml/facedetector/models/f;", "detectionsOption", "Lru/cyberity/ml/facedetector/utils/b;", "n", "Lru/cyberity/ml/facedetector/utils/b;", "tensorToFaces", "Lru/cyberity/ml/core/a;", "o", "Lru/cyberity/ml/core/a;", "e", "()Lru/cyberity/ml/core/a;", "mlModel", "", "p", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "solutionName", "q", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.ml.core.b<Bitmap, e> {

    /* renamed from: q, reason: collision with root package name */
    @k
    private static final C12575a f436236q = new C12575a(null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final d options;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float[][][] regressionOutput;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float[][][] classificationOutput;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<ru.cyberity.ml.facedetector.models.a> anchors;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private f detectionsOption;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ru.cyberity.ml.facedetector.utils.b tensorToFaces;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.ml.core.a mlModel;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @k
    private final String solutionName = "Face detector";

    /* compiled from: TfFaceDetection.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/cyberity/ml/facedetector/a$a;", "", "", "IMAGE_HEIGHT", "I", "IMAGE_WIDTH", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.facedetector.a$a, reason: collision with other inner class name */
    public static final class C12575a {
        public /* synthetic */ C12575a(C42822w c42822w) {
            this();
        }

        private C12575a() {
        }
    }

    public a(@k Context context, @k d dVar) {
        this.options = dVar;
        this.mlModel = new a.C12567a(context, "face_detection_short_range.tflite");
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
        float[][][] fArr = this.regressionOutput;
        if (fArr == null) {
            fArr = null;
        }
        Q q12 = new Q(0, fArr);
        float[][][] fArr2 = this.classificationOutput;
        return P0.g(q12, new Q(1, fArr2 != null ? fArr2 : null));
    }

    @Override // ru.cyberity.ml.core.b
    @k
    /* renamed from: h, reason: from getter */
    public String getSolutionName() {
        return this.solutionName;
    }

    @Override // ru.cyberity.ml.core.b
    public void a(@k InterpreterApi interpreterApi) {
        int[] iArrShape = interpreterApi.getOutputTensor(0).shape();
        int i12 = iArrShape[0];
        float[][][] fArr = new float[i12][][];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArrShape[1];
            float[][] fArr2 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                fArr2[i15] = new float[iArrShape[2]];
            }
            fArr[i13] = fArr2;
        }
        this.regressionOutput = fArr;
        int[] iArrShape2 = interpreterApi.getOutputTensor(1).shape();
        int i16 = iArrShape2[0];
        float[][][] fArr3 = new float[i16][][];
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = iArrShape2[1];
            float[][] fArr4 = new float[i18][];
            for (int i19 = 0; i19 < i18; i19++) {
                fArr4[i19] = new float[iArrShape2[2]];
            }
            fArr3[i17] = fArr4;
        }
        this.classificationOutput = fArr3;
        this.anchors = ru.cyberity.ml.facedetector.utils.a.f436291a.a(ru.cyberity.ml.facedetector.models.b.INSTANCE.a());
        this.detectionsOption = f.INSTANCE.a(this.options.getMinConfidence(), this.options.getMaxNumberOfFaces());
        this.tensorToFaces = new ru.cyberity.ml.facedetector.utils.b();
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public Object[] a(@k Bitmap input) {
        int iMax = Math.max(input.getWidth(), input.getHeight());
        return new Object[]{((ru.cyberity.ml.core.buffer.a) new ru.cyberity.ml.core.pipeline.core.a(new ru.cyberity.ml.core.pipeline.b(iMax, iMax)).a((ru.cyberity.ml.core.pipeline.core.b) new c(128, 128, false, false)).a((ru.cyberity.ml.core.pipeline.core.b) new ru.cyberity.ml.facedetector.pipeline.a()).a((ru.cyberity.ml.core.pipeline.core.a) input)).a()};
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public e a(@k Bitmap input, long executionTimeMs) {
        ru.cyberity.ml.facedetector.utils.b bVar = this.tensorToFaces;
        ru.cyberity.ml.facedetector.utils.b bVar2 = bVar == null ? null : bVar;
        Size size = new Size(input.getWidth(), input.getHeight());
        f fVar = this.detectionsOption;
        f fVar2 = fVar == null ? null : fVar;
        float[][][] fArr = this.classificationOutput;
        float[][][] fArr2 = fArr == null ? null : fArr;
        float[][][] fArr3 = this.regressionOutput;
        float[][][] fArr4 = fArr3 == null ? null : fArr3;
        List<ru.cyberity.ml.facedetector.models.a> list = this.anchors;
        return new e(bVar2.a(size, fVar2, fArr2, fArr4, list == null ? null : list), executionTimeMs);
    }
}
