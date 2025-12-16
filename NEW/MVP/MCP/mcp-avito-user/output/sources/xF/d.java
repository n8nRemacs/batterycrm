package XF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.motivation_screen.generated.api.get_gig_worker_motivation.ProgressDuty;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetGigWorkerMotivationResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"LXF/d;", "", "", "Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty;", "duties", "", "dutyCount", "paymentTitle", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    @com.google.gson.annotations.c("duties")
    @k
    private final List<ProgressDuty> duties;

    @com.google.gson.annotations.c("dutyCount")
    @k
    private final String dutyCount;

    @com.google.gson.annotations.c("paymentTitle")
    @l
    private final String paymentTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public d(@k List<ProgressDuty> list, @k String str, @l String str2, @k String str3) {
        this.duties = list;
        this.dutyCount = str;
        this.paymentTitle = str2;
        this.title = str3;
    }

    @k
    public final List<ProgressDuty> a() {
        return this.duties;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDutyCount() {
        return this.dutyCount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPaymentTitle() {
        return this.paymentTitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
