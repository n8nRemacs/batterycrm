package com.avito.beduin.v2.interaction.scroll_to.api;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import dU0.InterfaceC39628a;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: ScrollToPositionInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/scroll_to/api/ScrollToPositionInteraction;", "LdU0/a;", "Alignment", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrollToPositionInteraction implements InterfaceC39628a {

    /* renamed from: a, reason: collision with root package name */
    public final int f337817a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f337818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Alignment f337819c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC40338a f337820d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScrollToPositionInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/scroll_to/api/ScrollToPositionInteraction$Alignment;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        /* renamed from: c, reason: collision with root package name */
        public static final Alignment f337821c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f337822d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f337823e;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f337824b;

        static {
            Alignment alignment = new Alignment("START", 0, "start");
            f337821c = alignment;
            Alignment[] alignmentArr = {alignment, new Alignment("END", 1, "end"), new Alignment("CENTER", 2, "center")};
            f337822d = alignmentArr;
            f337823e = c.a(alignmentArr);
        }

        public Alignment(String str, int i12, String str2) {
            this.f337824b = str2;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f337822d.clone();
        }
    }

    public ScrollToPositionInteraction(int i12, boolean z12, @k Alignment alignment, @k AbstractC40338a abstractC40338a) {
        this.f337817a = i12;
        this.f337818b = z12;
        this.f337819c = alignment;
        this.f337820d = abstractC40338a;
    }

    @Override // dU0.InterfaceC39628a
    @k
    /* renamed from: a, reason: from getter */
    public final AbstractC40338a getF337820d() {
        return this.f337820d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollToPositionInteraction)) {
            return false;
        }
        ScrollToPositionInteraction scrollToPositionInteraction = (ScrollToPositionInteraction) obj;
        return this.f337817a == scrollToPositionInteraction.f337817a && this.f337818b == scrollToPositionInteraction.f337818b && this.f337819c == scrollToPositionInteraction.f337819c && L.f(this.f337820d, scrollToPositionInteraction.f337820d);
    }

    public final int hashCode() {
        return this.f337820d.hashCode() + ((this.f337819c.hashCode() + r.i(Integer.hashCode(this.f337817a) * 31, 31, this.f337818b)) * 31);
    }

    @k
    public final String toString() {
        return "ScrollToPositionInteraction(position=" + this.f337817a + ", animate=" + this.f337818b + ", alignment=" + this.f337819c + ", receiver=" + this.f337820d + ')';
    }
}
