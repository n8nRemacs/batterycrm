package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Output", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class x extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y<Object> f412587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CharSequence f412588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f412589n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f412590o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y<Object> yVar, CharSequence charSequence, int i12, int i13) {
        super(0);
        this.f412587l = yVar;
        this.f412588m = charSequence;
        this.f412589n = i12;
        this.f412590o = i13;
    }

    @Override // Y41.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(this.f412587l.f412591a);
        sb2.append(" but got ");
        int i12 = this.f412589n;
        sb2.append(this.f412588m.subSequence(i12, this.f412590o + i12 + 1).toString());
        return sb2.toString();
    }
}
