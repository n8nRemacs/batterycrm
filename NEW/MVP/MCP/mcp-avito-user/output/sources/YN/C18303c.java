package Yn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemsState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LYn/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C18303c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f19653f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C18303c f19654g = new C18303c(null, C42784z0.f406748b, 1, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Api1PromoCategoryTreeItemsResponse.ActionType f19655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.android.category_items_tree.screens.items_screen.a> f19656c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19657d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19658e;

    /* compiled from: CategoryItemsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYn/c$a;", "", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yn.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18303c(@l Api1PromoCategoryTreeItemsResponse.ActionType actionType, @k List<? extends com.avito.android.category_items_tree.screens.items_screen.a> list, int i12, boolean z12) {
        this.f19655b = actionType;
        this.f19656c = list;
        this.f19657d = i12;
        this.f19658e = z12;
    }

    public static C18303c a(C18303c c18303c, List list) {
        Api1PromoCategoryTreeItemsResponse.ActionType actionType = c18303c.f19655b;
        int i12 = c18303c.f19657d;
        boolean z12 = c18303c.f19658e;
        c18303c.getClass();
        return new C18303c(actionType, list, i12, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18303c)) {
            return false;
        }
        C18303c c18303c = (C18303c) obj;
        return this.f19655b == c18303c.f19655b && L.f(this.f19656c, c18303c.f19656c) && this.f19657d == c18303c.f19657d && this.f19658e == c18303c.f19658e;
    }

    public final int hashCode() {
        Api1PromoCategoryTreeItemsResponse.ActionType actionType = this.f19655b;
        return Boolean.hashCode(this.f19658e) + r.e(this.f19657d, H.e((actionType == null ? 0 : actionType.hashCode()) * 31, 31, this.f19656c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryItemsState(actionType=");
        sb2.append(this.f19655b);
        sb2.append(", items=");
        sb2.append(this.f19656c);
        sb2.append(", page=");
        sb2.append(this.f19657d);
        sb2.append(", lastPage=");
        return r.x(sb2, this.f19658e, ')');
    }
}
