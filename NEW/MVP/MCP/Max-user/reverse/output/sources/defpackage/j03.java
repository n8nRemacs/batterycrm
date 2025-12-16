package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class j03 implements em6 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ j03(long j, String str, Boolean bool, Long l) {
        this.b = j;
        this.c = str;
        this.d = bool;
        this.o = l;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) throws SecurityException, IllegalArgumentException {
        boolean z;
        int i;
        switch (this.a) {
            case 0:
                m03 m03Var = (m03) this.c;
                m03Var.getClass();
                return m03.c(m03Var, this.b, (lq9) this.d, (zxd) this.o, (Continuation) obj);
            case 1:
                FrgTrimVideo frgTrimVideo = (FrgTrimVideo) this.c;
                String str = (String) this.d;
                qm3 qm3Var = (qm3) this.o;
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                frgTrimVideo.getClass();
                mediaMetadataRetriever.setDataSource(zm.d, Uri.parse(str));
                int i2 = Build.VERSION.SDK_INT;
                long j = this.b;
                if (i2 < 27) {
                    return mediaMetadataRetriever.getFrameAtTime(j * 1000, 1);
                }
                try {
                    i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                    z = true;
                } catch (Exception e) {
                    wqi.e("ru.ok.messages.media.trim.FrgTrimVideo", "Can't extract video rotation", e);
                    z = false;
                    i = 0;
                }
                if (!z) {
                    return mediaMetadataRetriever.getFrameAtTime(j * 1000, 1);
                }
                lv4 lv4VarE = ((t1b) qm3Var).e();
                Context contextV = frgTrimVideo.v();
                lv4VarE.getClass();
                Size sizeH = lv4.h(contextV);
                if (i == 0 || i == 180) {
                    sizeH = new Size(sizeH.getHeight(), sizeH.getWidth());
                }
                return mediaMetadataRetriever.getScaledFrameAtTime(j * 1000, 1, sizeH.getWidth(), sizeH.getHeight());
            default:
                String str2 = (String) this.c;
                Boolean bool = (Boolean) this.d;
                Long l = (Long) this.o;
                hi4 hi4Var = (hi4) obj;
                hi4Var.a = ":chats";
                hi4Var.c(Long.valueOf(this.b), "id");
                hi4Var.c("local", "type");
                if (str2 != null) {
                    hi4Var.c(str2, ApiProtocol.PARAM_PAYLOAD);
                }
                if (bool != null) {
                    hi4Var.c(bool, "highlight_message");
                }
                if (l != null) {
                    hi4Var.c(Long.valueOf(l.longValue()), "message_id");
                }
                return qqg.a;
        }
    }

    public /* synthetic */ j03(m03 m03Var, long j, lq9 lq9Var, zxd zxdVar) {
        this.c = m03Var;
        this.b = j;
        this.d = lq9Var;
        this.o = zxdVar;
    }

    public /* synthetic */ j03(FrgTrimVideo frgTrimVideo, String str, qm3 qm3Var, long j) {
        this.c = frgTrimVideo;
        this.d = str;
        this.o = qm3Var;
        this.b = j;
    }
}
