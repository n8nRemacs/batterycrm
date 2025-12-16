package defpackage;

import android.media.MediaPlayer;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class vdc implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vdc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new n39(21, (hdc) this.b);
            case 1:
                return new n39(22, (sec) this.b);
            case 2:
                return new n39(23, (l3b) this.b);
            case 3:
                return new n39(24, (wj1) this.b);
            case 4:
                return new n39(25, (wj1) this.b);
            case 5:
                return new n39(26, (l3b) this.b);
            case 6:
                return new n39(27, (hdc) this.b);
            case 7:
                return new n39(28, (wj1) this.b);
            case 8:
                return new n39(29, (bfd) this.b);
            case 9:
                return new fgd(0, (wj1) this.b);
            case 10:
                return new fgd(1, (pjd) this.b);
            case 11:
                return new fgd(2, (efd) this.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new fgd(3, (efd) this.b);
            case 13:
                return new fgd(4, (efd) this.b);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new fgd(5, (efd) this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new fgd(6, (prd) this.b);
            case 16:
                return new fgd(7, (efd) this.b);
            case LangUtils.HASH_SEED /* 17 */:
                return new fgd(8, (cm6) this.b);
            case 18:
                return new fgd(9, (hqe) this.b);
            case 19:
                return new fgd(10, (efd) this.b);
            case 20:
                return new fgd(11, (efd) this.b);
            case 21:
                return new fgd(12, (nte) this.b);
            case 22:
                return new fgd(13, (zxe) this.b);
            case 23:
                ((MediaPlayer) this.b).release();
                return qqg.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new fgd(14, (nte) this.b);
            case 25:
                return new fgd(15, (nte) this.b);
            case 26:
                return new fgd(16, (prd) this.b);
            case 27:
                return new fgd(17, (hff) this.b);
            case 28:
                return new fgd(18, (fhf) this.b);
            default:
                return new fgd(19, (mhf) this.b);
        }
    }
}
