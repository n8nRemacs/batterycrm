package Fc1;

import feedback.shared.sdk.api.network.entities.Targeting;
import feedback.shared.sdk.api.network.entities.TriggerTargeting;
import i31.InterfaceC41220a;
import java.util.Map;
import javax.inject.Named;

/* loaded from: classes9.dex */
public final class U {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f5200f = {kotlin.jvm.internal.m0.f406844a.e(new kotlin.jvm.internal.Y(U.class, "startDelayTimer", "getStartDelayTimer()Lorg/joda/time/DateTime;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Targeting f5201a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13753v4 f5202b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C13611f5 f5203c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, Integer> f5204d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C13760w2 f5205e = new C13760w2();

    @i31.c
    public U(@InterfaceC41220a @Y61.k Targeting targeting, @Y61.k InterfaceC13753v4 interfaceC13753v4, @Y61.k C13611f5 c13611f5, @Y61.k @Named("StartEventCounts") Map<String, Integer> map) {
        this.f5201a = targeting;
        this.f5202b = interfaceC13753v4;
        this.f5203c = c13611f5;
        this.f5204d = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Fc1.T
            if (r0 == 0) goto L13
            r0 = r8
            Fc1.T r0 = (Fc1.T) r0
            int r1 = r0.f5185t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5185t = r1
            goto L18
        L13:
            Fc1.T r0 = new Fc1.T
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f5183r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5185t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Fc1.U r0 = r0.f5182q
            kotlin.C42729a0.b(r8)
            goto L77
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            feedback.shared.sdk.api.network.entities.Targeting r8 = r7.f5201a
            feedback.shared.sdk.api.network.entities.TriggerTargeting r8 = r8.getTrigger()
            if (r8 == 0) goto L49
            java.lang.Integer r8 = r8.getSeconds()
            if (r8 == 0) goto L49
            int r8 = r8.intValue()
            goto L4c
        L49:
            int r8 = kotlin.jvm.internal.J.f406821a
            r8 = r3
        L4c:
            int r2 = kotlin.jvm.internal.J.f406821a
            if (r8 <= r3) goto L76
            Fc1.f5 r2 = r7.f5203c
            xyz.n.a.j2 r4 = xyz.n.a.j2.CAMPAIGN_START_WITH_DELAY
            java.lang.String r5 = r7.b()
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r2.c(r4, r5)
            kotlin.time.e$a r2 = kotlin.time.e.f410651c
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.f410634f
            long r4 = kotlin.time.g.g(r8, r2)
            r0.f5182q = r7
            r0.f5185t = r3
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.c(r4, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            r0 = r7
        L77:
            java.util.Map<java.lang.String, java.lang.Integer> r8 = r0.f5204d
            java.lang.String r1 = r0.b()
            feedback.shared.sdk.api.network.entities.Targeting r2 = r0.f5201a
            feedback.shared.sdk.api.network.entities.TriggerTargeting r2 = r2.getTrigger()
            r4 = 0
            if (r2 == 0) goto L8b
            int r2 = r2.getCounts()
            goto L8e
        L8b:
            int r2 = kotlin.jvm.internal.J.f406821a
            r2 = r4
        L8e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.put(r1, r2)
            feedback.shared.sdk.api.network.entities.Targeting r8 = r0.f5201a
            feedback.shared.sdk.api.network.entities.TriggerTargeting r8 = r8.getTrigger()
            if (r8 == 0) goto La4
            boolean r8 = r8.isMultiVisited()
            if (r8 != r3) goto La4
            goto Ld0
        La4:
            org.joda.time.c r8 = new org.joda.time.c
            r8.<init>()
            Fc1.w2 r0 = r0.f5205e
            kotlin.reflect.n<java.lang.Object>[] r1 = Fc1.U.f5200f
            r1 = r1[r4]
            r0.getClass()
            r0.f5870b = r8
            Fc1.S5 r0 = r0.f5869a
            if (r0 == 0) goto Lb9
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            kotlin.C r0 = r0.f5178b
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r1 = r8.f420462b
            java.lang.String r8 = "FEEDBACK_START_GLOBAL_TIMER"
            r0.putLong(r8, r1)
            r0.apply()
        Ld0:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.U.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String b() {
        String value;
        TriggerTargeting trigger = this.f5201a.getTrigger();
        if (trigger != null && (value = trigger.getValue()) != null) {
            return value;
        }
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        return "";
    }
}
