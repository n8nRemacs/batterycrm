package ru.cyberity.ml.facedetector.models;

import X41.n;
import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnchorOptions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\u0003B\u0091\u0001\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001b\u0012\u0006\u0010'\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u000e\u0010\u001dR\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010)\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010&¨\u0006-"}, d2 = {"Lru/cyberity/ml/facedetector/models/b;", "", "", "a", "I", "k", "()I", "numLayers", "", "b", "D", "j", "()D", "minScale", "c", "i", "maxScale", "d", "f", "inputSizeHeight", "e", "g", "inputSizeWidth", "anchorOffsetX", "anchorOffsetY", "h", "interpolatedScaleAspectRatio", "", "Ljava/util/List;", "()Ljava/util/List;", "featureMapWidth", "featureMapHeight", "l", "strides", "aspectRatios", "", "m", "Z", "()Z", "isFixedAnchorSize", "n", "isReduceBoxesInLowestLayer", "<init>", "(IDDIIDDDLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "o", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int numLayers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double minScale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double maxScale;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int inputSizeHeight;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int inputSizeWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final double anchorOffsetX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final double anchorOffsetY;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final double interpolatedScaleAspectRatio;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Integer> featureMapWidth;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Integer> featureMapHeight;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Integer> strides;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Double> aspectRatios;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isFixedAnchorSize;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isReduceBoxesInLowestLayer;

    /* compiled from: AnchorOptions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lru/cyberity/ml/facedetector/models/b$a;", "", "Lru/cyberity/ml/facedetector/models/b;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.facedetector.models.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @n
        @k
        public final b a() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(8);
            arrayList.add(16);
            arrayList.add(16);
            arrayList.add(16);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(Double.valueOf(1.0d));
            return new b(4, 0.1484375d, 0.75d, 128, 128, 0.5d, 0.5d, 1.0d, new ArrayList(), new ArrayList(), arrayList, arrayList2, true, false, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(int i12, double d12, double d13, int i13, int i14, double d14, double d15, double d16, List list, List list2, List list3, List list4, boolean z12, boolean z13, C42822w c42822w) {
        this(i12, d12, d13, i13, i14, d14, d15, d16, list, list2, list3, list4, z12, z13);
    }

    /* renamed from: a, reason: from getter */
    public final double getAnchorOffsetX() {
        return this.anchorOffsetX;
    }

    /* renamed from: b, reason: from getter */
    public final double getAnchorOffsetY() {
        return this.anchorOffsetY;
    }

    @k
    public final List<Double> c() {
        return this.aspectRatios;
    }

    @k
    public final List<Integer> d() {
        return this.featureMapHeight;
    }

    @k
    public final List<Integer> e() {
        return this.featureMapWidth;
    }

    /* renamed from: f, reason: from getter */
    public final int getInputSizeHeight() {
        return this.inputSizeHeight;
    }

    /* renamed from: g, reason: from getter */
    public final int getInputSizeWidth() {
        return this.inputSizeWidth;
    }

    /* renamed from: h, reason: from getter */
    public final double getInterpolatedScaleAspectRatio() {
        return this.interpolatedScaleAspectRatio;
    }

    /* renamed from: i, reason: from getter */
    public final double getMaxScale() {
        return this.maxScale;
    }

    /* renamed from: j, reason: from getter */
    public final double getMinScale() {
        return this.minScale;
    }

    /* renamed from: k, reason: from getter */
    public final int getNumLayers() {
        return this.numLayers;
    }

    @k
    public final List<Integer> l() {
        return this.strides;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsFixedAnchorSize() {
        return this.isFixedAnchorSize;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsReduceBoxesInLowestLayer() {
        return this.isReduceBoxesInLowestLayer;
    }

    private b(int i12, double d12, double d13, int i13, int i14, double d14, double d15, double d16, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Double> list4, boolean z12, boolean z13) {
        this.numLayers = i12;
        this.minScale = d12;
        this.maxScale = d13;
        this.inputSizeHeight = i13;
        this.inputSizeWidth = i14;
        this.anchorOffsetX = d14;
        this.anchorOffsetY = d15;
        this.interpolatedScaleAspectRatio = d16;
        this.featureMapWidth = list;
        this.featureMapHeight = list2;
        this.strides = list3;
        this.aspectRatios = list4;
        this.isFixedAnchorSize = z12;
        this.isReduceBoxesInLowestLayer = z13;
    }
}
