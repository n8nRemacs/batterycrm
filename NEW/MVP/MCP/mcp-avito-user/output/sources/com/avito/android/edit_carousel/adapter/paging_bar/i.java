package com.avito.android.edit_carousel.adapter.paging_bar;

import Y41.l;
import Y61.k;
import android.graphics.Paint;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_carousel.B;
import com.avito.android.edit_carousel.PagingBar;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PagingBarItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/paging_bar/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_carousel/adapter/paging_bar/h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PagingBar f146320b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_search_paging_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.edit_carousel.PagingBar");
        }
        this.f146320b = (PagingBar) viewFindViewById;
    }

    @Override // com.avito.android.edit_carousel.adapter.paging_bar.h
    public final void cK(@k a aVar, @k l<? super Integer, G0> lVar) {
        int i12 = (int) aVar.f146311c;
        int i13 = (int) aVar.f146312d;
        PagingBar pagingBar = this.f146320b;
        pagingBar.getClass();
        if (i12 >= 2) {
            ArrayList arrayList = new ArrayList();
            kotlin.ranges.k it = new kotlin.ranges.l(1, String.valueOf(i12).length(), 1).iterator();
            while (it.f406910d) {
                String str = "";
                for (int i14 = 0; i14 < it.a(); i14++) {
                    str = str + '8';
                }
                Paint paint = pagingBar.f146229i;
                if (paint == null) {
                    paint = null;
                }
                arrayList.add(Integer.valueOf((int) paint.measureText(str)));
            }
            pagingBar.f146230j = arrayList;
            pagingBar.f146232l = i12;
            pagingBar.f146227g = pagingBar.c(C42745f0.M0(new kotlin.ranges.l(1, i12, 1)));
            if (i13 > i12) {
                i13 = 1;
            }
            pagingBar.f146233m = i13;
            pagingBar.requestLayout();
            if (!pagingBar.isLaidOut() || pagingBar.isLayoutRequested()) {
                pagingBar.addOnLayoutChangeListener(new B(pagingBar));
            } else {
                pagingBar.e();
            }
        }
        pagingBar.setOnPageSelectedListener(lVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f146320b.setOnPageSelectedListener(null);
    }
}
