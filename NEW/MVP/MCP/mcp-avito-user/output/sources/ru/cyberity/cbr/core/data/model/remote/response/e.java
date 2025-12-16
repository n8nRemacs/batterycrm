package ru.cyberity.cbr.core.data.model.remote.response;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.ReviewAnswerType;
import ru.cyberity.cbr.core.data.model.ReviewRejectType;
import ru.cyberity.cbr.core.data.model.ReviewStatusType;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.remote.response.d;

/* compiled from: ListApplicantsResponse.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0002\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\u0002\u001a\u00020\b*\u00020\u0007\u001a\u0016\u0010\u0002\u001a\u00020\f*\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\r*\b\u0012\u0004\u0012\u00020\u000e0\r\u001a\n\u0010\u0002\u001a\u00020\u0011*\u00020\u0010\u001a\u000e\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012*\u00020\u0010*\n\u0010\u0014\"\u00020\u00112\u00020\u0011¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/response/d$c$e$c;", "Lru/cyberity/cbr/core/data/model/g$c$a;", "a", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$e;", "Lru/cyberity/cbr/core/data/model/g$c;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f$c;", "Lru/cyberity/cbr/core/data/model/g$d$a;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$f;", "Lru/cyberity/cbr/core/data/model/g$d;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$c;", "", "infoCountry", "Lru/cyberity/cbr/core/data/model/g$a;", "", "Lru/cyberity/cbr/core/data/model/remote/e;", "Lru/cyberity/cbr/core/data/model/g$b;", "Lru/cyberity/cbr/core/data/model/remote/response/d$c$d;", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "b", "ApplicantAction", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {
    @k
    public static final g.c.a a(@k d.c.e.C12461c c12461c) {
        DocumentType documentTypeA = DocumentType.INSTANCE.a(c12461c.p());
        List<String> listX = c12461c.x();
        if (listX == null) {
            listX = C42784z0.f406748b;
        }
        List<String> list = listX;
        List<IdentitySide> listV = c12461c.v();
        if (listV == null) {
            listV = C42784z0.f406748b;
        }
        return new g.c.a(documentTypeA, list, listV, c12461c.z(), c12461c.n(), c12461c.l(), c12461c.t(), c12461c.r(), c12461c.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ru.cyberity.cbr.core.data.model.g b(@Y61.k ru.cyberity.cbr.core.data.model.remote.response.d.c.C12460d r20) {
        /*
            ru.cyberity.cbr.core.data.model.g r18 = new ru.cyberity.cbr.core.data.model.g
            java.lang.String r1 = r20.getId()
            java.lang.String r2 = r20.y()
            java.lang.String r3 = r20.m0()
            java.lang.String r4 = r20.getClientId()
            java.lang.String r5 = r20.getCreatedAt()
            java.lang.String r6 = r20.getInspectionId()
            ru.cyberity.cbr.core.data.model.remote.response.d$c$e r0 = r20.getRequiredIdDocs()
            ru.cyberity.cbr.core.data.model.g$c r7 = a(r0)
            java.lang.String r8 = r20.getExternalUserId()
            ru.cyberity.cbr.core.data.model.b r9 = r20.w()
            ru.cyberity.cbr.core.data.model.remote.response.d$c$f r0 = r20.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String()
            ru.cyberity.cbr.core.data.model.g$d r10 = a(r0)
            java.lang.String r11 = r20.getEnv()
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r0 = r20.getFixedInfo()
            r12 = 0
            if (r0 == 0) goto L52
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r13 = r20.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String()
            if (r13 == 0) goto L48
            java.lang.String r13 = r13.p()
            goto L49
        L48:
            r13 = r12
        L49:
            ru.cyberity.cbr.core.data.model.g$a r0 = a(r0, r13)
            if (r0 != 0) goto L50
            goto L52
        L50:
            r13 = r0
            goto L5f
        L52:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r0 = r20.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String()
            if (r0 == 0) goto L5e
            r13 = 1
            ru.cyberity.cbr.core.data.model.g$a r0 = a(r0, r12, r13, r12)
            goto L50
        L5e:
            r13 = r12
        L5f:
            java.lang.String r14 = r20.getLang()
            java.util.List r0 = r20.a0()
            if (r0 == 0) goto L70
            java.util.List r0 = a(r0)
            r19 = r0
            goto L72
        L70:
            r19 = r12
        L72:
            java.lang.String r15 = r20.getEmail()
            java.lang.String r16 = r20.getPhone()
            java.util.List r17 = r20.e0()
            r0 = r18
            r12 = r13
            r13 = r14
            r14 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.remote.response.e.b(ru.cyberity.cbr.core.data.model.remote.response.d$c$d):ru.cyberity.cbr.core.data.model.g");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @k
    public static final g.c a(@k d.c.e eVar) {
        ?? arrayList;
        List<d.c.e.C12461c> listG = eVar.g();
        if (listG != null) {
            arrayList = new ArrayList(C42745f0.q(listG, 10));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(a((d.c.e.C12461c) it.next()));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        List list = arrayList;
        Boolean boolO = eVar.o();
        return new g.c(list, boolO != null ? boolO.booleanValue() : false, eVar.q(), eVar.m(), eVar.k(), eVar.i());
    }

    @k
    public static final g.d.a a(@k d.c.f.C12462c c12462c) {
        String strH = c12462c.h();
        String strF = c12462c.f();
        ReviewAnswerType reviewAnswerTypeL = c12462c.l();
        if (reviewAnswerTypeL == null) {
            reviewAnswerTypeL = ReviewAnswerType.Unknown;
        }
        ReviewAnswerType reviewAnswerType = reviewAnswerTypeL;
        List<String> listJ = c12462c.j();
        if (listJ == null) {
            listJ = C42784z0.f406748b;
        }
        List<String> list = listJ;
        ReviewRejectType reviewRejectTypeN = c12462c.n();
        if (reviewRejectTypeN == null) {
            reviewRejectTypeN = ReviewRejectType.Unknown;
        }
        return new g.d.a(strH, strF, reviewAnswerType, list, reviewRejectTypeN);
    }

    @k
    public static final g.d a(@k d.c.f fVar) {
        Integer numV = fVar.v();
        ReviewStatusType reviewStatusTypeF = fVar.getReviewStatus();
        if (reviewStatusTypeF == null) {
            reviewStatusTypeF = ReviewStatusType.Unknown;
        }
        ReviewStatusType reviewStatusType = reviewStatusTypeF;
        Integer numX = fVar.x();
        String strN = fVar.n();
        d.c.f.C12462c c12462cB = fVar.getResult();
        return new g.d(numV, reviewStatusType, numX, strN, c12462cB != null ? a(c12462cB) : null, fVar.r(), fVar.p(), fVar.t());
    }

    public static /* synthetic */ g.a a(d.c.C12459c c12459c, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        return a(c12459c, str);
    }

    @k
    public static final g.a a(@k d.c.C12459c c12459c, @l String str) {
        ArrayList arrayList;
        String strP = c12459c.p();
        String str2 = strP == null ? str : strP;
        String strV = c12459c.v();
        String strZ = c12459c.z();
        String strD = c12459c.getMiddleName();
        String strB = c12459c.getLegalName();
        String strX = c12459c.x();
        String strT = c12459c.t();
        String strH = c12459c.getPlaceOfBirth();
        String strR = c12459c.r();
        String strJ = c12459c.getStateOfBirth();
        String strF = c12459c.getNationality();
        List<Map<String, Object>> listN = c12459c.n();
        if (listN != null) {
            arrayList = new ArrayList(C42745f0.q(listN, 10));
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str3 = (String) entry.getKey();
                    Iterator it3 = it;
                    Object value = entry.getValue();
                    Iterator it4 = it2;
                    String str4 = value instanceof String ? (String) value : null;
                    Q q12 = str4 != null ? new Q(str3, str4) : null;
                    if (q12 != null) {
                        arrayList2.add(q12);
                    }
                    it2 = it4;
                    it = it3;
                }
                arrayList.add(P0.p(arrayList2));
                it = it;
            }
        } else {
            arrayList = null;
        }
        return new g.a(str2, strV, strZ, strD, strB, strX, strT, strH, strR, strJ, strF, arrayList, c12459c.getTin());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ru.cyberity.cbr.core.data.model.g a(@Y61.k ru.cyberity.cbr.core.data.model.remote.response.d.c.C12460d r19) {
        /*
            ru.cyberity.cbr.core.data.model.g r18 = new ru.cyberity.cbr.core.data.model.g
            java.lang.String r1 = r19.getId()
            java.lang.String r3 = r19.m0()
            java.lang.String r4 = r19.getClientId()
            java.lang.String r5 = r19.getCreatedAt()
            java.lang.String r6 = r19.getInspectionId()
            ru.cyberity.cbr.core.data.model.remote.response.d$c$e r0 = r19.getRequiredIdDocs()
            ru.cyberity.cbr.core.data.model.g$c r7 = a(r0)
            java.lang.String r8 = r19.getExternalUserId()
            ru.cyberity.cbr.core.data.model.b r9 = r19.w()
            ru.cyberity.cbr.core.data.model.remote.response.d$c$f r0 = r19.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String()
            ru.cyberity.cbr.core.data.model.g$d r10 = a(r0)
            java.lang.String r11 = r19.getEnv()
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r0 = r19.getFixedInfo()
            r2 = 0
            if (r0 == 0) goto L4e
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r12 = r19.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String()
            if (r12 == 0) goto L44
            java.lang.String r12 = r12.p()
            goto L45
        L44:
            r12 = r2
        L45:
            ru.cyberity.cbr.core.data.model.g$a r0 = a(r0, r12)
            if (r0 != 0) goto L4c
            goto L4e
        L4c:
            r12 = r0
            goto L5b
        L4e:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r0 = r19.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String()
            if (r0 == 0) goto L5a
            r12 = 1
            ru.cyberity.cbr.core.data.model.g$a r0 = a(r0, r2, r12, r2)
            goto L4c
        L5a:
            r12 = r2
        L5b:
            java.lang.String r13 = r19.getLang()
            java.util.List r0 = r19.a0()
            if (r0 == 0) goto L6b
            java.util.List r0 = a(r0)
            r14 = r0
            goto L6c
        L6b:
            r14 = r2
        L6c:
            java.lang.String r15 = r19.getEmail()
            java.lang.String r16 = r19.getPhone()
            java.util.List r17 = r19.e0()
            r2 = 0
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.remote.response.e.a(ru.cyberity.cbr.core.data.model.remote.response.d$c$d):ru.cyberity.cbr.core.data.model.g");
    }

    @k
    public static final List<g.b> a(@k List<ru.cyberity.cbr.core.data.model.remote.e> list) {
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (ru.cyberity.cbr.core.data.model.remote.e eVar : list) {
            String strC = eVar.c();
            String strE = eVar.e();
            if (strE == null) {
                strE = "";
            }
            arrayList.add(new g.b(strC, strE));
        }
        return arrayList;
    }
}
