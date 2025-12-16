package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36708i0;
import com.google.android.gms.common.internal.R0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
abstract class J extends R0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f348871b;

    public J(byte[] bArr) {
        C36729v.b(bArr.length == 25);
        this.f348871b = Arrays.hashCode(bArr);
    }

    public static byte[] f4(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e12) {
            throw new AssertionError(e12);
        }
    }

    public final boolean equals(@j.P Object obj) {
        com.google.android.gms.dynamic.d dVarZzd;
        if (obj != null && (obj instanceof InterfaceC36708i0)) {
            try {
                InterfaceC36708i0 interfaceC36708i0 = (InterfaceC36708i0) obj;
                if (interfaceC36708i0.zzc() == this.f348871b && (dVarZzd = interfaceC36708i0.zzd()) != null) {
                    return Arrays.equals(g4(), (byte[]) com.google.android.gms.dynamic.f.g4(dVarZzd));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public abstract byte[] g4();

    public final int hashCode() {
        return this.f348871b;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC36708i0
    public final int zzc() {
        return this.f348871b;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC36708i0
    public final com.google.android.gms.dynamic.d zzd() {
        return new com.google.android.gms.dynamic.f(g4());
    }
}
