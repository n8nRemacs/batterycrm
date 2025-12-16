package CE;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api21FeesFeesMethodsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LCE/f;", "", "", "LCE/b;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    @com.google.gson.annotations.c("actions")
    @l
    private final List<b> actions;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.k
    private final String style;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public f(@l List<b> list, @Y61.k AttributedText attributedText, @Y61.k String str, @Y61.k String str2) {
        this.actions = list;
        this.description = attributedText;
        this.style = str;
        this.title = str2;
    }

    @l
    public final List<b> a() {
        return this.actions;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
