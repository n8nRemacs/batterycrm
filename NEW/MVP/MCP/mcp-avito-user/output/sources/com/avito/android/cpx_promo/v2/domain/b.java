package com.avito.android.cpx_promo.v2.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import as.C24169a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get.OkRespDataSuccessAutoBudgetValuesItem;
import com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get.OkRespDataSuccessBidSelector;
import com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get.TriggerData;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2TriggerData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import cs.InterfaceC39404a;
import ds.C39797e;
import ds.C39798f;
import ds.s;
import ds.t;
import ds.u;
import gs.InterfaceC40725a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import js.C42419a;
import js.C42420b;
import js.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wZ.k;

/* compiled from: CpxPromoV2Interactor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/domain/b;", "Lcom/avito/android/cpx_promo/v2/domain/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.cpx_promo.v2.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40725a f127453a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC39404a f127454b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f127455c;

    /* compiled from: CpxPromoV2Interactor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127456a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f127457b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f127458c;

        static {
            int[] iArr = new int[OkRespDataSuccessBidSelector.SelectedType.values().length];
            try {
                iArr[OkRespDataSuccessBidSelector.SelectedType.Auto.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkRespDataSuccessBidSelector.SelectedType.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127456a = iArr;
            int[] iArr2 = new int[TriggerData.Color.values().length];
            try {
                iArr2[TriggerData.Color.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TriggerData.Color.Yellow.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TriggerData.Color.Red.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TriggerData.Color.Grey.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f127457b = iArr2;
            int[] iArr3 = new int[OkRespDataSuccessAutoBudgetValuesItem.Id.values().length];
            try {
                iArr3[OkRespDataSuccessAutoBudgetValuesItem.Id.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OkRespDataSuccessAutoBudgetValuesItem.Id.Week.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OkRespDataSuccessAutoBudgetValuesItem.Id.Month.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f127458c = iArr3;
        }
    }

    @Inject
    public b(@k InterfaceC40725a interfaceC40725a, @k InterfaceC39404a interfaceC39404a, @k InterfaceC28373a interfaceC28373a) {
        this.f127453a = interfaceC40725a;
        this.f127454b = interfaceC39404a;
        this.f127455c = interfaceC28373a;
    }

    public static CpxPromoV2.Auto.Budget.Value.BudgetId e(OkRespDataSuccessAutoBudgetValuesItem.Id id2) {
        int i12 = a.f127458c[id2.ordinal()];
        if (i12 == 1) {
            return CpxPromoV2.Auto.Budget.Value.BudgetId.f127498c;
        }
        if (i12 == 2) {
            return CpxPromoV2.Auto.Budget.Value.BudgetId.f127499d;
        }
        if (i12 == 3) {
            return CpxPromoV2.Auto.Budget.Value.BudgetId.f127500e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static C42419a.C11586a f(C39797e c39797e) {
        String name = c39797e.getName();
        DeepLink uri = c39797e.getUri();
        k.a aVar = wZ.k.f441571d;
        String valueName = c39797e.getColor().getValueName();
        String value = c39797e.getColor().getValue();
        String valueDark = c39797e.getColor().getValueDark();
        aVar.getClass();
        return new C42419a.C11586a(name, k.a.b(valueName, value, valueDark), uri);
    }

    public static C42420b g(C39798f c39798f) {
        return new C42420b(c39798f.getTitle(), c39798f.getDeeplink(), c39798f.getInputTitle(), c39798f.getDescription(), c39798f.getButtonTitle(), c39798f.getPlaceholder(), c39798f.getMinError(), c39798f.getMaxError());
    }

    public static js.c h(s sVar) {
        C42419a c42419a;
        Iterator it;
        CpxPromoV2TriggerData cpxPromoV2TriggerData;
        CpxPromoV2TriggerData.Color color;
        t title = sVar.getTitle();
        if (title != null) {
            AttributedText text = title.getText();
            C39797e icon = title.getIcon();
            c42419a = new C42419a(text, icon != null ? f(icon) : null);
        } else {
            c42419a = null;
        }
        Long selectedValue = sVar.getSelectedValue();
        long minInput = sVar.getMinInput();
        long maxInput = sVar.getMaxInput();
        List<u> listG = sVar.g();
        ArrayList arrayList = new ArrayList(C42745f0.q(listG, 10));
        Iterator it2 = listG.iterator();
        while (it2.hasNext()) {
            u uVar = (u) it2.next();
            long value = uVar.getValue();
            String input = uVar.getInput();
            String description = uVar.getDescription();
            String color2 = uVar.getColor();
            String info = uVar.getInfo();
            TriggerData triggerData = uVar.getTriggerData();
            if (triggerData != null) {
                String title2 = triggerData.getTitle();
                String description2 = triggerData.getDescription();
                int i12 = a.f127457b[triggerData.getColor().ordinal()];
                it = it2;
                if (i12 == 1) {
                    color = CpxPromoV2TriggerData.Color.f127537d;
                } else if (i12 == 2) {
                    color = CpxPromoV2TriggerData.Color.f127538e;
                } else if (i12 == 3) {
                    color = CpxPromoV2TriggerData.Color.f127539f;
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    color = CpxPromoV2TriggerData.Color.f127540g;
                }
                cpxPromoV2TriggerData = new CpxPromoV2TriggerData(title2, description2, color);
            } else {
                it = it2;
                cpxPromoV2TriggerData = null;
            }
            arrayList.add(new c.a(value, input, description, color2, info, cpxPromoV2TriggerData));
            it2 = it;
        }
        return new js.c(c42419a, selectedValue, minInput, maxInput, arrayList, g(sVar.getInputSheet()), sVar.getPlaceholder());
    }

    public static TypedResult i(TypedResult typedResult) {
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
    @Override // com.avito.android.cpx_promo.v2.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r8, long r9, @Y61.k java.lang.String r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.cpx_promo.v2.domain.e
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.cpx_promo.v2.domain.e r0 = (com.avito.android.cpx_promo.v2.domain.e) r0
            int r1 = r0.f127471t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f127471t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.cpx_promo.v2.domain.e r0 = new com.avito.android.cpx_promo.v2.domain.e
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f127469r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f127471t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.cpx_promo.v2.domain.b r8 = r6.f127468q
            kotlin.C42729a0.b(r12)
            goto L49
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            r6.f127468q = r7
            r6.f127471t = r2
            gs.a r1 = r7.f127453a
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
            com.avito.android.remote.model.TypedResult r8 = i(r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.domain.b.a(java.lang.String, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.cpx_promo.v2.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r31, @Y61.k java.lang.String r32, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.domain.b.b(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.cpx_promo.v2.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r8, long r9, @Y61.l java.lang.Long r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.cpx_promo.v2.domain.f
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.cpx_promo.v2.domain.f r0 = (com.avito.android.cpx_promo.v2.domain.f) r0
            int r1 = r0.f127475t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f127475t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.cpx_promo.v2.domain.f r0 = new com.avito.android.cpx_promo.v2.domain.f
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f127473r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f127475t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.cpx_promo.v2.domain.b r8 = r6.f127472q
            kotlin.C42729a0.b(r12)
            goto L49
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            r6.f127472q = r7
            r6.f127475t = r2
            gs.a r1 = r7.f127453a
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
            com.avito.android.remote.model.TypedResult r8 = i(r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.domain.b.c(java.lang.String, long, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.cpx_promo.v2.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.cpx_promo.v2.domain.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.cpx_promo.v2.domain.d r0 = (com.avito.android.cpx_promo.v2.domain.d) r0
            int r1 = r0.f127467t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127467t = r1
            goto L18
        L13:
            com.avito.android.cpx_promo.v2.domain.d r0 = new com.avito.android.cpx_promo.v2.domain.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f127465r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f127467t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.cpx_promo.v2.domain.b r5 = r0.f127464q
            kotlin.C42729a0.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            r0.f127464q = r4
            r0.f127467t = r3
            gs.a r6 = r4.f127453a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            r5.getClass()
            com.avito.android.remote.model.TypedResult r5 = i(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.domain.b.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
