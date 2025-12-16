package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class pv3 implements gu3, pa8, w2f, uu1, jy8, ewd, vvf {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pv3(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override // defpackage.vvf
    public Object a() {
        awg awgVar = (awg) this.c;
        ac0 ac0Var = (ac0) this.d;
        ri5 ri5Var = awgVar.c;
        long time = awgVar.g.getTime() + this.b;
        gwd gwdVar = (gwd) ri5Var;
        gwdVar.getClass();
        gwdVar.y(new ny1(time, ac0Var, 11));
        return null;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        String str = (String) this.c;
        String str2 = (String) this.d;
        rv3 rv3Var = (rv3) obj;
        rv3Var.b = str;
        rv3Var.c = str2;
        rv3Var.e = this.b;
    }

    @Override // defpackage.ewd
    /* renamed from: apply */
    public Object mo26apply(Object obj) throws SQLException {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((jg8) this.d).a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.b;
            if (z) {
                sQLiteDatabase.execSQL(a9h.d(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(IceCandidatePairChangedStat.KEY_REASON, Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.jy8
    public void d(eb7 eb7Var, int i) {
        eb7Var.h(((ly8) this.c).c, i, ((k09) this.d).d(true), this.b);
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) throws Exception {
        Object objInvoke;
        FrgTrimVideo frgTrimVideo = (FrgTrimVideo) this.d;
        String str = (String) this.c;
        qm3 qm3Var = (qm3) frgTrimVideo.l1.b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        j03 j03Var = new j03(frgTrimVideo, str, qm3Var, this.b);
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
            try {
                objInvoke = j03Var.invoke(mediaMetadataRetriever2);
                bui.a(mediaMetadataRetriever2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bui.a(mediaMetadataRetriever2, th);
                    throw th2;
                }
            }
        } else {
            try {
                objInvoke = j03Var.invoke(mediaMetadataRetriever);
                mediaMetadataRetriever.release();
            } finally {
            }
        }
        iz5 iz5VarF = ((t1b) qm3Var).f();
        iz5VarF.getClass();
        String path = iz5VarF.m(null, null).getPath();
        tfi.m(path, (Bitmap) objInvoke, 90, Bitmap.CompressFormat.JPEG);
        i2fVar.a(path);
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        ((jd) obj).m0((id) this.c, this.d, this.b);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 3:
                wu1 wu1Var = (wu1) this.c;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d;
                wsf.h(wu1Var, tu1Var);
                vu1 vu1Var = wu1Var.b;
                if (!vu1Var.isDone()) {
                    final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new qz5(tu1Var, 6, wu1Var), this.b, TimeUnit.MILLISECONDS);
                    final int i = 1;
                    vu1Var.d(new Runnable() { // from class: vn6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                            }
                        }
                    }, ayi.a());
                }
                return "TimeoutFuture[" + wu1Var + "]";
            default:
                ha8 ha8Var = (ha8) this.c;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.d;
                wsf.h(ha8Var, tu1Var);
                if (!ha8Var.isDone()) {
                    long j = this.b;
                    final ScheduledFuture scheduledFutureSchedule2 = scheduledExecutorService2.schedule(new un6(tu1Var, ha8Var, j), j, TimeUnit.MILLISECONDS);
                    final int i2 = 0;
                    ha8Var.d(new Runnable() { // from class: vn6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                            }
                        }
                    }, ayi.a());
                }
                return "TimeoutFuture[" + ha8Var + "]";
        }
    }

    public /* synthetic */ pv3(FrgTrimVideo frgTrimVideo, String str, long j) {
        this.a = 2;
        this.d = frgTrimVideo;
        this.c = str;
        this.b = j;
    }
}
