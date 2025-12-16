package com.avito.android.cpt.pre_activation.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cpt.pre_activation.data.PreActivationData;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreActivationInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Content", "OpenDeepLink", "SelectOption", "SetResult", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$CloseScreen;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$Content;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$OpenDeepLink;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$SelectOption;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$SetResult;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PreActivationInternalAction extends n {

    /* compiled from: PreActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$CloseScreen;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements PreActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f126731b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1281758449;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: PreActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$Content;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements PreActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreActivationData f126732b;

        public Content(@k PreActivationData preActivationData) {
            this.f126732b = preActivationData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f126732b, ((Content) obj).f126732b);
        }

        public final int hashCode() {
            return this.f126732b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f126732b + ')';
        }
    }

    /* compiled from: PreActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$OpenDeepLink;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements PreActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f126733b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f126734c;

        public OpenDeepLink(@k DeepLink deepLink, boolean z12) {
            this.f126733b = deepLink;
            this.f126734c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeepLink)) {
                return false;
            }
            OpenDeepLink openDeepLink = (OpenDeepLink) obj;
            return L.f(this.f126733b, openDeepLink.f126733b) && this.f126734c == openDeepLink.f126734c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f126734c) + (this.f126733b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f126733b);
            sb2.append(", addParams=");
            return r.x(sb2, this.f126734c, ')');
        }

        public /* synthetic */ OpenDeepLink(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: PreActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$SelectOption;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectOption implements PreActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f126735b;

        public SelectOption(@k String str) {
            this.f126735b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectOption) && L.f(this.f126735b, ((SelectOption) obj).f126735b);
        }

        public final int hashCode() {
            return this.f126735b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectOption(id="), this.f126735b, ')');
        }
    }

    /* compiled from: PreActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction$SetResult;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetResult implements PreActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f126736b;

        /* JADX WARN: Multi-variable type inference failed */
        public SetResult() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetResult) && L.f(this.f126736b, ((SetResult) obj).f126736b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f126736b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("SetResult(deepLink="), this.f126736b, ')');
        }

        public SetResult(@l DeepLink deepLink) {
            this.f126736b = deepLink;
        }

        public /* synthetic */ SetResult(DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : deepLink);
        }
    }
}
