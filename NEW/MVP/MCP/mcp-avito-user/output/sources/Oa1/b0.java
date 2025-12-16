package Oa1;

import java.net.URL;
import kotlin.text.C43066x;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ URL f12352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f12354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(URL url, int i12, String str) {
        super(0);
        this.f12352l = url;
        this.f12353m = i12;
        this.f12354n = str;
    }

    @Override // Y41.a
    public final String invoke() {
        return C43066x.E0("\n                    HTTP REQUEST\n                    URL: " + this.f12352l + "\n                    CODE: " + this.f12353m + "\n                    BODY: " + this.f12354n + "\n                ");
    }
}
