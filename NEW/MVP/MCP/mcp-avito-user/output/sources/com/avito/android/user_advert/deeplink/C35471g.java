package com.avito.android.user_advert.deeplink;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.model.CloseReasonsResponse;
import com.avito.android.util.P2;
import jI0.C42260a;
import kotlin.Metadata;

/* compiled from: MyAdvertDeactivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/CloseReasonsResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.deeplink.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35471g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35472h f310721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyAdvertLink.Deactivate f310722c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f310723d;

    public C35471g(C35472h c35472h, MyAdvertLink.Deactivate deactivate, String str) {
        this.f310721b = c35472h;
        this.f310722c = deactivate;
        this.f310723d = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.c;
        C35472h c35472h = this.f310721b;
        MyAdvertLink.Deactivate deactivate = this.f310722c;
        if (z12) {
            C35472h.k(c35472h, deactivate, true);
            return;
        }
        if (p22 instanceof P2.a) {
            C35472h.k(c35472h, deactivate, false);
            c35472h.j(new MyAdvertLink.Deactivate.b.a(((P2.a) p22).f318719a));
        } else if (p22 instanceof P2.b) {
            C35472h.k(c35472h, deactivate, false);
            String str = this.f310723d;
            c35472h.f310726h.c(new C42260a(str));
            c35472h.j(new MyAdvertLink.Deactivate.b.C4006b(str, ((CloseReasonsResponse) ((P2.b) p22).f318720a).getCloseReasons()));
        }
    }
}
