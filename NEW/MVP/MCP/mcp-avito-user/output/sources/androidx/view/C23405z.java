package androidx.view;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/W;", "destination", "", "invoke", "(Landroidx/navigation/W;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23405z extends N implements l<C23317W, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23397v f53246l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23405z(C23397v c23397v) {
        super(1);
        this.f53246l = c23397v;
    }

    @Override // Y41.l
    public final Boolean invoke(C23317W c23317w) {
        return Boolean.valueOf(!this.f53246l.f53218n.containsKey(Integer.valueOf(c23317w.f52886i)));
    }
}
