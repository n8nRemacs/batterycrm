package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* loaded from: classes.dex */
public final class s2i {
    public final /* synthetic */ int a;
    public final Widget b;
    public final Object c;

    public s2i(Widget widget, int i) {
        this.a = i;
        switch (i) {
            case 1:
                bwf bwfVarD = vrb.a.getAccessor().d(13);
                this.b = widget;
                this.c = bwfVarD;
                break;
            default:
                this.b = widget;
                this.c = ipi.b(3, new kvf(26, this));
                break;
        }
    }

    private final void d(String[] strArr, int i, int i2, int i3, int i4, yrb yrbVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static void g(s2i s2iVar, int i, Integer num, Intent intent, yrb yrbVar, boolean z, Integer num2, int i2) {
        Integer num3 = (i2 & 2) != 0 ? null : num;
        Intent intent2 = (i2 & 4) != 0 ? null : intent;
        yrb yrbVar2 = (i2 & 8) != 0 ? null : yrbVar;
        boolean z2 = (i2 & 16) != 0 ? false : z;
        Integer num4 = (i2 & 32) != 0 ? null : num2;
        switch (s2iVar.a) {
            case 0:
                g((s2i) s2iVar.c.getValue(), i, num3, intent2, new wrb(y9b.c), false, null, 48);
                break;
            default:
                yy7[] yy7VarArr = BottomSheetWidget.B0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(i, num3, yrbVar2, intent2, z2, num4);
                Widget widget = s2iVar.b;
                permissionBottomSheet.setTargetController(widget);
                c54 parentController = widget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                permissionBottomSheet.N0(widget);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(permissionBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                    break;
                }
                break;
        }
    }

    public void a() {
        ccb ccbVar = new ccb(this.b);
        ccbVar.g(new n5g(e0b.a));
        ccbVar.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(e0b.i, null, null, 4);
        oq3VarE.f(new n5g(e0b.h));
        oq3VarE.c(d0b.c, new n5g(e0b.g));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
        Widget widget = this.b;
        confirmationBottomSheetE.setTargetController(widget);
        c54 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(widget);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String[] strArr, int i, int i2, int i3, int i4, yrb yrbVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                yy7[] yy7VarArr = BottomSheetWidget.B0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(strArr, i, i2, i3, i4, yrbVar);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                c54 parentController = widget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                permissionBottomSheet.N0(widget);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(permissionBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    public final void e(int i, String[] strArr) {
        Object ipdVar;
        int i2 = this.a;
        ?? r1 = this.c;
        switch (i2) {
            case 0:
                ((s2i) r1.getValue()).e(i, strArr);
                break;
            default:
                Widget widget = this.b;
                if (i != 180) {
                    widget.requestPermissions(strArr, i);
                    break;
                } else {
                    tzg tzgVar = (tzg) ((k18) r1).getValue();
                    Context context = widget.getContext();
                    tzgVar.getClass();
                    String str = ap7.a;
                    try {
                        context.startActivity(ap7.c(context, tzgVar.a));
                        ipdVar = qqg.a;
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    Throwable thA = kpd.a(ipdVar);
                    if (thA != null) {
                        wqi.e(ap7.a, "showFsiSettings getOpenFsiSettingsIntent error " + thA, null);
                        String str2 = ap7.a;
                        context.startActivity(ap7.b(context));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    public final boolean f(String str) {
        switch (this.a) {
            case 0:
                return ((s2i) this.c.getValue()).f(str);
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    String[] strArr = qsb.d;
                    if (ys.i(qsb.p, str)) {
                        return true;
                    }
                }
                return this.b.shouldShowRequestPermissionRationale(str);
        }
    }
}
