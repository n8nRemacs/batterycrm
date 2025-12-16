package com.avito.android.verification.links.tinkoff_finish_web;

import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.VerificationTinkoffFinishResult;
import com.avito.android.verification.links.tinkoff_finish_web.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerificationTinkoffFinishWebLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f324603b;

    public b(d dVar) {
        this.f324603b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        G0 g02;
        DeepLink uri = ((VerificationTinkoffFinishResult) obj).getUri();
        d dVar = this.f324603b;
        if (uri != null) {
            dVar.i(j.c.f324640b, dVar.f324609i, uri);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            dVar.f324611k.X(-1, new Intent());
            dVar.j(j.b.f324639b);
        }
    }
}
