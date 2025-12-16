package io.ktor.http.auth;

import Y41.l;
import io.ktor.http.C41508b;
import io.ktor.http.P;
import io.ktor.http.S;
import io.ktor.http.auth.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: HttpAuthHeader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/P;", "it", "", "invoke", "(Lio/ktor/http/P;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class c extends N implements l<P, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.C11410b f399930l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HeaderValueEncoding f399931m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b.C11410b c11410b, HeaderValueEncoding headerValueEncoding) {
        super(1);
        this.f399930l = c11410b;
        this.f399931m = headerValueEncoding;
    }

    @Override // Y41.l
    public final CharSequence invoke(P p12) {
        P p13 = p12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p13.f399891a);
        sb2.append('=');
        int i12 = b.C11410b.f399927d;
        this.f399930l.getClass();
        int iOrdinal = this.f399931m.ordinal();
        String strB = p13.f399892b;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strB = S.b(strB);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strB = C41508b.f(strB, false);
            }
        } else if (S.a(strB)) {
            strB = S.b(strB);
        }
        sb2.append(strB);
        return sb2.toString();
    }
}
