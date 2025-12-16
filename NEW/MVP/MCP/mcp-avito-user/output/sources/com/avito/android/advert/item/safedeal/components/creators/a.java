package com.avito.android.advert.item.safedeal.components.creators;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_core.safedeal.a f78789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeepLink f78790d;

    public /* synthetic */ a(com.avito.android.advert_core.safedeal.a aVar, DeepLink deepLink, int i12) {
        this.f78788b = i12;
        this.f78789c = aVar;
        this.f78790d = deepLink;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f78788b) {
            case 0:
                this.f78789c.a(this.f78790d);
                break;
            case 1:
                this.f78789c.a(this.f78790d);
                break;
            case 2:
                this.f78789c.a(this.f78790d);
                break;
            case 3:
                this.f78789c.a(this.f78790d);
                break;
            default:
                this.f78789c.a(this.f78790d);
                break;
        }
    }
}
