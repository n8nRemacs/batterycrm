package com.avito.android.verification.links.sber_finish;

import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.verification.links.sber_finish.k;
import kotlin.Metadata;

/* compiled from: VerificationSberFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f324457b;

    public e(c cVar) {
        this.f324457b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = (DeepLink) obj;
        boolean z12 = deepLink instanceof NoMatchLink;
        c cVar = this.f324457b;
        if (!z12) {
            cVar.i(k.c.f324479b, cVar.f324450j, deepLink);
        } else {
            cVar.f324452l.X(-1, new Intent());
            cVar.j(k.b.f324478b);
        }
    }
}
