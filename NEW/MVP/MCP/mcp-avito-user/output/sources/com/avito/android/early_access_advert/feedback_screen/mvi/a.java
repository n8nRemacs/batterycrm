package com.avito.android.early_access_advert.feedback_screen.mvi;

import Ux.C15581c;
import Ux.InterfaceC15579a;
import com.avito.android.arch.mvi.a;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EarlyAccessAdvertFeedbackActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LUx/a;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "LUx/c;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15579a, EarlyAccessAdvertFeedbackInternalAction, C15581c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.early_access_advert.a f145669a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.early_access_advert.feedback_screen.domain.a f145670b;

    @Inject
    public a(@Y61.k com.avito.android.early_access_advert.a aVar, @Y61.k com.avito.android.early_access_advert.feedback_screen.domain.a aVar2) {
        this.f145669a = aVar;
        this.f145670b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EarlyAccessAdvertFeedbackInternalAction> b(InterfaceC15579a interfaceC15579a, C15581c c15581c) {
        InterfaceC43160i<EarlyAccessAdvertFeedbackInternalAction> c43210w;
        InterfaceC15579a interfaceC15579a2 = interfaceC15579a;
        C15581c c15581c2 = c15581c;
        if (interfaceC15579a2 instanceof InterfaceC15579a.C1155a) {
            return new C43210w(EarlyAccessAdvertFeedbackInternalAction.CloseScreen.f145689b);
        }
        if (interfaceC15579a2 instanceof InterfaceC15579a.b) {
            c43210w = new C43210w(new EarlyAccessAdvertFeedbackInternalAction.FeedbackTextUpdated(((InterfaceC15579a.b) interfaceC15579a2).f16783a));
        } else if (interfaceC15579a2 instanceof InterfaceC15579a.c) {
            c43210w = new C43210w(new EarlyAccessAdvertFeedbackInternalAction.ButtonVisibilityChanged(!((InterfaceC15579a.c) interfaceC15579a2).f16784a));
        } else {
            if (!(interfaceC15579a2 instanceof InterfaceC15579a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = c15581c2.f16793e;
            String string = str != null ? C43066x.A0(str).toString() : null;
            EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType = c15581c2.f16792d;
            if (earlyAccessAdvertFeedbackType == null) {
                c43210w = C43175k.w();
            } else {
                this.f145669a.a(earlyAccessAdvertFeedbackType.f145655c, string == null ? "" : string);
                c43210w = (string == null || C43066x.K(string)) ? new C43210w(EarlyAccessAdvertFeedbackInternalAction.CloseScreen.f145689b) : this.f145670b.a(c15581c2.f16791c, earlyAccessAdvertFeedbackType.f145654b, string);
            }
        }
        return c43210w;
    }
}
