package com.google.android.gms.internal.measurement;

import androidx.media3.exoplayer.analytics.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzai implements zzaq {

    /* renamed from: b, reason: collision with root package name */
    public final Double f350557b;

    public zzai(Double d12) {
        if (d12 == null) {
            this.f350557b = Double.valueOf(Double.NaN);
        } else {
            this.f350557b = d12;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzai) {
            return this.f350557b.equals(((zzai) obj).f350557b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350557b.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(zzf());
        }
        throw new IllegalArgumentException(m.l(zzf(), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzai(this.f350557b);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        Double d12 = this.f350557b;
        return Boolean.valueOf((Double.isNaN(d12.doubleValue()) || d12.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return this.f350557b;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() throws NumberFormatException {
        Double d12 = this.f350557b;
        if (Double.isNaN(d12.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d12.doubleValue())) {
            return d12.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d12.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i12 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i12 >= 0 || i12 <= -7) && (i12 < 0 || i12 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
