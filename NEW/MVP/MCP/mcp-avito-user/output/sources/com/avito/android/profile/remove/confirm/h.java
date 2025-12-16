package com.avito.android.profile.remove.confirm;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.profile_removal.ProfileRemoveResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileRemoveConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h;", "", "b", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface h {

    /* compiled from: ProfileRemoveConfirmInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ProfileRemoveConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/profile/remove/confirm/h$b$a;", "Lcom/avito/android/profile/remove/confirm/h$b$b;", "Lcom/avito/android/profile/remove/confirm/h$b$c;", "Lcom/avito/android/profile/remove/confirm/h$b$d;", "Lcom/avito/android/profile/remove/confirm/h$b$e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ProfileRemoveConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b$a;", "Lcom/avito/android/profile/remove/confirm/h$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f223844a;

            public a(@Y61.k String str) {
                this.f223844a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f223844a, ((a) obj).f223844a);
            }

            public final int hashCode() {
                return this.f223844a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f223844a, ')');
            }
        }

        /* compiled from: ProfileRemoveConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b$b;", "Lcom/avito/android/profile/remove/confirm/h$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.remove.confirm.h$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6776b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ProfileRemoveResult.IncorrectData f223845a;

            public C6776b(@Y61.k ProfileRemoveResult.IncorrectData incorrectData) {
                this.f223845a = incorrectData;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6776b) && L.f(this.f223845a, ((C6776b) obj).f223845a);
            }

            public final int hashCode() {
                return this.f223845a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "IncorrectData(data=" + this.f223845a + ')';
            }
        }

        /* compiled from: ProfileRemoveConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b$c;", "Lcom/avito/android/profile/remove/confirm/h$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f223846a = new c();
        }

        /* compiled from: ProfileRemoveConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b$d;", "Lcom/avito/android/profile/remove/confirm/h$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f223847a = new d();
        }

        /* compiled from: ProfileRemoveConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b$e;", "Lcom/avito/android/profile/remove/confirm/h$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f223848a = new e();
        }
    }

    @Y61.k
    InterfaceC43160i<b> a(@Y61.l String str);
}
