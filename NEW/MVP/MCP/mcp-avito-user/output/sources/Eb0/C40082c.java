package eb0;

import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UniversalWidgetSaveApiRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Leb0/c;", "", "", "Leb0/d;", "blocks", "", "imgRatio", "sectionTitle", "subtype", "textPosition", "textPositionImageWithText", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "Ljava/lang/String;", "getImgRatio", "()Ljava/lang/String;", "getSectionTitle", "getSubtype", "getTextPosition", "getTextPositionImageWithText", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40082c {

    @com.google.gson.annotations.c("blocks")
    @l
    private final List<C40083d> blocks;

    @com.google.gson.annotations.c("imgRatio")
    @l
    private final String imgRatio;

    @com.google.gson.annotations.c("sectionTitle")
    @l
    private final String sectionTitle;

    @com.google.gson.annotations.c("subtype")
    @l
    private final String subtype;

    @com.google.gson.annotations.c("textPosition")
    @l
    private final String textPosition;

    @com.google.gson.annotations.c("textPositionImageWithText")
    @l
    private final String textPositionImageWithText;

    public C40082c(@l List<C40083d> list, @l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.blocks = list;
        this.imgRatio = str;
        this.sectionTitle = str2;
        this.subtype = str3;
        this.textPosition = str4;
        this.textPositionImageWithText = str5;
    }
}
