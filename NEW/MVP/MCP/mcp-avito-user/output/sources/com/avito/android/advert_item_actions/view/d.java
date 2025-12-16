package com.avito.android.advert_item_actions.view;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f85860c;

    public /* synthetic */ d(int i12, Y41.a aVar) {
        this.f85859b = i12;
        this.f85860c = aVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Y41.a aVar = this.f85860c;
        switch (this.f85859b) {
            case 0:
                int i12 = e.f85861F;
                aVar.invoke();
                break;
            case 1:
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 2:
                aVar.invoke();
                break;
            case 3:
                int i13 = com.avito.android.multigeo_flow.edit_address.a.f206888E;
                aVar.invoke();
                break;
            case 4:
                int i14 = com.avito.android.realty_agency.inline_filters.developer_suggest.d.f251517J;
                aVar.invoke();
                break;
            default:
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
        }
    }
}
