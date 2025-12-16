package z90;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lz90/t;", "", "Lz90/u;", "action", "", "closable", "", "id", "Lz90/v;", "image", "subtitle", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "userAddress", "<init>", "(Lz90/u;ZLjava/lang/String;Lz90/v;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lz90/u;", "a", "()Lz90/u;", "Z", "b", "()Z", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lz90/v;", "d", "()Lz90/v;", "e", "f", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50424t {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final u action;

    @com.google.gson.annotations.c("closable")
    private final boolean closable;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final v image;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("userAddress")
    @Y61.l
    private final AttributedText userAddress;

    public C50424t(@Y61.l u uVar, boolean z12, @Y61.k String str, @Y61.l v vVar, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText) {
        this.action = uVar;
        this.closable = z12;
        this.id = str;
        this.image = vVar;
        this.subtitle = str2;
        this.title = str3;
        this.userAddress = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final u getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getClosable() {
        return this.closable;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final v getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final AttributedText getUserAddress() {
        return this.userAddress;
    }
}
