package com.avito.android.help_center;

import android.view.MenuItem;
import android.webkit.CookieManager;
import com.avito.android.help_center.AbstractC30755l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/help_center/l;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/help_center/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class q extends N implements Y41.l<AbstractC30755l, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f161842l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar) {
        super(1);
        this.f161842l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC30755l abstractC30755l) {
        AbstractC30755l abstractC30755l2 = abstractC30755l;
        boolean z12 = abstractC30755l2 instanceof AbstractC30755l.c;
        z zVar = this.f161842l;
        if (z12) {
            String str = ((AbstractC30755l.c) abstractC30755l2).f161839a;
            zVar.f161865m = str;
            L l12 = zVar.f161862j;
            if (l12 != null) {
                boolean z13 = !kotlin.jvm.internal.L.f(str, zVar.f161864l);
                MenuItem menuItem = l12.f161618f;
                if (menuItem == null) {
                    menuItem = null;
                }
                menuItem.setVisible(z13);
            }
        } else if (abstractC30755l2 instanceof AbstractC30755l.b) {
            CookieManager cookieManager = zVar.f161854b;
            cookieManager.setAcceptCookie(true);
            for (com.avito.android.cookie_provider.a aVar : zVar.f161855c.getCookies()) {
                cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
            }
        } else {
            boolean z14 = abstractC30755l2 instanceof AbstractC30755l.a;
        }
        return G0.f406611a;
    }
}
