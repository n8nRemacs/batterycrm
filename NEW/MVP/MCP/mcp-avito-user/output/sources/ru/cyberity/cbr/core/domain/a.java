package ru.cyberity.cbr.core.domain;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CBRFaceDetector.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\n\u0013J3\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/domain/a;", "", "Landroid/graphics/Bitmap;", "imageBitmap", "Landroid/graphics/RectF;", "capturingRect", "Lkotlin/Function1;", "Lru/cyberity/cbr/core/domain/a$a;", "Lkotlin/G0;", "onResult", "a", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;LY41/l;)V", "start", "()V", "stop", "", "getName", "()Ljava/lang/String;", "name", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface a {

    /* compiled from: CBRFaceDetector.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a;", "", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;)V", "b", "c", "d", "e", "Lru/cyberity/cbr/core/domain/a$a$a;", "Lru/cyberity/cbr/core/domain/a$a$b;", "Lru/cyberity/cbr/core/domain/a$a$c;", "Lru/cyberity/cbr/core/domain/a$a$d;", "Lru/cyberity/cbr/core/domain/a$a$e;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.domain.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC12480a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Bitmap image;

        /* compiled from: CBRFaceDetector.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a$a;", "Lru/cyberity/cbr/core/domain/a$a;", "", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "e", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.domain.a$a$a, reason: collision with other inner class name */
        public static final class C12481a extends AbstractC12480a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final Throwable e;

            public C12481a(@Y61.k Bitmap bitmap, @Y61.k Throwable th2) {
                super(bitmap, null);
                this.e = th2;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final Throwable getE() {
                return this.e;
            }
        }

        /* compiled from: CBRFaceDetector.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a$b;", "Lru/cyberity/cbr/core/domain/a$a;", "Landroid/util/Size;", "b", "Landroid/util/Size;", "c", "()Landroid/util/Size;", "trackSize", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "()Landroid/graphics/RectF;", "faceBox", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;Landroid/util/Size;Landroid/graphics/RectF;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.domain.a$a$b */
        public static final class b extends AbstractC12480a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final Size trackSize;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final RectF faceBox;

            public b(@Y61.k Bitmap bitmap, @Y61.k Size size, @Y61.k RectF rectF) {
                super(bitmap, null);
                this.trackSize = size;
                this.faceBox = rectF;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final RectF getFaceBox() {
                return this.faceBox;
            }

            @Y61.k
            /* renamed from: c, reason: from getter */
            public final Size getTrackSize() {
                return this.trackSize;
            }
        }

        /* compiled from: CBRFaceDetector.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a$c;", "Lru/cyberity/cbr/core/domain/a$a;", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.domain.a$a$c */
        public static final class c extends AbstractC12480a {
            public c(@Y61.k Bitmap bitmap) {
                super(bitmap, null);
            }
        }

        /* compiled from: CBRFaceDetector.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a$d;", "Lru/cyberity/cbr/core/domain/a$a;", "Landroid/graphics/RectF;", "b", "Landroid/graphics/RectF;", "()Landroid/graphics/RectF;", "faceBox", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.domain.a$a$d */
        public static final class d extends AbstractC12480a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final RectF faceBox;

            public d(@Y61.k Bitmap bitmap, @Y61.k RectF rectF) {
                super(bitmap, null);
                this.faceBox = rectF;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final RectF getFaceBox() {
                return this.faceBox;
            }
        }

        /* compiled from: CBRFaceDetector.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/domain/a$a$e;", "Lru/cyberity/cbr/core/domain/a$a;", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.domain.a$a$e */
        public static final class e extends AbstractC12480a {
            public e(@Y61.k Bitmap bitmap) {
                super(bitmap, null);
            }
        }

        public /* synthetic */ AbstractC12480a(Bitmap bitmap, C42822w c42822w) {
            this(bitmap);
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        private AbstractC12480a(Bitmap bitmap) {
            this.image = bitmap;
        }
    }

    /* compiled from: CBRFaceDetector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/domain/a$b;", "", "", "width", "height", "", "jpeg", "<init>", "(II[B)V", "a", "I", "c", "()I", "b", "[B", "()[B", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final byte[] jpeg;

        public b(int i12, int i13, @Y61.k byte[] bArr) {
            this.width = i12;
            this.height = i13;
            this.jpeg = bArr;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final byte[] getJpeg() {
            return this.jpeg;
        }
    }

    void a(@Y61.k Bitmap imageBitmap, @Y61.k RectF capturingRect, @Y61.k Y41.l<? super AbstractC12480a, G0> onResult);

    @Y61.k
    String getName();

    void start();

    void stop();
}
