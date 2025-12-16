package qI;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressSuggestionResult.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LqI/d;", "T", "", "", "addressSuggestions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qI.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C47301d<T> {

    @com.google.gson.annotations.c("list")
    @k
    private final List<T> addressSuggestions;

    /* JADX WARN: Multi-variable type inference failed */
    public C47301d(@k List<? extends T> list) {
        this.addressSuggestions = list;
    }

    @k
    public final List<T> a() {
        return this.addressSuggestions;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47301d) && L.f(this.addressSuggestions, ((C47301d) obj).addressSuggestions);
    }

    public final int hashCode() {
        return this.addressSuggestions.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("AddressSuggestionResult(addressSuggestions="), this.addressSuggestions, ')');
    }
}
