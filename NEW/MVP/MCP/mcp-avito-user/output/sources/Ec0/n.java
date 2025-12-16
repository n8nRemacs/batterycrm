package eC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LeC0/n;", "", "", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n {

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.k
    private final UniversalColor backgroundColor;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    public n(@Y61.l String str, @Y61.k UniversalColor universalColor, @Y61.k AttributedText attributedText) {
        this.icon = str;
        this.backgroundColor = universalColor;
        this.text = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
