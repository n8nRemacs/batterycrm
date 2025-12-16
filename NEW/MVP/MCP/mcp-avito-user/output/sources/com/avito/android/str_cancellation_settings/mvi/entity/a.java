package com.avito.android.str_cancellation_settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsState.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/str_cancellation_settings/mvi/entity/a$b;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/a$c;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/a$d;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Y1, reason: collision with root package name */
    @k
    public static final C8674a f288482Y1 = C8674a.f288483a;

    /* compiled from: StrCancellationSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/a$a;", "", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_cancellation_settings.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C8674a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C8674a f288483a = new C8674a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f288484b = d.f288492b;
    }

    /* compiled from: StrCancellationSettingsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/a$b;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f288485b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f288486c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f288487d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f288488e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f288489f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f288490g;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k PrintableText printableText, @k PrintableText printableText2, boolean z12, boolean z13, @k List<? extends com.avito.conveyor_item.a> list, boolean z14) {
            this.f288485b = printableText;
            this.f288486c = printableText2;
            this.f288487d = z12;
            this.f288488e = z13;
            this.f288489f = list;
            this.f288490g = z14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f288485b, bVar.f288485b) && L.f(this.f288486c, bVar.f288486c) && this.f288487d == bVar.f288487d && this.f288488e == bVar.f288488e && L.f(this.f288489f, bVar.f288489f) && this.f288490g == bVar.f288490g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f288490g) + H.e(r.i(r.i(com.avito.android.actions_sheet.a.f(this.f288486c, this.f288485b.hashCode() * 31, 31), 31, this.f288487d), 31, this.f288488e), 31, this.f288489f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f288485b);
            sb2.append(", subtitle=");
            sb2.append(this.f288486c);
            sb2.append(", isApplyButtonEnabled=");
            sb2.append(this.f288487d);
            sb2.append(", isApplyButtonLoading=");
            sb2.append(this.f288488e);
            sb2.append(", listItems=");
            sb2.append(this.f288489f);
            sb2.append(", isApplyButtonVisible=");
            return r.x(sb2, this.f288490g, ')');
        }
    }

    /* compiled from: StrCancellationSettingsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/a$c;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/a;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f288491b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -73729372;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: StrCancellationSettingsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/a$d;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/a;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f288492b = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -318811432;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
