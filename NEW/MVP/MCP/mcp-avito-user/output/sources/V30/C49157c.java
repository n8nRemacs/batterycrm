package v30;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ApiNewCarsFilterModelsResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv30/c;", "", "Lv30/d;", "icon", "", "id", "", "text", "<init>", "(Lv30/d;JLjava/lang/String;)V", "Lv30/d;", "getIcon", "()Lv30/d;", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_new-cars-mark-model-filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v30.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49157c {

    @com.google.gson.annotations.c("icon")
    @l
    private final C49158d icon;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public C49157c(@l C49158d c49158d, long j12, @k String str) {
        this.icon = c49158d;
        this.id = j12;
        this.text = str;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
