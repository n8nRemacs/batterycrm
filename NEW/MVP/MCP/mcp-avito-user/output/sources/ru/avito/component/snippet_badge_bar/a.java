package ru.avito.component.snippet_badge_bar;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SnippetBadge.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/component/snippet_badge_bar/a;", "", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f430555a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C12401a f430556b;

    public a(@k String str, @k C12401a c12401a) {
        this.f430555a = str;
        this.f430556b = c12401a;
    }

    /* compiled from: SnippetBadge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/snippet_badge_bar/a$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.component.snippet_badge_bar.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12401a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final UniversalColor f430557a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UniversalColor f430558b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalImage f430559c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DockingBadgeEdgeType f430560d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DockingBadgeEdgeType f430561e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DockingBadgeSize f430562f;

        public C12401a(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalImage universalImage, @l DockingBadgeEdgeType dockingBadgeEdgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType2, @l DockingBadgeSize dockingBadgeSize) {
            this.f430557a = universalColor;
            this.f430558b = universalColor2;
            this.f430559c = universalImage;
            this.f430560d = dockingBadgeEdgeType;
            this.f430561e = dockingBadgeEdgeType2;
            this.f430562f = dockingBadgeSize;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12401a)) {
                return false;
            }
            C12401a c12401a = (C12401a) obj;
            return L.f(this.f430557a, c12401a.f430557a) && L.f(this.f430558b, c12401a.f430558b) && L.f(this.f430559c, c12401a.f430559c) && this.f430560d == c12401a.f430560d && this.f430561e == c12401a.f430561e && this.f430562f == c12401a.f430562f;
        }

        public final int hashCode() {
            UniversalColor universalColor = this.f430557a;
            int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
            UniversalColor universalColor2 = this.f430558b;
            int iHashCode2 = (iHashCode + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
            UniversalImage universalImage = this.f430559c;
            int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            DockingBadgeEdgeType dockingBadgeEdgeType = this.f430560d;
            int iHashCode4 = (iHashCode3 + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31;
            DockingBadgeEdgeType dockingBadgeEdgeType2 = this.f430561e;
            int iHashCode5 = (iHashCode4 + (dockingBadgeEdgeType2 == null ? 0 : dockingBadgeEdgeType2.hashCode())) * 31;
            DockingBadgeSize dockingBadgeSize = this.f430562f;
            return iHashCode5 + (dockingBadgeSize != null ? dockingBadgeSize.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Style(backgroundColor=" + this.f430557a + ", fontColor=" + this.f430558b + ", icon=" + this.f430559c + ", leftEdgeStyle=" + this.f430560d + ", rightEdgeStyle=" + this.f430561e + ", size=" + this.f430562f + ')';
        }

        public /* synthetic */ C12401a(UniversalColor universalColor, UniversalColor universalColor2, UniversalImage universalImage, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, DockingBadgeSize dockingBadgeSize, int i12, C42822w c42822w) {
            this(universalColor, universalColor2, (i12 & 4) != 0 ? null : universalImage, (i12 & 8) != 0 ? null : dockingBadgeEdgeType, (i12 & 16) != 0 ? null : dockingBadgeEdgeType2, (i12 & 32) != 0 ? null : dockingBadgeSize);
        }
    }
}
