package ru.cyberity.cbr.core.domain;

import TZ0.e;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.camera2.internal.compat.workaround.v;
import com.google.android.gms.tasks.Task;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.domain.a;

/* compiled from: MLKitFaceDetector.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J3\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0014H\u0017¢\u0006\u0004\b\r\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/domain/f;", "Lru/cyberity/cbr/core/domain/a;", "<init>", "()V", "Landroid/graphics/RectF;", "capturingBox", "LTZ0/a;", "face", "Landroid/graphics/Bitmap;", "image", "Landroid/util/Size;", "trackSize", "Lru/cyberity/cbr/core/domain/a$a;", "a", "(Landroid/graphics/RectF;LTZ0/a;Landroid/graphics/Bitmap;Landroid/util/Size;)Lru/cyberity/cbr/core/domain/a$a;", "Lkotlin/G0;", "start", "stop", "imageBitmap", "capturingRect", "Lkotlin/Function1;", "onResult", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;LY41/l;)V", "LTZ0/d;", "LTZ0/d;", "detector", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f implements ru.cyberity.cbr.core.domain.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private static final a f433936c = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private TZ0.d detector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String name = "MLKit";

    /* compiled from: MLKitFaceDetector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/domain/f$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        private a() {
        }
    }

    @Override // ru.cyberity.cbr.core.domain.a
    @SuppressLint({"UnsafeOptInUsageError"})
    public void a(@Y61.k Bitmap imageBitmap, @Y61.k RectF capturingRect, @Y61.k Y41.l<? super a.AbstractC12480a, G0> onResult) {
        Task<List<TZ0.a>> taskGQ;
        e eVar = e.f433935a;
        e.a(eVar, "MLKitFaceDetector", "@processImage()", null, 4, null);
        if (this.detector == null) {
            e.a(eVar, "MLKitFaceDetector", "@processImage(), detector is null", null, 4, null);
            onResult.invoke(new a.AbstractC12480a.c(imageBitmap));
            return;
        }
        e.a(eVar, "MLKitFaceDetector", "@processImage(), creating InputImage from Bitmap", null, 4, null);
        com.google.mlkit.vision.common.a aVarA = com.google.mlkit.vision.common.a.a(imageBitmap);
        e.a(eVar, "MLKitFaceDetector", "@processImage(), InputImage created", null, 4, null);
        e.a(eVar, "MLKitFaceDetector", "@processImage(), starting analyzing frame", null, 4, null);
        TZ0.d dVar = this.detector;
        if (dVar == null || (taskGQ = dVar.gQ(aVarA)) == null) {
            return;
        }
        taskGQ.g(new v(onResult, imageBitmap, this, capturingRect, 5));
        taskGQ.e(new com.avito.android.gig_shift_action.ui.a(28, onResult, imageBitmap));
    }

    @Override // ru.cyberity.cbr.core.domain.a
    @Y61.k
    public String getName() {
        return this.name;
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void start() {
        e eVar = e.f433935a;
        e.a(eVar, "MLKitFaceDetector", "@start()", null, 4, null);
        stop();
        e.a aVar = new e.a();
        aVar.f15726d = 1;
        aVar.f15723a = 1;
        aVar.f15725c = 1;
        aVar.f15727e = 0.4f;
        this.detector = TZ0.c.a(aVar.a());
        e.a(eVar, "MLKitFaceDetector", "@start(), started", null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.domain.a
    public void stop() {
        e eVar = e.f433935a;
        e.a(eVar, "MLKitFaceDetector", "@stop()", null, 4, null);
        TZ0.d dVar = this.detector;
        if (dVar != null) {
            dVar.close();
        }
        this.detector = null;
        e.a(eVar, "MLKitFaceDetector", "@stop(), stopped", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.l lVar, Bitmap bitmap, f fVar, RectF rectF, List list) {
        a.AbstractC12480a abstractC12480aA;
        e eVar = e.f433935a;
        e.a(eVar, "MLKitFaceDetector", "@processImage(), success", null, 4, null);
        if (list.isEmpty()) {
            e.a(eVar, "MLKitFaceDetector", "@processImage(), no faces found", null, 4, null);
            abstractC12480aA = new a.AbstractC12480a.c(bitmap);
        } else if (list.size() > 1) {
            e.a(eVar, "MLKitFaceDetector", "@processImage(), more than 1 faces found", null, 4, null);
            abstractC12480aA = new a.AbstractC12480a.e(bitmap);
        } else {
            abstractC12480aA = fVar.a(rectF, (TZ0.a) C42745f0.E(list), bitmap, new Size(bitmap.getWidth(), bitmap.getHeight()));
        }
        lVar.invoke(abstractC12480aA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.l lVar, Bitmap bitmap, Exception exc) {
        e.f433935a.a("MLKitFaceDetector", "@processImage(), failed to analyze", exc);
        lVar.invoke(new a.AbstractC12480a.C12481a(bitmap, exc));
    }

    private final a.AbstractC12480a a(RectF capturingBox, TZ0.a face, Bitmap image, Size trackSize) {
        e eVar = e.f433935a;
        e.a(eVar, "MLKitFaceDetector", "@processFace(), got " + image.getWidth() + 'x' + image.getHeight() + " frame", null, 4, null);
        Rect rect = face.f15704a;
        RectF rectF = new RectF((((float) trackSize.getWidth()) - ((float) rect.right)) / ((float) trackSize.getWidth()), ((float) rect.top) / ((float) trackSize.getHeight()), (((float) trackSize.getWidth()) - ((float) rect.left)) / ((float) trackSize.getWidth()), ((float) rect.bottom) / ((float) trackSize.getHeight()));
        if (capturingBox.contains(rectF)) {
            e.a(eVar, "MLKitFaceDetector", "@processFace(), face is in capture box", null, 4, null);
            return new a.AbstractC12480a.b(image, trackSize, rectF);
        }
        e.a(eVar, "MLKitFaceDetector", "@processFace(), face is NOT in capture box", null, 4, null);
        return new a.AbstractC12480a.d(image, rectF);
    }
}
