package com.avito.beduin.v2.component.gridlayout.android_view;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.common.Orientation;
import com.avito.beduin.v2.logger.LogLevel;
import j.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GridSpacingItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f335789b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridLayoutManager.c f335790c;

    /* renamed from: d, reason: collision with root package name */
    @U
    public final int f335791d;

    /* renamed from: e, reason: collision with root package name */
    @U
    public final int f335792e;

    /* compiled from: GridSpacingItemDecoration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GridSpacingItemDecoration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.f335659b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new a(null);
    }

    public h(@k b bVar, @k GridLayoutManager.c cVar) {
        int i12;
        this.f335789b = bVar;
        this.f335790c = cVar;
        Orientation orientation = bVar.f335797e;
        int iOrdinal = orientation.ordinal();
        int i13 = bVar.f335793a;
        int i14 = bVar.f335794b;
        if (iOrdinal == 0) {
            i12 = i14;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = i13;
        }
        this.f335791d = i12;
        int iOrdinal2 = orientation.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = i14;
        }
        this.f335792e = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        b bVar = this.f335789b;
        int i13 = bVar.f335795c;
        GridLayoutManager.c cVar = this.f335790c;
        int iE2 = cVar.e(iU2, i13);
        int iF2 = cVar.f(iU2);
        float f12 = this.f335791d;
        int i14 = bVar.f335795c;
        float f13 = f12 / i14;
        int iB2 = kotlin.math.b.b(iE2 * f13);
        int i15 = 0;
        int iB3 = cVar.f(iU2) + iE2 < i14 ? kotlin.math.b.b(f12 - (f13 * (iF2 + iE2))) : 0;
        int iD2 = cVar.d(iU2, i14);
        if (iD2 > 0) {
            boolean z12 = bVar.f335796d;
            i12 = this.f335792e;
            if (!z12) {
                i15 = i12;
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        int iOrdinal = bVar.f335797e.ordinal();
        if (iOrdinal == 0) {
            rect.set(i15, iB2, i12, iB3);
            G0 g02 = G0.f406611a;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            rect.set(iB2, i15, iB3, i12);
            G0 g03 = G0.f406611a;
        }
        RU0.b bVar2 = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar2.getClass();
        if (RU0.b.f14469c <= 0) {
            RU0.c cVar2 = RU0.b.f14468b;
            String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridSpacingItemDecoration");
            StringBuilder sbY = r.y(iU2, iE2, "itemPosition: ", ": spanIndex: ", ", spanGroup: ");
            sbY.append(iD2);
            sbY.append(": ");
            sbY.append(rect);
            cVar2.f(strS, sbY.toString());
        }
    }

    /* compiled from: GridSpacingItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/h$b;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f335793a;

        /* renamed from: b, reason: collision with root package name */
        public final int f335794b;

        /* renamed from: c, reason: collision with root package name */
        public final int f335795c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f335796d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Orientation f335797e;

        public b(@U int i12, @U int i13, int i14, boolean z12, @k Orientation orientation) {
            this.f335793a = i12;
            this.f335794b = i13;
            this.f335795c = i14;
            this.f335796d = z12;
            this.f335797e = orientation;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f335793a == bVar.f335793a && this.f335794b == bVar.f335794b && this.f335795c == bVar.f335795c && this.f335796d == bVar.f335796d && this.f335797e == bVar.f335797e;
        }

        public final int hashCode() {
            return this.f335797e.hashCode() + r.i(r.e(this.f335795c, r.e(this.f335794b, Integer.hashCode(this.f335793a) * 31, 31), 31), 31, this.f335796d);
        }

        @k
        public final String toString() {
            return "Params(horizontal=" + this.f335793a + ", vertical=" + this.f335794b + ", spanCount=" + this.f335795c + ", isReverse=" + this.f335796d + ", orientation=" + this.f335797e + ')';
        }

        public /* synthetic */ b(int i12, int i13, int i14, boolean z12, Orientation orientation, int i15, C42822w c42822w) {
            this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, i14, z12, orientation);
        }
    }
}
