package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Output", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class j extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f412564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k<Object> f412565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f412566n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f412567o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, k<Object> kVar, int i12, g gVar) {
        super(0);
        this.f412564l = str;
        this.f412565m = kVar;
        this.f412566n = i12;
        this.f412567o = gVar;
    }

    @Override // Y41.a
    public final String invoke() {
        return "Can not interpret the string '" + this.f412564l + "' as " + this.f412565m.f412568a.get(this.f412566n).f412555b + ": " + this.f412567o.a();
    }
}
