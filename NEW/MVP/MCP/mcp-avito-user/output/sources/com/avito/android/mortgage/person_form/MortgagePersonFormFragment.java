package com.avito.android.mortgage.person_form;

import Cd.C13243a;
import E00.b;
import G00.e;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgagePersonFormScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.select.SelectItem;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionResult;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmed;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: MortgagePersonFormFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/person_form/MortgagePersonFormFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/select/p;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgagePersonFormFragment extends BaseFragment implements com.avito.android.select.p, InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f200441y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.mortgage.person_form.c f200442n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f200443o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f200444p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f200445q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.util.f f200446r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f200447s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f200448t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f200449u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f200450v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.person_form.h f200451w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final O0 f200452x0;

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/person_form/MortgagePersonFormFragment$a;", "", "<init>", "()V", "", "PERSON_FORM_ARGS", "Ljava/lang/String;", "VISIBILITY_TRACKER_STATE", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: MortgagePersonFormFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.person_form.MortgagePersonFormFragment$a$a, reason: collision with other inner class name */
        public static final class C5929a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ PersonFormArguments f200453l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5929a(PersonFormArguments personFormArguments) {
                super(1);
                this.f200453l = personFormArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("PERSON_FORM_ARGS", this.f200453l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BaseFragment a(@Y61.k PersonFormArguments personFormArguments) {
            MortgagePersonFormFragment mortgagePersonFormFragment = new MortgagePersonFormFragment();
            C35966w1.a(mortgagePersonFormFragment, -1, new C5929a(personFormArguments));
            return mortgagePersonFormFragment;
        }

        public a() {
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<String, Bundle, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            SuggestionResult suggestionResult = (SuggestionResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("suggestion", SuggestionResult.class) : bundle2.getParcelable("suggestion"));
            if (suggestionResult != null) {
                boolean z12 = suggestionResult instanceof SuggestionResult.SuggestionSelected;
                MortgagePersonFormFragment mortgagePersonFormFragment = MortgagePersonFormFragment.this;
                if (z12) {
                    a aVar = MortgagePersonFormFragment.f200441y0;
                    SuggestionResult.SuggestionSelected suggestionSelected = (SuggestionResult.SuggestionSelected) suggestionResult;
                    mortgagePersonFormFragment.r5().accept(new b.A(suggestionSelected.f201418b, suggestionSelected.f201419c));
                } else if (suggestionResult instanceof SuggestionResult.FillByHandsSelected) {
                    a aVar2 = MortgagePersonFormFragment.f200441y0;
                    com.avito.android.mortgage.person_form.g gVarR5 = mortgagePersonFormFragment.r5();
                    SuggestionResult.FillByHandsSelected fillByHandsSelected = (SuggestionResult.FillByHandsSelected) suggestionResult;
                    SuggestionContainer<? extends Suggestion> suggestionContainer = fillByHandsSelected.f201417c;
                    gVarR5.accept(new b.g(suggestionContainer != null ? suggestionContainer.c() : null, fillByHandsSelected.f201416b));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<String, Bundle, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (((PhoneConfirmed) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("PHONE_CONFIRM_DIALOG_RESULT", PhoneConfirmed.class) : bundle2.getParcelable("PHONE_CONFIRM_DIALOG_RESULT"))) != null) {
                a aVar = MortgagePersonFormFragment.f200441y0;
                MortgagePersonFormFragment.this.r5().accept(b.m.f3633b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/person_form/MortgagePersonFormFragment$d", "Landroidx/activity/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends x {
        public d() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(b.h.f3628b);
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(b.h.f3628b);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(b.f.f3625b);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(b.s.f3640b);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Boolean, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(new b.k(zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(b.q.f3638b);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(b.r.f3639b);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class k extends H implements Y41.l<E00.c, G0> {
        /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(E00.c r19) {
            /*
                Method dump skipped, instructions count: 353
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.MortgagePersonFormFragment.k.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class l extends H implements Y41.l<G00.c, G0> {
        @Override // Y41.l
        public final G0 invoke(G00.c cVar) {
            final int i12 = 1;
            MortgagePersonFormFragment mortgagePersonFormFragment = (MortgagePersonFormFragment) this.receiver;
            a aVar = MortgagePersonFormFragment.f200441y0;
            mortgagePersonFormFragment.getClass();
            G00.e eVar = cVar.f6159q;
            if (eVar instanceof e.c) {
                e.c cVar2 = (e.c) eVar;
                com.avito.android.mortgage.person_form.c cVar3 = mortgagePersonFormFragment.f200442n0;
                if (cVar3 != null) {
                    cVar3.f200494k.k(null);
                }
                G00.d dVar = cVar2.f6170a;
                if (dVar.f6160a.length() > 0) {
                    com.avito.android.mortgage.person_form.c cVar4 = mortgagePersonFormFragment.f200442n0;
                    if (cVar4 != null) {
                        cVar4.f200489f.setText(dVar.f6160a);
                    }
                    com.avito.android.mortgage.person_form.c cVar5 = mortgagePersonFormFragment.f200442n0;
                    if (cVar5 != null) {
                        cVar5.a(dVar.f6161b, dVar.f6162c);
                    }
                    com.avito.android.mortgage.person_form.c cVar6 = mortgagePersonFormFragment.f200442n0;
                    if (cVar6 != null) {
                        cVar6.f200491h.setVisibility(dVar.f6163d ? 4 : 0);
                    }
                }
            } else if (eVar instanceof e.b) {
                e.b bVar = (e.b) eVar;
                com.avito.android.mortgage.person_form.c cVar7 = mortgagePersonFormFragment.f200442n0;
                if (cVar7 != null) {
                    cVar7.f200494k.a(z.k(bVar.f6169b));
                }
                G00.d dVar2 = bVar.f6168a;
                com.avito.android.mortgage.person_form.c cVar8 = mortgagePersonFormFragment.f200442n0;
                if (cVar8 != null) {
                    cVar8.f200489f.setText(dVar2.f6160a);
                }
                com.avito.android.mortgage.person_form.c cVar9 = mortgagePersonFormFragment.f200442n0;
                if (cVar9 != null) {
                    cVar9.a(dVar2.f6161b, dVar2.f6162c);
                }
                com.avito.android.mortgage.person_form.c cVar10 = mortgagePersonFormFragment.f200442n0;
                if (cVar10 != null) {
                    cVar10.f200491h.setVisibility(dVar2.f6163d ? 4 : 0);
                }
            } else if (eVar instanceof e.a) {
                e.a aVar2 = (e.a) eVar;
                com.avito.android.mortgage.person_form.c cVar11 = mortgagePersonFormFragment.f200442n0;
                if (cVar11 != null) {
                    cVar11.f200494k.j();
                }
                G00.d dVar3 = aVar2.f6164a;
                com.avito.android.mortgage.person_form.c cVar12 = mortgagePersonFormFragment.f200442n0;
                if (cVar12 != null) {
                    cVar12.f200489f.setText(dVar3.f6160a);
                }
                com.avito.android.mortgage.person_form.c cVar13 = mortgagePersonFormFragment.f200442n0;
                if (cVar13 != null) {
                    cVar13.a(dVar3.f6161b, dVar3.f6162c);
                }
                com.avito.android.mortgage.person_form.c cVar14 = mortgagePersonFormFragment.f200442n0;
                if (cVar14 != null) {
                    cVar14.f200491h.setVisibility(dVar3.f6163d ? 4 : 0);
                }
                com.avito.android.mortgage.person_form.c cVar15 = mortgagePersonFormFragment.f200442n0;
                if (cVar15 != null) {
                    List<PersonFormItem> list = aVar2.f6165b;
                    UV0.c cVar16 = new UV0.c(list);
                    cVar15.f200485b.b(cVar16);
                    cVar15.f200486c.c(cVar16);
                    cVar15.f200484a.l(list, null);
                }
                final com.avito.android.mortgage.person_form.c cVar17 = mortgagePersonFormFragment.f200442n0;
                if (cVar17 != null) {
                    G00.a aVar3 = aVar2.f6166c;
                    ViewGroup viewGroup = cVar17.f200495l;
                    if (aVar3 != null && aVar3.f6136c) {
                        Resources resources = cVar17.f200487d.getContext().getResources();
                        int i13 = aVar3.f6134a;
                        cVar17.f200496m.setText(resources.getQuantityString(R.plurals.person_form_error_counter, i13, Integer.valueOf(i13)));
                        if (viewGroup.getTranslationY() > 0.0f || viewGroup.getVisibility() != 0) {
                            viewGroup.animate().translationY(0.0f).setDuration(150L).withStartAction(new Runnable() { // from class: com.avito.android.mortgage.person_form.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            D6.w(cVar17.f200495l);
                                            break;
                                        default:
                                            D6.G(cVar17.f200495l, true);
                                            break;
                                    }
                                }
                            }).start();
                        }
                    } else if (viewGroup.getTranslationY() == 0.0f || viewGroup.getVisibility() == 0) {
                        viewGroup.animate().translationY(viewGroup.getHeight()).setDuration(150L).withEndAction(new Runnable() { // from class: com.avito.android.mortgage.person_form.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        D6.w(cVar17.f200495l);
                                        break;
                                    default:
                                        D6.G(cVar17.f200495l, true);
                                        break;
                                }
                            }
                        }).start();
                    }
                }
                if (aVar2.f6167d && !mortgagePersonFormFragment.f200443o0) {
                    mortgagePersonFormFragment.r5().accept(b.s.f3640b);
                    mortgagePersonFormFragment.f200443o0 = true;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE00/b;", "it", "Lkotlin/G0;", "invoke", "(LE00/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<E00.b, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(E00.b bVar) {
            a aVar = MortgagePersonFormFragment.f200441y0;
            MortgagePersonFormFragment.this.r5().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f200464l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Y41.a aVar) {
            super(0);
            this.f200464l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f200464l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<Fragment> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return MortgagePersonFormFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f200466l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f200466l = oVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f200466l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f200467l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f200467l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f200467l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f200468l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f200468l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f200468l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: MortgagePersonFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/person_form/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<com.avito.android.mortgage.person_form.g> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.person_form.g invoke() {
            com.avito.android.mortgage.person_form.h hVar = MortgagePersonFormFragment.this.f200451w0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.mortgage.person_form.g) hVar.get();
        }
    }

    public MortgagePersonFormFragment() {
        super(R.layout.mortgage_person_form_fragment);
        n nVar = new n(new s());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new p(new o()));
        this.f200452x0 = new O0(m0.f406844a.b(com.avito.android.mortgage.person_form.g.class), new q(interfaceC42726CB), nVar, new r(interfaceC42726CB));
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SelectItem.Option) {
                arrayList.add(obj);
            }
        }
        r5().accept(new b.C(str, arrayList));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, q5().f200853c.get(q5().f200854d), new b());
        C22960s.b(this, "PHONE_CONFIRM_DIALOG_KEY", new c());
        requireActivity().getF21241d().a(this, new d());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f200449u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.mortgage.person_form.c cVar = this.f200442n0;
        if (cVar != null) {
            com.avito.android.mortgage.person_form.d dVar = cVar.f200493j;
            RecyclerView recyclerView = cVar.f200492i;
            if (dVar != null) {
                recyclerView.v0(dVar);
            }
            cVar.f200493j = null;
            recyclerView.s0(0);
            cVar.f200498o = null;
        }
        this.f200442n0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        r5().accept(b.l.f3632b);
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        r5().accept(b.p.f3637b);
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f200448t0;
        if (bVar == null) {
            bVar = null;
        }
        bundle.putBundle("visibility_tracker_state", bVar.d0());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f200444p0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.konveyor.a aVar = this.f200445q0;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.mortgage.util.f fVar = this.f200446r0;
        com.avito.android.mortgage.util.f fVar2 = fVar != null ? fVar : null;
        GridLayoutManager.c cVar = this.f200447s0;
        GridLayoutManager.c cVar2 = cVar != null ? cVar : null;
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f200448t0;
        com.avito.android.mortgage.person_form.c cVar3 = new com.avito.android.mortgage.person_form.c(dVar2, aVar2, fVar2, cVar2, bVar != null ? bVar : null, (ViewGroup) view);
        this.f200442n0 = cVar3;
        e eVar = new e();
        f fVar3 = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        cVar3.f200488e.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(9, eVar));
        cVar3.f200491h.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(10, fVar3));
        cVar3.f200497n.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(11, gVar));
        cVar3.f200494k.f231600j = iVar;
        cVar3.f200498o = hVar;
        com.avito.android.mortgage.person_form.d dVar3 = new com.avito.android.mortgage.person_form.d(jVar);
        cVar3.f200492i.o(dVar3);
        cVar3.f200493j = dVar3;
        ScreenPerformanceTracker screenPerformanceTracker = this.f200449u0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, r5(), new k(1, this, MortgagePersonFormFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormOneTimeEvent;)V", 0), new l(1, this, MortgagePersonFormFragment.class, "renderState", "renderState(Lcom/avito/android/mortgage/person_form/mvi/entity/state/PersonFormState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f200449u0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgagePersonFormScreen.f90425d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        com.avito.android.mortgage.person_form.di.a.a().a((com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class), cv.c.b(this), c28478k, new m(), q5(), bundle != null ? bundle.getBundle("visibility_tracker_state") : null, q5().f200855e).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f200449u0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
        r5().accept(new b.u(str));
    }

    public final PersonFormArguments q5() {
        Bundle bundleRequireArguments = requireArguments();
        return (PersonFormArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("PERSON_FORM_ARGS", PersonFormArguments.class) : bundleRequireArguments.getParcelable("PERSON_FORM_ARGS"));
    }

    public final com.avito.android.mortgage.person_form.g r5() {
        return (com.avito.android.mortgage.person_form.g) this.f200452x0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
