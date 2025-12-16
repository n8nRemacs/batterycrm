package com.avito.android.license;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LicenseScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements Y41.l<Context, WebView> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f181516l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final WebView invoke(Context context) {
        return new WebView(context);
    }
}
