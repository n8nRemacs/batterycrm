package P7;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: UpdateCollectionResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"LP7/a;", "", "", "addToFavorite", "", "adding", "delete", "edit", "publish", "share", "unpublish", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAddToFavorite", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getAdding", "()Ljava/lang/String;", "Z", "getDelete", "()Z", "getEdit", "getPublish", "getShare", "getUnpublish", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    @com.google.gson.annotations.c("addToFavorite")
    @l
    private final Boolean addToFavorite;

    @com.google.gson.annotations.c("adding")
    @l
    private final String adding;

    @com.google.gson.annotations.c("delete")
    private final boolean delete;

    @com.google.gson.annotations.c("edit")
    @l
    private final String edit;

    @com.google.gson.annotations.c("publish")
    @l
    private final Boolean publish;

    @com.google.gson.annotations.c("share")
    private final boolean share;

    @com.google.gson.annotations.c("unpublish")
    @l
    private final Boolean unpublish;

    public a(@l Boolean bool, @l String str, boolean z12, @l String str2, @l Boolean bool2, boolean z13, @l Boolean bool3) {
        this.addToFavorite = bool;
        this.adding = str;
        this.delete = z12;
        this.edit = str2;
        this.publish = bool2;
        this.share = z13;
        this.unpublish = bool3;
    }
}
