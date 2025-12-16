package com.avito.android.webview;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.L5;
import com.avito.android.util.P5;
import com.avito.android.util.V2;
import java.io.Serializable;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/D;", "Lcom/avito/android/webview/x;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f329511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f329512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f329513c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Toolbar f329514d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final WebViewWithScrollListener f329515e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public h f329516f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C42670a f329517g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final WU.a f329518h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final WU.a f329519i;

    /* compiled from: WebViewView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<ContentPlaceholder, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
            D d12 = D.this;
            contentPlaceholder2.setState(d12.f329513c.c() ? d12.f329519i : d12.f329518h);
            return G0.f406611a;
        }
    }

    public D(@Y61.k ViewGroup viewGroup, @Y61.k p pVar, @Y61.k j jVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f329511a = pVar;
        this.f329512b = jVar;
        this.f329513c = aVar;
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        this.f329514d = toolbar;
        View viewFindViewById = viewGroup.findViewById(R.id.web_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.webview.WebViewWithScrollListener");
        }
        WebViewWithScrollListener webViewWithScrollListener = (WebViewWithScrollListener) viewFindViewById;
        this.f329515e = webViewWithScrollListener;
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.webview_content_placeholder_button_title, new Serializable[0]);
        this.f329518h = new WU.a(Integer.valueOf(R.drawable.placeholders_img_no_internet_error), com.avito.android.printable_text.b.c(R.string.webview_no_internet_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.webview_no_internet_error_subtitle, new Serializable[0]), printableTextC, null, 16, null);
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.webview_content_placeholder_button_title, new Serializable[0]);
        this.f329519i = new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.webview_unknown_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.webview_unknown_error_subtitle, new Serializable[0]), printableTextC2, null, 16, null);
        View viewFindViewById2 = viewGroup.findViewById(R.id.content_holder);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        C42670a c42670a = new C42670a(viewGroup2, new B(this), 0, 4, null);
        this.f329517g = c42670a;
        final int i12 = 0;
        c42670a.a(new View.OnClickListener(this) { // from class: com.avito.android.webview.z

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ D f329685c;

            {
                this.f329685c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f329685c.f329511a.j0();
                        break;
                    default:
                        this.f329685c.f329511a.a();
                        break;
                }
            }
        });
        if (toolbar != null) {
            if (pVar.d()) {
                toolbar.setVisibility(8);
            } else {
                P5.d(toolbar);
                final int i13 = 1;
                toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.webview.z

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ D f329685c;

                    {
                        this.f329685c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.f329685c.f329511a.j0();
                                break;
                            default:
                                this.f329685c.f329511a.a();
                                break;
                        }
                    }
                });
            }
        }
        webViewWithScrollListener.getSettings().setJavaScriptEnabled(true);
        webViewWithScrollListener.getSettings().setDomStorageEnabled(true);
        webViewWithScrollListener.setDownloadListener(new DownloadListener() { // from class: com.avito.android.webview.A
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j12) {
                j jVar2 = this.f329506a.f329512b;
                try {
                    jVar2.b(str, str3, str4);
                } catch (RuntimeException e12) {
                    V2.f318762a.f(e12);
                    L5.a(jVar2.f329633a, R.string.webview_file_download_unsuccessful, 0);
                }
            }
        });
        if (!pVar.g()) {
            webViewWithScrollListener.setOnLongClickListener(new com.avito.android.messenger.channels.adapter.konveyor.channel.l(1));
            webViewWithScrollListener.setLongClickable(false);
        }
        com.avito.android.lib.util.i.k(com.avito.android.lib.util.i.f181373a, viewGroup, new C(viewGroup, viewGroup2, this));
    }

    public final void a(@Y61.l final Y41.l<? super String, G0> lVar) {
        WebViewWithScrollListener webViewWithScrollListener = this.f329515e;
        if (lVar == null) {
            webViewWithScrollListener.f329534b.clear();
        } else {
            webViewWithScrollListener.f329534b.add(new l41.i() { // from class: com.avito.android.webview.y
                @Override // l41.i
                public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Integer) obj).intValue();
                    int iIntValue = ((Integer) obj2).intValue();
                    ((Integer) obj3).intValue();
                    ((Integer) obj4).intValue();
                    D d12 = this.f329682a;
                    h hVar = d12.f329516f;
                    if (hVar != null) {
                        hVar.f329631g = iIntValue;
                    }
                    lVar.invoke(d12.f329515e.getUrl());
                    return G0.f406611a;
                }
            });
        }
    }

    public final void b() {
        this.f329517g.c(Integer.valueOf(R.style.Theme_DesignSystem_Re23), new a());
    }
}
