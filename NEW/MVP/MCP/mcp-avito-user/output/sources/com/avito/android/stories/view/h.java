package com.avito.android.stories.view;

import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.stories.view.h;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesListImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/view/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/stories/view/c;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f285307h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f285308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.stories.view.stories_carousel.a f285309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f285310d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f285311e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f285312f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C f285313g;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f285314b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f285315c;

        public a(Y41.a aVar, View view) {
            this.f285314b = aVar;
            this.f285315c = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f285314b.invoke();
            this.f285315c.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: StoriesListImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B<Integer> f285316l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B<Integer> b12) {
            super(1);
            this.f285316l = b12;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f285316l.onNext(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public h(@Y61.k View view) {
        super(view);
        this.f285308b = view;
        View viewFindViewById = view.findViewById(R.id.stories_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f285312f = viewFindViewById;
        this.f285313g = new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.stories.view.d
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                final com.avito.android.stories.view.stories_carousel.a aVar = this.f285303b.f285309c;
                b12.f(new l41.f() { // from class: com.avito.android.stories.view.e
                    @Override // l41.f
                    public final void cancel() {
                        int i12 = h.f285307h;
                        com.avito.android.stories.view.stories_carousel.a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.f132081p = null;
                        }
                    }
                });
                if (aVar != null) {
                    aVar.f132081p = new h.b(b12);
                }
            }
        });
    }

    @Override // com.avito.android.stories.view.c
    public final void Nk(int i12, int i13) {
        D6.f(this.f285312f, y6.b(i12), 0, y6.b(i13), 0, 10);
    }

    @Override // com.avito.android.stories.view.c
    public final void VS(@Y61.k Y41.a<G0> aVar) {
        View view = this.f285312f;
        view.addOnLayoutChangeListener(new a(aVar, view));
    }

    @Override // com.avito.android.stories.view.c
    public final void W0(int i12) {
        com.avito.android.stories.view.stories_carousel.a aVar = this.f285309c;
        if (aVar != null) {
            aVar.f132070e.A0(i12);
        }
    }

    @Override // com.avito.android.stories.view.c
    @Y61.l
    public final Parcelable lu() {
        com.avito.android.stories.view.stories_carousel.a aVar = this.f285309c;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    @Override // com.avito.android.stories.view.c
    public final void ol(@Y61.l Parcelable parcelable) {
        if (parcelable != null) {
            com.avito.android.stories.view.stories_carousel.a aVar = this.f285309c;
            if (aVar != null) {
                aVar.f(parcelable);
                return;
            }
            return;
        }
        com.avito.android.stories.view.stories_carousel.a aVar2 = this.f285309c;
        if (aVar2 != null) {
            aVar2.e();
        }
    }

    @Override // com.avito.android.stories.view.c
    @Y61.k
    public final z<Integer> rj() {
        throw null;
    }

    @Override // com.avito.android.stories.view.c
    public final void xv(@Y61.l ArrayList arrayList, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        if (this.f285309c == null && O2.a(arrayList)) {
            View viewFindViewById = this.f285308b.findViewById(R.id.stories_list);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            com.avito.android.stories.view.stories_carousel.b bVar = new com.avito.android.stories.view.stories_carousel.b(new com.avito.android.stories.view.stories_carousel.e(new g(this)));
            com.avito.android.stories.view.story_banner.a aVar = new com.avito.android.stories.view.story_banner.a(new com.avito.android.stories.view.story_banner.c(new f(this)));
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(bVar);
            c10493a.b(aVar);
            com.avito.konveyor.a aVarA = c10493a.a();
            this.f285309c = new com.avito.android.stories.view.stories_carousel.a(viewFindViewById, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, false, Integer.valueOf(D6.j(viewFindViewById, 12)), null, false, 192, null);
        }
        this.f285310d = lVar;
        this.f285311e = lVar2;
        com.avito.android.stories.view.stories_carousel.a aVar2 = this.f285309c;
        if (aVar2 != null) {
            aVar2.f285318w = arrayList;
            aVar2.h();
        }
    }
}
