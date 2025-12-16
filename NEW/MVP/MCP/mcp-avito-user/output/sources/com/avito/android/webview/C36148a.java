package com.avito.android.webview;

import hd.InterfaceC40915a;
import kotlin.Metadata;

/* compiled from: FullscreenCookieProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/a;", "Lhd/a;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.webview.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36148a implements InterfaceC40915a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f329535a;

    public C36148a(boolean z12) {
        this.f329535a = z12;
    }

    @Override // hd.InterfaceC40915a
    public final boolean b() {
        return false;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "fullscreen";
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getValue() {
        return String.valueOf(this.f329535a);
    }
}
