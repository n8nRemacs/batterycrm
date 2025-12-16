package com.avito.android.cpx_promo.impl.interactor;

import Y61.k;
import androidx.compose.runtime.internal.P;
import as.C24169a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.impl.interactor.model.AttributedTextWithIcon;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoInputSheet;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoSlider;
import com.avito.android.cpx_promo.impl.network.response.CpxPromoBidSelectorResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.TypedResultKt;
import com.avito.android.remote.model.text.AttributedText;
import gs.InterfaceC40725a;
import hs.C40975a;
import hs.C40976b;
import hs.e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CpxPromoInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/b;", "Lcom/avito/android/cpx_promo/impl/interactor/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.cpx_promo.impl.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40725a f126973a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f126974b;

    /* compiled from: CpxPromoInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126975a;

        static {
            int[] iArr = new int[CpxPromoBidSelectorResponse.Type.values().length];
            try {
                iArr[CpxPromoBidSelectorResponse.Type.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CpxPromoBidSelectorResponse.Type.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f126975a = iArr;
        }
    }

    @Inject
    public b(@k InterfaceC40725a interfaceC40725a, @k InterfaceC28373a interfaceC28373a) {
        this.f126973a = interfaceC40725a;
        this.f126974b = interfaceC28373a;
    }

    public static AttributedTextWithIcon e(C40975a c40975a) {
        AttributedText text = c40975a.getText();
        C40975a.C11278a icon = c40975a.getIcon();
        return new AttributedTextWithIcon(text, icon != null ? new AttributedTextWithIcon.ClickableIcon(icon.getName(), icon.getColor(), icon.getDeepLink()) : null);
    }

    public static TypedResult f(C40976b c40976b, String str, boolean z12) {
        return c40976b == null ? z12 ? new TypedResult.Success(null) : i(str) : c40976b.getTitle() == null ? i(str.concat(".title")) : c40976b.getUri() == null ? i(str.concat(".uri")) : new TypedResult.Success(new CpxPromoButton(c40976b.getTitle(), c40976b.getUri()));
    }

    public static TypedResult g(hs.c cVar, String str) {
        if (cVar == null) {
            return i(str);
        }
        if (cVar.getTitle() == null) {
            return i(str + ".title");
        }
        C40976b primaryButton = cVar.getPrimaryButton();
        if (primaryButton == null || primaryButton.getTitle() == null) {
            return i(str + ".primaryButton.title");
        }
        if (cVar.getDeeplink() == null) {
            return i(str + ".deeplink");
        }
        return TypedResultKt.toTyped(new CpxPromoInputSheet(cVar.getTitle(), cVar.getDeeplink(), cVar.getInputTitle(), cVar.getDescription(), cVar.getPrimaryButton().getTitle(), cVar.getPlaceholder(), cVar.getMinError(), cVar.getMaxError()));
    }

    public static TypedResult h(hs.e eVar, String str) {
        TypedResult typedResultI;
        if (eVar == null) {
            return i(str);
        }
        if (eVar.getMinInput() == null) {
            return i(str + ".minInput");
        }
        if (eVar.getMaxInput() == null) {
            return i(str + ".maxInput");
        }
        List<e.a> listF = eVar.f();
        if (listF != null) {
            if (listF.isEmpty()) {
                listF = null;
            }
            if (listF != null) {
                TypedResult typedResultG = g(eVar.getInputSheet(), str + ".inputSheet");
                C40975a title = eVar.getTitle();
                AttributedTextWithIcon attributedTextWithIconE = title != null ? e(title) : null;
                Long selectedValue = eVar.getSelectedValue();
                long jLongValue = eVar.getMinInput().longValue();
                long jLongValue2 = eVar.getMaxInput().longValue();
                List<e.a> listF2 = eVar.f();
                ArrayList arrayList = new ArrayList(C42745f0.q(listF2, 10));
                int i12 = 0;
                for (Object obj : listF2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    e.a aVar = (e.a) obj;
                    String str2 = str + ".values[" + i12 + ']';
                    if (aVar.getValue() == null) {
                        typedResultI = i(str2 + ".value");
                    } else if (aVar.getColor() == null) {
                        typedResultI = i(str2 + ".color");
                    } else if (aVar.getInput() == null) {
                        typedResultI = i(str2 + ".input");
                    } else {
                        typedResultI = TypedResultKt.toTyped(new CpxPromoSlider.Value(aVar.getValue().longValue(), aVar.getInput(), aVar.getDescription(), aVar.getColor(), aVar.getInfo(), aVar.getForecast()));
                    }
                    CpxPromoSlider.Value value = (CpxPromoSlider.Value) j(typedResultI);
                    if (value == null) {
                        return k(typedResultI);
                    }
                    arrayList.add(value);
                    i12 = i13;
                }
                CpxPromoInputSheet cpxPromoInputSheet = (CpxPromoInputSheet) j(typedResultG);
                return cpxPromoInputSheet == null ? k(typedResultG) : TypedResultKt.toTyped(new CpxPromoSlider(attributedTextWithIconE, selectedValue, jLongValue, jLongValue2, arrayList, cpxPromoInputSheet));
            }
        }
        return i(str + ".values");
    }

    public static TypedResult.Error i(String str) {
        return new TypedResult.Error(new CpxPromoResponseError(AK.c.k("Поле ", str, " отсутствует")), null, 2, null);
    }

    public static Object j(TypedResult typedResult) {
        if (typedResult instanceof TypedResult.Success) {
            return ((TypedResult.Success) typedResult).getResult();
        }
        return null;
    }

    public static TypedResult.Error k(TypedResult typedResult) {
        return typedResult instanceof TypedResult.Error ? new TypedResult.Error(((TypedResult.Error) typedResult).getError(), null, 2, null) : new TypedResult.Error(new ApiError.Custom(null, 1, null), null, 2, null);
    }

    public static TypedResult l(TypedResult typedResult) {
        if (typedResult instanceof TypedResult.Error) {
            TypedResult.Error error = (TypedResult.Error) typedResult;
            return new TypedResult.Error(error.getError(), error.getCause());
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        return new TypedResult.Success(new C24169a(((hs.f) success.getResult()).getDeepLink(), ((hs.f) success.getResult()).getMessage()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.cpx_promo.impl.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r8, long r9, @Y61.k java.lang.String r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.cpx_promo.impl.interactor.e
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.cpx_promo.impl.interactor.e r0 = (com.avito.android.cpx_promo.impl.interactor.e) r0
            int r1 = r0.f126988t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f126988t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.cpx_promo.impl.interactor.e r0 = new com.avito.android.cpx_promo.impl.interactor.e
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f126986r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f126988t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.cpx_promo.impl.interactor.b r8 = r6.f126985q
            kotlin.C42729a0.b(r12)
            goto L49
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            r6.f126985q = r7
            r6.f126988t = r2
            gs.a r1 = r7.f126973a
            r2 = r8
            r3 = r9
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r5, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            r8 = r7
        L49:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            r8.getClass()
            com.avito.android.remote.model.TypedResult r8 = l(r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.interactor.b.a(java.lang.String, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037f A[LOOP:0: B:135:0x02e7->B:153:0x037f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.cpx_promo.impl.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r27, @Y61.k java.lang.String r28, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.interactor.b.b(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.cpx_promo.impl.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r8, long r9, @Y61.l java.lang.Long r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.cpx_promo.impl.interactor.f
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.cpx_promo.impl.interactor.f r0 = (com.avito.android.cpx_promo.impl.interactor.f) r0
            int r1 = r0.f126992t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f126992t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.cpx_promo.impl.interactor.f r0 = new com.avito.android.cpx_promo.impl.interactor.f
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f126990r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f126992t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.cpx_promo.impl.interactor.b r8 = r6.f126989q
            kotlin.C42729a0.b(r12)
            goto L49
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            r6.f126989q = r7
            r6.f126992t = r2
            gs.a r1 = r7.f126973a
            r2 = r8
            r3 = r9
            r5 = r11
            java.lang.Object r12 = r1.d(r2, r3, r5, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            r8 = r7
        L49:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            r8.getClass()
            com.avito.android.remote.model.TypedResult r8 = l(r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.interactor.b.c(java.lang.String, long, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.cpx_promo.impl.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.cpx_promo.impl.interactor.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.cpx_promo.impl.interactor.d r0 = (com.avito.android.cpx_promo.impl.interactor.d) r0
            int r1 = r0.f126984t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126984t = r1
            goto L18
        L13:
            com.avito.android.cpx_promo.impl.interactor.d r0 = new com.avito.android.cpx_promo.impl.interactor.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f126982r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f126984t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.cpx_promo.impl.interactor.b r5 = r0.f126981q
            kotlin.C42729a0.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            r0.f126981q = r4
            r0.f126984t = r3
            gs.a r6 = r4.f126973a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            r5.getClass()
            com.avito.android.remote.model.TypedResult r5 = l(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.interactor.b.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
