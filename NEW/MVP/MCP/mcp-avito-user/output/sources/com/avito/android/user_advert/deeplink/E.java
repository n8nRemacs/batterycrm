package com.avito.android.user_advert.deeplink;

import com.avito.android.deep_linking.links.DraftDeletionLink;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: MyDraftDeletionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f310687b;

    public E(F f12) {
        this.f310687b = f12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.a;
        F f12 = this.f310687b;
        if (z12) {
            f12.j(new DraftDeletionLink.b.a(((P2.a) p22).f318719a));
        } else if (p22 instanceof P2.b) {
            f12.j(DraftDeletionLink.b.C3996b.f133288b);
        } else {
            boolean z13 = p22 instanceof P2.c;
        }
    }
}
