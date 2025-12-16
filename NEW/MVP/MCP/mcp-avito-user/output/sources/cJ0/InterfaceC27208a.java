package cj0;

import Y61.k;
import Y61.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProductsBottomSheetAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcj0/a;", "", "a", "b", "Lcj0/a$a;", "Lcj0/a$b;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cj0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC27208a {

    /* compiled from: RelatedProductsBottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/a$a;", "Lcj0/a;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2058a implements InterfaceC27208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f58110a;

        public C2058a(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f58110a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2058a) && L.f(this.f58110a, ((C2058a) obj).f58110a);
        }

        public final int hashCode() {
            return this.f58110a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f58110a + ')';
        }
    }

    /* compiled from: RelatedProductsBottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/a$b;", "Lcj0/a;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.a$b */
    public static final /* data */ class b implements InterfaceC27208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC40048c f58111a;

        public b(@k AbstractC40048c abstractC40048c) {
            this.f58111a = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f58111a, ((b) obj).f58111a);
        }

        public final int hashCode() {
            return this.f58111a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f58111a + ')';
        }
    }
}
