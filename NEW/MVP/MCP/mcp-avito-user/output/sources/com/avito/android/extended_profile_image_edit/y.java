package com.avito.android.extended_profile_image_edit;

import kotlin.Metadata;

/* compiled from: ImageSettings.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/y;", "", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f151137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f151138b;

    public y(int i12, int i13) {
        this.f151137a = i12;
        this.f151138b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f151137a == yVar.f151137a && this.f151138b == yVar.f151138b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151138b) + (Integer.hashCode(this.f151137a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageSize(width=");
        sb2.append(this.f151137a);
        sb2.append(", height=");
        return androidx.appcompat.app.r.t(sb2, this.f151138b, ')');
    }
}
