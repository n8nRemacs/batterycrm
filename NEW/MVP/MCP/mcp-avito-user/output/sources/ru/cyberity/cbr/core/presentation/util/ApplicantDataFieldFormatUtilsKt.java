package ru.cyberity.cbr.core.presentation.util;

import Y61.k;
import Y61.l;
import android.text.InputFilter;
import android.widget.EditText;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.model.q;

/* compiled from: ApplicantDataFieldFormatUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\f\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/data/model/q;", "", "input", "", "checkField", "(Lru/cyberity/cbr/core/data/model/q;Ljava/lang/String;)Z", "name", "isAlpha", "(Ljava/lang/String;)Z", "", "strings", "required", "getError", "(Lru/cyberity/cbr/core/data/model/q;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;", "Landroid/widget/EditText;", "editText", "Lkotlin/G0;", "applyToEditText", "(Lru/cyberity/cbr/core/data/model/q;Landroid/widget/EditText;)Lkotlin/G0;", "", "getInputType", "(Lru/cyberity/cbr/core/data/model/q;)Ljava/lang/Integer;", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class ApplicantDataFieldFormatUtilsKt {
    @l
    public static final G0 applyToEditText(@l q qVar, @l EditText editText) {
        if (qVar instanceof q.g) {
            InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(((q.g) qVar).getValue())};
            if (editText != null) {
                editText.setFilters(inputFilterArr);
            }
            return G0.f406611a;
        }
        if (editText != null) {
            editText.setFilters(new InputFilter[0]);
        }
        Integer inputType = getInputType(qVar);
        if (inputType == null) {
            return null;
        }
        int iIntValue = inputType.intValue();
        if (editText != null) {
            editText.setInputType(iIntValue);
        }
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean checkField(@Y61.l ru.cyberity.cbr.core.data.model.q r3, @Y61.l java.lang.String r4) {
        /*
            if (r3 == 0) goto Lcb
            if (r4 == 0) goto Lcb
            boolean r0 = kotlin.text.C43066x.K(r4)
            if (r0 == 0) goto Lc
            goto Lcb
        Lc:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.a
            if (r0 == 0) goto L16
            boolean r3 = isAlpha(r4)
            goto Lcc
        L16:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.d
            if (r0 == 0) goto L2a
            ru.cyberity.cbr.core.data.model.q$d r3 = (ru.cyberity.cbr.core.data.model.q.d) r3
            ru.cyberity.cbr.core.data.source.applicant.remote.g r3 = r3.getValue()
            java.lang.Double r4 = kotlin.text.C43066x.w0(r4)
            boolean r3 = r3.a(r4)
            goto Lcc
        L2a:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.f
            if (r0 == 0) goto L36
            ru.cyberity.cbr.core.presentation.screen.base.b r3 = ru.cyberity.cbr.core.presentation.screen.base.b.f434008a
            boolean r3 = r3.a(r4)
            goto Lcc
        L36:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.h
            r1 = 0
            if (r0 == 0) goto L52
            java.lang.Double r4 = kotlin.text.C43066x.w0(r4)
            if (r4 == 0) goto L46
            double r1 = r4.doubleValue()
        L46:
            ru.cyberity.cbr.core.data.model.q$h r3 = (ru.cyberity.cbr.core.data.model.q.h) r3
            double r3 = r3.getValue()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto Lb3
            goto Lcb
        L52:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.j
            if (r0 == 0) goto L6b
            java.lang.Double r4 = kotlin.text.C43066x.w0(r4)
            if (r4 == 0) goto L60
            double r1 = r4.doubleValue()
        L60:
            ru.cyberity.cbr.core.data.model.q$j r3 = (ru.cyberity.cbr.core.data.model.q.j) r3
            double r3 = r3.getValue()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto Lb3
            goto Lcb
        L6b:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.k
            if (r0 == 0) goto L74
            boolean r3 = android.text.TextUtils.isDigitsOnly(r4)
            goto Lcc
        L74:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.l
            if (r0 == 0) goto L88
            kotlin.text.p r0 = new kotlin.text.p
            ru.cyberity.cbr.core.data.model.q$l r3 = (ru.cyberity.cbr.core.data.model.q.l) r3
            java.lang.String r3 = r3.getValue()
            r0.<init>(r3)
            boolean r3 = r0.e(r4)
            goto Lcc
        L88:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.m
            if (r0 == 0) goto L91
            boolean r3 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r4)
            goto Lcc
        L91:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.g
            if (r0 == 0) goto La2
            int r4 = r4.length()
            ru.cyberity.cbr.core.data.model.q$g r3 = (ru.cyberity.cbr.core.data.model.q.g) r3
            int r3 = r3.getValue()
            if (r4 > r3) goto Lb3
            goto Lcb
        La2:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.i
            if (r0 == 0) goto Lb5
            int r4 = r4.length()
            ru.cyberity.cbr.core.data.model.q$i r3 = (ru.cyberity.cbr.core.data.model.q.i) r3
            int r3 = r3.getValue()
            if (r4 < r3) goto Lb3
            goto Lcb
        Lb3:
            r3 = 0
            goto Lcc
        Lb5:
            boolean r0 = r3 instanceof ru.cyberity.cbr.core.data.model.q.c
            if (r0 == 0) goto Lba
            goto Lcb
        Lba:
            boolean r3 = r3 instanceof ru.cyberity.cbr.core.data.model.q.b
            if (r3 == 0) goto Lc5
            ru.cyberity.cbr.core.presentation.screen.base.b r3 = ru.cyberity.cbr.core.presentation.screen.base.b.f434008a
            boolean r3 = r3.a(r4)
            goto Lcc
        Lc5:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        Lcb:
            r3 = 1
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.util.ApplicantDataFieldFormatUtilsKt.checkField(ru.cyberity.cbr.core.data.model.q, java.lang.String):boolean");
    }

    @k
    public static final String getError(@l q qVar, @k Map<String, String> map, @l String str, @l Boolean bool) {
        String str2;
        if (L.f(bool, Boolean.TRUE) && str != null && C43066x.K(str)) {
            str2 = map.get("sns_quiestionnaire_field_isRequired");
            if (str2 == null) {
                return "";
            }
        } else if (checkField(qVar, str) || (str2 = map.get("sns_quiestionnaire_field_isNotValid")) == null) {
            return "";
        }
        return str2;
    }

    @l
    public static final Integer getInputType(@l q qVar) {
        if (qVar instanceof q.h ? true : qVar instanceof q.j ? true : qVar instanceof q.d) {
            return 8194;
        }
        if (qVar instanceof q.k) {
            return 2;
        }
        if (qVar instanceof q.f) {
            return 32;
        }
        if (qVar instanceof q.c) {
            return 8193;
        }
        return qVar instanceof q.b ? 32 : null;
    }

    private static final boolean isAlpha(String str) {
        for (char c12 : str.toCharArray()) {
            if (!Character.isLetter(c12) && !Character.isSpaceChar(c12)) {
                return false;
            }
        }
        return true;
    }
}
