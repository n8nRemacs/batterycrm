package Jk0;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ApicoNotificationsSettingsResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LJk0/b;", "", "", "title", "type", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Z", "c", "()Z", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jk0.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C14208b {

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    @com.google.gson.annotations.c("value")
    private final boolean value;

    public C14208b(@k String str, @k String str2, boolean z12) {
        this.title = str;
        this.type = str2;
        this.value = z12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }
}
