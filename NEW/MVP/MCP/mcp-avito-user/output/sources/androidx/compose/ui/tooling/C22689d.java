package androidx.compose.ui.tooling;

import i.AbstractC41201a;
import kotlin.Metadata;

/* compiled from: ComposeViewAdapter.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/d;", "Landroidx/activity/result/k;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22689d implements androidx.view.result.k {

    /* renamed from: b, reason: collision with root package name */
    public final a f42811b = new a();

    /* compiled from: ComposeViewAdapter.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/tooling/d$a", "Landroidx/activity/result/j;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.d$a */
    public static final class a extends androidx.view.result.j {
        @Override // androidx.view.result.j
        public final void c(int i12, AbstractC41201a abstractC41201a, Object obj) {
            throw new IllegalStateException("Calling launch() is not supported in Preview");
        }
    }

    @Override // androidx.view.result.k
    public final androidx.view.result.j getActivityResultRegistry() {
        return this.f42811b;
    }
}
