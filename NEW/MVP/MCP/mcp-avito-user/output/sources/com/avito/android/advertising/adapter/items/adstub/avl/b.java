package com.avito.android.advertising.adapter.items.adstub.avl;

import android.view.View;
import java.lang.ref.WeakReference;
import ob.InterfaceC44738b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f86917c;

    public /* synthetic */ b(WeakReference weakReference, int i12) {
        this.f86916b = i12;
        this.f86917c = weakReference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC44738b interfaceC44738b;
        InterfaceC44738b interfaceC44738b2;
        InterfaceC44738b interfaceC44738b3;
        InterfaceC44738b interfaceC44738b4;
        switch (this.f86916b) {
            case 0:
                h31.e eVar = (h31.e) this.f86917c.get();
                if (eVar != null && (interfaceC44738b = (InterfaceC44738b) eVar.get()) != null) {
                    interfaceC44738b.A0();
                    break;
                }
                break;
            case 1:
                h31.e eVar2 = (h31.e) this.f86917c.get();
                if (eVar2 != null && (interfaceC44738b2 = (InterfaceC44738b) eVar2.get()) != null) {
                    interfaceC44738b2.A0();
                    break;
                }
                break;
            case 2:
                InterfaceC44738b interfaceC44738b5 = (InterfaceC44738b) this.f86917c.get();
                if (interfaceC44738b5 != null) {
                    interfaceC44738b5.A0();
                    break;
                }
                break;
            case 3:
                h31.e eVar3 = (h31.e) this.f86917c.get();
                if (eVar3 != null && (interfaceC44738b3 = (InterfaceC44738b) eVar3.get()) != null) {
                    interfaceC44738b3.A0();
                    break;
                }
                break;
            default:
                h31.e eVar4 = (h31.e) this.f86917c.get();
                if (eVar4 != null && (interfaceC44738b4 = (InterfaceC44738b) eVar4.get()) != null) {
                    interfaceC44738b4.A0();
                    break;
                }
                break;
        }
    }
}
