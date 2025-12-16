package androidx.view;

import Y61.k;
import Y61.l;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/r;", "Landroidx/lifecycle/L;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23059r implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC23057q f46871b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC22979L f46872c;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.r$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46873a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f46873a = iArr;
        }
    }

    public C23059r(@k InterfaceC23057q interfaceC23057q, @l InterfaceC22979L interfaceC22979L) {
        this.f46871b = interfaceC23057q;
        this.f46872c = interfaceC22979L;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        int i12 = a.f46873a[event.ordinal()];
        InterfaceC23057q interfaceC23057q = this.f46871b;
        switch (i12) {
            case 1:
                interfaceC23057q.onCreate(interfaceC22983P);
                break;
            case 2:
                interfaceC23057q.onStart(interfaceC22983P);
                break;
            case 3:
                interfaceC23057q.onResume(interfaceC22983P);
                break;
            case 4:
                interfaceC23057q.onPause(interfaceC22983P);
                break;
            case 5:
                interfaceC23057q.onStop(interfaceC22983P);
                break;
            case 6:
                interfaceC23057q.onDestroy(interfaceC22983P);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC22979L interfaceC22979L = this.f46872c;
        if (interfaceC22979L != null) {
            interfaceC22979L.HH(interfaceC22983P, event);
        }
    }
}
