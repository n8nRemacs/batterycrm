package com.avito.android.comfortable_deal.deal.mvi;

import Dp.InterfaceC13428a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.TeamRole;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DealReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/D;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "LEp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class D implements com.avito.android.arch.mvi.u<DealInternalAction, Ep.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13428a f121571b;

    /* compiled from: DealReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121572a;

        static {
            int[] iArr = new int[TeamRole.values().length];
            try {
                iArr[TeamRole.Agent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TeamRole.HeadAgent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121572a = iArr;
        }
    }

    @Inject
    public D(@Y61.k InterfaceC13428a interfaceC13428a) {
        this.f121571b = interfaceC13428a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ep.c a(com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction r22, Ep.c r23) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.mvi.D.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
