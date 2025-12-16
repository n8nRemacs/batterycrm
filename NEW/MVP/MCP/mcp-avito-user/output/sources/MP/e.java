package Mp;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"LMp/e;", "", "", "backgroundGradient", "LMp/c;", "calculationInfo", "LMp/f;", "dealIncome", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/Image;", "image", "title", "<init>", "(Ljava/lang/String;LMp/c;LMp/f;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LMp/c;", "b", "()LMp/c;", "LMp/f;", "c", "()LMp/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "f", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c("backgroundGradient")
    @Y61.k
    private final String backgroundGradient;

    @com.google.gson.annotations.c("calculationInfo")
    @Y61.l
    private final c calculationInfo;

    @com.google.gson.annotations.c("dealIncome")
    @Y61.l
    private final f dealIncome;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final Image image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public e(@Y61.k String str, @Y61.l c cVar, @Y61.l f fVar, @Y61.k AttributedText attributedText, @Y61.k Image image, @Y61.k AttributedText attributedText2) {
        this.backgroundGradient = str;
        this.calculationInfo = cVar;
        this.dealIncome = fVar;
        this.description = attributedText;
        this.image = image;
        this.title = attributedText2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final c getCalculationInfo() {
        return this.calculationInfo;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final f getDealIncome() {
        return this.dealIncome;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
