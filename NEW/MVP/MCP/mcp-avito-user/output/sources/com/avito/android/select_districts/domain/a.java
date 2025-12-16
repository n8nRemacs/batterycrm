package com.avito.android.select_districts.domain;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SelectDistrictsSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/select_districts/domain/a;", "", "a", "b", "c", "Lcom/avito/android/select_districts/domain/a$a;", "Lcom/avito/android/select_districts/domain/a$b;", "Lcom/avito/android/select_districts/domain/a$c;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SelectDistrictsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/a$a;", "Lcom/avito/android/select_districts/domain/a;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select_districts.domain.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7962a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C7962a f266915a = new C7962a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C7962a);
        }

        public final int hashCode() {
            return -1308094648;
        }

        @Y61.k
        public final String toString() {
            return "SearchEmpty";
        }
    }

    /* compiled from: SelectDistrictsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/domain/a$b;", "Lcom/avito/android/select_districts/domain/a;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f266916a;

        public b(@Y61.k ArrayList arrayList) {
            this.f266916a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f266916a.equals(((b) obj).f266916a);
        }

        public final int hashCode() {
            return this.f266916a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("SearchItems(items="), this.f266916a, ')');
        }
    }

    /* compiled from: SelectDistrictsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/a$c;", "Lcom/avito/android/select_districts/domain/a;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f266917a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1296324790;
        }

        @Y61.k
        public final String toString() {
            return "SearchReset";
        }
    }
}
