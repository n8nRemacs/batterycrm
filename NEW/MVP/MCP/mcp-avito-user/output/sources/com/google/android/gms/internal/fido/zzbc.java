package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzbc {
    public static final Appendable zza(Appendable appendable, Iterator it, zzbd zzbdVar, String str) throws IOException {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzbd.a(entry.getKey()));
            appendable.append(" : ");
            appendable.append(zzbd.a(entry.getValue()));
            while (it.hasNext()) {
                zzbdVar.getClass();
                appendable.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(zzbd.a(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(zzbd.a(entry2.getValue()));
            }
        }
        return appendable;
    }
}
