package com.avito.android.user_advert.deeplink;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MyAdvertDeactivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "Lcom/avito/android/remote/model/SuccessResult;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f310744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f310745c;

    public m(j jVar, String str) {
        this.f310744b = jVar;
        this.f310745c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) ((Q) obj).f406620c;
        if (p22 instanceof P2.c) {
            return;
        }
        boolean z12 = p22 instanceof P2.a;
        j jVar = this.f310744b;
        if (z12) {
            jVar.j(new MyAdvertLink.DeactivateV2.b.C4007b(((P2.a) p22).f318719a));
        } else if (p22 instanceof P2.b) {
            jVar.j(new MyAdvertLink.DeactivateV2.b.c(this.f310745c, ((SuccessResult) ((P2.b) p22).f318720a).getMessage()));
        }
    }
}
