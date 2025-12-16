package com.avito.android.virtual_deal_room_reference_category.reference_category;

import Y41.l;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.g;
import com.avito.android.util.C35966w1;
import com.avito.android.virtual_deal_room_reference_category.reference_category.model.ReferenceCategoryArguments;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import zN0.c;

/* compiled from: ReferenceCategoryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/ReferenceCategoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "LzN0/c$b;", "<init>", "()V", "a", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReferenceCategoryFragment extends BaseFragment implements InterfaceC28477j.a, c.b {

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f327227o0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f327228n0;

    /* compiled from: ReferenceCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/ReferenceCategoryFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReferenceCategoryFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_reference_category.reference_category.ReferenceCategoryFragment$a$a, reason: collision with other inner class name */
        public static final class C10144a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ReferenceCategoryArguments f327229l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10144a(ReferenceCategoryArguments referenceCategoryArguments) {
                super(1);
                this.f327229l = referenceCategoryArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f327229l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ReferenceCategoryFragment a(@k ReferenceCategoryArguments referenceCategoryArguments) {
            ReferenceCategoryFragment referenceCategoryFragment = new ReferenceCategoryFragment();
            C35966w1.a(referenceCategoryFragment, -1, new C10144a(referenceCategoryArguments));
            return referenceCategoryFragment;
        }

        public a() {
        }
    }

    /* compiled from: ReferenceCategoryFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room_reference_category/reference_category/model/ReferenceCategoryArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ReferenceCategoryArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ReferenceCategoryArguments invoke() {
            Bundle bundleRequireArguments = ReferenceCategoryFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", ReferenceCategoryArguments.class) : bundleRequireArguments.getParcelable("arguments");
            if (parcelable != null) {
                return (ReferenceCategoryArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ReferenceCategoryFragment() {
        super(0, 1, null);
        this.f327228n0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        if (getParentFragmentManager().L() <= 0) {
            return false;
        }
        getParentFragmentManager().Y();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.virtual_deal_room_reference_category_layout, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.reference_category_test);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(requireContext().getString(R.string.virtual_deal_room_reference_category_category, ((ReferenceCategoryArguments) this.f327228n0.getValue()).f327262b));
        View viewFindViewById2 = requireView().findViewById(R.id.reference_category_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById2).setOnClickListener(new g(this, 17));
    }
}
