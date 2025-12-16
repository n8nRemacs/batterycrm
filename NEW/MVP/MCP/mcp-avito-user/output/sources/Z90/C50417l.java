package z90;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz90/l;", "", "Lz90/m;", "action", "Lz90/n;", "backgroundColor", "Lz90/o;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lz90/m;Lz90/n;Lz90/o;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lz90/m;", "a", "()Lz90/m;", "Lz90/n;", "getBackgroundColor", "()Lz90/n;", "Lz90/o;", "b", "()Lz90/o;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50417l {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final C50418m action;

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.l
    private final C50419n backgroundColor;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final C50420o image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public C50417l(@Y61.k C50418m c50418m, @Y61.l C50419n c50419n, @Y61.k C50420o c50420o, @Y61.k AttributedText attributedText) {
        this.action = c50418m;
        this.backgroundColor = c50419n;
        this.image = c50420o;
        this.title = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C50418m getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C50420o getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
