package cX;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LcX/e;", "LcX/a;", "", "height", "<init>", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements InterfaceC27115a {

    @com.google.gson.annotations.c("height")
    @l
    private final Integer height;

    public e(@l Integer num) {
        this.height = num;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.height, ((e) obj).height);
    }

    public final int hashCode() {
        Integer num = this.height;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @k
    public final String toString() {
        return s.j(new StringBuilder("SpacerField(height="), this.height, ')');
    }
}
