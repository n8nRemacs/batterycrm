package ru.cyberity.ml.facedetector.models;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TensorToFacesOptions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001\u0003Bq\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020\u001b\u0012\u0006\u0010%\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010#\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010$\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u0003\u0010\u001eR\u0017\u0010%\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\b\u0010\u001eR\u001a\u0010&\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b\u0016\u0010\u0006¨\u0006*"}, d2 = {"Lru/cyberity/ml/facedetector/models/f;", "", "", "a", "I", "d", "()I", "maxNumberOfFaces", "b", "f", "numBoxes", "c", "h", "numCoordinates", "keypointCoordinateOffset", "", "e", "D", "k", "()D", "scoreClippingThreshold", "minScoreThreshold", "g", "i", "numKeyPoints", "j", "numValuesPerKeypoint", "", "F", "m", "()F", "xScale", "n", "yScale", "l", "widthScale", "heightScale", "iouThreshold", "numClasses", "<init>", "(IIIIDDIIFFFFF)V", "o", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxNumberOfFaces;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int numBoxes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int numCoordinates;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keypointCoordinateOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final double scoreClippingThreshold;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final double minScoreThreshold;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int numKeyPoints;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int numValuesPerKeypoint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float xScale;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float yScale;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float widthScale;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float heightScale;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float iouThreshold;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int numClasses;

    /* compiled from: TensorToFacesOptions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lru/cyberity/ml/facedetector/models/f$a;", "", "", "minScoreThreshold", "", "maxNumberOfFaces", "Lru/cyberity/ml/facedetector/models/f;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.facedetector.models.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final f a(double minScoreThreshold, int maxNumberOfFaces) {
            return new f(maxNumberOfFaces, 896, 16, 4, 100.0d, minScoreThreshold, 6, 2, 128.0f, 128.0f, 128.0f, 128.0f, 0.3f, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(int i12, int i13, int i14, int i15, double d12, double d13, int i16, int i17, float f12, float f13, float f14, float f15, float f16, C42822w c42822w) {
        this(i12, i13, i14, i15, d12, d13, i16, i17, f12, f13, f14, f15, f16);
    }

    /* renamed from: a, reason: from getter */
    public final float getHeightScale() {
        return this.heightScale;
    }

    /* renamed from: b, reason: from getter */
    public final float getIouThreshold() {
        return this.iouThreshold;
    }

    /* renamed from: c, reason: from getter */
    public final int getKeypointCoordinateOffset() {
        return this.keypointCoordinateOffset;
    }

    /* renamed from: d, reason: from getter */
    public final int getMaxNumberOfFaces() {
        return this.maxNumberOfFaces;
    }

    /* renamed from: e, reason: from getter */
    public final double getMinScoreThreshold() {
        return this.minScoreThreshold;
    }

    /* renamed from: f, reason: from getter */
    public final int getNumBoxes() {
        return this.numBoxes;
    }

    /* renamed from: g, reason: from getter */
    public final int getNumClasses() {
        return this.numClasses;
    }

    /* renamed from: h, reason: from getter */
    public final int getNumCoordinates() {
        return this.numCoordinates;
    }

    /* renamed from: i, reason: from getter */
    public final int getNumKeyPoints() {
        return this.numKeyPoints;
    }

    /* renamed from: j, reason: from getter */
    public final int getNumValuesPerKeypoint() {
        return this.numValuesPerKeypoint;
    }

    /* renamed from: k, reason: from getter */
    public final double getScoreClippingThreshold() {
        return this.scoreClippingThreshold;
    }

    /* renamed from: l, reason: from getter */
    public final float getWidthScale() {
        return this.widthScale;
    }

    /* renamed from: m, reason: from getter */
    public final float getXScale() {
        return this.xScale;
    }

    /* renamed from: n, reason: from getter */
    public final float getYScale() {
        return this.yScale;
    }

    private f(int i12, int i13, int i14, int i15, double d12, double d13, int i16, int i17, float f12, float f13, float f14, float f15, float f16) {
        this.maxNumberOfFaces = i12;
        this.numBoxes = i13;
        this.numCoordinates = i14;
        this.keypointCoordinateOffset = i15;
        this.scoreClippingThreshold = d12;
        this.minScoreThreshold = d13;
        this.numKeyPoints = i16;
        this.numValuesPerKeypoint = i17;
        this.xScale = f12;
        this.yScale = f13;
        this.widthScale = f14;
        this.heightScale = f15;
        this.iouThreshold = f16;
        this.numClasses = 1;
    }
}
