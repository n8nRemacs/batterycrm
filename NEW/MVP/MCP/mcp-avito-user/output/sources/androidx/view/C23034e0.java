package androidx.view;

import androidx.arch.core.internal.b;
import j.InterfaceC42153i;
import j.K;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData.java */
/* renamed from: androidx.lifecycle.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23034e0<T> extends C23038g0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<AbstractC22991Y<?>, a<?>> f46782a;

    /* compiled from: MediatorLiveData.java */
    /* renamed from: androidx.lifecycle.e0$a */
    public static class a<V> implements InterfaceC23040h0<V> {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC22991Y<V> f46783b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC23040h0<? super V> f46784c;

        /* renamed from: d, reason: collision with root package name */
        public int f46785d = -1;

        public a(AbstractC22991Y<V> abstractC22991Y, InterfaceC23040h0<? super V> interfaceC23040h0) {
            this.f46783b = abstractC22991Y;
            this.f46784c = interfaceC23040h0;
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(@P V v12) {
            int i12 = this.f46785d;
            AbstractC22991Y<V> abstractC22991Y = this.f46783b;
            if (i12 != abstractC22991Y.getVersion()) {
                this.f46785d = abstractC22991Y.getVersion();
                this.f46784c.onChanged(v12);
            }
        }
    }

    public C23034e0() {
        this.f46782a = new b<>();
    }

    @K
    public <S> void a(@N AbstractC22991Y<S> abstractC22991Y, @N InterfaceC23040h0<? super S> interfaceC23040h0) {
        if (abstractC22991Y == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(abstractC22991Y, interfaceC23040h0);
        a<?> aVarB = this.f46782a.b(abstractC22991Y, aVar);
        if (aVarB != null && aVarB.f46784c != interfaceC23040h0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarB == null && hasActiveObservers()) {
            abstractC22991Y.observeForever(aVar);
        }
    }

    @K
    public final <S> void b(@N AbstractC22991Y<S> abstractC22991Y) {
        a<?> aVarD = this.f46782a.d(abstractC22991Y);
        if (aVarD != null) {
            aVarD.f46783b.removeObserver(aVarD);
        }
    }

    @Override // androidx.view.AbstractC22991Y
    @InterfaceC42153i
    public void onActive() {
        Iterator<Map.Entry<AbstractC22991Y<?>, a<?>>> it = this.f46782a.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f46783b.observeForever(value);
        }
    }

    @Override // androidx.view.AbstractC22991Y
    @InterfaceC42153i
    public void onInactive() {
        Iterator<Map.Entry<AbstractC22991Y<?>, a<?>>> it = this.f46782a.iterator();
        while (it.hasNext()) {
            a<?> value = it.next().getValue();
            value.f46783b.removeObserver(value);
        }
    }

    public C23034e0(T t12) {
        super(t12);
        this.f46782a = new b<>();
    }
}
