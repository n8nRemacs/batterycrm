package com.yandex.div.core.expression;

import Y41.l;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.expression.variables.k;
import com.yandex.div.core.q0;
import java.util.List;
import kotlin.InterfaceC43072x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements InterfaceC37911f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f367449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f367450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f367451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f367452e;

    public /* synthetic */ c(Object obj, Object obj2, InterfaceC43072x interfaceC43072x, int i12) {
        this.f367449b = i12;
        this.f367451d = obj;
        this.f367450c = obj2;
        this.f367452e = interfaceC43072x;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f367449b) {
            case 0:
                q0 q0Var = (q0) ((d) this.f367451d).f367458g.get((String) this.f367450c);
                if (q0Var != null) {
                    q0Var.d((Y41.a) this.f367452e);
                    break;
                }
                break;
            case 1:
                k kVar = (k) this.f367451d;
                l lVar = (l) this.f367452e;
                q0 q0Var2 = (q0) kVar.f367520c.get((String) this.f367450c);
                if (q0Var2 != null) {
                    q0Var2.d(lVar);
                    break;
                }
                break;
            default:
                for (String str : (List) this.f367451d) {
                    l lVar2 = (l) this.f367452e;
                    q0 q0Var3 = (q0) ((k) this.f367450c).f367520c.get(str);
                    if (q0Var3 != null) {
                        q0Var3.d(lVar2);
                    }
                }
                break;
        }
    }
}
