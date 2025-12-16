package com.google.android.play.core.review;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class zza extends ReviewInfo {

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f358649b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f358650c;

    public zza(PendingIntent pendingIntent, boolean z12) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f358649b = pendingIntent;
        this.f358650c = z12;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent c() {
        return this.f358649b;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean d() {
        return this.f358650c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f358649b.equals(reviewInfo.c()) && this.f358650c == reviewInfo.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f358649b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f358650c ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f358649b.toString() + ", isNoOp=" + this.f358650c + "}";
    }
}
