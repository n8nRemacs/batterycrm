package com.avito.android.short_term_rent.bookingform.items.dotted_text;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f281488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f281489c;

    public /* synthetic */ b(d dVar, int i12) {
        this.f281488b = i12;
        this.f281489c = dVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f281488b) {
            case 0:
                this.f281489c.f281492b.invoke(deepLink);
                break;
            default:
                this.f281489c.f281492b.invoke(deepLink);
                break;
        }
    }
}
