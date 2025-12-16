package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f317479b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeepLink f317480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c f317481d;

    public /* synthetic */ j(DeepLink deepLink, com.jakewharton.rxrelay3.c cVar) {
        this.f317480c = deepLink;
        this.f317481d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.jakewharton.rxrelay3.c cVar = this.f317481d;
        DeepLink deepLink = this.f317480c;
        switch (this.f317479b) {
            case 0:
                int i12 = k.f317482c;
                cVar.accept(deepLink);
                break;
            default:
                int i13 = k.f317482c;
                if (deepLink != null) {
                    cVar.accept(deepLink);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(com.jakewharton.rxrelay3.c cVar, DeepLink deepLink) {
        this.f317481d = cVar;
        this.f317480c = deepLink;
    }
}
