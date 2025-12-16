package com.avito.android.wallet.page.topup.form.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TopUpFormInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "RebindContent", "SubmitTopUp", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$Content;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$Error;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$Loading;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$RebindContent;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$SubmitTopUp;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TopUpFormInternalAction extends n {

    /* compiled from: TopUpFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$Error;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TopUpFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f328419b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f328420c;

        public Error(@k ApiException apiException) {
            this.f328419b = apiException;
            this.f328420c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof Error) && this.f328419b.equals(((Error) obj).f328419b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF279947c() {
            return this.f328420c;
        }

        public final int hashCode() {
            return this.f328419b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f328419b, ')');
        }
    }

    /* compiled from: TopUpFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$Loading;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TopUpFormInternalAction {
        @k
        public final String toString() {
            return Loading.class.getSimpleName();
        }
    }

    /* compiled from: TopUpFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$RebindContent;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RebindContent implements TopUpFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f328421b;

        public RebindContent() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RebindContent) && this.f328421b == ((RebindContent) obj).f328421b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f328421b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RebindContent(forceInputUpdate="), this.f328421b, ')');
        }

        public RebindContent(boolean z12) {
            this.f328421b = z12;
        }

        public /* synthetic */ RebindContent(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: TopUpFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$SubmitTopUp;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitTopUp implements TopUpFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Intent f328422b;

        public SubmitTopUp(@k Intent intent) {
            this.f328422b = intent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitTopUp) && L.f(this.f328422b, ((SubmitTopUp) obj).f328422b);
        }

        public final int hashCode() {
            return this.f328422b.hashCode();
        }

        @k
        public final String toString() {
            return "SubmitTopUp(intent=" + this.f328422b + ')';
        }
    }

    /* compiled from: TopUpFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction$Content;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TopUpFormInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TopUpForm f328417b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f328418c;

        public Content(@k TopUpForm topUpForm, boolean z12) {
            this.f328417b = topUpForm;
            this.f328418c = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f328417b, content.f328417b) && this.f328418c == content.f328418c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f328418c) + (this.f328417b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f328417b);
            sb2.append(", forceKeyboard=");
            return r.x(sb2, this.f328418c, ')');
        }

        public /* synthetic */ Content(TopUpForm topUpForm, boolean z12, int i12, C42822w c42822w) {
            this(topUpForm, (i12 & 2) != 0 ? false : z12);
        }
    }
}
