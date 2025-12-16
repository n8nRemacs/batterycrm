package vh;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api4BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvh/e;", "", "", "count", "", "icon", "", "progress", "Lvh/f;", "progressColor", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(JLjava/lang/String;DLvh/f;Lcom/avito/android/remote/model/text/AttributedText;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "D", "c", "()D", "Lvh/f;", "d", "()Lvh/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    @com.google.gson.annotations.c("count")
    private final long count;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c("progress")
    private final double progress;

    @com.google.gson.annotations.c("progressColor")
    @Y61.l
    private final f progressColor;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final AttributedText text;

    public e(long j12, @Y61.l String str, double d12, @Y61.l f fVar, @Y61.l AttributedText attributedText) {
        this.count = j12;
        this.icon = str;
        this.progress = d12;
        this.progressColor = fVar;
        this.text = attributedText;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final f getProgressColor() {
        return this.progressColor;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
