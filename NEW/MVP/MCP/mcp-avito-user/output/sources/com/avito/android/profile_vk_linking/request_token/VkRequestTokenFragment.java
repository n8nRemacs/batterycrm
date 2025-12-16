package com.avito.android.profile_vk_linking.request_token;

import Cd.C13243a;
import Lc0.InterfaceC14378a;
import Zc0.InterfaceC19538a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: VkRequestTokenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/VkRequestTokenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Args", "a", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VkRequestTokenFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final a f231336q0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public l f231337n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_vk_linking.request_token.g f231338o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f231339p0;

    /* compiled from: VkRequestTokenFragment.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/VkRequestTokenFragment$Args;", "Landroid/os/Parcelable;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Args> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f231340b;

        /* compiled from: VkRequestTokenFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                return new Args(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i12) {
                return new Args[i12];
            }
        }

        public Args(@Y61.k String str) {
            this.f231340b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Args) && L.f(this.f231340b, ((Args) obj).f231340b);
        }

        public final int hashCode() {
            return this.f231340b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Args(url="), this.f231340b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f231340b);
        }
    }

    /* compiled from: VkRequestTokenFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/VkRequestTokenFragment$a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VkRequestTokenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZc0/a;", "it", "Lkotlin/G0;", "invoke", "(LZc0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC19538a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC19538a interfaceC19538a) {
            a aVar = VkRequestTokenFragment.f231336q0;
            ((com.avito.android.profile_vk_linking.request_token.f) VkRequestTokenFragment.this.f231339p0.getValue()).accept(interfaceC19538a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f231342l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f231342l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f231342l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VkRequestTokenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f231344l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f231344l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f231344l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f231345l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f231345l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f231345l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f231346l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f231346l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f231346l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VkRequestTokenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile_vk_linking/request_token/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.profile_vk_linking.request_token.f> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.profile_vk_linking.request_token.f invoke() {
            com.avito.android.profile_vk_linking.request_token.g gVar = VkRequestTokenFragment.this.f231338o0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.profile_vk_linking.request_token.f) gVar.get();
        }
    }

    public VkRequestTokenFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f231339p0 = new O0(m0.f406844a.b(com.avito.android.profile_vk_linking.request_token.f.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        Args args;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            args = (Args) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("args_key", Args.class) : arguments.getParcelable("args_key"));
        } else {
            args = null;
        }
        if (args == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.profile_vk_linking.request_token.di.a.a().a(args.f231340b, new b(), (InterfaceC14378a) C29972i.a(C29972i.b(this), InterfaceC14378a.class), cv.c.b(this)).a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_token_request_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.profile_vk_linking.request_token.f fVar = (com.avito.android.profile_vk_linking.request_token.f) this.f231339p0.getValue();
        l lVar = this.f231337n0;
        if (lVar == null) {
            lVar = null;
        }
        new k(view, this, fVar, lVar);
    }
}
