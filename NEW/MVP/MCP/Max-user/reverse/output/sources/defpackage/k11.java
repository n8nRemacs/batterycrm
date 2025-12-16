package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final /* synthetic */ class k11 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xs xsVar = (xs) obj;
                xsVar.remove(Long.valueOf(((zi1) this.b).a));
                return xsVar;
            case 1:
                w21 w21Var = (w21) this.b;
                CallsAudioManager callsAudioManager = (CallsAudioManager) obj;
                if (callsAudioManager != null) {
                    return callsAudioManager;
                }
                bv1 bv1Var = w21Var.a;
                CallsAudioManager.Builder videoTracker = new CallsAudioManager.Builder().setContext((Context) bv1Var.a.getValue()).setProximityTracker(bv1Var.c).setVideoTracker(new xtd(19, new tv(0, 2, f41.class, bv1Var.b.getValue(), "isVideoEnabled", "isVideoEnabled()Z")));
                gu5 gu5Var = (gu5) ((rt5) bv1Var.f.getValue());
                CallsAudioManager.Builder disabledAudioDeviceUsagePolicy = videoTracker.setAwaitDeviceChangeConfirmationEnabled(((Boolean) gu5Var.q.D(gu5Var, gu5.S[6])).booleanValue()).setDisabledAudioDeviceUsagePolicy(new av1());
                ((eza) bv1Var.d.getValue()).getClass();
                l5c l5cVar = (l5c) ((age) bv1Var.e.getValue());
                l5cVar.getClass();
                if (((int) l5cVar.m(PmsKey.f37debugmode, 0)) == 3) {
                    disabledAudioDeviceUsagePolicy.setLogger((zu1) bv1Var.g.getValue());
                }
                return disabledAudioDeviceUsagePolicy.build();
            case 2:
                Iterable iterable = ((df2) this.b).e;
                if (iterable == null) {
                    iterable = hd5.a;
                }
                return ue3.d0(iterable);
            case 3:
                return ((j09) this.b).w();
            case 4:
                return (zj2) this.b;
            case 5:
                return (q19) this.b;
            case 6:
                return (hg8) this.b;
            case 7:
                return (qmb) this.b;
            case 8:
                return (bef) this.b;
            case 9:
                yyb yybVar = (yyb) this.b;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Set) obj);
                linkedHashSet.add(yybVar);
                return linkedHashSet;
            case 10:
                return Long.valueOf(((lgf) ((z7e) this.b)).d);
            default:
                e70 e70Var = (e70) this.b;
                if (e70Var != null) {
                    return e70Var.c;
                }
                return null;
        }
    }
}
