package Yl0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LYl0/h;", "", "", "multiText", "text", "", "useForShortcut", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl0.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18285h {

    @com.google.gson.annotations.c("multiText")
    @Y61.l
    private final String multiText;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c("useForShortcut")
    @Y61.k
    private final List<String> useForShortcut;

    public C18285h(@Y61.l String str, @Y61.k String str2, @Y61.k List<String> list) {
        this.multiText = str;
        this.text = str2;
        this.useForShortcut = list;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getMultiText() {
        return this.multiText;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.k
    public final List<String> c() {
        return this.useForShortcut;
    }
}
