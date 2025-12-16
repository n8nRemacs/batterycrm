package com.avito.android.advert.item.safedeal;

import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH6/c;", "result", "Lkotlin/G0;", "accept", "(LH6/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28189q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z0 f78898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SafeDeal.ReturnCheckoutDialog.DefaultDialog f78899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C28180h f78900d;

    public C28189q(Z0 z02, SafeDeal.ReturnCheckoutDialog.DefaultDialog defaultDialog, C28180h c28180h) {
        this.f78898b = z02;
        this.f78899c = defaultDialog;
        this.f78900d = c28180h;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        H6.c cVar = (H6.c) obj;
        if (cVar instanceof H6.b) {
            InterfaceC28173a.InterfaceC2325a.C2326a.a(this.f78898b, this.f78899c.getOnConfirmDeeplink(), null, 6);
        } else if (cVar instanceof H6.a) {
            C28180h c28180h = this.f78900d;
            AdvertDetails advertDetails = c28180h.f78814C;
            if (advertDetails != null) {
                c28180h.f78822c.x0(advertDetails);
            }
            c28180h.f78830k.b();
        }
    }
}
