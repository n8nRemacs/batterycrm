package one.me.profileedit.screens.adminpermissions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bec;
import defpackage.d53;
import defpackage.d9e;
import defpackage.dec;
import defpackage.e8j;
import defpackage.eo7;
import defpackage.f8a;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gec;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hec;
import defpackage.hfb;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hwa;
import defpackage.i8a;
import defpackage.imb;
import defpackage.jc3;
import defpackage.jva;
import defpackage.k18;
import defpackage.kk4;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.mgb;
import defpackage.n5g;
import defpackage.nt3;
import defpackage.oo7;
import defpackage.pb2;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.r8b;
import defpackage.rec;
import defpackage.sec;
import defpackage.sv2;
import defpackage.tec;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u8b;
import defpackage.uec;
import defpackage.vdc;
import defpackage.vec;
import defpackage.vid;
import defpackage.vnd;
import defpackage.vo7;
import defpackage.vo8;
import defpackage.vw4;
import defpackage.wec;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.yec;
import defpackage.yfb;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z11;
import defpackage.z44;
import defpackage.z9a;
import defpackage.zn6;
import java.util.Collections;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget;", "Lone/me/sdk/arch/Widget;", "Ldec;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "contactId", "Lhec;", "type", "(JJLhec;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileEditAdminPermissionsWidget extends Widget implements dec, qq3 {
    public static final /* synthetic */ yy7[] w0 = {new toc(ProfileEditAdminPermissionsWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, ProfileEditAdminPermissionsWidget.class, "contactId", "getContactId()J", 0), new toc(ProfileEditAdminPermissionsWidget.class, "type", "getType()Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsType;", 0), new toc(ProfileEditAdminPermissionsWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ProfileEditAdminPermissionsWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final b0i X;
    public final bbd Y;
    public final bbd Z;
    public final eo7 a;
    public final hs b;
    public final hs c;
    public final hs d;
    public final k18 o;
    public final vnd s0;
    public final int t0;
    public bcb u0;
    public x9f v0;

    public ProfileEditAdminPermissionsWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        Class<Long> cls = Long.class;
        this.b = new hs(cls, "chat_id");
        this.c = new hs(cls, "contact_id");
        this.d = new hs(hec.class, "permissions_type");
        this.o = createViewModelLazy(rec.class, new vdc(1, new sec(this, 0)));
        this.X = new b0i(((g4b) yec.a.getAccessor().c(56)).a(), this, 9);
        this.Y = viewBinding(r8b.R);
        this.Z = viewBinding(r8b.P);
        this.s0 = e8j.b(new sec(this, 1));
        this.t0 = kti.d(24 * vw4.d().getDisplayMetrics().density);
    }

    public final void A0() {
        vnd vndVar = this.s0;
        if (vndVar.e()) {
            OneMeButton oneMeButton = (OneMeButton) vndVar.getValue();
            if (oneMeButton.getVisibility() == 0) {
                mgb.a(oneMeButton, new nt3(oneMeButton, this, oneMeButton, 5));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.Z.D(this, w0[4]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.t0);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == r8b.c0) {
            z0().u();
            return;
        }
        if (i == r8b.b0) {
            xfh.r(z0().z0, jc3.b);
            return;
        }
        if (i == r8b.G) {
            rec recVarZ0 = z0();
            pb2 pb2VarV = recVarZ0.v();
            if (pb2VarV != null) {
                ((hwa) recVarZ0.s0.getValue()).e(recVarZ0.b, pb2VarV.b.a, recVarZ0.c);
                xfh.r(recVarZ0.A0, new bec(new n5g(u8b.J0), Integer.valueOf(yud.A)));
                xfh.r(recVarZ0.z0, new gec(recVarZ0.b));
                return;
            }
            return;
        }
        if (i == r8b.J) {
            rec recVarZ02 = z0();
            long j = recVarZ02.c;
            pb2 pb2VarV2 = recVarZ02.v();
            if (pb2VarV2 != null) {
                ((hwa) recVarZ02.s0.getValue()).E(pb2VarV2.a, pb2VarV2.b.a, Collections.singletonList(Long.valueOf(j)), false, pb2VarV2.g(j));
                xfh.r(recVarZ02.z0, jc3.b);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        tqi.c(new sv2(3, null, 5), frameLayout);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(r8b.P);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        float f = 24;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingRight(), this.t0);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        i8a i8aVar = vo7.a;
        i8a i8aVar2 = new i8a(3);
        i8aVar2.h(2048);
        i8aVar2.h(4096);
        i8aVar2.h(128);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new z9a(this, 7, i8aVar2), null, null, 28));
        float f2 = 8;
        float f3 = 20;
        f8a f8aVarB = oo7.b(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, 32768, kti.d(vw4.d().getDisplayMetrics().density * f), 4096, 0, kti.d(vw4.d().getDisplayMetrics().density * f3));
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int iD2 = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        float f4 = 12;
        recyclerView.j(new vo8(oo7.b(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f), 4096, kti.d(f * vw4.d().getDisplayMetrics().density), 32768, kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)), f8aVarB, oo7.b(iD, 0, 4096, iD2, 32768, iD3, kti.d(vw4.d().getDisplayMetrics().density * f4)), 0));
        frameLayout.addView(recyclerView);
        yfb yfbVar = new yfb(frameLayout.getContext(), 6);
        yfbVar.setId(r8b.R);
        yfbVar.setTitle(u8b.E0);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new hfb(new z11(16, this)));
        tqi.c(new tec(3, null, 0), yfbVar);
        frameLayout.addView(yfbVar);
        frameLayout.addView((View) this.s0.getValue());
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.s0.b = kk4.B0;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yfb yfbVar = (yfb) this.Y.D(this, w0[3]);
        mgb.a(yfbVar, new zn6(yfbVar, 23, this));
        A0();
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), new z44(this, 9));
        }
        d53 d53Var = new d53(z0().z0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new uec(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(z0().A0, 12), getViewLifecycleOwner().p(), l38Var), new vec(null, this), 1), getViewLifecycleScope());
        this.v0 = gw0.w(new g56(aw0.a(z0().D0, getViewLifecycleOwner().p(), l38Var), new wec(null, this), 1), getViewLifecycleScope());
    }

    public final hec y0() {
        yy7 yy7Var = w0[2];
        return (hec) this.d.a(this);
    }

    public final rec z0() {
        return (rec) this.o.getValue();
    }

    public ProfileEditAdminPermissionsWidget(long j, long j2, hec hecVar) {
        this(gwi.b(new imb("chat_id", Long.valueOf(j)), new imb("contact_id", Long.valueOf(j2)), new imb("permissions_type", hecVar)));
    }
}
