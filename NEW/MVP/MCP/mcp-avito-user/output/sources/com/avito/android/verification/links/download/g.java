package com.avito.android.verification.links.download;

import android.app.DownloadManager;
import android.database.Cursor;
import com.avito.android.verification.links.download.e;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import l41.o;

/* compiled from: VerificationDownloadLinkInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f324213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f324214c;

    public g(e eVar, long j12) {
        this.f324213b = eVar;
        this.f324214c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        int i12 = e.f324207d;
        e eVar = this.f324213b;
        eVar.getClass();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.f324214c);
        Cursor cursorQuery = eVar.f324209b.query(query);
        cursorQuery.moveToFirst();
        return cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 16 ? z.M(e.b.f324211b) : U.f403867b;
    }
}
