package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParserOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Object", "Type", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class t extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f412581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f412582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43375a<Object, Object> f412583n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Object obj, String str, InterfaceC43375a interfaceC43375a) {
        super(0);
        this.f412581l = obj;
        this.f412582m = str;
        this.f412583n = interfaceC43375a;
    }

    @Override // Y41.a
    public final String invoke() {
        return "Attempting to assign conflicting values '" + this.f412581l + "' and '" + ((Object) this.f412582m) + "' to field '" + this.f412583n.getName() + '\'';
    }
}
