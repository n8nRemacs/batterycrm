package Qb0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AvatarShape;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicProfileSettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LQb0/c;", "", "a", "b", "c", "d", "e", "LQb0/c$a;", "LQb0/c$b;", "LQb0/c$c;", "LQb0/c$d;", "LQb0/c$e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14880c {

    /* compiled from: BasicProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/c$a;", "LQb0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.c$a */
    public static final /* data */ class a implements InterfaceC14880c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvatarShape f13896a;

        public a(@k AvatarShape avatarShape) {
            this.f13896a = avatarShape;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13896a == ((a) obj).f13896a;
        }

        public final int hashCode() {
            return this.f13896a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenAvatarPicker(cropBoundsShape=" + this.f13896a + ')';
        }
    }

    /* compiled from: BasicProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/c$b;", "LQb0/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.c$b */
    public static final /* data */ class b implements InterfaceC14880c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13897a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 935260247;
        }

        @k
        public final String toString() {
            return "OpenSellerTypeEditor";
        }
    }

    /* compiled from: BasicProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/c$c;", "LQb0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0915c implements InterfaceC14880c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13898a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f13899b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f13900c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f13901d;

        public C0915c(@k String str, @l String str2, @l String str3, @l String str4) {
            this.f13898a = str;
            this.f13899b = str2;
            this.f13900c = str3;
            this.f13901d = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0915c)) {
                return false;
            }
            C0915c c0915c = (C0915c) obj;
            return L.f(this.f13898a, c0915c.f13898a) && L.f(this.f13899b, c0915c.f13899b) && L.f(this.f13900c, c0915c.f13900c) && L.f(this.f13901d, c0915c.f13901d);
        }

        public final int hashCode() {
            int iHashCode = this.f13898a.hashCode() * 31;
            String str = this.f13899b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13900c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f13901d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenTextFieldEditor(fieldName=");
            sb2.append(this.f13898a);
            sb2.append(", title=");
            sb2.append(this.f13899b);
            sb2.append(", value=");
            sb2.append(this.f13900c);
            sb2.append(", placeholder=");
            return C22026a.c(sb2, this.f13901d, ')');
        }
    }

    /* compiled from: BasicProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/c$d;", "LQb0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.c$d */
    public static final /* data */ class d implements InterfaceC14880c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f13902a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final InterfaceC14878a f13903b;

        public d(@k Throwable th2, @l InterfaceC14878a interfaceC14878a) {
            this.f13902a = th2;
            this.f13903b = interfaceC14878a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f13902a, dVar.f13902a) && L.f(this.f13903b, dVar.f13903b);
        }

        public final int hashCode() {
            int iHashCode = this.f13902a.hashCode() * 31;
            InterfaceC14878a interfaceC14878a = this.f13903b;
            return iHashCode + (interfaceC14878a == null ? 0 : interfaceC14878a.hashCode());
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f13902a + ", buttonAction=" + this.f13903b + ')';
        }
    }

    /* compiled from: BasicProfileSettingsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/c$e;", "LQb0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qb0.c$e */
    public static final /* data */ class e implements InterfaceC14880c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13904a;

        public e(@k String str) {
            this.f13904a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13904a, ((e) obj).f13904a);
        }

        public final int hashCode() {
            return this.f13904a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastBar(message="), this.f13904a, ')');
        }
    }
}
