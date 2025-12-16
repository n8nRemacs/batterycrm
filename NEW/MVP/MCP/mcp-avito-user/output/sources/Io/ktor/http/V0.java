package io.ktor.http;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: Url.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class V0 extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T0 f399918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(T0 t02) {
        super(0);
        this.f399918l = t02;
    }

    @Override // Y41.a
    public final String invoke() {
        T0 t02 = this.f399918l;
        String str = t02.f399908g;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = t02.f399902a.f399889a.length() + 3;
        String str2 = t02.f399910i;
        return str2.substring(C43066x.H(':', length, 4, str2) + 1, C43066x.H('@', 0, 6, str2));
    }
}
