package com.avito.android.constructor_advert.ui.serp.constructor.blueprint;

import Cr.InterfaceC13346a;
import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl;
import com.avito.android.constructor_advert.ui.serp.constructor.n;
import com.avito.android.video_snippets.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/a;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "LTV0/b;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/n;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class a<T extends ConstructorAdvertItem> implements TV0.b<n, T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.k<T> f125788a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f125789b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f125790c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final g f125791d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C36135w2 f125792e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final RecyclerView.t f125793f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g.a<ConstructorAdvertItemViewImpl> f125794g;

    /* compiled from: ConstructorAdvertBlueprint.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002 \u0000*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl;", "T", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a$a, reason: collision with other inner class name */
    public static final class C3735a extends N implements p<ViewGroup, View, ConstructorAdvertItemViewImpl> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13346a f125795l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a<T> f125796m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3735a(InterfaceC13346a interfaceC13346a, a<? super T> aVar) {
            super(2);
            this.f125795l = interfaceC13346a;
            this.f125796m = aVar;
        }

        @Override // Y41.p
        public final ConstructorAdvertItemViewImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a<T> aVar = this.f125796m;
            boolean zBooleanValue = aVar.f125792e.x().invoke().booleanValue();
            InterfaceC25659b interfaceC25659b = aVar.f125789b;
            return new ConstructorAdvertItemViewImpl(view2, this.f125795l, zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0), aVar.f125790c, aVar.f125791d, AsyncViewportTracker.ViewContext.f430413c, null, null, aVar.f125792e.x().invoke().booleanValue() ? aVar.f125793f : null, false, 192, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k com.avito.android.constructor_advert.ui.serp.constructor.k<? super T> kVar, @k InterfaceC13346a interfaceC13346a, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @l com.avito.android.video_snippets.g gVar, @k C36135w2 c36135w2, @l RecyclerView.t tVar) {
        this.f125788a = kVar;
        this.f125789b = interfaceC25659b;
        this.f125790c = bVar;
        this.f125791d = gVar;
        this.f125792e = c36135w2;
        this.f125793f = tVar;
        this.f125794g = new g.a<>(R.layout.constructor_advert_item, new C3735a(interfaceC13346a, this));
    }

    @Override // TV0.b
    @k
    public g.a<ConstructorAdvertItemViewImpl> b() {
        return this.f125794g;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public boolean d(@k TV0.a aVar) {
        return (aVar instanceof ConstructorAdvertItem) && !((ConstructorAdvertItem) aVar).getDisplayType().isCv();
    }

    @Override // TV0.b
    @k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.avito.android.constructor_advert.ui.serp.constructor.k<T> a() {
        return this.f125788a;
    }

    public /* synthetic */ a(com.avito.android.constructor_advert.ui.serp.constructor.k kVar, InterfaceC13346a interfaceC13346a, InterfaceC25659b interfaceC25659b, com.avito.android.constructor_advert.ui.serp.constructor.b bVar, com.avito.android.video_snippets.g gVar, C36135w2 c36135w2, RecyclerView.t tVar, int i12, C42822w c42822w) {
        this(kVar, interfaceC13346a, interfaceC25659b, bVar, gVar, c36135w2, (i12 & 64) != 0 ? null : tVar);
    }
}
