package com.avito.android.photo_list_view;

import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.E;
import kotlin.Metadata;

/* compiled from: PhotoDragAndDrop.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/F;", "Lcom/avito/android/photo_list_view/E;", "<init>", "()V", "_avito_photo-drag-n-drop_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class F implements E {
    @Override // com.avito.android.photo_list_view.E
    @Y61.k
    public final E.a a(@Y61.k RecyclerView recyclerView, @Y61.k H h12) {
        C23427s c23427s = new C23427s(new B(h12));
        c23427s.c(recyclerView);
        return new com.avito.android.offlinization.ui.a(c23427s, 4);
    }
}
