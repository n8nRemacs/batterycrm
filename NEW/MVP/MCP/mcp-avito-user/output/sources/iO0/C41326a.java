package iO0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GetInvitationApiV1Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LiO0/a;", "", "", "description", "LiO0/g;", "image", "LiO0/b;", "rejectPopup", "title", "<init>", "(Ljava/lang/String;LiO0/g;LiO0/b;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LiO0/g;", "b", "()LiO0/g;", "LiO0/b;", "c", "()LiO0/b;", "d", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iO0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41326a {

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("image")
    @l
    private final g image;

    @com.google.gson.annotations.c("rejectPopup")
    @k
    private final C41327b rejectPopup;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C41326a(@k String str, @l g gVar, @k C41327b c41327b, @k String str2) {
        this.description = str;
        this.image = gVar;
        this.rejectPopup = c41327b;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final g getImage() {
        return this.image;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C41327b getRejectPopup() {
        return this.rejectPopup;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
