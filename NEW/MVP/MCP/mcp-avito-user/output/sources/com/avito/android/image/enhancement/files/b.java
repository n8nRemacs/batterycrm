package com.avito.android.image.enhancement.files;

import Y61.k;
import android.content.Context;
import android.net.Uri;
import com.avito.android.util.C35836l1;
import io.reactivex.rxjava3.internal.operators.observable.C41964k1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceFileConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/files/b;", "Lcom/avito/android/image/enhancement/files/a;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.image.enhancement.files.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f169366a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.photo_picker.converter.f f169367b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f169368c = C42727D.c(new a());

    /* compiled from: ImageEnhanceFileConverter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<File> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File file = new File(b.this.f169366a.getCacheDir(), "image-enhance-cache");
            C35836l1.a(file);
            return file;
        }
    }

    public b(@k Context context, @k com.avito.android.photo_picker.converter.f fVar) {
        this.f169366a = context;
        this.f169367b = fVar;
    }

    @Override // com.avito.android.image.enhancement.files.a
    @k
    public final File a() {
        File file = (File) this.f169368c.getValue();
        C35836l1.a(file);
        return File.createTempFile("image", ".jpg", file);
    }

    @Override // com.avito.android.image.enhancement.files.a
    @k
    public final C41964k1 b(@k Uri uri) {
        return new C41964k1(this.f169367b.a(uri), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    @Override // com.avito.android.image.enhancement.files.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File c(@Y61.k android.net.Uri r6) {
        /*
            r5 = this;
            com.facebook.common.internal.i<com.facebook.imagepipeline.request.ImageRequest, android.net.Uri> r0 = com.facebook.imagepipeline.request.ImageRequest.f340780o
            r0 = 0
            if (r6 != 0) goto L7
            r6 = r0
            goto Lf
        L7:
            com.facebook.imagepipeline.request.ImageRequestBuilder r6 = com.facebook.imagepipeline.request.ImageRequestBuilder.b(r6)
            com.facebook.imagepipeline.request.ImageRequest r6 = r6.a()
        Lf:
            if (r6 != 0) goto L12
            return r0
        L12:
            com.facebook.imagepipeline.cache.v r1 = com.facebook.imagepipeline.cache.v.e()
            r1.getClass()
            android.net.Uri r6 = r6.f340782b
            com.facebook.cache.common.j r6 = r1.d(r6)
            com.facebook.imagepipeline.core.u r1 = com.facebook.imagepipeline.core.u.f340344t
            java.lang.String r2 = "ImagePipelineFactory was not initialized!"
            com.facebook.common.internal.o.c(r1, r2)
            com.facebook.cache.disk.k r2 = r1.f340353i
            com.facebook.imagepipeline.core.r r3 = r1.f340346b
            if (r2 != 0) goto L36
            com.facebook.cache.disk.d r2 = r3.f340312k
            com.facebook.imagepipeline.core.c r4 = r3.f340307f
            com.facebook.cache.disk.g r2 = r4.a(r2)
            r1.f340353i = r2
        L36:
            com.facebook.cache.disk.k r2 = r1.f340353i
            com.facebook.cache.disk.k r4 = r1.f340360p
            if (r4 != 0) goto L46
            com.facebook.cache.disk.d r4 = r3.f340321t
            com.facebook.imagepipeline.core.c r3 = r3.f340307f
            com.facebook.cache.disk.g r3 = r3.a(r4)
            r1.f340360p = r3
        L46:
            com.facebook.cache.disk.k r1 = r1.f340360p
            r3 = 2
            com.facebook.cache.disk.k[] r3 = new com.facebook.cache.disk.k[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 1
            r3[r2] = r1
            java.util.List r1 = kotlin.collections.C42745f0.U(r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            com.facebook.cache.disk.k r2 = (com.facebook.cache.disk.k) r2
            pW0.a r2 = r2.a(r6)
            if (r2 == 0) goto L7a
            boolean r3 = r2 instanceof pW0.C47024c
            if (r3 == 0) goto L74
            pW0.c r2 = (pW0.C47024c) r2
            goto L75
        L74:
            r2 = r0
        L75:
            if (r2 == 0) goto L7a
            java.io.File r2 = r2.f428572a
            goto L7b
        L7a:
            r2 = r0
        L7b:
            if (r2 == 0) goto L5b
            r0 = r2
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.image.enhancement.files.b.c(android.net.Uri):java.io.File");
    }

    @Override // com.avito.android.image.enhancement.files.a
    @k
    public final File d(@k InputStream inputStream) {
        File fileA = a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i12 = inputStream.read(bArr);
                    if (i12 == -1) {
                        fileOutputStream.flush();
                        G0 g02 = G0.f406611a;
                        kotlin.io.c.a(fileOutputStream, null);
                        kotlin.io.c.a(inputStream, null);
                        return fileA;
                    }
                    fileOutputStream.write(bArr, 0, i12);
                }
            } finally {
            }
        } finally {
        }
    }
}
