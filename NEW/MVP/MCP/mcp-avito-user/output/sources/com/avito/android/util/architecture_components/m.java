package com.avito.android.util.architecture_components;

import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: Lifecycles.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/lifecycle/Lifecycle$Event;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class m<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.Event f318816b;

    public m(Lifecycle.Event event) {
        this.f318816b = event;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((Lifecycle.Event) obj) == this.f318816b;
    }
}
