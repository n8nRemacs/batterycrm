package ew0;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: PromoCodeViewState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lew0/g;", "", "a", "b", "Lew0/g$a;", "Lew0/g$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40173g {

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/g$a;", "Lew0/g;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.g$a */
    public static final /* data */ class a implements InterfaceC40173g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f395489a;

        public a(@k ArrayList arrayList) {
            this.f395489a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f395489a.equals(((a) obj).f395489a);
        }

        public final int hashCode() {
            return this.f395489a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Content(promoCodes="), this.f395489a, ')');
        }
    }

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lew0/g$b;", "Lew0/g;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.g$b */
    public static final /* data */ class b implements InterfaceC40173g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395490a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1605598797;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }
}
