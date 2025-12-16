package io.ktor.http;

import io.ktor.http.C41524i;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: Mimes.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lkotlin/Q;", "Lio/ktor/http/i;", "invoke", "(Ljava/lang/String;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: io.ktor.http.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41546t0 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.Q<? extends String, ? extends C41524i>> {

    /* renamed from: l, reason: collision with root package name */
    public static final C41546t0 f400119l = new C41546t0();

    public C41546t0() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.Q<? extends String, ? extends C41524i> invoke(String str) {
        String string = C43066x.A0(str).toString();
        if (string.length() == 0) {
            return null;
        }
        int iH2 = C43066x.H(',', 0, 6, string);
        String strSubstring = string.substring(0, iH2);
        String strSubstring2 = string.substring(iH2 + 1);
        String strA = io.ktor.util.I0.a(C43066x.U(".", strSubstring));
        InterfaceC42726C interfaceC42726C = M.f399874a;
        try {
            C41524i.f400031f.getClass();
            return new kotlin.Q<>(strA, C41524i.c.a(strSubstring2));
        } catch (Throwable th2) {
            throw new IllegalArgumentException("Failed to parse ".concat(strSubstring2), th2);
        }
    }
}
