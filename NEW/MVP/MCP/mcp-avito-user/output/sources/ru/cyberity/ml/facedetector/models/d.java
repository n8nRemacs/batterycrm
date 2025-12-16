package ru.cyberity.ml.facedetector.models;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FaceDetectionOptions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0010"}, d2 = {"Lru/cyberity/ml/facedetector/models/d;", "", "", "a", "F", "b", "()F", "minConfidence", "", "I", "()I", "maxNumberOfFaces", "Lru/cyberity/ml/facedetector/models/d$a;", "builder", "<init>", "(Lru/cyberity/ml/facedetector/models/d$a;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float minConfidence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxNumberOfFaces;

    /* compiled from: FaceDetectionOptions.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \n2\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0011\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0007R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/cyberity/ml/facedetector/models/d$a;", "", "", "minConfidence", "a", "", "maxNumberOfFaces", "Lru/cyberity/ml/facedetector/models/d;", "<set-?>", "F", "c", "()F", "getMinConfidence$annotations", "()V", "b", "I", "()I", "<init>", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private float minConfidence = 0.5f;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int maxNumberOfFaces = -1;

        /* compiled from: FaceDetectionOptions.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/cyberity/ml/facedetector/models/d$a$a;", "", "<init>", "()V", "Lru/cyberity/ml/facedetector/models/d;", "options", "Lkotlin/G0;", "a", "(Lru/cyberity/ml/facedetector/models/d;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.ml.facedetector.models.d$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void a(d options) {
                if (options.getMaxNumberOfFaces() == 0 || options.getMaxNumberOfFaces() < -1) {
                    throw new IllegalArgumentException(("MaxNumberOfFaces must be greater than 0 or -1, maxNumberOfFaces: " + options.getMaxNumberOfFaces()).toString());
                }
                if (options.getMinConfidence() < 0.0f || options.getMinConfidence() > 1.0f) {
                    throw new IllegalArgumentException("MinConfidence must be between 0 and 1");
                }
            }
        }

        @k
        public final a a(float minConfidence) {
            this.minConfidence = minConfidence;
            return this;
        }

        /* renamed from: b, reason: from getter */
        public final int getMaxNumberOfFaces() {
            return this.maxNumberOfFaces;
        }

        /* renamed from: c, reason: from getter */
        public final float getMinConfidence() {
            return this.minConfidence;
        }

        @k
        public final a a(int maxNumberOfFaces) {
            this.maxNumberOfFaces = maxNumberOfFaces;
            return this;
        }

        @k
        public final d a() {
            d dVar = new d(this, null);
            INSTANCE.a(dVar);
            return dVar;
        }
    }

    public /* synthetic */ d(a aVar, C42822w c42822w) {
        this(aVar);
    }

    /* renamed from: a, reason: from getter */
    public final int getMaxNumberOfFaces() {
        return this.maxNumberOfFaces;
    }

    /* renamed from: b, reason: from getter */
    public final float getMinConfidence() {
        return this.minConfidence;
    }

    private d(a aVar) {
        this.minConfidence = aVar.getMinConfidence();
        this.maxNumberOfFaces = aVar.getMaxNumberOfFaces();
    }
}
