package com.avito.android.guests_selector;

import Ju.InterfaceC14249c;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorDeepLinkResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/guests_selector/b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/guests_selector/b$a;", "Lcom/avito/android/guests_selector/b$b;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b extends InterfaceC14249c.b {

    /* compiled from: GuestsSelectorDeepLinkResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/b$a;", "Lcom/avito/android/guests_selector/b;", "<init>", "()V", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f161390b = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -527150379;
        }

        @Y61.k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: GuestsSelectorDeepLinkResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/b$b;", "Lcom/avito/android/guests_selector/b;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.guests_selector.b$b, reason: collision with other inner class name */
    public static final /* data */ class C4726b implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GuestsSelectorOutput f161391b;

        public C4726b(@Y61.k GuestsSelectorOutput guestsSelectorOutput) {
            this.f161391b = guestsSelectorOutput;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4726b) && L.f(this.f161391b, ((C4726b) obj).f161391b);
        }

        public final int hashCode() {
            return this.f161391b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SuccessWithData(data=" + this.f161391b + ')';
        }
    }
}
