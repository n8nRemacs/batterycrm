package com.avito.android.profile_settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/profile_settings/mvi/entity/a$a;", "Lcom/avito/android/profile_settings/mvi/entity/a$b;", "Lcom/avito/android/profile_settings/mvi/entity/a$c;", "Lcom/avito/android/profile_settings/mvi/entity/a$d;", "Lcom/avito/android/profile_settings/mvi/entity/a$e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/a$a;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6948a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ProfileSettingsState.Data f228475a;

        public C6948a(@k ProfileSettingsState.Data data) {
            this.f228475a = data;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6948a) && L.f(this.f228475a, ((C6948a) obj).f228475a);
        }

        public final int hashCode() {
            return this.f228475a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f228475a + ')';
        }
    }

    /* compiled from: ProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/a$b;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f228476a;

        public b(@k ApiException apiException) {
            this.f228476a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f228476a.equals(((b) obj).f228476a);
        }

        public final int hashCode() {
            return this.f228476a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("Error(throwable="), this.f228476a, ')');
        }
    }

    /* compiled from: ProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/a$c;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f228477a = new c();

        @k
        public final String toString() {
            return "LeaveScreen - internal";
        }
    }

    /* compiled from: ProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/a$d;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f228478a = new d();

        @k
        public final String toString() {
            return "Loading - internal";
        }
    }

    /* compiled from: ProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/mvi/entity/a$e;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f228479a;

        public e(int i12) {
            this.f228479a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f228479a == ((e) obj).f228479a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f228479a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("TabUpdate(tabIndex="), this.f228479a, ')');
        }
    }
}
