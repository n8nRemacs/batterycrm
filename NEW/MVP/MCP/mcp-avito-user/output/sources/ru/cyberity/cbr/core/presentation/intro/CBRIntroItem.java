package ru.cyberity.cbr.core.presentation.intro;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CBRIntro.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/presentation/intro/CBRIntroItem;", "", "", "title", "subTitle", "iconKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubTitle", "getIconKey", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRIntroItem {

    @k
    private final String iconKey;

    @k
    private final String subTitle;

    @k
    private final String title;

    public CBRIntroItem(@k String str, @k String str2, @k String str3) {
        this.title = str;
        this.subTitle = str2;
        this.iconKey = str3;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRIntroItem)) {
            return false;
        }
        CBRIntroItem cBRIntroItem = (CBRIntroItem) other;
        return L.f(this.title, cBRIntroItem.title) && L.f(this.subTitle, cBRIntroItem.subTitle) && L.f(this.iconKey, cBRIntroItem.iconKey);
    }

    @k
    public final String getIconKey() {
        return this.iconKey;
    }

    @k
    public final String getSubTitle() {
        return this.subTitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.iconKey.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subTitle);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRIntroItem(title=");
        sb2.append(this.title);
        sb2.append(", subTitle=");
        sb2.append(this.subTitle);
        sb2.append(", iconKey=");
        return C22026a.c(sb2, this.iconKey, ')');
    }
}
