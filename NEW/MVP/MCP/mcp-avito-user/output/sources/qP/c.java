package QP;

import Y61.k;
import Y61.l;
import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlock;
import java.util.List;
import kotlin.Metadata;

/* compiled from: V1JobCvActualizationResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"LQP/c;", "", "", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock;", "blocks", "", "buttonText", "subtitle", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    @com.google.gson.annotations.c("blocks")
    @k
    private final List<CvActualizationBlock> blocks;

    @com.google.gson.annotations.c("buttonText")
    @k
    private final String buttonText;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k List<CvActualizationBlock> list, @k String str, @l String str2, @k String str3) {
        this.blocks = list;
        this.buttonText = str;
        this.subtitle = str2;
        this.title = str3;
    }

    @k
    public final List<CvActualizationBlock> a() {
        return this.blocks;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
