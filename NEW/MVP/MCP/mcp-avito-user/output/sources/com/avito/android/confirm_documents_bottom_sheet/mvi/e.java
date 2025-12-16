package com.avito.android.confirm_documents_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.confirm_documents_bottom_sheet.models.ConfirmDocumentsInternalAction;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wr.AbstractC49673a;
import wr.AbstractC49674b;

/* compiled from: ConfirmDocumentsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lwr/a;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lwr/b;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC49673a, ConfirmDocumentsInternalAction, AbstractC49674b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f125612a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.confirm_documents_bottom_sheet.domain.a f125613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f125614c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SK0.b f125615d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f125616e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f125617f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f125618g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f125619h;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.confirm_documents_bottom_sheet.domain.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k SK0.b bVar, @Y61.l @Named("SHIFT_ID") String str, @Y61.l @Named("FROM_PAGE") String str2, @Y61.l @Named("ITEM_ID") String str3, @Y61.l @Named("SCREEN_NAME") String str4) {
        this.f125612a = aVar;
        this.f125613b = aVar2;
        this.f125614c = interfaceC28373a;
        this.f125615d = bVar;
        this.f125616e = str;
        this.f125617f = str2;
        this.f125618g = str3;
        this.f125619h = str4;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ConfirmDocumentsInternalAction> b(AbstractC49673a abstractC49673a, AbstractC49674b abstractC49674b) {
        AbstractC49673a abstractC49673a2 = abstractC49673a;
        AbstractC49674b abstractC49674b2 = abstractC49674b;
        if (abstractC49673a2 instanceof AbstractC49673a.b) {
            return C43175k.G(new a(2, null));
        }
        if (abstractC49673a2 instanceof AbstractC49673a.c) {
            return C43175k.G(new b(this, null));
        }
        if (abstractC49673a2 instanceof AbstractC49673a.d) {
            return C43175k.G(new c(abstractC49673a2, this, null));
        }
        if (abstractC49673a2 instanceof AbstractC49673a.C12832a) {
            return C43175k.G(new d(abstractC49674b2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
