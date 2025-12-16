package KZ;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationCommentItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKZ/n;", "LKZ/p;", "", "title", "badgeTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14284n implements InterfaceC14286p {

    @com.google.gson.annotations.c("badgeTitle")
    @Y61.l
    private final String badgeTitle;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public C14284n(@Y61.l String str, @Y61.l String str2, @Y61.k AttributedText attributedText) {
        this.title = str;
        this.badgeTitle = str2;
        this.text = attributedText;
    }

    public static C14284n a(C14284n c14284n, String str) {
        return new C14284n(c14284n.title, str, c14284n.text);
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBadgeTitle() {
        return this.badgeTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14284n)) {
            return false;
        }
        C14284n c14284n = (C14284n) obj;
        return kotlin.jvm.internal.L.f(this.title, c14284n.title) && kotlin.jvm.internal.L.f(this.badgeTitle, c14284n.badgeTitle) && kotlin.jvm.internal.L.f(this.text, c14284n.text);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.badgeTitle;
        return this.text.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationCommentItemValue(title=");
        sb2.append(this.title);
        sb2.append(", badgeTitle=");
        sb2.append(this.badgeTitle);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
    }
}
