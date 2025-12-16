package Qb0;

import Pb0.C14765a;
import Qb0.InterfaceC14878a;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicProfileSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"LQb0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "LQb0/b$a;", "LQb0/b$b;", "LQb0/b$c;", "LQb0/b$d;", "LQb0/b$e;", "LQb0/b$f;", "LQb0/b$g;", "LQb0/b$h;", "LQb0/b$i;", "LQb0/b$j;", "LQb0/b$k;", "LQb0/b$l;", "LQb0/b$m;", "LQb0/b$n;", "LQb0/b$o;", "LQb0/b$p;", "LQb0/b$q;", "LQb0/b$r;", "LQb0/b$s;", "LQb0/b$t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14879b {

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/b$a;", "LQb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$a */
    public static final class a implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f13868a = new a();
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$b;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0914b implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f13869a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13870b;

        public C0914b(@Y61.k Throwable th2, boolean z12) {
            this.f13869a = th2;
            this.f13870b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0914b)) {
                return false;
            }
            C0914b c0914b = (C0914b) obj;
            return L.f(this.f13869a, c0914b.f13869a) && this.f13870b == c0914b.f13870b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13870b) + (this.f13869a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarDeletionFailure(error=");
            sb2.append(this.f13869a);
            sb2.append(", isPublic=");
            return androidx.appcompat.app.r.x(sb2, this.f13870b, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$c;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$c */
    public static final /* data */ class c implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13871a;

        public c(boolean z12) {
            this.f13871a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f13871a == ((c) obj).f13871a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13871a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("AvatarDeletionStarted(isPublic="), this.f13871a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/b$d;", "LQb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$d */
    public static final class d implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f13872a = new d();
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$e;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$e */
    public static final /* data */ class e implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f13873a;

        public e(@Y61.k Uri uri) {
            this.f13873a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13873a, ((e) obj).f13873a);
        }

        public final int hashCode() {
            return this.f13873a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("AvatarUploadCancel(avatarUri="), this.f13873a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$f;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$f */
    public static final /* data */ class f implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f13874a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f13875b;

        public f(@Y61.k Uri uri, @Y61.k Throwable th2) {
            this.f13874a = th2;
            this.f13875b = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f13874a, fVar.f13874a) && L.f(this.f13875b, fVar.f13875b);
        }

        public final int hashCode() {
            return this.f13875b.hashCode() + (this.f13874a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarUploadFailure(error=");
            sb2.append(this.f13874a);
            sb2.append(", avatarUri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f13875b, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$g;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$g */
    public static final /* data */ class g implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f13876a;

        public g(@Y61.k Uri uri) {
            this.f13876a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f13876a, ((g) obj).f13876a);
        }

        public final int hashCode() {
            return this.f13876a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("AvatarUploadStarted(newImageUri="), this.f13876a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$h;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$h */
    public static final /* data */ class h implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f13877a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<BasicInfoItem.AvatarAction> f13878b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ModerationStatus f13879c;

        public h(@Y61.l Image image, @Y61.k List<BasicInfoItem.AvatarAction> list, @Y61.l ModerationStatus moderationStatus) {
            this.f13877a = image;
            this.f13878b = list;
            this.f13879c = moderationStatus;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f13877a, hVar.f13877a) && L.f(this.f13878b, hVar.f13878b) && L.f(this.f13879c, hVar.f13879c);
        }

        public final int hashCode() {
            Image image = this.f13877a;
            int iE2 = H.e((image == null ? 0 : image.hashCode()) * 31, 31, this.f13878b);
            ModerationStatus moderationStatus = this.f13879c;
            return iE2 + (moderationStatus != null ? moderationStatus.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AvatarUploadSuccess(avatar=" + this.f13877a + ", newActions=" + this.f13878b + ", status=" + this.f13879c + ')';
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$i;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$i */
    public static final /* data */ class i implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiException f13880a;

        public i(@Y61.k ApiException apiException) {
            this.f13880a = apiException;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f13880a.equals(((i) obj).f13880a);
        }

        public final int hashCode() {
            return this.f13880a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.q(new StringBuilder("DataError(error="), this.f13880a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$j;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$j */
    public static final /* data */ class j implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f13881a;

        public j(@Y61.k ArrayList arrayList) {
            this.f13881a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f13881a.equals(((j) obj).f13881a);
        }

        public final int hashCode() {
            return this.f13881a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("DataLoaded(items="), this.f13881a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$k;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$k */
    public static final /* data */ class k implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13882a;

        public k(boolean z12) {
            this.f13882a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f13882a == ((k) obj).f13882a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13882a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("DataLoading(isRefreshing="), this.f13882a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$l;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$l */
    public static final /* data */ class l implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvatarShape f13883a;

        public l(@Y61.k AvatarShape avatarShape) {
            this.f13883a = avatarShape;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f13883a == ((l) obj).f13883a;
        }

        public final int hashCode() {
            return this.f13883a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAvatarPicker(cropBoundsShape=" + this.f13883a + ')';
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/b$m;", "LQb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$m */
    public static final /* data */ class m implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f13884a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 2123656331;
        }

        @Y61.k
        public final String toString() {
            return "OpenSellerTypeEditor";
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$n;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$n */
    public static final /* data */ class n implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13885a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f13886b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f13887c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f13888d;

        public n(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f13885a = str;
            this.f13886b = str2;
            this.f13887c = str3;
            this.f13888d = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f13885a, nVar.f13885a) && L.f(this.f13886b, nVar.f13886b) && L.f(this.f13887c, nVar.f13887c) && L.f(this.f13888d, nVar.f13888d);
        }

        public final int hashCode() {
            int iHashCode = this.f13885a.hashCode() * 31;
            String str = this.f13886b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13887c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f13888d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenTextFieldEditor(fieldName=");
            sb2.append(this.f13885a);
            sb2.append(", title=");
            sb2.append(this.f13886b);
            sb2.append(", value=");
            sb2.append(this.f13887c);
            sb2.append(", placeholder=");
            return C22026a.c(sb2, this.f13888d, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/b$o;", "LQb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$o */
    public static final class o implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f13889a = new o();
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$p;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$p */
    public static final /* data */ class p implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiException f13890a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final InterfaceC14878a.e f13891b;

        public p(@Y61.k ApiException apiException, @Y61.l InterfaceC14878a.e eVar) {
            this.f13890a = apiException;
            this.f13891b = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f13890a.equals(pVar.f13890a) && L.f(this.f13891b, pVar.f13891b);
        }

        public final int hashCode() {
            int iHashCode = this.f13890a.hashCode() * 31;
            InterfaceC14878a.e eVar = this.f13891b;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f13890a + ", buttonAction=" + this.f13891b + ')';
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$q;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$q */
    public static final /* data */ class q implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13892a;

        public q(@Y61.k String str) {
            this.f13892a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f13892a, ((q) obj).f13892a);
        }

        public final int hashCode() {
            return this.f13892a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastBar(message="), this.f13892a, ')');
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/b$r;", "LQb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$r */
    public static final class r implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f13893a = new r();

        @Y61.k
        public final String toString() {
            return "VerificationsError - internal";
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/b$s;", "LQb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$s */
    public static final /* data */ class s implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C14765a f13894a;

        public s(@Y61.k C14765a c14765a) {
            this.f13894a = c14765a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f13894a, ((s) obj).f13894a);
        }

        public final int hashCode() {
            return this.f13894a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VerificationsLoaded(data=" + this.f13894a + ')';
        }
    }

    /* compiled from: BasicProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/b$t;", "LQb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.b$t */
    public static final class t implements InterfaceC14879b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f13895a = new t();

        @Y61.k
        public final String toString() {
            return "VerificationsLoading - internal";
        }
    }
}
