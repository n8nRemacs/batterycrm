package androidx.compose.foundation.layout;

import java.util.ArrayList;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlowLayoutOverflow.kt */
@InterfaceC20625u0
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", "OverflowType", "Landroidx/compose/foundation/layout/T;", "Landroidx/compose/foundation/layout/k0;", "Landroidx/compose/foundation/layout/F0;", "Landroidx/compose/foundation/layout/n1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final OverflowType f28258a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28260c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<X0, Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> f28261d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<X0, Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> f28262e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OverflowType {

        /* renamed from: b, reason: collision with root package name */
        public static final OverflowType f28263b;

        /* renamed from: c, reason: collision with root package name */
        public static final OverflowType f28264c;

        /* renamed from: d, reason: collision with root package name */
        public static final OverflowType f28265d;

        /* renamed from: e, reason: collision with root package name */
        public static final OverflowType f28266e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ OverflowType[] f28267f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f28268g;

        static {
            OverflowType overflowType = new OverflowType("Visible", 0);
            f28263b = overflowType;
            OverflowType overflowType2 = new OverflowType("Clip", 1);
            f28264c = overflowType2;
            OverflowType overflowType3 = new OverflowType("ExpandIndicator", 2);
            f28265d = overflowType3;
            OverflowType overflowType4 = new OverflowType("ExpandOrCollapseIndicator", 3);
            f28266e = overflowType4;
            OverflowType[] overflowTypeArr = {overflowType, overflowType2, overflowType3, overflowType4};
            f28267f = overflowTypeArr;
            f28268g = kotlin.enums.c.a(overflowTypeArr);
        }

        public OverflowType() {
            throw null;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) f28267f.clone();
        }
    }

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OverflowType overflowType = OverflowType.f28263b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlowLayoutOverflow() {
        throw null;
    }

    public FlowLayoutOverflow(OverflowType overflowType, int i12, int i13, Y41.l lVar, Y41.l lVar2, C42822w c42822w) {
        this.f28258a = overflowType;
        this.f28259b = i12;
        this.f28260c = i13;
        this.f28261d = lVar;
        this.f28262e = lVar2;
    }

    public final void a(@Y61.k X0 x02, @Y61.k ArrayList arrayList) {
        Y41.l<X0, Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> lVar = this.f28261d;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVarInvoke = lVar != null ? lVar.invoke(x02) : null;
        Y41.l<X0, Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> lVar2 = this.f28262e;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVarInvoke2 = lVar2 != null ? lVar2.invoke(x02) : null;
        int iOrdinal = this.f28258a.ordinal();
        if (iOrdinal == 2) {
            if (pVarInvoke != null) {
                arrayList.add(pVarInvoke);
            }
        } else {
            if (iOrdinal != 3) {
                return;
            }
            if (pVarInvoke != null) {
                arrayList.add(pVarInvoke);
            }
            if (pVarInvoke2 != null) {
                arrayList.add(pVarInvoke2);
            }
        }
    }

    @Y61.k
    public final X0 b() {
        return new X0(this.f28258a, this.f28259b, this.f28260c);
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i12, int i13, Y41.l lVar, Y41.l lVar2, int i14, C42822w c42822w) {
        this(overflowType, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? null : lVar2, null);
    }
}
