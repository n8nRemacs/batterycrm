package com.avito.android.tariff.cpx.limit.sheet.mvi;

import NB0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.limit.sheet.deeplink.InputField;
import com.avito.android.tariff.cpx.limit.sheet.deeplink.TariffCpxLimitBody;
import com.avito.android.tariff.cpx.limit.sheet.deeplink.Validator;
import com.avito.android.tariff.cpx.limit.sheet.mvi.entity.TariffCpxLimitInternalAction;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: TariffCpxLimitReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "LNB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements u<TariffCpxLimitInternalAction, NB0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Locale f297343b;

    @Inject
    public p(@Y61.k Locale locale) {
        this.f297343b = locale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final NB0.c a(TariffCpxLimitInternalAction tariffCpxLimitInternalAction, NB0.c cVar) {
        String str;
        Double dValueOf;
        String str2;
        String str3;
        Integer num;
        Double d12;
        Long valuePenny;
        TariffCpxLimitInternalAction tariffCpxLimitInternalAction2 = tariffCpxLimitInternalAction;
        NB0.c cVar2 = cVar;
        if (tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.Content) {
            TariffCpxLimitBody tariffCpxLimitBody = ((TariffCpxLimitInternalAction.Content) tariffCpxLimitInternalAction2).f297317b.f297293b;
            InputField remains = tariffCpxLimitBody.getRemains();
            Double dValueOf2 = (remains == null || (valuePenny = remains.getValuePenny()) == null) ? null : Double.valueOf(valuePenny.longValue() / 100.0d);
            AttributedText title = tariffCpxLimitBody.getTitle();
            c.b bVar = new c.b(Integer.valueOf(tariffCpxLimitBody.getLimit().getValue()), tariffCpxLimitBody.getLimit().getTitle());
            Integer numValueOf = Integer.valueOf(tariffCpxLimitBody.getLimit().getValue());
            InputField remains2 = tariffCpxLimitBody.getRemains();
            Integer numValueOf2 = remains2 != null ? Integer.valueOf(remains2.getValue()) : null;
            if (dValueOf2 != null) {
                iIntValue = (dValueOf2.doubleValue() % 1.0d == 0.0d ? 1 : 0) ^ 1;
            }
            boolean z12 = iIntValue;
            String strB = dValueOf2 != null ? b(dValueOf2.doubleValue()) : "0";
            InputField remains3 = tariffCpxLimitBody.getRemains();
            c.C0724c c0724c = new c.C0724c(numValueOf2, z12, dValueOf2, strB, remains3 != null ? remains3.getTitle() : null);
            AttributedText hint = tariffCpxLimitBody.getHint();
            AttributedText hint2 = tariffCpxLimitBody.getHint();
            Validator minChangeValidation = tariffCpxLimitBody.getMinChangeValidation();
            Integer numValueOf3 = minChangeValidation != null ? Integer.valueOf(minChangeValidation.getValue()) : null;
            Validator minChangeValidation2 = tariffCpxLimitBody.getMinChangeValidation();
            c.d dVar = new c.d(minChangeValidation2 != null ? minChangeValidation2.getHint() : null, numValueOf3);
            Validator minLimitValidation = tariffCpxLimitBody.getMinLimitValidation();
            Integer numValueOf4 = minLimitValidation != null ? Integer.valueOf(minLimitValidation.getValue()) : null;
            Validator minLimitValidation2 = tariffCpxLimitBody.getMinLimitValidation();
            return new NB0.c(title, bVar, numValueOf, c0724c, hint, hint2, dVar, new c.d(minLimitValidation2 != null ? minLimitValidation2.getHint() : null, numValueOf4), tariffCpxLimitBody.getPrimaryAction(), tariffCpxLimitBody.getSecondaryAction(), false, false, false);
        }
        if (tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.InvalidLimit) {
            return NB0.c.a(cVar2, null, null, ((TariffCpxLimitInternalAction.InvalidLimit) tariffCpxLimitInternalAction2).f297326b, true, false, 7151);
        }
        if (tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.ProgressChange) {
            return NB0.c.a(cVar2, null, null, null, false, ((TariffCpxLimitInternalAction.ProgressChange) tariffCpxLimitInternalAction2).f297327b, 6143);
        }
        if (!(tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.InputChange)) {
            return cVar2;
        }
        c.b bVar2 = cVar2.f11309c;
        c.C0724c c0724c2 = cVar2.f11311e;
        if (c0724c2 == null || (d12 = c0724c2.f11325c) == null) {
            str = "0";
            dValueOf = null;
        } else {
            double dIntValue = (((TariffCpxLimitInternalAction.InputChange) tariffCpxLimitInternalAction2).f297323b - (bVar2 != null ? bVar2.f11321a.intValue() : 0.0d)) + d12.doubleValue();
            String strB2 = dIntValue > 0.0d ? b(dIntValue) : "0";
            dValueOf = Double.valueOf(dIntValue);
            str = strB2;
        }
        TariffCpxLimitInternalAction.InputChange inputChange = (TariffCpxLimitInternalAction.InputChange) tariffCpxLimitInternalAction2;
        int iIntValue = bVar2 != null ? bVar2.f11321a.intValue() : 0;
        int i12 = inputChange.f297323b;
        int i13 = i12 - iIntValue;
        if (c0724c2 != null && (num = c0724c2.f11323a) != null) {
            iIntValue = num.intValue();
        }
        return NB0.c.a(cVar2, (bVar2 == null || (str3 = bVar2.f11322b) == null) ? null : new c.b(Integer.valueOf(i12), str3), (c0724c2 == null || (str2 = c0724c2.f11327e) == null) ? null : new c.C0724c(Integer.valueOf(i13 + iIntValue), c0724c2.f11324b, dValueOf, str, str2), inputChange.f297325d, false, false, 997);
    }

    public final String b(double d12) {
        String str = !(((d12 % 1.0d) > 0.0d ? 1 : ((d12 % 1.0d) == 0.0d ? 0 : -1)) == 0) ? "%.1f" : "%.0f";
        u0 u0Var = u0.f406856a;
        return String.format(this.f297343b, str, Arrays.copyOf(new Object[]{Double.valueOf(d12)}, 1));
    }
}
