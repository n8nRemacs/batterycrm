package com.avito.android.select.sectioned_multiselect.core;

import Yp0.AbstractC18314a;
import Zp0.InterfaceC19587b;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.TextView;
import cE.C27025b;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.select.sectioned_multiselect.container.SectionedMultiselectContainerFragment;
import com.avito.android.select.sectioned_multiselect.container.SectionedMultiselectContainerParams;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/K;", "Lcom/avito/android/select/sectioned_multiselect/core/i;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class K implements InterfaceC34659i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.g f266476a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f266477b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.d f266478c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d f266479d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final N f266480e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.b f266481f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final P f266482g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.core.analytics.b f266483h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<PaginationState> f266484i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f266485j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f266486k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f266487l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C27025b f266488m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public C34656f f266489n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public SectionedMultiselectCoreFragment f266490o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public String f266491p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f266492q;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public SectionedMultiselectCoreFragment f266496u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public InterfaceC19587b f266497v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public List<? extends ParcelableEntity<String>> f266498w;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f266493r = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f266494s = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f266495t = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.disposables.i f266499x = new io.reactivex.rxjava3.disposables.i(0);

    @Inject
    public K(@Y61.l Bundle bundle, @com.avito.android.select.sectioned_multiselect.core.di.b @Y61.k com.avito.android.select.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.select.sectioned_multiselect.Items.section_item.d dVar, @Y61.k com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d dVar2, @Y61.k N n12, @Y61.k com.avito.android.select.sectioned_multiselect.b bVar, @Y61.k P p12, @Y61.k com.avito.android.select.sectioned_multiselect.core.analytics.b bVar2, @Y61.k io.reactivex.rxjava3.core.z<PaginationState> zVar, @Y61.k com.avito.android.remote.error.f fVar, @com.avito.android.select.sectioned_multiselect.core.di.n boolean z12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C27025b c27025b) {
        this.f266476a = gVar;
        this.f266477b = interfaceC35745a5;
        this.f266478c = dVar;
        this.f266479d = dVar2;
        this.f266480e = n12;
        this.f266481f = bVar;
        this.f266482g = p12;
        this.f266483h = bVar2;
        this.f266484i = zVar;
        this.f266485j = fVar;
        this.f266486k = z12;
        this.f266487l = aVar;
        this.f266488m = c27025b;
        this.f266491p = "";
        if (bundle != null) {
            this.f266491p = String.valueOf(bundle.getCharSequence("query"));
        }
    }

    public static final void f(K k12, int i12) {
        P p12 = k12.f266482g;
        Integer f266523p = p12.getF266523P();
        String f266524q = p12.getF266524Q();
        if (f266523p == null || f266524q == null || C43066x.K(f266524q) || i12 < f266523p.intValue()) {
            return;
        }
        Set<ParcelableEntity<String>> setR8 = p12.r8();
        List<? extends ParcelableEntity<String>> listM0 = setR8 != null ? C42745f0.M0(setR8) : null;
        C34656f c34656f = k12.f266489n;
        if (c34656f != null) {
            com.avito.android.lib.design.toast_bar.b bVar = c34656f.f266652m;
            if (bVar != null) {
                bVar.a();
            }
            Button button = c34656f.f266642c;
            if (button == null || !D6.y(button)) {
                c34656f.f266652m = com.avito.android.component.toast.b.b(c34656f.f266640a, f266524q, 0, null, 0, null, 5000, ToastBarPosition.f181047e, f.a.f125253a, null, 130846);
            } else {
                c34656f.f266652m = com.avito.android.component.toast.b.b(c34656f.f266640a, f266524q, 0, null, 0, null, 5000, ToastBarPosition.f181044b, f.a.f125253a, c34656f.f266642c, 130334);
            }
        }
        if (listM0 != null) {
            k12.f266483h.c(p12.getF266522O(), p12.p4(), listM0, f266524q, f266523p.intValue());
        }
    }

    public static final void g(K k12, Zp0.e eVar) {
        C34656f c34656f = k12.f266489n;
        if (c34656f != null) {
            c34656f.a(false);
        }
        k12.f266497v = eVar.f20508b;
        List<? extends ParcelableEntity<String>> listB = eVar.f20507a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (obj instanceof SelectParameter.Value) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == listB.size()) {
            listB = k12.f266481f.b(arrayList);
        }
        k12.f266498w = listB;
        AbstractC18314a.b bVar = AbstractC18314a.b.f19694b;
        if (k12.f266497v == null) {
            bVar = null;
        }
        k12.k(bVar);
    }

    public static final void h(K k12) {
        io.reactivex.rxjava3.disposables.i iVar = k12.f266499x;
        if (iVar != null) {
            io.reactivex.rxjava3.core.z<Zp0.e> zVarB = k12.f266476a.b(k12.f266491p);
            InterfaceC35745a5 interfaceC35745a5 = k12.f266477b;
            io.reactivex.rxjava3.core.z zVarJ0 = zVarB.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
            if (!kotlin.jvm.internal.L.f(k12.f266492q, k12.f266491p)) {
                zVarJ0 = zVarJ0.J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C34665o(k12));
            }
            iVar.a(zVarJ0.v0(new C34663m(k12), new C34664n(k12), io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    public static final void i(K k12, Set set) {
        C34656f c34656f = k12.f266489n;
        if (c34656f != null) {
            String string = k12.f266480e.f266514a.getString(R.string.accept);
            Button button = c34656f.f266642c;
            if (button != null) {
                button.setText(string);
                D6.G(button, true);
                button.setOnClickListener(new ViewOnClickListenerC34655e(c34656f, 0));
            }
        }
        C34656f c34656f2 = k12.f266489n;
        if (c34656f2 != null) {
            boolean zF2 = kotlin.jvm.internal.L.f(set, k12.f266482g.m5());
            boolean z12 = !zF2;
            Button button2 = c34656f2.f266642c;
            if (button2 != null) {
                button2.setEnabled(z12);
            }
            if (zF2 && button2 != null) {
                button2.setOnClickListener(null);
                D6.w(button2);
            }
        }
        boolean zIsEmpty = set.isEmpty();
        boolean z13 = !zIsEmpty;
        C34656f c34656f3 = k12.f266489n;
        if (c34656f3 != null) {
            TextView textView = c34656f3.f266643d;
            if (textView != null) {
                textView.setClickable(z13);
            }
            if (zIsEmpty) {
                Integer num = c34656f3.f266645f;
                if (num == null || textView == null) {
                    return;
                }
                textView.setTextColor(num.intValue());
                return;
            }
            Integer num2 = c34656f3.f266644e;
            if (num2 == null || textView == null) {
                return;
            }
            textView.setTextColor(num2.intValue());
        }
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void a() {
        this.f266496u = null;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void b(@Y61.k SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment) {
        this.f266490o = sectionedMultiselectCoreFragment;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void c(@Y61.k C34656f c34656f) throws Resources.NotFoundException {
        Input input;
        Input input2;
        Boolean hasSuggest;
        this.f266489n = c34656f;
        String string = this.f266480e.f266514a.getString(R.string.reset);
        TextView textView = c34656f.f266643d;
        if (textView != null) {
            I5.a(textView, string, false);
        }
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC34655e(c34656f, 1));
        }
        SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment = this.f266496u;
        C34658h c34658h = null;
        if (sectionedMultiselectCoreFragment != null && sectionedMultiselectCoreFragment.getChildFragmentManager().H("container_fragment_tag") == null) {
            String str = sectionedMultiselectCoreFragment.f266541m0;
            if (str == null) {
                str = null;
            }
            Bundle bundleRequireArguments = sectionedMultiselectCoreFragment.requireArguments();
            int i12 = Build.VERSION.SDK_INT;
            SearchParams searchParams = (SearchParams) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("params", SearchParams.class) : bundleRequireArguments.getParcelable("params"));
            if (searchParams == null) {
                searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
            }
            Bundle bundleRequireArguments2 = sectionedMultiselectCoreFragment.requireArguments();
            SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) (i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("arguments", SectionedMultiselectParameter.class) : bundleRequireArguments2.getParcelable("arguments"));
            SectionedMultiselectContainerParams sectionedMultiselectContainerParams = new SectionedMultiselectContainerParams(str, searchParams, (sectionedMultiselectParameter == null || (hasSuggest = sectionedMultiselectParameter.getHasSuggest()) == null) ? false : hasSuggest.booleanValue());
            androidx.fragment.app.H hE2 = sectionedMultiselectCoreFragment.getChildFragmentManager().e();
            SectionedMultiselectContainerFragment.f266416t0.getClass();
            SectionedMultiselectContainerFragment sectionedMultiselectContainerFragment = new SectionedMultiselectContainerFragment();
            sectionedMultiselectContainerFragment.f266422r0.setValue(sectionedMultiselectContainerFragment, SectionedMultiselectContainerFragment.f266417u0[0], sectionedMultiselectContainerParams);
            hE2.n(R.id.fragment_container, sectionedMultiselectContainerFragment, "container_fragment_tag");
            hE2.e();
        }
        io.reactivex.rxjava3.core.z<com.avito.android.select.sectioned_multiselect.Items.section_item.a> zVarD = this.f266478c.d();
        InterfaceC35745a5 interfaceC35745a5 = this.f266477b;
        I0 i0J0 = zVarD.j0(interfaceC35745a5.e());
        C34666p c34666p = new C34666p(this);
        l41.g<? super Throwable> gVar = C34667q.f266679b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(c34666p, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f266493r;
        cVar.b(dVarV0);
        cVar.b(this.f266479d.d().j0(interfaceC35745a5.e()).v0(new r(this), C34668s.f266681b, interfaceC43543a));
        P p12 = this.f266482g;
        p12.getF266535b0().j0(interfaceC35745a5.e()).v0(new C34669t(this), u.f266683b, interfaceC43543a);
        io.reactivex.rxjava3.disposables.d dVarT0 = p12.Gb().j0(interfaceC35745a5.e()).t0(new v(this));
        io.reactivex.rxjava3.disposables.c cVar2 = this.f266495t;
        cVar2.b(dVarT0);
        cVar2.b(p12.Td().j0(interfaceC35745a5.e()).t0(new w(this)));
        cVar2.b(p12.K9().j0(interfaceC35745a5.e()).t0(new x(this)));
        io.reactivex.rxjava3.disposables.d dVarV02 = c34656f.f266662w.j0(interfaceC35745a5.e()).v0(new C(this), D.f266469b, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar3 = this.f266494s;
        cVar3.b(dVarV02);
        cVar3.b(c34656f.f266659t.j0(interfaceC35745a5.e()).v0(new E(this), F.f266471b, interfaceC43543a));
        cVar3.b(c34656f.f266660u.j0(interfaceC35745a5.e()).v0(new G(c34656f), H.f266473b, interfaceC43543a));
        boolean z12 = this.f266486k;
        io.reactivex.rxjava3.core.z zVarY = c34656f.f266661v;
        if (z12) {
            zVarY = zVarY.y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c());
        }
        cVar3.b(zVarY.j0(interfaceC35745a5.e()).v0(new I(this), J.f266475b, interfaceC43543a));
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(c34656f.f266663x.d0(y.f266687b), this.f266484i.d0(z.f266688b));
        A a12 = new A(this);
        l41.g<? super Throwable> gVar2 = B.f266467b;
        zVarG0.getClass();
        cVar3.b(zVarG0.v0(a12, gVar2, interfaceC43543a));
        int f266518k = p12.getF266518K();
        LinearLayout linearLayout = c34656f.f266649j;
        if (f266518k <= 11) {
            if (linearLayout != null) {
                D6.w(linearLayout);
            }
            C34658h c34658h2 = c34656f.f266651l;
            if (c34658h2 == null || (input = c34656f.f266650k) == null) {
                return;
            }
            input.h(c34658h2);
            return;
        }
        if (linearLayout != null) {
            D6.G(linearLayout, true);
        }
        Input input3 = c34656f.f266650k;
        if (input3 != null) {
            input3.setClearButtonClickListener(new ViewOnClickListenerC34655e(c34656f, 2));
        }
        if (input3 != null) {
            c34658h = new C34658h(input3, c34656f);
            input3.b(c34658h);
        }
        c34656f.f266651l = c34658h;
        String str2 = this.f266491p;
        Input input4 = c34656f.f266650k;
        if (input4 != null) {
            Input.t(input4, str2, false, 6);
        }
        String str3 = this.f266491p;
        if (str3 == null || str3.length() == 0 || (input2 = c34656f.f266650k) == null) {
            return;
        }
        input2.requestFocus();
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void c0() {
        this.f266490o = null;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void d() {
        this.f266483h.b();
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    @Y61.k
    public final Bundle d0() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("query", this.f266491p);
        return bundle;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void e(@Y61.k SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment) {
        this.f266496u = sectionedMultiselectCoreFragment;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i
    public final void e0() {
        this.f266493r.e();
        this.f266494s.e();
        this.f266495t.e();
        io.reactivex.rxjava3.disposables.i iVar = this.f266499x;
        if (iVar != null) {
            iVar.dispose();
        }
        this.f266499x = null;
        this.f266489n = null;
    }

    public final List<com.avito.conveyor_item.a> j() {
        List<? extends ParcelableEntity<String>> list = this.f266498w;
        if (list == null) {
            return new ArrayList();
        }
        List<? extends ParcelableEntity<String>> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof SelectParameter.Value) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListB = this.f266481f.b(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof SectionedMultiselectParameter.Value) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayListB, arrayList2);
        P p12 = this.f266482g;
        Set<ParcelableEntity<String>> setR8 = p12.r8();
        if (setR8 == null) {
            setR8 = B0.f406639b;
        }
        return this.f266481f.a(arrayListH0, list, setR8, p12.getF266519L(), p12.getF266530W(), p12.o2());
    }

    public final void k(AbstractC18314a abstractC18314a) {
        ArrayList arrayList = new ArrayList(j());
        if (abstractC18314a != null) {
            arrayList.add(abstractC18314a);
        }
        C34656f c34656f = this.f266489n;
        if (c34656f != null) {
            c34656f.f266641b.c(new UV0.c(arrayList));
        }
        C34656f c34656f2 = this.f266489n;
        if (c34656f2 != null) {
            c34656f2.c(false);
        }
    }
}
