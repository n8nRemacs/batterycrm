package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.InterfaceC36428e;
import java.util.Map;
import java.util.concurrent.Executor;

@Nullsafe
/* loaded from: classes15.dex */
public class LocalExifThumbnailProducer implements C0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f340569a;

    /* renamed from: b, reason: collision with root package name */
    public final wW0.g f340570b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f340571c;

    @InterfaceC36428e
    public class Api24Utils {
        public Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, a aVar) {
        }
    }

    public class a extends u0<YW0.d> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f340572g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36410l interfaceC36410l, m0 m0Var, k0 k0Var, ImageRequest imageRequest) {
            super(interfaceC36410l, m0Var, k0Var, "LocalExifThumbnailProducer");
            this.f340572g = imageRequest;
        }

        @Override // com.facebook.common.executors.h
        public final void b(@I41.h Object obj) {
            YW0.d.b((YW0.d) obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[Catch: IOException -> 0x0059, StackOverflowError -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0059, StackOverflowError -> 0x009b, blocks: (B:28:0x005b, B:30:0x0066, B:32:0x006c, B:33:0x0072, B:35:0x007e, B:39:0x0088), top: B:69:0x005b }] */
        @Override // com.facebook.common.executors.h
        @I41.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.a.c():java.lang.Object");
        }

        @Override // com.facebook.imagepipeline.producers.u0
        public final Map g(@I41.h YW0.d dVar) {
            return com.facebook.common.internal.k.a("createdThumbnail", Boolean.toString(dVar != null));
        }
    }

    public class b extends C36401e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f340574a;

        public b(u0 u0Var) {
            this.f340574a = u0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
        public final void c() {
            this.f340574a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, wW0.g gVar, ContentResolver contentResolver) {
        this.f340569a = executor;
        this.f340570b = gVar;
        this.f340571c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.C0
    public final boolean a(@I41.h UW0.d dVar) {
        return D0.a(512, 512, dVar);
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        m0 m0VarI = k0Var.i();
        ImageRequest imageRequestJ = k0Var.j();
        k0Var.k("local", "exif");
        a aVar = new a(interfaceC36410l, m0VarI, k0Var, imageRequestJ);
        k0Var.b(new b(aVar));
        this.f340569a.execute(aVar);
    }
}
