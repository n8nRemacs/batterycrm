package androidx.compose.foundation.text.selection;

import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectionLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/selection/m0;", "", "Ll0/g;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/A;", "containerCoordinates", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/x;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/A;ZLandroidx/compose/foundation/text/selection/x;Ljava/util/Comparator;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21025m0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32075a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32076b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.layout.A f32077c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32078d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C21045x f32079e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Comparator<Long> f32080f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.E0 f32081g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f32082h;

    /* renamed from: i, reason: collision with root package name */
    public int f32083i;

    /* renamed from: j, reason: collision with root package name */
    public int f32084j;

    /* renamed from: k, reason: collision with root package name */
    public int f32085k;

    /* compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.m0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Direction direction = Direction.f31836b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Direction direction2 = Direction.f31836b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C21025m0() {
        throw null;
    }

    public C21025m0(long j12, long j13, androidx.compose.ui.layout.A a12, boolean z12, C21045x c21045x, Comparator comparator, C42822w c42822w) {
        this.f32075a = j12;
        this.f32076b = j13;
        this.f32077c = a12;
        this.f32078d = z12;
        this.f32079e = c21045x;
        this.f32080f = comparator;
        int i12 = androidx.collection.S.f25607a;
        this.f32081g = new androidx.collection.E0(0, 1, null);
        this.f32082h = new ArrayList();
        this.f32083i = -1;
        this.f32084j = -1;
        this.f32085k = -1;
    }

    public final int a(int i12, Direction direction, Direction direction2) {
        if (i12 != -1) {
            return i12;
        }
        int iOrdinal = C21027n0.b(direction, direction2).ordinal();
        if (iOrdinal == 0) {
            return this.f32085k - 1;
        }
        if (iOrdinal == 1) {
            return this.f32085k;
        }
        if (iOrdinal == 2) {
            return i12;
        }
        throw new NoWhenBranchMatchedException();
    }
}
