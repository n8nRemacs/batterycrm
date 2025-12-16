package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class X implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.c f190231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f190232d;

    public /* synthetic */ X(d0.c cVar, W w12, int i12) {
        this.f190230b = i12;
        this.f190231c = cVar;
        this.f190232d = w12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String deeplink;
        switch (this.f190230b) {
            case 0:
                d0.b f190355d = this.f190231c.getF190355d();
                d0.b.c cVar = f190355d instanceof d0.b.c ? (d0.b.c) f190355d : null;
                DeepLink deepLink = cVar != null ? cVar.f190306e : null;
                W w12 = this.f190232d;
                if (deepLink == null || (deepLink instanceof NoMatchLink)) {
                    w12.K3();
                } else {
                    w12.f190221i0.postValue(deepLink);
                }
                break;
            default:
                HeaderTitleButton f190366o = this.f190231c.getF190366o();
                if (f190366o == null || (deeplink = f190366o.getDeeplink()) == null) {
                    deeplink = "";
                }
                W w13 = this.f190232d;
                DeepLink deepLinkB = w13.f190213a0.b(deeplink);
                if (f190366o == null || (deepLinkB instanceof NoMatchLink)) {
                    w13.K3();
                } else {
                    w13.f190221i0.postValue(deepLinkB);
                }
                break;
        }
        return G0.f406611a;
    }
}
