package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitinstall.e0;
import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class r implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f358679a;

    public r(a aVar) {
        this.f358679a = aVar;
    }

    @Override // com.google.android.play.core.splitinstall.e0
    public final HashSet zza() {
        HashSet hashSet;
        a aVar = this.f358679a;
        synchronized (aVar.f358655c) {
            hashSet = new HashSet(aVar.f358655c);
        }
        return hashSet;
    }
}
