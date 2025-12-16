package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class nv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nv9 nv9Var = (nv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nv9 nv9Var = new nv9(continuation, this.X);
        nv9Var.o = obj;
        return nv9Var;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        Object[] objArr2;
        int i;
        g8j.b(obj);
        m8a m8aVar = (m8a) this.o;
        MessagesListWidget messagesListWidget = this.X;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        t26 t26Var = (t26) messagesListWidget.D0.getValue();
        EndlessRecyclerView2 endlessRecyclerView2H0 = this.X.H0();
        if (!t26Var.Z || !fni.a(t26Var.s0, endlessRecyclerView2H0)) {
            t26Var.Z = true;
            EndlessRecyclerView2 endlessRecyclerView2 = t26Var.s0;
            if (endlessRecyclerView2 != null) {
                endlessRecyclerView2.p0(t26Var);
            }
            endlessRecyclerView2H0.j(t26Var);
            t26Var.s0 = endlessRecyclerView2H0;
        }
        t26 t26Var2 = (t26) this.X.D0.getValue();
        t26Var2.getClass();
        long[] jArr5 = m8aVar.b;
        Object[] objArr3 = m8aVar.c;
        long[] jArr6 = m8aVar.a;
        int length = jArr6.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr6[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            long j2 = jArr5[i6];
                            dl9 dl9Var = (dl9) objArr3[i6];
                            i = i3;
                            m8a m8aVar2 = t26Var2.c;
                            if (m8aVar2.d(j2) == null) {
                                jArr3 = jArr6;
                                gxa gxaVar = new gxa(t26Var2.a);
                                String str = dl9Var.b;
                                jArr4 = jArr5;
                                objArr2 = objArr3;
                                Long lValueOf = Long.valueOf(dl9Var.a);
                                CharSequence charSequence = dl9Var.c;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                gxaVar.b(fui.a(charSequence, lValueOf), str);
                                int i7 = t26Var2.o;
                                gxaVar.setBounds(0, 0, i7, i7);
                                gxaVar.setCallback((s26) t26Var2.t0.getValue());
                                m8aVar2.h(j2, gxaVar);
                                j >>= i;
                                i5++;
                                i3 = i;
                                jArr6 = jArr3;
                                jArr5 = jArr4;
                                objArr3 = objArr2;
                            } else {
                                jArr3 = jArr6;
                                jArr4 = jArr5;
                                objArr2 = objArr3;
                            }
                        } else {
                            jArr3 = jArr6;
                            jArr4 = jArr5;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr6 = jArr3;
                        jArr5 = jArr4;
                        objArr3 = objArr2;
                    }
                    jArr = jArr6;
                    jArr2 = jArr5;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    jArr2 = jArr5;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr6 = jArr;
                jArr5 = jArr2;
                objArr3 = objArr;
            }
        }
        String name = t26.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(t26Var2.c.e, "avatars.size = "), null);
            }
        }
        this.X.H0().Y();
        return qqg.a;
    }
}
