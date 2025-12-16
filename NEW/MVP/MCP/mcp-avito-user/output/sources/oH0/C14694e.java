package Oh0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetAgentProfileLandingApiResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LOh0/e;", "", "LOh0/h;", "button", "LOh0/k;", "image", "imageActive", "", "LOh0/f;", "infoBlocks", "LOh0/g;", "list", "", "lockedByProfileLimit", "", "title", "<init>", "(LOh0/h;LOh0/k;LOh0/k;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "LOh0/h;", "a", "()LOh0/h;", "LOh0/k;", "b", "()LOh0/k;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "getList", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oh0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14694e {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final h button;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final k image;

    @com.google.gson.annotations.c("imageActive")
    @Y61.k
    private final k imageActive;

    @com.google.gson.annotations.c("infoBlocks")
    @Y61.k
    private final List<f> infoBlocks;

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<g> list;

    @com.google.gson.annotations.c("lockedByProfileLimit")
    @Y61.l
    private final Boolean lockedByProfileLimit;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14694e(@Y61.l h hVar, @Y61.k k kVar, @Y61.k k kVar2, @Y61.k List<f> list, @Y61.k List<g> list2, @Y61.l Boolean bool, @Y61.k String str) {
        this.button = hVar;
        this.image = kVar;
        this.imageActive = kVar2;
        this.infoBlocks = list;
        this.list = list2;
        this.lockedByProfileLimit = bool;
        this.title = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final h getButton() {
        return this.button;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final k getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final k getImageActive() {
        return this.imageActive;
    }

    @Y61.k
    public final List<f> d() {
        return this.infoBlocks;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Boolean getLockedByProfileLimit() {
        return this.lockedByProfileLimit;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
