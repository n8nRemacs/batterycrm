package hf0;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.job.cv_info_actualization.ui.items.radio.g;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DeliverySummaryFeeDetailsAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lhf0/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhf0/a$a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40928a extends RecyclerView.Adapter<C11267a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<C40930c> f397342c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final H f397343d;

    /* compiled from: DeliverySummaryFeeDetailsAdapter.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhf0/a$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hf0.a$a, reason: collision with other inner class name */
    public static final class C11267a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DescriptionParameterItem f397344b;

        public C11267a(@k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.summary_delivery_fee_details_item);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
            }
            this.f397344b = (DescriptionParameterItem) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40928a(@k l lVar, @k List list) {
        this.f397342c = list;
        this.f397343d = (H) lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f397342c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        String str;
        String str2;
        C11267a c11267a = (C11267a) c12;
        C40930c c40930c = this.f397342c.get(i12);
        DescriptionParameterItem descriptionParameterItem = c11267a.f397344b;
        descriptionParameterItem.getLeftTextView().setText(c40930c.f397347a);
        j.a(descriptionParameterItem.getRightTextView(), c40930c.f397348b, null);
        e eVar = c40930c.f397349c;
        if (eVar == null || (str = eVar.f397352c) == null || C43066x.K(str) || (str2 = eVar.f397350a) == null || C43066x.K(str2)) {
            return;
        }
        descriptionParameterItem.setLeftTextIconDrawable(C35835l0.h(R.attr.ic_help20, descriptionParameterItem.getContext()));
        descriptionParameterItem.setLeftTextIconClickListener(new g(c11267a, c40930c, this, 24));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new C11267a(C0.b(viewGroup, R.layout.delivery_summary_fee_details_item, viewGroup, false));
    }
}
