package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.AbstractC38386j1;
import com.yandex.div2.C38577v2;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivImageScale;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivImageBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/K0;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/v2;", "Lcom/yandex/div/core/view2/divs/widgets/i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class K0 implements com.yandex.div.core.view2.N<C38577v2, com.yandex.div.core.view2.divs.widgets.i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v21.c f368118b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.D f368119c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f368120d;

    /* compiled from: DivImageBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Drawable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368121l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.yandex.div.core.view2.divs.widgets.i iVar) {
            super(1);
            this.f368121l = iVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Drawable drawable) {
            Drawable drawable2 = drawable;
            com.yandex.div.core.view2.divs.widgets.i iVar = this.f368121l;
            if (!iVar.l() && !kotlin.jvm.internal.L.f(iVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                iVar.setPlaceholder(drawable2);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivImageBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Bitmap, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368122l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ K0 f368123m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C38577v2 f368124n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C38029k f368125o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368126p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38029k c38029k, K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, com.yandex.div.json.expressions.e eVar, C38577v2 c38577v2) {
            super(1);
            this.f368122l = iVar;
            this.f368123m = k02;
            this.f368124n = c38577v2;
            this.f368125o = c38029k;
            this.f368126p = eVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            com.yandex.div.core.view2.divs.widgets.i iVar = this.f368122l;
            if (!iVar.l()) {
                iVar.setCurrentBitmapWithoutFilters$div_release(bitmap2);
                C38577v2 c38577v2 = this.f368124n;
                List<AbstractC38386j1> list = c38577v2.f376748r;
                com.yandex.div.json.expressions.e eVar = this.f368126p;
                K0.a(this.f368123m, iVar, list, this.f368125o, eVar);
                iVar.setTag(R.id.image_loaded_flag, Boolean.FALSE);
                K0.c(iVar, eVar, c38577v2.f376719G, c38577v2.f376720H);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivImageBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivImageScale;", "scale", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivImageScale;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<DivImageScale, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368127l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.yandex.div.core.view2.divs.widgets.i iVar) {
            super(1);
            this.f368127l = iVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DivImageScale divImageScale) {
            this.f368127l.setImageScale(C37931a.L(divImageScale));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivImageBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "it", "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Uri, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f368128l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368129m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C38029k f368130n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368131o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.errors.d f368132p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C38577v2 f368133q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38029k c38029k, K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, com.yandex.div.core.view2.errors.d dVar, com.yandex.div.json.expressions.e eVar, C38577v2 c38577v2) {
            super(1);
            this.f368128l = k02;
            this.f368129m = iVar;
            this.f368130n = c38029k;
            this.f368131o = eVar;
            this.f368132p = dVar;
            this.f368133q = c38577v2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Uri uri) {
            K0 k02 = this.f368128l;
            k02.getClass();
            C38577v2 c38577v2 = this.f368133q;
            com.yandex.div.json.expressions.b<Uri> bVar = c38577v2.f376753w;
            com.yandex.div.json.expressions.e eVar = this.f368131o;
            Uri uriA = bVar.a(eVar);
            com.yandex.div.core.view2.divs.widgets.i iVar = this.f368129m;
            if (kotlin.jvm.internal.L.f(uriA, iVar.getImageUrl())) {
                K0.c(iVar, eVar, c38577v2.f376719G, c38577v2.f376720H);
            } else {
                boolean z12 = !iVar.l() && c38577v2.f376751u.a(eVar).booleanValue();
                iVar.setTag(R.id.image_loaded_flag, null);
                v21.e loadReference = iVar.getLoadReference();
                if (loadReference != null) {
                    loadReference.cancel();
                }
                com.yandex.div.core.view2.errors.d dVar = this.f368132p;
                C38029k c38029k = this.f368130n;
                k02.b(iVar, c38029k, eVar, c38577v2, dVar, z12);
                iVar.setImageUrl$div_release(uriA);
                v21.e eVarLoadImage = k02.f368118b.loadImage(uriA.toString(), new J0(c38029k, k02, iVar, eVar, c38577v2));
                c38029k.h(eVarLoadImage);
                iVar.setLoadReference$div_release(eVarLoadImage);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public K0(@Y61.k C38006w c38006w, @Y61.k v21.c cVar, @Y61.k com.yandex.div.core.view2.D d12, @Y61.k com.yandex.div.core.view2.errors.f fVar) {
        this.f368117a = c38006w;
        this.f368118b = cVar;
        this.f368119c = d12;
        this.f368120d = fVar;
    }

    public static final void a(K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, List list, C38029k c38029k, com.yandex.div.json.expressions.e eVar) {
        k02.getClass();
        Bitmap currentBitmapWithoutFilters = iVar.getCurrentBitmapWithoutFilters();
        if (currentBitmapWithoutFilters == null) {
            iVar.setImageBitmap(null);
        } else {
            com.yandex.div.core.view2.divs.widgets.z.a(new I0(iVar), currentBitmapWithoutFilters, iVar, c38029k.getDiv2Component(), eVar, list);
        }
    }

    public static void c(ImageView imageView, com.yandex.div.json.expressions.e eVar, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2) {
        Integer num = bVar == null ? null : (Integer) bVar.a(eVar);
        if (num != null) {
            imageView.setColorFilter(num.intValue(), C37931a.N((DivBlendMode) bVar2.a(eVar)));
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
    }

    public final void b(com.yandex.div.core.view2.divs.widgets.i iVar, C38029k c38029k, com.yandex.div.json.expressions.e eVar, C38577v2 c38577v2, com.yandex.div.core.view2.errors.d dVar, boolean z12) {
        com.yandex.div.json.expressions.b<String> bVar = c38577v2.f376715C;
        String strA = bVar == null ? null : bVar.a(eVar);
        iVar.setPreview$div_release(strA);
        this.f368119c.a(iVar, dVar, strA, c38577v2.f376713A.a(eVar).intValue(), z12, new a(iVar), new b(c38029k, this, iVar, eVar, c38577v2));
    }

    public final void d(@Y61.k com.yandex.div.core.view2.divs.widgets.i iVar, @Y61.k C38577v2 c38577v2, @Y61.k C38029k c38029k) {
        C38577v2 div = iVar.getDiv();
        if (c38577v2.equals(div)) {
            return;
        }
        q21.c dataTag = c38029k.getDataTag();
        com.yandex.div.core.view2.errors.d dVarA = this.f368120d.a(c38029k.getDivData(), dataTag);
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        F21.b bVarA = com.yandex.div.core.util.e.a(iVar);
        iVar.g();
        iVar.setDiv$div_release(c38577v2);
        C38006w c38006w = this.f368117a;
        if (div != null) {
            c38006w.h(c38029k, iVar, div);
        }
        c38006w.d(iVar, c38577v2, div, c38029k);
        C37931a.c(iVar, c38029k, c38577v2.f376732b, c38577v2.f376734d, c38577v2.f376754x, c38577v2.f376746p, c38577v2.f376733c);
        C37931a.D(iVar, expressionResolver, c38577v2.f376739i);
        iVar.e(c38577v2.f376717E.e(expressionResolver, new c(iVar)));
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = c38577v2.f376743m;
        DivAlignmentHorizontal divAlignmentHorizontalA = bVar.a(expressionResolver);
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2 = c38577v2.f376744n;
        iVar.setGravity(C37931a.r(divAlignmentHorizontalA, bVar2.a(expressionResolver)));
        L0 l02 = new L0(this, iVar, bVar, bVar2, expressionResolver);
        iVar.e(bVar.d(expressionResolver, l02));
        iVar.e(bVar2.d(expressionResolver, l02));
        iVar.e(c38577v2.f376753w.e(expressionResolver, new d(c38029k, this, iVar, dVarA, expressionResolver, c38577v2)));
        com.yandex.div.json.expressions.b<String> bVar3 = c38577v2.f376715C;
        if (bVar3 != null) {
            iVar.e(bVar3.e(expressionResolver, new N0(c38029k, this, iVar, dVarA, expressionResolver, c38577v2)));
        }
        com.yandex.div.json.expressions.b<Integer> bVar4 = c38577v2.f376719G;
        if (bVar4 == null) {
            iVar.setColorFilter((ColorFilter) null);
        } else {
            com.yandex.div.json.expressions.b<DivBlendMode> bVar5 = c38577v2.f376720H;
            O0 o02 = new O0(this, iVar, bVar4, bVar5, expressionResolver);
            iVar.e(bVar4.e(expressionResolver, o02));
            iVar.e(bVar5.e(expressionResolver, o02));
        }
        List<AbstractC38386j1> list = c38577v2.f376748r;
        if (list == null) {
            return;
        }
        M0 m02 = new M0(this, iVar, list, c38029k, expressionResolver);
        for (AbstractC38386j1 abstractC38386j1 : list) {
            if (abstractC38386j1 instanceof AbstractC38386j1.a) {
                bVarA.e(((AbstractC38386j1.a) abstractC38386j1).f375416c.f372541a.d(expressionResolver, m02));
            }
        }
    }
}
