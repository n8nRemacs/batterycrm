package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import CE.a;
import GE.b;
import Mf0.InterfaceC14484d;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.screen.fees_methods_v2.mvi.entity.FeesMethodsV2InternalAction;
import com.avito.android.remote.model.LimitsInfo;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: FeesMethodsV2OneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "LGE/b;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<FeesMethodsV2InternalAction, GE.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f158302b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14484d f158303c;

    @Inject
    public j(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC14484d interfaceC14484d) {
        this.f158302b = interfaceC28373a;
        this.f158303c = interfaceC14484d;
    }

    @Override // com.avito.android.arch.mvi.t
    public final GE.b b(FeesMethodsV2InternalAction feesMethodsV2InternalAction) {
        b.c cVar;
        CE.i displayEvent;
        FeesMethodsV2InternalAction feesMethodsV2InternalAction2 = feesMethodsV2InternalAction;
        if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.Back) {
            return b.a.f6385a;
        }
        if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.FinishFlow) {
            return b.C0334b.f6386a;
        }
        boolean z12 = feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.Content;
        InterfaceC14484d interfaceC14484d = this.f158303c;
        if (!z12) {
            if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.Redirect) {
                cVar = new b.c(((FeesMethodsV2InternalAction.Redirect) feesMethodsV2InternalAction2).f158289b, true);
            } else if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.HandleDeeplink) {
                DeepLink deepLink = ((FeesMethodsV2InternalAction.HandleDeeplink) feesMethodsV2InternalAction2).f158288b;
                if (deepLink != null) {
                    cVar = new b.c(deepLink, false);
                }
            } else if (feesMethodsV2InternalAction2 instanceof FeesMethodsV2InternalAction.FeesMethodClicked) {
                FeesMethodsV2InternalAction.FeesMethodClicked feesMethodClicked = (FeesMethodsV2InternalAction.FeesMethodClicked) feesMethodsV2InternalAction2;
                interfaceC14484d.a(feesMethodClicked.f158284b, feesMethodClicked.f158285c, feesMethodClicked.f158286d);
            }
            return cVar;
        }
        FeesMethodsV2InternalAction.Content content = (FeesMethodsV2InternalAction.Content) feesMethodsV2InternalAction2;
        a.b bVar = content.f158280b;
        CE.h details = bVar.getDetails();
        if (details != null && (displayEvent = details.getDisplayEvent()) != null) {
            int id2 = (int) displayEvent.getId();
            int version = (int) displayEvent.getVersion();
            Map<String, Object> mapB = displayEvent.b();
            if (mapB == null) {
                mapB = P0.c();
            }
            this.f158302b.c(new ParametrizedClickStreamEvent(id2, version, mapB, null, 8, null));
        }
        LimitsInfo limitsInfo = content.f158281c;
        if (limitsInfo != null) {
            interfaceC14484d.c(bVar.getItemId(), limitsInfo);
        }
        return null;
    }
}
