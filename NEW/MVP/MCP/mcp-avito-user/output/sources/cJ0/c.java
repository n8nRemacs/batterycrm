package Cj0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LCj0/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LCj0/h;", "standaloneLink", "", "title", "LCj0/a;", "toProductListAction", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LCj0/h;Ljava/lang/String;LCj0/a;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LCj0/h;", "b", "()LCj0/h;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LCj0/a;", "d", "()LCj0/a;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class c {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("standaloneLink")
    @Y61.k
    private final h standaloneLink;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("toProductListAction")
    @Y61.k
    private final C13313a toProductListAction;

    public c(@Y61.k AttributedText attributedText, @Y61.k h hVar, @Y61.k String str, @Y61.k C13313a c13313a) {
        this.description = attributedText;
        this.standaloneLink = hVar;
        this.title = str;
        this.toProductListAction = c13313a;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final h getStandaloneLink() {
        return this.standaloneLink;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final C13313a getToProductListAction() {
        return this.toProductListAction;
    }
}
