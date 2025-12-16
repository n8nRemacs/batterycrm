package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class z8e extends dtf implements um6 {
    public /* synthetic */ Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8e(wo6 wo6Var, sbe sbeVar, Continuation continuation) {
        super(3, continuation);
        this.o = 2;
        this.X = wo6Var;
        this.Z = sbeVar;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                z8e z8eVar = new z8e((a8e) this.Z, (Continuation) obj3, 0);
                z8eVar.X = (TextView) obj;
                z8eVar.Y = (yeb) obj2;
                qqg qqgVar = qqg.a;
                z8eVar.n(qqgVar);
                return qqgVar;
            case 1:
                z8e z8eVar2 = new z8e((tic) this.Z, (Continuation) obj3, 1);
                z8eVar2.X = (TextView) obj;
                z8eVar2.Y = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                z8eVar2.n(qqgVar2);
                return qqgVar2;
            case 2:
                z8e z8eVar3 = new z8e((wo6) this.X, (sbe) this.Z, (Continuation) obj3);
                z8eVar3.Y = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                z8eVar3.n(qqgVar3);
                return qqgVar3;
            case 3:
                z8e z8eVar4 = new z8e((e5f) this.Z, (Continuation) obj3, 3);
                z8eVar4.X = (pb2) obj;
                z8eVar4.Y = (ku3) obj2;
                return z8eVar4.n(qqg.a);
            case 4:
                z8e z8eVar5 = new z8e((StartConversationScreen) this.Z, (Continuation) obj3, 4);
                z8eVar5.X = (nx3) obj;
                z8eVar5.Y = (List) obj2;
                qqg qqgVar4 = qqg.a;
                z8eVar5.n(qqgVar4);
                return qqgVar4;
            case 5:
                z8e z8eVar6 = new z8e((zsf) this.Y, (um9) this.Z, (Continuation) obj3, 5);
                z8eVar6.X = (Throwable) obj2;
                qqg qqgVar5 = qqg.a;
                z8eVar6.n(qqgVar5);
                return qqgVar5;
            case 6:
                z8e z8eVar7 = new z8e((duf) this.Y, (um9) this.Z, (Continuation) obj3, 6);
                z8eVar7.X = (Throwable) obj2;
                qqg qqgVar6 = qqg.a;
                z8eVar7.n(qqgVar6);
                return qqgVar6;
            case 7:
                z8e z8eVar8 = new z8e((ufb) this.Z, (Continuation) obj3, 7);
                z8eVar8.X = (ImageView) obj;
                z8eVar8.Y = (yeb) obj2;
                qqg qqgVar7 = qqg.a;
                z8eVar8.n(qqgVar7);
                return qqgVar7;
            default:
                z8e z8eVar9 = new z8e((VideoMessageWidget) this.Z, (Continuation) obj3, 8);
                z8eVar9.X = (ImageView) obj;
                z8eVar9.Y = (yeb) obj2;
                qqg qqgVar8 = qqg.a;
                z8eVar9.n(qqgVar8);
                return qqgVar8;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CharSequence charSequenceY0;
        int i = this.o;
        Object obj2 = this.Z;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                g8j.b(obj);
                ((TextView) this.X).setTextColor(((Number) ((a8e) obj2).b.invoke((yeb) this.Y)).intValue());
                break;
            case 1:
                g8j.b(obj);
                ((TextView) this.X).setTextColor(((Number) ((tic) obj2).b.invoke((yeb) this.Y)).intValue());
                break;
            case 2:
                g8j.b(obj);
                yeb yebVar = (yeb) this.Y;
                ((sbe) obj2).G0.setTextColor(((wo6) this.X).c ? yebVar.getText().j : yebVar.getText().h);
                break;
            case 3:
                g8j.b(obj);
                pb2 pb2Var = (pb2) this.X;
                ku3 ku3Var = (ku3) this.Y;
                List listO = lee.o(lee.g(lee.h(new at(2, pb2Var.l()), new llc(16)), new a7c((e5f) obj2, 8, pb2Var)));
                if (!pb2Var.j0()) {
                    break;
                } else {
                    break;
                }
            case 4:
                g8j.b(obj);
                nx3 nx3Var = (nx3) this.X;
                List list = (List) this.Y;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj2;
                ji0 ji0Var = startConversationScreen.y0;
                ji0 ji0Var2 = startConversationScreen.C0;
                yy7[] yy7VarArr = StartConversationScreen.H0;
                CharSequence charSequenceY02 = startConversationScreen.y0();
                if (charSequenceY02 == null || charSequenceY02.length() == 0) {
                    startConversationScreen.z0.E(nx3Var.a);
                    ji0 ji0Var3 = startConversationScreen.A0;
                    hd5 hd5Var = hd5.a;
                    ji0Var3.E(hd5Var);
                    startConversationScreen.B0.E(nx3Var.c);
                    if (ji0Var2.j() == 0 && ((charSequenceY0 = startConversationScreen.y0()) == null || charSequenceY0.length() == 0)) {
                        ji0Var2.E(lni.b());
                    }
                    if (nx3Var != nx3.d) {
                        ji0Var.E(list);
                        break;
                    } else {
                        ji0Var.E(hd5Var);
                        break;
                    }
                }
                break;
            case 5:
                g8j.b(obj);
                if (((Throwable) this.X) == null) {
                    zsf zsfVar = (zsf) this.Y;
                    String str = zsf.e;
                    tgg tggVar = (tgg) zsfVar.b.getValue();
                    String str2 = ((um9) obj2).a.c;
                    tggVar.getClass();
                    kvg kvgVar = kvg.g;
                    kvgVar.getClass();
                    yqb.c(kvgVar, "converting_ended", 1, str2, 56);
                    break;
                }
                break;
            case 6:
                g8j.b(obj);
                if (((Throwable) this.X) == null) {
                    tgg tggVar2 = (tgg) ((duf) this.Y).b.getValue();
                    String str3 = ((um9) obj2).a.c;
                    tggVar2.getClass();
                    kvg kvgVar2 = kvg.g;
                    kvgVar2.getClass();
                    yqb.c(kvgVar2, "upload_ended", 3, str3, 56);
                    break;
                }
                break;
            case 7:
                g8j.b(obj);
                ((ImageView) this.X).setColorFilter(((yeb) this.Y).g(((sfb) ((ufb) obj2)).d));
                break;
            default:
                g8j.b(obj);
                ImageView imageView = (ImageView) this.X;
                int i2 = ((yeb) this.Y).c().a.a.e;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                Paint paint = shapeDrawable.getPaint();
                yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                paint.setColor(a93.s0.y(imageView).a().G().b.l);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), shapeDrawable, null));
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                break;
        }
        return qqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8e(Object obj, um9 um9Var, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = obj;
        this.Z = um9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8e(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = obj;
    }
}
