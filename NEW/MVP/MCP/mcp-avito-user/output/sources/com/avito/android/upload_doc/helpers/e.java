package com.avito.android.upload_doc.helpers;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.upload_doc.view.description.GigUploadDocDescriptionItem;
import com.avito.android.upload_doc.view.title.GigUploadDocTitleItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.Collections;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocScreenRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/helpers/e;", "", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final NavBar f306798a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f306799b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f306800c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f306801d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C42670a f306802e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<OG0.a, G0> f306803f;

    /* compiled from: GigUploadDocScreenRenderer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<ContentPlaceholder, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
            contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getText(R.string.gig_upload_error));
            contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getText(R.string.gig_upload_retry));
            contentPlaceholder2.setButtonOnClickListener(new d(e.this, 1));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k NavBar navBar, @k Button button, @k TextView textView, @k RecyclerView recyclerView, @k com.avito.konveyor.adapter.d dVar, @k C42670a c42670a, @k l<? super OG0.a, G0> lVar) {
        this.f306798a = navBar;
        this.f306799b = button;
        this.f306800c = recyclerView;
        this.f306801d = dVar;
        this.f306802e = c42670a;
        this.f306803f = lVar;
        Resources resources = textView.getContext().getResources();
        j.c(textView, new AttributedText("{{link}}", Collections.singletonList(new LinkAttribute("link", resources.getString(R.string.gig_upload_privacy_policy_title), resources.getString(R.string.gig_upload_privacy_policy_link), C42745f0.U(new FontParameter.ColorParameter(null, null, "gray54"), FontParameter.UnderlineParameter.INSTANCE))), 1), null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void a(@k OG0.d dVar) {
        RecyclerView recyclerView = this.f306800c;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.d dVar2 = this.f306801d;
        recyclerView.setAdapter(dVar2);
        Button button = this.f306799b;
        com.avito.android.lib.design.button.b.a(button, dVar.f12140f, false);
        button.setOnClickListener(new d(this, 0));
        NavBar navBar = this.f306798a;
        Drawable drawableH = C35835l0.h(R.attr.ic_callCenter24, navBar.getContext());
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new f(this), false, null, null, dVar.f12143i ? C42745f0.V(drawableH != null ? new a.C5289a(drawableH, null, null, 0, 0, 0, 62, null) : null) : null, new g(dVar, this), 29, null));
        C42670a c42670a = this.f306802e;
        if (dVar.f12145k) {
            c42670a.c(null, new a());
            return;
        }
        if (dVar.f12144j) {
            C42670a.d(c42670a);
            return;
        }
        c42670a.b();
        ArrayList arrayListE0 = C42745f0.e0(new GigUploadDocTitleItem(null, dVar.f12136b, 1, null));
        String str = dVar.f12137c;
        if (str != null) {
            arrayListE0.add(new GigUploadDocDescriptionItem(null, str, 1, null));
        }
        arrayListE0.addAll(dVar.f12138d);
        arrayListE0.addAll(dVar.f12139e);
        dVar2.l(arrayListE0, null);
        button.setEnabled(dVar.f12141g);
    }
}
