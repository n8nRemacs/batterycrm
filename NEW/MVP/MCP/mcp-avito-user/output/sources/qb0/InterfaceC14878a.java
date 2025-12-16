package Qb0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"LQb0/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/profile_settings_basic/mvi/entity/BasicInfoAvatarAction;", "LQb0/a$b;", "LQb0/a$c;", "LQb0/a$d;", "LQb0/a$e;", "LQb0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14878a {

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/a$a;", "LQb0/e;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.a$a, reason: collision with other inner class name */
    public static final class C0913a implements Qb0.e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0913a f13863b = new C0913a();
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/a$b;", "LQb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.a$b */
    public static final /* data */ class b implements InterfaceC14878a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f13864b;

        public b(@k Uri uri) {
            this.f13864b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f13864b, ((b) obj).f13864b);
        }

        public final int hashCode() {
            return this.f13864b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("AvatarSelected(uri="), this.f13864b, ')');
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/a$c;", "LQb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.a$c */
    public static final /* data */ class c implements InterfaceC14878a {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f13865b;

        public c(@l String str) {
            this.f13865b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13865b, ((c) obj).f13865b);
        }

        public final int hashCode() {
            String str = this.f13865b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleMessage(message="), this.f13865b, ')');
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/a$d;", "LQb0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.a$d */
    public static final class d implements InterfaceC14878a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f13866b = new d();

        @k
        public final String toString() {
            return "LoadData";
        }
    }

    /* compiled from: BasicProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/a$e;", "LQb0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.a$e */
    public static final class e implements InterfaceC14878a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final e f13867b = new e();

        @k
        public final String toString() {
            return "ReloadData";
        }
    }
}
