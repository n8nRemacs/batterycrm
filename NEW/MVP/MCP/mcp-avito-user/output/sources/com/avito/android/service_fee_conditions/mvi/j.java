package com.avito.android.service_fee_conditions.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_fee_conditions.generated.api.api_1_sf_conditions_get.OkResponseSuccessBanner;
import com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pu0.C47142a;
import pu0.C47143b;
import pu0.C47144c;
import pu0.C47145d;
import pu0.C47146e;
import pu0.C47147f;
import qu0.c;

/* compiled from: ServiceFeeConditionsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lqu0/c;", "<init>", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<ServiceFeeConditionsInternalAction, qu0.c> {

    /* compiled from: ServiceFeeConditionsReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f278461a;

        static {
            int[] iArr = new int[OkResponseSuccessBanner.IconStyle.values().length];
            try {
                iArr[OkResponseSuccessBanner.IconStyle.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkResponseSuccessBanner.IconStyle.Danger.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OkResponseSuccessBanner.IconStyle.Warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OkResponseSuccessBanner.IconStyle.Success.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f278461a = iArr;
        }
    }

    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final qu0.c a(ServiceFeeConditionsInternalAction serviceFeeConditionsInternalAction, qu0.c cVar) {
        c.a aVar;
        Y41.a aVar2;
        ServiceFeeConditionsInternalAction serviceFeeConditionsInternalAction2 = serviceFeeConditionsInternalAction;
        qu0.c cVar2 = cVar;
        if (serviceFeeConditionsInternalAction2 instanceof ServiceFeeConditionsInternalAction.Loading) {
            return qu0.c.a(cVar2, false, true, null, 0, null, null, null, null, null, null, null, 2041);
        }
        if (serviceFeeConditionsInternalAction2 instanceof ServiceFeeConditionsInternalAction.Error) {
            return qu0.c.a(cVar2, false, false, ((ServiceFeeConditionsInternalAction.Error) serviceFeeConditionsInternalAction2).f278451b, 0, null, null, null, null, null, null, null, 2041);
        }
        if (!(serviceFeeConditionsInternalAction2 instanceof ServiceFeeConditionsInternalAction.Content)) {
            return cVar2;
        }
        C47142a c47142a = ((ServiceFeeConditionsInternalAction.Content) serviceFeeConditionsInternalAction2).f278450b;
        C47147f snippet = c47142a.getSnippet();
        c.g gVar = new c.g(snippet.getImage(), snippet.getMainValue(), snippet.getPrimaryTitle(), snippet.getSecondaryTitle(), snippet.getStatus());
        List<C47143b> listB = c47142a.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (C47143b c47143b : listB) {
            String text = c47143b.getText();
            com.akita.compose.theme.re23.g gVar2 = com.akita.compose.theme.re23.g.f65049a;
            String textIconName = c47143b.getTextIconName();
            gVar2.getClass();
            arrayList.add(new c.b(text, com.akita.compose.theme.re23.g.a(textIconName)));
        }
        OkResponseSuccessBanner banner = c47142a.getBanner();
        if (banner != null) {
            AttributedText description = banner.getDescription();
            int i12 = a.f278461a[banner.getIconStyle().ordinal()];
            if (i12 == 1) {
                aVar2 = k.f278462l;
            } else if (i12 == 2) {
                aVar2 = l.f278463l;
            } else if (i12 == 3) {
                aVar2 = m.f278464l;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = n.f278465l;
            }
            String text2 = banner.getText();
            com.akita.compose.theme.re23.g gVar3 = com.akita.compose.theme.re23.g.f65049a;
            String textIconName2 = banner.getTextIconName();
            gVar3.getClass();
            aVar = new c.a(aVar2, description, text2, com.akita.compose.theme.re23.g.a(textIconName2));
        } else {
            aVar = null;
        }
        C47144c closeButton = c47142a.getCloseButton();
        c.C12344c c12344c = closeButton != null ? new c.C12344c(closeButton.getTitle(), closeButton.getUri()) : null;
        C47145d continueButton = c47142a.getContinueButton();
        c.e eVar = continueButton != null ? new c.e(continueButton.getTitle(), continueButton.getUri()) : null;
        C47146e navBar = c47142a.getNavBar();
        return qu0.c.a(cVar2, false, false, null, 0, navBar != null ? new c.f((float) navBar.getProgress()) : null, c47142a.getTitle(), gVar, arrayList, aVar, c12344c, eVar, 9);
    }
}
