package com.avito.android.screens.bbip_private_v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: BbipPrivateV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<BbipPrivateV2InternalAction, BbipPrivateV2State> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private_v2.data.a f261110b;

    /* compiled from: BbipPrivateV2Reducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f261111a;

        static {
            int[] iArr = new int[BbipPrivateV2State.SegmentsBlock.Segment.Type.values().length];
            try {
                BbipPrivateV2State.SegmentsBlock.Segment.Type type = BbipPrivateV2State.SegmentsBlock.Segment.Type.f261036b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BbipPrivateV2State.SegmentsBlock.Segment.Type type2 = BbipPrivateV2State.SegmentsBlock.Segment.Type.f261036b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f261111a = iArr;
        }
    }

    @Inject
    public l(@Y61.k com.avito.android.screens.bbip_private_v2.data.a aVar) {
        this.f261110b = aVar;
    }

    public static BbipPrivateV2State.a b(List list, float f12) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        float f13 = size - 1;
        int i12 = size - 2;
        if (i12 < 0) {
            i12 = 0;
        }
        return new BbipPrivateV2State.a(s.f(f12, 0.0f, f13), f13, i12);
    }

    public static List c(BbipPrivateV2State bbipPrivateV2State, Integer num) {
        List<BbipPrivateV2State.b.a> list;
        Object next;
        BbipPrivateV2State.b bVar = bbipPrivateV2State.f261018e;
        List<BbipPrivateV2State.b.a.C7820a> list2 = null;
        if (bVar != null && (list = bVar.f261044b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int i12 = ((BbipPrivateV2State.b.a) next).f261047a;
                if (num != null && i12 == num.intValue()) {
                    break;
                }
            }
            BbipPrivateV2State.b.a aVar = (BbipPrivateV2State.b.a) next;
            if (aVar != null) {
                list2 = aVar.f261048b;
            }
        }
        return list2 == null ? C42784z0.f406748b : list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State d(com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r14) {
        /*
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$SegmentsBlock r0 = r14.f261028o
            r1 = 0
            if (r0 == 0) goto L16
            java.util.List<com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$SegmentsBlock$Segment> r2 = r0.f261032a
            if (r2 == 0) goto L16
            int r0 = r0.f261033b
            java.lang.Object r0 = kotlin.collections.C42745f0.K(r0, r2)
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$SegmentsBlock$Segment r0 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.SegmentsBlock.Segment) r0
            if (r0 == 0) goto L16
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$SegmentsBlock$Segment$Type r0 = r0.f261035b
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 != 0) goto L1b
            r0 = -1
            goto L23
        L1b:
            int[] r2 = com.avito.android.screens.bbip_private_v2.mvi.l.a.f261111a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L23:
            r2 = 1
            if (r0 == r2) goto L36
            r2 = 2
            if (r0 == r2) goto L2b
        L29:
            r0 = r1
            goto L57
        L2b:
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b r0 = r14.f261018e
            if (r0 == 0) goto L29
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a$a r0 = r0.f261046d
            if (r0 == 0) goto L29
            wZ.f r0 = r0.f261061m
            goto L57
        L36:
            java.util.List<com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$g> r0 = r14.f261030q
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$g r3 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.g) r3
            boolean r3 = r3.f261084e
            if (r3 == 0) goto L3e
            goto L51
        L50:
            r2 = r1
        L51:
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$g r2 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.g) r2
            if (r2 == 0) goto L29
            wZ.f r0 = r2.f261088i
        L57:
            wZ.g r2 = r14.f261025l
            if (r2 == 0) goto L60
            r1 = 0
            wZ.g r1 = r2.b(r0, r1)
        L60:
            r8 = r1
            r11 = 0
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r13 = 130047(0x1fbff, float:1.82235E-40)
            r2 = r14
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r14 = com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.mvi.l.d(com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State):com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0469  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State a(com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction r44, com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r45) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.mvi.l.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
