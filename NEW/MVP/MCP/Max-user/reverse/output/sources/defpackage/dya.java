package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.logging.Logger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.NativeLibraryLoader;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.messages.a;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class dya extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ dya(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                Context context = (Context) w5Var.c(12);
                bwf bwfVarD = w5Var.d(8);
                return new wc5((a84) w5Var.c(84), (ac5) w5Var.c(665), bwfVarD, context);
            case 1:
                return (lb5) w5Var.c(480);
            case 2:
                return c9j.b((Context) w5Var.c(12));
            case 3:
                return new RLottie.Config((Context) w5Var.c(12), true, NativeLibraryLoader.INSTANCE.getDefault(), 0.0f, new kk4(26), 8, null);
            case 4:
                return new WebmConfig.Config(null, new q85(26), 1, null);
            case 5:
                return new pca((Context) w5Var.c(12), new bwf(new b31(w5Var, 12)), new w7b(w5Var.d(92)), new kce(29, w5Var), Runtime.getRuntime().availableProcessors(), new kya(w5Var), new b31(w5Var, 14));
            case 6:
                int i = mvd.a;
                return new db5();
            case 7:
                return new he7((z7c) w5Var.c(70), w5Var.d(97), w5Var.d(98), w5Var.d(56));
            case 8:
                return new zm((Application) w5Var.c(14), w5Var.d(70), new bwf(k54.Z), (eza) w5Var.c(81));
            case 9:
                bwf bwfVarD2 = w5Var.d(210);
                bwf bwfVarD3 = w5Var.d(98);
                bwf bwfVarD4 = w5Var.d(97);
                bwf bwfVarD5 = w5Var.d(647);
                w86 w86Var = new w86();
                w86Var.a = w5Var;
                w86Var.c = bwfVarD2;
                w86Var.d = bwfVarD3;
                w86Var.e = bwfVarD4;
                w86Var.b = bwfVarD5;
                return new co3(w86Var);
            case 10:
                return eza.a;
            case 11:
                return new y3b();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new zi5((yi5) w5Var.c(9), 1);
            case 13:
                Context context2 = (Context) w5Var.c(12);
                Logger logger = aub.h;
                if (context2 == null) {
                    throw new IllegalArgumentException("context could not be null.");
                }
                ukd ukdVar = new ukd(3, context2.getAssets());
                jo4 jo4Var = new jo4(ukdVar);
                return new aub(new h79(jo4Var.b, ukdVar, jo4Var.a), m7j.b());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                w5Var.d(138);
                w5Var.d(109);
                w5Var.d(180);
                w5Var.d(76);
                w5Var.d(67);
                w5Var.d(79);
                w5Var.d(49);
                w5Var.d(111);
                ((eza) w5Var.c(81)).getClass();
                int i2 = s65.d;
                s65.g(v9j.h(12, y65.HOURS));
                w5Var.d(657);
                w5Var.d(8);
                return new om0();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (j94) w5Var.c(675);
            case 16:
                return (nq) w5Var.c(676);
            case LangUtils.HASH_SEED /* 17 */:
                return new fxe((Context) w5Var.c(12), w5Var.d(31), w5Var.d(109), w5Var.d(84), w5Var.d(46), w5Var.d(8), w5Var.d(124), w5Var.d(680));
            case 18:
                return new tka(w5Var.d(582), (Context) w5Var.c(12));
            case 19:
                return new ug0((Context) w5Var.c(12), (w63) w5Var.c(109), (ej0) w5Var.c(385), (lzf) w5Var.c(8), (a84) w5Var.c(84));
            case 20:
                return new ks3((lzf) w5Var.c(8), (oje) w5Var.c(180));
            case 21:
                return ((Application) w5Var.c(14)).getResources();
            case 22:
                return new v28((ij7) w5Var.c(294), w5Var.d(HttpStatus.SC_PRECONDITION_FAILED), (lzf) w5Var.c(8));
            case 23:
                return new rya(w5Var);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new wod(w5Var.d(186), w5Var.d(258), (lzf) w5Var.c(8), (a84) w5Var.c(84));
            case 25:
                return new a7b(w5Var.b(6));
            case 26:
                return new y84();
            case 27:
                return new vya((erb) w5Var.c(7));
            case 28:
                a aVar = (a) w5Var.c(637);
                uaj uajVar = new uaj(2);
                uajVar.b = Math.min(100, 50);
                uajVar.e = ((g4b) w5Var.c(56)).c();
                uajVar.c = ((g4b) w5Var.c(56)).a();
                uajVar.d = aVar;
                return new qo3(uajVar);
            default:
                return new d3b(w5Var.d(31));
        }
    }
}
