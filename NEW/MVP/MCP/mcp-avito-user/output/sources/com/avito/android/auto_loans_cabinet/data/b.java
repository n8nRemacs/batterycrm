package com.avito.android.auto_loans_cabinet.data;

import Ie.InterfaceC14063a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_loans_cabinet.generated.api.autoloan_user_blanks.UserBlanksActiveData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoLoanBlanksDataSource.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/data/b;", "Lcom/avito/android/auto_loans_cabinet/data/a;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.auto_loans_cabinet.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14063a f95344a;

    /* compiled from: AutoLoanBlanksDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95345a;

        static {
            int[] iArr = new int[UserBlanksActiveData.BlankStep.values().length];
            try {
                iArr[UserBlanksActiveData.BlankStep.Started.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserBlanksActiveData.BlankStep.ScoredPositive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserBlanksActiveData.BlankStep.ScoredNegative.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95345a = iArr;
        }
    }

    @Inject
    public b(@k InterfaceC14063a interfaceC14063a) {
        this.f95344a = interfaceC14063a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.auto_loans_cabinet.data.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_loans_cabinet.data.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
