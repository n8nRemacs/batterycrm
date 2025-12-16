package r80;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: FoldersAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr80/c;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r80.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47510c extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f429634b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f429635c;

    public C47510c(@k View view) {
        super(view);
        this.f429634b = (TextView) view.findViewById(R.id.folder_name);
        this.f429635c = (SimpleDraweeView) view.findViewById(R.id.photo_view);
    }
}
