package androidx.fragment.app;

import kotlin.Metadata;
import z1.AbstractC50339a;

/* compiled from: FragmentViewModelLazy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class X extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Fragment f46525l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Fragment fragment) {
        super(0);
        this.f46525l = fragment;
    }

    @Override // Y41.a
    public final AbstractC50339a invoke() {
        return this.f46525l.getDefaultViewModelCreationExtras();
    }
}
