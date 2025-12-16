package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.format.DateFormat;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import one.me.settings.SettingsListScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class prd implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ prd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        String strValueOf;
        ipd ipdVar;
        int i = this.a;
        j7e j7eVar = null;
        qqg qqgVar = qqg.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((OneMeRoomDatabase) ((bsd) obj).a.l()).F();
            case 1:
                return ((OneMeRoomDatabase) ((csd) obj).a.l()).J();
            case 2:
                return ((OneMeRoomDatabase) ((fsd) obj).a.l()).Q();
            case 3:
                return ((OneMeRoomDatabase) ((q9b) ((enb) obj).b).l()).S();
            case 4:
                return ((OneMeRoomDatabase) ((gsd) obj).a.l()).U();
            case 5:
                return jtd.v((jtd) obj);
            case 6:
                yy7[] yy7VarArr = ScheduledSendPickerViewModel.p;
                String string = ((Application) obj).getString(fvd.C);
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        strValueOf = String.valueOf(cCharAt).toUpperCase(Locale.getDefault());
                        if (strValueOf.length() > 1) {
                            if (cCharAt != 329) {
                                strValueOf = strValueOf.charAt(0) + strValueOf.substring(1).toLowerCase(Locale.ROOT);
                            }
                        } else if (strValueOf.equals(String.valueOf(cCharAt).toUpperCase(Locale.ROOT))) {
                            strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                        }
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb.append((Object) strValueOf);
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
                return new ps6(string);
            case 7:
                ps6 ps6Var = (ps6) ((ScheduledSendPickerViewModel) obj).g.getValue();
                Calendar calendar = Calendar.getInstance();
                Locale locale = Locale.getDefault();
                ps6Var.getClass();
                xf4 xf4Var = new xf4(calendar.get(5), calendar.get(2), calendar.get(1), 0L, ps6Var.a);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM", locale);
                ArrayList arrayList = new ArrayList(366);
                arrayList.add(xf4Var);
                while (true) {
                    calendar.add(5, 1);
                    long size = arrayList.size();
                    int i2 = calendar.get(1);
                    int i3 = calendar.get(5);
                    int i4 = calendar.get(2);
                    xf4 xf4Var2 = new xf4(i3, i4, i2, size, simpleDateFormat.format(calendar.getTime()));
                    if (i3 == xf4Var.b && i4 == xf4Var.c) {
                        return arrayList;
                    }
                    arrayList.add(xf4Var2);
                }
                break;
            case 8:
                return Integer.valueOf(((w4e) obj).g.getInt("request_id", 10));
            case 9:
                p5e p5eVar = (p5e) obj;
                ve2 ve2Var = (ve2) p5eVar.c.getValue();
                qv3 qv3Var = (qv3) p5eVar.a.getValue();
                v04 v04Var = (v04) p5eVar.b.getValue();
                o7e o7eVar = (o7e) p5eVar.d.getValue();
                String[] strArr = (String[]) ((l5c) ((age) p5eVar.e.getValue())).m.getValue();
                i7e i7eVar = new i7e(ve2Var, qv3Var, v04Var, o7eVar);
                if (strArr != null) {
                    if (strArr.length == 0) {
                        strArr = null;
                    }
                    if (strArr != null) {
                        j7eVar = new j7e(strArr, ve2Var, o7eVar);
                    }
                }
                return new h7e(ve2Var, qv3Var, o7eVar, i7eVar, j7eVar);
            case 10:
                return (t75) ((v3b) ((tde) obj).e.getValue()).a.a.getValue();
            case 11:
                ude udeVar = new ude(((wde) obj).a.getContext());
                udeVar.setId(j7b.O);
                udeVar.setWillNotDraw(false);
                return udeVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                tee teeVar = (tee) obj;
                return Integer.valueOf(h5j.a(teeVar, teeVar.j));
            case 13:
                yy7[] yy7VarArr2 = SettingRingtoneScreen.Z;
                ire ireVar = ire.a;
                bwf bwfVarD = ireVar.getAccessor().d(8);
                ireVar.getAccessor().getClass();
                return new tme(bwfVarD, ireVar.getAccessor().d(111), ireVar.getAccessor().d(12), ireVar.getAccessor().d(462), (dna) ((SettingRingtoneScreen) obj).c.getValue());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Boolean.valueOf(((File) obj).delete());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ume umeVar = (ume) obj;
                sf7 sf7VarD = sf7.d(Uri.parse(umeVar.a));
                int i5 = umeVar.c;
                int i6 = umeVar.d;
                sf7VarD.d = new ynd(i5, i6);
                tuf tufVar = new tuf(22);
                tufVar.c = i5;
                tufVar.d = i6;
                sf7VarD.f = new uuf(tufVar);
                return sf7VarD.a();
            case 16:
                yy7[] yy7VarArr3 = SettingsListScreen.A0;
                return new ccb((SettingsListScreen) obj);
            case LangUtils.HASH_SEED /* 17 */:
                Context context = ((nwe) obj).a;
                yk8 yk8Var = wd5.a;
                return new cw0(context);
            case 18:
                ((MediaPlayer) obj).reset();
                return qqgVar;
            case 19:
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                hs hsVar = startConversationScreen.c;
                yy7[] yy7VarArr4 = StartConversationScreen.H0;
                yy7 yy7Var = yy7VarArr4[0];
                if (((Boolean) hsVar.a(startConversationScreen)).booleanValue()) {
                    ((RecyclerView) startConversationScreen.t0.D(startConversationScreen, yy7VarArr4[3])).x0(0);
                    yy7 yy7Var2 = yy7VarArr4[0];
                    hsVar.b(startConversationScreen, Boolean.FALSE);
                }
                return qqgVar;
            case 20:
                return r34.b(((wbf) obj).getContext(), yud.P1).mutate();
            case 21:
                return new zbf((wo1) ((StartRecordBottomSheet) obj).C0.getValue(), fm1.b());
            case 22:
                return ((mr1) ((zbf) obj).c.getValue()).a.getString(m0b.S0, DateFormat.format("d MMMM", new Date()));
            case 23:
                return (f1e) obj;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                yy7[] yy7VarArr5 = StickerSetBottomSheet.E0;
                m9b m9bVar = new m9b(((StickerSetBottomSheet) obj).getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                m9bVar.setLayoutParams(layoutParams);
                m9bVar.setAppearance(e9b.a);
                m9bVar.setSize(h9b.a);
                return m9bVar;
            case 25:
                hkf hkfVar = (hkf) obj;
                return new o6a(hkfVar.a, hkfVar.o, new qk(23, hkfVar));
            case 26:
                xqf xqfVar = (xqf) obj;
                ArrayList arrayListL = xqfVar.b.l();
                ((v04) xqfVar.h.getValue()).b(arrayListL);
                return arrayListL;
            case 27:
                return ((OneMeRoomDatabase) ((suf) obj).a.l()).T();
            case 28:
                s8g s8gVar = (s8g) obj;
                try {
                    ipdVar = QrCodeGenerator.nativeRenderSvg(s8gVar.a, s8gVar.b, s8gVar.c);
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                boolean z = ipdVar instanceof ipd;
                ipd ipdVar2 = ipdVar;
                if (z) {
                    ipdVar2 = null;
                }
                int[] iArr = (int[]) ipdVar2;
                if (iArr == null) {
                    return null;
                }
                int i7 = s8gVar.b;
                int i8 = s8gVar.c;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.setPixels(iArr, 0, i7, 0, 0, i7, i8);
                Paint paint = s8gVar.g;
                Shader.TileMode tileMode = s8gVar.i;
                paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                s8gVar.j = true;
                return qqgVar;
            default:
                ViewConfiguration viewConfiguration = ViewConfiguration.get(((dvf) obj).b.getContext());
                int iMax = Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2;
                if (iMax <= 0) {
                    iMax = kti.d(40 * vw4.d().getDisplayMetrics().density);
                }
                return Integer.valueOf(iMax);
        }
    }
}
