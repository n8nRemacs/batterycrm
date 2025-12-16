package fv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.services_portfolio.generated.api.sx_project_get.SxProjectWithErrorModerationStatus;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SxProjectGetResponse.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"Lfv0/a;", "", "", "Lfv0/b;", "actions", "", "description", "errorMessage", "", "id", "Lcom/avito/android/remote/model/Image;", "images", "Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus;", "moderationStatus", "priceText", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getErrorMessage", "J", "c", "()J", "d", "Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus;", "e", "()Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus;", "f", "g", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40484a {

    @com.google.gson.annotations.c("actions")
    @l
    private final List<C40485b> actions;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("errorMessage")
    @l
    private final String errorMessage;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("images")
    @l
    private final List<Image> images;

    @com.google.gson.annotations.c("moderationStatus")
    @k
    private final SxProjectWithErrorModerationStatus moderationStatus;

    @com.google.gson.annotations.c("priceText")
    @l
    private final String priceText;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C40484a(@l List<C40485b> list, @l String str, @l String str2, long j12, @l List<Image> list2, @k SxProjectWithErrorModerationStatus sxProjectWithErrorModerationStatus, @l String str3, @l String str4) {
        this.actions = list;
        this.description = str;
        this.errorMessage = str2;
        this.id = j12;
        this.images = list2;
        this.moderationStatus = sxProjectWithErrorModerationStatus;
        this.priceText = str3;
        this.title = str4;
    }

    @l
    public final List<C40485b> a() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    public final List<Image> d() {
        return this.images;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final SxProjectWithErrorModerationStatus getModerationStatus() {
        return this.moderationStatus;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
