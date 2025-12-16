package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Output", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B<Object> f412531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ char f412532m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B<Object> b12, char c12) {
        super(0);
        this.f412531l = b12;
        this.f412532m = c12;
    }

    @Override // Y41.a
    public final String invoke() {
        return "Expected " + this.f412531l.f412534b + " but got " + this.f412532m;
    }
}
