package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
public final class zzx {

    /* renamed from: a, reason: collision with root package name */
    public final zzo f350249a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f350250b;

    /* renamed from: c, reason: collision with root package name */
    public final zzu f350251c;

    public zzx(zzu zzuVar, boolean z12, zzo zzoVar) {
        this.f350251c = zzuVar;
        this.f350250b = z12;
        this.f350249a = zzoVar;
    }

    public static zzx zzc(zzo zzoVar) {
        return new zzx(new zzu(zzoVar), false, zzn.f350240b);
    }

    public final zzx zzb() {
        return new zzx(this.f350251c, true, this.f350249a);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new zzv(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        zzt zztVar = new zzt(this.f350251c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zztVar.hasNext()) {
            arrayList.add((String) zztVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
