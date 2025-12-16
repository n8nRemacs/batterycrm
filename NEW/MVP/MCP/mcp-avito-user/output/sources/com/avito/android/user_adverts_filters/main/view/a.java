package com.avito.android.user_adverts_filters.main.view;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.spinner.Spinner;
import i31.InterfaceC41220a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MainFiltersPlaceholderView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/view/a;", "", "a", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f316331a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f316332b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f316333c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Spinner f316334d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ContentPlaceholder f316335e;

    /* compiled from: MainFiltersPlaceholderView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/view/a$a;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_filters.main.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC9823a {
        @k
        a a(@k ViewGroup viewGroup, @k Y41.a<G0> aVar);
    }

    @i31.c
    public a(@InterfaceC41220a @k ViewGroup viewGroup, @InterfaceC41220a @k Y41.a<G0> aVar) {
        this.f316331a = viewGroup;
        this.f316332b = aVar;
        View viewB = C0.b(viewGroup, R.layout.user_adverts_filters_placeholder_overlay, viewGroup, false);
        this.f316333c = viewB;
        this.f316334d = (Spinner) viewB.findViewById(R.id.user_adverts_filters_progress_view);
        this.f316335e = (ContentPlaceholder) viewB.findViewById(R.id.user_adverts_filters_placeholder);
    }
}
