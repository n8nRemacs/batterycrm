package com.avito.android.mortgage.person_form.mvi.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.InputFormContentType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetMortgageFormUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/b;", "Lcom/avito/android/mortgage/person_form/mvi/domain/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.person_form.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final IZ.a f201037a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.formatters.a f201038b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.formatters.d f201039c;

    /* compiled from: GetMortgageFormUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201040a;

        static {
            int[] iArr = new int[InputFormContentType.values().length];
            try {
                iArr[InputFormContentType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputFormContentType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f201040a = iArr;
        }
    }

    @Inject
    public b(@Y61.k IZ.a aVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.formatters.a aVar2, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.formatters.d dVar) {
        this.f201037a = aVar;
        this.f201038b = aVar2;
        this.f201039c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.mortgage.person_form.mvi.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r23, @Y61.k java.lang.String r24, @Y61.k java.lang.String r25, @Y61.k Y41.l r26, @Y61.k Y41.p r27, @Y61.k Y41.p r28, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.domain.b.a(java.lang.String, java.lang.String, java.lang.String, Y41.l, Y41.p, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final InputFormContentItemValue b(InputFormContentItemValue inputFormContentItemValue) {
        String strB;
        InputFormContentType inputFormContentTypeD = inputFormContentItemValue.d();
        String value = inputFormContentItemValue.getValue();
        int i12 = a.f201040a[inputFormContentTypeD.ordinal()];
        if (i12 == 1) {
            if (value == null) {
                value = "";
            }
            strB = this.f201038b.b(value);
        } else if (i12 != 2) {
            strB = null;
        } else {
            if (value == null) {
                value = "";
            }
            strB = this.f201039c.b(value);
        }
        String str = strB;
        return str != null ? InputFormContentItemValue.a(inputFormContentItemValue, false, false, str, false, false, null, null, 1015807) : inputFormContentItemValue;
    }
}
