package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class em1 extends dtf implements um6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                em1 em1Var = new em1(3, (Continuation) obj3, 0);
                em1Var.Y = (dxg) obj;
                em1Var.X = zBooleanValue;
                return em1Var.n(qqg.a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                em1 em1Var2 = new em1(3, (Continuation) obj3, 1);
                em1Var2.X = zBooleanValue2;
                em1Var2.Y = (h17) obj2;
                return em1Var2.n(qqg.a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                em1 em1Var3 = new em1(3, (Continuation) obj3, 2);
                em1Var3.Y = (w68) obj;
                em1Var3.X = zBooleanValue3;
                return em1Var3.n(qqg.a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                em1 em1Var4 = new em1(3, (Continuation) obj3, 3);
                em1Var4.X = zBooleanValue4;
                em1Var4.Y = (vo6) obj2;
                return em1Var4.n(qqg.a);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                em1 em1Var5 = new em1(3, (Continuation) obj3, 4);
                em1Var5.Y = (List) obj;
                em1Var5.X = zBooleanValue5;
                return em1Var5.n(qqg.a);
            default:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                em1 em1Var6 = new em1(3, (Continuation) obj3, 5);
                em1Var6.Y = (Map) obj;
                em1Var6.X = zBooleanValue6;
                return em1Var6.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                dxg dxgVar = (dxg) this.Y;
                if (!this.X) {
                    break;
                } else {
                    break;
                }
            case 1:
                g8j.b(obj);
                boolean z = this.X;
                h17 h17Var = (h17) this.Y;
                if (!z) {
                    break;
                }
                break;
            case 2:
                g8j.b(obj);
                w68 w68Var = (w68) this.Y;
                if (this.X) {
                }
                break;
            case 3:
                g8j.b(obj);
                break;
            case 4:
                g8j.b(obj);
                List list = (List) this.Y;
                if (!this.X) {
                    break;
                }
                break;
            default:
                g8j.b(obj);
                Map map = (Map) this.Y;
                if (!this.X) {
                    break;
                } else {
                    break;
                }
        }
        return hd5.a;
    }
}
