package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37015z2 implements com.google.android.gms.internal.measurement.zzo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f355512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36959r2 f355513b;

    public C37015z2(C36959r2 c36959r2, String str) {
        this.f355512a = str;
        this.f355513b = c36959r2;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f355513b.f355340d.get(this.f355512a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
