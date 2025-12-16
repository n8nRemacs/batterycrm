package com.avito.android.help_center;

import android.webkit.JavascriptInterface;
import com.avito.android.help_center.AbstractC30755l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterJSInterface.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/avito/android/help_center/n;", "Lcom/avito/android/help_center/m;", "<init>", "()V", "", "newUrl", "Lkotlin/G0;", "onUpdateURL", "(Ljava/lang/String;)V", "updateCookies", "onSendHelpRequest", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements InterfaceC30756m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<AbstractC30755l> f161840a = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public n() {
    }

    @Override // com.avito.android.help_center.InterfaceC30756m
    /* renamed from: getEvents, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF161840a() {
        return this.f161840a;
    }

    @JavascriptInterface
    public final void onSendHelpRequest() {
        this.f161840a.accept(new AbstractC30755l.a());
    }

    @JavascriptInterface
    public final void onUpdateURL(@Y61.k String newUrl) {
        this.f161840a.accept(new AbstractC30755l.c(newUrl));
    }

    @JavascriptInterface
    public final void updateCookies() {
        this.f161840a.accept(new AbstractC30755l.b());
    }
}
