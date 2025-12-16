package com.avito.android.ai_assistant.adapter.simple_snippet;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SimpleSnippetBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/simple_snippet/a;", "LTV0/b;", "Lcom/avito/android/ai_assistant/adapter/simple_snippet/g;", "Lcom/avito/android/ai_assistant/adapter/simple_snippet/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<g, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f88871a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f88872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f88873c = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f88874d = new g.a<>(R.layout.ai_assistant_simple_snippet, new C2622a());

    /* compiled from: SimpleSnippetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/ai_assistant/adapter/simple_snippet/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/ai_assistant/adapter/simple_snippet/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.ai_assistant.adapter.simple_snippet.a$a, reason: collision with other inner class name */
    public static final class C2622a extends N implements p<ViewGroup, View, g> {
        public C2622a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new g(aVar.f88871a, aVar.f88872b, view);
        }
    }

    @Inject
    public a(@k e eVar, @k com.avito.android.util.text.a aVar) {
        this.f88871a = eVar;
        this.f88872b = aVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<g, c> a() {
        return this.f88873c;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f88874d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
