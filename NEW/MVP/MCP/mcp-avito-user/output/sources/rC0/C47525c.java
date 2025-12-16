package rC0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_cpt.configure.levels.ui.items.header.i;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TariffCptConfigureLevelsPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrC0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rC0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47525c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f429652b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f429653c = y6.b(10);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof i;
        int i12 = this.f429652b;
        rect.left = (!z12 && (cW2 instanceof com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.i)) ? 0 : i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (!(cW3 instanceof i) && (cW3 instanceof com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.i)) {
            i12 = 0;
        }
        rect.right = i12;
        rect.top = recyclerView.W(view) instanceof com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.i ? this.f429653c : 0;
    }
}
