package com.avito.android.image_loader;

import android.net.Uri;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SimplePicture.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/p;", "Lcom/avito/android/image_loader/k;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class p implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Uri f169558a;

    public p(@Y61.k Uri uri) {
        this.f169558a = uri;
    }

    @Override // com.avito.android.image_loader.k
    @Y61.k
    public final Uri a(@Y61.k View view) {
        return this.f169558a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && L.f(this.f169558a, ((p) obj).f169558a);
    }

    public final int hashCode() {
        return this.f169558a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.t(new StringBuilder("SimplePicture(uri="), this.f169558a, ')');
    }
}
