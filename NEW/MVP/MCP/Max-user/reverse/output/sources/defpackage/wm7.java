package defpackage;

import android.content.Context;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class wm7 implements em6 {
    public final /* synthetic */ int a;

    public /* synthetic */ wm7(int i) {
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        ku3 ku3VarN;
        String str;
        switch (this.a) {
            case 0:
                return mri.b(((TamErrorException) obj).a);
            case 1:
                return mri.b(((TamErrorException) obj).a);
            case 2:
                return Boolean.valueOf(dnf.r((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 3:
                return new qu5(3, (String) ((Map.Entry) obj).getValue());
            case 4:
                return Boolean.valueOf(dnf.r((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                return new pu5(3, -1, xpi.k((String) entry.getKey()), 0, (String) entry.getValue());
            case 6:
                q85 q85Var = wr7.J0;
                pzf pzfVar = ((TamErrorException) obj).a;
                q85Var.getClass();
                if (pzfVar instanceof hzf) {
                    String str2 = ((hzf) pzfVar).b;
                    return (fni.a(str2, "service.unavailable") || fni.a(str2, "service.timeout")) ? new ar7(new n5g(avd.V), new n5g(avd.U)) : new ar7(new n5g(mvd.Y1), new n5g(mvd.X1));
                }
                String str3 = pzfVar.b;
                String str4 = pzfVar.d;
                if (fni.a(str3, "contact.not.found") || fni.a(str3, "not.found")) {
                    return br7.a;
                }
                if (fni.a(str3, "too.many.requests")) {
                    return cr7.a;
                }
                return new zq7((str4 == null || str4.length() == 0) ? new n5g(mvd.E) : new r5g(str4));
            case 7:
                da3 da3Var = (da3) obj;
                da3.a(da3Var, "JsonPrimitive", new ww7(new i77(21)));
                da3.a(da3Var, "JsonNull", new ww7(new i77(22)));
                da3.a(da3Var, "JsonLiteral", new ww7(new i77(23)));
                da3.a(da3Var, "JsonObject", new ww7(new i77(24)));
                da3.a(da3Var, "JsonArray", new ww7(new i77(25)));
                return qqg.a;
            case 8:
                Map.Entry entry2 = (Map.Entry) obj;
                String str5 = (String) entry2.getKey();
                sw7 sw7Var = (sw7) entry2.getValue();
                StringBuilder sb = new StringBuilder();
                qmf.a(sb, str5);
                sb.append(':');
                sb.append(sw7Var);
                return sb.toString();
            case 9:
                return ((vd8) obj).b;
            case 10:
                return obj.toString();
            case 11:
                return qqg.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new EnhancedAnimatedVectorDrawable((Context) obj, ivd.g);
            case 13:
                return new EnhancedAnimatedVectorDrawable((Context) obj, ivd.q1);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Long.valueOf(((lc9) obj).a);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ku3 ku3Var = (ku3) obj;
                return Boolean.valueOf(ku3Var.X || u5j.h(ku3Var) || ku3Var.m() != 0 || (ku3Var.v() && ku3Var.A()));
            case 16:
                pb2 pb2Var = (pb2) obj;
                return Boolean.valueOf((!pb2Var.Q() || pb2Var.n() == null || (ku3VarN = pb2Var.n()) == null || ku3VarN.X) ? false : true);
            case LangUtils.HASH_SEED /* 17 */:
                return ((fxb) obj).c.toString();
            case 18:
                return ((fxb) obj).c.toString();
            case 19:
                return new yk9((Context) obj);
            case 20:
                return Boolean.valueOf(((j37) obj) instanceof i37);
            case 21:
                return Boolean.valueOf(((gh9) obj) == gh9.Y);
            case 22:
                gl9 gl9Var = (gl9) obj;
                return new spa(gl9Var.c, gl9Var.e, gl9Var.i, x55.MESSAGES_LIMIT);
            case 23:
                gl9 gl9Var2 = (gl9) obj;
                return new spa(gl9Var2.c, gl9Var2.e, gl9Var2.i, x55.NOTIFICATIONS_LIMIT);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((gl9) obj).l;
            case 25:
                pma pmaVar = (pma) obj;
                return Boolean.valueOf((!pmaVar.b || (str = pmaVar.a) == null || str.length() == 0) ? false : true);
            case 26:
                return Boolean.valueOf(((ps2) obj).f.isEmpty());
            case 27:
                return ((sl9) obj).b.b;
            case 28:
                return Integer.valueOf(((yeb) obj).getIcon().h);
            default:
                return Integer.valueOf(((yeb) obj).b().m);
        }
    }
}
