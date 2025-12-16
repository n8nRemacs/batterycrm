package com.avito.android.advert.item.consultation;

import android.view.View;
import com.avito.android.remote.model.advert_details.realty.Landing;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert.item.consultation.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28107m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f74780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Landing f74781d;

    public /* synthetic */ ViewOnClickListenerC28107m(Y41.l lVar, Landing landing, int i12) {
        this.f74779b = i12;
        this.f74780c = lVar;
        this.f74781d = landing;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.l lVar = this.f74780c;
        Landing landing = this.f74781d;
        switch (this.f74779b) {
            case 0:
                int i12 = C28108n.f74782g;
                lVar.invoke(landing != null ? landing.getUri() : null);
                break;
            default:
                int i13 = S.f74691B;
                lVar.invoke(landing.getUri());
                break;
        }
    }
}
