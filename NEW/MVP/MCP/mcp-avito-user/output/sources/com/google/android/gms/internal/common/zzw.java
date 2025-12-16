package com.google.android.gms.internal.common;

import I41.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
abstract class zzw extends zzj {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f350245d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350246e;

    /* renamed from: f, reason: collision with root package name */
    public int f350247f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f350248g;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar = zzxVar.f350249a;
        this.f350246e = zzxVar.f350250b;
        this.f350248g = Integer.MAX_VALUE;
        this.f350245d = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    @a
    public final String a() {
        int iC2;
        CharSequence charSequence;
        int iB2;
        int i12 = this.f350247f;
        while (true) {
            int i13 = this.f350247f;
            if (i13 == -1) {
                this.f350237c = 3;
                return null;
            }
            iC2 = c(i13);
            charSequence = this.f350245d;
            if (iC2 == -1) {
                iC2 = charSequence.length();
                this.f350247f = -1;
                iB2 = -1;
            } else {
                iB2 = b(iC2);
                this.f350247f = iB2;
            }
            if (iB2 == i12) {
                int i14 = iB2 + 1;
                this.f350247f = i14;
                if (i14 > charSequence.length()) {
                    this.f350247f = -1;
                }
            } else {
                if (i12 < iC2) {
                    charSequence.charAt(i12);
                }
                if (i12 < iC2) {
                    charSequence.charAt(iC2 - 1);
                }
                if (!this.f350246e || i12 != iC2) {
                    break;
                }
                i12 = this.f350247f;
            }
        }
        int i15 = this.f350248g;
        if (i15 == 1) {
            iC2 = charSequence.length();
            this.f350247f = -1;
            if (iC2 > i12) {
                charSequence.charAt(iC2 - 1);
            }
        } else {
            this.f350248g = i15 - 1;
        }
        return charSequence.subSequence(i12, iC2).toString();
    }

    public abstract int b(int i12);

    public abstract int c(int i12);
}
