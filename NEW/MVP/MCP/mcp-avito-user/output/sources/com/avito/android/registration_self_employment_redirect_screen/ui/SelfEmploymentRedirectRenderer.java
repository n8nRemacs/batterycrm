package com.avito.android.registration_self_employment_redirect_screen.ui;

import Xi0.C17014a;
import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.registration_self_employment_redirect_screen.models.ButtonAction;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SelfEmploymentRedirectRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/ui/SelfEmploymentRedirectRenderer;", "", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UdfComponentUsage"})
/* loaded from: classes16.dex */
public final class SelfEmploymentRedirectRenderer {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConstraintLayout f252797a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f252798b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<ButtonAction, G0> f252799c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f252800d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f252801e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C17014a f252802f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final NavBar f252803g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ScrollView f252804h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f252805i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f252806j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Spinner f252807k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ContentPlaceholder f252808l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ArrayList f252809m;

    /* compiled from: SelfEmploymentRedirectRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ButtonAction.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonAction.Type type = ButtonAction.Type.f252737b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelfEmploymentRedirectRenderer(@k ConstraintLayout constraintLayout, @k com.avito.konveyor.adapter.d dVar, @k l<? super ButtonAction, G0> lVar, @k Y41.a<G0> aVar, @k l<? super DeepLink, G0> lVar2, @k C17014a c17014a) {
        this.f252797a = constraintLayout;
        this.f252798b = dVar;
        this.f252799c = lVar;
        this.f252800d = aVar;
        this.f252801e = lVar2;
        this.f252802f = c17014a;
        this.f252803g = (NavBar) constraintLayout.findViewById(R.id.self_employment_navbar);
        ScrollView scrollView = (ScrollView) constraintLayout.findViewById(R.id.self_employment_scroll_content);
        this.f252804h = scrollView;
        this.f252805i = (TextView) constraintLayout.findViewById(R.id.self_employment_title);
        this.f252806j = (TextView) constraintLayout.findViewById(R.id.self_employment_description);
        RecyclerView recyclerView = (RecyclerView) constraintLayout.findViewById(R.id.self_employment_steps);
        this.f252807k = (Spinner) constraintLayout.findViewById(R.id.self_employment_loading);
        ContentPlaceholder contentPlaceholder = (ContentPlaceholder) constraintLayout.findViewById(R.id.self_employment_error);
        this.f252808l = contentPlaceholder;
        this.f252809m = C42745f0.e0(scrollView);
        C42784z0 c42784z0 = C42784z0.f406748b;
        contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.self_employment_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.self_employment_error_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.self_employment_refresh, new Serializable[0]), new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 27)));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new SelfEmploymentRedirectRenderer$2$1());
        recyclerView.setAdapter(dVar);
    }
}
