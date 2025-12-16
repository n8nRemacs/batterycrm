package com.avito.avcalls.stats;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.json.C43446d;

/* compiled from: StatsReportMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/d;", "Lcom/avito/avcalls/stats/c;", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* compiled from: StatsReportMapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/d;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/json/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<C43446d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f333647l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43446d c43446d) {
            c43446d.f412965b = false;
            return G0.f406611a;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 com.avito.avcalls.stats.StatsReport, still in use, count: 4, list:
          (r10v0 com.avito.avcalls.stats.StatsReport) from 0x024e: MOVE (r49v0 com.avito.avcalls.stats.StatsReport) = (r10v0 com.avito.avcalls.stats.StatsReport)
          (r10v0 com.avito.avcalls.stats.StatsReport) from 0x0107: MOVE (r49v2 com.avito.avcalls.stats.StatsReport) = (r10v0 com.avito.avcalls.stats.StatsReport)
          (r10v0 com.avito.avcalls.stats.StatsReport) from 0x0102: MOVE (r49v4 com.avito.avcalls.stats.StatsReport) = (r10v0 com.avito.avcalls.stats.StatsReport)
          (r10v0 com.avito.avcalls.stats.StatsReport) from 0x0040: MOVE (r49v6 com.avito.avcalls.stats.StatsReport) = (r10v0 com.avito.avcalls.stats.StatsReport)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final java.lang.String a(long r106, long r108, @Y61.k com.avito.avcalls.stats.a r110) {
        /*
            Method dump skipped, instructions count: 2699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.stats.d.a(long, long, com.avito.avcalls.stats.a):java.lang.String");
    }
}
