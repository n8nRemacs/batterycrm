package com.avito.android.extended_profile_ui_components;

import java.util.ArrayList;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BadgeBarV3View f153342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f153343d;

    public /* synthetic */ h(BadgeBarV3View badgeBarV3View, ArrayList arrayList, int i12) {
        this.f153341b = i12;
        this.f153342c = badgeBarV3View;
        this.f153343d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f153341b) {
            case 0:
                BadgeBarV3View.a(this.f153342c, C42745f0.C(this.f153343d));
                break;
            default:
                BadgeBarV3View.a(this.f153342c, C42745f0.C(this.f153343d));
                break;
        }
    }
}
