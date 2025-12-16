package defpackage;

import android.content.Intent;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final /* synthetic */ class hd1 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hd1(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                n41 n41Var = (n41) this.c;
                Intent intent = (Intent) obj;
                intent.setAction("action-accept-call");
                CharSequence charSequence = n41Var.c;
                String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                intent.putExtra("incoming_param_name", string);
                String str = n41Var.d;
                intent.putExtra("incoming_param_avatar", str != null ? Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0) : null);
                Long l = n41Var.a;
                intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0L);
                intent.putExtra("incoming_param_is_video", this.b);
                break;
            case 1:
                vs1 vs1Var = (vs1) this.c;
                ((Boolean) obj).booleanValue();
                vs1Var.F0.setVisibility(this.b ? 0 : 8);
                break;
            default:
                q5a q5aVar = (q5a) this.c;
                String str2 = q5aVar.d;
                dx0 dx0Var = q5aVar.Z;
                to8.o((xl7) obj, str2, dx0Var.a, dx0Var.b, this.b);
                break;
        }
        return qqg.a;
    }

    public /* synthetic */ hd1(id1 id1Var, n41 n41Var, boolean z) {
        this.a = 0;
        this.c = n41Var;
        this.b = z;
    }
}
