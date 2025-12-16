package com.avito.android.extended_profile_image_edit;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageSettings.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/x;", "", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f151132a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final y f151133b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f151134c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f151135d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f151136e;

    public x(@Y61.k String str, @Y61.k y yVar, boolean z12, @Y61.k String str2, @Y61.k String str3) {
        this.f151132a = str;
        this.f151133b = yVar;
        this.f151134c = z12;
        this.f151135d = str2;
        this.f151136e = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f151132a, xVar.f151132a) && L.f(this.f151133b, xVar.f151133b) && this.f151134c == xVar.f151134c && L.f(this.f151135d, xVar.f151135d) && L.f(this.f151136e, xVar.f151136e);
    }

    public final int hashCode() {
        return this.f151136e.hashCode() + H.d(androidx.appcompat.app.r.i((this.f151133b.hashCode() + (this.f151132a.hashCode() * 31)) * 31, 31, this.f151134c), 31, this.f151135d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageSettings(operationId=");
        sb2.append(this.f151132a);
        sb2.append(", minImageSize=");
        sb2.append(this.f151133b);
        sb2.append(", showWarningMessage=");
        sb2.append(this.f151134c);
        sb2.append(", warningHeader=");
        sb2.append(this.f151135d);
        sb2.append(", warningBody=");
        return C22026a.c(sb2, this.f151136e, ')');
    }
}
