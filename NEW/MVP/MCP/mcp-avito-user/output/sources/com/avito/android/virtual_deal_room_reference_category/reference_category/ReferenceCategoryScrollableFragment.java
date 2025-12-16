package com.avito.android.virtual_deal_room_reference_category.reference_category;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.virtual_deal_room_reference_category.reference_category.item.text.TitleItem;
import com.avito.android.virtual_deal_room_reference_category.reference_category.model.ReferenceCategoryArguments;
import com.avito.konveyor.adapter.j;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import zN0.c;

/* compiled from: ReferenceCategoryScrollableFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/ReferenceCategoryScrollableFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "LzN0/c$c;", "<init>", "()V", "a", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReferenceCategoryScrollableFragment extends BaseFragment implements InterfaceC28477j.a, c.InterfaceC12952c {

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f327231q0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public j f327232n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f327233o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f327234p0;

    /* compiled from: ReferenceCategoryScrollableFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/ReferenceCategoryScrollableFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReferenceCategoryScrollableFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_reference_category.reference_category.ReferenceCategoryScrollableFragment$a$a, reason: collision with other inner class name */
        public static final class C10145a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ReferenceCategoryArguments f327235l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10145a(ReferenceCategoryArguments referenceCategoryArguments) {
                super(1);
                this.f327235l = referenceCategoryArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f327235l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ReferenceCategoryScrollableFragment a(@k ReferenceCategoryArguments referenceCategoryArguments) {
            ReferenceCategoryScrollableFragment referenceCategoryScrollableFragment = new ReferenceCategoryScrollableFragment();
            C35966w1.a(referenceCategoryScrollableFragment, -1, new C10145a(referenceCategoryArguments));
            return referenceCategoryScrollableFragment;
        }

        public a() {
        }
    }

    /* compiled from: ReferenceCategoryScrollableFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room_reference_category/reference_category/model/ReferenceCategoryArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ReferenceCategoryArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ReferenceCategoryArguments invoke() {
            Bundle bundleRequireArguments = ReferenceCategoryScrollableFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", ReferenceCategoryArguments.class) : bundleRequireArguments.getParcelable("arguments");
            if (parcelable != null) {
                return (ReferenceCategoryArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ReferenceCategoryScrollableFragment() {
        super(0, 1, null);
        this.f327234p0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        if (getParentFragmentManager().L() <= 0) {
            return false;
        }
        getParentFragmentManager().Y();
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.konveyor.adapter.a aVar = this.f327233o0;
        if (aVar == null) {
            aVar = null;
        }
        kotlin.ranges.l lVar = new kotlin.ranges.l(1, 30, 1);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVar, 10));
        kotlin.ranges.k it = lVar.iterator();
        while (it.f406910d) {
            arrayList.add(new TitleItem(String.valueOf(it.a()), requireContext().getString(R.string.virtual_deal_room_reference_category_category, ((ReferenceCategoryArguments) this.f327234p0.getValue()).f327262b)));
        }
        aVar.c(new UV0.c(arrayList));
        j jVar = this.f327232n0;
        (jVar != null ? jVar : null).notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.virtual_deal_room_reference_category_scrollable_layout, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.reference_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        j jVar = this.f327232n0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.virtual_deal_room_reference_category.reference_category.di.a.a().create().a(this);
    }
}
