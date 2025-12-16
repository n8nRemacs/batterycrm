package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: PreferencesCookieJar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/CookieJarException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CookieJarException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f318574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Throwable f318575c;

    public CookieJarException(@Y61.l String str, @Y61.l Throwable th2) {
        super(str, th2);
        this.f318574b = str;
        this.f318575c = th2;
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final Throwable getCause() {
        return this.f318575c;
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final String getMessage() {
        return this.f318574b;
    }
}
