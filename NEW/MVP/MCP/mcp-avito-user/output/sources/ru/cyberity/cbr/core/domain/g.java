package ru.cyberity.cbr.core.domain;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.util.Size;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import ru.cyberity.cbr.core.domain.a;

/* compiled from: NativeFaceDetector.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\b\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u00060\fR\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J3\u0010\b\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130\u0017H\u0017¢\u0006\u0004\b\b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/cyberity/cbr/core/domain/g;", "Lru/cyberity/cbr/core/domain/a;", "<init>", "()V", "Landroid/graphics/Bitmap;", "imageBitmap", "Lkotlin/Q;", "Landroid/media/FaceDetector;", "a", "(Landroid/graphics/Bitmap;)Lkotlin/Q;", "Landroid/graphics/RectF;", "capturingBox", "Landroid/media/FaceDetector$Face;", "face", "image", "Landroid/util/Size;", "trackSize", "Lru/cyberity/cbr/core/domain/a$a;", "(Landroid/graphics/RectF;Landroid/media/FaceDetector$Face;Landroid/graphics/Bitmap;Landroid/util/Size;)Lru/cyberity/cbr/core/domain/a$a;", "Lkotlin/G0;", "start", "stop", "capturingRect", "Lkotlin/Function1;", "onResult", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;LY41/l;)V", "Landroid/media/FaceDetector;", "detector", "", "b", "I", "detectorWidth", "c", "detectorHeight", "Lru/cyberity/cbr/core/common/e;", "d", "Lru/cyberity/cbr/core/common/e;", "bufferBitmap", "", "e", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "f", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private FaceDetector detector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int detectorWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int detectorHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.common.e bufferBitmap = new ru.cyberity.cbr.core.common.e(Bitmap.Config.RGB_565);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String name = "Native";

    private final Q<Bitmap, FaceDetector> a(Bitmap imageBitmap) {
        e eVar = e.f433935a;
        e.a(eVar, "NativeFaceDetector", "@prepareDetector()", null, 4, null);
        int width = imageBitmap.getWidth();
        int height = imageBitmap.getHeight();
        e.a(eVar, "NativeFaceDetector", "@prepareDetector(), got bitmap of size " + width + 'x' + height, null, 4, null);
        FaceDetector faceDetector = this.detector;
        if (faceDetector != null && this.detectorWidth == width && this.detectorHeight == height) {
            e.a(eVar, "NativeFaceDetector", "@prepareDetector(), reuse old FaceDetector", null, 4, null);
        } else {
            e.a(eVar, "NativeFaceDetector", "@prepareDetector(), create FaceDetector", null, 4, null);
            this.detectorWidth = width;
            this.detectorHeight = height;
            faceDetector = new FaceDetector(width, height, 1);
        }
        this.detector = faceDetector;
        e.a(eVar, "NativeFaceDetector", "@prepareDetector(), making RGB565 copy of Bitmap", null, 4, null);
        Bitmap bitmapA = this.bufferBitmap.a(width, height);
        new Canvas(bitmapA).drawBitmap(imageBitmap, 0.0f, 0.0f, (Paint) null);
        e.a(eVar, "NativeFaceDetector", "@prepareDetector(), RGB565 copy made", null, 4, null);
        return new Q<>(bitmapA, faceDetector);
    }

    @Override // ru.cyberity.cbr.core.domain.a
    @Y61.k
    public String getName() {
        return this.name;
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void start() {
        e.a(e.f433935a, "NativeFaceDetector", "@start()", null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void stop() {
        e.a(e.f433935a, "NativeFaceDetector", "@stop()", null, 4, null);
        this.detector = null;
        this.detectorWidth = 0;
        this.detectorHeight = 0;
        this.bufferBitmap.a();
    }

    @Override // ru.cyberity.cbr.core.domain.a
    @SuppressLint({"UnsafeOptInUsageError"})
    public void a(@Y61.k Bitmap imageBitmap, @Y61.k RectF capturingRect, @Y61.k Y41.l<? super a.AbstractC12480a, G0> onResult) {
        a.AbstractC12480a cVar;
        try {
            e eVar = e.f433935a;
            e.a(eVar, "NativeFaceDetector", "@processImage(), got " + imageBitmap.getWidth() + 'x' + imageBitmap.getHeight() + " frame", null, 4, null);
            FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
            Q<Bitmap, FaceDetector> qA2 = a(imageBitmap);
            e.a(eVar, "NativeFaceDetector", "@processImage(), detector prepared, trying to find faces", null, 4, null);
            qA2.f406620c.findFaces(qA2.f406619b, faceArr);
            int size = C42756l.B(faceArr).size();
            e.a(eVar, "NativeFaceDetector", "@processImage(), " + size + " found", null, 4, null);
            if (size == 0) {
                cVar = new a.AbstractC12480a.c(imageBitmap);
            } else if (size != 1) {
                cVar = new a.AbstractC12480a.e(imageBitmap);
            } else {
                FaceDetector.Face face = faceArr[0];
                if (face != null) {
                    cVar = a(capturingRect, face, imageBitmap, new Size(imageBitmap.getWidth(), imageBitmap.getHeight()));
                } else {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        } catch (Exception e12) {
            e eVar2 = e.f433935a;
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            eVar2.a("NativeFaceDetector", message, e12);
            cVar = new a.AbstractC12480a.c(imageBitmap);
        }
        onResult.invoke(cVar);
    }

    private final a.AbstractC12480a a(RectF capturingBox, FaceDetector.Face face, Bitmap image, Size trackSize) {
        if (face.confidence() < 0.3f) {
            e.a(e.f433935a, "NativeFaceDetector", "@processFace(), face confidence is too low (" + face.confidence() + ')', null, 4, null);
            return new a.AbstractC12480a.c(image);
        }
        PointF pointF = new PointF();
        face.getMidPoint(pointF);
        RectF rectF = new RectF(pointF.x - face.eyesDistance(), ((int) pointF.y) - (face.eyesDistance() * 1.5f), face.eyesDistance() + ((int) pointF.x), (face.eyesDistance() * 1.5f) + ((int) pointF.y));
        RectF rectF2 = new RectF((trackSize.getWidth() - rectF.right) / trackSize.getWidth(), rectF.top / trackSize.getHeight(), (trackSize.getWidth() - rectF.left) / trackSize.getWidth(), rectF.bottom / trackSize.getHeight());
        if (capturingBox.contains(rectF2)) {
            e.a(e.f433935a, "NativeFaceDetector", "@processFace(), face is in capture box", null, 4, null);
            return new a.AbstractC12480a.b(image, trackSize, rectF2);
        }
        e.a(e.f433935a, "NativeFaceDetector", "@processFace(), face is NOT in capture box", null, 4, null);
        return new a.AbstractC12480a.d(image, rectF2);
    }
}
