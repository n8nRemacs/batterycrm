package r80;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FolderListPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr80/a;", "Landroid/widget/PopupWindow;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47508a extends PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final RecyclerView f429632a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public C47511d f429633b;

    public C47508a(@k ActivityC22955m activityC22955m) {
        super(activityC22955m);
        View viewInflate = LayoutInflater.from(activityC22955m).inflate(R.layout.popup_gallery_folders, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        this.f429632a = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        RecyclerView recyclerView2 = this.f429632a;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        }
        setContentView(viewInflate);
    }
}
