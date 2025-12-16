package com.google.android.gms.internal.common;

import AK.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class zzl extends zzk {

    /* renamed from: a, reason: collision with root package name */
    public final char f350238a;

    public zzl(char c12) {
        this.f350238a = c12;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i12 = this.f350238a;
        for (int i13 = 0; i13 < 4; i13++) {
            cArr[5 - i13] = "0123456789ABCDEF".charAt(i12 & 15);
            i12 >>= 4;
        }
        return c.k("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c12) {
        return c12 == this.f350238a;
    }
}
