package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzkx<T> implements zzlj<T> {

    /* renamed from: a, reason: collision with root package name */
    public final zzkr f350941a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmi<?, ?> f350942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f350943c;

    /* renamed from: d, reason: collision with root package name */
    public final zziu<?> f350944d;

    public zzkx(zzmi<?, ?> zzmiVar, zziu<?> zziuVar, zzkr zzkrVar) {
        this.f350942b = zzmiVar;
        this.f350943c = zziuVar.g(zzkrVar);
        this.f350944d = zziuVar;
        this.f350941a = zzkrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zza(T t12) {
        zzmi<?, ?> zzmiVar = this.f350942b;
        int iJ2 = zzmiVar.j(zzmiVar.p(t12));
        return this.f350943c ? iJ2 + this.f350944d.b(t12).zza() : iJ2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zzb(T t12) {
        int iHashCode = this.f350942b.p(t12).hashCode();
        return this.f350943c ? (iHashCode * 53) + this.f350944d.b(t12).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zzc(T t12) {
        this.f350942b.r(t12);
        this.f350944d.j(t12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final boolean zzd(T t12) {
        return this.f350944d.b(t12).zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final T zza() {
        zzkr zzkrVar = this.f350941a;
        if (zzkrVar instanceof zzjf) {
            return (T) ((zzjf) ((zzjf) zzkrVar).g(zzjf.zze.zzd));
        }
        return (T) zzkrVar.zzcd().zzai();
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final boolean zzb(T t12, T t13) {
        zzmi<?, ?> zzmiVar = this.f350942b;
        if (!zzmiVar.p(t12).equals(zzmiVar.p(t13))) {
            return false;
        }
        if (!this.f350943c) {
            return true;
        }
        zziu<?> zziuVar = this.f350944d;
        return zziuVar.b(t12).equals(zziuVar.b(t13));
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t12, T t13) {
        Class<?> cls = zzll.f350960a;
        zzmi<?, ?> zzmiVar = this.f350942b;
        zzmiVar.o(t12, zzmiVar.c(zzmiVar.p(t12), zzmiVar.p(t13)));
        if (this.f350943c) {
            zziu<?> zziuVar = this.f350944d;
            zziy<T> zziyVarB = zziuVar.b(t13);
            if (zziyVarB.f350881a.isEmpty()) {
                return;
            }
            zziuVar.i(t12).zza(zziyVarB);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t12, zzlk zzlkVar, zzis zzisVar) {
        boolean zZzt;
        zzmi<?, ?> zzmiVar = this.f350942b;
        zzmh zzmhVarN = zzmiVar.n(t12);
        zziu<?> zziuVar = this.f350944d;
        zziuVar.i(t12);
        while (zzlkVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzlkVar.zzd();
                zzkr zzkrVar = this.f350941a;
                if (iZzd == 11) {
                    int iZzj = 0;
                    zzjf.zzf zzfVarC = null;
                    zzhu zzhuVarZzp = null;
                    while (zzlkVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzlkVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzlkVar.zzj();
                            zzfVarC = zziuVar.c(zzisVar, zzkrVar, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzfVarC == null) {
                                zzhuVarZzp = zzlkVar.zzp();
                            } else {
                                zziuVar.e(zzfVarC);
                                throw null;
                            }
                        } else if (!zzlkVar.zzt()) {
                            break;
                        }
                    }
                    if (zzlkVar.zzd() != 12) {
                        throw new zzjq("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzhuVarZzp != null) {
                        if (zzfVarC == null) {
                            zzmiVar.f(zzmhVarN, iZzj, zzhuVarZzp);
                        } else {
                            zziuVar.h(zzfVarC);
                            throw null;
                        }
                    }
                    zZzt = true;
                } else if ((iZzd & 7) == 2) {
                    zzjf.zzf zzfVarC2 = zziuVar.c(zzisVar, zzkrVar, iZzd >>> 3);
                    if (zzfVarC2 == null) {
                        zZzt = zzmiVar.i(zzmhVarN, zzlkVar);
                    } else {
                        zziuVar.e(zzfVarC2);
                        throw null;
                    }
                } else {
                    zZzt = zzlkVar.zzt();
                }
                if (!zZzt) {
                    zzmiVar.m(t12, zzmhVarN);
                    return;
                }
            } catch (Throwable th2) {
                zzmiVar.m(t12, zzmhVarN);
                throw th2;
            }
        }
        zzmiVar.m(t12, zzmhVarN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2 A[EDGE_INSN: B:56:0x00a2->B:34:0x00a2 BREAK  A[LOOP:1: B:18:0x0062->B:61:0x0062], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.measurement.zzht r21) throws com.google.android.gms.internal.measurement.zzjq {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r20
            r9 = r21
            r1 = r17
            com.google.android.gms.internal.measurement.zzjf r1 = (com.google.android.gms.internal.measurement.zzjf) r1
            com.google.android.gms.internal.measurement.zzmh r2 = r1.zzb
            com.google.android.gms.internal.measurement.zzmh r3 = com.google.android.gms.internal.measurement.zzmh.zzc()
            if (r2 != r3) goto L1b
            com.google.android.gms.internal.measurement.zzmh r2 = new com.google.android.gms.internal.measurement.zzmh
            r2.<init>()
            r1.zzb = r2
        L1b:
            r10 = r2
            r1 = r17
            com.google.android.gms.internal.measurement.zzjf$zzd r1 = (com.google.android.gms.internal.measurement.zzjf.zzd) r1
            r1.n()
            r1 = r19
            r2 = 0
        L26:
            if (r1 >= r8) goto Lad
            int r3 = com.google.android.gms.internal.measurement.zzhq.o(r7, r1, r9)
            int r1 = r9.zza
            r4 = 11
            com.google.android.gms.internal.measurement.zzkr r5 = r0.f350941a
            com.google.android.gms.internal.measurement.zziu<?> r6 = r0.f350944d
            r12 = 2
            if (r1 == r4) goto L60
            r4 = r1 & 7
            if (r4 != r12) goto L5b
            com.google.android.gms.internal.measurement.zzis r2 = r9.zzd
            int r4 = r1 >>> 3
            com.google.android.gms.internal.measurement.zzjf$zzf r12 = r6.c(r2, r5, r4)
            if (r12 != 0) goto L52
            r2 = r18
            r4 = r20
            r5 = r10
            r6 = r21
            int r1 = com.google.android.gms.internal.measurement.zzhq.d(r1, r2, r3, r4, r5, r6)
            r2 = r12
            goto L26
        L52:
            com.google.android.gms.internal.measurement.zzlf.zza()
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L5b:
            int r1 = com.google.android.gms.internal.measurement.zzhq.b(r1, r7, r3, r8, r9)
            goto L26
        L60:
            r1 = 0
            r4 = 0
        L62:
            if (r3 >= r8) goto La2
            int r3 = com.google.android.gms.internal.measurement.zzhq.o(r7, r3, r9)
            int r13 = r9.zza
            int r14 = r13 >>> 3
            r15 = r13 & 7
            if (r14 == r12) goto L8a
            r11 = 3
            if (r14 == r11) goto L74
            goto L99
        L74:
            if (r2 != 0) goto L81
            if (r15 != r12) goto L99
            int r3 = com.google.android.gms.internal.measurement.zzhq.j(r7, r3, r9)
            java.lang.Object r4 = r9.zzc
            com.google.android.gms.internal.measurement.zzhu r4 = (com.google.android.gms.internal.measurement.zzhu) r4
            goto L62
        L81:
            com.google.android.gms.internal.measurement.zzlf.zza()
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L8a:
            if (r15 != 0) goto L99
            int r3 = com.google.android.gms.internal.measurement.zzhq.o(r7, r3, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.measurement.zzis r2 = r9.zzd
            com.google.android.gms.internal.measurement.zzjf$zzf r2 = r6.c(r2, r5, r1)
            goto L62
        L99:
            r11 = 12
            if (r13 == r11) goto La2
            int r3 = com.google.android.gms.internal.measurement.zzhq.b(r13, r7, r3, r8, r9)
            goto L62
        La2:
            if (r4 == 0) goto Laa
            int r1 = r1 << 3
            r1 = r1 | r12
            r10.b(r1, r4)
        Laa:
            r1 = r3
            goto L26
        Lad:
            if (r1 != r8) goto Lb0
            return
        Lb0:
            com.google.android.gms.internal.measurement.zzjq r1 = com.google.android.gms.internal.measurement.zzjq.d()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzht):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t12, zzne zzneVar) {
        Iterator itZzd = this.f350944d.b(t12).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzja zzjaVar = (zzja) entry.getKey();
            if (zzjaVar.zzc() == zznf.MESSAGE && !zzjaVar.zze() && !zzjaVar.zzd()) {
                if (entry instanceof zzju) {
                    zzneVar.zza(zzjaVar.zza(), (Object) ((zzju) entry).zza().zzc());
                } else {
                    zzneVar.zza(zzjaVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzmi<?, ?> zzmiVar = this.f350942b;
        zzmiVar.h(zzmiVar.p(t12), zzneVar);
    }
}
