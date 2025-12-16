package com.avito.android.di.module;

import JK0.e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.Metadata;

/* compiled from: AppAttributedTextFormatterModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/I0;", "LJK0/e$a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I0 implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.util.C f143999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f144000b;

    public I0(InterfaceC28373a interfaceC28373a, com.avito.android.util.C c12) {
        this.f143999a = c12;
        this.f144000b = interfaceC28373a;
    }

    @Override // JK0.e.a
    public final void onError(@Y61.k Exception exc) {
        this.f143999a.o().getClass();
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        this.f144000b.c(new NonFatalErrorEvent(message, exc, null, null, 12, null));
    }
}
