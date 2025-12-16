package com.avito.android.credits.calculator;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f128735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f128736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeepLink f128737d;

    public /* synthetic */ z(A a12, DeepLink deepLink, int i12) {
        this.f128735b = i12;
        this.f128736c = a12;
        this.f128737d = deepLink;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink = this.f128737d;
        A a12 = this.f128736c;
        switch (this.f128735b) {
            case 0:
                int i12 = A.f128626C;
                a12.E80(deepLink);
                break;
            default:
                int i13 = A.f128626C;
                a12.E80(deepLink);
                break;
        }
    }
}
