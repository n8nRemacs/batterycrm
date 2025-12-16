package com.avito.android.mortgage.deeplink.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: MortgageApplicationEntryPointUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/domain/g;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f198826a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f198827b;

    @Inject
    public g(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f198826a = eVar;
        this.f198827b = r02;
    }

    public static Object a(g gVar, String str, String str2, SuspendLambda suspendLambda, int i12) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return C43259k.g(gVar.f198827b.a(), new f(gVar, str, str2, null), suspendLambda);
    }
}
