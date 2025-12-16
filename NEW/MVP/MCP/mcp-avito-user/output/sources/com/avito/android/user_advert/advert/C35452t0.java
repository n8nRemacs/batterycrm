package com.avito.android.user_advert.advert;

import android.content.Intent;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.user_advert.advert.delegate.PresenterDelegateNotFoundException;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: MyAdvertDetailsPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.advert.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35452t0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f310634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<ActionMenu> f310635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f310636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsItem f310637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Action> f310638f;

    public C35452t0(C35435m0 c35435m0, List<ActionMenu> list, boolean z12, MyAdvertDetailsItem myAdvertDetailsItem, List<Action> list2) {
        this.f310634b = c35435m0;
        this.f310635c = list;
        this.f310636d = z12;
        this.f310637e = myAdvertDetailsItem;
        this.f310638f = list2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        String str;
        ActionMenu actionMenu;
        int iIntValue = ((Number) obj).intValue();
        C35435m0 c35435m0 = this.f310634b;
        MyAdvertDetailsItem myAdvertDetailsItem = c35435m0.f310465e0;
        if (myAdvertDetailsItem != null && (str = myAdvertDetailsItem.f309129b) != null && (actionMenu = (ActionMenu) C42745f0.K(iIntValue, this.f310635c)) != null) {
            MyAdvertDetailsItem myAdvertDetailsItem2 = c35435m0.f310465e0;
            String str2 = myAdvertDetailsItem2 != null ? myAdvertDetailsItem2.f309100K : null;
            if (str2 == null) {
                str2 = "";
            }
            c35435m0.f310480m.c(new iI0.G(str, actionMenu.f430340b, iIntValue, str2));
        }
        boolean z12 = this.f310636d;
        if (iIntValue != 0 || !z12) {
            if (z12) {
                iIntValue--;
            }
            DeepLink deepLink = this.f310638f.get(iIntValue).getDeepLink();
            Iterator<T> it = c35435m0.f310495v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                        break;
                    }
                }
            }
            com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next : null);
            if (aVar == null) {
                throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
            }
            aVar.v(deepLink, c35435m0.f310465e0, false);
            return;
        }
        MyAdvertDetailsItem myAdvertDetailsItem3 = this.f310637e;
        AdvertSharing advertSharing = myAdvertDetailsItem3.f309161r;
        if (advertSharing == null || (myAdvertDetailsActivity = c35435m0.f310461c0) == null) {
            return;
        }
        String url = advertSharing.getNative();
        if (url == null) {
            url = advertSharing.getUrl();
        }
        InterfaceC35845m2 interfaceC35845m2 = myAdvertDetailsActivity.f308328r;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        Intent intentCreateChooser = Intent.createChooser(interfaceC35845m2.d(url, myAdvertDetailsItem3.f309149l), myAdvertDetailsActivity.getString(R.string.menu_share));
        C35974x2.d(intentCreateChooser);
        try {
            myAdvertDetailsActivity.startActivity(intentCreateChooser);
        } catch (Exception unused) {
            C35436m1 c35436m1 = myAdvertDetailsActivity.f308279H0;
            if (c35436m1 == null) {
                c35436m1 = null;
            }
            c35436m1.f(myAdvertDetailsActivity.getString(R.string.no_application_installed_to_perform_this_action));
        }
        I i12 = new I(myAdvertDetailsActivity);
        AbstractC35385e abstractC35385e = myAdvertDetailsActivity.f308285K0;
        Object obj2 = abstractC35385e != null ? abstractC35385e : null;
        if (obj2 instanceof C35382d) {
            i12.invoke(((C35382d) obj2).f308519a);
        } else {
            boolean z13 = obj2 instanceof C35388f;
        }
    }
}
