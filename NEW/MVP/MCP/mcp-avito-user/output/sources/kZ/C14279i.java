package KZ;

import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LKZ/i;", "", "", "title", "", "isDisabled", "isSelected", "<init>", "(Ljava/lang/String;ZZ)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14279i {

    @com.google.gson.annotations.c("isDisabled")
    private final boolean isDisabled;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14279i(@Y61.k String str, boolean z12, boolean z13) {
        this.title = str;
        this.isDisabled = z12;
        this.isSelected = z13;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14279i)) {
            return false;
        }
        C14279i c14279i = (C14279i) obj;
        return kotlin.jvm.internal.L.f(this.title, c14279i.title) && this.isDisabled == c14279i.isDisabled && this.isSelected == c14279i.isSelected;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSelected) + androidx.appcompat.app.r.i(this.title.hashCode() * 31, 31, this.isDisabled);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealSelectBankButton(title=");
        sb2.append(this.title);
        sb2.append(", isDisabled=");
        sb2.append(this.isDisabled);
        sb2.append(", isSelected=");
        return androidx.appcompat.app.r.x(sb2, this.isSelected, ')');
    }
}
