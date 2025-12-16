package xy0;

import Y41.p;
import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.str_calendar.common.models.Position;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarRecyclerViewDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxy0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC50022b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f442718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442719c = 7;

    /* renamed from: d, reason: collision with root package name */
    public final int f442720d;

    /* renamed from: e, reason: collision with root package name */
    public final int f442721e;

    /* renamed from: f, reason: collision with root package name */
    public final int f442722f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442723g;

    /* compiled from: CalendarRecyclerViewDecoration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xy0.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Position.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Position position = Position.f286638b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Position position2 = Position.f286638b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC50022b(@k p pVar, int i12, int i13, int i14) {
        this.f442718b = (H) pVar;
        this.f442720d = i12;
        this.f442721e = i13;
        this.f442722f = i14;
        this.f442723g = i12 - i13;
    }

    public static void f(AbstractC50022b abstractC50022b, ConstraintLayout constraintLayout, int i12, int i13) {
        boolean z12 = (i13 & 8) == 0;
        boolean z13 = (i13 & 16) == 0;
        abstractC50022b.getClass();
        d dVar = new d();
        dVar.g(constraintLayout);
        dVar.i(i12, 1, z12 ? R.id.text_view_container : 0, 1);
        dVar.i(i12, 2, z13 ? R.id.text_view_container : 0, 2);
        dVar.c(constraintLayout);
    }

    public static void g(AbstractC50022b abstractC50022b, Rect rect, int i12, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        abstractC50022b.getClass();
        rect.left = i12;
        rect.right = i13;
        int i15 = abstractC50022b.f442722f;
        rect.top = i15;
        rect.bottom = i15;
    }

    public static void h(AbstractC50022b abstractC50022b, View view, int i12, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i12 = abstractC50022b.f442721e;
        }
        if ((i14 & 4) != 0) {
            i13 = abstractC50022b.f442721e;
        }
        abstractC50022b.getClass();
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i13;
        view.setLayoutParams(bVar);
    }

    public final void c(int i12, @k Rect rect) {
        int i13 = this.f442723g;
        if (i12 == 0) {
            g(this, rect, -i13, 0, 4);
        } else if (i12 == this.f442719c - 1) {
            g(this, rect, 0, -i13, 2);
        } else {
            g(this, rect, 0, 0, 6);
        }
    }

    public final void e(@k View view, @k View view2, int i12, int i13) {
        View viewFindViewById = view.findViewById(i12);
        Object tag = viewFindViewById != null ? viewFindViewById.getTag() : null;
        Position position = tag instanceof Position ? (Position) tag : null;
        if (position == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int iOrdinal = position.ordinal();
        if (iOrdinal == 0) {
            f(this, constraintLayout, i12, 20);
        } else if (iOrdinal == 1) {
            f(this, constraintLayout, i12, 12);
        } else if (iOrdinal != 3) {
            f(this, constraintLayout, i12, 4);
        } else {
            f(this, constraintLayout, i12, 28);
        }
        int iOrdinal2 = position.ordinal();
        int i14 = this.f442720d;
        int i15 = this.f442719c;
        if (iOrdinal2 == 0) {
            if (i13 == 0) {
                h(this, view2, i14, 0, 4);
                return;
            } else if (i13 == i15 - 1) {
                h(this, view2, 0, i14, 2);
                return;
            } else {
                h(this, view2, 0, 0, 6);
                return;
            }
        }
        if (iOrdinal2 == 1) {
            if (i13 == 0) {
                h(this, view2, i14, 0, 4);
                return;
            } else if (i13 == i15 - 1) {
                h(this, view2, 0, i14, 2);
                return;
            } else {
                h(this, view2, 0, 0, 6);
                return;
            }
        }
        if (iOrdinal2 != 3) {
            if (i13 == 0) {
                h(this, view2, i14, 0, 4);
                return;
            } else if (i13 == i15 - 1) {
                h(this, view2, 0, i14, 2);
                return;
            } else {
                h(this, view2, 0, 0, 6);
                return;
            }
        }
        if (i13 == 0) {
            h(this, view2, i14, 0, 4);
        } else if (i13 == i15 - 1) {
            h(this, view2, 0, i14, 2);
        } else {
            h(this, view2, 0, 0, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.jvm.internal.H] */
    public final int i(@k View view) {
        return ((Number) this.f442718b.invoke(Integer.valueOf(((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition()), Integer.valueOf(this.f442719c))).intValue();
    }
}
