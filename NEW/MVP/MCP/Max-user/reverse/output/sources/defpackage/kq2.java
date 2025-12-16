package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class kq2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ yq2 Y;
    public final /* synthetic */ int Z;
    public j09 o;
    public final /* synthetic */ Bundle s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq2(yq2 yq2Var, int i, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.Y = yq2Var;
        this.Z = i;
        this.s0 = bundle;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kq2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        j09 j09VarE;
        String string;
        i88 i88Var;
        String string2;
        i88 i88Var2;
        int i;
        i88 i88Var3;
        Object objI;
        yq2 yq2Var = this.Y;
        t9f t9fVar = yq2Var.s1;
        ContextScope contextScope = yq2Var.a;
        ci5 ci5Var = yq2Var.V0;
        ci5 ci5Var2 = yq2Var.U0;
        int i2 = this.X;
        qqg qqgVar = qqg.a;
        if (i2 == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = yq2.u1;
            j09VarE = yq2Var.E();
            if (j09VarE != null) {
                int i3 = fyc.oneme_chatmedia_viewer_bulk_saving_only_this;
                int i4 = this.Z;
                if (i4 == i3) {
                    yq2Var.B((dv5) yq2Var.E0.getValue(), j09VarE, yq2Var.b, j09VarE.j());
                    return qqgVar;
                }
                if (i4 == fyc.oneme_chatmedia_viewer_bulk_saving_all) {
                    yq2Var.A((dv5) yq2Var.E0.getValue(), j09VarE, yq2Var.b, j09VarE.j());
                    return qqgVar;
                }
                if (i4 == fyc.oneme_chatmedia_viewer_toolbar_action_save_gallery) {
                    m00 m00VarV = j09VarE.v();
                    if (m00VarV instanceof ae3) {
                        this.o = j09VarE;
                        this.X = 1;
                        objI = svi.i(((q2b) yq2Var.t0).b(), new tp2((ae3) m00VarV, yq2Var, null), this);
                        g84 g84Var = g84.a;
                        if (objI == g84Var) {
                            return g84Var;
                        }
                    }
                    yq2Var.B((dv5) yq2Var.E0.getValue(), j09VarE, yq2Var.b, j09VarE.j());
                    return qqgVar;
                }
                if (i4 == fyc.oneme_chatmedia_viewer_toolbar_action_share) {
                    boolean z = j09VarE instanceof b09;
                    xfh.r(ci5Var2, new wh5(j09VarE.j(), j09VarE.i(), j09VarE.w(), (z && ((b09) j09VarE).o) ? o05.d : z ? o05.c : o05.a));
                    return qqgVar;
                }
                if (i4 == fyc.oneme_chatmedia_viewer_toolbar_action_forward_attach) {
                    ko2 ko2Var = ko2.c;
                    long j = j09VarE.j();
                    Long l = new Long(j09VarE.i());
                    ko2Var.getClass();
                    xfh.r(ci5Var, ko2.L0(j, l));
                    return qqgVar;
                }
                if (i4 == fyc.oneme_chatmedia_viewer_toolbar_action_goto_message) {
                    ko2 ko2Var2 = ko2.c;
                    long j2 = yq2Var.b;
                    long j3 = j09VarE.j();
                    ko2Var2.getClass();
                    xc0.l(":chats?id=" + j2 + "&type=local&message_id=" + j3, ci5Var);
                    return qqgVar;
                }
                if (i4 == fyc.oneme_chatmedia_viewer_info_panel_forward_message_view) {
                    ko2 ko2Var3 = ko2.c;
                    long j4 = j09VarE.j();
                    ko2Var3.getClass();
                    xfh.r(ci5Var, ko2.L0(j4, null));
                    return qqgVar;
                }
                int i5 = evd.i;
                zg5 zg5Var = i88.Z;
                Bundle bundle = this.s0;
                if (i4 == i5) {
                    if (bundle != null) {
                        long j5 = bundle.getLong("chat.media.viewer.entity_id");
                        if (j5 > 0) {
                            t9fVar.O(yq2Var, yq2.u1[7], svi.e(contextScope, null, null, new aq2(yq2Var, j5, null), 3));
                            return qqgVar;
                        }
                        String string3 = bundle.getString("chat.media.viewer.link");
                        if (string3 != null && (i88Var3 = (i88) ue3.J(bundle.getInt("chat.media.viewer.link_type", -1), zg5Var)) != null) {
                            yq2Var.H(string3, i88Var3);
                            return qqgVar;
                        }
                    }
                } else if (i4 == evd.j) {
                    if (bundle != null) {
                        t9fVar.O(yq2Var, yq2.u1[7], svi.e(contextScope, null, null, new zp2(yq2Var, bundle.getLong("chat.media.viewer.entity_id"), null), 3));
                        return qqgVar;
                    }
                } else if (i4 == evd.g || i4 == evd.f) {
                    if (bundle != null && (string = bundle.getString("chat.media.viewer.link")) != null && (i88Var = (i88) ue3.J(bundle.getInt("chat.media.viewer.link_type", -1), zg5Var)) != null) {
                        yq2Var.H(string, i88Var);
                    }
                } else if (i4 == evd.b && bundle != null && (string2 = bundle.getString("chat.media.viewer.link")) != null && (i88Var2 = (i88) ue3.J(bundle.getInt("chat.media.viewer.link_type", -1), zg5Var)) != null) {
                    int iV = az1.v(ooi.b(string2) ? 3 : ooi.c(string2) ? 2 : 1);
                    if (iV == 0) {
                        i = i88Var2 == i88.o ? fvd.u : fvd.t;
                    } else if (iV == 1) {
                        i = fvd.w;
                    } else {
                        if (iV != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = fvd.v;
                    }
                    xfh.r(ci5Var2, new mh5(string2, new n5g(i)));
                    return qqgVar;
                }
            }
            return qqgVar;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j09 j09Var = this.o;
        g8j.b(obj);
        j09VarE = j09Var;
        objI = obj;
        ArrayList arrayList = (ArrayList) objI;
        if (!arrayList.isEmpty()) {
            xfh.r(ci5Var2, new th5(j09VarE, arrayList));
            return qqgVar;
        }
        yq2Var.B((dv5) yq2Var.E0.getValue(), j09VarE, yq2Var.b, j09VarE.j());
        return qqgVar;
    }
}
