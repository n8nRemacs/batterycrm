package com.avito.android.confirm_documents_bottom_sheet.ui;

import Cd.C13243a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.confirm_documents_bottom_sheet.di.a;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.confirm_documents_bottom_sheet.mvi.n;
import com.avito.android.confirm_documents_bottom_sheet.mvi.t;
import com.avito.android.confirm_documents_bottom_sheet.mvi.u;
import com.avito.android.confirm_documents_bottom_sheet.ui.ConfirmDocumentsDialogFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import cv.InterfaceC39417a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import wr.AbstractC49673a;
import wr.AbstractC49674b;
import z1.AbstractC50339a;

/* compiled from: ConfirmDocumentsDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/ui/ConfirmDocumentsDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConfirmDocumentsDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f125665m0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public u f125666h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f125667i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f125668j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f125669k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public b f125670l0;

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/ui/ConfirmDocumentsDialogFragment$a;", "", "<init>", "()V", "", "EXTRA_FROM_PAGE", "Ljava/lang/String;", "EXTRA_ITEM_ID", "EXTRA_SCREEN_NAME", "EXTRA_SHIFT_ID", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ConfirmDocumentsDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.confirm_documents_bottom_sheet.ui.ConfirmDocumentsDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C3731a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f125671l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f125672m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f125673n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f125674o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3731a(String str, String str2, String str3, String str4) {
                super(1);
                this.f125671l = str;
                this.f125672m = str2;
                this.f125673n = str3;
                this.f125674o = str4;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("EXTRA_ITEM_ID", this.f125671l);
                bundle2.putString("EXTRA_SHIFT_ID", this.f125672m);
                bundle2.putString("EXTRA_FROM_PAGE", this.f125673n);
                bundle2.putString("EXTRA_SCREEN_NAME", this.f125674o);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ConfirmDocumentsDialogFragment a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            ConfirmDocumentsDialogFragment confirmDocumentsDialogFragment = new ConfirmDocumentsDialogFragment();
            C35966w1.a(confirmDocumentsDialogFragment, -1, new C3731a(str, str2, str3, str4));
            return confirmDocumentsDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/ui/ConfirmDocumentsDialogFragment$b;", "", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.lib.design.bottom_sheet.d f125675a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Spinner f125676b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ContentPlaceholder f125677c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f125678d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final TextView f125679e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final RecyclerView f125680f;

        public b(@Y61.k com.avito.android.lib.design.bottom_sheet.d dVar, @Y61.k Spinner spinner, @Y61.k ContentPlaceholder contentPlaceholder, @Y61.k TextView textView, @Y61.k TextView textView2, @Y61.k RecyclerView recyclerView) {
            this.f125675a = dVar;
            this.f125676b = spinner;
            this.f125677c = contentPlaceholder;
            this.f125678d = textView;
            this.f125679e = textView2;
            this.f125680f = recyclerView;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f125675a, bVar.f125675a) && L.f(this.f125676b, bVar.f125676b) && L.f(this.f125677c, bVar.f125677c) && L.f(this.f125678d, bVar.f125678d) && L.f(this.f125679e, bVar.f125679e) && L.f(this.f125680f, bVar.f125680f);
        }

        public final int hashCode() {
            return this.f125680f.hashCode() + ((this.f125679e.hashCode() + ((this.f125678d.hashCode() + ((this.f125677c.hashCode() + ((this.f125676b.hashCode() + (this.f125675a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ViewBinding(root=" + this.f125675a + ", loading=" + this.f125676b + ", error=" + this.f125677c + ", title=" + this.f125678d + ", description=" + this.f125679e + ", buttons=" + this.f125680f + ')';
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ConfirmDocumentsDialogFragment.f125665m0;
            ConfirmDocumentsDialogFragment.this.f5().accept(AbstractC49673a.b.f441812a);
            return G0.f406611a;
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ConfirmDocumentsDialogFragment.f125665m0;
            ConfirmDocumentsDialogFragment.this.f5().accept(AbstractC49673a.C12832a.f441811a);
            return G0.f406611a;
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<n, G0> {
        public final void f(@Y61.k n nVar) {
            String tag;
            ConfirmDocumentsDialogFragment confirmDocumentsDialogFragment = (ConfirmDocumentsDialogFragment) this.receiver;
            a aVar = ConfirmDocumentsDialogFragment.f125665m0;
            confirmDocumentsDialogFragment.getClass();
            if (nVar instanceof n.a) {
                if (((n.a) nVar).f125661a && (tag = confirmDocumentsDialogFragment.getTag()) != null) {
                    confirmDocumentsDialogFragment.getParentFragmentManager().o0(C22777e.a(), tag);
                }
                b bVar = confirmDocumentsDialogFragment.f125670l0;
                if (bVar != null) {
                    bVar.f125675a.r();
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(n nVar) {
            f(nVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<AbstractC49674b, G0> {
        public final void f(@Y61.k AbstractC49674b abstractC49674b) {
            ConfirmDocumentsDialogFragment confirmDocumentsDialogFragment = (ConfirmDocumentsDialogFragment) this.receiver;
            b bVar = confirmDocumentsDialogFragment.f125670l0;
            if (bVar != null) {
                bVar.f125676b.setVisibility(abstractC49674b instanceof AbstractC49674b.c ? 0 : 8);
                bVar.f125677c.setVisibility(abstractC49674b instanceof AbstractC49674b.C12833b ? 0 : 8);
                boolean z12 = abstractC49674b instanceof AbstractC49674b.a;
                bVar.f125678d.setVisibility(z12 ? 0 : 8);
                bVar.f125679e.setVisibility(z12 ? 0 : 8);
                bVar.f125680f.setVisibility(z12 ? 0 : 8);
            }
            if (abstractC49674b instanceof AbstractC49674b.a) {
                b bVar2 = confirmDocumentsDialogFragment.f125670l0;
                TextView textView = bVar2 != null ? bVar2.f125678d : null;
                if (textView != null) {
                    textView.setText(((AbstractC49674b.a) abstractC49674b).f441815a);
                }
                b bVar3 = confirmDocumentsDialogFragment.f125670l0;
                TextView textView2 = bVar3 != null ? bVar3.f125679e : null;
                if (textView2 != null) {
                    textView2.setText(((AbstractC49674b.a) abstractC49674b).f441816b);
                }
                com.avito.konveyor.adapter.a aVar = confirmDocumentsDialogFragment.f125668j0;
                (aVar != null ? aVar : null).c(new UV0.c(((AbstractC49674b.a) abstractC49674b).f441817c));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(AbstractC49674b abstractC49674b) {
            f(abstractC49674b);
            return G0.f406611a;
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentButtonItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentButtonItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<DocumentButtonItem, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DocumentButtonItem documentButtonItem) {
            a aVar = ConfirmDocumentsDialogFragment.f125665m0;
            ConfirmDocumentsDialogFragment.this.f5().accept(new AbstractC49673a.d(documentButtonItem));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f125684l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f125684l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f125684l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ConfirmDocumentsDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f125686l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f125686l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f125686l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f125687l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f125687l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f125687l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f125688l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f125688l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f125688l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ConfirmDocumentsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/mvi/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/confirm_documents_bottom_sheet/mvi/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<t> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = ConfirmDocumentsDialogFragment.this.f125666h0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public ConfirmDocumentsDialogFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f125667i0 = new O0(m0.f406844a.b(t.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        a.InterfaceC3727a interfaceC3727aA = com.avito.android.confirm_documents_bottom_sheet.di.j.a();
        InterfaceC29971h interfaceC29971hA = C29972i.a(C29972i.b(this), Object.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        interfaceC3727aA.a(new g(), requireArguments().getString("EXTRA_FROM_PAGE"), requireArguments().getString("EXTRA_ITEM_ID"), requireArguments().getString("EXTRA_SHIFT_ID"), requireArguments().getString("EXTRA_SCREEN_NAME"), (com.avito.android.confirm_documents_bottom_sheet.di.c) interfaceC29971hA, interfaceC39417aB).a(this);
    }

    public final t f5() {
        return (t) this.f125667i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ContentPlaceholder contentPlaceholder;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.setContentView(R.layout.confirm_documents_dialog);
        dVar.f178527u = true;
        dVar.R(new c());
        dVar.Q(new d());
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.arch.mvi.android.f.a(f5(), dVar, Lifecycle.State.f46682e, new e(1, this, ConfirmDocumentsDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/confirm_documents_bottom_sheet/mvi/ConfirmDocumentsOneTimeEvent;)V", 0), new f(1, this, ConfirmDocumentsDialogFragment.class, "renderState", "renderState(Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsDialogFragmentState;)V", 0));
        Spinner spinner = (Spinner) dVar.findViewById(R.id.loading);
        ContentPlaceholder contentPlaceholder2 = (ContentPlaceholder) dVar.findViewById(R.id.error);
        TextView textView = (TextView) dVar.findViewById(R.id.title);
        TextView textView2 = (TextView) dVar.findViewById(R.id.description);
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.buttons);
        this.f125670l0 = new b(dVar, spinner, contentPlaceholder2, textView, textView2, recyclerView);
        com.avito.konveyor.adapter.j jVar = this.f125669k0;
        recyclerView.setAdapter(jVar != null ? jVar : null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new ConfirmDocumentsDialogFragment$configureView$1$1());
        b bVar = this.f125670l0;
        if (bVar != null && (contentPlaceholder = bVar.f125677c) != null) {
            final int i12 = 0;
            contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.confirm_documents_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.confirm_documents_error_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.confirm_documents_refresh, new Serializable[0]), new View.OnClickListener(this) { // from class: com.avito.android.confirm_documents_bottom_sheet.ui.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ConfirmDocumentsDialogFragment f125691c;

                {
                    this.f125691c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmDocumentsDialogFragment confirmDocumentsDialogFragment = this.f125691c;
                    switch (i12) {
                        case 0:
                            ConfirmDocumentsDialogFragment.a aVar = ConfirmDocumentsDialogFragment.f125665m0;
                            confirmDocumentsDialogFragment.f5().accept(AbstractC49673a.c.f441813a);
                            break;
                        default:
                            ConfirmDocumentsDialogFragment.a aVar2 = ConfirmDocumentsDialogFragment.f125665m0;
                            confirmDocumentsDialogFragment.f5().accept(AbstractC49673a.c.f441813a);
                            break;
                    }
                }
            }));
            final int i13 = 1;
            contentPlaceholder.setButtonOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.confirm_documents_bottom_sheet.ui.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ConfirmDocumentsDialogFragment f125691c;

                {
                    this.f125691c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmDocumentsDialogFragment confirmDocumentsDialogFragment = this.f125691c;
                    switch (i13) {
                        case 0:
                            ConfirmDocumentsDialogFragment.a aVar = ConfirmDocumentsDialogFragment.f125665m0;
                            confirmDocumentsDialogFragment.f5().accept(AbstractC49673a.c.f441813a);
                            break;
                        default:
                            ConfirmDocumentsDialogFragment.a aVar2 = ConfirmDocumentsDialogFragment.f125665m0;
                            confirmDocumentsDialogFragment.f5().accept(AbstractC49673a.c.f441813a);
                            break;
                    }
                }
            });
        }
        if (bundle != null) {
            f5().accept(AbstractC49673a.c.f441813a);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f125670l0 = null;
    }
}
