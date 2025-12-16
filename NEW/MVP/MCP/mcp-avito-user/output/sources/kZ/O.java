package KZ;

import kotlin.Metadata;

/* compiled from: ApplicationRealtyObjectDetailsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LKZ/O;", "", "", "title", "", "isSelected", "LKZ/S;", "field", "<init>", "(Ljava/lang/String;ZLKZ/S;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "d", "()Z", "LKZ/S;", "b", "()LKZ/S;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class O {

    @com.google.gson.annotations.c("addressField")
    @Y61.k
    private final S field;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public O(@Y61.k String str, boolean z12, @Y61.k S s5) {
        this.title = str;
        this.isSelected = z12;
        this.field = s5;
    }

    public static O a(O o12, boolean z12, S s5, int i12) {
        String str = o12.title;
        if ((i12 & 2) != 0) {
            z12 = o12.isSelected;
        }
        if ((i12 & 4) != 0) {
            s5 = o12.field;
        }
        o12.getClass();
        return new O(str, z12, s5);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final S getField() {
        return this.field;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Y61.k
    public final O e(@Y61.l String str) {
        S s5 = this.field;
        s5.getClass();
        return a(this, false, S.a(s5, null, str, 7), 3);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return kotlin.jvm.internal.L.f(this.title, o12.title) && this.isSelected == o12.isSelected && kotlin.jvm.internal.L.f(this.field, o12.field);
    }

    public final int hashCode() {
        return this.field.hashCode() + androidx.appcompat.app.r.i(this.title.hashCode() * 31, 31, this.isSelected);
    }

    @Y61.k
    public final String toString() {
        return "RealtyObjectDetailsAddressOption(title=" + this.title + ", isSelected=" + this.isSelected + ", field=" + this.field + ')';
    }
}
