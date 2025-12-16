package com.google.android.gms.internal.auth;

import I41.h;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzcx extends zzdc {
    @Override // com.google.android.gms.internal.auth.zzdc
    @h
    public final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
