package com.google.android.play.core.appupdate;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class o implements com.google.android.play.core.appupdate.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.appupdate.internal.g f358065a;

    public o(com.google.android.play.core.appupdate.internal.g gVar) {
        this.f358065a = gVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.g
    public final Object zza() {
        l lVar = (l) this.f358065a.zza();
        if (lVar != null) {
            return lVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
