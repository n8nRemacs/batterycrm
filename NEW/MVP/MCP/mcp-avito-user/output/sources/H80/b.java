package h80;

import Y61.k;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.E;
import com.avito.android.photo_list_view.H;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupsPhotoDragAndDropImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh80/b;", "Lcom/avito/android/photo_list_view/E;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements E {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view_groups.b f397014a;

    public b(@k com.avito.android.photo_list_view_groups.b bVar) {
        this.f397014a = bVar;
    }

    @Override // com.avito.android.photo_list_view.E
    @k
    public final E.a a(@k RecyclerView recyclerView, @k H h12) {
        C23427s c23427s = new C23427s(new C40781a(this.f397014a, h12));
        c23427s.c(recyclerView);
        return new com.avito.android.offlinization.ui.a(c23427s, 4);
    }
}
