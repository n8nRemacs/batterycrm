package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.avito.android.R;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencySearchViewStateAssembler.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/e0;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.realty_agency_search.a f138812a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.skeleton.c f138813b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.q f138814c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ContextThemeWrapper f138815d;

    /* compiled from: RealtyAgencySearchViewStateAssembler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.f138450c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.f138451d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public e0(@Y61.k com.avito.android.developments_agency_search.screen.realty_agency_search.a aVar, @Y61.k com.avito.android.serp.adapter.skeleton.c cVar, @Y61.k com.avito.android.permissions.q qVar, @Y61.k Context context) {
        this.f138812a = aVar;
        this.f138813b = cVar;
        this.f138814c = qVar;
        this.f138815d = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    public static void a(ArrayList arrayList) {
        arrayList.add(new com.avito.android.developments_agency_search.adapter.error_layout.a("loading_error_layout", com.avito.android.printable_text.b.c(R.string.das_search_result_loading_error_title, new Serializable[0]), 0, com.avito.android.printable_text.b.c(R.string.das_search_result_loading_error_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.das_search_result_loading_error_action_button, new Serializable[0]), false, 36, null));
    }

    public static void c(ArrayList arrayList) {
        arrayList.add(new com.avito.android.developments_agency_search.adapter.error_layout.a("empty_result_layout", com.avito.android.printable_text.b.c(R.string.das_search_result_empty_title, new Serializable[0]), 0, com.avito.android.printable_text.b.c(R.string.das_search_result_empty_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.das_search_result_empty_action_button, new Serializable[0]), false, 36, null));
    }

    public final void b(ArrayList arrayList, Lw.c cVar) {
        String strF;
        arrayList.add(new com.avito.android.developments_agency_search.adapter.spacer.a(20));
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.a aVar = cVar.f10239c;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        c.g gVar = cVar.f10241e;
        if (!gVar.f10271b) {
            arrayList.add(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.b(null, C42756l.B(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.a[]{new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.a(Tab.f138450c, gVar.f10272c), new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.a(Tab.f138451d, gVar.f10273d)}), gVar.f10270a, 1, null));
        }
        c.a aVar2 = cVar.f10242f;
        DevelopmentSort developmentSort = aVar2.f10250a;
        int iOrdinal = cVar.f10248l.ordinal();
        com.avito.android.developments_agency_search.screen.realty_agency_search.a aVar3 = this.f138812a;
        if (iOrdinal == 0) {
            strF = aVar3.f(developmentSort);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strF = aVar3.a(aVar2.f10251b);
        }
        arrayList.add(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.a(null, strF, aVar2.f10252c, 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c5  */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Lw.c d(@Y61.k Lw.c r28) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.e0.d(Lw.c):Lw.c");
    }

    @Y61.k
    public final Lw.c e(@Y61.k Y41.a<Lw.c> aVar) {
        return d(aVar.invoke());
    }
}
