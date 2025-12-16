package io.ktor.http;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: Url.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Y0 extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T0 f399921l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(T0 t02) {
        super(0);
        this.f399921l = t02;
    }

    @Override // Y41.a
    public final String invoke() {
        T0 t02 = this.f399921l;
        int iH2 = C43066x.H('?', 0, 6, t02.f399910i) + 1;
        if (iH2 == 0) {
            return "";
        }
        String str = t02.f399910i;
        int iH3 = C43066x.H('#', iH2, 4, str);
        return iH3 == -1 ? str.substring(iH2) : str.substring(iH2, iH3);
    }
}
