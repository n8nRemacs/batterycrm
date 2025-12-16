package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootStatusPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/y;", "", "a", "b", "c", "Lcom/avito/android/mortgage/root/list/payloads/y$a;", "Lcom/avito/android/mortgage/root/list/payloads/y$b;", "Lcom/avito/android/mortgage/root/list/payloads/y$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface y {

    /* compiled from: MortgageRootStatusPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/y$a;", "Lcom/avito/android/mortgage/root/list/payloads/y;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Image f202927a;

        public a(@Y61.k Image image) {
            this.f202927a = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f202927a, ((a) obj).f202927a);
        }

        public final int hashCode() {
            return this.f202927a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.o(new StringBuilder("ImageChanged(image="), this.f202927a, ')');
        }
    }

    /* compiled from: MortgageRootStatusPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/y$b;", "Lcom/avito/android/mortgage/root/list/payloads/y;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f202928a;

        public b(@Y61.k AttributedText attributedText) {
            this.f202928a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f202928a, ((b) obj).f202928a);
        }

        public final int hashCode() {
            return this.f202928a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("SubtitleChanged(subtitle="), this.f202928a, ')');
        }
    }

    /* compiled from: MortgageRootStatusPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/y$c;", "Lcom/avito/android/mortgage/root/list/payloads/y;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f202929a;

        public c(@Y61.k AttributedText attributedText) {
            this.f202929a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f202929a, ((c) obj).f202929a);
        }

        public final int hashCode() {
            return this.f202929a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("TitleChanged(title="), this.f202929a, ')');
        }
    }
}
