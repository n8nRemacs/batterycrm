package one.me.sdk.sections;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.bbd;
import defpackage.bz4;
import defpackage.d9e;
import defpackage.koe;
import defpackage.kti;
import defpackage.qab;
import defpackage.toc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.z71;
import defpackage.zid;
import defpackage.zm3;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/sections/SectionRecyclerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "sections-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SectionRecyclerWidget extends Widget {
    public static final /* synthetic */ yy7[] c;
    public final bbd a;
    public final zid b;

    static {
        toc tocVar = new toc(SectionRecyclerWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        c = new yy7[]{tocVar};
    }

    public SectionRecyclerWidget() {
        super(null, 0, 3, null);
        this.a = viewBinding(qab.t);
        this.b = new zid(this);
    }

    /* renamed from: A0 */
    public abstract koe getY0();

    public final RecyclerView B0(int i) {
        zm3 zm3Var = new zm3(getY0(), getZ0());
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(qab.t);
        recyclerView.setAdapter(zm3Var);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f = 12;
        recyclerView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        yeb yebVarY = a93.s0.y(recyclerView);
        zid zidVar = this.b;
        recyclerView.j(new d9e(yebVarY, zidVar, null, null, 28));
        recyclerView.j(new bz4(zidVar, i));
        return recyclerView;
    }

    /* renamed from: y0 */
    public abstract z71 getZ0();

    public final RecyclerView z0() {
        return (RecyclerView) this.a.D(this, c[0]);
    }
}
