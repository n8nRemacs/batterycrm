package uZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MnzDottedText.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LuZ/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "leftText", "rightText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getLeftText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getRightText", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49005b {

    @com.google.gson.annotations.c("leftText")
    @k
    private final AttributedText leftText;

    @com.google.gson.annotations.c("rightText")
    @k
    private final AttributedText rightText;

    public C49005b(@k AttributedText attributedText, @k AttributedText attributedText2) {
        this.leftText = attributedText;
        this.rightText = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49005b)) {
            return false;
        }
        C49005b c49005b = (C49005b) obj;
        return L.f(this.leftText, c49005b.leftText) && L.f(this.rightText, c49005b.rightText);
    }

    public final int hashCode() {
        return this.rightText.hashCode() + (this.leftText.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzDottedText(leftText=");
        sb2.append(this.leftText);
        sb2.append(", rightText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.rightText, ')');
    }
}
