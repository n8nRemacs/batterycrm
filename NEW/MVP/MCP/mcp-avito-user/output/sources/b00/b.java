package B00;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: PersonFormHorizontalFullscreenDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB00/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f772c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<Integer> f773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f774e;

    public b(@k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f771b = resources.getDimensionPixelOffset(R.dimen.form_horizontal_offset);
        this.f772c = resources.getDimensionPixelOffset(R.dimen.form_verification_banner_horizontal_offset);
        this.f773d = C42756l.l0(new Integer[]{Integer.valueOf(aVar.Y(com.avito.android.mortgage.person_form.list.items.input.compact.a.class)), Integer.valueOf(aVar.Y(com.avito.android.mortgage.person_form.list.items.select.compact.a.class))});
        this.f774e = aVar.Y(com.avito.android.mortgage.person_form.list.items.verification_banner.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (this.f773d.contains(Integer.valueOf(cW2.getItemViewType()))) {
            return;
        }
        int i12 = cW2.getItemViewType() == this.f774e ? this.f772c : this.f771b;
        rect.left = i12;
        rect.right = i12;
    }
}
