package com.avito.android.blueprints.selector_card.multiselect;

import Y41.p;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.SelectorCardItemState;
import com.avito.android.lib.design.selector_card.r;
import gj.InterfaceC40691b;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectSelectorCardGroupView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/selector_card/multiselect/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/selector_card/multiselect/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f106652b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC25659b f106653c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f106654d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SelectorCardGroup f106655e;

    /* compiled from: MultiselectSelectorCardGroupView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprints/selector_card/multiselect/j$a", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SelectorCardGroup.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<ParameterElement.E.b, Boolean, G0> f106656a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super ParameterElement.E.b, ? super Boolean, G0> pVar) {
            this.f106656a = pVar;
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@k r rVar) {
            if (!(rVar instanceof ParameterElement.E.b)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f106656a.invoke(rVar, Boolean.FALSE);
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@k r rVar) {
            if (!(rVar instanceof ParameterElement.E.b)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f106656a.invoke(rVar, Boolean.TRUE);
        }
    }

    public j(@k InterfaceC40691b interfaceC40691b, @k InterfaceC25659b interfaceC25659b, @k View view) {
        super(view);
        this.f106652b = interfaceC40691b;
        this.f106653c = interfaceC25659b;
        this.f106654d = view;
        View viewFindViewById = view.findViewById(R.id.selector_card_group);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.selector_card.SelectorCardGroup");
        }
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) viewFindViewById;
        selectorCardGroup.setAppearance(R.style.MultiselectSelectorCardGroup);
        this.f106655e = selectorCardGroup;
    }

    @Override // com.avito.android.blueprints.selector_card.multiselect.i
    public final void G() {
        this.f106655e.f(SelectorCardItemState.Normal.f180358b);
        this.f106654d.setTag("isErrorState=false");
    }

    @Override // com.avito.android.blueprints.selector_card.multiselect.i
    public final void G5() {
        this.f106655e.f(new SelectorCardItemState.Error(null, 1, null));
        this.f106654d.setTag("isErrorState=true");
    }

    @Override // com.avito.android.blueprints.selector_card.multiselect.i
    public final void TY(@k ParameterElement.E.a aVar) {
        Integer num = aVar.f117281a;
        SelectorCardGroup selectorCardGroup = this.f106655e;
        if (num != null) {
            selectorCardGroup.setChildSpacing(num.intValue());
        }
        selectorCardGroup.setContentBinderFactory(new d(this.f106652b, this.f106653c, aVar.f117282b));
    }

    @Override // com.avito.android.blueprints.selector_card.multiselect.i
    public final void WW(@k p<? super ParameterElement.E.b, ? super Boolean, G0> pVar) {
        this.f106655e.setSelectedListener(new a(pVar));
    }

    @Override // com.avito.android.blueprints.selector_card.multiselect.i
    public final void pd(@k List<ParameterElement.E.b> list) {
        SelectorCardGroup selectorCardGroup = this.f106655e;
        selectorCardGroup.setData(list);
        selectorCardGroup.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ParameterElement.E.b) obj).f117284c) {
                arrayList.add(obj);
            }
        }
        selectorCardGroup.e(arrayList);
    }
}
