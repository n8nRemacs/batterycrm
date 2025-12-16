package com.avito.android.publish.price_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectPriceListActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/publish/price_list/mvi/entity/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements com.avito.android.arch.mvi.a<com.avito.android.publish.price_list.mvi.entity.a, SelectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.f> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f238871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.g f238872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.c f238873c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.a f238874d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.o f238875e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.k f238876f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.i f238877g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.c f238878h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.q f238879i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.e f238880j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.use_case.a f238881k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Q1 f238882l;

    @Inject
    public h(@com.avito.android.publish.price_list.di.b boolean z12, @Y61.k com.avito.android.publish.price_list.domain.g gVar, @Y61.k com.avito.android.publish.price_list.domain.c cVar, @Y61.k com.avito.android.publish.price_list.domain.a aVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.o oVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.k kVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.i iVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.c cVar2, @Y61.k com.avito.android.publish.price_list.domain.use_case.q qVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.e eVar, @Y61.k com.avito.android.publish.price_list.domain.use_case.a aVar2, @Y61.k Q1 q12) {
        this.f238871a = z12;
        this.f238872b = gVar;
        this.f238873c = cVar;
        this.f238874d = aVar;
        this.f238875e = oVar;
        this.f238876f = kVar;
        this.f238877g = iVar;
        this.f238878h = cVar2;
        this.f238879i = qVar;
        this.f238880j = eVar;
        this.f238881k = aVar2;
        this.f238882l = q12;
    }

    public static SelectPriceListInternalAction.ShowPriceListClearDialog c() {
        return new SelectPriceListInternalAction.ShowPriceListClearDialog(com.avito.android.printable_text.b.c(R.string.price_list_clear_dialog_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.price_list_clear_dialog_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.price_list_clear_dialog_positive_text, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.price_list_clear_dialog_negative_text, new Serializable[0]));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    @Override // com.avito.android.arch.mvi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction> b(com.avito.android.publish.price_list.mvi.entity.a r10, com.avito.android.publish.price_list.mvi.entity.f r11) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.price_list.mvi.h.b(java.lang.Object, java.lang.Object):kotlinx.coroutines.flow.i");
    }
}
