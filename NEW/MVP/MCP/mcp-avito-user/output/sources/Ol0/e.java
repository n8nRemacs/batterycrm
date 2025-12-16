package Ol0;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV3Response.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"LOl0/e;", "", "", "buttonText", "groupTitle", "", "groupings", "LOl0/g;", "image", "", "isButtonDisabled", "LOl0/f;", "specifications", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LOl0/g;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "LOl0/g;", "d", "()LOl0/g;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "e", "f", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    @com.google.gson.annotations.c("buttonText")
    @l
    private final String buttonText;

    @com.google.gson.annotations.c("groupTitle")
    @k
    private final String groupTitle;

    @com.google.gson.annotations.c("groupings")
    @l
    private final List<e> groupings;

    @com.google.gson.annotations.c("image")
    @l
    private final g image;

    @com.google.gson.annotations.c("isButtonDisabled")
    @l
    private final Boolean isButtonDisabled;

    @com.google.gson.annotations.c("specifications")
    @l
    private final List<f> specifications;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public e(@l String str, @k String str2, @l List<e> list, @l g gVar, @l Boolean bool, @l List<f> list2, @k String str3) {
        this.buttonText = str;
        this.groupTitle = str2;
        this.groupings = list;
        this.image = gVar;
        this.isButtonDisabled = bool;
        this.specifications = list2;
        this.text = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @l
    public final List<e> c() {
        return this.groupings;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final g getImage() {
        return this.image;
    }

    @l
    public final List<f> e() {
        return this.specifications;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsButtonDisabled() {
        return this.isButtonDisabled;
    }
}
