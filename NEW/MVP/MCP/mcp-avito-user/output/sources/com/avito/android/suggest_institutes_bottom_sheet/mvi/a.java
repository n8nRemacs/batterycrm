package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestInstitutesAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a;", "", "a", "b", "c", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a$a;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a$b;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a$c;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: SuggestInstitutesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a$a;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.suggest_institutes_bottom_sheet.mvi.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8852a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f292029a;

        public C8852a(@Y61.k String str) {
            this.f292029a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8852a) && L.f(this.f292029a, ((C8852a) obj).f292029a);
        }

        public final int hashCode() {
            return this.f292029a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChanged(text="), this.f292029a, ')');
        }
    }

    /* compiled from: SuggestInstitutesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a$b;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a;", "<init>", "()V", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f292030a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -42837434;
        }

        @Y61.k
        public final String toString() {
            return "OnClearClick";
        }
    }

    /* compiled from: SuggestInstitutesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a$c;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f292031a;

        public c(int i12) {
            this.f292031a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f292031a == ((c) obj).f292031a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f292031a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnItemClick(position="), this.f292031a, ')');
        }
    }
}
