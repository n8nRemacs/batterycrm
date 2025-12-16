package fl0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Api1PublishItemRestrictionCheckGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfl0/a;", "", "Lfl0/c;", "content", "", "isAllowed", "<init>", "(Lfl0/c;Z)V", "Lfl0/c;", "a", "()Lfl0/c;", "Z", "b", "()Z", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40437a {

    @com.google.gson.annotations.c("content")
    @l
    private final C40439c content;

    @com.google.gson.annotations.c("isAllowed")
    private final boolean isAllowed;

    public C40437a(@l C40439c c40439c, boolean z12) {
        this.content = c40439c;
        this.isAllowed = z12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C40439c getContent() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsAllowed() {
        return this.isAllowed;
    }
}
