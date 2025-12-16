package com.google.android.gms.internal.fido;

import I41.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzbd {
    public static final CharSequence a(@a Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static zzbd zza(String str) {
        return new zzbd();
    }

    public final StringBuilder zzc(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(a(it.next()));
                while (it.hasNext()) {
                    sb2.append(",\n  ");
                    sb2.append(a(it.next()));
                }
            }
            return sb2;
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }
}
