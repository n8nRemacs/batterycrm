package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ld0 extends dtf implements um6 {
    public /* synthetic */ Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                ld0 ld0Var = new ld0(3, (Continuation) obj3, 0);
                ld0Var.Y = (zc0) obj;
                ld0Var.X = (yeb) obj2;
                qqg qqgVar = qqg.a;
                ld0Var.n(qqgVar);
                return qqgVar;
            case 1:
                ld0 ld0Var2 = new ld0((BaseBottomSheetWidget) this.Y, (Continuation) obj3, 1);
                ld0Var2.X = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                ld0Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                ld0 ld0Var3 = new ld0(3, (Continuation) obj3, 2);
                ld0Var3.Y = (Long) obj;
                ld0Var3.X = (mb4) obj2;
                return ld0Var3.n(qqg.a);
            case 3:
                ld0 ld0Var4 = new ld0(3, (Continuation) obj3, 3);
                ld0Var4.Y = (bt1) obj;
                ld0Var4.X = (vc1) obj2;
                return ld0Var4.n(qqg.a);
            case 4:
                ld0 ld0Var5 = new ld0(3, (Continuation) obj3, 4);
                ld0Var5.Y = (gk1) obj;
                ld0Var5.X = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                ld0Var5.n(qqgVar3);
                return qqgVar3;
            case 5:
                ld0 ld0Var6 = new ld0(3, (Continuation) obj3, 5);
                ld0Var6.Y = (vc1) obj;
                ld0Var6.X = (jcg) obj2;
                return ld0Var6.n(qqg.a);
            case 6:
                ld0 ld0Var7 = new ld0((os2) this.Y, (Continuation) obj3, 6);
                ld0Var7.X = (yeb) obj2;
                qqg qqgVar4 = qqg.a;
                ld0Var7.n(qqgVar4);
                return qqgVar4;
            case 7:
                ld0 ld0Var8 = new ld0(3, (Continuation) obj3, 7);
                ld0Var8.Y = (tz2) obj;
                ld0Var8.X = (g7e) obj2;
                return ld0Var8.n(qqg.a);
            case 8:
                ld0 ld0Var9 = new ld0(3, (Continuation) obj3, 8);
                ld0Var9.Y = (gu4) obj;
                ld0Var9.X = (yeb) obj2;
                qqg qqgVar5 = qqg.a;
                ld0Var9.n(qqgVar5);
                return qqgVar5;
            case 9:
                ld0 ld0Var10 = new ld0(this.X, (Continuation) obj3, 9, false);
                ld0Var10.Y = (Throwable) obj2;
                qqg qqgVar6 = qqg.a;
                ld0Var10.n(qqgVar6);
                return qqgVar6;
            case 10:
                ld0 ld0Var11 = new ld0(3, (Continuation) obj3, 10);
                ld0Var11.Y = (v03) obj;
                ld0Var11.X = (List) obj2;
                return ld0Var11.n(qqg.a);
            case 11:
                ld0 ld0Var12 = new ld0(this.X, (Continuation) obj3, 11, false);
                ld0Var12.Y = (TextView) obj;
                qqg qqgVar7 = qqg.a;
                ld0Var12.n(qqgVar7);
                return qqgVar7;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ld0 ld0Var13 = new ld0(3, (Continuation) obj3, 12);
                ld0Var13.Y = (xec) obj;
                ld0Var13.X = (List) obj2;
                return ld0Var13.n(qqg.a);
            case 13:
                ld0 ld0Var14 = new ld0((fc5) this.Y, (Context) this.X, (Continuation) obj3, 13);
                qqg qqgVar8 = qqg.a;
                ld0Var14.n(qqgVar8);
                return qqgVar8;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ld0 ld0Var15 = new ld0((y06) this.Y, (Continuation) obj3, 14);
                ld0Var15.X = (yeb) obj2;
                qqg qqgVar9 = qqg.a;
                ld0Var15.n(qqgVar9);
                return qqgVar9;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ld0 ld0Var16 = new ld0((h96) this.Y, (Continuation) obj3, 15);
                ld0Var16.X = (yeb) obj2;
                qqg qqgVar10 = qqg.a;
                ld0Var16.n(qqgVar10);
                return qqgVar10;
            case 16:
                ld0 ld0Var17 = new ld0(3, (Continuation) obj3, 16);
                ld0Var17.Y = (muc) obj;
                ld0Var17.X = (yeb) obj2;
                qqg qqgVar11 = qqg.a;
                ld0Var17.n(qqgVar11);
                return qqgVar11;
            case LangUtils.HASH_SEED /* 17 */:
                ld0 ld0Var18 = new ld0(this.X, (Continuation) obj3, 17, false);
                ld0Var18.Y = (FrameLayout) obj;
                qqg qqgVar12 = qqg.a;
                ld0Var18.n(qqgVar12);
                return qqgVar12;
            case 18:
                ld0 ld0Var19 = new ld0((b18) this.Y, (Continuation) obj3, 18);
                ld0Var19.X = (yeb) obj2;
                qqg qqgVar13 = qqg.a;
                ld0Var19.n(qqgVar13);
                return qqgVar13;
            case 19:
                ld0 ld0Var20 = new ld0(3, (Continuation) obj3, 19);
                ld0Var20.Y = (a38) obj;
                ld0Var20.X = (yeb) obj2;
                qqg qqgVar14 = qqg.a;
                ld0Var20.n(qqgVar14);
                return qqgVar14;
            case 20:
                ld0 ld0Var21 = new ld0(3, (Continuation) obj3, 20);
                ld0Var21.Y = (p88) obj;
                ld0Var21.X = (yeb) obj2;
                qqg qqgVar15 = qqg.a;
                ld0Var21.n(qqgVar15);
                return qqgVar15;
            case 21:
                ld0 ld0Var22 = new ld0(3, (Continuation) obj3, 21);
                ld0Var22.Y = (ef8) obj;
                ld0Var22.X = (yeb) obj2;
                qqg qqgVar16 = qqg.a;
                ld0Var22.n(qqgVar16);
                return qqgVar16;
            case 22:
                ld0 ld0Var23 = new ld0(3, (Continuation) obj3, 22);
                ld0Var23.Y = (z26) obj;
                ld0Var23.X = (Throwable) obj2;
                qqg qqgVar17 = qqg.a;
                ld0Var23.n(qqgVar17);
                return qqgVar17;
            case 23:
                ld0 ld0Var24 = new ld0((GradientDrawable) this.Y, (Continuation) obj3, 23);
                ld0Var24.X = (yeb) obj2;
                qqg qqgVar18 = qqg.a;
                ld0Var24.n(qqgVar18);
                return qqgVar18;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ld0 ld0Var25 = new ld0((en9) this.Y, (View) this.X, (Continuation) obj3, 24);
                qqg qqgVar19 = qqg.a;
                ld0Var25.n(qqgVar19);
                return qqgVar19;
            case 25:
                ld0 ld0Var26 = new ld0(3, (Continuation) obj3, 25);
                ld0Var26.Y = (pb2) obj;
                ld0Var26.X = (hr9) obj2;
                return ld0Var26.n(qqg.a);
            case 26:
                ld0 ld0Var27 = new ld0(this.X, (Continuation) obj3, 26, false);
                ld0Var27.Y = (Throwable) obj2;
                qqg qqgVar20 = qqg.a;
                ld0Var27.n(qqgVar20);
                return qqgVar20;
            case 27:
                ld0 ld0Var28 = new ld0(this.X, (Continuation) obj3, 27, false);
                ld0Var28.Y = (tr0) obj;
                qqg qqgVar21 = qqg.a;
                ld0Var28.n(qqgVar21);
                return qqgVar21;
            case 28:
                ld0 ld0Var29 = new ld0(this.X, (Continuation) obj3, 28, false);
                ld0Var29.Y = (EndlessRecyclerView2) obj;
                qqg qqgVar22 = qqg.a;
                ld0Var29.n(qqgVar22);
                return qqgVar22;
            default:
                ld0 ld0Var30 = new ld0(3, (Continuation) obj3, 29);
                ld0Var30.Y = (fwe) obj;
                ld0Var30.X = (yeb) obj2;
                qqg qqgVar23 = qqg.a;
                ld0Var30.n(qqgVar23);
                return qqgVar23;
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                g8j.b(obj);
                ((zc0) this.Y).setBackgroundColor(((yeb) this.X).b().a.k);
                break;
            case 1:
                g8j.b(obj);
                yeb yebVar = (yeb) this.X;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.Y;
                yeb yebVarC0 = baseBottomSheetWidget.C0();
                if (yebVarC0 != null) {
                    yebVar = yebVarC0;
                }
                baseBottomSheetWidget.B0().setBackground(new ColorDrawable(yebVar.b().h));
                break;
            case 2:
                g8j.b(obj);
                Long l = (Long) this.Y;
                if (!(((mb4) this.X).l instanceof ao5)) {
                    break;
                }
                break;
            case 3:
                g8j.b(obj);
                bt1 bt1Var = (bt1) this.Y;
                if (!(((vc1) this.X).e instanceof zn5)) {
                    break;
                } else {
                    break;
                }
            case 4:
                g8j.b(obj);
                gk1 gk1Var = (gk1) this.Y;
                yeb yebVar2 = (yeb) this.X;
                gk1Var.setBackgroundColor(a93.s0.y(gk1Var).a().k().a.d);
                gk1Var.onThemeChanged(yebVar2);
                break;
            case 5:
                g8j.b(obj);
                vc1 vc1Var = (vc1) this.Y;
                jcg jcgVar = (jcg) this.X;
                boolean z = vc1Var.g;
                boolean z2 = vc1Var.m;
                boolean z3 = z || (vc1Var.t && z2);
                boolean z4 = vc1Var.j.c;
                co5 co5Var = vc1Var.e;
                boolean z5 = co5Var instanceof bo5;
                break;
            case 6:
                g8j.b(obj);
                yeb yebVar3 = (yeb) this.X;
                os2 os2Var = (os2) this.Y;
                os2Var.E0.onThemeChanged(yebVar3);
                ?? r0 = os2Var.F0;
                if (r0.e()) {
                    ((TextView) r0.getValue()).setTextColor(yebVar3.getText().b);
                    break;
                }
                break;
            case 7:
                g8j.b(obj);
                break;
            case 8:
                g8j.b(obj);
                ((gu4) this.Y).onThemeChanged((yeb) this.X);
                break;
            case 9:
                g8j.b(obj);
                Throwable th = (Throwable) this.Y;
                if (!(th instanceof CancellationException)) {
                    wqi.e(((b43) this.X).O0, "observeChatsAndPresences fail", th);
                    break;
                }
                break;
            case 10:
                g8j.b(obj);
                break;
            case 11:
                v1a v1aVar = a93.s0;
                g8j.b(obj);
                TextView textView = (TextView) this.Y;
                Integer num = ((b44) this.X).c;
                textView.setTextColor(num != null ? v1aVar.y(textView).g(num.intValue()) : v1aVar.y(textView).getText().e);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                g8j.b(obj);
                break;
            case 13:
                g8j.b(obj);
                fc5 fc5Var = (fc5) this.Y;
                cei.k(fc5Var.E0, a93.s0.x((Context) this.X).k().b().a.h);
                e62 e62Var = fc5Var.I0;
                if (e62Var != null) {
                    fc5Var.F(e62Var.c);
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                g8j.b(obj);
                yeb yebVar4 = (yeb) this.X;
                y06 y06Var = (y06) this.Y;
                w3b w3bVar = y06Var.E0;
                t2i.c(w3bVar, yebVar4);
                w3bVar.setTextColor(yebVar4.getText().e);
                w3bVar.setHintTextColor(yebVar4.getText().i);
                w3bVar.setBackgroundColor(yebVar4.b().h);
                ?? r02 = y06Var.F0;
                if (r02.e()) {
                    ((AppCompatTextView) r02.getValue()).setTextColor(yebVar4.getText().b);
                    break;
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                g8j.b(obj);
                ((h96) this.Y).E0.onThemeChanged((yeb) this.X);
                break;
            case 16:
                g8j.b(obj);
                muc mucVar = (muc) this.Y;
                yeb yebVar5 = (yeb) this.X;
                mucVar.setBackgroundColor(a93.s0.y(mucVar).a().k().a.d);
                mucVar.onThemeChanged(yebVar5);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                v1a v1aVar2 = a93.s0;
                g8j.b(obj);
                FrameLayout frameLayout = (FrameLayout) this.Y;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.X;
                hs hsVar = inviteByQrBottomSheet.N0;
                yy7[] yy7VarArr = InviteByQrBottomSheet.O0;
                yy7 yy7Var = yy7VarArr[4];
                if (!((Boolean) hsVar.a(inviteByQrBottomSheet)).booleanValue() || !v1aVar2.x(frameLayout.getContext()).l()) {
                    yy7 yy7Var2 = yy7VarArr[4];
                    if (((Boolean) hsVar.a(inviteByQrBottomSheet)).booleanValue() || v1aVar2.x(frameLayout.getContext()).l()) {
                        boolean zL = v1aVar2.x(frameLayout.getContext()).l();
                        yy7 yy7Var3 = yy7VarArr[4];
                        hsVar.b(inviteByQrBottomSheet, Boolean.valueOf(zL));
                        OneMeButton oneMeButton = (OneMeButton) inviteByQrBottomSheet.F0.D(inviteByQrBottomSheet, yy7VarArr[2]);
                        h5b h5bVar = h5b.d;
                        yy7 yy7Var4 = yy7VarArr[4];
                        oneMeButton.setCustomTheme(h5bVar.a(((Boolean) hsVar.a(inviteByQrBottomSheet)).booleanValue()));
                        ds7 ds7Var = (ds7) inviteByQrBottomSheet.K0.getValue();
                        erc ercVarO0 = inviteByQrBottomSheet.O0();
                        yy7[] yy7VarArr2 = ds7.s0;
                        ds7Var.t(ercVarO0, false, 0);
                        break;
                    }
                }
                break;
            case 18:
                g8j.b(obj);
                yeb yebVar6 = (yeb) this.X;
                b18 b18Var = (b18) this.Y;
                w3b w3bVar2 = b18Var.E0;
                t2i.c(w3bVar2, yebVar6);
                w3bVar2.setTextColor(yebVar6.getText().e);
                w3bVar2.setHintTextColor(yebVar6.getText().i);
                w3bVar2.setBackgroundColor(yebVar6.b().h);
                ?? r03 = b18Var.F0;
                if (r03.e()) {
                    ((AppCompatTextView) r03.getValue()).setTextColor(yebVar6.getText().b);
                    break;
                }
                break;
            case 19:
                g8j.b(obj);
                ((a38) this.Y).c.setImageTintList(ColorStateList.valueOf(((yeb) this.X).getText().e));
                break;
            case 20:
                g8j.b(obj);
                ((p88) this.Y).setTextColor(((yeb) this.X).getText().j);
                break;
            case 21:
                g8j.b(obj);
                ef8 ef8Var = (ef8) this.Y;
                yeb yebVar7 = (yeb) this.X;
                ef8Var.setBackground(new RippleDrawable(ColorStateList.valueOf(yebVar7.c().a.a.i), new ColorDrawable(yebVar7.b().h), new ColorDrawable(-65536)));
                break;
            case 22:
                g8j.b(obj);
                z26 z26Var = (z26) this.Y;
                Throwable th2 = (Throwable) this.X;
                if (!(th2 instanceof CancellationException)) {
                    wqi.e(z26Var.getClass().getName(), "fail to check link", th2);
                    break;
                }
                break;
            case 23:
                g8j.b(obj);
                yeb yebVar8 = (yeb) this.X;
                GradientDrawable gradientDrawable = (GradientDrawable) this.Y;
                yebVar8.b();
                cei.k(gradientDrawable, -1728053248);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                g8j.b(obj);
                en9 en9Var = (en9) this.Y;
                fn9 fn9Var = en9Var.H0;
                if (fn9Var != null) {
                    boolean zA = du0.a(fn9Var.a & 2080374784);
                    sy2 sy2VarA = a93.s0.y((View) this.X).a();
                    en9Var.a(sy2VarA.h(zA));
                    en9Var.d(sy2VarA.G());
                    break;
                }
                break;
            case 25:
                g8j.b(obj);
                break;
            case 26:
                g8j.b(obj);
                wqi.g(((MessagesListWidget) this.X).a, (Throwable) this.Y, "messages list update error", new Object[0]);
                break;
            case 27:
                v1a v1aVar3 = a93.s0;
                g8j.b(obj);
                tr0 tr0Var = (tr0) this.Y;
                Drawable background = tr0Var.getBackground();
                ww6 ww6Var = background instanceof ww6 ? (ww6) background : null;
                if (ww6Var != null) {
                    ww6Var.d.O(ww6Var, ww6.s0[0], ((sd5) this.X).d != null ? new int[]{v1aVar3.y(tr0Var).a().G().b.d.g, v1aVar3.y(tr0Var).a().G().b.d.h} : new int[]{v1aVar3.y(tr0Var).a().G().b.d.i, v1aVar3.y(tr0Var).a().G().b.d.j});
                    ww6Var.d(v1aVar3.y(tr0Var).a().G());
                    break;
                }
                break;
            case 28:
                g8j.b(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Y;
                okf okfVar = ((MessagesListWidget) this.X).J0;
                if (okfVar != null) {
                    okfVar.j();
                }
                endlessRecyclerView2.Y();
                break;
            default:
                g8j.b(obj);
                fwe fweVar = (fwe) this.Y;
                yeb yebVar9 = (yeb) this.X;
                ulc ulcVar = new ulc(4);
                bwe bweVar = (bwe) ulcVar.b;
                bweVar.j = false;
                ulcVar.q(yebVar9.b().m);
                bweVar.d = yebVar9.b().l;
                ulcVar.p(1.0f);
                ulcVar.s(kti.d(86 * vw4.d().getDisplayMetrics().density));
                fweVar.a(ulcVar.k());
                break;
        }
        return qqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(d2f d2fVar, Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = d2fVar;
        this.X = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(Object obj, Continuation continuation, int i, boolean z) {
        super(3, continuation);
        this.o = i;
        this.X = obj;
    }
}
