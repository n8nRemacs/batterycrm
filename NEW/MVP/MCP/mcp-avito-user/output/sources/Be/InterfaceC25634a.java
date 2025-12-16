package be;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.social.button.f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lbe/a;", "", "a", "b", "c", "d", "Lbe/a$a;", "Lbe/a$b;", "Lbe/a$c;", "Lbe/a$d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: be.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25634a {

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lbe/a$a;", "Lbe/a;", "Lbe/a$b;", "Lbe/a$d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.a$a, reason: collision with other inner class name */
    public interface InterfaceC2007a extends InterfaceC25634a {
        @k
        /* renamed from: getInfo */
        f getF57304b();

        @k
        /* renamed from: getType */
        String getF57303a();
    }

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lbe/a$b;", "Lbe/a;", "Lbe/a$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.a$b */
    public static final /* data */ class b implements InterfaceC25634a, InterfaceC2007a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57298a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f57299b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserDialog f57300c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f57301d;

        public b(@k String str, @k f fVar, @k UserDialog userDialog, boolean z12) {
            this.f57298a = str;
            this.f57299b = fVar;
            this.f57300c = userDialog;
            this.f57301d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f57298a, bVar.f57298a) && L.f(this.f57299b, bVar.f57299b) && L.f(this.f57300c, bVar.f57300c) && this.f57301d == bVar.f57301d;
        }

        @Override // be.InterfaceC25634a.InterfaceC2007a
        @k
        /* renamed from: getInfo, reason: from getter */
        public final f getF57304b() {
            return this.f57299b;
        }

        @Override // be.InterfaceC25634a.InterfaceC2007a
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF57303a() {
            return this.f57298a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57301d) + ((this.f57300c.hashCode() + ((this.f57299b.hashCode() + (this.f57298a.hashCode() * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DisabledAuthSocial(type=");
            sb2.append(this.f57298a);
            sb2.append(", info=");
            sb2.append(this.f57299b);
            sb2.append(", userDialog=");
            sb2.append(this.f57300c);
            sb2.append(", isGracefulDegradation=");
            return r.x(sb2, this.f57301d, ')');
        }
    }

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbe/a$c;", "Lbe/a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.a$c */
    public static final class c implements InterfaceC25634a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f57302a = new c();
    }

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lbe/a$d;", "Lbe/a;", "Lbe/a$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.a$d */
    public static final /* data */ class d implements InterfaceC25634a, InterfaceC2007a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57303a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f57304b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f57305c;

        public d(@k String str, @k f fVar, @k String str2) {
            this.f57303a = str;
            this.f57304b = fVar;
            this.f57305c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f57303a, dVar.f57303a) && L.f(this.f57304b, dVar.f57304b) && L.f(this.f57305c, dVar.f57305c);
        }

        @Override // be.InterfaceC25634a.InterfaceC2007a
        @k
        /* renamed from: getInfo, reason: from getter */
        public final f getF57304b() {
            return this.f57304b;
        }

        @Override // be.InterfaceC25634a.InterfaceC2007a
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF57303a() {
            return this.f57303a;
        }

        public final int hashCode() {
            return this.f57305c.hashCode() + ((this.f57304b.hashCode() + (this.f57303a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VisibleAuthSocial(type=");
            sb2.append(this.f57303a);
            sb2.append(", info=");
            sb2.append(this.f57304b);
            sb2.append(", socialType=");
            return C22026a.c(sb2, this.f57305c, ')');
        }
    }
}
