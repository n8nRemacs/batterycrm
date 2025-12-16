package com.avito.android.loyalty_program.loyalty_entry_view.utils;

import KV.a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.paranja.ParanjaState;
import com.avito.android.paranja.f;
import com.avito.android.paranja.g;
import com.avito.android.paranja.h;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LoyaltyParanjaOnboarding.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_loyalty-program_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: LoyaltyParanjaOnboarding.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.loyalty_program.loyalty_entry_view.utils.a$a, reason: collision with other inner class name */
    public static final class C5400a extends N implements l<ParanjaState.ClickPosition, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f184189l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f184190m;

        /* compiled from: LoyaltyParanjaOnboarding.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty_program.loyalty_entry_view.utils.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C5401a {
            static {
                int[] iArr = new int[ParanjaState.ClickPosition.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition = ParanjaState.ClickPosition.f210848b;
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition2 = ParanjaState.ClickPosition.f210848b;
                    iArr[4] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition3 = ParanjaState.ClickPosition.f210848b;
                    iArr[1] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition4 = ParanjaState.ClickPosition.f210848b;
                    iArr[2] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5400a(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            super(1);
            this.f184189l = aVar;
            this.f184190m = aVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.paranja.ParanjaState.ClickPosition r3) {
            /*
                r2 = this;
                com.avito.android.paranja.ParanjaState$ClickPosition r3 = (com.avito.android.paranja.ParanjaState.ClickPosition) r3
                int r3 = r3.ordinal()
                Y41.a<kotlin.G0> r0 = r2.f184189l
                if (r3 == 0) goto L1d
                r1 = 1
                if (r3 == r1) goto L14
                r1 = 3
                if (r3 == r1) goto L1d
                r1 = 4
                if (r3 == r1) goto L14
                goto L20
            L14:
                r0.invoke()
                Y41.a<kotlin.G0> r3 = r2.f184190m
                r3.invoke()
                goto L20
            L1d:
                r0.invoke()
            L20:
                kotlin.G0 r3 = kotlin.G0.f406611a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty_program.loyalty_entry_view.utils.a.C5400a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoyaltyParanjaOnboarding.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f184191l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f184192m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, Y41.a<G0> aVar) {
            super(0);
            this.f184191l = hVar;
            this.f184192m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f184191l.setState(new ParanjaState(ParanjaState.State.f210856c, null, null, 6, null));
            this.f184192m.invoke();
            return G0.f406611a;
        }
    }

    public static final void a(@k View view, @k Onboarding onboarding, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3, int i12) {
        h hVar = new h(view);
        b bVar = new b(hVar, aVar2);
        Context context = view.getContext();
        int iB2 = y6.b(6);
        f.a aVar4 = new f.a(iB2, iB2, iB2, iB2);
        float fB2 = y6.b(100);
        int color = context.getColor(R.color.overlayBackground);
        a.C0572a c0572a = KV.a.f9464v;
        int iJ2 = C35835l0.j(R.attr.tooltipInverse, context);
        c0572a.getClass();
        hVar.setStyle(new f(aVar4, color, fB2, KV.a.a(a.C0572a.b(iJ2, context), i12 - y6.b(40), 0, 0, 2097150)));
        hVar.setState(new ParanjaState(ParanjaState.State.f210855b, new C5400a(bVar, aVar3), new g(new r.a(new i.a(new b.a())), false, onboarding.getTitle(), onboarding.getDescription(), onboarding.getButtonTitle(), null, null, null, true, 224, null)));
        aVar.invoke();
    }
}
