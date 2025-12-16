package com.avito.android.search.filter.adapter.category_group;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f262096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.b f262097d;

    public /* synthetic */ v(com.avito.konveyor.adapter.b bVar, Y41.a aVar, int i12) {
        this.f262095b = i12;
        this.f262097d = bVar;
        this.f262096c = aVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f262095b) {
            case 0:
                w wVar = (w) this.f262097d;
                K2.d(wVar.f262103f.f262057b, true);
                View view = wVar.f262102e;
                ((ViewGroup) view.getParent()).removeView(view);
                ((o) this.f262096c).invoke();
                K2.f(wVar.f262100c, 3);
                break;
            default:
                D d12 = (D) this.f262097d;
                K2.d(d12.f262047f.f262057b, true);
                View view2 = d12.f262046e;
                ((ViewGroup) view2.getParent()).removeView(view2);
                ((o) this.f262096c).invoke();
                K2.f(d12.f262044c, 3);
                break;
        }
    }
}
