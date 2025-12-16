package com.avito.android.oauth.presentation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.oauth.repository.a;
import com.avito.android.remote.error.ApiError;
import j40.C42193c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l40.InterfaceC43542a;

/* compiled from: OAuthInternalAction.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChoosePermissionType", "Close", "CloseScopeDialog", "HidePermissionTypeHint", "Redirect", "Restart", "SaveFio", "SavePhone", "SetRetryButtonLoading", "SetSubmitButtonLoading", "ShowAgreementPage", "ShowErrorAccessDeclined", "ShowExtendedForm", "ShowFormErrors", "ShowNetworkError", "ShowPermissionTypeHint", "ShowPrivacyPolicyPage", "ShowScopeDialog", "ShowShortForm", "ShowTermsOfUsePage", "ShowUnexpectedError", "Unauthorized", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ChoosePermissionType;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Close;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$CloseScopeDialog;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$HidePermissionTypeHint;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Redirect;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Restart;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SaveFio;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SavePhone;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SetRetryButtonLoading;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SetSubmitButtonLoading;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowAgreementPage;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowErrorAccessDeclined;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowExtendedForm;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowFormErrors;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowNetworkError;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowPermissionTypeHint;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowPrivacyPolicyPage;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowScopeDialog;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowShortForm;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowTermsOfUsePage;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowUnexpectedError;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Unauthorized;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OAuthInternalAction extends n {

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ChoosePermissionType;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChoosePermissionType implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f208292b;

        public ChoosePermissionType(long j12) {
            this.f208292b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChoosePermissionType) && this.f208292b == ((ChoosePermissionType) obj).f208292b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f208292b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("ChoosePermissionType(permissionTypeId="), this.f208292b, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Close;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f208293b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 988868265;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$CloseScopeDialog;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScopeDialog implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScopeDialog f208294b = new CloseScopeDialog();

        private CloseScopeDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScopeDialog);
        }

        public final int hashCode() {
            return -1633337773;
        }

        @k
        public final String toString() {
            return "CloseScopeDialog";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$HidePermissionTypeHint;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HidePermissionTypeHint implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HidePermissionTypeHint f208295b = new HidePermissionTypeHint();

        private HidePermissionTypeHint() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HidePermissionTypeHint);
        }

        public final int hashCode() {
            return -473664479;
        }

        @k
        public final String toString() {
            return "HidePermissionTypeHint";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Redirect;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Redirect implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f208296b;

        public Redirect(@k String str) {
            this.f208296b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Redirect) && L.f(this.f208296b, ((Redirect) obj).f208296b);
        }

        public final int hashCode() {
            return this.f208296b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Redirect(uri="), this.f208296b, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Restart;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Restart implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Restart f208297b = new Restart();

        private Restart() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Restart);
        }

        public final int hashCode() {
            return 1345603200;
        }

        @k
        public final String toString() {
            return "Restart";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SaveFio;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveFio implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f208298b;

        public SaveFio(@k String str) {
            this.f208298b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveFio) && L.f(this.f208298b, ((SaveFio) obj).f208298b);
        }

        public final int hashCode() {
            return this.f208298b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveFio(value="), this.f208298b, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SavePhone;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavePhone implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f208299b;

        public SavePhone(@k String str) {
            this.f208299b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavePhone) && L.f(this.f208299b, ((SavePhone) obj).f208299b);
        }

        public final int hashCode() {
            return this.f208299b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SavePhone(value="), this.f208299b, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SetRetryButtonLoading;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetRetryButtonLoading implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f208300b;

        public SetRetryButtonLoading(boolean z12) {
            this.f208300b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetRetryButtonLoading) && this.f208300b == ((SetRetryButtonLoading) obj).f208300b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f208300b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetRetryButtonLoading(value="), this.f208300b, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$SetSubmitButtonLoading;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSubmitButtonLoading implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f208301b;

        public SetSubmitButtonLoading(boolean z12) {
            this.f208301b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSubmitButtonLoading) && this.f208301b == ((SetSubmitButtonLoading) obj).f208301b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f208301b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetSubmitButtonLoading(value="), this.f208301b, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowAgreementPage;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAgreementPage implements OAuthInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAgreementPage)) {
                return false;
            }
            ((ShowAgreementPage) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 1540193;
        }

        @k
        public final String toString() {
            return "ShowAgreementPage(url=2333)";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowErrorAccessDeclined;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorAccessDeclined implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowErrorAccessDeclined f208302b = new ShowErrorAccessDeclined();

        private ShowErrorAccessDeclined() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowErrorAccessDeclined);
        }

        public final int hashCode() {
            return 259461646;
        }

        @k
        public final String toString() {
            return "ShowErrorAccessDeclined";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowExtendedForm;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowExtendedForm implements OAuthInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f208303b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f208304c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f208305d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final List<C42193c> f208306e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f208307f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f208308g;

        public ShowExtendedForm(@k a aVar, @k String str, @k List<String> list, @l List<C42193c> list2, @l String str2, @l String str3) {
            this.f208303b = aVar;
            this.f208304c = str;
            this.f208305d = list;
            this.f208306e = list2;
            this.f208307f = str2;
            this.f208308g = str3;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF204956d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowExtendedForm)) {
                return false;
            }
            ShowExtendedForm showExtendedForm = (ShowExtendedForm) obj;
            return L.f(this.f208303b, showExtendedForm.f208303b) && this.f208304c.equals(showExtendedForm.f208304c) && L.f(this.f208305d, showExtendedForm.f208305d) && L.f(this.f208306e, showExtendedForm.f208306e) && L.f(this.f208307f, showExtendedForm.f208307f) && L.f(this.f208308g, showExtendedForm.f208308g);
        }

        public final int hashCode() {
            int iA2 = C23088b.a(H.d(this.f208303b.hashCode() * 31, 31, this.f208304c), 31, this.f208305d);
            List<C42193c> list = this.f208306e;
            int iHashCode = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f208307f;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f208308g;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowExtendedForm(accountData=");
            sb2.append(this.f208303b);
            sb2.append(", clientName=");
            sb2.append(this.f208304c);
            sb2.append(", scopes=");
            sb2.append(this.f208305d);
            sb2.append(", permissionTypes=");
            sb2.append(this.f208306e);
            sb2.append(", fio=");
            sb2.append(this.f208307f);
            sb2.append(", phone=");
            return C22026a.c(sb2, this.f208308g, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowFormErrors;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFormErrors implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f208309b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f208310c;

        /* JADX WARN: Illegal instructions before constructor call */
        public ShowFormErrors() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowFormErrors)) {
                return false;
            }
            ShowFormErrors showFormErrors = (ShowFormErrors) obj;
            return this.f208309b == showFormErrors.f208309b && this.f208310c == showFormErrors.f208310c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f208310c) + (Boolean.hashCode(this.f208309b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowFormErrors(fioIsEmpty=");
            sb2.append(this.f208309b);
            sb2.append(", phoneNumberHasWrongFormat=");
            return r.x(sb2, this.f208310c, ')');
        }

        public ShowFormErrors(boolean z12, boolean z13) {
            this.f208309b = z12;
            this.f208310c = z13;
        }

        public /* synthetic */ ShowFormErrors(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowPermissionTypeHint;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPermissionTypeHint implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f208314b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f208315c;

        public ShowPermissionTypeHint(@k String str, @k String str2) {
            this.f208314b = str;
            this.f208315c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPermissionTypeHint)) {
                return false;
            }
            ShowPermissionTypeHint showPermissionTypeHint = (ShowPermissionTypeHint) obj;
            return L.f(this.f208314b, showPermissionTypeHint.f208314b) && L.f(this.f208315c, showPermissionTypeHint.f208315c);
        }

        public final int hashCode() {
            return this.f208315c.hashCode() + (this.f208314b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPermissionTypeHint(typeName=");
            sb2.append(this.f208314b);
            sb2.append(", hintText=");
            return C22026a.c(sb2, this.f208315c, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowPrivacyPolicyPage;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPrivacyPolicyPage implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPrivacyPolicyPage f208316b = new ShowPrivacyPolicyPage();

        private ShowPrivacyPolicyPage() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPrivacyPolicyPage);
        }

        public final int hashCode() {
            return 541291965;
        }

        @k
        public final String toString() {
            return "ShowPrivacyPolicyPage";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowScopeDialog;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowScopeDialog implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowScopeDialog f208317b = new ShowScopeDialog();

        private ShowScopeDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowScopeDialog);
        }

        public final int hashCode() {
            return -2106213136;
        }

        @k
        public final String toString() {
            return "ShowScopeDialog";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowShortForm;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowShortForm implements OAuthInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f208318b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f208319c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f208320d;

        public ShowShortForm(@k a aVar, @k String str, @k List<String> list) {
            this.f208318b = aVar;
            this.f208319c = str;
            this.f208320d = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF204956d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowShortForm)) {
                return false;
            }
            ShowShortForm showShortForm = (ShowShortForm) obj;
            return L.f(this.f208318b, showShortForm.f208318b) && this.f208319c.equals(showShortForm.f208319c) && L.f(this.f208320d, showShortForm.f208320d);
        }

        public final int hashCode() {
            return this.f208320d.hashCode() + H.d(this.f208318b.hashCode() * 31, 31, this.f208319c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowShortForm(accountData=");
            sb2.append(this.f208318b);
            sb2.append(", clientName=");
            sb2.append(this.f208319c);
            sb2.append(", scopes=");
            return H.n(sb2, this.f208320d, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowTermsOfUsePage;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowTermsOfUsePage implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowTermsOfUsePage f208321b = new ShowTermsOfUsePage();

        private ShowTermsOfUsePage() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowTermsOfUsePage);
        }

        public final int hashCode() {
            return -293914524;
        }

        @k
        public final String toString() {
            return "ShowTermsOfUsePage";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowUnexpectedError;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUnexpectedError implements OAuthInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC43542a f208322b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f208323c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f208324d;

        public ShowUnexpectedError(@k InterfaceC43542a interfaceC43542a, @k Throwable th2) {
            this.f208322b = interfaceC43542a;
            this.f208323c = th2;
            this.f208324d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowUnexpectedError)) {
                return false;
            }
            ShowUnexpectedError showUnexpectedError = (ShowUnexpectedError) obj;
            return L.f(this.f208322b, showUnexpectedError.f208322b) && L.f(this.f208323c, showUnexpectedError.f208323c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF213285c() {
            return this.f208324d;
        }

        public final int hashCode() {
            return this.f208323c.hashCode() + (this.f208322b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowUnexpectedError(retryAction=");
            sb2.append(this.f208322b);
            sb2.append(", exception=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f208323c, ')');
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$Unauthorized;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unauthorized implements OAuthInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Unauthorized f208325b = new Unauthorized();

        private Unauthorized() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Unauthorized);
        }

        public final int hashCode() {
            return 1523928867;
        }

        @k
        public final String toString() {
            return "Unauthorized";
        }
    }

    /* compiled from: OAuthInternalAction.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction$ShowNetworkError;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowNetworkError implements OAuthInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC43542a f208311b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f208312c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f208313d;

        public ShowNetworkError(@k InterfaceC43542a interfaceC43542a, @l ApiError apiError) {
            this.f208311b = interfaceC43542a;
            this.f208312c = apiError;
            this.f208313d = apiError != null ? new J.a(apiError) : new J.a(new IllegalArgumentException("There are not data for content"));
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowNetworkError)) {
                return false;
            }
            ShowNetworkError showNetworkError = (ShowNetworkError) obj;
            return L.f(this.f208311b, showNetworkError.f208311b) && L.f(this.f208312c, showNetworkError.f208312c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF213285c() {
            return this.f208313d;
        }

        public final int hashCode() {
            int iHashCode = this.f208311b.hashCode() * 31;
            ApiError apiError = this.f208312c;
            return iHashCode + (apiError == null ? 0 : apiError.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowNetworkError(retryAction=");
            sb2.append(this.f208311b);
            sb2.append(", apiError=");
            return c.n(sb2, this.f208312c, ')');
        }

        public /* synthetic */ ShowNetworkError(InterfaceC43542a interfaceC43542a, ApiError apiError, int i12, C42822w c42822w) {
            this(interfaceC43542a, (i12 & 2) != 0 ? null : apiError);
        }
    }
}
