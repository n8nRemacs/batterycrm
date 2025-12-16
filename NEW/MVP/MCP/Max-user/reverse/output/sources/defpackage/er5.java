package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class er5 implements tm6, gu3 {
    public final /* synthetic */ int a;

    public /* synthetic */ er5(int i) {
        this.a = i;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 6:
                wqi.e("vr5", "failed favorites obs", th);
                break;
            case 7:
                wqi.e("vr5", "onAssetsUpdate: failed to store fav sticker sets", th);
                break;
            case 8:
                wqi.e("vr5", "setFavoriteStickerSetMoved: failed", th);
                break;
            case 10:
                wqi.e("vr5", "load: failed", th);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                wqi.e("vr5", "clear: failed to clear fav stickers repository", th);
                break;
            case 26:
                Locale locale = Locale.ENGLISH;
                wqi.e("js5", "assetsUpdate: failed request, sync=0", th);
                break;
            case 27:
                wqi.e("ps5", "failed favorites obs", th);
                break;
            default:
                wqi.e("ps5", "clear: failed to clear repository", th);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        int i = this.a;
        final int i2 = 1;
        int i3 = 5;
        int i4 = 2;
        final int i5 = 0;
        nk3 nk3Var = nk3.a;
        switch (i) {
            case 0:
                return ((OneMeRoomDatabase) obj).A();
            case 1:
                qs5 qs5Var = (qs5) obj;
                qs5Var.getClass();
                return new kk3(i4, new bm4(3, qs5Var));
            case 2:
                qs5 qs5Var2 = (qs5) obj;
                Objects.requireNonNull(qs5Var2);
                return new wk3(i3, new gr5(qs5Var2, 1));
            case 3:
                qs5 qs5Var3 = (qs5) obj;
                qs5Var3.getClass();
                return yfi.c(qs5Var3.a, new String[]{"favorite_stickers"}, new ci(qs5Var3, 11, dsd.c(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC")));
            case 4:
                return new m2f(((zr5) obj).a(), new er5(17), 0);
            case 5:
                return new vr8(((zr5) obj).a(), new er5(18), 3);
            case 6:
            case 7:
            case 8:
            case 10:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                return new ArrayList((List) obj);
            case 9:
                return new m2f(((zr5) obj).a(), new er5(15), 0);
            case 11:
                return new ik3(((zr5) obj).a(), i4, new er5(16));
            case 13:
                return ((as5) obj).a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((OneMeRoomDatabase) obj).z();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                final hs5 hs5Var = (hs5) obj;
                Objects.requireNonNull(hs5Var);
                return new wk3(i3, new Callable() { // from class: xr5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i5) {
                            case 0:
                                hs5 hs5Var2 = hs5Var;
                                hs5Var2.getClass();
                                dsd dsdVarC = dsd.c(0, "SELECT COUNT(*) FROM favorite_sticker_sets");
                                lrd lrdVar = hs5Var2.a;
                                lrdVar.b();
                                Cursor cursorN = lrdVar.n(dsdVarC);
                                try {
                                    long j = cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
                                    cursorN.close();
                                    dsdVarC.y();
                                    return Long.valueOf(j);
                                } catch (Throwable th) {
                                    cursorN.close();
                                    dsdVarC.y();
                                    throw th;
                                }
                            default:
                                return hs5Var.c();
                        }
                    }
                });
            case 16:
                hs5 hs5Var2 = (hs5) obj;
                hs5Var2.getClass();
                return new kk3(i4, new bm4(2, hs5Var2));
            case LangUtils.HASH_SEED /* 17 */:
                final hs5 hs5Var3 = (hs5) obj;
                Objects.requireNonNull(hs5Var3);
                return new wk3(i3, new Callable() { // from class: xr5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i2) {
                            case 0:
                                hs5 hs5Var22 = hs5Var3;
                                hs5Var22.getClass();
                                dsd dsdVarC = dsd.c(0, "SELECT COUNT(*) FROM favorite_sticker_sets");
                                lrd lrdVar = hs5Var22.a;
                                lrdVar.b();
                                Cursor cursorN = lrdVar.n(dsdVarC);
                                try {
                                    long j = cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
                                    cursorN.close();
                                    dsdVarC.y();
                                    return Long.valueOf(j);
                                } catch (Throwable th) {
                                    cursorN.close();
                                    dsdVarC.y();
                                    throw th;
                                }
                            default:
                                return hs5Var3.c();
                        }
                    }
                });
            case 18:
                hs5 hs5Var4 = (hs5) obj;
                hs5Var4.getClass();
                return yfi.c(hs5Var4.a, new String[]{"favorite_sticker_sets"}, new ci(hs5Var4, 8, dsd.c(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC")));
            case 19:
                iu iuVar = (iu) obj;
                return new as5(iuVar.X, iuVar.d);
            case 20:
                return nk3Var;
            case 21:
                return nk3Var;
            case 22:
                return nk3Var;
            case 23:
                iu iuVar2 = (iu) obj;
                return new is5(iuVar2.X, iuVar2.c);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return nk3Var;
            case 25:
                return nk3Var;
        }
    }
}
