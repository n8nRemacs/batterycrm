package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AbstractC37097d;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class A extends AbstractC37097d.a {

    /* renamed from: a, reason: collision with root package name */
    public int f357996a;

    /* renamed from: b, reason: collision with root package name */
    public byte f357997b;

    @Override // com.google.android.play.core.appupdate.AbstractC37097d.a
    public final AbstractC37097d a() {
        if (this.f357997b == 3) {
            return new C(this.f357996a, false, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f357997b & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f357997b & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
