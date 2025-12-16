package KZ;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKZ/e;", "", "", "title", "", "LKZ/f;", "blocks", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14275e {

    @com.google.gson.annotations.c("blocks")
    @Y61.k
    private final List<C14276f> blocks;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14275e(@Y61.k String str, @Y61.k List<C14276f> list) {
        this.title = str;
        this.blocks = list;
    }

    @Y61.k
    public final List<C14276f> a() {
        return this.blocks;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14275e)) {
            return false;
        }
        C14275e c14275e = (C14275e) obj;
        return kotlin.jvm.internal.L.f(this.title, c14275e.title) && kotlin.jvm.internal.L.f(this.blocks, c14275e.blocks);
    }

    public final int hashCode() {
        return this.blocks.hashCode() + (this.title.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealBankInfoAdditional(title=");
        sb2.append(this.title);
        sb2.append(", blocks=");
        return androidx.compose.foundation.H.p(sb2, this.blocks, ')');
    }
}
