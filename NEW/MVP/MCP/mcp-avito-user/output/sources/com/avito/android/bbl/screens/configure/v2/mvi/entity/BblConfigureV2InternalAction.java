package com.avito.android.bbl.screens.configure.v2.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bbl.screens.configure.v2.ui.items.cards.C28729a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.C49582f;
import wZ.g;
import wZ.i;

/* compiled from: BblConfigureV2InternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeOnScreenLoading", "Content", "Error", "HandleDeeplink", "Loading", "UpdateConfig", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Back;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$ChangeOnScreenLoading;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Content;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Error;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Loading;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$UpdateConfig;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BblConfigureV2InternalAction extends n {

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Back;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements BblConfigureV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f99355b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1211147707;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$ChangeOnScreenLoading;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeOnScreenLoading implements BblConfigureV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f99356b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f99357c;

        public ChangeOnScreenLoading(boolean z12, @l Integer num) {
            this.f99356b = z12;
            this.f99357c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeOnScreenLoading)) {
                return false;
            }
            ChangeOnScreenLoading changeOnScreenLoading = (ChangeOnScreenLoading) obj;
            return this.f99356b == changeOnScreenLoading.f99356b && L.f(this.f99357c, changeOnScreenLoading.f99357c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f99356b) * 31;
            Integer num = this.f99357c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeOnScreenLoading(isLoading=");
            sb2.append(this.f99356b);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f99357c, ')');
        }
    }

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Content;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements BblConfigureV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i f99358b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final g f99359c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C49582f f99360d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final C49582f f99361e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Long f99362f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final wZ.l f99363g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final AttributedText f99364h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final ArrayList f99365i;

        public Content(@k i iVar, @k g gVar, @l C49582f c49582f, @k C49582f c49582f2, @l Long l12, @l wZ.l lVar, @k AttributedText attributedText, @k ArrayList arrayList) {
            this.f99358b = iVar;
            this.f99359c = gVar;
            this.f99360d = c49582f;
            this.f99361e = c49582f2;
            this.f99362f = l12;
            this.f99363g = lVar;
            this.f99364h = attributedText;
            this.f99365i = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206205d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
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
            return this.f99358b.equals(content.f99358b) && this.f99359c.equals(content.f99359c) && L.f(this.f99360d, content.f99360d) && this.f99361e.equals(content.f99361e) && L.f(this.f99362f, content.f99362f) && L.f(this.f99363g, content.f99363g) && L.f(this.f99364h, content.f99364h) && this.f99365i.equals(content.f99365i);
        }

        public final int hashCode() {
            int iHashCode = (this.f99359c.hashCode() + (this.f99358b.hashCode() * 31)) * 31;
            C49582f c49582f = this.f99360d;
            int iHashCode2 = (this.f99361e.hashCode() + ((iHashCode + (c49582f == null ? 0 : c49582f.hashCode())) * 31)) * 31;
            Long l12 = this.f99362f;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            wZ.l lVar = this.f99363g;
            return this.f99365i.hashCode() + a.b((iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31, 31, this.f99364h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(navBar=");
            sb2.append(this.f99358b);
            sb2.append(", footer=");
            sb2.append(this.f99359c);
            sb2.append(", initialContact=");
            sb2.append(this.f99360d);
            sb2.append(", currentContact=");
            sb2.append(this.f99361e);
            sb2.append(", configId=");
            sb2.append(this.f99362f);
            sb2.append(", image=");
            sb2.append(this.f99363g);
            sb2.append(", title=");
            sb2.append(this.f99364h);
            sb2.append(", configs=");
            return e.p(sb2, this.f99365i, ')');
        }
    }

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Error;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "ScreenError", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Error$ScreenError;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements BblConfigureV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f99366b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f99367c;

        /* compiled from: BblConfigureV2InternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Error$ScreenError;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Error;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ScreenError extends Error {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final ApiException f99368d;

            public ScreenError(@k ApiException apiException) {
                super(apiException, null);
                this.f99368d = apiException;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScreenError) && L.f(this.f99368d, ((ScreenError) obj).f99368d);
            }

            public final int hashCode() {
                return this.f99368d.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("ScreenError(throwable="), this.f99368d, ')');
            }
        }

        public Error(Throwable th2, C42822w c42822w) {
            this.f99366b = th2;
            this.f99367c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206205d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF320736c() {
            return this.f99367c;
        }
    }

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BblConfigureV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f99369b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f99370c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f99371d;

        public HandleDeeplink(@l DeepLink deepLink, @l Integer num, @l Long l12) {
            this.f99369b = deepLink;
            this.f99370c = num;
            this.f99371d = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f99369b, handleDeeplink.f99369b) && L.f(this.f99370c, handleDeeplink.f99370c) && L.f(this.f99371d, handleDeeplink.f99371d);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f99369b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Integer num = this.f99370c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l12 = this.f99371d;
            return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deepLink=");
            sb2.append(this.f99369b);
            sb2.append(", buttonId=");
            sb2.append(this.f99370c);
            sb2.append(", configId=");
            return m.m(sb2, this.f99371d, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Integer num, Long l12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : l12);
        }
    }

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$Loading;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements BblConfigureV2InternalAction {
    }

    /* compiled from: BblConfigureV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction$UpdateConfig;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateConfig implements BblConfigureV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C28729a f99372b;

        public UpdateConfig(@l C28729a c28729a) {
            this.f99372b = c28729a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateConfig) && L.f(this.f99372b, ((UpdateConfig) obj).f99372b);
        }

        public final int hashCode() {
            C28729a c28729a = this.f99372b;
            if (c28729a == null) {
                return 0;
            }
            return c28729a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateConfig(config=" + this.f99372b + ')';
        }
    }
}
