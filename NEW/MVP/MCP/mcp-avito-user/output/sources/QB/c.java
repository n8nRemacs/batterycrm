package Qb;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: OpenV2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LQb/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "LQb/d;", "image", "", "title", "toastText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LQb/d;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LQb/d;", "b", "()LQb/d;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    @com.google.gson.annotations.c("attributedText")
    @Y61.k
    private final AttributedText attributedText;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final d image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("toastText")
    @Y61.l
    private final String toastText;

    public c(@Y61.k AttributedText attributedText, @Y61.k d dVar, @Y61.k String str, @Y61.l String str2) {
        this.attributedText = attributedText;
        this.image = dVar;
        this.title = str;
        this.toastText = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final d getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getToastText() {
        return this.toastText;
    }
}
