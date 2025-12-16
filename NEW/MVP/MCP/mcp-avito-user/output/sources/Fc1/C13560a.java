package Fc1;

import feedback.shared.sdk.api.network.entities.AttributeRule;
import feedback.shared.sdk.api.network.entities.Campaign;
import i31.InterfaceC41220a;
import java.util.List;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13560a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Campaign> f5363a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13682n4 f5364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C13607f1 f5365c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C13611f5 f5366d;

    /* renamed from: Fc1.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0296a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5367a;

        static {
            int[] iArr = new int[AttributeRule.values().length];
            try {
                iArr[AttributeRule.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttributeRule.CONTAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttributeRule.NUMBER_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttributeRule.DATE_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AttributeRule.LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5367a = iArr;
        }
    }

    @i31.c
    public C13560a(@InterfaceC41220a @Y61.k List list, @InterfaceC41220a @Y61.k C13682n4 c13682n4, @Y61.k C13607f1 c13607f1, @Y61.k C13611f5 c13611f5) {
        this.f5363a = list;
        this.f5364b = c13682n4;
        this.f5365c = c13607f1;
        this.f5366d = c13611f5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:233:0x043b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:54:0x0120, B:46:0x0103], limit reached: 288 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200 A[Catch: Exception -> 0x0338, TryCatch #7 {Exception -> 0x0338, blocks: (B:96:0x01d0, B:98:0x01d6, B:108:0x01fa, B:110:0x0200, B:112:0x020d, B:114:0x0219, B:116:0x021d, B:118:0x0227, B:120:0x022d, B:117:0x0220, B:124:0x0236, B:125:0x023b, B:95:0x01cd, B:103:0x01e2, B:104:0x01ea, B:130:0x0243, B:132:0x0250, B:134:0x0260, B:136:0x0264, B:137:0x026c, B:139:0x0270, B:140:0x0277, B:142:0x027b, B:143:0x0283, B:145:0x0287, B:152:0x0299, B:154:0x029f, B:156:0x02af, B:158:0x02b3, B:159:0x02bb, B:161:0x02bf, B:162:0x02c6, B:164:0x02ca, B:165:0x02d2, B:167:0x02d6, B:177:0x02f1, B:179:0x0304, B:181:0x0308, B:182:0x0318, B:184:0x032b), top: B:263:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029f A[Catch: Exception -> 0x0338, TryCatch #7 {Exception -> 0x0338, blocks: (B:96:0x01d0, B:98:0x01d6, B:108:0x01fa, B:110:0x0200, B:112:0x020d, B:114:0x0219, B:116:0x021d, B:118:0x0227, B:120:0x022d, B:117:0x0220, B:124:0x0236, B:125:0x023b, B:95:0x01cd, B:103:0x01e2, B:104:0x01ea, B:130:0x0243, B:132:0x0250, B:134:0x0260, B:136:0x0264, B:137:0x026c, B:139:0x0270, B:140:0x0277, B:142:0x027b, B:143:0x0283, B:145:0x0287, B:152:0x0299, B:154:0x029f, B:156:0x02af, B:158:0x02b3, B:159:0x02bb, B:161:0x02bf, B:162:0x02c6, B:164:0x02ca, B:165:0x02d2, B:167:0x02d6, B:177:0x02f1, B:179:0x0304, B:181:0x0308, B:182:0x0318, B:184:0x032b), top: B:263:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0338 A[PHI: r14 r17 r18 r19
  0x0338: PHI (r14v6 java.lang.Object) = 
  (r14v7 java.lang.Object)
  (r14v9 java.lang.Object)
  (r14v11 java.lang.Object)
  (r14v11 java.lang.Object)
  (r14v13 java.lang.Object)
  (r14v13 java.lang.Object)
  (r14v18 java.lang.Object)
  (r14v18 java.lang.Object)
  (r14v20 java.lang.Object)
  (r14v21 java.lang.Object)
  (r14v28 java.lang.Object)
 binds: [B:76:0x017e, B:183:0x0329, B:178:0x0302, B:180:0x0306, B:174:0x02eb, B:175:0x02ed, B:127:0x023d, B:128:0x023f, B:105:0x01eb, B:92:0x01be, B:245:0x0338] A[DONT_GENERATE, DONT_INLINE]
  0x0338: PHI (r17v1 java.util.Iterator) = 
  (r17v2 java.util.Iterator)
  (r17v3 java.util.Iterator)
  (r17v4 java.util.Iterator)
  (r17v4 java.util.Iterator)
  (r17v5 java.util.Iterator)
  (r17v5 java.util.Iterator)
  (r17v8 java.util.Iterator)
  (r17v8 java.util.Iterator)
  (r17v10 java.util.Iterator)
  (r17v10 java.util.Iterator)
  (r17v10 java.util.Iterator)
 binds: [B:76:0x017e, B:183:0x0329, B:178:0x0302, B:180:0x0306, B:174:0x02eb, B:175:0x02ed, B:127:0x023d, B:128:0x023f, B:105:0x01eb, B:92:0x01be, B:245:0x0338] A[DONT_GENERATE, DONT_INLINE]
  0x0338: PHI (r18v3 xyz.n.a.j2) = 
  (r18v4 xyz.n.a.j2)
  (r18v5 xyz.n.a.j2)
  (r18v6 xyz.n.a.j2)
  (r18v6 xyz.n.a.j2)
  (r18v7 xyz.n.a.j2)
  (r18v7 xyz.n.a.j2)
  (r18v10 xyz.n.a.j2)
  (r18v10 xyz.n.a.j2)
  (r18v12 xyz.n.a.j2)
  (r18v13 xyz.n.a.j2)
  (r18v13 xyz.n.a.j2)
 binds: [B:76:0x017e, B:183:0x0329, B:178:0x0302, B:180:0x0306, B:174:0x02eb, B:175:0x02ed, B:127:0x023d, B:128:0x023f, B:105:0x01eb, B:92:0x01be, B:245:0x0338] A[DONT_GENERATE, DONT_INLINE]
  0x0338: PHI (r19v2 java.lang.String) = 
  (r19v3 java.lang.String)
  (r19v4 java.lang.String)
  (r19v5 java.lang.String)
  (r19v5 java.lang.String)
  (r19v6 java.lang.String)
  (r19v6 java.lang.String)
  (r19v9 java.lang.String)
  (r19v9 java.lang.String)
  (r19v11 java.lang.String)
  (r19v12 java.lang.String)
  (r19v17 java.lang.String)
 binds: [B:76:0x017e, B:183:0x0329, B:178:0x0302, B:180:0x0306, B:174:0x02eb, B:175:0x02ed, B:127:0x023d, B:128:0x023f, B:105:0x01eb, B:92:0x01be, B:245:0x0338] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03fa A[Catch: Exception -> 0x03fe, TryCatch #2 {Exception -> 0x03fe, blocks: (B:219:0x03f2, B:221:0x03fa, B:224:0x0403, B:226:0x040d), top: B:253:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, feedback.shared.sdk.api.network.entities.Campaign] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x03ef -> B:253:0x03f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0452 -> B:232:0x0431). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13560a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
