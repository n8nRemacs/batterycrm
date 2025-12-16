package ru.avito.component.serp.job;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.AdvertAction;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SerpAdvertRichJobActionButtonsRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f430460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f430461b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final JobSnippetContactButtonType f430462c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<AdvertAction> f430463d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f430464e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Button f430465f;

    public a(@Y61.k LayoutInflater layoutInflater, @Y61.k LinearLayout linearLayout, @Y61.k JobSnippetContactButtonType jobSnippetContactButtonType) {
        this.f430460a = layoutInflater;
        this.f430461b = linearLayout;
        this.f430462c = jobSnippetContactButtonType;
        com.jakewharton.rxrelay3.c<AdvertAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f430463d = cVar;
        this.f430464e = new C41981q0(cVar);
    }
}
