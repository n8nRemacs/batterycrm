package com.avito.android.virtual_deal_room_reference_category.reference_invite;

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
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.virtual_deal_room_reference_category.reference_invite.model.ReferenceInviteArguments;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReferenceInviteFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_invite/ReferenceInviteFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReferenceInviteFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f327263o0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f327264n0;

    /* compiled from: ReferenceInviteFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_invite/ReferenceInviteFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReferenceInviteFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_reference_category.reference_invite.ReferenceInviteFragment$a$a, reason: collision with other inner class name */
        public static final class C10148a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ReferenceInviteArguments f327265l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10148a(ReferenceInviteArguments referenceInviteArguments) {
                super(1);
                this.f327265l = referenceInviteArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f327265l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ReferenceInviteFragment a(@k ReferenceInviteArguments referenceInviteArguments) {
            ReferenceInviteFragment referenceInviteFragment = new ReferenceInviteFragment();
            C35966w1.a(referenceInviteFragment, -1, new C10148a(referenceInviteArguments));
            return referenceInviteFragment;
        }

        public a() {
        }
    }

    /* compiled from: ReferenceInviteFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room_reference_category/reference_invite/model/ReferenceInviteArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ReferenceInviteArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ReferenceInviteArguments invoke() {
            Bundle bundleRequireArguments = ReferenceInviteFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", ReferenceInviteArguments.class) : bundleRequireArguments.getParcelable("arguments");
            if (parcelable != null) {
                return (ReferenceInviteArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ReferenceInviteFragment() {
        super(0, 1, null);
        this.f327264n0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.virtual_deal_room_reference_category_invite_layout, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.reference_invite_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(requireContext().getString(R.string.virtual_deal_room_reference_category_invite, ((ReferenceInviteArguments) this.f327264n0.getValue()).f327267b));
    }
}
