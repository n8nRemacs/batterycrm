package com.avito.android.image_loader;

import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: LocalPicture.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/j;", "Lcom/avito/android/image_loader/k;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class j implements k {
    @Override // com.avito.android.image_loader.k
    @Y61.k
    public final Uri a(@Y61.k View view) {
        return new Uri.Builder().scheme("res").path(String.valueOf(R.drawable.ic_steering_wheel)).build();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        ((j) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_steering_wheel);
    }

    @Y61.k
    public final String toString() {
        return "LocalPicture(resId=2131234559)";
    }
}
