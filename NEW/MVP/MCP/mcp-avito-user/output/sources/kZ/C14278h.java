package KZ;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKZ/h;", "", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14278h {

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14278h(@Y61.k String str) {
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14278h) && kotlin.jvm.internal.L.f(this.title, ((C14278h) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ApplicationAppealGoToApplicationButton(title="), this.title, ')');
    }
}
