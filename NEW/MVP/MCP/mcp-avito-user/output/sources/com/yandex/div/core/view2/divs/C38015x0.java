package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import com.avito.android.R;
import com.avito.android.util.C35767c4;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import v21.C49153a;

/* compiled from: DivGifImageBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/divs/x0;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/O1;", "Lcom/yandex/div/core/view2/divs/widgets/g;", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.x0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38015x0 implements com.yandex.div.core.view2.N<com.yandex.div2.O1, com.yandex.div.core.view2.divs.widgets.g> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f369024e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f369025a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v21.c f369026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.D f369027c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f369028d;

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/divs/x0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.x0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/x0$b;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Landroid/graphics/drawable/Drawable;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @j.X
    /* renamed from: com.yandex.div.core.view2.divs.x0$b */
    public static final class b extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final WeakReference<com.yandex.div.core.view2.divs.widgets.g> f369029a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C49153a f369030b;

        public b(@Y61.k WeakReference<com.yandex.div.core.view2.divs.widgets.g> weakReference, @Y61.k C49153a c49153a) {
            this.f369029a = weakReference;
            this.f369030b = c49153a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.graphics.drawable.Drawable doInBackground(java.lang.Void[] r3) {
            /*
                r2 = this;
                v21.a r0 = r2.f369030b
                java.lang.Void[] r3 = (java.lang.Void[]) r3
                r0.getClass()     // Catch: java.lang.IllegalStateException -> Lf java.io.IOException -> L12
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> Lf java.io.IOException -> L12
                java.lang.String r1 = "no bytes stored in cached bitmap"
                r3.<init>(r1)     // Catch: java.lang.IllegalStateException -> Lf java.io.IOException -> L12
                throw r3     // Catch: java.lang.IllegalStateException -> Lf java.io.IOException -> L12
            Lf:
                int r3 = com.yandex.div.internal.p.f370124a
                goto L14
            L12:
                int r3 = com.yandex.div.internal.p.f370124a
            L14:
                android.net.Uri r3 = r0.f440421b
                r0 = 0
                if (r3 != 0) goto L1b
                r3 = r0
                goto L1f
            L1b:
                java.lang.String r3 = r3.getPath()
            L1f:
                if (r3 == 0) goto L2d
                java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L2b
                r1.<init>(r3)     // Catch: java.io.IOException -> L2b
                android.graphics.ImageDecoder$Source r3 = com.avito.android.util.C35767c4.f(r1)     // Catch: java.io.IOException -> L2b
                goto L2e
            L2b:
                int r3 = com.yandex.div.internal.p.f370124a
            L2d:
                r3 = r0
            L2e:
                if (r3 == 0) goto L37
                android.graphics.drawable.Drawable r0 = com.avito.android.util.C35767c4.i(r3)     // Catch: java.io.IOException -> L35
                goto L37
            L35:
                int r3 = com.yandex.div.internal.p.f370124a
            L37:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C38015x0.b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            super.onPostExecute(drawable2);
            WeakReference<com.yandex.div.core.view2.divs.widgets.g> weakReference = this.f369029a;
            if (drawable2 == null || !C35767c4.w(drawable2)) {
                com.yandex.div.core.view2.divs.widgets.g gVar = weakReference.get();
                if (gVar != null) {
                    gVar.setImage(this.f369030b.f440420a);
                }
            } else {
                com.yandex.div.core.view2.divs.widgets.g gVar2 = weakReference.get();
                if (gVar2 != null) {
                    gVar2.setImage(drawable2);
                }
            }
            com.yandex.div.core.view2.divs.widgets.g gVar3 = weakReference.get();
            if (gVar3 == null) {
                return;
            }
            gVar3.setTag(R.id.image_loaded_flag, Boolean.TRUE);
        }
    }

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivImageScale;", "scale", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivImageScale;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.x0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<DivImageScale, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.g f369031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.yandex.div.core.view2.divs.widgets.g gVar) {
            super(1);
            this.f369031l = gVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DivImageScale divImageScale) {
            this.f369031l.setImageScale(C37931a.L(divImageScale));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "it", "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.x0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Uri, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.g f369033m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C38029k f369034n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f369035o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div2.O1 f369036p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.errors.d f369037q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.yandex.div.core.view2.divs.widgets.g gVar, C38029k c38029k, com.yandex.div.json.expressions.e eVar, com.yandex.div2.O1 o12, com.yandex.div.core.view2.errors.d dVar) {
            super(1);
            this.f369033m = gVar;
            this.f369034n = c38029k;
            this.f369035o = eVar;
            this.f369036p = o12;
            this.f369037q = dVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Uri uri) {
            int i12 = C38015x0.f369024e;
            C38015x0 c38015x0 = C38015x0.this;
            c38015x0.getClass();
            com.yandex.div2.O1 o12 = this.f369036p;
            com.yandex.div.json.expressions.b<Uri> bVar = o12.f373114r;
            com.yandex.div.json.expressions.e eVar = this.f369035o;
            Uri uriA = bVar.a(eVar);
            com.yandex.div.core.view2.divs.widgets.g gVar = this.f369033m;
            if (!kotlin.jvm.internal.L.f(uriA, gVar.getGifUrl())) {
                gVar.setTag(R.id.image_loaded_flag, null);
                gVar.gifUrl = null;
                v21.e loadReference = gVar.getLoadReference();
                if (loadReference != null) {
                    loadReference.cancel();
                }
                com.yandex.div.json.expressions.b<String> bVar2 = o12.f373122z;
                String strA = bVar2 != null ? bVar2.a(eVar) : null;
                c38015x0.f369027c.a(gVar, this.f369037q, strA, o12.f373120x.a(eVar).intValue(), false, new C38018y0(gVar), new C38021z0(gVar));
                gVar.setGifUrl$div_release(uriA);
                String string = uriA.toString();
                C38029k c38029k = this.f369034n;
                v21.e eVarLoadImageBytes = c38015x0.f369026b.loadImageBytes(string, new A0(c38029k, c38015x0, gVar));
                c38029k.h(eVarLoadImageBytes);
                gVar.setLoadReference$div_release(eVarLoadImageBytes);
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C38015x0(@Y61.k C38006w c38006w, @Y61.k v21.c cVar, @Y61.k com.yandex.div.core.view2.D d12, @Y61.k com.yandex.div.core.view2.errors.f fVar) {
        this.f369025a = c38006w;
        this.f369026b = cVar;
        this.f369027c = d12;
        this.f369028d = fVar;
    }

    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.g gVar, @Y61.k com.yandex.div2.O1 o12, @Y61.k C38029k c38029k) {
        com.yandex.div2.O1 div = gVar.getDiv();
        if (o12.equals(div)) {
            return;
        }
        q21.c dataTag = c38029k.getDataTag();
        com.yandex.div.core.view2.errors.d dVarA = this.f369028d.a(c38029k.getDivData(), dataTag);
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        gVar.g();
        gVar.setDiv$div_release(o12);
        C38006w c38006w = this.f369025a;
        if (div != null) {
            c38006w.h(c38029k, gVar, div);
        }
        c38006w.d(gVar, o12, div, c38029k);
        C37931a.c(gVar, c38029k, o12.f373098b, o12.f373100d, o12.f373117u, o12.f373111o, o12.f373099c);
        C37931a.D(gVar, expressionResolver, o12.f373104h);
        gVar.e(o12.f373085B.e(expressionResolver, new c(gVar)));
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = o12.f373108l;
        DivAlignmentHorizontal divAlignmentHorizontalA = bVar.a(expressionResolver);
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2 = o12.f373109m;
        gVar.setGravity(C37931a.r(divAlignmentHorizontalA, bVar2.a(expressionResolver)));
        B0 b02 = new B0(this, gVar, expressionResolver, bVar, bVar2);
        gVar.e(bVar.d(expressionResolver, b02));
        gVar.e(bVar2.d(expressionResolver, b02));
        gVar.e(o12.f373114r.e(expressionResolver, new d(gVar, c38029k, expressionResolver, o12, dVarA)));
    }
}
