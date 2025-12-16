package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Output", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class D extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C<Object> f412541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CharSequence f412542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f412543n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.f f412544o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C<Object> c12, CharSequence charSequence, int i12, l0.f fVar) {
        super(0);
        this.f412541l = c12;
        this.f412542m = charSequence;
        this.f412543n = i12;
        this.f412544o = fVar;
    }

    @Override // Y41.a
    public final String invoke() {
        return "Expected " + this.f412541l.f412536b + " but got " + this.f412542m.subSequence(this.f412543n, this.f412544o.f406840b).toString();
    }
}
