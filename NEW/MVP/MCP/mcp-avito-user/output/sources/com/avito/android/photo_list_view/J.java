package com.avito.android.photo_list_view;

import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.C33210d;
import kotlin.Metadata;

/* compiled from: PhotoViewHolderProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/J;", "Lcom/avito/android/photo_list_view/d$a;", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class J implements C33210d.a {
    @Override // com.avito.android.photo_list_view.C33210d.a
    @Y61.k
    public final Q a(@Y61.k Y41.l lVar, @Y61.k s sVar) {
        return new D((View) ((C33211e) lVar).invoke(Integer.valueOf(R.layout.item_appending_view)), sVar);
    }

    @Override // com.avito.android.photo_list_view.C33210d.a
    @Y61.k
    public final Q b(@Y61.k Y41.l lVar, @Y61.k s sVar) {
        return new A((View) ((C33211e) lVar).invoke(Integer.valueOf(R.layout.item_photo_view)), sVar);
    }
}
