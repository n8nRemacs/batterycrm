package com.avito.android.vas_planning;

import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mnz_common.ui.ActionFloatingFooter;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.P2;
import com.avito.android.vas_planning.model.VasAdvantage;
import com.avito.android.vas_planning.model.VasButton;
import com.avito.android.vas_planning.model.VasPlannerState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanningView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/vas_planning/model/VasPlannerState;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<P2<? super VasPlannerState>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f322410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar) {
        super(1);
        this.f322410l = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super VasPlannerState> p22) {
        P2<? super VasPlannerState> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        SpannableStringBuilder spannableStringBuilder = null;
        o oVar = this.f322410l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar = oVar.f322455j;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
            D6.w(oVar.f322454i);
        } else if (p23 instanceof P2.a) {
            ApiError apiError = ((P2.a) p23).f318719a;
            com.avito.android.progress_overlay.l lVar2 = oVar.f322455j;
            (lVar2 != null ? lVar2 : null).a(z.k(apiError));
        } else if (p23 instanceof P2.b) {
            VasPlannerState vasPlannerState = (VasPlannerState) ((P2.b) p23).f318720a;
            oVar.getClass();
            oVar.f322447b.c(new UV0.c(vasPlannerState.f322418b));
            VasAdvantage vasAdvantage = vasPlannerState.f322419c;
            if (vasAdvantage != null) {
                String str = vasAdvantage.f322413b;
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new OK0.b(vasAdvantage.f322414c, new j(oVar.f322451f), false), 0, str.length(), 33);
                spannableStringBuilder.setSpan(new UnderlineSpan(), 0, str.length(), 33);
            }
            ActionFloatingFooter actionFloatingFooter = oVar.f322454i;
            I5.a(actionFloatingFooter.f197976e, spannableStringBuilder, false);
            VasButton vasButton = vasPlannerState.f322420d;
            String str2 = vasButton.f322415b;
            boolean z13 = vasButton.f322417d != null;
            i iVar = new i(vasPlannerState, oVar);
            Button button = actionFloatingFooter.f197975d;
            com.avito.android.lib.design.button.b.a(button, str2, false);
            button.setOnClickListener(new ru.avito.component.serp.job.d(1, iVar));
            button.setEnabled(z13);
            actionFloatingFooter.a();
            oVar.b();
        }
        return G0.f406611a;
    }
}
