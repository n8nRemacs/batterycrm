package com.google.android.gms.internal.fido;

import I41.a;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
class zzge extends zzgf {

    /* renamed from: b, reason: collision with root package name */
    public final zzgb f350396b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public final Character f350397c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public volatile zzgf f350398d;

    public zzge(zzgb zzgbVar, @a Character ch2) {
        this.f350396b = zzgbVar;
        if (ch2 != null && zzgbVar.zzc('=')) {
            throw new IllegalArgumentException(zzbo.zza("Padding character %s was already in alphabet", ch2));
        }
        this.f350397c = ch2;
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public void a(StringBuilder sb2, byte[] bArr, int i12) {
        int i13 = 0;
        zzbm.zze(0, i12, bArr.length);
        while (i13 < i12) {
            zzgb zzgbVar = this.f350396b;
            d(sb2, bArr, i13, Math.min(zzgbVar.f350392f, i12 - i13));
            i13 += zzgbVar.f350392f;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final int b(int i12) {
        zzgb zzgbVar = this.f350396b;
        return zzgbVar.f350391e * zzgh.zza(i12, zzgbVar.f350392f, RoundingMode.CEILING);
    }

    public zzgf c(zzgb zzgbVar, @a Character ch2) {
        return new zzge(zzgbVar, ch2);
    }

    public final void d(StringBuilder sb2, byte[] bArr, int i12, int i13) {
        int i14;
        zzbm.zze(i12, i12 + i13, bArr.length);
        zzgb zzgbVar = this.f350396b;
        int i15 = 0;
        zzbm.zzc(i13 <= zzgbVar.f350392f);
        long j12 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            j12 = (j12 | (bArr[i12 + i16] & 255)) << 8;
        }
        int i17 = (i13 + 1) * 8;
        while (true) {
            int i18 = i13 * 8;
            i14 = zzgbVar.f350390d;
            if (i15 >= i18) {
                break;
            }
            sb2.append(zzgbVar.f350388b[((int) (j12 >>> ((i17 - i14) - i15))) & zzgbVar.f350389c]);
            i15 += i14;
        }
        if (this.f350397c != null) {
            while (i15 < zzgbVar.f350392f * 8) {
                sb2.append('=');
                i15 += i14;
            }
        }
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzge) {
            zzge zzgeVar = (zzge) obj;
            if (this.f350396b.equals(zzgeVar.f350396b) && Objects.equals(this.f350397c, zzgeVar.f350397c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f350396b.hashCode() ^ Objects.hashCode(this.f350397c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgb zzgbVar = this.f350396b;
        sb2.append(zzgbVar);
        if (8 % zzgbVar.f350390d != 0) {
            Character ch2 = this.f350397c;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // com.google.android.gms.internal.fido.zzgf
    public final zzgf zzd() {
        zzgb zzgbVar;
        int i12;
        boolean z12;
        zzgf zzgfVarC = this.f350398d;
        if (zzgfVarC == null) {
            zzgb zzgbVar2 = this.f350396b;
            int i13 = 0;
            while (true) {
                char[] cArr = zzgbVar2.f350388b;
                if (i13 >= cArr.length) {
                    zzgbVar = zzgbVar2;
                    break;
                }
                if (zzba.zza(cArr[i13])) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= cArr.length) {
                            z12 = false;
                            break;
                        }
                        char c12 = cArr[i14];
                        if (c12 >= 'A' && c12 <= 'Z') {
                            z12 = true;
                            break;
                        }
                        i14++;
                    }
                    zzbm.zzf(!z12, "Cannot call upperCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i15 = 0; i15 < cArr.length; i15++) {
                        char c13 = cArr[i15];
                        if (zzba.zza(c13)) {
                            c13 ^= 32;
                        }
                        cArr2[i15] = (char) c13;
                    }
                    zzgbVar = new zzgb(zzgbVar2.f350387a.concat(".upperCase()"), cArr2);
                    if (zzgbVar2.f350394h && !zzgbVar.f350394h) {
                        byte[] bArr = zzgbVar.f350393g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i12 = 65; i12 <= 90; i12++) {
                            int i16 = i12 | 32;
                            byte b12 = bArr[i12];
                            byte b13 = bArr[i16];
                            if (b12 == -1) {
                                bArrCopyOf[i12] = b13;
                            } else {
                                char c14 = (char) i12;
                                char c15 = (char) i16;
                                if (b13 != -1) {
                                    throw new IllegalStateException(zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c14), Character.valueOf(c15)));
                                }
                                bArrCopyOf[i16] = b12;
                            }
                        }
                        zzgbVar = new zzgb(zzgbVar.f350387a.concat(".ignoreCase()"), zzgbVar.f350388b, bArrCopyOf, true);
                    }
                } else {
                    i13++;
                }
            }
            zzgfVarC = zzgbVar == zzgbVar2 ? this : c(zzgbVar, this.f350397c);
            this.f350398d = zzgfVarC;
        }
        return zzgfVarC;
    }

    public zzge(String str, String str2) {
        this(new zzgb(str, str2.toCharArray()), (Character) '=');
    }
}
