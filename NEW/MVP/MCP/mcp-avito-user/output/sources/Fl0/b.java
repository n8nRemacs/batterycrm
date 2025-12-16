package FL0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_performance.remote.model.stickers.buy.InfoIconName;
import kotlin.Metadata;

/* compiled from: InfoSection.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LFL0/b;", "", "Lcom/avito/android/vas_performance/remote/model/stickers/buy/InfoIconName;", "iconName", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Lcom/avito/android/vas_performance/remote/model/stickers/buy/InfoIconName;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/vas_performance/remote/model/stickers/buy/InfoIconName;", "b", "()Lcom/avito/android/vas_performance/remote/model/stickers/buy/InfoIconName;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("iconName")
    @l
    private final InfoIconName iconName;

    public b(@l InfoIconName infoIconName, @l AttributedText attributedText) {
        this.iconName = infoIconName;
        this.description = attributedText;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final InfoIconName getIconName() {
        return this.iconName;
    }
}
