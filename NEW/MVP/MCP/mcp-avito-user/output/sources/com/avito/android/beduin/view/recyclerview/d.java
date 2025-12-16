package com.avito.android.beduin.view.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.view.recyclerview.g;
import com.avito.android.beduin_shared.model.action.custom.BeduinScrollPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScrollHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f105199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f105200m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin_shared.model.action.custom.e f105201n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RecyclerView recyclerView, int i12, com.avito.android.beduin_shared.model.action.custom.e eVar) {
        super(0);
        this.f105199l = recyclerView;
        this.f105200m = i12;
        this.f105201n = eVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        RecyclerView recyclerView = this.f105199l;
        RecyclerView.C cP2 = recyclerView.P(this.f105200m);
        View view = cP2 != null ? cP2.itemView : null;
        if (view != null) {
            g.a aVar = g.f105210r;
            BeduinScrollPosition beduinScrollPosition = this.f105201n.f105291d;
            int top = view.getTop();
            int bottom = view.getBottom();
            int paddingTop = recyclerView.getPaddingTop();
            int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
            aVar.getClass();
            recyclerView.scrollBy(0, -g.a.a(beduinScrollPosition, top, bottom, paddingTop, measuredHeight));
        }
        return Boolean.FALSE;
    }
}
