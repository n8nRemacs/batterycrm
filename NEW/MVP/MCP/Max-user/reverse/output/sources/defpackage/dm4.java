package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.webrtc.EglThread;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class dm4 implements tm6, om6, kw0, rl3, b9e, gu3, i55, EglThread.ReleaseMonitor, pa8, qa8, oa8 {
    public final /* synthetic */ int a;

    public /* synthetic */ dm4(int i) {
        this.a = i;
    }

    public Constructor a() {
        switch (this.a) {
            case 2:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(gp5.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(gp5.class).getConstructor(null);
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                ((x00) obj).m = "";
                break;
            default:
                wqi.e("pb5", "Can't invalidate", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                cm4 cm4Var = (cm4) obj;
                cm4Var.getClass();
                return new kk3(2, new bm4(0, cm4Var));
            case 1:
                return ((OneMeRoomDatabase) obj).x();
            case 7:
                nfg nfgVar = (nfg) obj;
                nfgVar.getClass();
                Bundle bundle = new Bundle();
                String str = nfg.e;
                zjd zjdVar = nfgVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zjdVar.d);
                t76 t76VarListIterator = zjdVar.listIterator(0);
                while (t76VarListIterator.hasNext()) {
                    arrayList.add(((lfg) t76VarListIterator.next()).d());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 16:
                ((gb5) obj).getClass();
                vqa.i(null);
                throw null;
            case 22:
                return new nj4((mwf) obj);
            case 23:
                return new mj4((kwf) obj);
            default:
                qs5 qs5Var = (qs5) obj;
                Objects.requireNonNull(qs5Var);
                return new wk3(5, new gr5(qs5Var, 0));
        }
    }

    @Override // defpackage.qa8
    public void c(Object obj, z16 z16Var) {
        ((q3c) obj).getClass();
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        boolean z = false;
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i >= 0 && i2 >= 0) {
            z = true;
        }
        fsi.b(z);
        intArray.getClass();
        return new pq4(i, i2, intArray);
    }

    @Override // defpackage.b9e
    public int g(int i) {
        yy7[] yy7VarArr = DialogNotificationsSettingsScreen.X;
        return 4;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((r3c) obj).L0(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
                break;
            case 25:
            default:
                ((r3c) obj).c();
                break;
            case 26:
                ((q3c) obj).s();
                break;
            case 27:
                ((q3c) obj).getClass();
                break;
        }
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        switch (this.a) {
            case 9:
                Set setB = v6dVar.b(fsc.a(na0.class));
                iv6 iv6Var = iv6.c;
                if (iv6Var == null) {
                    synchronized (iv6.class) {
                        try {
                            iv6Var = iv6.c;
                            if (iv6Var == null) {
                                iv6Var = new iv6(0);
                                iv6.c = iv6Var;
                            }
                        } finally {
                        }
                    }
                }
                return new cr4(setB, iv6Var);
            case 18:
                return ExecutorsRegistrar.lambda$getComponents$4(v6dVar);
            case 19:
                return ExecutorsRegistrar.lambda$getComponents$5(v6dVar);
            case 20:
                return ExecutorsRegistrar.lambda$getComponents$6(v6dVar);
            default:
                return ExecutorsRegistrar.lambda$getComponents$7(v6dVar);
        }
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    @Override // defpackage.i55
    public void release() {
    }

    public /* synthetic */ dm4(int i, Object obj) {
        this.a = i;
    }
}
