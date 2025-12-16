package com.avito.android.user_advert.deeplink;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: MyAdvertDeactivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SuccessResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f310741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f310742c;

    public k(j jVar, String str) {
        this.f310741b = jVar;
        this.f310742c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.a;
        j jVar = this.f310741b;
        if (z12) {
            jVar.j(new MyAdvertLink.DeactivateV2.b.C4007b(((P2.a) p22).f318719a));
        } else if (!(p22 instanceof P2.b)) {
            boolean z13 = p22 instanceof P2.c;
        } else {
            jVar.j(new MyAdvertLink.DeactivateV2.b.c(this.f310742c, ((SuccessResult) ((P2.b) p22).f318720a).getMessage()));
        }
    }
}
