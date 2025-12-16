package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.LogFactory;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.contacts.ContactController$ContactNotFoundException;

/* loaded from: classes.dex */
public final /* synthetic */ class ny1 implements uu1, n7c, w2f, pa8, oa8, gu3, jy8, r19, y89, usa, es8, ewd, sk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 5:
                wqi.c("zd8", "validateThumbnailUri: id = %d, result = %s, uri = %s", Long.valueOf(j), (Boolean) obj, (String) obj2);
                break;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) obj2;
                int i2 = VideoPlayerSeekBarPreview.D0;
                Locale locale = Locale.ENGLISH;
                wqi.e("ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview", "Can't extract frame millis = " + j, (Throwable) obj);
                bwd.b(videoPlayerSeekBarPreview.t0);
                videoPlayerSeekBarPreview.c.a(false);
                break;
        }
    }

    @Override // defpackage.ewd
    /* renamed from: apply */
    public Object mo26apply(Object obj) {
        ac0 ac0Var = (ac0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = ac0Var.a;
        l9c l9cVar = ac0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(o9c.a(l9cVar))}) < 1) {
            contentValues.put("backend_name", ac0Var.a);
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(o9c.a(l9cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        ry ryVar;
        lkd lkdVar = (lkd) this.c;
        f2h f2hVar = lkdVar.e;
        if (f2hVar != null && (ryVar = ((ml0) f2hVar).e) != null) {
            sf7 sf7VarD = sf7.d(Uri.parse((String) ryVar.X));
            sf7VarD.k = new bk6(lkdVar.e, this.b);
            pe4 pe4VarB = lkdVar.f.b(sf7VarD.a(), null);
            lkdVar.h = pe4VarB;
            ((r0) pe4VarB).l(new kkd(rr8Var), yu1.a);
            return;
        }
        if (rr8Var.e()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Video content or collage is null");
        if (rr8Var.d(illegalStateException)) {
            return;
        }
        t8j.a(illegalStateException);
    }

    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        jwg jwgVar = (jwg) this.c;
        long j = this.b;
        wy1.q(j, "removeUploadWithAttachId: attachId=", "jwg");
        synchronized (jwgVar) {
            jwgVar.a.b(j).c(((gwg) jwgVar.b.getValue()).b(j)).a();
        }
        if (jk3Var.e()) {
            return;
        }
        jk3Var.b();
    }

    @Override // defpackage.jy8
    public void d(eb7 eb7Var, int i) {
        ly8 ly8Var = (ly8) this.c;
        eb7Var.D(ly8Var.c, i, this.b);
    }

    @Override // defpackage.usa
    public void e(ira iraVar) throws SecurityException, IllegalArgumentException {
        Bitmap bitmapCreateScaledBitmap;
        RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) this.c;
        for (int i = 0; i < rangeSeekBarView.L0 + 2.0f && !iraVar.e(); i++) {
            long j = (i * rangeSeekBarView.M0) + this.b;
            if (rangeSeekBarView.F0.get(j) == null) {
                FrgTrimVideo frgTrimVideo = rangeSeekBarView.H0;
                int i2 = rangeSeekBarView.K0;
                if (frgTrimVideo.u1 == null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    frgTrimVideo.u1 = mediaMetadataRetriever;
                    mediaMetadataRetriever.setDataSource(frgTrimVideo.v(), frgTrimVideo.w1);
                }
                Bitmap frameAtTime = frgTrimVideo.u1.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j), 2);
                if (frameAtTime == null) {
                    bitmapCreateScaledBitmap = null;
                } else {
                    int iMin = Math.min(frameAtTime.getWidth(), frameAtTime.getHeight());
                    int width = (frameAtTime.getWidth() - iMin) / 2;
                    int height = (frameAtTime.getHeight() - iMin) / 2;
                    Rect rect = new Rect(width, height, width + iMin, iMin + height);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameAtTime, rect.left, rect.top, rect.width(), rect.height());
                    if (frameAtTime != bitmapCreateBitmap) {
                        frameAtTime.recycle();
                    }
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i2, true);
                    if (bitmapCreateBitmap != bitmapCreateScaledBitmap) {
                        bitmapCreateBitmap.recycle();
                    }
                }
                if (bitmapCreateScaledBitmap != null) {
                    iraVar.d(new kmb(Long.valueOf(j), bitmapCreateScaledBitmap));
                }
            }
        }
        iraVar.b();
    }

    @Override // defpackage.n7c
    public boolean f(Comparable comparable) {
        n7c n7cVar = (n7c) this.c;
        pb2 pb2Var = (pb2) comparable;
        if (pb2Var.b.e(this.b)) {
            return pb2Var.b.k > 0;
        }
        if (ve2.N.f(pb2Var)) {
            return n7cVar == null || n7cVar.f(pb2Var);
        }
        return false;
    }

    @Override // defpackage.r19
    public q19 h() {
        q19 q19Var = (q19) ((h49) this.c).r.get();
        return q19Var == null ? new q19(0L, 0L, h49.A, this.b) : q19Var;
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        qv3 qv3Var = (qv3) this.c;
        qv3Var.b();
        long j = this.b;
        ku3 ku3VarH = qv3Var.h(j, false);
        if (ku3VarH != null) {
            if (i2fVar.e()) {
                return;
            }
            i2fVar.a(ku3VarH);
        } else {
            if (i2fVar.e()) {
                return;
            }
            i2fVar.onError(new ContactController$ContactNotFoundException(vb9.e(j, "contact not found: ")));
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [i3, t39] */
    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        ?? r5;
        int i = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                ((jd) obj).I((id) obj2, j);
                break;
            default:
                fl5 fl5Var = (fl5) obj;
                fl5Var.getClass();
                fl5.c();
                wqi.c("fl5", "videoDebugListener.onRenderedFirstFrame: output = %s renderTimeMs = %d", obj2 != null ? obj2.toString() : "", Long.valueOf(j));
                xd8 xd8Var = fl5Var.X;
                if (xd8Var != null && (r5 = xd8Var.e) != 0) {
                    r5.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.uu1
    public String m(final tu1 tu1Var) {
        ry1 ry1Var = (ry1) this.c;
        final long j = this.b;
        ry1Var.p(new qy1() { // from class: jy1
            @Override // defpackage.qy1
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                if (!ry1.x(totalCaptureResult, j)) {
                    return false;
                }
                tu1Var.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        return o79Var.r(u69Var, wg7.m((k09) this.c), 0, this.b);
    }

    public /* synthetic */ ny1(hd hdVar, Object obj, long j) {
        this.a = 4;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ ny1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
