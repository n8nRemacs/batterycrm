package one.me.messages.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.co2;
import defpackage.d9e;
import defpackage.eo7;
import defpackage.ey9;
import defpackage.fb5;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.iv8;
import defpackage.iy9;
import defpackage.jy9;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.koe;
import defpackage.l38;
import defpackage.m;
import defpackage.p89;
import defpackage.qfb;
import defpackage.r7b;
import defpackage.s7b;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.wu7;
import defpackage.yfb;
import defpackage.yq9;
import defpackage.yy7;
import defpackage.zr0;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/settings/MessagesSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "message-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MessagesSettingsScreen extends Widget {
    public static final /* synthetic */ yy7[] X;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final bbd d;
    public final koe o;

    static {
        toc tocVar = new toc(MessagesSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new yq9(1), (cm6) null, 6);
        this.b = eo7.f;
        k18 k18VarCreateViewModelLazy = createViewModelLazy(jy9.class, new iv8(15, new yq9(2)));
        this.c = k18VarCreateViewModelLazy;
        this.d = viewBinding(r7b.a);
        koe koeVar = new koe(new co2(7, this), ((g4b) ey9.a.getAccessor().c(56)).a());
        this.o = koeVar;
        gw0.w(new g56(((jy9) k18VarCreateViewModelLazy.getValue()).d, new zr0(2, koeVar, koe.class, "submitList", "submitList(Ljava/util/List;)V", 4, 24), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(r7b.b);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(s7b.c);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new wu7(18, this)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(r7b.a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new p89(14), null, null, 28));
        recyclerView.j(new fb5(1));
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 9), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.d.D(this, X[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((jy9) this.c.getValue()).o, getViewLifecycleOwner().p(), l38.d), new iy9(null, this), 1), getViewLifecycleScope());
    }
}
