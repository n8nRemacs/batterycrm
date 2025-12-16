package r80;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.V0;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q80.C47254a;

/* compiled from: FoldersAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr80/d;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lr80/c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r80.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47511d extends RecyclerView.Adapter<C47510c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<C47254a> f429636c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f429637d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public com.avito.android.offlinization.ui.a f429638e;

    public /* synthetic */ C47511d(List list, boolean z12, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? false : z12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f429636c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C47510c c47510c = (C47510c) c12;
        C47254a c47254a = this.f429636c.get(i12);
        SimpleDraweeView simpleDraweeView = c47510c.f429635c;
        G0 g02 = null;
        if (this.f429637d) {
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            Drawable drawableH = C35835l0.h(R.attr.ic_logo24, c47510c.itemView.getContext());
            if (drawableH != null) {
                V0.a(drawableH, C35835l0.d(R.attr.white, c47510c.itemView.getContext()));
            } else {
                drawableH = null;
            }
            hierarchy.o(drawableH, 5);
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        Uri uri = c47254a.f429051c;
        if (uri != null) {
            aVarA.f(uri);
            aVarA.c();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            aVarA.b();
        }
        c47510c.f429634b.setText(c47254a.f429050b.k0(c47510c.itemView.getContext()));
        c47510c.itemView.setOnClickListener(new C(this, i12, c47254a, 21));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new C47510c(C0.b(viewGroup, this.f429637d ? R.layout.item_gallery_folder_re23 : R.layout.item_gallery_folder, viewGroup, false));
    }

    public C47511d(@k List<C47254a> list, boolean z12) {
        this.f429636c = list;
        this.f429637d = z12;
    }
}
