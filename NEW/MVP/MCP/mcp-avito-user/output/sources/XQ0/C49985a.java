package xq0;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HintsViewPagerAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxq0/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lxq0/a$b;", "a", "b", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49985a extends RecyclerView.Adapter<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<UserAdvertsHintItem, G0> f442666c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f442667d = new ArrayList();

    /* compiled from: HintsViewPagerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxq0/a$a;", "", "<init>", "()V", "", "HINTS_INFINITY_SCROLL_MULTIPLIER", "I", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xq0.a$a, reason: collision with other inner class name */
    public static final class C12881a {
        public /* synthetic */ C12881a(C42822w c42822w) {
            this();
        }

        public C12881a() {
        }
    }

    /* compiled from: HintsViewPagerAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxq0/a$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xq0.a$b */
    public static final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final l<UserAdvertsHintItem, G0> f442668b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.seller_coach.adverts_hint.item.a f442669c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k View view, @k l<? super UserAdvertsHintItem, G0> lVar) {
            super(view);
            this.f442668b = lVar;
            this.f442669c = new com.avito.android.seller_coach.adverts_hint.item.a(view);
        }
    }

    static {
        new C12881a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49985a(@k l<? super UserAdvertsHintItem, G0> lVar) {
        this.f442666c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f442667d;
        int size = arrayList.size();
        int size2 = arrayList.size();
        return size > 1 ? size2 * 100 : size2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        ArrayList arrayList = this.f442667d;
        bVar.f442669c.a((UserAdvertsHintItem) arrayList.get(i12 % arrayList.size()), bVar.f442668b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.seller_coach_hint_item, viewGroup, false);
        viewB.setLayoutParams(new ConstraintLayout.b(-1, -1));
        return new b(viewB, this.f442666c);
    }
}
