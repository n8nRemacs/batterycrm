package com.avito.android.search.filter.adapter.display_type_select;

import com.avito.android.R;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DisplayTypeSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/display_type_select/h;", "Lcom/avito/android/search/filter/adapter/display_type_select/g;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.v> f262208b;

    /* compiled from: DisplayTypeSelectPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f262209a;

        static {
            int[] iArr = new int[SerpDisplayType.values().length];
            try {
                iArr[SerpDisplayType.Grid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SerpDisplayType.List.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SerpDisplayType.Rich.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SerpDisplayType.Vacancy.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SerpDisplayType.Service.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f262209a = iArr;
        }
    }

    @Inject
    public h(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262208b = interfaceC34581l.getF263716j();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        com.avito.android.search.filter.adapter.display_type_select.a aVar2 = (com.avito.android.search.filter.adapter.display_type_select.a) eVar;
        ParameterElement.v.b bVar = (ParameterElement.v.b) aVar;
        aVar2.setTitle(bVar.f262840c);
        aVar2.T9();
        for (Cp0.e eVar2 : bVar.f262862t) {
            String str = eVar2.f2697b;
            SerpDisplayType serpDisplayTypeFromString = SerpDisplayType.INSTANCE.fromString(str);
            int i14 = serpDisplayTypeFromString == null ? -1 : a.f262209a[serpDisplayTypeFromString.ordinal()];
            if (i14 == 1) {
                i13 = R.drawable.ic_redesign_grid_selector;
            } else if (i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5) {
                i13 = R.drawable.ic_redesign_list_selector;
            }
            aVar2.Ox(i13, str, eVar2.equals(bVar.f262844g));
        }
        aVar2.i5(new i(bVar, this));
    }
}
