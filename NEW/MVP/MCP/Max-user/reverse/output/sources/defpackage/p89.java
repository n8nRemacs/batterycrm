package defpackage;

import android.os.Bundle;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.MyTrackerConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.settings.MessagesSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class p89 implements y89, om6, km7, tm6, b9e, ghg, hc7, ic7, lp5, gu3, m7c, MyTrackerConfig.OkHttpClientProvider, MyTracker.AttributionListener, g5a {
    public final /* synthetic */ int a;

    public /* synthetic */ p89(int i) {
        this.a = i;
    }

    @Override // defpackage.hc7, defpackage.ic7
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 16:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
            default:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 21:
                ((x00) obj).i = p10.c;
                break;
            case 22:
                wqi.e("iaa", "Can't update seek", null);
                break;
            case 23:
                wqi.e("iaa", "Can't hide controls", null);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
            default:
                wqi.e("naa", "Error in extractThumbnail", (Throwable) obj);
                break;
            case 25:
                wqi.e("laa", "Can't setupUpdateAddress", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return Long.valueOf(((kb4) obj).b);
            case 4:
                return Long.valueOf(((kb4) obj).c);
            case 5:
                return wg7.j(lqi.d(new o9g(4), ((p29) obj).l().b));
            case 6:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            default:
                return (efg) obj;
            case 7:
                return String.valueOf((Long) obj);
            case 8:
                an9 an9Var = (an9) obj;
                an9Var.getClass();
                return new yr8(new zm9(an9Var, dsd.c(0, "SELECT * FROM message_uploads"), 0));
            case 9:
                wm9 wm9Var = (wm9) obj;
                wo8 wo8Var = new wo8();
                bz1 bz1Var = wm9Var.a;
                p2h p2hVar = null;
                wo8Var.c = bz1Var == null ? null : new cl9(bz1Var.a, bz1Var.b, (String) bz1Var.c);
                wo8Var.a = wm9Var.c;
                wo8Var.b = wm9Var.b;
                wo8Var.d = wm9Var.d;
                u10 u10Var = wm9Var.e;
                if (u10Var != null) {
                    u10 u10Var2 = new u10(2);
                    u10Var2.c = u10Var.c;
                    u10Var2.b = u10Var.b;
                    u10Var2.a = u10Var.a;
                    u10Var2.d = u10Var.d;
                    p2hVar = new p2h(u10Var2);
                }
                wo8Var.o = p2hVar;
                return new um9(wo8Var);
            case 10:
                List list = (List) obj;
                return list.isEmpty() ? tr8.a : or8.d(list);
            case 11:
                List list2 = (List) obj;
                return list2.isEmpty() ? tr8.a : or8.d(list2);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                an9 an9Var2 = (an9) obj;
                an9Var2.getClass();
                return new kk3(2, new bm4(7, an9Var2));
            case 13:
                return ((OneMeRoomDatabase) obj).E();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                py9 py9Var = (py9) obj;
                py9Var.getClass();
                jdc jdcVar = woc.a;
                jdcVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    jdcVar.n(py9Var, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 18:
                return (dfg) obj;
        }
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        return new gp5[]{new u3a(rof.b0, 16)};
    }

    @Override // defpackage.b9e
    public int g(int i) {
        yy7[] yy7VarArr = MessagesSettingsScreen.X;
        return 4;
    }

    @Override // com.my.tracker.MyTrackerConfig.OkHttpClientProvider
    public sua getOkHttpClient() {
        return ((m8d) t1b.a.getAccessor().c(662)).a;
    }

    @Override // defpackage.km7
    public boolean j(kce kceVar, int i, Bundle bundle) {
        int i2 = MessageComposeEditText.w0;
        return false;
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        switch (this.a) {
            case 0:
                o79Var.getClass();
                throw new ClassCastException();
            default:
                usd usdVar = o79Var.e;
                o79Var.t(u69Var);
                usdVar.getClass();
                return a6a.c(new yie(-6));
        }
    }

    @Override // com.my.tracker.MyTracker.AttributionListener
    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        uba.c.h(myTrackerAttribution.getDeeplink());
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.g5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(defpackage.tm9 r18) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p89.p(tm9):java.lang.Object");
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return ((kp8) obj).a.a();
    }
}
