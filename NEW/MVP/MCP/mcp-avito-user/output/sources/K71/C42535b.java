package k71;

import Y61.k;
import Y61.l;
import androidx.fragment.app.C22959q;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import o71.d;
import q71.C47249b;

/* compiled from: KoinFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lk71/b;", "Landroidx/fragment/app/q;", "Lorg/koin/core/component/a;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: k71.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42535b extends C22959q implements org.koin.core.component.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final org.koin.core.scope.a f406107b;

    public C42535b() {
        this(null, 1, null);
    }

    @Override // org.koin.core.component.a
    @k
    public final d a() {
        org.koin.mp.d.f421487a.getClass();
        return C47249b.f429044a.a();
    }

    @Override // androidx.fragment.app.C22959q
    @k
    public final Fragment b(@k ClassLoader classLoader, @k String str) {
        kotlin.reflect.d dVarB = m0.f406844a.b(Class.forName(str));
        org.koin.core.scope.a aVar = this.f406107b;
        Fragment fragment = aVar != null ? (Fragment) aVar.c(null, dVarB, null) : (Fragment) a().f419397a.f442258d.c(null, dVarB, null);
        return fragment == null ? super.b(classLoader, str) : fragment;
    }

    public C42535b(org.koin.core.scope.a aVar, int i12, C42822w c42822w) {
        this.f406107b = (i12 & 1) != 0 ? null : aVar;
    }
}
