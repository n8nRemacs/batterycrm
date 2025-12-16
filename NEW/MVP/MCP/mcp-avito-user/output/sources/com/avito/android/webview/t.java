package com.avito.android.webview;

import android.net.Uri;
import kotlin.Metadata;

/* compiled from: WebViewPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f329643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f329644c;

    public t(u uVar, Uri uri) {
        this.f329643b = uVar;
        this.f329644c = uri;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        u.i(this.f329643b, this.f329644c.toString());
    }
}
