package com.avito.android.gig_snippet;

import Y41.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetListItem;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetTimer;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GigSingleSnippetWidget.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gig_snippet/GigSingleSnippetWidget;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Lkotlin/G0;", "onFinishListener", "setOnTimerFinishListener", "(LY41/a;)V", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSingleSnippetWidget extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f160989b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f160990c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l<? super DeepLink, G0> f160991d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f160992e;

    @X41.j
    public GigSingleSnippetWidget(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l Date date, @Y61.l Date date2, boolean z12) {
        GigShiftSnippetTimer gigShiftSnippetTimer = null;
        if (z12) {
            Long lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
            if (lValueOf != null && lValueOf.longValue() > System.currentTimeMillis()) {
                gigShiftSnippetTimer = new GigShiftSnippetTimer(R.attr.black, lValueOf.longValue(), getContext().getString(R.string.job_gig_snippet_public_timer_until_finish), "", true);
            }
        } else if (date != null) {
            long time = date.getTime();
            gigShiftSnippetTimer = time >= System.currentTimeMillis() ? new GigShiftSnippetTimer(R.attr.black, time, getContext().getString(R.string.job_gig_snippet_public_timer_until_start), "", true) : new GigShiftSnippetTimer(R.attr.red600, time, getContext().getString(R.string.job_gig_snippet_public_timer_after_start), "", false);
        }
        com.avito.konveyor.util.a.a(this.f160990c, Collections.singletonList(new GigShiftSnippetListItem(UUID.randomUUID().toString(), str, new EmptyDeepLink(), str2, gigShiftSnippetTimer, str4, str5, str3, null, null, null, false, true, true)));
        RecyclerView.Adapter adapter = this.f160989b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setOnTimerFinishListener(@Y61.k Y41.a<G0> onFinishListener) {
        this.f160992e = onFinishListener;
    }

    public GigSingleSnippetWidget(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f160991d = e.f161004l;
        View.inflate(context, R.layout.gig_single_snippet_widget_layout, this);
        View viewFindViewById = findViewById(R.id.gig_snippet_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f160989b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        com.avito.android.gig_snippet.list.snippet.a aVar = new com.avito.android.gig_snippet.list.snippet.a(new com.avito.android.gig_snippet.list.snippet.g(new d(this), new b(this), new c(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f160990c = hVar;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
    }
}
