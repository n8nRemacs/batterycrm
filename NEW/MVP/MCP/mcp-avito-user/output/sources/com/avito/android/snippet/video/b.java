package com.avito.android.snippet.video;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.snippet.video.p;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.video_snippets.g;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import io.reactivex.rxjava3.internal.operators.observable.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: SnippetVideoComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/snippet/video/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/snippet/video/p;", "Landroid/view/ViewGroup;", "a", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC36333c<p, ViewGroup> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final m f283998m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public String f283999n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public com.avito.android.bx_beduin_native_items.a f284000o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f284001p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f284002q;

    /* compiled from: SnippetVideoComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/snippet/video/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(@Y61.k m mVar) {
        super(null, 1, null);
        this.f283998m = mVar;
        this.f284001p = new com.jakewharton.rxrelay3.c<>();
        this.f284002q = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, p pVar) {
        ViewGroup viewGroup = (ViewGroup) view;
        p pVar2 = pVar;
        u();
        p.a aVar = pVar2.f284030c;
        if (aVar == null) {
            this.f284000o = null;
            D6.w(viewGroup);
            return;
        }
        D6.G(viewGroup, true);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewGroup.findViewById(R.id.thumbnail_view);
        D6.G(simpleDraweeView, true);
        StyledPlayerView styledPlayerView = (StyledPlayerView) viewGroup.findViewById(R.id.player_view);
        g.c cVar = new g.c(pVar2.f284031d, aVar.f284033a, -1, styledPlayerView, 0.0f, null, 0.0f, 0, simpleDraweeView, null, 736, null);
        String str = pVar2.f284031d;
        this.f283999n = str;
        l41.r rVar = c.f284003b;
        com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar2 = this.f284001p;
        W wN2 = cVar2.N(rVar);
        d dVar = new d(this, str);
        l41.g<? super Throwable> gVar = e.f284006b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = wN2.v0(dVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar3 = this.f284002q;
        cVar3.b(dVarV0);
        cVar3.b(cVar2.N(f.f284007b).v0(new g(this, str), h.f284010b, interfaceC43543a));
        cVar3.b(cVar2.N(i.f284011b).v0(new j(this, str), k.f284014b, interfaceC43543a));
        com.avito.android.image_loader.d dVarA = new com.avito.android.image_loader.e().a(simpleDraweeView.getContext());
        Context context = simpleDraweeView.getContext();
        com.avito.android.image_loader.a aVar2 = aVar.f284034b;
        Drawable drawableA = d.a.a(dVarA, context, aVar2, null, null, 28);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar2);
        aVarA.f169501s = drawableA;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
        m mVar = this.f283998m;
        mVar.f284023g.put(str, cVar);
        String str2 = cVar.f326088b;
        com.avito.android.video_snippets.g gVar2 = mVar.f284017a;
        gVar2.a(str2);
        gVar2.b(str, true, simpleDraweeView, cVar2);
        this.f284000o = new com.avito.android.bx_beduin_native_items.a(pVar2, viewGroup);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return (ViewGroup) C0.b(viewGroup, R.layout.constructor_advert_video_page, viewGroup, false);
    }

    public final void u() {
        String str = this.f283999n;
        if (str != null) {
            m mVar = this.f283998m;
            mVar.f284023g.remove(str);
            if (((g.c) mVar.f284024h.remove(str)) != null) {
                mVar.i();
            }
            mVar.f284017a.c(str);
            this.f284002q.e();
            this.f283999n = null;
            this.f284000o = null;
        }
    }
}
