package com.avito.android.search.filter.adapter.segment;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.select.SegmentedControlRedesign;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SegmentItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/segment/i;", "Lcom/avito/android/search/filter/adapter/segment/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SegmentedControlRedesign f262570b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f262571c;

    /* compiled from: SegmentItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "", "text", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Integer, CharSequence, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f262572l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(2);
            this.f262572l = eVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            this.f262572l.kJ(num.intValue(), charSequence);
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.segmented_control);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.select.SegmentedControlRedesign");
        }
        this.f262570b = (SegmentedControlRedesign) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262571c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.search.filter.adapter.segment.h
    public final void Bz(@k SegmentedControl.b bVar) {
        this.f262570b.setOnClickListener(new a((e) bVar));
    }

    @Override // com.avito.android.search.filter.adapter.segment.h
    public final void O00(int i12, @k List list) {
        this.f262570b.d(i12, list);
    }

    @Override // com.avito.android.search.filter.adapter.segment.h
    public final void setTitle(@l String str) {
        I5.a(this.f262571c, str, false);
        if (str == null || C43066x.K(str)) {
            D6.c(this.f262570b, null, Integer.valueOf(y6.b(4)), null, null, 13);
        } else {
            D6.c(this.f262570b, null, Integer.valueOf(y6.b(12)), null, null, 13);
        }
    }
}
