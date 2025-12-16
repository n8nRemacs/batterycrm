package com.avito.android.user_advert.advert.items.bbl_contact_history;

import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.items.bbl_contact_history.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f309286b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f309287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f309288d;

    public /* synthetic */ e(l lVar, a aVar) {
        this.f309288d = lVar;
        this.f309287c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        l lVar = this.f309288d;
        a aVar = this.f309287c;
        switch (this.f309286b) {
            case 0:
                int i12 = f.f309289g;
                lVar.invoke(aVar.f309274c.f309281b);
                break;
            default:
                int i13 = f.f309289g;
                a.C9483a c9483a = aVar.f309276e;
                if (c9483a != null && (deepLink = c9483a.f309279b) != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(a aVar, l lVar) {
        this.f309287c = aVar;
        this.f309288d = lVar;
    }
}
