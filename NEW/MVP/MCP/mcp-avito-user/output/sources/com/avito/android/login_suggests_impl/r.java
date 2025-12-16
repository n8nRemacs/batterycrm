package com.avito.android.login_suggests_impl;

import android.os.Parcelable;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.login_suggests_impl.Suggest;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import com.avito.android.login_suggests_impl.adapter.common_login.CommonLoginItem;
import com.avito.android.login_suggests_impl.adapter.suggest.SuggestItem;
import com.avito.android.util.C5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LoginSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/login_suggests_impl/adapter/suggest/SuggestItem;", "items", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f182946b;

    public r(t tVar) {
        this.f182946b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LoginSuggestsActivity loginSuggestsActivity;
        List list = (List) obj;
        int size = list.size();
        t tVar = this.f182946b;
        if (size > 5 && (loginSuggestsActivity = tVar.f182956i) != null) {
            com.avito.android.lib.design.bottom_sheet.d dVar = loginSuggestsActivity.f182854r;
            if (dVar == null) {
                dVar = null;
            }
            dVar.s();
        }
        if (list.isEmpty()) {
            LoginSuggestsActivity loginSuggestsActivity2 = tVar.f182956i;
            if (loginSuggestsActivity2 != null) {
                loginSuggestsActivity2.a2();
            }
        } else {
            ArrayList arrayListI0 = C42745f0.i0(new CommonLoginItem(0L, 1, null), list);
            tVar.getClass();
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListI0, 10));
            Iterator it = arrayListI0.iterator();
            while (it.hasNext()) {
                Parcelable suggestItem = (LoginSuggestsItem) it.next();
                if (suggestItem instanceof SuggestItem) {
                    SuggestItem suggestItem2 = (SuggestItem) suggestItem;
                    Suggest suggest = suggestItem2.f182879c;
                    if (suggest instanceof Suggest.Login) {
                        if (!C5.f318567a.e(((Suggest.Login) suggest).f182857d)) {
                            Suggest.Login login = (Suggest.Login) suggestItem2.f182879c;
                            suggestItem = new SuggestItem(suggestItem2.f182878b, new Suggest.Login(login.f182855b, login.f182856c, tVar.f182954g.a(login.f182857d)));
                        }
                    }
                }
                arrayList.add(suggestItem);
            }
            tVar.f182959l = arrayList;
            com.avito.konveyor.util.a.a(tVar.f182949b, arrayList);
            A a12 = tVar.f182955h;
            if (a12 != null) {
                a12.f182847b.notifyDataSetChanged();
            }
        }
        ScreenPerformanceTracker.a.c(tVar.f182953f, null, null, null, 7);
    }
}
