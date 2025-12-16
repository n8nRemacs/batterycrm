package Ay;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EditTextFieldState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LAy/d;", "", "a", "b", "c", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f756g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final d f757h = new d(null, false, null, null, null, null, 63, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f758a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f759b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f760c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final c f761d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final FormattedAlertSettings f762e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final NotSavedAlertSettings f763f;

    /* compiled from: EditTextFieldState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAy/d$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditTextFieldState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/d$b;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f764a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f764a, ((b) obj).f764a);
        }

        public final int hashCode() {
            String str = this.f764a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(errorMessage="), this.f764a, ')');
        }

        public b(@l String str) {
            this.f764a = str;
        }

        public /* synthetic */ b(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: EditTextFieldState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/d$c;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f765a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f766b;

        public c(boolean z12, @k String str) {
            this.f765a = z12;
            this.f766b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f765a == cVar.f765a && this.f766b.equals(cVar.f766b);
        }

        public final int hashCode() {
            return this.f766b.hashCode() + (Boolean.hashCode(this.f765a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FormatTextState(showFormattedAlert=");
            sb2.append(this.f765a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f766b, ')');
        }
    }

    public d() {
        this(null, false, null, null, null, null, 63, null);
    }

    public static d a(d dVar, String str, boolean z12, b bVar, c cVar, FormattedAlertSettings formattedAlertSettings, NotSavedAlertSettings notSavedAlertSettings, int i12) {
        if ((i12 & 1) != 0) {
            str = dVar.f758a;
        }
        String str2 = str;
        if ((i12 & 2) != 0) {
            z12 = dVar.f759b;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            bVar = dVar.f760c;
        }
        b bVar2 = bVar;
        if ((i12 & 8) != 0) {
            cVar = dVar.f761d;
        }
        c cVar2 = cVar;
        if ((i12 & 16) != 0) {
            formattedAlertSettings = dVar.f762e;
        }
        FormattedAlertSettings formattedAlertSettings2 = formattedAlertSettings;
        if ((i12 & 32) != 0) {
            notSavedAlertSettings = dVar.f763f;
        }
        dVar.getClass();
        return new d(str2, z13, bVar2, cVar2, formattedAlertSettings2, notSavedAlertSettings);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f758a, dVar.f758a) && this.f759b == dVar.f759b && L.f(this.f760c, dVar.f760c) && L.f(this.f761d, dVar.f761d) && L.f(this.f762e, dVar.f762e) && L.f(this.f763f, dVar.f763f);
    }

    public final int hashCode() {
        String str = this.f758a;
        int i12 = r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f759b);
        b bVar = this.f760c;
        int iHashCode = (i12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f761d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        FormattedAlertSettings formattedAlertSettings = this.f762e;
        int iHashCode3 = (iHashCode2 + (formattedAlertSettings == null ? 0 : formattedAlertSettings.hashCode())) * 31;
        NotSavedAlertSettings notSavedAlertSettings = this.f763f;
        return iHashCode3 + (notSavedAlertSettings != null ? notSavedAlertSettings.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "EditTextFieldState(text=" + this.f758a + ", inProgress=" + this.f759b + ", error=" + this.f760c + ", formatTextState=" + this.f761d + ", formattedAlertSettings=" + this.f762e + ", notSavedAlertSettings=" + this.f763f + ')';
    }

    public d(@l String str, boolean z12, @l b bVar, @l c cVar, @l FormattedAlertSettings formattedAlertSettings, @l NotSavedAlertSettings notSavedAlertSettings) {
        this.f758a = str;
        this.f759b = z12;
        this.f760c = bVar;
        this.f761d = cVar;
        this.f762e = formattedAlertSettings;
        this.f763f = notSavedAlertSettings;
    }

    public /* synthetic */ d(String str, boolean z12, b bVar, c cVar, FormattedAlertSettings formattedAlertSettings, NotSavedAlertSettings notSavedAlertSettings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : bVar, (i12 & 8) != 0 ? null : cVar, (i12 & 16) != 0 ? null : formattedAlertSettings, (i12 & 32) != 0 ? null : notSavedAlertSettings);
    }
}
