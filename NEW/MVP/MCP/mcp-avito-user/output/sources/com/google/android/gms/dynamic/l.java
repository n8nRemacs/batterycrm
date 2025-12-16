package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f349652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f349653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f349654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f349655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f349656e;

    public l(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f349656e = aVar;
        this.f349652a = frameLayout;
        this.f349653b = layoutInflater;
        this.f349654c = viewGroup;
        this.f349655d = bundle;
    }

    @Override // com.google.android.gms.dynamic.p
    public final void a() {
        FrameLayout frameLayout = this.f349652a;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f349656e.f349638a.g(this.f349653b, this.f349654c, this.f349655d));
    }

    @Override // com.google.android.gms.dynamic.p
    public final int b() {
        return 2;
    }
}
