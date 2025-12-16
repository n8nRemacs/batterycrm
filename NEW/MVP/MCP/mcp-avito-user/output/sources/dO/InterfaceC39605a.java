package dO;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import com.avito.android.installments_block.entity.InstallmentsButton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlockAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LdO/a;", "", "a", "b", "c", "d", "LdO/a$a;", "LdO/a$b;", "LdO/a$c;", "LdO/a$d;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC39605a {

    /* compiled from: InstallmentsBlockAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/a$a;", "LdO/a;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11025a implements InterfaceC39605a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InstallmentsButton f393836a;

        public C11025a(@k InstallmentsButton installmentsButton) {
            this.f393836a = installmentsButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11025a) && L.f(this.f393836a, ((C11025a) obj).f393836a);
        }

        public final int hashCode() {
            return this.f393836a.hashCode();
        }

        @k
        public final String toString() {
            return "ButtonClicked(button=" + this.f393836a + ')';
        }
    }

    /* compiled from: InstallmentsBlockAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/a$b;", "LdO/a;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.a$b */
    public static final /* data */ class b implements InterfaceC39605a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InstallmentsBlock f393837a;

        public b(@k InstallmentsBlock installmentsBlock) {
            this.f393837a = installmentsBlock;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f393837a, ((b) obj).f393837a);
        }

        public final int hashCode() {
            return this.f393837a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(installmentsBlock=" + this.f393837a + ')';
        }
    }

    /* compiled from: InstallmentsBlockAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/a$c;", "LdO/a;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.a$c */
    public static final /* data */ class c implements InterfaceC39605a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f393838a;

        public c(@k DeepLink deepLink) {
            this.f393838a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f393838a, ((c) obj).f393838a);
        }

        public final int hashCode() {
            return this.f393838a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f393838a, ')');
        }
    }

    /* compiled from: InstallmentsBlockAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO/a$d;", "LdO/a;", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dO.a$d */
    public static final /* data */ class d implements InterfaceC39605a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f393839a;

        public d(@k String str) {
            this.f393839a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f393839a, ((d) obj).f393839a);
        }

        public final int hashCode() {
            return this.f393839a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TermSelected(planId="), this.f393839a, ')');
        }
    }
}
