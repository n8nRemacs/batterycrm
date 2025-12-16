package com.avito.android.util.architecture_components;

import androidx.view.C22985S;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FilterCreatedLifecycleOwner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/architecture_components/c;", "Landroidx/lifecycle/P;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.architecture_components.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35749c implements InterfaceC22983P {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f318809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f318810c = new b(this, true);

    /* compiled from: FilterCreatedLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/architecture_components/c$a;", "Landroidx/lifecycle/L;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.architecture_components.c$a */
    public final class a implements InterfaceC22979L {
        public a() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
            C35749c.this.f318810c.f(event);
        }
    }

    /* compiled from: FilterCreatedLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/architecture_components/c$b", "Landroidx/lifecycle/S;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.architecture_components.c$b */
    public static final class b extends C22985S {
        @Override // androidx.view.C22985S
        public final void f(@Y61.k Lifecycle.Event event) {
            Lifecycle.State stateA = event.a();
            if (stateA == Lifecycle.State.f46681d) {
                stateA = Lifecycle.State.f46682e;
            }
            h(stateA);
        }
    }

    public C35749c(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f318809b = interfaceC22983P;
        interfaceC22983P.getLifecycle().a(new a());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C35749c) {
            if (L.f(this.f318809b, ((C35749c) obj).f318809b)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.view.InterfaceC22983P
    @Y61.k
    public final Lifecycle getLifecycle() {
        return this.f318810c;
    }

    public final int hashCode() {
        return this.f318809b.hashCode();
    }
}
