package com.avito.android.advert.item.parking;

import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.lib.design.tab_bar.TabBarLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f78169d;

    public /* synthetic */ i(int i12, Object obj, Object obj2) {
        this.f78167b = i12;
        this.f78168c = obj;
        this.f78169d = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object obj = this.f78169d;
        Object obj2 = this.f78168c;
        switch (this.f78167b) {
            case 0:
                ((l) obj2).invoke(((k) obj).f78174d.getText().toString());
                break;
            case 1:
                int i12 = com.avito.android.advert_details_items.address.g.f84444g;
                ((f.b) obj2).a((String) obj, true);
                break;
            default:
                TabBarLayout.b bVar = ((TabBarLayout) obj2).f180686d;
                if (bVar != null) {
                    bVar.a(((com.avito.android.lib.design.tab_bar.a) ((ViewGroup) obj)).getTabBarItem());
                    break;
                }
                break;
        }
        return true;
    }
}
