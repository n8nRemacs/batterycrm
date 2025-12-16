package com.avito.android.publish.slots.delivery_summary_edit.item;

import android.view.View;
import com.avito.android.deep_linking.links.w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f243793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f243794d;

    public /* synthetic */ j(w wVar, m mVar, int i12) {
        this.f243792b = i12;
        this.f243793c = wVar;
        this.f243794d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f243794d;
        w wVar = this.f243793c;
        switch (this.f243792b) {
            case 0:
                int i12 = l.f243796l;
                if (wVar != null) {
                    wVar.i7(mVar.f243810b);
                    break;
                }
                break;
            case 1:
                int i13 = l.f243796l;
                if (wVar != null) {
                    wVar.i7(mVar.f243810b);
                    break;
                }
                break;
            default:
                int i14 = com.avito.android.publish.slots.delivery_summary_edit.re23.j.f243845t;
                if (wVar != null) {
                    wVar.i7(mVar.f243810b);
                    break;
                }
                break;
        }
    }
}
