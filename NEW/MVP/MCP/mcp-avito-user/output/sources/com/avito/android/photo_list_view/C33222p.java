package com.avito.android.photo_list_view;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageListPhotoInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photoList", "Lcom/avito/android/photo_list_view/G;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_list_view.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33222p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33223q f218177b;

    public C33222p(C33223q c33223q) {
        this.f218177b = c33223q;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r20
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r0.next()
            com.avito.android.photo_cache.PhotoUpload r2 = (com.avito.android.photo_cache.PhotoUpload) r2
            r3 = r19
            com.avito.android.photo_list_view.q r4 = r3.f218177b
            r4.getClass()
            java.lang.String r4 = r2.f216304f
            if (r4 == 0) goto L37
            int r4 = r4.length()
            if (r4 != 0) goto L33
            goto L37
        L33:
            com.avito.android.photo_list_view.b$b$a r4 = com.avito.android.photo_list_view.InterfaceC33208b.InterfaceC6540b.a.f218117a
        L35:
            r10 = r4
            goto L61
        L37:
            com.avito.android.remote.model.ErrorType$NoError r4 = com.avito.android.remote.model.ErrorType.NoError.INSTANCE
            com.avito.android.remote.model.ErrorType r5 = r2.f216307i
            boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
            if (r4 == 0) goto L44
            com.avito.android.photo_list_view.b$b$c r4 = com.avito.android.photo_list_view.InterfaceC33208b.InterfaceC6540b.c.f218119a
            goto L35
        L44:
            com.avito.android.remote.model.ErrorType$RestorableError r4 = com.avito.android.remote.model.ErrorType.RestorableError.INSTANCE
            boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
            r6 = 1
            if (r4 == 0) goto L53
            com.avito.android.photo_list_view.b$b$b r4 = new com.avito.android.photo_list_view.b$b$b
            r4.<init>(r6)
            goto L35
        L53:
            com.avito.android.remote.model.ErrorType$NonRestorableError r4 = com.avito.android.remote.model.ErrorType.NonRestorableError.INSTANCE
            boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
            if (r4 == 0) goto L9f
            com.avito.android.photo_list_view.b$b$b r4 = new com.avito.android.photo_list_view.b$b$b
            r4.<init>(r6)
            goto L35
        L61:
            long r4 = r2.f216300b
            java.lang.String r8 = java.lang.String.valueOf(r4)
            com.avito.android.photo_cache.EnhanceState r4 = r2.f216311m
            boolean r15 = r4.f216292b
            android.net.Uri r4 = r2.f216310l
            android.net.Uri r5 = r2.f216308j
            android.net.Uri r6 = r2.f216305g
            if (r15 == 0) goto L7d
            if (r6 != 0) goto L7b
            if (r5 != 0) goto L79
        L77:
            r9 = r4
            goto L82
        L79:
            r9 = r5
            goto L82
        L7b:
            r9 = r6
            goto L82
        L7d:
            if (r4 != 0) goto L77
            if (r6 != 0) goto L7b
            goto L79
        L82:
            java.lang.String r4 = r2.f216304f
            if (r4 != 0) goto L88
            java.lang.String r4 = ""
        L88:
            r12 = r4
            com.avito.android.photo_list_view.G r4 = new com.avito.android.photo_list_view.G
            r17 = 104(0x68, float:1.46E-43)
            r18 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            java.lang.String r2 = r2.f216309k
            r7 = r4
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.add(r4)
            goto L15
        L9f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        La5:
            r3 = r19
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_list_view.C33222p.apply(java.lang.Object):java.lang.Object");
    }
}
