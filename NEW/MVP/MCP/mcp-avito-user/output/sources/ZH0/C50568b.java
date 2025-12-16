package zh0;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.rating_ui.rating_stat.RatingStatEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingStatView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzh0/b;", "Lzh0/a;", "_avito_rating-ui_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50568b implements InterfaceC50567a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TableLayout f444170a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f444171b;

    public C50568b(@k TableLayout tableLayout) {
        this.f444170a = tableLayout;
        this.f444171b = LayoutInflater.from(tableLayout.getContext());
    }

    public final void a(@k List<RatingStatEntry> list) {
        TableLayout tableLayout = this.f444170a;
        tableLayout.removeAllViews();
        for (RatingStatEntry ratingStatEntry : list) {
            View viewInflate = this.f444171b.inflate(R.layout.rating_table_row, (ViewGroup) tableLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.rating_row_stars);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
            }
            ((RatingBar) viewFindViewById).setRating(ratingStatEntry.f250116b);
            View viewFindViewById2 = viewInflate.findViewById(R.id.rating_row_bar);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar.ProgressBar");
            }
            ((ProgressBar) viewFindViewById2).setProgress(ratingStatEntry.f250117c);
            View viewFindViewById3 = viewInflate.findViewById(R.id.rating_row_count);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById3).setText(ratingStatEntry.f250118d);
            tableLayout.addView(viewInflate);
        }
    }
}
