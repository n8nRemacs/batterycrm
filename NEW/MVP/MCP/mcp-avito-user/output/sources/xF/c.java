package XF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetGigWorkerMotivationResponse.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b*\u0010\u001f¨\u0006+"}, d2 = {"LXF/c;", "", "LXF/a;", "actionButton", "", "", "badge", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "duration", "LXF/b;", "footerInfo", "headerTitle", "LXF/d;", "progress", "", "shouldShowAnimation", "subtitle", "<init>", "(LXF/a;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;LXF/b;Ljava/lang/String;LXF/d;ZLcom/avito/android/remote/model/text/AttributedText;)V", "LXF/a;", "a", "()LXF/a;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "LXF/b;", "e", "()LXF/b;", "f", "LXF/d;", "g", "()LXF/d;", "Z", "h", "()Z", "i", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    @com.google.gson.annotations.c("actionButton")
    @l
    private final a actionButton;

    @com.google.gson.annotations.c("badge")
    @k
    private final List<String> badge;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("duration")
    @k
    private final AttributedText duration;

    @com.google.gson.annotations.c("footerInfo")
    @k
    private final b footerInfo;

    @com.google.gson.annotations.c("headerTitle")
    @k
    private final String headerTitle;

    @com.google.gson.annotations.c("progress")
    @k
    private final d progress;

    @com.google.gson.annotations.c("shouldShowAnimation")
    private final boolean shouldShowAnimation;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final AttributedText subtitle;

    public c(@l a aVar, @k List<String> list, @k String str, @k AttributedText attributedText, @k b bVar, @k String str2, @k d dVar, boolean z12, @k AttributedText attributedText2) {
        this.actionButton = aVar;
        this.badge = list;
        this.description = str;
        this.duration = attributedText;
        this.footerInfo = bVar;
        this.headerTitle = str2;
        this.progress = dVar;
        this.shouldShowAnimation = z12;
        this.subtitle = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getActionButton() {
        return this.actionButton;
    }

    @k
    public final List<String> b() {
        return this.badge;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getDuration() {
        return this.duration;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final b getFooterInfo() {
        return this.footerInfo;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final d getProgress() {
        return this.progress;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getShouldShowAnimation() {
        return this.shouldShowAnimation;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }
}
