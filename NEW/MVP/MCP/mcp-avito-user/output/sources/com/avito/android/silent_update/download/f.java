package com.avito.android.silent_update.download;

import Y41.p;
import Y61.l;
import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: UpdateDownloaderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/download/f;", "Lcom/avito/android/silent_update/download/e;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f283653a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f283654b;

    /* renamed from: c, reason: collision with root package name */
    public final DownloadManager f283655c;

    /* compiled from: UpdateDownloaderImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)I"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.silent_update.download.UpdateDownloaderImpl$getFailReasonCode$2", f = "UpdateDownloaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Integer>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f283656q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f283657r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f283656q = j12;
            this.f283657r = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f283656q, this.f283657r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Integer> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Cursor cursorQuery = this.f283657r.f283655c.query(new DownloadManager.Query().setFilterById(this.f283656q));
            if (!cursorQuery.moveToFirst()) {
                return Boxing.boxInt(-1);
            }
            int columnIndex = cursorQuery.getColumnIndex("reason");
            return columnIndex == -1 ? Boxing.boxInt(-1) : Boxing.boxInt(cursorQuery.getInt(columnIndex));
        }
    }

    /* compiled from: UpdateDownloaderImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/net/Uri;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.silent_update.download.UpdateDownloaderImpl$getUriForDownloadedFile$2", f = "UpdateDownloaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super Uri>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ f f283658q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ long f283659r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, f fVar, Continuation continuation) {
            super(2, continuation);
            this.f283658q = fVar;
            this.f283659r = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f283659r, this.f283658q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Uri> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f283658q.f283655c.getUriForDownloadedFile(this.f283659r);
        }
    }

    /* compiled from: UpdateDownloaderImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.silent_update.download.UpdateDownloaderImpl$isLoaded$2", f = "UpdateDownloaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f283660q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f283661r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, f fVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f283660q = j12;
            this.f283661r = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f283660q, this.f283661r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Cursor cursorQuery = this.f283661r.f283655c.query(new DownloadManager.Query().setFilterById(this.f283660q));
            if (!cursorQuery.moveToFirst()) {
                return Boxing.boxBoolean(false);
            }
            int columnIndex = cursorQuery.getColumnIndex("status");
            if (columnIndex == -1) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(cursorQuery.getInt(columnIndex) == 8);
        }
    }

    @Inject
    public f(@Y61.k Context context, @Y61.k i iVar, @Y61.k R0 r02) {
        this.f283653a = iVar;
        this.f283654b = r02;
        this.f283655c = (DownloadManager) context.getSystemService(DownloadManager.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // com.avito.android.silent_update.download.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(@Y61.k java.lang.String r4) {
        /*
            r3 = this;
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r0 = r0.getLastPathSegment()
            if (r0 == 0) goto L17
            r1 = 0
            java.lang.String r2 = ".apk"
            boolean r1 = kotlin.text.C43066x.z(r0, r2, r1)
            if (r1 == 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L19
        L17:
            java.lang.String r0 = "avito.apk"
        L19:
            android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r1.<init>(r4)
            r4 = 1
            android.app.DownloadManager$Request r4 = r1.setNotificationVisibility(r4)
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS
            android.app.DownloadManager$Request r4 = r4.setDestinationInExternalPublicDir(r1, r0)
            android.app.DownloadManager r0 = r3.f283655c
            long r0 = r0.enqueue(r4)
            com.avito.android.silent_update.download.i r4 = r3.f283653a
            AK0.l r4 = r4.f283664a
            java.lang.String r2 = "silent_update.download_download_id"
            r4.putLong(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.silent_update.download.f.a(java.lang.String):long");
    }

    @Override // com.avito.android.silent_update.download.e
    @l
    public final Object b(long j12, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f283654b.a(), new g(j12, this, null), suspendLambda);
    }

    @Override // com.avito.android.silent_update.download.e
    @l
    public final String c(long j12) {
        i iVar = this.f283653a;
        return iVar.f283664a.getString(i.a(j12));
    }

    @Override // com.avito.android.silent_update.download.e
    public final void d(long j12, @Y61.k String str) {
        i iVar = this.f283653a;
        iVar.f283664a.putString(i.a(j12), str);
    }

    @Override // com.avito.android.silent_update.download.e
    @l
    public final Object e(long j12, @Y61.k Continuation<? super Integer> continuation) {
        return C43259k.g(this.f283654b.a(), new a(j12, this, null), continuation);
    }

    @Override // com.avito.android.silent_update.download.e
    public final void f(long j12) {
        i iVar = this.f283653a;
        iVar.f283664a.remove(i.a(j12));
    }

    @Override // com.avito.android.silent_update.download.e
    public final void g() {
        this.f283653a.f283664a.remove("silent_update.download_download_id");
    }

    @Override // com.avito.android.silent_update.download.e
    @l
    public final Object h(long j12, @Y61.k Continuation<? super Boolean> continuation) {
        return C43259k.g(this.f283654b.a(), new c(j12, this, null), continuation);
    }

    @Override // com.avito.android.silent_update.download.e
    public final void i(long j12, @l String str) {
        i iVar = this.f283653a;
        iVar.f283664a.putString(i.b(j12), str);
    }

    @Override // com.avito.android.silent_update.download.e
    @l
    public final Object j(long j12, @Y61.k Continuation<? super Uri> continuation) {
        return C43259k.g(this.f283654b.a(), new b(j12, this, null), continuation);
    }

    @Override // com.avito.android.silent_update.download.e
    public final void k(long j12) {
        i iVar = this.f283653a;
        iVar.f283664a.remove(i.b(j12));
    }

    @Override // com.avito.android.silent_update.download.e
    @l
    public final String l(long j12) {
        i iVar = this.f283653a;
        return iVar.f283664a.getString(i.b(j12));
    }

    @Override // com.avito.android.silent_update.download.e
    public final long m() {
        return this.f283653a.f283664a.getLong("silent_update.download_download_id", -1L);
    }
}
