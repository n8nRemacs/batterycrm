package cj0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import dU0.InterfaceC39628a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcj0/b;", "", "a", "b", "c", "d", "e", "f", "Lcj0/b$d;", "Lcj0/b$e;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cj0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC27209b {

    /* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/b$a;", "Lcj0/b$d;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.b$a */
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f58112a;

        public a(@k String str) {
            this.f58112a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f58112a, ((a) obj).f58112a);
        }

        public final int hashCode() {
            return this.f58112a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleBeduinState(content="), this.f58112a, ')');
        }
    }

    /* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/b$b;", "Lcj0/b$e;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2059b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC39628a f58113a;

        public C2059b(@k InterfaceC39628a interfaceC39628a) {
            this.f58113a = interfaceC39628a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2059b) && L.f(this.f58113a, ((C2059b) obj).f58113a);
        }

        public final int hashCode() {
            return this.f58113a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleComponentInteraction(componentInteraction=" + this.f58113a + ')';
        }
    }

    /* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/b$c;", "Lcj0/b$e;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.b$c */
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final dU0.b f58114a;

        public c(@k dU0.b bVar) {
            this.f58114a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f58114a, ((c) obj).f58114a);
        }

        public final int hashCode() {
            return this.f58114a.hashCode();
        }

        @k
        public final String toString() {
            return "HandlePlatformInteraction(platformInteraction=" + this.f58114a + ')';
        }
    }

    /* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcj0/b$d;", "Lcj0/b;", "Lcj0/b$a;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.b$d */
    public interface d extends InterfaceC27209b {
    }

    /* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcj0/b$e;", "Lcj0/b;", "Lcj0/b$b;", "Lcj0/b$c;", "Lcj0/b$f;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.b$e */
    public interface e extends InterfaceC27209b {
    }

    /* compiled from: RelatedProductsBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/b$f;", "Lcj0/b$e;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.b$f */
    public static final /* data */ class f implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent.ShowToastBar f58115a;

        public f(@k BeduinOneTimeEvent.ShowToastBar showToastBar) {
            this.f58115a = showToastBar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f58115a, ((f) obj).f58115a);
        }

        public final int hashCode() {
            return this.f58115a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToastBar(rawEvent=" + this.f58115a + ')';
        }
    }
}
