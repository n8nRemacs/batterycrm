package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StickersEditActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LML0/a;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "LML0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<ML0.a, StickersEditInternalAction, ML0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.c f320776a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.a f320777b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f320778c;

    @Inject
    public c(@Y61.k com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.c cVar, @Y61.k com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.a aVar, @com.avito.android.vas_performance.screens.stickers.edit.di.c @Y61.k String str) {
        this.f320776a = cVar;
        this.f320777b = aVar;
        this.f320778c = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f320773l, new b(this, aVar), 1000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r6 == r5) goto L71;
     */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction> b(@Y61.k ML0.a r9, @Y61.k ML0.c r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.stickers.edit.mvi.c.b(ML0.a, ML0.c):kotlinx.coroutines.flow.i");
    }
}
