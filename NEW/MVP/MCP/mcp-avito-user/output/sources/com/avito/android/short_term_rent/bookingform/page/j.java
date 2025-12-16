package com.avito.android.short_term_rent.bookingform.page;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FormPageView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/page/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/page/i;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f282041b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f282042c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f282043d;

    /* compiled from: FormPageView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/short_term_rent/bookingform/page/j$a", "Landroidx/recyclerview/widget/z;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23434z {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final int i(@l View view, int i12) {
            if (view == null) {
                return 0;
            }
            return (j.this.f282042c.getHeight() / 2) - (view.getTop() + ((view.getBottom() - view.getTop()) / 2));
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return 0;
        }
    }

    public j(@k View view, @k com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f282041b = dVar;
        View viewFindViewById = view.findViewById(R.id.page);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f282042c = recyclerView;
        this.f282043d = new a(view.getContext());
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(dVar);
    }

    @Override // com.avito.android.short_term_rent.bookingform.page.i
    public final void B(@k List<? extends TV0.a> list) {
        this.f282041b.l(list, null);
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        this.f282042c.setAdapter(null);
    }

    @Override // com.avito.android.short_term_rent.bookingform.page.i
    public final void zr(int i12) {
        RecyclerView recyclerView = this.f282042c;
        recyclerView.post(new androidx.media3.exoplayer.drm.d(this, i12, recyclerView, 6));
    }
}
