package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: LocalVideoThumbnailProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class Q implements i0<com.facebook.common.references.a<YW0.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f340589a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f340590b;

    /* compiled from: LocalVideoThumbnailProducer.java */
    public class a extends u0<com.facebook.common.references.a<YW0.b>> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f340591g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k0 f340592h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f340593i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36410l interfaceC36410l, m0 m0Var, k0 k0Var, m0 m0Var2, k0 k0Var2, ImageRequest imageRequest) {
            super(interfaceC36410l, m0Var, k0Var, "VideoThumbnailProducer");
            this.f340591g = m0Var2;
            this.f340592h = k0Var2;
            this.f340593i = imageRequest;
        }

        @Override // com.facebook.common.executors.h
        public final void b(Object obj) {
            com.facebook.common.references.a.c((com.facebook.common.references.a) obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
        @Override // com.facebook.common.executors.h
        @I41.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c() throws java.lang.IllegalArgumentException, java.io.FileNotFoundException {
            /*
                r6 = this;
                com.facebook.imagepipeline.producers.Q r0 = com.facebook.imagepipeline.producers.Q.this
                com.facebook.imagepipeline.request.ImageRequest r1 = r6.f340593i
                r2 = 0
                java.lang.String r3 = com.facebook.imagepipeline.producers.Q.c(r0, r1)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r3 = r2
            Lb:
                if (r3 == 0) goto L2a
                UW0.d r0 = r1.f340786f
                r1 = 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L16
                int r4 = r0.f16412a
                goto L17
            L16:
                r4 = r1
            L17:
                r5 = 96
                if (r4 > r5) goto L24
                if (r0 == 0) goto L1f
                int r1 = r0.f16413b
            L1f:
                if (r1 <= r5) goto L22
                goto L24
            L22:
                r0 = 3
                goto L25
            L24:
                r0 = 1
            L25:
                android.graphics.Bitmap r0 = android.media.ThumbnailUtils.createVideoThumbnail(r3, r0)
                goto L4b
            L2a:
                android.content.ContentResolver r0 = r0.f340590b
                android.net.Uri r1 = r1.f340782b
                java.lang.String r3 = "r"
                android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r3)     // Catch: java.io.FileNotFoundException -> L4a
                r0.getClass()     // Catch: java.io.FileNotFoundException -> L4a
                android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.io.FileNotFoundException -> L4a
                r1.<init>()     // Catch: java.io.FileNotFoundException -> L4a
                java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.io.FileNotFoundException -> L4a
                r1.setDataSource(r0)     // Catch: java.io.FileNotFoundException -> L4a
                r3 = -1
                android.graphics.Bitmap r0 = r1.getFrameAtTime(r3)     // Catch: java.io.FileNotFoundException -> L4a
                goto L4b
            L4a:
                r0 = r2
            L4b:
                if (r0 != 0) goto L4e
                goto L6d
            L4e:
                YW0.c r1 = new YW0.c
                com.facebook.imagepipeline.bitmaps.h r2 = com.facebook.imagepipeline.bitmaps.h.b()
                YW0.g r3 = YW0.g.f19507d
                r1.<init>(r0, r2, r3)
                java.lang.String r0 = "image_format"
                java.lang.String r2 = "thumbnail"
                com.facebook.imagepipeline.producers.k0 r3 = r6.f340592h
                r3.e(r2, r0)
                java.util.HashMap r0 = r3.getExtras()
                r1.c(r0)
                com.facebook.common.references.a r2 = com.facebook.common.references.a.m(r1)
            L6d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.Q.a.c():java.lang.Object");
        }

        @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
        public final void e(Exception exc) {
            super.e(exc);
            m0 m0Var = this.f340591g;
            k0 k0Var = this.f340592h;
            m0Var.b(k0Var, "VideoThumbnailProducer", false);
            k0Var.l("local");
        }

        @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
        public final void f(@I41.h Object obj) {
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            super.f(aVar);
            boolean z12 = aVar != null;
            m0 m0Var = this.f340591g;
            k0 k0Var = this.f340592h;
            m0Var.b(k0Var, "VideoThumbnailProducer", z12);
            k0Var.l("local");
        }

        @Override // com.facebook.imagepipeline.producers.u0
        public final Map g(@I41.h com.facebook.common.references.a<YW0.b> aVar) {
            return com.facebook.common.internal.k.a("createdThumbnail", String.valueOf(aVar != null));
        }
    }

    /* compiled from: LocalVideoThumbnailProducer.java */
    public class b extends C36401e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f340595a;

        public b(u0 u0Var) {
            this.f340595a = u0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
        public final void c() {
            this.f340595a.a();
        }
    }

    public Q(Executor executor, ContentResolver contentResolver) {
        this.f340589a = executor;
        this.f340590b = contentResolver;
    }

    public static String c(Q q12, ImageRequest imageRequest) {
        Uri uri;
        String str;
        String[] strArr;
        q12.getClass();
        Uri uri2 = imageRequest.f340782b;
        if ("file".equals(com.facebook.common.util.g.a(uri2))) {
            return imageRequest.a().getPath();
        }
        if ("content".equals(com.facebook.common.util.g.a(uri2))) {
            if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri2);
                documentId.getClass();
                Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                uri3.getClass();
                str = "_id=?";
                uri = uri3;
                strArr = new String[]{documentId.split(":")[1]};
            } else {
                uri = uri2;
                str = null;
                strArr = null;
            }
            Cursor cursorQuery = q12.f340590b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    cursorQuery.close();
                }
            }
            if (cursorQuery != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        m0 m0VarI = k0Var.i();
        ImageRequest imageRequestJ = k0Var.j();
        k0Var.k("local", "video");
        a aVar = new a(interfaceC36410l, m0VarI, k0Var, m0VarI, k0Var, imageRequestJ);
        k0Var.b(new b(aVar));
        this.f340589a.execute(aVar);
    }
}
