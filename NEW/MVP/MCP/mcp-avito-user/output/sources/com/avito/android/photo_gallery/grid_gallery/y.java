package com.avito.android.photo_gallery.grid_gallery;

import T70.a;
import T70.c;
import VU.b;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GridGalleryView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/y;", "Lcom/avito/android/photo_gallery/grid_gallery/n;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f217440a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f217441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T70.c, G0> f217442c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f217443d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f217444e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f217445f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f217446g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f217447h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f217448i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f217449j;

    /* renamed from: k, reason: collision with root package name */
    public int f217450k;

    /* renamed from: l, reason: collision with root package name */
    public int f217451l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final x f217452m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f217453n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final q f217454o;

    public y(@Y61.k GridGalleryActivity gridGalleryActivity, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.konveyor.adapter.d dVar2, @Y61.k Y41.l lVar) {
        this.f217440a = dVar;
        this.f217441b = dVar2;
        this.f217442c = lVar;
        ImageView imageView = (ImageView) gridGalleryActivity.findViewById(R.id.toolbarNavigateButton);
        this.f217443d = (TextView) gridGalleryActivity.findViewById(R.id.toolbarTitle);
        RecyclerView recyclerView = (RecyclerView) gridGalleryActivity.findViewById(R.id.nav_bar_blocks_rv);
        this.f217444e = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) gridGalleryActivity.findViewById(R.id.recycler);
        this.f217445f = recyclerView2;
        this.f217446g = (LinearLayout) gridGalleryActivity.findViewById(R.id.bottomBar);
        this.f217447h = (Button) gridGalleryActivity.findViewById(R.id.bottomBarButtonLeft);
        this.f217448i = gridGalleryActivity.findViewById(R.id.bottomBarButtonSeparator);
        this.f217449j = (Button) gridGalleryActivity.findViewById(R.id.bottomBarButtonRight);
        com.avito.android.photo_gallery.grid_gallery.items.navbar_block.c cVar = new com.avito.android.photo_gallery.grid_gallery.items.navbar_block.c(y6.b(6), y6.b(16));
        this.f217450k = -1;
        this.f217451l = -1;
        this.f217452m = new x(gridGalleryActivity);
        q qVar = new q(this);
        this.f217454o = qVar;
        v vVar = new v(this);
        imageView.setOnClickListener(new p(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(dVar2);
        recyclerView.l(cVar, -1);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView2.setAdapter(dVar);
        recyclerView2.setItemAnimator(null);
        recyclerView2.o(qVar);
        recyclerView2.o(vVar);
    }

    public static final void a(y yVar) {
        RecyclerView.m layoutManager = yVar.f217445f.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 == -1 && iM1 == -1) {
            return;
        }
        if (iK1 == yVar.f217450k && iM1 == yVar.f217451l) {
            return;
        }
        yVar.f217450k = iK1;
        yVar.f217451l = iM1;
        ((GridGalleryActivity.b) yVar.f217442c).invoke(new c.d(iK1, iM1));
    }

    public static void b(Button button, a.b bVar, Y41.a aVar) {
        String str = bVar.f15390c;
        if (str != null) {
            b.a aVar2 = VU.b.f17147t;
            Context context = button.getContext();
            aVar2.getClass();
            button.setStyle(b.a.b(context, str));
        }
        button.setText(bVar.f15388a);
        String str2 = bVar.f15389b;
        if (str2 != null) {
            button.setSubtitle(str2);
        }
        button.setOnClickListener(new p(aVar));
    }
}
