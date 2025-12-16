package com.google.android.gms.internal.measurement;

import androidx.camera.camera2.internal.G;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzay {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f350574a = new ArrayList();

    public final void a(String str) {
        if (!this.f350574a.contains(zzg.zza(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(G.f("Command not implemented: ", str));
    }

    public abstract zzaq zza(String str, zzh zzhVar, List<zzaq> list);
}
