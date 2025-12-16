package PO;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AppliesCreateV3Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LPO/b;", "", "LPO/c;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LPO/d;", "secondaryButton", "", "title", "<init>", "(LPO/c;Lcom/avito/android/remote/model/text/AttributedText;LPO/d;Ljava/lang/String;)V", "LPO/c;", "getButton", "()LPO/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "LPO/d;", "getSecondaryButton", "()LPO/d;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final c button;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("secondaryButton")
    @Y61.l
    private final d secondaryButton;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public b(@Y61.l c cVar, @Y61.k AttributedText attributedText, @Y61.l d dVar, @Y61.k String str) {
        this.button = cVar;
        this.description = attributedText;
        this.secondaryButton = dVar;
        this.title = str;
    }
}
