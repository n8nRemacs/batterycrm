package zp0;

import L91.q;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.NavigationNode;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: FiltersBackNavigationAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lzp0/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lzp0/a$a;", "<init>", "()V", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50606a extends RecyclerView.Adapter<C12976a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public List<NavigationNode> f444253c = C42784z0.f406748b;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f444254d;

    /* compiled from: FiltersBackNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzp0/a$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zp0.a$a, reason: collision with other inner class name */
    public static final class C12976a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f444255b;

        public C12976a(@k View view) {
            super(view);
            this.f444255b = (TextView) view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f444253c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        NavigationNode navigationNode = this.f444253c.get(i12);
        TextView textView = ((C12976a) c12).f444255b;
        int iD2 = C35835l0.d(R.attr.gray54, textView.getContext());
        int iD3 = C35835l0.d(R.attr.blue600, textView.getContext());
        textView.setText(navigationNode.getTitle());
        if (i12 == this.f444253c.size() - 1) {
            textView.setTextColor(iD2);
            textView.setOnClickListener(new q(6));
        } else {
            textView.setTextColor(iD3);
            textView.setOnClickListener(new ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c(9, this, navigationNode));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new C12976a(C0.b(viewGroup, R.layout.filters_back_navigation_node, viewGroup, false));
    }
}
