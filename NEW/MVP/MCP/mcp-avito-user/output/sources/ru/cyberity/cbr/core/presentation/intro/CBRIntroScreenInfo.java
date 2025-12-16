package ru.cyberity.cbr.core.presentation.intro;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CBRIntro.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b!\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/presentation/intro/CBRIntroScreenInfo;", "", "", "title", "subTitle", "Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;", "singleIntro", "doIntro", "doNotIntro", "image", "header", "text", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubTitle", "Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;", "getSingleIntro", "()Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;", "getDoIntro", "getDoNotIntro", "getImage", "getHeader", "getText", "getButtonText", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRIntroScreenInfo {

    @l
    private final String buttonText;

    @l
    private final CBRIntroItem doIntro;

    @l
    private final CBRIntroItem doNotIntro;

    @l
    private final String header;

    @l
    private final String image;

    @l
    private final CBRIntroItem singleIntro;

    @l
    private final String subTitle;

    @l
    private final String text;

    @l
    private final String title;

    public CBRIntroScreenInfo(@l String str, @l String str2, @l CBRIntroItem cBRIntroItem, @l CBRIntroItem cBRIntroItem2, @l CBRIntroItem cBRIntroItem3, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.title = str;
        this.subTitle = str2;
        this.singleIntro = cBRIntroItem;
        this.doIntro = cBRIntroItem2;
        this.doNotIntro = cBRIntroItem3;
        this.image = str3;
        this.header = str4;
        this.text = str5;
        this.buttonText = str6;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRIntroScreenInfo)) {
            return false;
        }
        CBRIntroScreenInfo cBRIntroScreenInfo = (CBRIntroScreenInfo) other;
        return L.f(this.title, cBRIntroScreenInfo.title) && L.f(this.subTitle, cBRIntroScreenInfo.subTitle) && L.f(this.singleIntro, cBRIntroScreenInfo.singleIntro) && L.f(this.doIntro, cBRIntroScreenInfo.doIntro) && L.f(this.doNotIntro, cBRIntroScreenInfo.doNotIntro) && L.f(this.image, cBRIntroScreenInfo.image) && L.f(this.header, cBRIntroScreenInfo.header) && L.f(this.text, cBRIntroScreenInfo.text) && L.f(this.buttonText, cBRIntroScreenInfo.buttonText);
    }

    @l
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    public final CBRIntroItem getDoIntro() {
        return this.doIntro;
    }

    @l
    public final CBRIntroItem getDoNotIntro() {
        return this.doNotIntro;
    }

    @l
    public final String getHeader() {
        return this.header;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final CBRIntroItem getSingleIntro() {
        return this.singleIntro;
    }

    @l
    public final String getSubTitle() {
        return this.subTitle;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CBRIntroItem cBRIntroItem = this.singleIntro;
        int iHashCode3 = (iHashCode2 + (cBRIntroItem == null ? 0 : cBRIntroItem.hashCode())) * 31;
        CBRIntroItem cBRIntroItem2 = this.doIntro;
        int iHashCode4 = (iHashCode3 + (cBRIntroItem2 == null ? 0 : cBRIntroItem2.hashCode())) * 31;
        CBRIntroItem cBRIntroItem3 = this.doNotIntro;
        int iHashCode5 = (iHashCode4 + (cBRIntroItem3 == null ? 0 : cBRIntroItem3.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.header;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonText;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRIntroScreenInfo(title=");
        sb2.append(this.title);
        sb2.append(", subTitle=");
        sb2.append(this.subTitle);
        sb2.append(", singleIntro=");
        sb2.append(this.singleIntro);
        sb2.append(", doIntro=");
        sb2.append(this.doIntro);
        sb2.append(", doNotIntro=");
        sb2.append(this.doNotIntro);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.buttonText, ')');
    }
}
