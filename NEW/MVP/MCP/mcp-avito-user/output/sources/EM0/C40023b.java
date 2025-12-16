package eM0;

import Y41.p;
import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.vas_planning_calendar.view.konveyor.items.day.Position;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarRecyclerViewDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeM0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40023b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Integer, Integer, Integer> f395144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f395145c = 7;

    /* renamed from: d, reason: collision with root package name */
    public final int f395146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f395147e;

    /* renamed from: f, reason: collision with root package name */
    public final int f395148f;

    /* renamed from: g, reason: collision with root package name */
    public final int f395149g;

    /* compiled from: PlanCalendarRecyclerViewDecoration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eM0.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Position.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Position position = Position.f322695b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Position position2 = Position.f322695b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C40023b(@k p pVar, int i12, int i13, int i14) {
        this.f395144b = pVar;
        this.f395146d = i12;
        this.f395147e = i13;
        this.f395148f = i14;
        this.f395149g = i12 - i13;
    }

    public static void c(C40023b c40023b, ConstraintLayout constraintLayout, int i12) {
        boolean z12 = (i12 & 8) == 0;
        boolean z13 = (i12 & 16) == 0;
        d dVar = new d();
        dVar.g(constraintLayout);
        dVar.i(R.id.background_view, 1, z12 ? R.id.text_view_container : 0, 1);
        dVar.i(R.id.background_view, 2, z13 ? R.id.text_view_container : 0, 2);
        dVar.c(constraintLayout);
    }

    public static void e(C40023b c40023b, Rect rect, int i12, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        rect.left = i12;
        rect.right = i13;
        int i15 = c40023b.f395148f;
        rect.top = i15;
        rect.bottom = i15;
    }

    public static void f(C40023b c40023b, View view, int i12, int i13, int i14) {
        int i15 = i14 & 2;
        int i16 = c40023b.f395147e;
        if (i15 != 0) {
            i12 = i16;
        }
        if ((i14 & 4) != 0) {
            i13 = i16;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i13;
        view.setLayoutParams(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        View viewFindViewById = view.findViewById(R.id.text_view_container);
        if (viewFindViewById == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition());
        int i12 = this.f395145c;
        int iIntValue = this.f395144b.invoke(numValueOf, Integer.valueOf(i12)).intValue();
        int i13 = this.f395149g;
        if (iIntValue == 0) {
            e(this, rect, -i13, 0, 4);
        } else if (iIntValue == i12 - 1) {
            e(this, rect, 0, -i13, 2);
        } else {
            e(this, rect, 0, 0, 6);
        }
        View viewFindViewById2 = view.findViewById(R.id.background_view);
        Object tag = viewFindViewById2 != null ? viewFindViewById2.getTag() : null;
        Position position = tag instanceof Position ? (Position) tag : null;
        if (position == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int iOrdinal = position.ordinal();
        if (iOrdinal == 0) {
            c(this, constraintLayout, 20);
        } else if (iOrdinal == 1) {
            c(this, constraintLayout, 12);
        } else if (iOrdinal != 3) {
            c(this, constraintLayout, 4);
        } else {
            c(this, constraintLayout, 28);
        }
        int iOrdinal2 = position.ordinal();
        int i14 = this.f395146d;
        if (iOrdinal2 == 0) {
            if (iIntValue == 0) {
                f(this, viewFindViewById, i14, 0, 4);
                return;
            } else if (iIntValue == i12 - 1) {
                f(this, viewFindViewById, 0, i14, 2);
                return;
            } else {
                f(this, viewFindViewById, 0, 0, 6);
                return;
            }
        }
        if (iOrdinal2 == 1) {
            if (iIntValue == 0) {
                f(this, viewFindViewById, i14, 0, 4);
                return;
            } else if (iIntValue == i12 - 1) {
                f(this, viewFindViewById, 0, i14, 2);
                return;
            } else {
                f(this, viewFindViewById, 0, 0, 6);
                return;
            }
        }
        if (iOrdinal2 != 3) {
            if (iIntValue == 0) {
                f(this, viewFindViewById, i14, 0, 4);
                return;
            } else if (iIntValue == i12 - 1) {
                f(this, viewFindViewById, 0, i14, 2);
                return;
            } else {
                f(this, viewFindViewById, 0, 0, 6);
                return;
            }
        }
        if (iIntValue == 0) {
            f(this, viewFindViewById, i14, 0, 4);
        } else if (iIntValue == i12 - 1) {
            f(this, viewFindViewById, 0, i14, 2);
        } else {
            f(this, viewFindViewById, 0, 0, 6);
        }
    }
}
