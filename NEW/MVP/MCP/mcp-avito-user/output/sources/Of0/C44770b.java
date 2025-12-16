package of0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageWithLabelState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lof0/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: of0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C44770b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44769a f419982a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C44771c f419983b;

    public C44770b(@k C44769a c44769a, @k C44771c c44771c) {
        this.f419982a = c44769a;
        this.f419983b = c44771c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44770b)) {
            return false;
        }
        C44770b c44770b = (C44770b) obj;
        return L.f(this.f419982a, c44770b.f419982a) && L.f(this.f419983b, c44770b.f419983b);
    }

    public final int hashCode() {
        return this.f419983b.hashCode() + (this.f419982a.f419981a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ImageWithLabelState(imageState=" + this.f419982a + ", labelState=" + this.f419983b + ')';
    }
}
