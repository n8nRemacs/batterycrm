package KZ;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationRealtyObjectDetailsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LKZ/T;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "positiveStringValue", "negativeStringValue", "", "value", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Z", "e", "()Z", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class T {

    @com.google.gson.annotations.c("negativeStringValue")
    @Y61.k
    private final String negativeStringValue;

    @com.google.gson.annotations.c("positiveStringValue")
    @Y61.k
    private final String positiveStringValue;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("value")
    private final boolean value;

    public T(@Y61.k AttributedText attributedText, @Y61.k String str, @Y61.k String str2, boolean z12) {
        this.title = attributedText;
        this.positiveStringValue = str;
        this.negativeStringValue = str2;
        this.value = z12;
    }

    public static T a(T t12, boolean z12) {
        AttributedText attributedText = t12.title;
        String str = t12.positiveStringValue;
        String str2 = t12.negativeStringValue;
        t12.getClass();
        return new T(attributedText, str, str2, z12);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getNegativeStringValue() {
        return this.negativeStringValue;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getPositiveStringValue() {
        return this.positiveStringValue;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t12 = (T) obj;
        return kotlin.jvm.internal.L.f(this.title, t12.title) && kotlin.jvm.internal.L.f(this.positiveStringValue, t12.positiveStringValue) && kotlin.jvm.internal.L.f(this.negativeStringValue, t12.negativeStringValue) && this.value == t12.value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value) + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.positiveStringValue), 31, this.negativeStringValue);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyObjectIsAvitoItem(title=");
        sb2.append(this.title);
        sb2.append(", positiveStringValue=");
        sb2.append(this.positiveStringValue);
        sb2.append(", negativeStringValue=");
        sb2.append(this.negativeStringValue);
        sb2.append(", value=");
        return androidx.appcompat.app.r.x(sb2, this.value, ')');
    }
}
