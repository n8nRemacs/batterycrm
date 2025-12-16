package com.avito.android.photo_cache;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.db.r;
import com.avito.android.photo_cache.b;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.util.C;
import com.avito.android.util.C35809h6;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.flowable.F;
import io.reactivex.rxjava3.internal.operators.observable.C41960j0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import tu.C48718a;

/* compiled from: PhotoInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_cache/c;", "Lcom/avito/android/photo_cache/b;", "a", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.photo_cache.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C f216312a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f216313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final b.InterfaceC6487b f216314c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Handler f216315d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Uri f216316e;

    /* compiled from: PhotoInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_cache/c$a;", "Lcom/avito/android/remote/model/CloseableDataSource;", "Lcom/avito/android/photo_cache/PhotoUpload;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements CloseableDataSource<PhotoUpload> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C f216317b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final tu.c f216318c;

        public a(@Y61.k C c12, @Y61.k tu.c cVar) {
            this.f216317b = c12;
            this.f216318c = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f216318c.close();
        }

        public final void finalize() {
            this.f216317b.getF125491k().getClass();
        }

        @Override // com.avito.android.remote.model.CloseableDataSource, UV0.a
        public final int getCount() {
            return this.f216318c.getCount();
        }

        @Override // com.avito.android.remote.model.CloseableDataSource, UV0.a
        public final Object getItem(int i12) {
            tu.c cVar = this.f216318c;
            if (!cVar.moveToPosition(i12)) {
                throw new IndexOutOfBoundsException();
            }
            String strF = cVar.f(tu.b.f439648h);
            Uri uri = null;
            Uri uri2 = (strF == null || strF.length() == 0) ? null : Uri.parse(strF);
            String strF2 = cVar.f(tu.b.f439651k);
            Uri uri3 = (strF2 == null || strF2.length() == 0) ? null : Uri.parse(strF2);
            String strF3 = cVar.f(tu.b.f439653m);
            if (strF3 != null && strF3.length() != 0) {
                uri = Uri.parse(strF3);
            }
            Uri uri4 = uri;
            kotlin.enums.a aVar = EnhanceState.f216291g;
            int iB2 = cVar.b(tu.b.f439654n);
            return new PhotoUpload(cVar.c("_id"), cVar.d(tu.b.f439643c), cVar.b(tu.b.f439645e), cVar.c(tu.b.f439646f), cVar.f(tu.b.f439647g), uri2, cVar.b(tu.b.f439649i), cVar.b(tu.b.f439650j), uri3, cVar.f(tu.b.f439652l), uri4, (EnhanceState) ((iB2 < 0 || iB2 > C42745f0.J(aVar)) ? EnhanceState.f216287c : aVar.get(iB2)));
        }

        @Override // com.avito.android.remote.model.CloseableDataSource, UV0.a
        public final boolean isEmpty() {
            return this.f216318c.getCount() == 0;
        }
    }

    /* compiled from: PhotoInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/db/r;", "observableQuery", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/CloseableDataSource;", "Lcom/avito/android/photo_cache/PhotoUpload;", "apply", "(Lcom/avito/android/db/r;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Cursor cursorRun = ((r) obj).run();
            return cursorRun != null ? z.c0(new a(c.this.f216312a, new tu.c(cursorRun))) : z.M(new NoPhotosException());
        }
    }

    /* compiled from: PhotoInteractor.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_cache/c$c", "Lcom/avito/android/db/r;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_cache.c$c, reason: collision with other inner class name */
    public static final class C6488c implements r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f216320a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f216321b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6488c(Y41.l<? super ContentResolver, ? extends Cursor> lVar, c cVar) {
            this.f216320a = (N) lVar;
            this.f216321b = cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.db.r
        @Y61.l
        public final Cursor run() {
            return (Cursor) this.f216320a.invoke(this.f216321b.f216313b);
        }
    }

    /* compiled from: PhotoInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/database/Cursor;", "Landroid/content/ContentResolver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<ContentResolver, Cursor> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f216323m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f216324n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j12) {
            super(1);
            this.f216323m = str;
            this.f216324n = j12;
        }

        @Override // Y41.l
        public final Cursor invoke(ContentResolver contentResolver) {
            c cVar = c.this;
            ContentResolver contentResolver2 = cVar.f216313b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tu.b.f439644d);
            sb2.append("=? AND ");
            return contentResolver2.query(cVar.f216316e, null, AK.c.s(sb2, tu.b.f439642b, "=?"), new String[]{this.f216323m, String.valueOf(this.f216324n)}, null);
        }
    }

    /* compiled from: PhotoInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/database/Cursor;", "Landroid/content/ContentResolver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.l<ContentResolver, Cursor> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f216326m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.f216326m = str;
        }

        @Override // Y41.l
        public final Cursor invoke(ContentResolver contentResolver) {
            c cVar = c.this;
            return cVar.f216313b.query(cVar.f216316e, null, AK.c.s(new StringBuilder(), tu.b.f439644d, "=?"), new String[]{this.f216326m}, tu.b.f439645e);
        }
    }

    /* compiled from: PhotoInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/database/Cursor;", "Landroid/content/ContentResolver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.l<ContentResolver, Cursor> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f216328m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.f216328m = str;
        }

        @Override // Y41.l
        public final Cursor invoke(ContentResolver contentResolver) {
            c cVar = c.this;
            return cVar.f216313b.query(cVar.f216316e, null, AK.c.s(new StringBuilder(), tu.b.f439643c, "=?"), new String[]{this.f216328m}, tu.b.f439642b);
        }
    }

    public c(@Y61.k Looper looper, @Y61.k com.avito.android.photo_cache.a aVar, @Y61.k C c12, @Y61.k ContentResolver contentResolver, @Y61.l b.InterfaceC6487b interfaceC6487b) {
        this.f216312a = c12;
        this.f216313b = contentResolver;
        this.f216314c = interfaceC6487b;
        this.f216315d = new Handler(looper);
        this.f216316e = aVar.a();
    }

    @Override // com.avito.android.photo_cache.b
    @Y61.k
    public final z<CloseableDataSource<? extends PhotoUpload>> a(@Y61.k String str) {
        return j(new e(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca A[Catch: all -> 0x00bb, Exception -> 0x00be, TRY_ENTER, TryCatch #7 {Exception -> 0x00be, all -> 0x00bb, blocks: (B:7:0x0035, B:9:0x003b, B:19:0x00b7, B:31:0x00ca, B:32:0x00cd, B:33:0x00ce), top: B:58:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    @Override // com.avito.android.photo_cache.b
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(@Y61.k java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_cache.c.b(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0141 A[Catch: all -> 0x0132, Exception -> 0x0135, TRY_ENTER, TryCatch #8 {Exception -> 0x0135, all -> 0x0132, blocks: (B:8:0x003f, B:10:0x0045, B:21:0x00a9, B:37:0x012e, B:51:0x0145, B:49:0x0141, B:50:0x0144, B:13:0x0095, B:16:0x009c, B:20:0x00a7, B:53:0x0162, B:54:0x0167), top: B:76:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    @Override // com.avito.android.photo_cache.b
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r23, int r24, @Y61.k java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_cache.c.c(int, int, java.lang.String):boolean");
    }

    @Override // com.avito.android.photo_cache.b
    public final void d(@Y61.k String str) {
        this.f216313b.delete(this.f216316e, AK.c.s(new StringBuilder(), tu.b.f439643c, "=?"), new String[]{str});
    }

    @Override // com.avito.android.photo_cache.b
    @Y61.k
    public final z<CloseableDataSource<? extends PhotoUpload>> e(@Y61.k String str) {
        return j(new f(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // com.avito.android.photo_cache.b
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(@Y61.k java.lang.String r10, @Y61.k android.net.Uri r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = tu.b.f439644d
            r0.append(r1)
            java.lang.String r1 = "=? AND "
            r0.append(r1)
            java.lang.String r1 = tu.b.f439648h
            java.lang.String r2 = "=?"
            java.lang.String r6 = AK.c.s(r0, r1, r2)
            java.lang.String r11 = r11.toString()
            java.lang.String[] r7 = new java.lang.String[]{r10, r11}
            java.lang.String r8 = tu.b.f439645e
            android.net.Uri r4 = r9.f216316e
            r5 = 0
            android.content.ContentResolver r3 = r9.f216313b
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            r11 = 1
            r0 = 0
            if (r10 == 0) goto L78
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            if (r1 == 0) goto L63
            java.lang.String r1 = tu.b.f439642b     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            long r1 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            tu.a r3 = new tu.a     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r4 = 0
            r3.<init>(r4, r11, r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r3.b(r12)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            android.content.ContentValues r12 = r3.f439628a     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            android.net.Uri r3 = r9.f216316e     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            android.net.Uri r1 = com.avito.android.util.C35809h6.e(r3, r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            android.content.ContentResolver r2 = r9.f216313b     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            int r12 = r2.update(r1, r12, r4, r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            kotlin.G0 r1 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r10.close()
            goto L79
        L5f:
            r11 = move-exception
            goto L72
        L61:
            r12 = move-exception
            goto L69
        L63:
            com.avito.android.photo_cache.NoPhotosException r12 = new com.avito.android.photo_cache.NoPhotosException     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r12.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            throw r12     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
        L69:
            r10.close()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            goto L71
        L6d:
            r12 = move-exception
            r0 = r11
            r11 = r12
            goto L72
        L71:
            throw r12     // Catch: java.lang.Throwable -> L6d
        L72:
            if (r0 != 0) goto L77
            r10.close()
        L77:
            throw r11
        L78:
            r12 = r0
        L79:
            if (r12 <= 0) goto L7c
            goto L7d
        L7c:
            r11 = r0
        L7d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_cache.c.f(java.lang.String, android.net.Uri, int):boolean");
    }

    @Override // com.avito.android.photo_cache.b
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public final z g(long j12, @Y61.k String str) {
        return j(new d(str, j12));
    }

    @Override // com.avito.android.photo_cache.b
    public final boolean h(@Y61.k String str, @Y61.k PhotoUpload photoUpload) {
        C48718a c48718a = new C48718a(null, 1, null);
        kotlin.reflect.n<?>[] nVarArr = C48718a.f439627n;
        c48718a.f439630c.setValue(c48718a, nVarArr[1], str);
        c48718a.f439633f.setValue(c48718a, nVarArr[4], photoUpload.f216304f);
        Uri uri = photoUpload.f216305g;
        c48718a.f439634g.setValue(c48718a, nVarArr[5], uri != null ? uri.toString() : null);
        c48718a.f439635h.setValue(c48718a, nVarArr[6], Integer.valueOf(photoUpload.f216306h.f216299b));
        c48718a.f439636i.setValue(c48718a, nVarArr[7], Integer.valueOf(photoUpload.f216307i.getCode()));
        c48718a.f439632e.setValue(c48718a, nVarArr[3], Long.valueOf(System.currentTimeMillis()));
        c48718a.f439637j.setValue(c48718a, nVarArr[8], String.valueOf(photoUpload.f216308j));
        c48718a.f439638k.setValue(c48718a, nVarArr[9], photoUpload.f216309k);
        Uri uri2 = photoUpload.f216310l;
        c48718a.f439639l.setValue(c48718a, nVarArr[10], uri2 != null ? uri2.toString() : null);
        c48718a.f439640m.setValue(c48718a, nVarArr[11], Integer.valueOf(photoUpload.f216311m.ordinal()));
        return this.f216313b.update(C35809h6.e(this.f216316e, photoUpload.f216300b), c48718a.f439628a, null, null) > 0;
    }

    @Override // com.avito.android.photo_cache.b
    public final long i(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, int i12, int i13, @Y61.l Uri uri, @Y61.l Uri uri2, @Y61.k EnhanceState enhanceState) {
        String lastPathSegment;
        C48718a c48718a = new C48718a(null, 1, null);
        kotlin.reflect.n<?>[] nVarArr = C48718a.f439627n;
        c48718a.f439630c.setValue(c48718a, nVarArr[1], str2);
        c48718a.f439633f.setValue(c48718a, nVarArr[4], str3);
        c48718a.f439629b.setValue(c48718a, nVarArr[0], str);
        c48718a.b(Integer.valueOf(i12));
        c48718a.f439635h.setValue(c48718a, nVarArr[6], Integer.valueOf(i13));
        c48718a.f439632e.setValue(c48718a, nVarArr[3], Long.valueOf(System.currentTimeMillis()));
        c48718a.f439634g.setValue(c48718a, nVarArr[5], uri != null ? uri.toString() : null);
        c48718a.f439637j.setValue(c48718a, nVarArr[8], uri2 != null ? uri2.toString() : null);
        c48718a.f439638k.setValue(c48718a, nVarArr[9], null);
        c48718a.f439639l.setValue(c48718a, nVarArr[10], null);
        c48718a.f439640m.setValue(c48718a, nVarArr[11], Integer.valueOf(enhanceState.ordinal()));
        Uri uriInsert = this.f216313b.insert(this.f216316e, c48718a.f439628a);
        if (uriInsert == null || (lastPathSegment = uriInsert.getLastPathSegment()) == null) {
            return -1L;
        }
        return Long.parseLong(lastPathSegment);
    }

    public final z<CloseableDataSource<? extends PhotoUpload>> j(Y41.l<? super ContentResolver, ? extends Cursor> lVar) {
        FX0.b bVar = new FX0.b(this, this.f216316e, new C6488c(lVar, this), 14);
        int i12 = AbstractC41777j.f401972b;
        return new com.avito.android.photo_cache.d(new C41960j0(new F(bVar))).T(new b(), Integer.MAX_VALUE);
    }

    public /* synthetic */ c(Looper looper, com.avito.android.photo_cache.a aVar, C c12, ContentResolver contentResolver, b.InterfaceC6487b interfaceC6487b, int i12, C42822w c42822w) {
        this(looper, aVar, c12, contentResolver, (i12 & 16) != 0 ? null : interfaceC6487b);
    }
}
