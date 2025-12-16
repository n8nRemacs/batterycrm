package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import CE.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.fees_methods.screen.fees_methods_v2.mvi.entity.FeesMethodsV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import wZ.C49578b;

/* compiled from: FeesMethodsV2Reducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "LGE/c;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<FeesMethodsV2InternalAction, GE.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.fees_methods.screen.fees_methods_v2.data.a f158306b;

    @Inject
    public l(@Y61.k com.avito.android.fees_methods.screen.fees_methods_v2.data.a aVar) {
        this.f158306b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final GE.c a(FeesMethodsV2InternalAction feesMethodsV2InternalAction, GE.c cVar) {
        wZ.j jVar;
        FeesMethodsV2InternalAction feesMethodsV2InternalAction2 = feesMethodsV2InternalAction;
        GE.c cVar2 = cVar;
        if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.Loading) {
            return GE.c.a(cVar2, null, false, null, null, true, 7);
        }
        if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.Error) {
            return GE.c.a(cVar2, null, false, null, ((FeesMethodsV2InternalAction.Error) feesMethodsV2InternalAction2).f158282b, false, 7);
        }
        if (!(feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.Content)) {
            return cVar2;
        }
        FeesMethodsV2InternalAction.Content content = (FeesMethodsV2InternalAction.Content) feesMethodsV2InternalAction2;
        a.b bVar = content.f158280b;
        CE.d navBar = bVar.getNavBar();
        if (navBar != null) {
            Double progress = navBar.getProgress();
            Float fValueOf = progress != null ? Float.valueOf((float) progress.doubleValue()) : null;
            CE.c button = navBar.getButton();
            jVar = new wZ.j(fValueOf, button != null ? new C49578b(button.getTitle(), button.getUri(), button.getStyle(), button.getIsEnabled()) : null);
        } else {
            jVar = null;
        }
        return GE.c.a(cVar2, jVar, false, this.f158306b.a(bVar, content.f158281c), null, false, 2);
    }
}
