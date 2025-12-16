package pi;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qi.InterfaceC47401b;

/* compiled from: BeduinScreenResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpi/b;", "", "Lqi/b;", "screen", "<init>", "(Lqi/b;)V", "Lqi/b;", "a", "()Lqi/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47091b {

    @com.google.gson.annotations.c("screen")
    @k
    private final InterfaceC47401b screen;

    public C47091b(@k InterfaceC47401b interfaceC47401b) {
        this.screen = interfaceC47401b;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final InterfaceC47401b getScreen() {
        return this.screen;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47091b) && L.f(this.screen, ((C47091b) obj).screen);
    }

    public final int hashCode() {
        return this.screen.hashCode();
    }

    @k
    public final String toString() {
        return "BeduinScreenResponse(screen=" + this.screen + ')';
    }
}
