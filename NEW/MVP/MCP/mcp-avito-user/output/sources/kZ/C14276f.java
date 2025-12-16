package KZ;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/f;", "", "", "iconName", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14276f {

    @com.google.gson.annotations.c("iconName")
    @Y61.k
    private final String iconName;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    public C14276f(@Y61.k String str, @Y61.k AttributedText attributedText) {
        this.iconName = str;
        this.text = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14276f)) {
            return false;
        }
        C14276f c14276f = (C14276f) obj;
        return kotlin.jvm.internal.L.f(this.iconName, c14276f.iconName) && kotlin.jvm.internal.L.f(this.text, c14276f.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.iconName.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealBankInfoAdditionalBlock(iconName=");
        sb2.append(this.iconName);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
    }
}
