package z90;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz90/k;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50416k {

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final AttributedText value;

    public C50416k(@Y61.l String str, @Y61.l AttributedText attributedText) {
        this.title = str;
        this.value = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }
}
