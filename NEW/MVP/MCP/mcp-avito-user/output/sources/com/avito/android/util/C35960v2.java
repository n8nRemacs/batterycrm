package com.avito.android.util;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.Metadata;

/* compiled from: IntentExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_base-component_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.v2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35960v2 {
    @Y61.k
    public static final void a(@Y61.k Intent intent, @Y61.k ContextWrapper contextWrapper, @Y61.l InterfaceC28373a interfaceC28373a) {
        intent.setExtrasClassLoader(contextWrapper.getClassLoader());
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.getInt("", 0);
            }
        } catch (RuntimeException e12) {
            intent.replaceExtras(new Bundle());
            if (interfaceC28373a != null) {
                interfaceC28373a.c(new NonFatalErrorEvent("Cannot access extras of an Intent", e12, null, null, 12, null));
            }
        }
    }
}
