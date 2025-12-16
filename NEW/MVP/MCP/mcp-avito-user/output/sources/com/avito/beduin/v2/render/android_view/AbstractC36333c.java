package com.avito.beduin.v2.render.android_view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import com.avito.beduin.v2.theme.r;
import dU0.InterfaceC39628a;
import fU0.AbstractC40338a;
import j.InterfaceC42153i;
import j.InterfaceC42156l;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Component.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/c;", "T", "Landroid/view/View;", "V", "Lcom/avito/beduin/v2/render/android_view/m;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.android_view.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36333c<T, V extends View> implements InterfaceC36343m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final PT0.b<V> f337941a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public WeakReference<InterfaceC36249i> f337942b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public WeakReference<InterfaceC36249i> f337943c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public T f337944d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f337945e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public T f337946f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f337947g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public E f337948h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public E f337949i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public V f337950j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final B f337951k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public o f337952l;

    /* compiled from: Component.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroid/view/View;", "V", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.render.android_view.c$a */
    public static final class a extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC36333c<T, V> f337953l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ A f337954m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C36336f f337955n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC36333c<T, V> abstractC36333c, A a12, C36336f c36336f) {
            super(1);
            this.f337953l = abstractC36333c;
            this.f337954m = a12;
            this.f337955n = c36336f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.avito.beduin.v2.render.android_view.b] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVarE;
            com.avito.beduin.v2.theme.k kVar;
            String tag;
            final AbstractC36333c<T, V> abstractC36333c = this.f337953l;
            abstractC36333c.f337944d = obj;
            abstractC36333c.o();
            T t12 = abstractC36333c.f337944d;
            E e12 = null;
            if (t12 != null && (kVar = abstractC36333c.f337945e) != null && (!t12.equals(abstractC36333c.f337946f) || !kVar.equals(abstractC36333c.f337947g) || abstractC36333c.f337951k.f337911a != null)) {
                abstractC36333c.f337946f = t12;
                abstractC36333c.f337947g = kVar;
                try {
                    V v12 = abstractC36333c.f337950j;
                    InterfaceC36249i interfaceC36249iK = abstractC36333c.k();
                    if (interfaceC36249iK == null || (tag = interfaceC36249iK.getTag()) == null) {
                        tag = "";
                    }
                    v12.setTag(tag);
                    abstractC36333c.l(abstractC36333c.f337950j, kVar, t12);
                } catch (Exception e13) {
                    if (!(e13 instanceof ClassCastException)) {
                        InterfaceC36249i interfaceC36249iK2 = abstractC36333c.k();
                        String strM = interfaceC36249iK2 != null ? interfaceC36249iK2.getF336566c() : null;
                        InterfaceC36249i interfaceC36249iK3 = abstractC36333c.k();
                        String tag2 = interfaceC36249iK3 != null ? interfaceC36249iK3.getTag() : null;
                        A a12 = this.f337954m;
                        RendererBeduinException.OnBindStateException onBindStateException = new RendererBeduinException.OnBindStateException(strM, t12, tag2, a12.f337910f, e13);
                        com.avito.beduin.v2.engine.utils.e.b(onBindStateException, "Renderer", null);
                        aU0.b bVar = a12.f337908d;
                        if (bVar != null) {
                            bVar.a(onBindStateException, com.avito.beduin.v2.engine.utils.f.a());
                        }
                    }
                }
                InterfaceC36249i interfaceC36249iK4 = abstractC36333c.k();
                abstractC36333c.f337943c = interfaceC36249iK4 != null ? new WeakReference<>(interfaceC36249iK4) : null;
            }
            InterfaceC36243c interfaceC36243c = obj instanceof InterfaceC36243c ? (InterfaceC36243c) obj : null;
            AbstractC40338a[] abstractC40338aArr = (interfaceC36243c == null || (cVarE = interfaceC36243c.e()) == null) ? null : cVarE.f336915a;
            E e14 = abstractC36333c.f337949i;
            if (e14 != null) {
                e14.a();
            }
            V v13 = abstractC36333c.f337950j;
            ?? r22 = new y() { // from class: com.avito.beduin.v2.render.android_view.b
                @Override // com.avito.beduin.v2.render.android_view.y
                public final void a(InterfaceC39628a interfaceC39628a) {
                    View view;
                    PT0.c cVar;
                    PT0.b<V> bVar2 = abstractC36333c.f337941a;
                    if (bVar2 == 0 || (view = bVar2.f13075b) == null || (cVar = (PT0.c) bVar2.f13074a.get(interfaceC39628a.getClass())) == null) {
                        return;
                    }
                    cVar.a(interfaceC39628a, view);
                }
            };
            C36336f c36336f = this.f337955n;
            c36336f.getClass();
            if (abstractC40338aArr != null && abstractC40338aArr.length != 0) {
                e12 = new E(v13, new C36335e(r22, c36336f, abstractC40338aArr));
            }
            abstractC36333c.f337949i = e12;
            o oVar = abstractC36333c.f337952l;
            if (oVar != null) {
                oVar.a(abstractC36333c.f337950j);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC36333c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    @Y61.k
    public final View a(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C36336f c36336f) {
        if (this.f337950j == null) {
            V v12 = (V) n(viewGroup);
            this.f337950j = v12;
            PT0.b<V> bVar = this.f337941a;
            if (bVar != null) {
                bVar.f13075b = v12;
            }
            this.f337942b = null;
            this.f337943c = null;
            this.f337946f = null;
            E e12 = this.f337948h;
            if (e12 != null) {
                e12.a();
            }
            InterfaceC36249i interfaceC36249iK = k();
            if (interfaceC36249iK != null) {
                interfaceC36249iK.release();
            }
            E e13 = this.f337949i;
            if (e13 != null) {
                e13.a();
            }
        }
        return this.f337950j;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    public final void b() {
        p(this.f337950j);
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    @Y61.l
    public final Bundle e() {
        String id2;
        Bundle bundleR;
        InterfaceC36249i interfaceC36249iK = k();
        if (interfaceC36249iK == null || (id2 = interfaceC36249iK.getF336564a()) == null || (bundleR = r(this.f337950j)) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(id2, bundleR);
        return bundle;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    @Y61.k
    public final View f(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C36336f c36336f, @Y61.l Bundle bundle, @Y61.l o oVar, @Y61.k A a12) {
        View viewA = a(viewGroup, kVar, interfaceC36249i, c36336f);
        g(kVar, interfaceC36249i, c36336f, bundle, oVar, a12);
        return viewA;
    }

    @Override // com.avito.beduin.v2.render.android_view.InterfaceC36343m
    public final void g(@Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C36336f c36336f, @Y61.l Bundle bundle, @Y61.l o oVar, @Y61.k A a12) {
        this.f337945e = kVar;
        this.f337951k.f337911a = bundle != null ? bundle.getBundle(interfaceC36249i.getF336564a()) : null;
        this.f337952l = oVar;
        if (kotlin.jvm.internal.L.f(k(), interfaceC36249i)) {
            return;
        }
        InterfaceC36249i interfaceC36249iK = k();
        this.f337942b = new WeakReference<>(interfaceC36249i);
        E e12 = this.f337948h;
        if (e12 != null) {
            e12.a();
        }
        if (interfaceC36249iK != null) {
            interfaceC36249iK.release();
        }
        interfaceC36249i.b();
        V v12 = this.f337950j;
        this.f337948h = new E(v12, new C36337g(new a(this, a12, c36336f), interfaceC36249i, v12));
    }

    public final void j() {
        B b12 = this.f337951k;
        Bundle bundle = b12.f337911a;
        b12.f337911a = null;
        V v12 = this.f337950j;
        if (bundle == null || v12 == null) {
            return;
        }
        q(v12, bundle);
    }

    @Y61.l
    public final InterfaceC36249i k() {
        WeakReference<InterfaceC36249i> weakReference = this.f337942b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public abstract void l(@Y61.k V v12, @Y61.k com.avito.beduin.v2.theme.k kVar, T t12);

    @InterfaceC42153i
    public void m() {
        j();
    }

    @Y61.k
    public abstract V n(@Y61.k ViewGroup viewGroup);

    public void o() {
        j();
    }

    @Y61.l
    public Bundle r(@Y61.k V v12) {
        return null;
    }

    @InterfaceC42156l
    public final int s(@Y61.k com.avito.beduin.v2.theme.r rVar) {
        return F.b(rVar, this.f337945e, w.a(this.f337950j.getContext()));
    }

    @InterfaceC42156l
    public final int t(@Y61.k String str) {
        r.a aVar = com.avito.beduin.v2.theme.r.f338365d;
        return s(com.avito.beduin.v2.theme.y.a(str));
    }

    public AbstractC36333c(@Y61.k PT0.a<V, ? extends InterfaceC39628a>... aVarArr) {
        this.f337941a = (!(aVarArr.length == 0) ? aVarArr : null) != null ? new PT0.b<>(aVarArr) : null;
        this.f337951k = new B(null, 1, null);
    }

    public /* synthetic */ AbstractC36333c(PT0.a[] aVarArr, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new PT0.a[0] : aVarArr);
    }

    public void p(@Y61.k V v12) {
    }

    public void q(@Y61.k View view, @Y61.k Bundle bundle) {
    }
}
