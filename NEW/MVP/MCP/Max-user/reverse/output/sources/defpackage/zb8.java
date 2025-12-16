package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class zb8 implements fu3, gu3, m7c, tg8, ox7, mk8, tm6, qm0, uw8, ax8, bx8, pa8, uy8, kw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ zb8(int i) {
        this.a = i;
    }

    @Override // defpackage.tg8
    public boolean a() {
        return false;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ExecutorService) obj).shutdown();
                break;
            case 1:
                wqi.e("hd8", "Can't load frames", (Throwable) obj);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                wqi.e("zm8", "Got error on chat invalidation", (Throwable) obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                wqi.e(yn8.m, "loadMarkerIcon: can't load marker", (Throwable) obj);
                break;
            case 16:
                wqi.e(yn8.m, "setMapStyle: can't load map style", (Throwable) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                wqi.e(yn8.m, "loadMarkerIcon: can't load marker", (Throwable) obj);
                break;
            default:
                wqi.e(yn8.m, "loadMarkerIcon: can't load marker", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.qm0
    public Object apply(Object obj, Object obj2) {
        wm8 wm8Var = (wm8) obj;
        ym8 ym8Var = (ym8) obj2;
        xm8 xm8Var = ym8Var.a;
        List list = ym8Var.b;
        synchronized (wm8Var) {
            wm8Var.a.add(xm8Var);
            ArrayList arrayList = new ArrayList(wm8Var.c);
            arrayList.addAll(o7e.c(arrayList, list));
            arrayList.sort(new dj3(6, wm8Var));
            wm8Var.c = arrayList;
        }
        return wm8Var;
    }

    @Override // defpackage.ax8
    public int b(Object obj) {
        switch (this.a) {
            case 20:
                String str = ((ow8) obj).a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (xxg.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 21:
                return ((ow8) obj).a.startsWith("OMX.google") ? 1 : 0;
            default:
                String str2 = ((pw8) obj).a;
                return (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) ? 1 : 0;
        }
    }

    @Override // defpackage.uy8
    public void c(ly8 ly8Var) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ly8Var.h.f(26, new dm4(28));
                return;
            case 25:
                px8 px8Var = ly8Var.a;
                Objects.requireNonNull(px8Var);
                px8Var.z(new gq5(15, px8Var));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // defpackage.uw8
    public List d(String str, boolean z, boolean z2) {
        return dx8.d(str, z, z2);
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        switch (this.a) {
            case 27:
                String string = bundle.getString(Integer.toString(0, 36), "");
                string.getClass();
                Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
                xz8 xz8Var = bundle2 == null ? xz8.X : new xz8(bundle2.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle2.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle2.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle2.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle2.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
                v19 v19Var = bundle3 == null ? v19.R0 : (v19) v19.S0.e(bundle3);
                Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
                return new i09(string, bundle4 == null ? rz8.Y : (rz8) pz8.X.e(bundle4), null, xz8Var, v19Var);
            case 28:
                nz8 nz8Var = new nz8();
                long j = bundle.getLong(Integer.toString(0, 36), 0L);
                boolean z = true;
                fsi.b(j >= 0);
                nz8Var.a = j;
                long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z = false;
                }
                fsi.b(z);
                nz8Var.b = j2;
                nz8Var.c = bundle.getBoolean(Integer.toString(2, 36), false);
                nz8Var.d = bundle.getBoolean(Integer.toString(3, 36), false);
                nz8Var.e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new rz8(nz8Var);
            default:
                return new xz8(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        ((r3c) obj).k(1);
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        ei8 ei8Var = new ei8();
        xx7Var.p();
        while (xx7Var.hasNext()) {
            String strName = xx7Var.name();
            strName.getClass();
            switch (strName) {
                case "auth_token":
                    ei8Var.d = xx7Var.B();
                    break;
                case "session_key":
                    ei8Var.b = xx7Var.B();
                    break;
                case "uid":
                    ei8Var.a = xx7Var.B();
                    break;
                case "session_secret_key":
                    ei8Var.c = xx7Var.B();
                    break;
                case "auth_hash":
                    ei8Var.f = xx7Var.B();
                    break;
                case "api_server":
                    ei8Var.e = xx7Var.B();
                    break;
                default:
                    xx7Var.v();
                    break;
            }
        }
        xx7Var.n();
        return ei8Var;
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return !((Locale) obj).getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return ((iqc) obj).c;
            case 7:
                wqi.e("zm8", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.EMPTY_LIST;
            case 8:
                wqi.e("zm8", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.EMPTY_LIST;
            case 9:
                return new ym8(xm8.c, (List) obj);
            case 10:
                wqi.e("zm8", "searchChatsAndMessage: search local chats exception", (Throwable) obj);
                return Collections.EMPTY_LIST;
            case 11:
                List<jqc> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (jqc jqcVar : list) {
                    try {
                        arrayList.add(new u6e(5, null, jqcVar.b, null, null, null, 0L, jqcVar));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return new ym8(xm8.b, arrayList);
            default:
                return new ym8(xm8.a, (List) obj);
        }
    }
}
