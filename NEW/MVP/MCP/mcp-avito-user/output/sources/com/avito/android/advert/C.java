package com.avito.android.advert;

import Fc1.E0;
import Hq0.C14020b;
import com.avito.android.advert.advert_details_popup.f;
import com.avito.android.advert.item.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.toolbar_download.AdvertDetailsDownloadButton;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/advert_details_popup/g;", "popupUIItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert/advert_details_popup/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class C extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.advert.advert_details_popup.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28245z f68535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0 f68536m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f68537n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C28245z c28245z, d0 d0Var, AdvertDetails advertDetails) {
        super(1);
        this.f68535l = c28245z;
        this.f68536m = d0Var;
        this.f68537n = advertDetails;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.advert.advert_details_popup.g gVar) {
        String handlerMob;
        com.avito.android.advert.advert_details_popup.g gVar2 = gVar;
        final C28245z c28245z = this.f68535l;
        c28245z.getClass();
        com.avito.android.advert.advert_details_popup.f fVar = gVar2.f68628c;
        boolean z12 = fVar instanceof f.a;
        AdvertDetails advertDetails = this.f68537n;
        if (z12) {
            d0 d0Var = c28245z.f81107z;
            if (d0Var != null) {
                c28245z.e(d0Var, advertDetails, false);
            }
            c28245z.f81093l.X1();
            Z0 z02 = c28245z.f81075A;
            if (z02 != null) {
                z02.v();
            }
        } else {
            Object obj = null;
            if (fVar instanceof f.b) {
                List<AdvertDetailsDownloadButton> downloadButtons = advertDetails.getDownloadButtons();
                if (downloadButtons != null) {
                    Iterator<T> it = downloadButtons.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (kotlin.jvm.internal.L.f(((AdvertDetailsDownloadButton) next).getType(), ((f.b) fVar).f68622a)) {
                            obj = next;
                            break;
                        }
                    }
                    final AdvertDetailsDownloadButton advertDetailsDownloadButton = (AdvertDetailsDownloadButton) obj;
                    if (advertDetailsDownloadButton != null && (handlerMob = advertDetailsDownloadButton.getHandlerMob()) != null) {
                        long j12 = advertDetailsDownloadButton.getWarning() != null ? 2L : 0L;
                        final int i12 = 0;
                        C41826q c41826q = new C41826q(new InterfaceC43543a() { // from class: com.avito.android.advert.y
                            @Override // l41.InterfaceC43543a
                            public final void run() {
                                Z0 z03;
                                switch (i12) {
                                    case 0:
                                        String type = advertDetailsDownloadButton.getType();
                                        if (type != null) {
                                            c28245z.f81093l.u5(type);
                                            break;
                                        }
                                        break;
                                    default:
                                        String warning = advertDetailsDownloadButton.getWarning();
                                        if (warning != null && (z03 = c28245z.f81075A) != null) {
                                            z03.J(com.avito.android.printable_text.b.f(warning));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        InterfaceC35745a5 interfaceC35745a5 = c28245z.f81091j;
                        final int i13 = 1;
                        c28245z.f81076B.b(new C42017o(c41826q.x(interfaceC35745a5.a()).q(interfaceC35745a5.e()).g(new C41826q(new InterfaceC43543a() { // from class: com.avito.android.advert.y
                            @Override // l41.InterfaceC43543a
                            public final void run() {
                                Z0 z03;
                                switch (i13) {
                                    case 0:
                                        String type = advertDetailsDownloadButton.getType();
                                        if (type != null) {
                                            c28245z.f81093l.u5(type);
                                            break;
                                        }
                                        break;
                                    default:
                                        String warning = advertDetailsDownloadButton.getWarning();
                                        if (warning != null && (z03 = c28245z.f81075A) != null) {
                                            z03.J(com.avito.android.printable_text.b.f(warning));
                                            break;
                                        }
                                        break;
                                }
                            }
                        })).q(interfaceC35745a5.a()).g(AbstractC41768a.y(j12, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b)).h(new C42007e(new C14020b(1, c28245z, handlerMob))).s(interfaceC35745a5.e()), new E0(c28245z, 2)).x(new D(c28245z), new E(c28245z, this.f68536m)));
                    }
                }
            } else if (fVar instanceof f.d) {
                DeepLink deepLink = gVar2.f68630e;
                if (deepLink != null) {
                    b.a.a(c28245z.f81097p, deepLink, null, null, 6);
                }
                Z0 z03 = c28245z.f81075A;
                if (z03 != null) {
                    z03.v();
                }
            }
        }
        return G0.f406611a;
    }
}
