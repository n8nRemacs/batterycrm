package androidx.view.compose;

import Y41.l;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: LifecycleEffect.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.compose.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23027v extends N implements l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f46766l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C23003E f46767m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l<C23003E, InterfaceC23004F> f46768n;

    /* compiled from: LifecycleEffect.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.compose.v$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46769a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46769a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23027v(InterfaceC22983P interfaceC22983P, C23003E c23003e, l<? super C23003E, ? extends InterfaceC23004F> lVar) {
        super(1);
        this.f46766l = interfaceC22983P;
        this.f46767m = c23003e;
        this.f46768n = lVar;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        l0.h hVar = new l0.h();
        C23018m c23018m = new C23018m(this.f46767m, hVar, this.f46768n, 1);
        InterfaceC22983P interfaceC22983P = this.f46766l;
        interfaceC22983P.getLifecycle().a(c23018m);
        return new C23028w(interfaceC22983P, c23018m, hVar);
    }
}
