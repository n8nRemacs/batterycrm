package zc1;

import D31.g;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import z2.InterfaceC50358b;

/* loaded from: classes9.dex */
public final class c implements InterfaceC50358b {

    /* renamed from: a, reason: collision with root package name */
    public final D31.a f444101a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f444102b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f444103c;

    public c(D31.a aVar) {
        this.f444101a = aVar;
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f444102b = e2VarB;
        this.f444103c = C43175k.a(e2VarB);
    }

    public final void a(Xb1.a aVar) {
        C43259k.d((T) ((g) this.f444101a).f2880a.getValue(), null, null, new b(this, aVar, null), 3);
    }

    public final void b(String str, String str2) {
        C43259k.d((T) ((g) this.f444101a).f2880a.getValue(), null, null, new a(this, str, str2, null), 3);
    }
}
