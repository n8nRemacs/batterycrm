package com.avito.android.bottom_navigation;

import EN0.a;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bottom_navigation.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnLongClickListenerC28892n implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107036c;

    public /* synthetic */ ViewOnLongClickListenerC28892n(Object obj, int i12) {
        this.f107035b = i12;
        this.f107036c = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f107035b) {
            case 0:
                C28883e c28883e = ((C28893o) this.f107036c).f107043h;
                if (c28883e == null) {
                    return true;
                }
                c28883e.b(NavigationTab.f106974j);
                return true;
            case 1:
                C28883e c28883e2 = ((C28900w) this.f107036c).f107173h;
                if (c28883e2 == null) {
                    return true;
                }
                c28883e2.b(NavigationTab.f106974j);
                return true;
            case 2:
                C28883e c28883e3 = ((M) this.f107036c).f106962h;
                if (c28883e3 == null) {
                    return true;
                }
                c28883e3.b(NavigationTab.f106974j);
                return true;
            case 3:
                Y41.a<Boolean> aVar = ((com.avito.android.messenger.conversation.adapter.n) this.f107036c).f189259d;
                if (aVar != null) {
                    return aVar.invoke().booleanValue();
                }
                return false;
            case 4:
                ((com.avito.android.virtual_deal_room.client_room.j) this.f107036c).f326316a.invoke(a.f.f3950a);
                return true;
            default:
                return ((Boolean) ((Y41.l) this.f107036c).invoke(view)).booleanValue();
        }
    }
}
