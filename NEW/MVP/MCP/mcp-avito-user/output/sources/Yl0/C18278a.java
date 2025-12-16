package Yl0;

import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LYl0/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "default", "multiDefault", "", "LYl0/b;", "shortcutVariant", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18278a {

    @com.google.gson.annotations.c("default")
    @Y61.k
    private final AttributedText default;

    @com.google.gson.annotations.c("multiDefault")
    @Y61.l
    private final AttributedText multiDefault;

    @com.google.gson.annotations.c("shortcutVariant")
    @Y61.l
    private final List<C18279b> shortcutVariant;

    public C18278a(@Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l List<C18279b> list) {
        this.default = attributedText;
        this.multiDefault = attributedText2;
        this.shortcutVariant = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDefault() {
        return this.default;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getMultiDefault() {
        return this.multiDefault;
    }

    @Y61.l
    public final List<C18279b> c() {
        return this.shortcutVariant;
    }
}
