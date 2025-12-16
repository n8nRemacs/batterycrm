package com.avito.android.messenger.channels.adapter.konveyor.common.swipable;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: SwipableItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/rambler/libs/swipe_layout/SwipeLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<SwipeLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f186925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(0);
        this.f186925l = view;
    }

    @Override // Y41.a
    public final SwipeLayout invoke() {
        return (SwipeLayout) this.f186925l.findViewById(R.id.swipe_layout);
    }
}
