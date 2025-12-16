package com.avito.android.profile_settings;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.n2;

/* compiled from: ProfileSettingsStateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings/u;", "", "a", "_avito_profile-management_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface u {

    /* compiled from: ProfileSettingsStateProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/u$a;", "", "_avito_profile-management_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f228512a;

        public a(@Y61.k String str) {
            this.f228512a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f228512a, ((a) obj).f228512a);
        }

        public final int hashCode() {
            return this.f228512a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("State(settingsIdempotencyKey="), this.f228512a, ')');
        }
    }

    void a();

    @Y61.k
    n2<a> b();
}
