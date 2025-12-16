package com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemsListSnippetView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/a;", "LTV0/e;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a extends TV0.e {

    /* compiled from: ItemsListSnippetView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5742a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<DockingBadgeItem> f194001a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DockingBadgeSize f194002b;

        public C5742a(@k List<DockingBadgeItem> list, @k DockingBadgeSize dockingBadgeSize) {
            this.f194001a = list;
            this.f194002b = dockingBadgeSize;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5742a)) {
                return false;
            }
            C5742a c5742a = (C5742a) obj;
            return L.f(this.f194001a, c5742a.f194001a) && this.f194002b == c5742a.f194002b;
        }

        public final int hashCode() {
            return this.f194002b.hashCode() + (this.f194001a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "BadgeParams(items=" + this.f194001a + ", containerSize=" + this.f194002b + ')';
        }
    }

    /* compiled from: ItemsListSnippetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void V(@l String str);

    void a(@k Y41.a<G0> aVar);

    void p(@k String str);

    void setTitle(@k String str);

    void wI(boolean z12);

    void z2(@l Image image);
}
