package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzeu extends zzei {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f350353d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzea f350354e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzer f350355f;

    /* renamed from: b, reason: collision with root package name */
    public final zzdn f350356b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f350357c;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzdh.zza, zzdm.zza)));
        f350353d = setUnmodifiableSet;
        f350354e = zzed.zza(setUnmodifiableSet).zzd();
        f350355f = new zzer();
    }

    public /* synthetic */ zzeu(String str, String str2, boolean z12, zzdn zzdnVar, Level level, Set set, zzea zzeaVar, zzet zzetVar) {
        super(str2);
        if (str2.length() > 23) {
            int i12 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i12 = length;
                    break;
                }
            }
            str2 = str2.substring(i12 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        strConcat.substring(0, Math.min(strConcat.length(), 23));
        this.f350356b = zzdnVar;
        this.f350357c = set;
    }

    public static zzer zzc() {
        return f350355f;
    }
}
