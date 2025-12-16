package ru.cyberity.cbr.core.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;

/* compiled from: CBRBitmapExtensions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0004\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u000e\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0012\u001a\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0013*\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0014\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0006*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0015\u001a!\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Ljava/io/File;", "", "maxPhotoDimension", "Landroid/graphics/Bitmap;", "a", "(Ljava/io/File;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "filePath", "reqWidth", "reqHeight", "b", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "Landroid/graphics/BitmapFactory$Options;", "options", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/content/Context;", "context", "filePrefix", "(Landroid/graphics/Bitmap;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/InputStream;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/io/File;)Ljava/lang/String;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class i {

    /* compiled from: CBRBitmapExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/io/ByteArrayInputStream;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/io/ByteArrayInputStream;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRBitmapExtensionsKt$asJpegInputStream$2", f = "CBRBitmapExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super ByteArrayInputStream>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f432691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f432691b = bitmap;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super ByteArrayInputStream> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f432691b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432690a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (!this.f432691b.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream)) {
                    return null;
                }
                byteArrayOutputStream.flush();
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
                return null;
            }
        }
    }

    /* compiled from: CBRBitmapExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRBitmapExtensionsKt$decodeImage$2", f = "CBRBitmapExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super Bitmap>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432692a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f432694c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f432695d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, int i12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f432694c = file;
            this.f432695d = i12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super Bitmap> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f432694c, this.f432695d, continuation);
            bVar.f432693b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Bitmap bitmapB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432692a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            T t12 = (T) this.f432693b;
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(this.f432694c);
            try {
                String absolutePath = this.f432694c.getAbsolutePath();
                int i12 = this.f432695d;
                bitmapB = i.b(absolutePath, i12, i12);
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), "Error while decoding image", th2);
                bitmapB = null;
            }
            if (bitmapB == null) {
                return null;
            }
            if (aVar.n() == 0) {
                return bitmapB;
            }
            int width = bitmapB.getWidth();
            int height = bitmapB.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate(aVar.n());
            G0 g02 = G0.f406611a;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapB, 0, 0, width, height, matrix, true);
            bitmapB.recycle();
            return bitmapCreateBitmap;
        }
    }

    /* compiled from: CBRBitmapExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRBitmapExtensionsKt$decodePdf$2", f = "CBRBitmapExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super Bitmap>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432696a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432697b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f432698c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f432699d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f432698c = file;
            this.f432699d = i12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super Bitmap> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f432698c, this.f432699d, continuation);
            cVar.f432697b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            int iB2;
            int iB3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432696a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            T t12 = (T) this.f432697b;
            try {
                PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(this.f432698c, 268435456));
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                if (pageOpenPage.getWidth() < pageOpenPage.getHeight()) {
                    iB2 = kotlin.math.b.b((pageOpenPage.getWidth() / pageOpenPage.getHeight()) * this.f432699d);
                } else {
                    iB2 = this.f432699d;
                }
                if (pageOpenPage.getHeight() < pageOpenPage.getWidth()) {
                    iB3 = kotlin.math.b.b((pageOpenPage.getHeight() / pageOpenPage.getWidth()) * this.f432699d);
                } else {
                    iB3 = this.f432699d;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB2, iB3, Bitmap.Config.ARGB_8888);
                pageOpenPage.render(bitmapCreateBitmap, new Rect(0, 0, iB2, iB3), null, 1);
                pageOpenPage.close();
                pdfRenderer.close();
                return bitmapCreateBitmap;
            } catch (Exception e12) {
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                String strA = ru.cyberity.log.c.a(t12);
                String message = e12.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(strA, message, e12);
                return null;
            }
        }
    }

    /* compiled from: CBRBitmapExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/io/File;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/io/File;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRBitmapExtensionsKt$saveToTempJpgFile$2", f = "CBRBitmapExtensions.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f432701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f432702c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f432703d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, String str, Context context, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f432701b = bitmap;
            this.f432702c = str;
            this.f432703d = context;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super File> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f432701b, this.f432702c, this.f432703d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432700a;
            if (i12 == 0) {
                C42729a0.b(obj);
                Bitmap bitmap = this.f432701b;
                this.f432700a = 1;
                obj = i.a(bitmap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            InputStream inputStream = (InputStream) obj;
            if (inputStream == null) {
                return null;
            }
            try {
                File fileCreateTempFile = File.createTempFile(this.f432702c, ".jpg", this.f432703d.getCacheDir());
                if (n.a(inputStream, new FileOutputStream(fileCreateTempFile))) {
                    return fileCreateTempFile;
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap b(String str, int i12, int i13) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i12, i13);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    private static final int a(BitmapFactory.Options options, int i12, int i13) {
        Integer numValueOf = Integer.valueOf(options.outHeight);
        Integer numValueOf2 = Integer.valueOf(options.outWidth);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int i14 = 1;
        if (iIntValue > i13 || iIntValue2 > i12) {
            int i15 = iIntValue / 2;
            int i16 = iIntValue2 / 2;
            while (i15 / i14 >= i13 && i16 / i14 >= i12) {
                i14 *= 2;
            }
        }
        return i14;
    }

    @Y61.l
    public static final String a(@Y61.k File file) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    @Y61.l
    public static final Object b(@Y61.k File file, int i12, @Y61.k Continuation<? super Bitmap> continuation) {
        return C43259k.g(C43262l0.f411947c, new c(file, i12, null), continuation);
    }

    @Y61.l
    public static final Object a(@Y61.k Bitmap bitmap, @Y61.k Context context, @Y61.k String str, @Y61.k Continuation<? super File> continuation) {
        return C43259k.g(C43262l0.f411947c, new d(bitmap, str, context, null), continuation);
    }

    @Y61.l
    public static final Object a(@Y61.k Bitmap bitmap, @Y61.k Continuation<? super InputStream> continuation) {
        return C43259k.g(C43262l0.f411947c, new a(bitmap, null), continuation);
    }

    @Y61.l
    public static final Object a(@Y61.k File file, int i12, @Y61.k Continuation<? super Bitmap> continuation) {
        return C43259k.g(C43262l0.f411947c, new b(file, i12, null), continuation);
    }
}
