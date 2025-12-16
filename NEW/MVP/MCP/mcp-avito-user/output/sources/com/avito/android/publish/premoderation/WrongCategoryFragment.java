package com.avito.android.publish.premoderation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.premoderation.SelectListWidget;
import com.avito.android.publish.premoderation.p;
import com.avito.android.publish.premoderation.s;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.NotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WrongCategoryFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/premoderation/WrongCategoryFragment;", "Landroidx/fragment/app/Fragment;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WrongCategoryFragment extends Fragment implements Id0.c, InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public s f238270f0;

    /* renamed from: g0, reason: collision with root package name */
    public com.avito.android.blueprints.publish.header.l f238271g0;

    /* renamed from: h0, reason: collision with root package name */
    public SelectListWidget f238272h0;

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            s sVar = WrongCategoryFragment.this.f238270f0;
            Object obj = null;
            if (sVar == null) {
                sVar = null;
            }
            String str = (String) sVar.f238335L.b("selected_wizard_id");
            if (str != null) {
                AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = sVar.f238332E;
                boolean zEquals = str.equals(wrongCategorySuggest.getSelectedCategory().getNavigation().toString());
                r rVar = sVar.f238334K;
                if (zEquals) {
                    rVar.d1();
                } else {
                    Iterator<T> it = wrongCategorySuggest.getCategories().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (L.f(((CategoryModel) next).getNavigation().toString(), str)) {
                            obj = next;
                            break;
                        }
                    }
                    rVar.U0((CategoryModel) obj);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "enabled", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Hf0.b f238274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Hf0.b bVar) {
            super(1);
            this.f238274l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            Button button = this.f238274l.f7601a;
            if (zBooleanValue) {
                if (button != null) {
                    D6.k(button);
                }
            } else if (button != null) {
                D6.h(button);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f238275l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            s sVar = WrongCategoryFragment.this.f238270f0;
            if (sVar == null) {
                sVar = null;
            }
            sVar.f238334K.H();
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/premoderation/s$a;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/premoderation/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<s.a, G0> {
        public e() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(s.a aVar) {
            SelectListWidget.a aVar2;
            s.a aVar3 = aVar;
            if (aVar3 instanceof s.a.C7160a) {
                s.a.C7160a c7160a = (s.a.C7160a) aVar3;
                ArrayList arrayList = c7160a.f238338a;
                WrongCategoryFragment wrongCategoryFragment = WrongCategoryFragment.this;
                o oVar = new o(wrongCategoryFragment);
                SelectListWidget selectListWidget = wrongCategoryFragment.f238272h0;
                if (selectListWidget == null) {
                    selectListWidget = null;
                }
                ArrayList arrayList2 = selectListWidget.f238265b;
                if (arrayList2.size() != arrayList.size()) {
                    arrayList2.clear();
                    selectListWidget.removeAllViews();
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View viewInflate = LayoutInflater.from(selectListWidget.getContext()).inflate(R.layout.wrong_category_item, (ViewGroup) null);
                        View viewFindViewById = viewInflate.findViewById(R.id.radio_button);
                        if (viewFindViewById == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
                        }
                        ((RadioButton) viewFindViewById).setSaveEnabled(false);
                        com.avito.android.lib.deprecated_design.radio_button.d dVar = new com.avito.android.lib.deprecated_design.radio_button.d(viewInflate);
                        selectListWidget.addView(viewInflate);
                        arrayList2.add(dVar);
                    }
                }
                Iterator it = C42745f0.T0(arrayList, arrayList2).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar2 = c7160a.f238339b;
                    if (!zHasNext) {
                        break;
                    }
                    Q q12 = (Q) it.next();
                    SelectListWidget.a aVar4 = (SelectListWidget.a) q12.f406619b;
                    com.avito.android.lib.deprecated_design.radio_button.b bVar = (com.avito.android.lib.deprecated_design.radio_button.b) q12.f406620c;
                    boolean zF2 = L.f(aVar2 != null ? aVar2.f238269c : null, aVar4.f238269c);
                    bVar.setTitle(aVar4.f238267a);
                    bVar.f(aVar4.f238268b);
                    if (zF2) {
                        bVar.setChecked(zF2);
                        selectListWidget.f238266c = bVar;
                    }
                    bVar.a(new n(selectListWidget, bVar, oVar, aVar4));
                }
                if (aVar2 != null) {
                    oVar.invoke(aVar2, Boolean.TRUE);
                }
                int i13 = arrayList.size() == 2 ? R.string.wrong_category_caption : R.string.wrong_category_caption_plural;
                com.avito.android.blueprints.publish.header.l lVar = wrongCategoryFragment.f238271g0;
                (lVar != null ? lVar : null).f(wrongCategoryFragment.getResources().getString(i13));
            }
            return G0.f406611a;
        }
    }

    @Override // Id0.c
    public final int K1() {
        return R.layout.publish_button;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) throws NotFoundException {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = arguments != null ? (AdvertProactiveModerationResult.WrongCategorySuggest) arguments.getParcelable("key_wrong_category_data") : null;
        if (wrongCategorySuggest == null) {
            throw new NotFoundException("key_wrong_category_data", (Throwable) null, 2, (C42822w) null);
        }
        androidx.core.content.j jVarL1 = l1();
        r rVar = jVarL1 instanceof r ? (r) jVarL1 : null;
        if (rVar == null) {
            throw new ClassCastException();
        }
        com.avito.android.publish.premoderation.di.d.a().a(this, (InterfaceC33816g) C29972i.a(C29972i.b(this), InterfaceC33816g.class), rVar, wrongCategorySuggest, getString(R.string.wrong_category_subtitle)).a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.wrong_category_screen, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Object next;
        SelectListWidget.a aVarKe;
        super.onViewCreated(view, bundle);
        new C33862g0(requireView().getRootView(), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0).b(c.f238275l, new d());
        com.avito.android.blueprints.publish.header.l lVar = new com.avito.android.blueprints.publish.header.l(false, null, view, 3, null);
        this.f238271g0 = lVar;
        lVar.Ap(view.getResources().getString(R.string.wrong_category_title), null);
        com.avito.android.blueprints.publish.header.l lVar2 = this.f238271g0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.qK(false);
        View viewFindViewById = view.findViewById(R.id.categories);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.premoderation.SelectListWidget");
        }
        this.f238272h0 = (SelectListWidget) viewFindViewById;
        s sVar = this.f238270f0;
        if (sVar == null) {
            sVar = null;
        }
        sVar.f238336M.observe(getViewLifecycleOwner(), new p.b(new e()));
        s sVar2 = this.f238270f0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = sVar2.f238332E;
        List<CategoryModel> categories = wrongCategorySuggest.getCategories();
        ArrayList arrayList = new ArrayList(C42745f0.q(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add(s.ke((CategoryModel) it.next(), null));
        }
        ArrayList arrayListI0 = C42745f0.i0(s.ke(wrongCategorySuggest.getSelectedCategory(), sVar2.f238333J), arrayList);
        String string = wrongCategorySuggest.getSelectedCategory().getNavigation().toString();
        C23060r0 c23060r0 = sVar2.f238335L;
        if (L.f(string, (String) c23060r0.b("selected_wizard_id"))) {
            aVarKe = s.ke(wrongCategorySuggest.getSelectedCategory(), null);
        } else if (wrongCategorySuggest.getCategories().size() == 1) {
            aVarKe = s.ke((CategoryModel) C42745f0.u0(wrongCategorySuggest.getCategories()), null);
        } else {
            Iterator<T> it2 = wrongCategorySuggest.getCategories().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (L.f(((CategoryModel) next).getNavigation().toString(), (String) c23060r0.b("selected_wizard_id"))) {
                        break;
                    }
                }
            }
            CategoryModel categoryModel = (CategoryModel) next;
            aVarKe = categoryModel != null ? s.ke(categoryModel, null) : null;
        }
        sVar2.f238336M.setValue(new s.a.C7160a(arrayListI0, aVarKe));
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        Hf0.b bVar = new Hf0.b(view);
        bVar.d(getString(R.string.wrong_category_continue));
        bVar.b(new a());
        Button button = bVar.f7601a;
        if (button != null) {
            D6.h(button);
        }
        s sVar = this.f238270f0;
        if (sVar == null) {
            sVar = null;
        }
        sVar.f238337N.observe(getViewLifecycleOwner(), new p.b(new b(bVar)));
    }

    @Override // Id0.c
    public final void g2() {
    }
}
