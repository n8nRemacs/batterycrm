package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class cr1 {
    public static final Set n;
    public final i21 a;
    public final y6d b;
    public final zkb c;
    public final a3b d;
    public final xt4 e;
    public final y8g f;
    public final kme g = new kme(5);
    public final j35 h = new j35();
    public final s5i i;
    public final qs3 j;
    public final jkc k;
    public final ka5 l;
    public final qha m;

    static {
        String str;
        int[] iArrY = az1.y(39);
        ArrayList arrayList = new ArrayList(iArrY.length);
        for (int i : iArrY) {
            switch (i) {
                case 1:
                    str = RttRateHintConfig.RTT;
                    break;
                case 2:
                    str = "ss_freeze_count";
                    break;
                case 3:
                    str = "ss_total_freezes_duration";
                    break;
                case 4:
                    str = "cpu_usage_percent_total";
                    break;
                case 5:
                    str = "cpu_score_max";
                    break;
                case 6:
                    str = "cpu_score_avg";
                    break;
                case 7:
                    str = "cpu_hardware_concurrency";
                    break;
                case 8:
                    str = "memory_usage_mb_max";
                    break;
                case 9:
                    str = "memory_usage_mb_avg";
                    break;
                case 10:
                    str = "battery_level_change";
                    break;
                case 11:
                    str = "inserted_audio_samples_for_deceleration";
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    str = "removed_audio_samples_for_acceleration";
                    break;
                case 13:
                    str = "concealed_audio_samples";
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    str = "jitter_audio";
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    str = "concealed_silent_audio_samples";
                    break;
                case 16:
                    str = "concealment_audio_avg_size";
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    str = "audio_level";
                    break;
                case 18:
                    str = "total_audio_energy";
                    break;
                case 19:
                    str = "in_audio_loss";
                    break;
                case 20:
                    str = LossHintConfig.AUDIO_LOSS;
                    break;
                case 21:
                    str = "nack_sent";
                    break;
                case 22:
                    str = "pli_sent";
                    break;
                case 23:
                    str = "fir_sent";
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    str = "frames_decoded";
                    break;
                case 25:
                    str = "frames_dropped";
                    break;
                case 26:
                    str = "jitter_video";
                    break;
                case 27:
                    str = "interframe_delay_variance";
                    break;
                case 28:
                    str = "freeze_count";
                    break;
                case 29:
                    str = "total_freezes_duration";
                    break;
                case 30:
                    str = "in_video_loss";
                    break;
                case 31:
                    str = LossHintConfig.VIDEO_LOSS;
                    break;
                case 32:
                    str = "nack_received";
                    break;
                case 33:
                    str = "pli_received";
                    break;
                case 34:
                    str = "fir_received";
                    break;
                case 35:
                    str = "adaptation_changes";
                    break;
                case 36:
                    str = "frames_encoded";
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    str = "br_encode";
                    break;
                case 38:
                    str = "br_transmit";
                    break;
                case 39:
                    str = "br_retransmit";
                    break;
                default:
                    throw null;
            }
            arrayList.add(str);
        }
        n = ue3.h0(arrayList);
    }

    public cr1(i21 i21Var, y6d y6dVar, zkb zkbVar, jbe jbeVar, a3b a3bVar, xt4 xt4Var, y8g y8gVar) {
        this.a = i21Var;
        this.b = y6dVar;
        this.c = zkbVar;
        this.d = a3bVar;
        this.e = xt4Var;
        this.f = y8gVar;
        s5i s5iVar = new s5i();
        s5iVar.a = y6dVar;
        int i = 24;
        s5iVar.b = new kce(i);
        s5iVar.c = new kce(i);
        s5iVar.d = new kce(i);
        s5iVar.e = new kce(i);
        s5iVar.f = new kce(i);
        s5iVar.g = new HashMap();
        s5iVar.h = new kce(i);
        s5iVar.i = new kce(i);
        s5iVar.j = new kce(i);
        s5iVar.k = new kce(i);
        s5iVar.l = new s6b(8);
        this.i = s5iVar;
        this.j = new qs3(5);
        this.k = new jkc(13);
        this.l = new ka5(10);
        this.m = new qha(21);
    }
}
