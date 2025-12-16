package Cj0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LCj0/e;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LCj0/f;", "standaloneLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LCj0/f;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LCj0/f;", "b", "()LCj0/f;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class e {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("standaloneLink")
    @Y61.k
    private final f standaloneLink;

    public e(@Y61.l AttributedText attributedText, @Y61.k f fVar) {
        this.description = attributedText;
        this.standaloneLink = fVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final f getStandaloneLink() {
        return this.standaloneLink;
    }
}
