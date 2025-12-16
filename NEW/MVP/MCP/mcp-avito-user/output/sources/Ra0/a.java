package RA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiSellerAddressListResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010\"R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b#\u0010 R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"LRA0/a;", "", "LRA0/b;", "bottomSheet", "", "description", "LRA0/d;", "descriptionFromAnotherProfile", "id", "", "isDisabled", "isFromAnotherProfile", "isRevalidateAvailable", "status", "statusAction", "statusText", "subtitle", "title", "<init>", "(LRA0/b;Ljava/lang/String;LRA0/d;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LRA0/b;", "a", "()LRA0/b;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LRA0/d;", "getDescriptionFromAnotherProfile", "()LRA0/d;", "c", "Z", "i", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "j", "d", "e", "f", "g", "h", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @com.google.gson.annotations.c("bottomSheet")
    @k
    private final b bottomSheet;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("descriptionFromAnotherProfile")
    @l
    private final d descriptionFromAnotherProfile;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isDisabled")
    private final boolean isDisabled;

    @com.google.gson.annotations.c("isFromAnotherProfile")
    @l
    private final Boolean isFromAnotherProfile;

    @com.google.gson.annotations.c("isRevalidateAvailable")
    private final boolean isRevalidateAvailable;

    @com.google.gson.annotations.c("status")
    @k
    private final String status;

    @com.google.gson.annotations.c("statusAction")
    @l
    private final String statusAction;

    @com.google.gson.annotations.c("statusText")
    @l
    private final String statusText;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public a(@k b bVar, @k String str, @l d dVar, @k String str2, boolean z12, @l Boolean bool, boolean z13, @k String str3, @l String str4, @l String str5, @l String str6, @k String str7) {
        this.bottomSheet = bVar;
        this.description = str;
        this.descriptionFromAnotherProfile = dVar;
        this.id = str2;
        this.isDisabled = z12;
        this.isFromAnotherProfile = bool;
        this.isRevalidateAvailable = z13;
        this.status = str3;
        this.statusAction = str4;
        this.statusText = str5;
        this.subtitle = str6;
        this.title = str7;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getBottomSheet() {
        return this.bottomSheet;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getStatusAction() {
        return this.statusAction;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsRevalidateAvailable() {
        return this.isRevalidateAvailable;
    }
}
