package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: WebSocketExtensionHeader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/Q;", "invoke", "(Ljava/lang/String;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.Q<? extends String, ? extends String>> {

    /* renamed from: l, reason: collision with root package name */
    public static final N f401435l = new N();

    public N() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.Q<? extends String, ? extends String> invoke(String str) {
        String str2 = str;
        int iH2 = C43066x.H('=', 0, 6, str2);
        if (iH2 < 0) {
            return new kotlin.Q<>(str2, "");
        }
        kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, iH2);
        int i12 = iH2 + 1;
        return new kotlin.Q<>(str2.substring(lVarR.f406905b, lVarR.f406906c + 1), i12 < str2.length() ? str2.substring(i12) : "");
    }
}
