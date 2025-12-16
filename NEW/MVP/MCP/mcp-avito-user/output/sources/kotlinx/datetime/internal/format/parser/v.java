package kotlinx.datetime.internal.format.parser;

import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Parser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/v;", "Output", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class v<Output> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<s<Output>> f412584a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<v<Output>> f412585b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@Y61.k List<? extends s<? super Output>> list, @Y61.k List<? extends v<? super Output>> list2) {
        this.f412584a = list;
        this.f412585b = list2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C42745f0.O(this.f412584a, ", ", null, null, null, 62));
        sb2.append('(');
        return C22026a.c(sb2, C42745f0.O(this.f412585b, ";", null, null, null, 62), ')');
    }
}
