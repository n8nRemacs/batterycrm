package com.avito.android.component.user_hat;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfileKonveyor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/component/user_hat/e;", "", "a", "b", "c", "Lcom/avito/android/component/user_hat/e$a;", "Lcom/avito/android/component/user_hat/e$b;", "Lcom/avito/android/component/user_hat/e$c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e {

    /* compiled from: PassportProfileKonveyor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/e$a;", "Lcom/avito/android/component/user_hat/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f125304a;

        public a(boolean z12) {
            this.f125304a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f125304a == ((a) obj).f125304a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f125304a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Add(showOnboarding="), this.f125304a, ')');
        }
    }

    /* compiled from: PassportProfileKonveyor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/e$b;", "Lcom/avito/android/component/user_hat/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PassportParticularProfileItem f125305a;

        public b(@k PassportParticularProfileItem passportParticularProfileItem) {
            this.f125305a = passportParticularProfileItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f125305a, ((b) obj).f125305a);
        }

        public final int hashCode() {
            return this.f125305a.hashCode();
        }

        @k
        public final String toString() {
            return "ProfileClick(item=" + this.f125305a + ')';
        }
    }

    /* compiled from: PassportProfileKonveyor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/user_hat/e$c;", "Lcom/avito/android/component/user_hat/e;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f125306a = new c();
    }
}
