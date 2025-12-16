package me;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SocialCodeConfirmV2Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lme/a;", "", "Lcom/avito/android/remote/model/Image;", "avatar", "", "description", "", "isPassport", "login", "name", "needWarning", "", "Lme/b;", "social", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "g", "()Z", "c", "d", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: me.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44068a {

    @com.google.gson.annotations.c("avatar")
    @k
    private final Image avatar;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("is_passport")
    private final boolean isPassport;

    @com.google.gson.annotations.c("login")
    @l
    private final String login;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("need_warning")
    private final boolean needWarning;

    @com.google.gson.annotations.c("social")
    @l
    private final List<C44069b> social;

    public C44068a(@k Image image, @k String str, boolean z12, @l String str2, @k String str3, boolean z13, @l List<C44069b> list) {
        this.avatar = image;
        this.description = str;
        this.isPassport = z12;
        this.login = str2;
        this.name = str3;
        this.needWarning = z13;
        this.social = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getNeedWarning() {
        return this.needWarning;
    }

    @l
    public final List<C44069b> f() {
        return this.social;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsPassport() {
        return this.isPassport;
    }
}
