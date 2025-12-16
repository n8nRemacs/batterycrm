package com.google.android.gms.common.moduleinstall.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.C36703g;
import okhttp3.internal.http.StatusLine;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class s extends C36616a.AbstractC10618a {
    @Override // com.google.android.gms.common.api.C36616a.AbstractC10618a
    public final C36616a.f buildClient(Context context, Looper looper, C36703g c36703g, Object obj, InterfaceC36637f interfaceC36637f, InterfaceC36664q interfaceC36664q) {
        return new B(context, looper, StatusLine.HTTP_PERM_REDIRECT, c36703g, interfaceC36637f, interfaceC36664q);
    }
}
