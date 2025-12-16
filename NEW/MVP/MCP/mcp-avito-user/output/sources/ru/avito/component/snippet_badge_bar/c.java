package ru.avito.component.snippet_badge_bar;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SnippetBadgeBar.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/deprecated_design/badge_bar/CompactFlexibleLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class c extends N implements Y41.a<CompactFlexibleLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SnippetBadgeBar f430564l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SnippetBadgeBar snippetBadgeBar) {
        super(0);
        this.f430564l = snippetBadgeBar;
    }

    @Override // Y41.a
    public final CompactFlexibleLayout invoke() {
        View viewFindViewById = this.f430564l.findViewById(R.id.snippet_badge_bar_flexible_layout);
        if (viewFindViewById != null) {
            return (CompactFlexibleLayout) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout");
    }
}
