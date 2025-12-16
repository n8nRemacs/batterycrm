package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.view.C23060r0;
import androidx.view.C23485c;
import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import z1.AbstractC50339a;

/* compiled from: AbstractSavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0015J7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0010\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006$"}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/P0$e;", "Landroidx/lifecycle/P0$c;", "<init>", "()V", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Landroid/os/Bundle;", "defaultArgs", "(Landroidx/savedstate/e;Landroid/os/Bundle;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/M0;", "Lz1/a;", "extras", "(Ljava/lang/Class;Lz1/a;)Landroidx/lifecycle/M0;", "(Ljava/lang/Class;)Landroidx/lifecycle/M0;", "Landroidx/lifecycle/r0;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "viewModel", "Lkotlin/G0;", "onRequery", "(Landroidx/lifecycle/M0;)V", "Landroidx/savedstate/c;", "savedStateRegistry", "Landroidx/savedstate/c;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22993a extends P0.e implements P0.c {

    @l
    private Bundle defaultArgs;

    @l
    private Lifecycle lifecycle;

    @l
    private C23485c savedStateRegistry;

    public AbstractC22993a() {
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public <T extends M0> T create(@k Class<T> modelClass, @k AbstractC50339a extras) {
        String str = (String) extras.a(P0.d.f46701c);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) create(str, modelClass) : (T) create(str, modelClass, C23066u0.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @k
    public abstract <T extends M0> T create(@k String key, @k Class<T> modelClass, @k C23060r0 handle);

    @Override // androidx.lifecycle.P0.e
    @RestrictTo
    public void onRequery(@k M0 viewModel) {
        C23485c c23485c = this.savedStateRegistry;
        if (c23485c != null) {
            C22970C.a(viewModel, c23485c, this.lifecycle);
        }
    }

    public AbstractC22993a(@k InterfaceC23487e interfaceC23487e, @l Bundle bundle) {
        this.savedStateRegistry = interfaceC23487e.getSavedStateRegistry();
        this.lifecycle = interfaceC23487e.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends M0> T create(String key, Class<T> modelClass) {
        C23485c c23485c = this.savedStateRegistry;
        Lifecycle lifecycle = this.lifecycle;
        Bundle bundle = this.defaultArgs;
        C22970C c22970c = C22970C.f46654a;
        Bundle bundleA = c23485c.a(key);
        C23060r0.f46874f.getClass();
        C23060r0 c23060r0A = C23060r0.a.a(bundleA, bundle);
        C23064t0 c23064t0 = new C23064t0(key, c23060r0A);
        if (!c23064t0.f46892d) {
            c23064t0.f46892d = true;
            lifecycle.a(c23064t0);
            c23485c.c(key, c23060r0A.f46880e);
            C22970C.f46654a.getClass();
            C22970C.b(lifecycle, c23485c);
            T t12 = (T) create(key, modelClass, c23060r0A);
            t12.addCloseable("androidx.lifecycle.savedstate.vm.tag", c23064t0);
            return t12;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public <T extends M0> T create(@k Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
