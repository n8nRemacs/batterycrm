package qh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1GetAvailableContactsResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lqh/a;", "", "Lqh/b;", AdFormat.BANNER, "", "buttonTitle", "description", "", "Lqh/d;", "limits", "Lqh/e;", "navbar", "title", "<init>", "(Lqh/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqh/e;Ljava/lang/String;)V", "Lqh/b;", "a", "()Lqh/b;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lqh/e;", "e", "()Lqh/e;", "f", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47397a {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @l
    private final C47398b banner;

    @com.google.gson.annotations.c("buttonTitle")
    @k
    private final String buttonTitle;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("limits")
    @k
    private final List<d> limits;

    @com.google.gson.annotations.c("navbar")
    @k
    private final e navbar;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C47397a(@l C47398b c47398b, @k String str, @l String str2, @k List<d> list, @k e eVar, @k String str3) {
        this.banner = c47398b;
        this.buttonTitle = str;
        this.description = str2;
        this.limits = list;
        this.navbar = eVar;
        this.title = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C47398b getBanner() {
        return this.banner;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<d> d() {
        return this.limits;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final e getNavbar() {
        return this.navbar;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
