package z21;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.o;
import com.yandex.div.core.view2.items.Direction;
import com.yandex.div.internal.n;
import com.yandex.div.internal.widget.tabs.z;
import com.yandex.div2.DivGallery;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivViewWithItems.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lz21/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lz21/c$d;", "Lz21/c$b;", "Lz21/c$c;", "Lz21/c$e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f443805a = new a(null);

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz21/c$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* compiled from: DivViewWithItems.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 176)
        /* renamed from: z21.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C12941a {
            static {
                int[] iArr = new int[DivGallery.ScrollMode.values().length];
                iArr[1] = 1;
                iArr[0] = 2;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz21/c$b;", "Lz21/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o f443806b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Direction f443807c;

        /* compiled from: DivViewWithItems.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z21/c$b$a", "Landroidx/recyclerview/widget/z;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a extends C23434z {

            /* renamed from: p, reason: collision with root package name */
            public final float f443808p;

            public a(Context context) {
                super(context);
                this.f443808p = 50.0f;
            }

            @Override // androidx.recyclerview.widget.C23434z
            public final float j(@k DisplayMetrics displayMetrics) {
                return this.f443808p / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.C23434z
            public final int m() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.C23434z
            public final int n() {
                return -1;
            }
        }

        public b(@k o oVar, @k Direction direction) {
            super(null);
            this.f443806b = oVar;
            this.f443807c = direction;
        }

        @Override // z21.c
        public final int a() {
            return z21.d.a(this.f443806b, this.f443807c);
        }

        @Override // z21.c
        public final int b() {
            RecyclerView.m layoutManager = this.f443806b.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.o0();
        }

        @Override // z21.c
        public final void c(int i12) {
            o oVar = this.f443806b;
            RecyclerView.m layoutManager = oVar.getLayoutManager();
            int iO02 = layoutManager == null ? 0 : layoutManager.o0();
            if (i12 < 0 || i12 >= iO02) {
                int i13 = n.f370123a;
                return;
            }
            a aVar = new a(oVar.getContext());
            aVar.f53878a = i12;
            RecyclerView.m layoutManager2 = oVar.getLayoutManager();
            if (layoutManager2 == null) {
                return;
            }
            layoutManager2.x1(aVar);
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz21/c$c;", "Lz21/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z21.c$c, reason: collision with other inner class name */
    public static final class C12942c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.yandex.div.core.view2.divs.widgets.n f443809b;

        public C12942c(@k com.yandex.div.core.view2.divs.widgets.n nVar) {
            super(null);
            this.f443809b = nVar;
        }

        @Override // z21.c
        public final int a() {
            return this.f443809b.getViewPager().getCurrentItem();
        }

        @Override // z21.c
        public final int b() {
            RecyclerView.Adapter adapter = this.f443809b.getViewPager().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        @Override // z21.c
        public final void c(int i12) {
            int iB2 = b();
            if (i12 < 0 || i12 >= iB2) {
                int i13 = n.f370123a;
            } else {
                this.f443809b.getViewPager().g(i12, true);
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz21/c$d;", "Lz21/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o f443810b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Direction f443811c;

        public d(@k o oVar, @k Direction direction) {
            super(null);
            this.f443810b = oVar;
            this.f443811c = direction;
        }

        @Override // z21.c
        public final int a() {
            return z21.d.a(this.f443810b, this.f443811c);
        }

        @Override // z21.c
        public final int b() {
            RecyclerView.m layoutManager = this.f443810b.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.o0();
        }

        @Override // z21.c
        public final void c(int i12) {
            o oVar = this.f443810b;
            RecyclerView.m layoutManager = oVar.getLayoutManager();
            int iO02 = layoutManager == null ? 0 : layoutManager.o0();
            if (i12 < 0 || i12 >= iO02) {
                int i13 = n.f370123a;
            } else {
                oVar.F0(i12);
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz21/c$e;", "Lz21/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final z f443812b;

        public e(@k z zVar) {
            super(null);
            this.f443812b = zVar;
        }

        @Override // z21.c
        public final int a() {
            return this.f443812b.getViewPager().getCurrentItem();
        }

        @Override // z21.c
        public final int b() {
            androidx.viewpager.widget.a adapter = this.f443812b.getViewPager().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.c();
        }

        @Override // z21.c
        public final void c(int i12) throws Resources.NotFoundException {
            int iB2 = b();
            if (i12 < 0 || i12 >= iB2) {
                int i13 = n.f370123a;
            } else {
                this.f443812b.getViewPager().x(i12, true);
            }
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(int i12);

    public c() {
    }
}
