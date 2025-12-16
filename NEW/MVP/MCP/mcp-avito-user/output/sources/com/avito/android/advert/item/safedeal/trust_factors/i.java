package com.avito.android.advert.item.safedeal.trust_factors;

import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsTooltipHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/i;", "Lcom/avito/android/advert/item/safedeal/trust_factors/e;", "c", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f79171b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f79172c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79174e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f79175f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f79176g;

    /* renamed from: h, reason: collision with root package name */
    public final int f79177h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.f f79178i;

    /* compiled from: TrustFactorsTooltipHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f79179l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView recyclerView) {
            super(0);
            this.f79179l = recyclerView;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(this.f79179l.getTop());
        }
    }

    /* compiled from: TrustFactorsTooltipHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f79180l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView recyclerView) {
            super(0);
            this.f79180l = recyclerView;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(this.f79180l.getBottom());
        }
    }

    /* compiled from: TrustFactorsTooltipHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/i$c;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
    }

    public i() {
        throw null;
    }

    public i(RecyclerView recyclerView, View view, int i12, int i13, Y41.a aVar, Y41.a aVar2, int i14, int i15, C42822w c42822w) {
        i12 = (i15 & 4) != 0 ? 2 : i12;
        i13 = (i15 & 8) != 0 ? 2 : i13;
        aVar = (i15 & 16) != 0 ? new a(recyclerView) : aVar;
        aVar2 = (i15 & 32) != 0 ? new b(recyclerView) : aVar2;
        i14 = (i15 & 64) != 0 ? y6.b(300) : i14;
        this.f79171b = recyclerView;
        this.f79172c = view;
        this.f79173d = i12;
        this.f79174e = i13;
        this.f79175f = aVar;
        this.f79176g = aVar2;
        this.f79177h = i14;
    }

    public final void a() {
        com.avito.android.lib.design.tooltip.f fVar = this.f79178i;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final void b(@Y61.k String str, @Y61.k SafeDeal.TooltipData tooltipData, @Y61.k d dVar) {
        com.avito.android.lib.design.tooltip.f fVar = new com.avito.android.lib.design.tooltip.f(this.f79171b, this.f79172c, this.f79173d, this.f79174e, this.f79175f, this.f79176g);
        this.f79178i = fVar;
        fVar.c(new m(this, tooltipData, dVar, str), false);
    }
}
