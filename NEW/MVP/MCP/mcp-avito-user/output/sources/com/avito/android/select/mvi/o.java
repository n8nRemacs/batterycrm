package com.avito.android.select.mvi;

import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import com.avito.android.select.mvi.entity.ClearActionState;
import dagger.internal.x;
import dagger.internal.y;
import dq0.C39779a;
import dq0.C39783e;
import dq0.C39784f;
import dq0.InterfaceC39780b;
import java.io.Serializable;
import java.util.TreeSet;
import javax.inject.Provider;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: SelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f265636a;

    /* renamed from: b, reason: collision with root package name */
    public final j f265637b;

    /* renamed from: c, reason: collision with root package name */
    public final q f265638c;

    /* renamed from: d, reason: collision with root package name */
    public final w f265639d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f265640e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f265641f;

    public o(l lVar, j jVar, q qVar, w wVar, Provider provider, dagger.internal.l lVar2) {
        this.f265636a = lVar;
        this.f265637b = jVar;
        this.f265638c = qVar;
        this.f265639d = wVar;
        this.f265640e = provider;
        this.f265641f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f265636a.get();
        i iVar = (i) this.f265637b.get();
        this.f265638c.getClass();
        p pVar = new p();
        r rVar = (r) this.f265639d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f265640e.get();
        Arguments arguments = (Arguments) this.f265641f.f393949a;
        C39783e.f394134o.getClass();
        boolean z12 = true;
        boolean z13 = arguments.getMultiSelect() || (arguments.isFromFilters() && !arguments.getHideClear()) || arguments.getCanClear();
        ClearActionState clearActionState = (z13 && (!arguments.getSelected().isEmpty() && (arguments.getMultiSelect() || !L.f(arguments.getDefaultValue(), ((ParcelableEntity) C42745f0.E(arguments.getSelected())).getId())))) ? ClearActionState.f265575b : z13 ? ClearActionState.f265577d : ClearActionState.f265576c;
        PrintableText printableTextC = (arguments.isFromFilters() || arguments.getCanClear()) ? com.avito.android.printable_text.b.c(R.string.reset, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.clear_select_hint, new Serializable[0]);
        boolean zIsRedesigned = arguments.isRedesigned();
        if (!arguments.getMultiSelect() && (!arguments.isFromFilters() || arguments.getHideClear())) {
            z12 = false;
        }
        TreeSet treeSet = new TreeSet(C39784f.f394148a);
        treeSet.addAll(arguments.getSelected());
        G0 g02 = G0.f406611a;
        C42784z0 c42784z0 = C42784z0.f406748b;
        InterfaceC39780b.d dVar = InterfaceC39780b.d.f394118a;
        boolean showSearch = arguments.getShowSearch();
        String confirmButtonTitle = arguments.getConfirmButtonTitle();
        return new n("Select", new C39783e(zIsRedesigned, clearActionState, "", z12, treeSet, c42784z0, c42784z0, c42784z0, dVar, null, c42784z0, new C39779a(printableTextC, showSearch, confirmButtonTitle != null ? com.avito.android.printable_text.b.f(confirmButtonTitle) : com.avito.android.printable_text.b.c(R.string.accept, new Serializable[0]), arguments.getMultiSelect(), arguments.getCandy(), arguments.isChips(), arguments.getItemsStyle(), arguments.getMultiSelect(), arguments.isFromFilters(), arguments.isPaginationSuggest(), arguments.getRequestId(), arguments.hasGroups(), arguments.getDefaultValue(), arguments.getTitlePattern(), arguments.getWithImages(), arguments.getAreGroupsCollapsible(), arguments.getImageParams(), arguments.getOptionImageSize(), arguments.getHideClear(), arguments.getGroups()), arguments.getDescription()), new m(kVar, iVar, screenPerformanceTracker, rVar, pVar));
    }
}
