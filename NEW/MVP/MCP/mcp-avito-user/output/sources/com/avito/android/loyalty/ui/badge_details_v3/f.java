package com.avito.android.loyalty.ui.badge_details_v3;

import androidx.compose.runtime.internal.P;
import bX.InterfaceC25576a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BadgeDetailsV3Interactor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/f;", "Lcom/avito/android/loyalty/ui/badge_details_v3/e;", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f183290b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25576a f183291a;

    /* compiled from: BadgeDetailsV3Interactor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/f$a;", "", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static LinkedHashMap a(@Y61.k String str) {
            List listF0 = C43066x.f0(str, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6);
            int iF2 = P0.f(C42745f0.q(listF0, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                List listF02 = C43066x.f0((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6);
                linkedHashMap.put((String) listF02.get(0), (String) listF02.get(1));
            }
            return linkedHashMap;
        }

        public a() {
        }
    }

    @Inject
    public f(@Y61.k InterfaceC25576a interfaceC25576a) {
        this.f183291a = interfaceC25576a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.loyalty.ui.badge_details_v3.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.loyalty.ui.badge_details_v3.g
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.loyalty.ui.badge_details_v3.g r0 = (com.avito.android.loyalty.ui.badge_details_v3.g) r0
            int r1 = r0.f183294s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f183294s = r1
            goto L18
        L13:
            com.avito.android.loyalty.ui.badge_details_v3.g r0 = new com.avito.android.loyalty.ui.badge_details_v3.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f183292q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f183294s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            com.avito.android.loyalty.ui.badge_details_v3.f$a r6 = com.avito.android.loyalty.ui.badge_details_v3.f.f183290b
            r6.getClass()
            java.util.LinkedHashMap r5 = com.avito.android.loyalty.ui.badge_details_v3.f.a.a(r5)
            r0.f183294s = r3
            bX.a r6 = r4.f183291a
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L5c
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            cX.b r5 = (cX.C27116b) r5
            com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction$Loaded r6 = new com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction$Loaded
            r6.<init>(r5)
            goto L6f
        L5c:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L70
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.C35936s.a(r5, r6)
            com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction$Error r6 = com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction.Error.f183336b
        L6f:
            return r6
        L70:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty.ui.badge_details_v3.f.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
