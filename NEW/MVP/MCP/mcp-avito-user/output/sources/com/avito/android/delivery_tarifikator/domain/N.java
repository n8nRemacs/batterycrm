package com.avito.android.delivery_tarifikator.domain;

import Ov.C14739b;
import kotlin.Metadata;

/* compiled from: TariffEditorResultParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/N;", "", "a", "b", "c", "d", "Lcom/avito/android/delivery_tarifikator/domain/N$a;", "Lcom/avito/android/delivery_tarifikator/domain/N$b;", "Lcom/avito/android/delivery_tarifikator/domain/N$c;", "Lcom/avito/android/delivery_tarifikator/domain/N$d;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface N {

    /* compiled from: TariffEditorResultParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/N$a;", "Lcom/avito/android/delivery_tarifikator/domain/N;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f135249a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1827268694;
        }

        @Y61.k
        public final String toString() {
            return "Closed";
        }
    }

    /* compiled from: TariffEditorResultParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/N$b;", "Lcom/avito/android/delivery_tarifikator/domain/N;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f135250a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 76146850;
        }

        @Y61.k
        public final String toString() {
            return "ParsingError";
        }
    }

    /* compiled from: TariffEditorResultParser.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/N$c;", "Lcom/avito/android/delivery_tarifikator/domain/N;", "tariff", "LOv/b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C14739b f135251a;

        private /* synthetic */ c(C14739b c14739b) {
            this.f135251a = c14739b;
        }

        public static final /* synthetic */ c a(C14739b c14739b) {
            return new c(c14739b);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return kotlin.jvm.internal.L.f(this.f135251a, ((c) obj).f135251a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f135251a.hashCode();
        }

        public final String toString() {
            return "TariffCreated(tariff=" + this.f135251a + ')';
        }
    }

    /* compiled from: TariffEditorResultParser.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/N$d;", "Lcom/avito/android/delivery_tarifikator/domain/N;", "tariff", "LOv/b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C14739b f135252a;

        private /* synthetic */ d(C14739b c14739b) {
            this.f135252a = c14739b;
        }

        public static final /* synthetic */ d a(C14739b c14739b) {
            return new d(c14739b);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return kotlin.jvm.internal.L.f(this.f135252a, ((d) obj).f135252a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f135252a.hashCode();
        }

        public final String toString() {
            return "TariffUpdated(tariff=" + this.f135252a + ')';
        }
    }
}
