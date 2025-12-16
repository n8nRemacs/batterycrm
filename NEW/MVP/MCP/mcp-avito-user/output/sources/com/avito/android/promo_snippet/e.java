package com.avito.android.promo_snippet;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f231734b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PromoSnippet f231735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PromoSnippetState f231736d;

    public /* synthetic */ e(PromoSnippet promoSnippet, PromoSnippetState promoSnippetState) {
        this.f231735c = promoSnippet;
        this.f231736d = promoSnippetState;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        PromoSnippetState promoSnippetState = this.f231736d;
        PromoSnippet promoSnippet = this.f231735c;
        switch (this.f231734b) {
            case 0:
                int i12 = PromoSnippet.f231694l;
                ActionButton actionButton = promoSnippetState.f231726h;
                if (actionButton != null && (deepLink = actionButton.f231691c) != null) {
                    promoSnippet.f231704k.invoke(deepLink);
                    break;
                }
                break;
            default:
                promoSnippet.f231704k.invoke(promoSnippetState.f231725g);
                break;
        }
    }

    public /* synthetic */ e(PromoSnippetState promoSnippetState, PromoSnippet promoSnippet) {
        this.f231736d = promoSnippetState;
        this.f231735c = promoSnippet;
    }
}
