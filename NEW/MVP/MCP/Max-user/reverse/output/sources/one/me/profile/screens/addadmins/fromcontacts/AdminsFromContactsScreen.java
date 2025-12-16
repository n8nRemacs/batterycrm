package one.me.profile.screens.addadmins.fromcontacts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ac;
import defpackage.avd;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.fdc;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6;
import defpackage.imb;
import defpackage.k;
import defpackage.k18;
import defpackage.l38;
import defpackage.l48;
import defpackage.ocg;
import defpackage.okf;
import defpackage.q;
import defpackage.r5j;
import defpackage.rb;
import defpackage.sb;
import defpackage.tb;
import defpackage.td9;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.v8b;
import defpackage.vid;
import defpackage.x3;
import defpackage.x7j;
import defpackage.yvi;
import defpackage.yy7;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "(Ljava/lang/String;JLtk4;)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AdminsFromContactsScreen extends Widget {
    public static final /* synthetic */ yy7[] t0 = {new toc(AdminsFromContactsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, AdminsFromContactsScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(AdminsFromContactsScreen.class, "emptySearchView", "getEmptySearchView()Lone/me/sdk/uikit/common/views/EmptySearchView;", 0)};
    public ocg X;
    public okf Y;
    public final ExecutorService Z;
    public final hs a;
    public final k18 b;
    public final k18 c;
    public final bbd d;
    public final bbd o;
    public final b0i s0;

    public AdminsFromContactsScreen(String str, long j, tk4 tk4Var) {
        this(gwi.b(new imb("arg_scope_id", new b1e(str)), new imb("profile:add_admins_from_contacts:chat_id", Long.valueOf(j))));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(v8b.b);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.s0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        this.X = x7j.c(recyclerView);
        y0(recyclerView);
        frameLayout.addView(recyclerView);
        EmptySearchView emptySearchView = new EmptySearchView(frameLayout.getContext(), null);
        emptySearchView.setId(v8b.a);
        emptySearchView.setGravity(17);
        emptySearchView.setTitle(avd.h0);
        emptySearchView.setDescription(avd.g0);
        emptySearchView.setIsButtonVisible(false);
        frameLayout.addView(emptySearchView);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ocg ocgVar = this.X;
        if (ocgVar != null) {
            ocgVar.b(z0());
        }
        this.X = null;
        this.Y = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        x3 x3Var = ((ac) this.c.getValue()).Z;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(x3Var, l48VarP, l38Var), new sb(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((td9) this.b.getValue()).t0, getViewLifecycleOwner().p(), l38Var), new tb(null, this), 1), getViewLifecycleScope());
    }

    public final void y0(RecyclerView recyclerView) {
        okf okfVar = new okf(recyclerView, this.s0, new r5j(24, new k(7, this)));
        this.Y = okfVar;
        recyclerView.j(okfVar);
        tqi.c(new rb(okfVar, null, 0), recyclerView);
    }

    public final RecyclerView z0() {
        return (RecyclerView) this.d.D(this, t0[1]);
    }

    public AdminsFromContactsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, "profile:add_admins_from_contacts:chat_id");
        Object objA = yvi.a(bundle, "arg_scope_id", b1e.class);
        if (objA != null) {
            this.b = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, td9.class, null);
            this.c = createViewModelLazy(ac.class, new q(5, new i6(6, this)));
            this.d = viewBinding(v8b.b);
            this.o = viewBinding(v8b.a);
            ExecutorService executorServiceA = ((g4b) fdc.a.getAccessor().c(56)).a();
            this.Z = executorServiceA;
            this.s0 = new b0i(this, executorServiceA, 1);
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }
}
