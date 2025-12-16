package com.avito.android.screens.bbip_private_v2.data;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbip_remote.model.BbipPrivatePresetsData;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import com.avito.android.util.A4;
import com.google.gson.Gson;
import hh.InterfaceC40933a;
import hh.InterfaceC40935c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import jh.C42376A;
import jh.s;
import jh.z;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qp0.C47426a;
import wZ.h;

/* compiled from: BbipPrivateV2Mapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/data/b;", "Lcom/avito/android/screens/bbip_private_v2/data/a;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.screens.bbip_private_v2.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f260879a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f260880b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f260881c;

    /* compiled from: BbipPrivateV2Mapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/data/b$a;", "", "<init>", "()V", "", "DEFAULT_DURATION", "I", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BbipPrivateV2Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.screens.bbip_private_v2.data.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C7813b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f260882a;

        static {
            int[] iArr = new int[BbipPrivatePresetsData.BbipPrivateSegment.BbipPrivateSegmentValue.values().length];
            try {
                iArr[BbipPrivatePresetsData.BbipPrivateSegment.BbipPrivateSegmentValue.PRESETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BbipPrivatePresetsData.BbipPrivateSegment.BbipPrivateSegmentValue.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f260882a = iArr;
        }
    }

    /* compiled from: BbipPrivateV2Mapper.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/avito/android/screens/bbip_private_v2/data/b$c", "Lcom/google/gson/reflect/a;", "", "", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.google.gson.reflect.a<Map<String, ? extends Object>> {
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k Gson gson, @InterfaceC40935c @k String str, @InterfaceC40933a @k String str2) {
        this.f260879a = gson;
        this.f260880b = str;
        this.f260881c = str2;
    }

    public static final BbipPrivateV2State.b.a.C7820a f(s sVar) {
        int id2 = sVar.getId();
        long price = sVar.getPrice();
        String priceFormatted = sVar.getPriceFormatted();
        Long budget = sVar.getBudget();
        String budgetFormatted = sVar.getBudgetFormatted();
        Long discountPct = sVar.getDiscountPct();
        String discountPctFormatted = sVar.getDiscountPctFormatted();
        long dailyPrice = sVar.getDailyPrice();
        Long dailyBudget = sVar.getDailyBudget();
        MnzFloatingFooterContact contact = sVar.getContact();
        return new BbipPrivateV2State.b.a.C7820a(id2, Long.valueOf(price), priceFormatted, budget, budgetFormatted, discountPct, discountPctFormatted, Long.valueOf(dailyPrice), dailyBudget, sVar.getDailyPriceFormatted(), sVar.getDailyBudgetFormatted(), null, contact != null ? h.a(contact) : null);
    }

    @Override // com.avito.android.screens.bbip_private_v2.data.a
    @k
    public final Map<String, String> a(@k Object obj) {
        Gson gson = this.f260879a;
        return A4.j(A4.f318516a, (Map) gson.e(gson.l(obj), new c().getType()));
    }

    @Override // com.avito.android.screens.bbip_private_v2.data.a
    @k
    public final ArrayList b(@k C42376A c42376a) {
        List<z> listA = c42376a.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (Iterator it = listA.iterator(); it.hasNext(); it = it) {
            z zVar = (z) it.next();
            int id2 = zVar.getId();
            long price = zVar.getPrice();
            String priceFormatted = zVar.getPriceFormatted();
            Long budget = zVar.getBudget();
            String budgetFormatted = zVar.getBudgetFormatted();
            Long discountPct = zVar.getDiscountPct();
            String discountPctFormatted = zVar.getDiscountPctFormatted();
            long dailyPrice = zVar.getDailyPrice();
            Long dailyBudget = zVar.getDailyBudget();
            MnzFloatingFooterContact contact = zVar.getContact();
            arrayList.add(new BbipPrivateV2State.b.a.C7820a(id2, Long.valueOf(price), priceFormatted, budget, budgetFormatted, discountPct, discountPctFormatted, Long.valueOf(dailyPrice), dailyBudget, zVar.getDailyPriceFormatted(), zVar.getDailyBudgetFormatted(), zVar.getForecast(), contact != null ? h.a(contact) : null));
        }
        return arrayList;
    }

    @Override // com.avito.android.screens.bbip_private_v2.data.a
    @k
    public final C47426a c(@k BbipPrivateV2State bbipPrivateV2State) {
        Object next;
        C47426a.b bVar;
        C47426a.d dVar;
        C47426a.c cVar;
        Boolean bool;
        BbipPrivateV2State.g.a aVar;
        BbipPrivateV2State.g.a aVar2;
        BbipPrivateV2State.g.a aVar3;
        BbipPrivateV2State.g.a aVar4;
        List<Integer> list;
        List<BbipPrivateV2State.SegmentsBlock.Segment> list2;
        BbipPrivateV2State.SegmentsBlock.Segment segment;
        BbipPrivateV2State.SegmentsBlock segmentsBlock = bbipPrivateV2State.f261028o;
        boolean zR2 = false;
        if (((segmentsBlock == null || (list2 = segmentsBlock.f261032a) == null || (segment = (BbipPrivateV2State.SegmentsBlock.Segment) C42745f0.K(segmentsBlock.f261033b, list2)) == null) ? null : segment.f261035b) == BbipPrivateV2State.SegmentsBlock.Segment.Type.f261037c) {
            BbipPrivateV2State.b bVar2 = bbipPrivateV2State.f261018e;
            BbipPrivateV2State.b.a.C7820a c7820a = bVar2 != null ? bVar2.f261046d : null;
            BbipPrivateV2State.b.a.C7820a c7820a2 = bVar2 != null ? bVar2.f261045c : null;
            C47426a.d dVar2 = new C47426a.d(new C47426a.C12336a(c7820a != null ? Integer.valueOf(c7820a.f261049a) : null, c7820a != null ? c7820a.f261050b : null, c7820a2 != null ? Integer.valueOf(c7820a2.f261049a) : null, c7820a2 != null ? c7820a2.f261050b : null));
            bVar = new C47426a.b(c7820a != null ? c7820a.f261056h : null, c7820a != null ? c7820a.f261057i : null, c7820a != null ? c7820a.f261054f : null, L.f(c7820a != null ? Integer.valueOf(c7820a.f261049a) : null, c7820a2 != null ? Integer.valueOf(c7820a2.f261049a) : null));
            BbipPrivateV2State.e eVar = bbipPrivateV2State.f261017d;
            Integer numValueOf = eVar != null ? Integer.valueOf(eVar.f261070g) : null;
            if (eVar != null && (list = eVar.f261066c) != null) {
                zR2 = C42745f0.r(list, numValueOf);
            }
            C47426a.c cVar2 = new C47426a.c(numValueOf, zR2, L.f(eVar != null ? eVar.f261069f : null, numValueOf));
            bool = Boolean.FALSE;
            cVar = cVar2;
            dVar = dVar2;
        } else {
            Iterator<T> it = bbipPrivateV2State.f261030q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BbipPrivateV2State.g) next).f261084e) {
                    break;
                }
            }
            BbipPrivateV2State.g gVar = (BbipPrivateV2State.g) next;
            bVar = new C47426a.b((gVar == null || (aVar4 = gVar.f261080a) == null) ? null : Long.valueOf(aVar4.f261090a), (gVar == null || (aVar3 = gVar.f261080a) == null) ? null : aVar3.f261092c, (gVar == null || (aVar2 = gVar.f261080a) == null) ? null : aVar2.f261093d, false);
            dVar = null;
            cVar = new C47426a.c((gVar == null || (aVar = gVar.f261080a) == null) ? null : Integer.valueOf(aVar.f261091b), false, false);
            bool = Boolean.TRUE;
        }
        C47426a.b bVar3 = bVar;
        String str = bbipPrivateV2State.f261021h;
        if (str == null) {
            str = this.f260881c;
        }
        return new C47426a(this.f260880b, str, dVar, bVar3, cVar, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    @Override // com.avito.android.screens.bbip_private_v2.data.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qp0.b d(@Y61.k com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r10, @Y61.l java.lang.Integer r11) {
        /*
            r9 = this;
            r0 = 0
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$e r1 = r10.f261017d
            if (r11 != 0) goto Ld
            if (r1 == 0) goto Lf
            int r11 = r1.f261070g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        Ld:
            r6 = r11
            goto L10
        Lf:
            r6 = r0
        L10:
            r11 = 0
            if (r1 == 0) goto L20
            java.util.List<java.lang.Integer> r1 = r1.f261066c
            if (r1 == 0) goto L20
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = kotlin.collections.C42745f0.r(r1, r6)
            if (r1 != 0) goto L20
            r11 = 1
        L20:
            r7 = r11
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b r11 = r10.f261018e
            if (r11 == 0) goto L4d
            java.util.List<com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a> r1 = r11.f261044b
            if (r1 == 0) goto L4d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a r3 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.b.a) r3
            int r3 = r3.f261047a
            if (r6 != 0) goto L41
            goto L2f
        L41:
            int r4 = r6.intValue()
            if (r3 != r4) goto L2f
            goto L49
        L48:
            r2 = r0
        L49:
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a r2 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.b.a) r2
            if (r2 != 0) goto L5c
        L4d:
            if (r11 == 0) goto L5b
            java.util.List<com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a> r1 = r11.f261044b
            if (r1 == 0) goto L5b
            java.lang.Object r1 = kotlin.collections.C42745f0.G(r1)
            r2 = r1
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a r2 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.b.a) r2
            goto L5c
        L5b:
            r2 = r0
        L5c:
            if (r11 == 0) goto L6a
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a$a r11 = r11.f261046d
            if (r11 == 0) goto L6a
            int r11 = r11.f261049a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5 = r11
            goto L6b
        L6a:
            r5 = r0
        L6b:
            if (r2 == 0) goto La5
            java.util.List<com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a$a> r11 = r2.f261048b
            if (r11 == 0) goto La5
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L82:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r11.next()
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a$a r2 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.b.a.C7820a) r2
            qp0.b$a r3 = new qp0.b$a
            int r4 = r2.f261049a
            if (r7 == 0) goto L96
            r8 = r0
            goto L9c
        L96:
            java.lang.Long r8 = r2.f261057i
            if (r8 != 0) goto L9c
            java.lang.Long r8 = r2.f261056h
        L9c:
            r3.<init>(r4, r8)
            r1.add(r3)
            goto L82
        La3:
            r8 = r1
            goto La6
        La5:
            r8 = r0
        La6:
            qp0.b r11 = new qp0.b
            java.lang.String r10 = r10.f261021h
            if (r10 != 0) goto Lae
            java.lang.String r10 = r9.f260881c
        Lae:
            r4 = r10
            java.lang.String r3 = r9.f260880b
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.data.b.d(com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State, java.lang.Integer):qp0.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x027e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0200  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    @Override // com.avito.android.screens.bbip_private_v2.data.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State e(@Y61.k jh.v r29) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.data.b.e(jh.v):com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State");
    }
}
