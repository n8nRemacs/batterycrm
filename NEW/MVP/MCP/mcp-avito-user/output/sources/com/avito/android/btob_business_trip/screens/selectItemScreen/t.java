package com.avito.android.btob_business_trip.screens.selectItemScreen;

import Bk.InterfaceC13157a;
import com.avito.android.edit_seller_type.mvi.entity.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class t implements com.avito.android.deep_linking.links.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f108243c;

    public /* synthetic */ t(int i12, Y41.l lVar) {
        this.f108242b = i12;
        this.f108243c = lVar;
    }

    @Override // com.avito.android.deep_linking.links.x
    public final boolean X(String str) {
        switch (this.f108242b) {
            case 0:
                this.f108243c.invoke(new InterfaceC13157a.f(str));
                break;
            case 1:
                this.f108243c.invoke(new a.e(str));
                break;
            case 2:
                this.f108243c.invoke(new a.e(str));
                break;
            case 3:
                this.f108243c.invoke(str);
                break;
            case 4:
                this.f108243c.invoke(str);
                break;
            case 5:
                this.f108243c.invoke(str);
                break;
            default:
                this.f108243c.invoke(str);
                break;
        }
        return true;
    }
}
