package kotlinx.datetime.internal.format.parser;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Output", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class w extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y<Object> f412586l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y<Object> yVar) {
        super(0);
        this.f412586l = yVar;
    }

    @Override // Y41.a
    public final String invoke() {
        return C22026a.c(new StringBuilder("Unexpected end of input: yet to parse '"), this.f412586l.f412591a, '\'');
    }
}
