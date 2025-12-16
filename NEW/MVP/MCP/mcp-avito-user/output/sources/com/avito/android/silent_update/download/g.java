package com.avito.android.silent_update.download;

import Y41.p;
import Y61.l;
import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: UpdateDownloaderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/net/Uri;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/net/Uri;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.silent_update.download.UpdateDownloaderImpl$getLocalUri$2", f = "UpdateDownloaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super Uri>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f283662q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f283663r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j12, f fVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f283662q = j12;
        this.f283663r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f283662q, this.f283663r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Uri> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int columnIndex;
        String string;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Cursor cursorQuery = this.f283663r.f283655c.query(new DownloadManager.Query().setFilterById(this.f283662q));
        if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("local_uri")) == -1 || (string = cursorQuery.getString(columnIndex)) == null) {
            return null;
        }
        return Uri.parse(string);
    }
}
