package com.avito.android.realty_agency.inline_filters;

import Hr.InterfaceC14024a;
import Y41.p;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import cE.C27025b;
import com.avito.android.C0;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.location.r;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import lE.C43624b;

/* compiled from: RealtyAgencyInlineFilterDialogOpener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/k;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements InlineFilterDialogOpener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Fragment f251624b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30999b f251625c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f251626d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f251627e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public AbstractC30998a<? extends E> f251628f;

    public k(@Y61.l Fragment fragment, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k a aVar) {
        this.f251624b = fragment;
        this.f251625c = interfaceC30999b;
        this.f251626d = aVar;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k p pVar, @Y61.l Y41.l lVar, @Y61.k p pVar2, @Y61.k p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b) {
        com.avito.android.lib.design.bottom_sheet.d dVarA = this.f251626d.a(filter, searchParams, pVar, new h(aVar2, this));
        this.f251627e = dVarA;
        if (dVarA != null) {
            com.avito.android.lib.util.g.a(dVarA);
            com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f251627e;
            if (dVar2 != null) {
                dVar2.s();
                return;
            }
            return;
        }
        AbstractC30998a<? extends E> abstractC30998aA = InterfaceC30999b.a.a(this.f251625c, this.f251624b, filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, source, pVar, lVar, pVar2, pVar3, new i(aVar2, this), new j(lVar2, this), metroResponseBody, str, str2, filter2, filter3, lVar4, 1048576);
        this.f251628f = abstractC30998aA;
        if (abstractC30998aA != null) {
            abstractC30998aA.d();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        AbstractC30998a<? extends E> abstractC30998a = this.f251628f;
        if (abstractC30998a != null) {
            return abstractC30998a.b();
        }
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f251627e;
        if (dVar != null) {
            dVar.dismiss();
        }
        AbstractC30998a<? extends E> abstractC30998a = this.f251628f;
        if (abstractC30998a != null) {
            abstractC30998a.a();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
    }
}
