package com.avito.android.send_esia_data_screen.ui;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.review_gallery.g;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SendEsiaDataRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/send_esia_data_screen/ui/f;", "", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f268300a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f268301b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ContentPlaceholder f268302c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<LinearLayout> f268303d;

    /* compiled from: SendEsiaDataRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f268300a.invoke();
            return G0.f406611a;
        }
    }

    public f(@k Y41.a aVar, @k Y41.a aVar2, @k View view) {
        this.f268300a = aVar;
        this.f268301b = aVar2;
        NavBar navBar = (NavBar) view.findViewById(R.id.send_esia_data_navbar);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.send_esia_data_loading);
        ContentPlaceholder contentPlaceholder = (ContentPlaceholder) view.findViewById(R.id.send_esia_data_error);
        this.f268302c = contentPlaceholder;
        this.f268303d = Collections.singletonList(linearLayout);
        navBar.c(R.attr.ic_close24, new a());
        contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.end_esia_data_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.end_esia_data_error_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.end_esia_data_refresh, new Serializable[0]), new g(this, 21)));
    }
}
