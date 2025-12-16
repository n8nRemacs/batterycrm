package com.avito.android.error;

import com.avito.android.AbstractApplicationC34428s;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Error;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import java.util.Collection;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ErrorsHandlings.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-typed-result_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z {

    /* compiled from: ErrorsHandlings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f147772b;

        public a(Y41.l lVar) {
            this.f147772b = lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f147772b.invoke(obj);
        }
    }

    public static final String a(Map map) {
        String str = (String) C42745f0.F(map.values());
        return str == null ? c() : str;
    }

    public static final String b() {
        AbstractApplicationC34428s.f256016b.getClass();
        AbstractApplicationC34428s abstractApplicationC34428s = AbstractApplicationC34428s.f256017c;
        if (abstractApplicationC34428s == null) {
            abstractApplicationC34428s = null;
        }
        return abstractApplicationC34428s.getString(R.string.network_unavailable_snack);
    }

    public static final String c() {
        AbstractApplicationC34428s.f256016b.getClass();
        AbstractApplicationC34428s abstractApplicationC34428s = AbstractApplicationC34428s.f256017c;
        if (abstractApplicationC34428s == null) {
            abstractApplicationC34428s = null;
        }
        return abstractApplicationC34428s.getString(R.string.unknown_server_error);
    }

    public static final String d(String str, PrintableText printableText) {
        String strK0;
        String str2 = null;
        if (str == null || C43066x.K(str)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        if (printableText != null) {
            AbstractApplicationC34428s.f256016b.getClass();
            AbstractApplicationC34428s abstractApplicationC34428s = AbstractApplicationC34428s.f256017c;
            if (abstractApplicationC34428s == null) {
                abstractApplicationC34428s = null;
            }
            strK0 = printableText.k0(abstractApplicationC34428s.getBaseContext());
        } else {
            strK0 = null;
        }
        if (strK0 != null && !C43066x.K(strK0)) {
            str2 = strK0;
        }
        return str2 == null ? b() : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(@Y61.k ApiError apiError, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super Map<String, String>, G0> lVar2, @Y61.k Y41.l<? super String, G0> lVar3, @Y61.k Y41.l<? super String, G0> lVar4, @Y61.l PrintableText printableText) {
        if (apiError instanceof ApiError.Unauthorized) {
            lVar3.invoke(d(((ApiError.Unauthorized) apiError).getF244063c(), printableText));
            return;
        }
        if (apiError instanceof ApiError.NetworkIOError) {
            lVar4.invoke(t(((ApiError.NetworkIOError) apiError).getF244063c()));
        } else if (apiError instanceof com.avito.android.remote.error.r) {
            lVar2.invoke(((com.avito.android.remote.error.r) apiError).c());
        } else {
            lVar.invoke(d(apiError.getF244063c(), printableText));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@Y61.k java.lang.Throwable r6, @Y61.k Y41.l r7, @Y61.k Y41.l r8, @Y61.k Y41.l r9, @Y61.k Y41.l r10, @Y61.k Y41.l r11) {
        /*
            com.avito.android.remote.error.ApiError r0 = m(r6)
            r1 = r6
        L5:
            boolean r2 = r1 instanceof com.avito.android.remote.error.n
            if (r2 != 0) goto L10
            if (r1 == 0) goto L10
            java.lang.Throwable r1 = r1.getCause()
            goto L5
        L10:
            r3 = 0
            if (r2 == 0) goto L16
            com.avito.android.remote.error.n r1 = (com.avito.android.remote.error.n) r1
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 == 0) goto L1e
            com.avito.android.remote.model.Error r1 = r1.getF318631d()
            goto L1f
        L1e:
            r1 = r3
        L1f:
            if (r0 == 0) goto L2a
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            e(r0, r1, r2, r3, r4, r5)
            goto L86
        L2a:
            if (r1 == 0) goto L71
            java.util.Map r6 = r1.getParamsMessages()
            java.lang.String r10 = r1.getSimpleMessage()
            int r0 = r1.getCode()
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L4f
            if (r10 == 0) goto L47
            boolean r6 = kotlin.text.C43066x.K(r10)
            if (r6 != 0) goto L45
            r3 = r10
        L45:
            if (r3 != 0) goto L4b
        L47:
            java.lang.String r3 = b()
        L4b:
            r9.invoke(r3)
            goto L86
        L4f:
            if (r6 == 0) goto L5c
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L58
            goto L5c
        L58:
            r8.invoke(r6)
            goto L86
        L5c:
            if (r10 == 0) goto L69
            boolean r6 = kotlin.text.C43066x.K(r10)
            if (r6 == 0) goto L65
            goto L69
        L65:
            r7.invoke(r10)
            goto L86
        L69:
            java.lang.String r6 = c()
            r11.invoke(r6)
            goto L86
        L71:
            boolean r6 = com.avito.android.util.K5.e(r6)
            if (r6 == 0) goto L7f
            java.lang.String r6 = b()
            r10.invoke(r6)
            goto L86
        L7f:
            java.lang.String r6 = c()
            r11.invoke(r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.error.z.f(java.lang.Throwable, Y41.l, Y41.l, Y41.l, Y41.l, Y41.l):void");
    }

    public static /* synthetic */ void g(ApiError apiError, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, PrintableText printableText, int i12) {
        if ((i12 & 2) != 0) {
            lVar2 = new C30346e(lVar);
        }
        Y41.l lVar5 = lVar2;
        if ((i12 & 4) != 0) {
            lVar3 = new C30347f(lVar);
        }
        Y41.l lVar6 = lVar3;
        if ((i12 & 8) != 0) {
            lVar4 = new C30348g(lVar);
        }
        Y41.l lVar7 = lVar4;
        if ((i12 & 16) != 0) {
            printableText = null;
        }
        e(apiError, lVar, lVar5, lVar6, lVar7, printableText);
    }

    public static /* synthetic */ void h(Throwable th2, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, int i12) {
        if ((i12 & 2) != 0) {
            lVar2 = new C30342a(lVar);
        }
        Y41.l lVar4 = lVar2;
        if ((i12 & 4) != 0) {
            lVar3 = new C30343b(lVar);
        }
        f(th2, lVar, lVar4, lVar3, new C30344c(lVar), new C30345d(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final String i(@Y61.k ApiError apiError) {
        Map<String, String> mapC;
        Collection<String> collectionValues;
        String message = apiError.getF244063c();
        if (message == null) {
            com.avito.android.remote.error.r rVar = apiError instanceof com.avito.android.remote.error.r ? (com.avito.android.remote.error.r) apiError : null;
            message = (rVar == null || (mapC = rVar.c()) == null || (collectionValues = mapC.values()) == null) ? null : (String) C42745f0.F(collectionValues);
        }
        if (message == null || message.length() <= 0) {
            return null;
        }
        return message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final String j(@Y61.k Throwable th2) {
        boolean z12;
        String strI;
        ApiError apiErrorM = m(th2);
        if (apiErrorM != null && (strI = i(apiErrorM)) != null) {
            return strI;
        }
        while (true) {
            z12 = th2 instanceof com.avito.android.remote.error.n;
            if (z12 || th2 == 0) {
                break;
            }
            th2 = th2.getCause();
        }
        com.avito.android.remote.error.n nVar = z12 ? (com.avito.android.remote.error.n) th2 : null;
        Error error = nVar != null ? nVar.getF318631d() : null;
        if (error != null) {
            return error.getOneMessage();
        }
        return null;
    }

    @Y61.k
    public static final String k(@Y61.k ApiError apiError) {
        String strI = i(apiError);
        return strI == null ? c() : strI;
    }

    @Y61.k
    public static final String l(@Y61.l Throwable th2) {
        String strJ;
        return (th2 == null || (strJ = j(th2)) == null) ? c() : strJ;
    }

    @Y61.l
    public static final ApiError m(@Y61.k Throwable th2) {
        boolean z12;
        while (true) {
            z12 = th2 instanceof ApiException;
            if (z12 || th2 == null) {
                break;
            }
            th2 = th2.getCause();
        }
        ApiException apiException = z12 ? (ApiException) th2 : null;
        if (apiException != null) {
            return apiException.f318522b;
        }
        return null;
    }

    @Y61.k
    public static final ApiError n(@Y61.k Throwable th2) {
        ApiError apiErrorM = m(th2);
        return apiErrorM == null ? new ApiError.UnknownError(c(), "", th2) : apiErrorM;
    }

    public static void o(TypedResult typedResult, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, int i12) {
        C30352k c30352k = new C30352k(lVar2);
        if ((i12 & 8) != 0) {
            lVar3 = new C30353l(lVar2);
        }
        Y41.l lVar4 = lVar3;
        C30354m c30354m = new C30354m(lVar2);
        if (typedResult instanceof TypedResult.Success) {
            lVar.invoke(((TypedResult.Success) typedResult).getResult());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            e(((TypedResult.Error) typedResult).getError(), lVar2, c30352k, lVar4, c30354m, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T p(@Y61.k ApiError apiError, @Y61.k Y41.l<? super String, ? extends T> lVar, @Y61.k Y41.l<? super Map<String, String>, ? extends T> lVar2, @Y61.k Y41.l<? super String, ? extends T> lVar3, @Y61.k Y41.l<? super String, ? extends T> lVar4, @Y61.l PrintableText printableText) {
        return apiError instanceof ApiError.Unauthorized ? lVar3.invoke(d(((ApiError.Unauthorized) apiError).getF244063c(), printableText)) : apiError instanceof ApiError.NetworkIOError ? lVar4.invoke(t(((ApiError.NetworkIOError) apiError).getF244063c())) : apiError instanceof com.avito.android.remote.error.r ? lVar2.invoke(((com.avito.android.remote.error.r) apiError).c()) : lVar.invoke(d(apiError.getF244063c(), printableText));
    }

    public static /* synthetic */ Object q(ApiError apiError, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, PrintableText printableText, int i12) {
        if ((i12 & 2) != 0) {
            lVar2 = new C30355n(lVar);
        }
        Y41.l lVar4 = lVar2;
        if ((i12 & 4) != 0) {
            lVar3 = new C30356o(lVar);
        }
        Y41.l lVar5 = lVar3;
        C30357p c30357p = new C30357p(lVar);
        if ((i12 & 16) != 0) {
            printableText = null;
        }
        return p(apiError, lVar, lVar4, lVar5, c30357p, printableText);
    }

    public static Object r(TypedResult typedResult, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, PrintableText printableText, int i12) {
        if ((i12 & 4) != 0) {
            lVar3 = new C30360t(lVar2);
        }
        Y41.l lVar4 = lVar3;
        C30361u c30361u = new C30361u(lVar2);
        v vVar = new v(lVar2);
        if ((i12 & 32) != 0) {
            printableText = null;
        }
        PrintableText printableText2 = printableText;
        if (typedResult instanceof TypedResult.Success) {
            return lVar.invoke(((TypedResult.Success) typedResult).getResult());
        }
        if (typedResult instanceof TypedResult.Error) {
            return p(((TypedResult.Error) typedResult).getError(), lVar2, lVar4, c30361u, vVar, printableText2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Object s(TypedResult typedResult, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, PrintableText printableText, Continuation continuation, int i12) {
        if ((i12 & 4) != 0) {
            pVar3 = new w(pVar2, null);
        }
        x xVar = new x(pVar2, null);
        y yVar = new y(pVar2, null);
        if ((i12 & 32) != 0) {
            printableText = null;
        }
        if (typedResult instanceof TypedResult.Success) {
            return pVar.invoke(((TypedResult.Success) typedResult).getResult(), continuation);
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.remote.error.q error = ((TypedResult.Error) typedResult).getError();
        return error instanceof ApiError.Unauthorized ? xVar.invoke(d(((ApiError.Unauthorized) error).getF244063c(), printableText), continuation) : error instanceof ApiError.NetworkIOError ? yVar.invoke(t(((ApiError.NetworkIOError) error).getF244063c()), continuation) : error instanceof com.avito.android.remote.error.r ? pVar3.invoke(((com.avito.android.remote.error.r) error).c(), continuation) : pVar2.invoke(d(error.getF244063c(), printableText), continuation);
    }

    public static final String t(String str) {
        if (str == null || C43066x.K(str)) {
            str = null;
        }
        return str == null ? b() : str;
    }

    public static io.reactivex.rxjava3.internal.observers.m u(io.reactivex.rxjava3.core.I i12, Y41.l lVar, Y41.l lVar2) {
        return (io.reactivex.rxjava3.internal.observers.m) i12.x(new a(lVar), new K(lVar2, new G(lVar2), new H(lVar2), new I(lVar2), new J(lVar2)));
    }
}
