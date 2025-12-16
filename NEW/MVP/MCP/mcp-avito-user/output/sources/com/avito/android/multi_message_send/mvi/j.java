package com.avito.android.multi_message_send.mvi;

import G20.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import y20.C50043a;

/* compiled from: MultiMessageSendActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "LG20/b;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "LG20/d;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements com.avito.android.arch.mvi.a<G20.b, MultiMessageSendInternalAction, G20.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multi_message_send.domain.e f206782a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multi_message_send.domain.l f206783b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f206784c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f206785d;

    @Inject
    public j(@Y61.k com.avito.android.multi_message_send.domain.e eVar, @Y61.k com.avito.android.multi_message_send.domain.l lVar, @com.avito.android.multi_message_send.di.b @Y61.k String str, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f206782a = eVar;
        this.f206783b = lVar;
        this.f206784c = str;
        this.f206785d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MultiMessageSendInternalAction> b(G20.b bVar, G20.d dVar) {
        G20.b bVar2 = bVar;
        G20.d dVar2 = dVar;
        if (bVar2.equals(b.j.f6239a)) {
            return this.f206782a.a();
        }
        if (bVar2 instanceof b.e) {
            return C43175k.G(new a(bVar2, dVar2, null));
        }
        if (bVar2.equals(b.h.f6237a)) {
            return C43175k.G(new b(2, null));
        }
        if (bVar2 instanceof b.a) {
            return C43175k.G(new c(bVar2, null));
        }
        if (bVar2 instanceof b.C0329b) {
            return C43175k.G(new d(bVar2, null));
        }
        if (bVar2.equals(b.d.f6233a)) {
            return C43175k.G(new e(2, null));
        }
        if (bVar2 instanceof b.c) {
            return C43175k.G(new f(bVar2, null));
        }
        if (bVar2 instanceof b.g) {
            return C43175k.G(new g(bVar2, null));
        }
        if (bVar2 instanceof b.f) {
            return C43175k.G(new h(bVar2, null));
        }
        if (!bVar2.equals(b.i.f6238a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = dVar2.f6253g;
        if (str == null || !(!C43066x.K(str)) || str.length() <= 0) {
            return C43175k.w();
        }
        List<Long> list = dVar2.f6254h;
        List<Long> list2 = list;
        if (list2.isEmpty()) {
            return C43175k.G(new i(2, null));
        }
        this.f206785d.c(new C50043a(this.f206784c, list2.size()));
        return this.f206783b.a(str, list);
    }
}
