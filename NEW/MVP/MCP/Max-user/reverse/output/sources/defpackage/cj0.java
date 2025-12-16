package defpackage;

import android.text.Spanned;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class cj0 implements sm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ cj0(int i) {
        this.a = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rf2 rf2Var;
        rf2 rf2Var2;
        rf2 rf2Var3;
        rf2 rf2Var4;
        ku3 ku3VarN;
        ku3 ku3VarN2;
        boolean z = true;
        switch (this.a) {
            case 0:
                r03 r03Var = (r03) obj;
                r03 r03Var2 = (r03) obj2;
                q03 q03Var = q03.a;
                if ((r03Var instanceof q03) || (r03Var2 instanceof q03)) {
                    return q03Var;
                }
                if (!(r03Var instanceof p03) || !(r03Var2 instanceof p03)) {
                    if (r03Var2 instanceof p03) {
                        throw new IllegalStateException("Unreachable");
                    }
                    if (r03Var2.equals(q03Var)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xs xsVar = new xs(0);
                p03 p03Var = (p03) r03Var;
                xsVar.addAll(p03Var.a);
                p03 p03Var2 = (p03) r03Var2;
                xsVar.addAll(p03Var2.a);
                if (!p03Var.b && !p03Var2.b) {
                    z = false;
                }
                xs xsVar2 = new xs(0);
                xsVar2.addAll(p03Var.c);
                xsVar2.addAll(p03Var2.c);
                return new p03(xsVar, z, xsVar2);
            case 1:
                return qqg.a;
            case 2:
                n8a n8aVar = ((ww3) obj).a;
                int i = n8aVar.d;
                n8a n8aVar2 = ((ww3) obj2).a;
                n8a n8aVar3 = new n8a(i + n8aVar2.d);
                n8aVar3.b(n8aVar);
                n8aVar3.b(n8aVar2);
                return new ww3(n8aVar3);
            case 3:
                return Boolean.valueOf(((onb) obj).a.a.r() == ((onb) obj2).a.a.r());
            case 4:
                return Boolean.valueOf(((onb) obj).a.a.r() == ((onb) obj2).a.a.r());
            case 5:
                pb2 pb2Var = (pb2) obj;
                pb2 pb2Var2 = (pb2) obj2;
                if (fni.a((pb2Var == null || (rf2Var4 = pb2Var.b) == null) ? null : Integer.valueOf(rf2Var4.c()), (pb2Var2 == null || (rf2Var3 = pb2Var2.b) == null) ? null : Integer.valueOf(rf2Var3.c()))) {
                    if (fni.a((pb2Var == null || (rf2Var2 = pb2Var.b) == null) ? null : Integer.valueOf(rf2Var2.m), (pb2Var2 == null || (rf2Var = pb2Var2.b) == null) ? null : Integer.valueOf(rf2Var.m))) {
                        if (fni.a(pb2Var != null ? pb2Var.s() : null, pb2Var2 != null ? pb2Var2.s() : null)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                n41 n41Var = (n41) obj;
                n41 n41Var2 = (n41) obj2;
                if (fni.a(n41Var.d, n41Var2.d) && fni.a(n41Var.a, n41Var2.a) && fni.a(n41Var.b, n41Var2.b)) {
                    CharSequence charSequence = n41Var.c;
                    String string = charSequence != null ? charSequence.toString() : null;
                    CharSequence charSequence2 = n41Var2.c;
                    if (fni.a(string, charSequence2 != null ? charSequence2.toString() : null)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                pb2 pb2Var3 = (pb2) obj;
                pb2 pb2Var4 = (pb2) obj2;
                ku3 ku3VarN3 = pb2Var3.n();
                Long lValueOf = ku3VarN3 != null ? Long.valueOf(ku3VarN3.p()) : null;
                ku3 ku3VarN4 = pb2Var4.n();
                if (fni.a(lValueOf, ku3VarN4 != null ? Long.valueOf(ku3VarN4.p()) : null) && pb2Var3.K() == pb2Var4.K() && fni.a(pb2Var3.r(false).toString(), pb2Var4.r(true)) && pb2Var3.h() == pb2Var4.h()) {
                    if ((pb2Var3.b0() || ((ku3VarN2 = pb2Var3.n()) != null && ku3VarN2.x())) == (pb2Var4.b0() || ((ku3VarN = pb2Var4.n()) != null && ku3VarN.x()))) {
                        pb2Var3.q0();
                        CharSequence charSequence3 = pb2Var3.w0;
                        pb2Var4.q0();
                        if (fni.a(charSequence3, pb2Var4.w0)) {
                            pb2Var3.p0();
                            CharSequence charSequence4 = pb2Var3.t0;
                            pb2Var4.p0();
                            if (fni.a(charSequence4, pb2Var4.t0)) {
                                rf2 rf2Var5 = pb2Var3.b;
                                if (rf2Var5.a == pb2Var4.b.a && rf2Var5.c() == pb2Var4.b.c()) {
                                    qf2 qf2VarT = pb2Var3.t();
                                    String str = qf2VarT != null ? qf2VarT.c : null;
                                    qf2 qf2VarT2 = pb2Var4.t();
                                    if (fni.a(str, qf2VarT2 != null ? qf2VarT2.c : null)) {
                                        il0 il0Var = il0.b;
                                        hl0 hl0Var = hl0.a;
                                        if (fni.a(pb2Var3.i(il0Var, hl0Var), pb2Var4.i(il0Var, hl0Var))) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                wqi.c((String) obj, (String) obj2, new Object[0]);
                return qqg.a;
            case 9:
                n8a n8aVar4 = ((ww3) obj).a;
                int i2 = n8aVar4.d;
                n8a n8aVar5 = ((ww3) obj2).a;
                n8a n8aVar6 = new n8a(i2 + n8aVar5.d);
                n8aVar6.b(n8aVar4);
                n8aVar6.b(n8aVar5);
                return new ww3(n8aVar6);
            case 10:
                return obj;
            case 11:
                return new tn3(obj, obj2);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 13:
                return ((x74) obj).plus((v74) obj2);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((x74) obj).plus((v74) obj2);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Boolean.valueOf(((hvg) obj2).a <= ((hvg) obj).a);
            case 16:
                return Boolean.valueOf(fni.a(obj, obj2));
            case LangUtils.HASH_SEED /* 17 */:
                return Integer.valueOf(pmi.a(((eh9) obj).a.c, ((eh9) obj2).a.c));
            case 18:
                dc9 dc9Var = (dc9) obj2;
                dc9 dc9Var2 = dc9.a;
                if ((((dc9) obj) instanceof dc9) || (dc9Var instanceof dc9)) {
                    return dc9Var2;
                }
                if (dc9Var.equals(dc9Var2)) {
                    throw new IllegalStateException("Unreachable");
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                n8a n8aVar7 = (n8a) obj;
                n8a n8aVar8 = (n8a) obj2;
                n8a n8aVar9 = new n8a(n8aVar7.d + n8aVar8.d);
                n8aVar9.b(n8aVar7);
                n8aVar9.b(n8aVar8);
                return n8aVar9;
            case 20:
                ku3 ku3Var = (ku3) obj;
                ku3 ku3Var2 = (ku3) obj2;
                return Boolean.valueOf(fni.a(ku3Var != null ? ku3Var.a.b.w : null, ku3Var2 != null ? ku3Var2.a.b.w : null));
            case 21:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                ve3.p();
                                throw null;
                            }
                            hs2 hs2Var = (hs2) next;
                            hs2 hs2Var2 = (hs2) list2.get(i3);
                            if (hs2Var.a == hs2Var2.a && fni.a(hs2Var.c, hs2Var2.c)) {
                                CharSequence charSequence5 = hs2Var.X;
                                CharSequence charSequence6 = hs2Var2.X;
                                if ((charSequence5 instanceof Spanned ? jbj.a((Spanned) charSequence5) : charSequence5.hashCode()) == (charSequence6 instanceof Spanned ? jbj.a((Spanned) charSequence6) : charSequence6.hashCode()) && fni.a(hs2Var.Y, hs2Var2.Y) && fni.a(hs2Var.v0, hs2Var2.v0) && hs2Var.w0 == hs2Var2.w0 && hs2Var.x0 == hs2Var2.x0 && hs2Var.y0 == hs2Var2.y0 && hs2Var.x() == hs2Var2.x() && hs2Var.o() == hs2Var2.o() && hs2Var.p() == hs2Var2.p() && hs2Var.z0 == hs2Var2.z0 && fni.a(hs2Var.A0, hs2Var2.A0) && fni.a(hs2Var.b, hs2Var2.b) && hs2Var.B0 == hs2Var2.B0) {
                                    i3 = i4;
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                return OneLogDirect.send$lambda$0((OneLogItem) obj, (Exception) obj2);
            case 23:
                return Boolean.valueOf(((yeb) obj).h() == ((yeb) obj2).h());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return Boolean.valueOf(((hvg) obj2).a <= ((hvg) obj).a);
            case 25:
                n8a n8aVar10 = ((ww3) obj).a;
                int i5 = n8aVar10.d;
                n8a n8aVar11 = ((ww3) obj2).a;
                n8a n8aVar12 = new n8a(i5 + n8aVar11.d);
                n8aVar12.b(n8aVar10);
                n8aVar12.b(n8aVar11);
                return new ww3(n8aVar12);
            case 26:
                return (Conversation) obj2;
            case 27:
                yy7[] yy7VarArr = PickerChatsTabWidget.x0;
                return qqg.a;
            case 28:
                pb2 pb2Var5 = (pb2) obj;
                pb2 pb2Var6 = (pb2) obj2;
                if (fni.a(pb2Var5.o, pb2Var6.o) && pb2Var5.z() == pb2Var6.z()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((pb2) obj).b.i0 == ((pb2) obj2).b.i0);
        }
    }
}
