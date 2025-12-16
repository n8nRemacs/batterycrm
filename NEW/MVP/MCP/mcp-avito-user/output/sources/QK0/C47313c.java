package qK0;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import j.InterfaceC42153i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.properties.h;
import kotlin.reflect.n;

/* compiled from: AutoClearedValue.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"LqK0/c;", "", "T", "Lkotlin/properties/h;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/q;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qK0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47313c<T> implements h<Fragment, T>, InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final a<T> f429189b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public T f429190c;

    /* compiled from: AutoClearedValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"LqK0/c$a;", "", "T", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qK0.c$a */
    public interface a<T> {
        void a(@k T t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47313c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @k
    public final Object a() {
        T t12 = this.f429190c;
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("Trying to call an auto-cleared value outside of the view lifecycle.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@k Fragment fragment, @k Object obj) {
        fragment.getViewLifecycleOwner().getLifecycle().c(this);
        this.f429190c = obj;
        fragment.getViewLifecycleOwner().getLifecycle().a(this);
    }

    @Override // kotlin.properties.g
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, n nVar) {
        throw null;
    }

    @InterfaceC42153i
    public void onDestroy(@k InterfaceC22983P interfaceC22983P) {
        a<T> aVar;
        T t12 = this.f429190c;
        if (t12 != null && (aVar = this.f429189b) != null) {
            aVar.a(t12);
        }
        this.f429190c = null;
    }

    @Override // kotlin.properties.h
    public final /* bridge */ /* synthetic */ void setValue(Fragment fragment, n nVar, Object obj) {
        throw null;
    }

    public C47313c(@l a<T> aVar) {
        this.f429189b = aVar;
    }

    public /* synthetic */ C47313c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar);
    }
}
