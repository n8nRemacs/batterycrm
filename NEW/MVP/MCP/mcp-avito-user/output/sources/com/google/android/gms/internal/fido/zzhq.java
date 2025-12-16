package com.google.android.gms.internal.fido;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzhq {
    public static final zzhp a(zzhs zzhsVar) throws zzhf, zzhj {
        try {
            zzhr zzhrVarZzd = zzhsVar.zzd();
            if (zzhrVarZzd == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte bZza = zzhrVarZzd.zza();
                byte bZzb = zzhrVarZzd.zzb();
                int i12 = 0;
                if (bZzb == -128) {
                    long jZza = zzhsVar.zza();
                    if (jZza > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    b(jZza, bZza);
                    zzhp[] zzhpVarArr = new zzhp[(int) jZza];
                    while (i12 < jZza) {
                        zzhpVarArr[i12] = a(zzhsVar);
                        i12++;
                    }
                    return new zzhg(zzcc.zzi(zzhpVarArr));
                }
                if (bZzb != -96) {
                    if (bZzb == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (bZzb == -32) {
                        return new zzhh(zzhsVar.zzf());
                    }
                    if (bZzb == 0 || bZzb == 32) {
                        long jZzb = zzhsVar.zzb();
                        b(jZzb > 0 ? jZzb : ~jZzb, bZza);
                        return new zzhk(jZzb);
                    }
                    if (bZzb == 64) {
                        byte[] bArrZzg = zzhsVar.zzg();
                        int length = bArrZzg.length;
                        b(length, bZza);
                        return new zzhi(zzgx.zzl(bArrZzg, 0, length));
                    }
                    if (bZzb == 96) {
                        String strZze = zzhsVar.zze();
                        b(strZze.length(), bZza);
                        return new zzhn(strZze);
                    }
                    throw new zzhj("Unidentifiable major type: " + zzhrVarZzd.zzc());
                }
                long jZzc = zzhsVar.zzc();
                if (jZzc > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                b(jZzc, bZza);
                int i13 = (int) jZzc;
                zzhl[] zzhlVarArr = new zzhl[i13];
                zzhp zzhpVar = null;
                int i14 = 0;
                while (i14 < jZzc) {
                    zzhp zzhpVarA = a(zzhsVar);
                    if (zzhpVar != null && zzhpVarA.compareTo(zzhpVar) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + zzhpVar.toString() + "\nCurrent key: " + zzhpVarA.toString());
                    }
                    zzhlVarArr[i14] = new zzhl(zzhpVarA, a(zzhsVar));
                    i14++;
                    zzhpVar = zzhpVarA;
                }
                TreeMap treeMap = new TreeMap();
                while (i12 < i13) {
                    zzhl zzhlVar = zzhlVarArr[i12];
                    if (treeMap.containsKey(zzhlVar.zza())) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzhlVar.zza(), zzhlVar.zzb());
                    i12++;
                }
                return new zzhm(zzcj.zzf(treeMap));
            } catch (IOException e12) {
                e = e12;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e13) {
                e = e13;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e14) {
            throw new zzhj("Error in decoding CborValue from bytes", e14);
        }
    }

    public static final void b(long j12, byte b12) throws zzhf {
        switch (b12) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                if (j12 < 24) {
                    throw new zzhf(e.i(j12, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (j12 < 256) {
                    throw new zzhf(e.i(j12, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (j12 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    throw new zzhf(e.i(j12, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (j12 < 4294967296L) {
                    throw new zzhf(e.i(j12, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
