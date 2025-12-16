package z90;

import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz90/p;", "", "Lz90/e;", "avatar", "", "title", "<init>", "(Lz90/e;Ljava/lang/String;)V", "Lz90/e;", "a", "()Lz90/e;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50421p {

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final C50410e avatar;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C50421p(@Y61.l C50410e c50410e, @Y61.k String str) {
        this.avatar = c50410e;
        this.title = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C50410e getAvatar() {
        return this.avatar;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
