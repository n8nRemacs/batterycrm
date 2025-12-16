package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.net.DatagramSocket;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.webrtc.Predicate;
import org.webrtc.RTCStats;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class iqa implements Predicate, lp5, ubg, tg8, b9e, gu3, kw0, fod, ff4, t77, bbd, tm6, m7c {
    public final /* synthetic */ int a;

    public /* synthetic */ iqa(int i) {
        this.a = i;
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        Object obj2 = ((RTCStats) obj).getMembers().get("payloadType");
        if (obj2 != null) {
            return c7d.c(obj2);
        }
        return null;
    }

    @Override // defpackage.tg8
    public boolean a() {
        rwa rwaVar = OneMeApplication.s0;
        return !wqi.a();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                ConcurrentHashMap concurrentHashMap = dkb.b;
                break;
            case 9:
                wqi.e("xa6", "onError", (Throwable) obj);
                break;
            case 16:
                int i = RangeSeekBarView.P0;
                wqi.e("ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView", "TimeLineView error occurred", (Throwable) obj);
                break;
            default:
                wqi.e("vcd", "clearRecentSearch: failed", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        Object wb5Var;
        Object pffVar;
        int i = 2;
        switch (this.a) {
            case 18:
                return Long.valueOf(((ku3) obj).p());
            case 19:
                return new edd((pb2) obj, null);
            case 20:
                return vqa.i(((pb2) obj).l());
            case 21:
                return new edd(null, (ku3) obj);
            case 22:
            case 23:
            case 26:
            case 27:
            default:
                ocd ocdVar = (ocd) obj;
                ocdVar.getClass();
                return new kk3(i, new bm4(13, ocdVar));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return vqa.i(((pb2) obj).l());
            case 25:
                edd eddVar = (edd) obj;
                pb2 pb2Var = eddVar.a;
                ku3 ku3Var = eddVar.b;
                return ku3Var != null ? new u6e(4, null, Collections.EMPTY_LIST, null, ku3Var, null, 0L, null) : pb2Var.M() ? new u6e(2, null, Collections.EMPTY_LIST, pb2Var, null, null, 0L, null) : u6e.a(pb2Var, Collections.EMPTY_LIST);
            case 28:
                pcd pcdVar = (pcd) obj;
                int iOrdinal = pcdVar.b.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        pffVar = new pff(pcdVar.e.a, pcdVar.d);
                    } else if (iOrdinal == 3) {
                        try {
                            pffVar = new gu6(a.n(Protos.Attaches.Attach.Photo.parseFrom((byte[]) pcdVar.g.c)), pcdVar.d);
                        } catch (InvalidProtocolBufferNanoException e) {
                            wqi.e("xcd", "Can't parse gif", e);
                            return new aj();
                        }
                    } else {
                        if (iOrdinal != 4) {
                            Locale locale = Locale.ENGLISH;
                            wqi.e("xcd", "Unknown recentDb type " + pcdVar.c, null);
                            return new aj();
                        }
                        wb5Var = new aj(pcdVar.d);
                    }
                    return pffVar;
                }
                wb5Var = new wb5((String) pcdVar.f.b);
                return wb5Var;
        }
    }

    @Override // defpackage.fod
    public void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        switch (this.a) {
            case 10:
                bitmap.recycle();
                break;
            default:
                bitmap.recycle();
                break;
        }
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        switch (this.a) {
            case 1:
                return new gp5[]{new eua()};
            default:
                return new gp5[]{new gqc()};
        }
    }

    @Override // defpackage.ff4
    public DatagramSocket createSocket() {
        return new DatagramSocket();
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        switch (this.a) {
            case 8:
                fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f == -1.0f ? new dqb() : new dqb(f);
            default:
                int i = bundle.getInt(Integer.toString(0, 36), -1);
                if (i == 0) {
                    fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new z17(bundle.getBoolean(Integer.toString(2, 36), false)) : new z17();
                }
                if (i == 1) {
                    fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                    float f2 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    return f2 == -1.0f ? new dqb() : new dqb(f2);
                }
                if (i == 2) {
                    fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                    int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                    float f3 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                    return f3 == -1.0f ? new baf(i2) : new baf(i2, f3);
                }
                if (i == 3) {
                    fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new h8g(bundle.getBoolean(Integer.toString(2, 36), false)) : new h8g();
                }
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown RatingType: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.ubg
    public String f() {
        return null;
    }

    @Override // defpackage.b9e
    public int g(int i) {
        yy7[] yy7VarArr = OtherNotificationsSettingsScreen.X;
        return 4;
    }

    @Override // org.webrtc.Predicate, defpackage.m7c
    public boolean test(Object obj) {
        eh9 eh9Var;
        switch (this.a) {
            case 0:
                int i = jqa.a;
                break;
            case 22:
                pb2 pb2Var = (pb2) obj;
                if (pb2Var.b.Y != 0) {
                    ku3 ku3VarN = pb2Var.n();
                    if (ku3VarN == null || !ku3VarN.u()) {
                        break;
                    }
                }
                break;
            case 23:
                pb2 pb2Var2 = (pb2) obj;
                if (pb2Var2.Q()) {
                    ku3 ku3VarN2 = pb2Var2.n();
                    if ((ku3VarN2 == null || !ku3VarN2.u()) && pb2Var2.b.g() && (eh9Var = pb2Var2.c) != null && !eh9Var.a.D()) {
                        break;
                    }
                }
                break;
            default:
                ku3 ku3Var = (ku3) obj;
                if (ku3Var.a.b.r != 0 && !ku3Var.u()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.t77
    public boolean verify(String str, X509Certificate x509Certificate) {
        return true;
    }

    public /* synthetic */ iqa(int i, Object obj) {
        this.a = i;
    }
}
