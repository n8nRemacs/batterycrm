package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class vjc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileMemberPermissionsScreen b;

    public /* synthetic */ vjc(ProfileMemberPermissionsScreen profileMemberPermissionsScreen, int i) {
        this.a = i;
        this.b = profileMemberPermissionsScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ProfileMemberPermissionsScreen profileMemberPermissionsScreen = this.b;
        switch (i) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                int i2 = ProfileMemberPermissionsScreen.d;
                yfb yfbVar = new yfb(linearLayout.getContext(), 6);
                yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                yfbVar.setTitle(u8b.r1);
                yfbVar.setForm(qfb.a);
                yfbVar.setTextShimmerEnabled(false);
                yfbVar.setLeftActions(new gfb(new vjc(profileMemberPermissionsScreen, 1)));
                linearLayout.addView(yfbVar);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                recyclerView.setLayoutParams(new kt3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), kti.d(16 * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileMemberPermissionsScreen.c);
                recyclerView.setItemAnimator(null);
                i8a i8aVar = vo7.a;
                i8a i8aVar2 = new i8a(1);
                i8aVar2.h(2048);
                recyclerView.j(new d9e(a93.s0.y(recyclerView), new z9a(profileMemberPermissionsScreen, 10, i8aVar2), null, null, 28));
                float f = 6;
                int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
                int i3 = oo7.a;
                f8a f8aVar = new f8a();
                f8aVar.e(1024, 0);
                f8aVar.e(2048, iD);
                int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
                f8a f8aVar2 = new f8a();
                f8aVar2.e(1024, 0);
                f8aVar2.e(2048, iD2);
                int iD3 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                int iD4 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                f8a f8aVar3 = new f8a();
                f8aVar3.e(1024, iD3);
                f8aVar3.e(2048, iD4);
                recyclerView.j(new vo8(f8aVar3, f8aVar, f8aVar2, 0));
                linearLayout.addView(recyclerView);
                break;
            default:
                int i4 = ProfileMemberPermissionsScreen.d;
                xfh.r(profileMemberPermissionsScreen.y0().w0, jc3.b);
                break;
        }
        return qqgVar;
    }
}
