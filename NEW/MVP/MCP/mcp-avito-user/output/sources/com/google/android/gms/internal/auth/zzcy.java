package com.google.android.gms.internal.auth;

import android.util.Base64;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzcy extends zzdc {
    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object a(Object obj) {
        try {
            return zzhs.zzp(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }
}
