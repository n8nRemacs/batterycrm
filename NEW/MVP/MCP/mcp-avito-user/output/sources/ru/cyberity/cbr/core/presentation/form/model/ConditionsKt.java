package ru.cyberity.cbr.core.presentation.form.model;

import kotlin.Metadata;

/* compiled from: Conditions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"parseStatements", "", "Lru/cyberity/cbr/core/presentation/form/model/CheckCondition;", "condition", "", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ConditionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<ru.cyberity.cbr.core.presentation.form.model.CheckCondition> parseStatements(@Y61.l java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 6
            r2 = 0
            r3 = 0
            if (r10 == 0) goto L1f
            ru.cyberity.cbr.core.presentation.form.model.Logic r4 = ru.cyberity.cbr.core.presentation.form.model.Logic.OR
            java.lang.String r4 = r4.getRawValue()
            ru.cyberity.cbr.core.presentation.form.model.Logic r5 = ru.cyberity.cbr.core.presentation.form.model.Logic.AND
            java.lang.String r5 = r5.getRawValue()
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r10 = kotlin.text.C43066x.f0(r10, r4, r2, r1)
            goto L20
        L1f:
            r10 = r3
        L20:
            if (r10 == 0) goto Le1
            java.util.Iterator r10 = r10.iterator()
        L26:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Le1
            java.lang.Object r4 = r10.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "!="
            boolean r6 = kotlin.text.C43066x.q(r4, r5, r2)
            r7 = 1
            java.lang.String r8 = "."
            if (r6 == 0) goto L77
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.List r5 = kotlin.text.C43066x.f0(r4, r5, r2, r1)
            java.lang.Object r6 = r5.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            ru.cyberity.cbr.core.data.source.applicant.remote.i r6 = ru.cyberity.cbr.core.data.source.applicant.remote.j.a(r6, r8)
            if (r6 == 0) goto L75
            ru.cyberity.cbr.core.presentation.form.model.CheckCondition$NotEqualCheck r8 = new ru.cyberity.cbr.core.presentation.form.model.CheckCondition$NotEqualCheck
            java.lang.String r9 = r6.getKey()
            java.lang.CharSequence r9 = kotlin.text.C43066x.A0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r6 = r6.getValue()
            java.lang.CharSequence r6 = kotlin.text.C43066x.A0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            r8.<init>(r4, r9, r6, r5)
            goto Lda
        L75:
            r8 = r3
            goto Lda
        L77:
            java.lang.String r5 = "="
            boolean r6 = kotlin.text.C43066x.q(r4, r5, r2)
            if (r6 == 0) goto Lb7
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.List r5 = kotlin.text.C43066x.f0(r4, r5, r2, r1)
            java.lang.Object r6 = r5.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            ru.cyberity.cbr.core.data.source.applicant.remote.i r6 = ru.cyberity.cbr.core.data.source.applicant.remote.j.a(r6, r8)
            if (r6 == 0) goto L75
            ru.cyberity.cbr.core.presentation.form.model.CheckCondition$EqualCheck r8 = new ru.cyberity.cbr.core.presentation.form.model.CheckCondition$EqualCheck
            java.lang.String r9 = r6.getKey()
            java.lang.CharSequence r9 = kotlin.text.C43066x.A0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r6 = r6.getValue()
            java.lang.CharSequence r6 = kotlin.text.C43066x.A0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            r8.<init>(r4, r9, r6, r5)
            goto Lda
        Lb7:
            ru.cyberity.cbr.core.data.source.applicant.remote.i r5 = ru.cyberity.cbr.core.data.source.applicant.remote.j.a(r4, r8)
            if (r5 == 0) goto L75
            ru.cyberity.cbr.core.presentation.form.model.CheckCondition$ExistsCheck r8 = new ru.cyberity.cbr.core.presentation.form.model.CheckCondition$ExistsCheck
            java.lang.String r6 = r5.getKey()
            java.lang.CharSequence r6 = kotlin.text.C43066x.A0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = r5.getValue()
            java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
            java.lang.String r5 = r5.toString()
            r8.<init>(r4, r6, r5)
        Lda:
            if (r8 == 0) goto L26
            r0.add(r8)
            goto L26
        Le1:
            java.util.List r10 = kotlin.collections.C42745f0.M0(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.form.model.ConditionsKt.parseStatements(java.lang.String):java.util.List");
    }
}
