package com.avito.android.bxcontent.mvi.entity;

import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/v;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class v {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f112432c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final v f112433d = new v(false, 0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112434a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final FloatingPromoWidgetItem f112435b;

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/v$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v(boolean z12, @Y61.l FloatingPromoWidgetItem floatingPromoWidgetItem) {
        this.f112434a = z12;
        this.f112435b = floatingPromoWidgetItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f112434a == vVar.f112434a && L.f(this.f112435b, vVar.f112435b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f112434a) * 31;
        FloatingPromoWidgetItem floatingPromoWidgetItem = this.f112435b;
        return iHashCode + (floatingPromoWidgetItem == null ? 0 : floatingPromoWidgetItem.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "FloatingPromoWidgetState(isVisible=" + this.f112434a + ", widget=" + this.f112435b + ')';
    }

    public /* synthetic */ v(boolean z12, FloatingPromoWidgetItem floatingPromoWidgetItem, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, floatingPromoWidgetItem);
    }
}
