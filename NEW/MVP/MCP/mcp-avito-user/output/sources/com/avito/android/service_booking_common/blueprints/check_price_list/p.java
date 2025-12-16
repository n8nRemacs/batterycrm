package com.avito.android.service_booking_common.blueprints.check_price_list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.workaround.v;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.p6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qt0.C47439c;

/* compiled from: SbCheckPriceListViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/check_price_list/p;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f276262h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f276263b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.asynclayoutinflater.view.a f276264c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f276265d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f276266e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f276267f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f276268g;

    public p(@Y61.k View view) {
        super(view);
        this.f276263b = view;
        this.f276264c = new androidx.asynclayoutinflater.view.a(view.getContext());
        this.f276265d = (TextView) this.itemView.findViewById(R.id.sb_service_group_title);
        this.f276266e = (ViewGroup) this.itemView.findViewById(R.id.sb_collapse_title_container);
        this.f276267f = (ImageView) this.itemView.findViewById(R.id.sb_collapse_icon);
        this.f276268g = (ViewGroup) this.itemView.findViewById(R.id.sb_services_list_container);
    }

    public final void B80(ViewGroup viewGroup, List<C47439c.a> list, String str, Y41.p<? super C47439c.a, ? super String, G0> pVar, Y41.l<? super C47439c.a, G0> lVar) throws InterruptedException {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f276264c.a(R.layout.service_booking_item_check_price_list_value, viewGroup, new v((C47439c.a) it.next(), lVar, pVar, str));
        }
    }

    public final void C80(boolean z12) {
        ViewGroup viewGroup = this.f276268g;
        View view = this.f276263b;
        ImageView imageView = this.f276267f;
        if (z12) {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowExpandLess24, view.getContext()));
            D6.w(viewGroup);
        } else {
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowExpandMore24, view.getContext()));
            D6.H(viewGroup);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f276266e.setOnClickListener(null);
        p6 p6Var = new p6(this.f276268g);
        while (p6Var.hasNext()) {
            ((View) p6Var.next()).setOnClickListener(null);
        }
    }
}
