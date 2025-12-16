package of0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ImageWithLabelState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lof0/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: of0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C44769a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.a f419981a;

    public C44769a(@k com.avito.android.image_loader.a aVar) {
        this.f419981a = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44769a) && this.f419981a.equals(((C44769a) obj).f419981a);
    }

    public final int hashCode() {
        return this.f419981a.hashCode();
    }

    @k
    public final String toString() {
        return "ImageState(picture=" + this.f419981a + ')';
    }
}
