package com.avito.android.support_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import xA0.AbstractC49803a;
import xA0.AbstractC49804b;
import xA0.C49806d;

/* compiled from: SupportDialogActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/support_bottom_sheet/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LxA0/a;", "LxA0/b;", "LxA0/d;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC49803a, AbstractC49804b, C49806d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f292472a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.support_bottom_sheet.domain.a f292473b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f292474c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f292475d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Long f292476e;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.support_bottom_sheet.domain.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @Named("PHONE") String str, @Y61.l @Named("SLOT_ID") Long l12) {
        this.f292472a = aVar;
        this.f292473b = aVar2;
        this.f292474c = interfaceC28373a;
        this.f292475d = str;
        this.f292476e = l12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC49804b> b(AbstractC49803a abstractC49803a, C49806d c49806d) {
        AbstractC49803a abstractC49803a2 = abstractC49803a;
        if (abstractC49803a2 instanceof AbstractC49803a.c) {
            return C43175k.G(new a(2, null));
        }
        if (abstractC49803a2 instanceof AbstractC49803a.b) {
            return C43175k.G(new b(this, null));
        }
        if (abstractC49803a2 instanceof AbstractC49803a.C12849a) {
            return C43175k.G(new c(this, null));
        }
        if (abstractC49803a2 instanceof AbstractC49803a.d) {
            return C43175k.G(new d(abstractC49803a2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
