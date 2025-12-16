package GL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VasStickersEditResult.kt */
@P
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b-\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"LGL0/c;", "", "", "progress", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/Image;", "icon", "", "maxSelectedCount", "LGL0/b;", "service", "", "LEL0/a;", "stickers", "emptyActionTitle", "selectedActionTitle", "alertMessage", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;ILGL0/b;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "Ljava/lang/Float;", "g", "()Ljava/lang/Float;", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "I", "f", "()I", "LGL0/b;", "i", "()LGL0/b;", "Ljava/util/List;", "j", "()Ljava/util/List;", "d", "h", "b", "Lcom/avito/android/remote/model/Action;", "a", "()Lcom/avito/android/remote/model/Action;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("alertMessage")
    @l
    private final String alertMessage;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("emptyActionTitle")
    @l
    private final String emptyActionTitle;

    @com.google.gson.annotations.c("icon")
    @l
    private final Image icon;

    @com.google.gson.annotations.c("maxSelectedCount")
    private final int maxSelectedCount;

    @com.google.gson.annotations.c("progress")
    @l
    private final Float progress;

    @com.google.gson.annotations.c("selectedActionTitle")
    @l
    private final String selectedActionTitle;

    @com.google.gson.annotations.c("service")
    @k
    private final b service;

    @com.google.gson.annotations.c("stickers")
    @k
    private final List<EL0.a> stickers;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@l Float f12, @k String str, @l AttributedText attributedText, @l Image image, int i12, @k b bVar, @k List<EL0.a> list, @l String str2, @l String str3, @l String str4, @l Action action) {
        this.progress = f12;
        this.title = str;
        this.description = attributedText;
        this.icon = image;
        this.maxSelectedCount = i12;
        this.service = bVar;
        this.stickers = list;
        this.emptyActionTitle = str2;
        this.selectedActionTitle = str3;
        this.alertMessage = str4;
        this.action = action;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getEmptyActionTitle() {
        return this.emptyActionTitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    /* renamed from: f, reason: from getter */
    public final int getMaxSelectedCount() {
        return this.maxSelectedCount;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getSelectedActionTitle() {
        return this.selectedActionTitle;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final b getService() {
        return this.service;
    }

    @k
    public final List<EL0.a> j() {
        return this.stickers;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
