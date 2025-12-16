package fb;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;

/* compiled from: AdvertDetailStatsTabView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfb/b;", "Lfb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fb.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40391b implements InterfaceC40390a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f395970a;

    public C40391b(@k View view, @k com.avito.konveyor.adapter.a aVar, @k j jVar) {
        this.f395970a = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_advert_stats);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
    }
}
