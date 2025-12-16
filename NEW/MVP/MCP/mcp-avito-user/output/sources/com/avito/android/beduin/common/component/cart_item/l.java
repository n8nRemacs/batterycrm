package com.avito.android.beduin.common.component.cart_item;

import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CartItemPayload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/l;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class l {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f100919e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final BeduinCartItemModel.State f100920a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<BeduinModel> f100921b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<RightIcons> f100922c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100923d;

    /* compiled from: CartItemPayload.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/l$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.l BeduinCartItemModel.State state, @Y61.l List<? extends BeduinModel> list, @Y61.l List<? extends RightIcons> list2) {
        this.f100920a = state;
        this.f100921b = list;
        this.f100922c = list2;
        this.f100923d = state == null && list == 0 && list2 == 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f100920a == lVar.f100920a && L.f(this.f100921b, lVar.f100921b) && L.f(this.f100922c, lVar.f100922c);
    }

    public final int hashCode() {
        BeduinCartItemModel.State state = this.f100920a;
        int iHashCode = (state == null ? 0 : state.hashCode()) * 31;
        List<BeduinModel> list = this.f100921b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<RightIcons> list2 = this.f100922c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartItemPayload(state=");
        sb2.append(this.f100920a);
        sb2.append(", children=");
        sb2.append(this.f100921b);
        sb2.append(", rightIcons=");
        return H.p(sb2, this.f100922c, ')');
    }
}
