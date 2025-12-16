package H7;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: UpdateCollectionRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\t\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"LH7/d;", "", "", "description", "id", "", "image", "", "imageWasDeleted", "isPublic", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getId", "[B", "getImage", "()[B", "Ljava/lang/Boolean;", "getImageWasDeleted", "()Ljava/lang/Boolean;", "getName", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("image")
    @l
    private final byte[] image;

    @com.google.gson.annotations.c("imageWasDeleted")
    @l
    private final Boolean imageWasDeleted;

    @com.google.gson.annotations.c("isPublic")
    @l
    private final Boolean isPublic;

    @com.google.gson.annotations.c("name")
    @l
    private final String name;

    public d(@l String str, @k String str2, @l byte[] bArr, @l Boolean bool, @l Boolean bool2, @l String str3) {
        this.description = str;
        this.id = str2;
        this.image = bArr;
        this.imageWasDeleted = bool;
        this.isPublic = bool2;
        this.name = str3;
    }
}
