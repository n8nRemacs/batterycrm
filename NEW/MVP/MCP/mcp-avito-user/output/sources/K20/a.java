package K20;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: UpdateTypedUrgencyResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LK20/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "timerTitle", "LK20/b;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LK20/b;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTimerTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "LK20/b;", "getTooltip", "()LK20/b;", "_avito_multi-urgency_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    @com.google.gson.annotations.c("timerTitle")
    @k
    private final AttributedText timerTitle;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @k
    private final b tooltip;

    public a(@k AttributedText attributedText, @k b bVar) {
        this.timerTitle = attributedText;
        this.tooltip = bVar;
    }
}
