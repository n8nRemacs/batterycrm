package UB0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiTariffCpxInfoV4Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LUB0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LUB0/e;", "featureBanner", "", "title", "LUB0/f;", "titleButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LUB0/e;Ljava/lang/String;LUB0/f;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "LUB0/e;", "getFeatureBanner", "()LUB0/e;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "LUB0/f;", "getTitleButton", "()LUB0/f;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("featureBanner")
    @Y61.l
    private final e featureBanner;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleButton")
    @Y61.l
    private final f titleButton;

    public d(@Y61.l AttributedText attributedText, @Y61.l e eVar, @Y61.k String str, @Y61.l f fVar) {
        this.description = attributedText;
        this.featureBanner = eVar;
        this.title = str;
        this.titleButton = fVar;
    }
}
