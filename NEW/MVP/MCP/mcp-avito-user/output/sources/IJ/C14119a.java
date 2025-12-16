package Ij;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIj/a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ij.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C14119a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<b> f8492a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ParameterElement.SelectorCardsCarousel.SelectType f8493b;

    public C14119a(@k List<b> list, @k ParameterElement.SelectorCardsCarousel.SelectType selectType) {
        this.f8492a = list;
        this.f8493b = selectType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14119a)) {
            return false;
        }
        C14119a c14119a = (C14119a) obj;
        return L.f(this.f8492a, c14119a.f8492a) && this.f8493b == c14119a.f8493b;
    }

    public final int hashCode() {
        return this.f8493b.hashCode() + (this.f8492a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "CardClickEvent(selectedInfo=" + this.f8492a + ", type=" + this.f8493b + ')';
    }
}
