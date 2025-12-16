package com.avito.android.hotel_booking.konveyor.dotted_text;

import RI.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f163659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f163660d;

    public /* synthetic */ e(f fVar, c cVar, int i12) {
        this.f163658b = i12;
        this.f163659c = fVar;
        this.f163660d = cVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f163658b) {
            case 0:
                this.f163659c.f163661b.invoke(new b.f(deepLink, this.f163660d.f163653c));
                break;
            default:
                this.f163659c.f163661b.invoke(new b.f(deepLink, this.f163660d.f163653c));
                break;
        }
    }
}
