package com.avito.android.analytics.event;

import kotlin.Metadata;

/* compiled from: WriteToSellerTreeEvent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-app_core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j1 {
    public static final String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("BX-36723 no xHash in advert\n");
        sb2.append("advertId - " + str);
        sb2.append("\n");
        sb2.append("context - " + str2);
        return sb2.toString();
    }
}
