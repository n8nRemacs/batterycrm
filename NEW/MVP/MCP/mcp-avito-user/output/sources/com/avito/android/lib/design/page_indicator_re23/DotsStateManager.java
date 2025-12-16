package com.avito.android.lib.design.page_indicator_re23;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DotsStateManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/DotsStateManager;", "", "a", "DotState", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DotsStateManager {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final List<DotState> f179889h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final List<DotState> f179890i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final ArrayList f179891j;

    /* renamed from: a, reason: collision with root package name */
    public final int f179892a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f179893b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f179894c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public List<? extends DotState> f179895d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f179896e;

    /* renamed from: f, reason: collision with root package name */
    public int f179897f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f179898g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DotsStateManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/DotsStateManager$DotState;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DotState {

        /* renamed from: b, reason: collision with root package name */
        public static final DotState f179899b;

        /* renamed from: c, reason: collision with root package name */
        public static final DotState f179900c;

        /* renamed from: d, reason: collision with root package name */
        public static final DotState f179901d;

        /* renamed from: e, reason: collision with root package name */
        public static final DotState f179902e;

        /* renamed from: f, reason: collision with root package name */
        public static final DotState f179903f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ DotState[] f179904g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179905h;

        static {
            DotState dotState = new DotState("SELECTED", 0);
            f179899b = dotState;
            DotState dotState2 = new DotState("UNSELECTED_PRIMARY", 1);
            f179900c = dotState2;
            DotState dotState3 = new DotState("UNSELECTED_SECONDARY", 2);
            f179901d = dotState3;
            DotState dotState4 = new DotState("UNSELECTED_TERTIARY", 3);
            f179902e = dotState4;
            DotState dotState5 = new DotState("INVISIBLE", 4);
            f179903f = dotState5;
            DotState[] dotStateArr = {dotState, dotState2, dotState3, dotState4, dotState5};
            f179904g = dotStateArr;
            f179905h = c.a(dotStateArr);
        }

        public DotState() {
            throw null;
        }

        public static DotState valueOf(String str) {
            return (DotState) Enum.valueOf(DotState.class, str);
        }

        public static DotState[] values() {
            return (DotState[]) f179904g.clone();
        }
    }

    /* compiled from: DotsStateManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/DotsStateManager$a;", "", "<init>", "()V", "", "COMPACT_MODE_MAX_DOTS", "I", "", "Lcom/avito/android/lib/design/page_indicator_re23/DotsStateManager$DotState;", "DOTS_PATTERN", "Ljava/util/List;", "DOTS_PATTERN_AFTER_SELECTED", "DOTS_PATTERN_BEFORE_SELECTED", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DotsStateManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/DotsStateManager$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(@k ArrayList arrayList);
    }

    static {
        new a(null);
        DotState dotState = DotState.f179901d;
        DotState dotState2 = DotState.f179902e;
        List<DotState> listU = C42745f0.U(dotState, dotState2);
        f179889h = listU;
        DotState dotState3 = DotState.f179900c;
        List<DotState> listU2 = C42745f0.U(dotState2, dotState, dotState3, dotState3);
        f179890i = listU2;
        List<DotState> list = listU;
        f179891j = C42745f0.h0(list, C42745f0.i0(DotState.f179899b, listU2));
    }

    public DotsStateManager(int i12, @k b bVar, @l List<? extends DotState> list, int i13, boolean z12) {
        this.f179892a = i12;
        this.f179893b = bVar;
        this.f179894c = i12 <= 5;
        this.f179895d = list;
        this.f179897f = i13;
        this.f179898g = z12;
    }

    public final void a() {
        ArrayList arrayList;
        boolean z12 = this.f179894c;
        int i12 = 0;
        int i13 = this.f179892a;
        if (z12) {
            arrayList = new ArrayList(i13);
            while (i12 < i13) {
                arrayList.add(i12 == this.f179897f ? DotState.f179899b : DotState.f179900c);
                i12++;
            }
        } else {
            arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(DotState.f179903f);
            }
            int i15 = this.f179897f;
            boolean z13 = i15 == 1 && this.f179896e;
            boolean z14 = i15 == arrayList.size() + (-2) && !this.f179896e;
            int size = z13 ? 0 : z14 ? arrayList.size() - 1 : this.f179897f;
            boolean z15 = this.f179896e;
            List<DotState> list = f179889h;
            List<DotState> list2 = f179890i;
            int size2 = size - (z15 ? list2.size() : list.size());
            int size3 = (this.f179896e ? list.size() : list2.size()) + size;
            boolean z16 = this.f179896e;
            List listQ0 = f179891j;
            if (!z16) {
                listQ0 = C42745f0.q0(listQ0);
            }
            kotlin.ranges.k it = new kotlin.ranges.l(size2, size3, 1).iterator();
            while (it.f406910d) {
                int iA2 = it.a();
                int i16 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Object obj = listQ0.get(i12);
                if (iA2 >= 0 && iA2 < arrayList.size()) {
                    arrayList.set(iA2, obj);
                }
                i12 = i16;
            }
            if (z13 || z14) {
                Collections.swap(arrayList, size, this.f179897f);
            }
        }
        this.f179895d = arrayList;
        this.f179893b.a(arrayList);
    }

    public final void b() {
        List<? extends DotState> list = this.f179895d;
        if (list == null) {
            a();
            return;
        }
        int i12 = this.f179897f;
        int i13 = (this.f179896e ? -1 : 1) + i12;
        if (list.get(i12) != DotState.f179900c || C42745f0.K(i13, list) != DotState.f179899b) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.swap(arrayList, i13, this.f179897f);
        this.f179895d = arrayList;
        this.f179893b.a(arrayList);
    }

    public /* synthetic */ DotsStateManager(int i12, b bVar, List list, int i13, boolean z12, int i14, C42822w c42822w) {
        this(i12, bVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? false : z12);
    }
}
