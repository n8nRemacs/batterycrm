package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.util.P2;
import kotlin.Metadata;
import l90.t;

/* compiled from: SessionDeleteAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "loadingState", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f257590b;

    public r(s sVar) {
        this.f257590b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        s sVar = this.f257590b;
        sVar.f257592g.g(sVar.d(), false);
        if (p22 instanceof P2.b) {
            sVar.j(t.b.f413569b);
        } else if (p22 instanceof P2.a) {
            sVar.j(t.a.f413568b);
        } else {
            p22.equals(P2.c.f318721a);
        }
    }
}
