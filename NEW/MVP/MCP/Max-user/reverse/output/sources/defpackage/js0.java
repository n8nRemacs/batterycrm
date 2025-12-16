package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class js0 implements um6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ js0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object next;
        switch (this.a) {
            case 0:
                ks0 ks0Var = (ks0) this.b;
                ImageView imageView = (ImageView) obj;
                ((Boolean) obj2).getClass();
                yeb yebVar = (yeb) obj3;
                int iV = az1.v(ks0Var.I0);
                if (iV == 0) {
                    i = yebVar.getIcon().a.c.a;
                } else {
                    if (iV != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = yebVar.getIcon().a.c.b;
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                break;
            case 1:
                ((ia) this.b).invoke((Throwable) obj);
                break;
            case 2:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
                long jLongValue = ((Long) obj).longValue();
                x8d x8dVar = (x8d) obj2;
                View view = (View) obj3;
                dad dadVar = messagesListWidget.a1;
                if (dadVar != null) {
                    lg8 lg8Var = lg8.d;
                    Iterator it = dadVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            z9d z9dVar = (z9d) next;
                            if (z9dVar.a != jLongValue || !fni.a(z9dVar.c, x8dVar)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    z9d z9dVar2 = (z9d) next;
                    if (z9dVar2 == null) {
                        String str = dadVar.d;
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null && l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "Can't play reaction effect because don't have state, reaction:" + ((Object) x8dVar) + ", l:" + jLongValue, null);
                        }
                    } else {
                        mid midVarN = dadVar.a.N(z9dVar2.a);
                        if (dadVar.e(midVarN != null ? midVarN.g() : -1)) {
                            String str2 = dadVar.d;
                            l6b l6bVar2 = wqi.a;
                            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                                l6bVar2.c(lg8Var, str2, "Make reaction effect pending, reaction:" + ((Object) x8dVar) + ", msgId:" + jLongValue, null);
                            }
                            dadVar.f.add(Long.valueOf(z9dVar2.a));
                        } else {
                            dadVar.f.remove(Long.valueOf(z9dVar2.a));
                            dadVar.e.remove(z9dVar2);
                            View view2 = midVarN.a;
                            mgb.a(view2, new aad(view2, dadVar, view, z9dVar2, x8dVar, jLongValue));
                        }
                    }
                }
                return qqg.a;
            case 3:
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                g4i g4iVar = (g4i) obj2;
                yy7[] yy7VarArr = ProfileScreen.C0;
                in inVar = (in) profileScreen.o.D(profileScreen, ProfileScreen.C0[0]);
                inVar.setPadding(inVar.getPaddingLeft(), kti.d(4 * vw4.d().getDisplayMetrics().density), inVar.getPaddingRight(), inVar.getPaddingBottom());
                return g4iVar;
            default:
                ((wce) this.b).c();
                break;
        }
        return qqg.a;
    }
}
