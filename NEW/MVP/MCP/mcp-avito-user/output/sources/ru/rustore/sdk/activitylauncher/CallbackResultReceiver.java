package ru.rustore.sdk.activitylauncher;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.G0;
import kotlin.Metadata;
import ru.rustore.sdk.activitylauncher.c;
import ru.rustore.sdk.reactive.single.p;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;
import ub1.i;

/* compiled from: CallbackResultReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/activitylauncher/CallbackResultReceiver;", "Landroid/os/ResultReceiver;", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallbackResultReceiver extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f436747b;

    public CallbackResultReceiver(@k i iVar) {
        super(null);
        this.f436747b = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i12, @l Bundle bundle) {
        super.onReceiveResult(i12, bundle);
        new d();
        Object dVar = i12 != -1 ? i12 != 0 ? i12 != 2 ? i12 != 9901 ? i12 != 9902 ? new c.d(i12, null) : c.f.f436760b : c.e.f436759b : c.a.f436756b : c.b.f436757b : c.C12581c.f436758b;
        i iVar = this.f436747b;
        iVar.getClass();
        boolean zEquals = dVar instanceof c.d ? true : dVar.equals(c.e.f436759b) ? true : dVar.equals(c.f.f436760b) ? true : dVar.equals(c.a.f436756b);
        p pVar = (p) iVar.f440156b;
        if (zEquals) {
            pVar.a(new RuStoreReviewStartException());
            return;
        }
        if (dVar.equals(c.b.f436757b) ? true : dVar.equals(c.C12581c.f436758b)) {
            pVar.b(G0.f406611a);
        }
    }
}
