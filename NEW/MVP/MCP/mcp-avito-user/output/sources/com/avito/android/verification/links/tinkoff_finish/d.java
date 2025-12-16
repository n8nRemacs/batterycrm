package com.avito.android.verification.links.tinkoff_finish;

import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.VerificationTinkoffFinishResult;
import com.avito.android.verification.links.tinkoff_finish.l;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerificationTinkoffFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f324572b;

    public d(b bVar) {
        this.f324572b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        G0 g02;
        DeepLink uri = ((VerificationTinkoffFinishResult) obj).getUri();
        b bVar = this.f324572b;
        if (uri != null) {
            bVar.i(l.c.f324599b, bVar.f324562i, uri);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            bVar.f324565l.X(-1, new Intent());
            bVar.j(l.b.f324598b);
        }
    }
}
