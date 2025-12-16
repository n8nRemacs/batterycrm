package hI;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GuestsSelectorViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhI/c;", "", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C40829c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f397150a;

    public C40829c(@k Map<String, ? extends PrintableText> map) {
        this.f397150a = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40829c) && this.f397150a.equals(((C40829c) obj).f397150a);
    }

    public final int hashCode() {
        return this.f397150a.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("PickerViewState(data="), this.f397150a, ')');
    }
}
