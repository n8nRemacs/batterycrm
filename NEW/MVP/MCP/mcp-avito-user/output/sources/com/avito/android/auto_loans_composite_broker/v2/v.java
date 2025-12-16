package com.avito.android.auto_loans_composite_broker.v2;

import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class v implements com.avito.android.deep_linking.links.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f95648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f95649c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l f95650d;

    public /* synthetic */ v(z zVar, Y41.l lVar, int i12) {
        this.f95648b = i12;
        this.f95649c = zVar;
        this.f95650d = lVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f95648b) {
            case 0:
                this.f95649c.f95660f.f();
                this.f95650d.invoke(deepLink);
                break;
            default:
                this.f95649c.f95660f.f();
                this.f95650d.invoke(deepLink);
                break;
        }
    }
}
