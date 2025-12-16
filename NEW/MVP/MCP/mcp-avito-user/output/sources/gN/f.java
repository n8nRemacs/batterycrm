package gn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/f;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Image f396824a;

    public f(@k Image image) {
        this.f396824a = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f396824a, ((f) obj).f396824a);
    }

    public final int hashCode() {
        return this.f396824a.hashCode();
    }

    @k
    public final String toString() {
        return AK.c.o(new StringBuilder("ImageWrapper(image="), this.f396824a, ')');
    }
}
