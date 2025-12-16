package jh;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljh/t;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "otherBudgetText", "otherBudgetIcon", "forecastTitle", "", "Ljh/u;", "budgetsByDayList", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t {

    @com.google.gson.annotations.c("budgetsByDay")
    @Y61.k
    private final List<u> budgetsByDayList;

    @com.google.gson.annotations.c("forecastTitle")
    @Y61.k
    private final AttributedText forecastTitle;

    @com.google.gson.annotations.c("otherBudgetIcon")
    @Y61.k
    private final AttributedText otherBudgetIcon;

    @com.google.gson.annotations.c("otherBudgetText")
    @Y61.k
    private final AttributedText otherBudgetText;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public t(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k AttributedText attributedText3, @Y61.k List<u> list) {
        this.title = str;
        this.otherBudgetText = attributedText;
        this.otherBudgetIcon = attributedText2;
        this.forecastTitle = attributedText3;
        this.budgetsByDayList = list;
    }

    @Y61.k
    public final List<u> a() {
        return this.budgetsByDayList;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getForecastTitle() {
        return this.forecastTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getOtherBudgetIcon() {
        return this.otherBudgetIcon;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getOtherBudgetText() {
        return this.otherBudgetText;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
