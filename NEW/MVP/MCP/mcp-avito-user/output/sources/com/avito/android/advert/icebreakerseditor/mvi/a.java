package com.avito.android.advert.icebreakerseditor.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import b4.C25408d;
import b4.InterfaceC25405a;
import b4.InterfaceC25406b;
import com.avito.android.advert.icebreakerseditor.analytics.IcebreakersEditorAnalyticsData;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: IcebreakersEditorActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lb4/a;", "Lb4/b;", "Lb4/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC25405a, InterfaceC25406b, C25408d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a4.b f71239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.icebreakerseditor.g f71240b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final IcebreakersEditorAnalyticsData f71241c;

    @Inject
    public a(@Y61.k a4.b bVar, @Y61.k com.avito.android.advert.icebreakerseditor.g gVar, @l IcebreakersEditorAnalyticsData icebreakersEditorAnalyticsData) {
        this.f71239a = bVar;
        this.f71240b = gVar;
        this.f71241c = icebreakersEditorAnalyticsData;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC25406b> b(InterfaceC25405a interfaceC25405a, C25408d c25408d) {
        String str;
        String str2;
        String str3;
        InterfaceC25405a interfaceC25405a2 = interfaceC25405a;
        if (interfaceC25405a2 instanceof InterfaceC25405a.g) {
            return new C43210w(new InterfaceC25406b.h());
        }
        boolean z12 = interfaceC25405a2 instanceof InterfaceC25405a.b;
        a4.b bVar = this.f71239a;
        if (z12) {
            InterfaceC25405a.b bVar2 = (InterfaceC25405a.b) interfaceC25405a2;
            boolean z13 = bVar2.f56862d;
            String str4 = z13 ? "edit" : "add";
            String str5 = bVar2.f56861c;
            String str6 = str5 == null ? "" : str5;
            Long l12 = bVar2.f56860b;
            bVar.b(l12, str4, str6);
            return new C43210w(new InterfaceC25406b.C1990b(bVar2.f56859a, l12, str5, z13));
        }
        boolean z14 = interfaceC25405a2 instanceof InterfaceC25405a.c;
        com.avito.android.advert.icebreakerseditor.g gVar = this.f71240b;
        String str7 = "9";
        IcebreakersEditorAnalyticsData icebreakersEditorAnalyticsData = this.f71241c;
        if (z14) {
            InterfaceC25405a.c cVar = (InterfaceC25405a.c) interfaceC25405a2;
            Long l13 = cVar.f56863a;
            String str8 = cVar.f56864b;
            if (l13 != null) {
                bVar.c(l13, "edit", str8);
                return this.f71240b.c((icebreakersEditorAnalyticsData == null || (str2 = icebreakersEditorAnalyticsData.f71193c) == null) ? "9" : str2, icebreakersEditorAnalyticsData != null ? icebreakersEditorAnalyticsData.f71192b : null, l13.longValue(), str8, str8);
            }
            bVar.c(null, "add", str8);
            if (icebreakersEditorAnalyticsData != null && (str3 = icebreakersEditorAnalyticsData.f71193c) != null) {
                str7 = str3;
            }
            return gVar.a(str7, icebreakersEditorAnalyticsData != null ? icebreakersEditorAnalyticsData.f71192b : null, str8, str8);
        }
        if (interfaceC25405a2 instanceof InterfaceC25405a.C1989a) {
            return new C43210w(InterfaceC25406b.a.f56869a);
        }
        if (interfaceC25405a2 instanceof InterfaceC25405a.f) {
            return new C43210w(new InterfaceC25406b.c(((InterfaceC25405a.f) interfaceC25405a2).f56868a));
        }
        if (!(interfaceC25405a2 instanceof InterfaceC25405a.e)) {
            if (interfaceC25405a2 instanceof InterfaceC25405a.d) {
                return new C43210w(InterfaceC25406b.d.f56875a);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC25405a.e eVar = (InterfaceC25405a.e) interfaceC25405a2;
        long j12 = eVar.f56866a;
        bVar.c(Long.valueOf(j12), "delete", eVar.f56867b);
        if (icebreakersEditorAnalyticsData != null && (str = icebreakersEditorAnalyticsData.f71193c) != null) {
            str7 = str;
        }
        return gVar.b(j12, str7);
    }
}
