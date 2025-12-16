package com.avito.android.campaigns_sale.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.campaigns_sale.network.remote.model.ItemMinDiscountPair;
import com.avito.android.campaigns_sale.network.remote.model.Meta;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gm.C40705b;
import hm.AbstractC40959a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleInternalAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BeduinComponentsChanged", "BeduinFormLoaded", "BlockAdded", "BlocksLoaded", "BlocksResolved", "CloseScreen", "DeleteBlock", "EditBlock", "HandleApiError", "HandleBeduinActions", "HandleDeepLink", "HandleInternalError", "HandleItemsAmountExceededError", "ImagesLoaded", "ItemMinDiscountPairsLoaded", "MetaDataLoaded", "OpenSearchScreen", "PageLoaded", "PageLoading", "SaleStatusLoaded", "SetChangesMade", "SetDiscount", "ShowAlert", "ShowExitSaleUxFeedbackPoll", "ShowOnDeleteBlockToast", "ShowToast", "TrackClickStreamEvent", "ValidateBlocks", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BeduinComponentsChanged;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BeduinFormLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BlockAdded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BlocksLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BlocksResolved;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$CloseScreen;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$DeleteBlock;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$EditBlock;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleApiError;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleBeduinActions;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleDeepLink;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleInternalError;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleItemsAmountExceededError;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ImagesLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ItemMinDiscountPairsLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$MetaDataLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$OpenSearchScreen;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$PageLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$PageLoading;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$SaleStatusLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$SetChangesMade;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$SetDiscount;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowAlert;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowExitSaleUxFeedbackPoll;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowOnDeleteBlockToast;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowToast;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$TrackClickStreamEvent;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ValidateBlocks;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CampaignsSaleInternalAction extends n {

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BeduinComponentsChanged;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinComponentsChanged implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f114153b;

        /* JADX WARN: Multi-variable type inference failed */
        public BeduinComponentsChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f114153b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BeduinComponentsChanged) && L.f(this.f114153b, ((BeduinComponentsChanged) obj).f114153b);
        }

        public final int hashCode() {
            return this.f114153b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("BeduinComponentsChanged(components="), this.f114153b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BeduinFormLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinFormLoaded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114154b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f114155c;

        /* JADX WARN: Multi-variable type inference failed */
        public BeduinFormLoaded(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f114154b = str;
            this.f114155c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BeduinFormLoaded)) {
                return false;
            }
            BeduinFormLoaded beduinFormLoaded = (BeduinFormLoaded) obj;
            return L.f(this.f114154b, beduinFormLoaded.f114154b) && L.f(this.f114155c, beduinFormLoaded.f114155c);
        }

        public final int hashCode() {
            return this.f114155c.hashCode() + (this.f114154b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinFormLoaded(formId=");
            sb2.append(this.f114154b);
            sb2.append(", components=");
            return H.p(sb2, this.f114155c, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BlockAdded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BlockAdded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BlockAdded f114156b = new BlockAdded();

        private BlockAdded() {
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BlocksLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BlocksLoaded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f114157b;

        public BlocksLoaded(@k ArrayList arrayList) {
            this.f114157b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlocksLoaded) && this.f114157b.equals(((BlocksLoaded) obj).f114157b);
        }

        public final int hashCode() {
            return this.f114157b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("BlocksLoaded(blocks="), this.f114157b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$BlocksResolved;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BlocksResolved implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C40705b> f114158b;

        public BlocksResolved(@k List<C40705b> list) {
            this.f114158b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlocksResolved) && L.f(this.f114158b, ((BlocksResolved) obj).f114158b);
        }

        public final int hashCode() {
            return this.f114158b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("BlocksResolved(blocks="), this.f114158b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$CloseScreen;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f114159b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$DeleteBlock;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteBlock implements CampaignsSaleInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteBlock)) {
                return false;
            }
            ((DeleteBlock) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "DeleteBlock(uuid=null)";
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$EditBlock;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditBlock implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f114160b;

        public EditBlock(@l String str) {
            this.f114160b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditBlock) && L.f(this.f114160b, ((EditBlock) obj).f114160b);
        }

        public final int hashCode() {
            String str = this.f114160b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("EditBlock(uuid="), this.f114160b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleApiError;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleApiError implements CampaignsSaleInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f114161b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f114162c;

        public HandleApiError(@k ApiError apiError) {
            this.f114161b = apiError;
            this.f114162c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF200214d() {
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
            return (obj instanceof HandleApiError) && L.f(this.f114161b, ((HandleApiError) obj).f114161b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF318412b() {
            return this.f114162c;
        }

        public final int hashCode() {
            return this.f114161b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("HandleApiError(error="), this.f114161b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleBeduinActions;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinActions implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<BeduinAction> f114163b;

        /* JADX WARN: Multi-variable type inference failed */
        public HandleBeduinActions(@k List<? extends BeduinAction> list) {
            this.f114163b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinActions) && L.f(this.f114163b, ((HandleBeduinActions) obj).f114163b);
        }

        public final int hashCode() {
            return this.f114163b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("HandleBeduinActions(actions="), this.f114163b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleDeepLink;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeepLink implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f114164b;

        public HandleDeepLink(@k DeepLink deepLink) {
            this.f114164b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeepLink) && L.f(this.f114164b, ((HandleDeepLink) obj).f114164b);
        }

        public final int hashCode() {
            return this.f114164b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeepLink(deepLink="), this.f114164b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleInternalError;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleInternalError implements CampaignsSaleInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f114165b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f114166c;

        public HandleInternalError(@k Throwable th2) {
            this.f114165b = th2;
            this.f114166c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF200214d() {
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
            return (obj instanceof HandleInternalError) && L.f(this.f114165b, ((HandleInternalError) obj).f114165b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF318412b() {
            return this.f114166c;
        }

        public final int hashCode() {
            return this.f114165b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("HandleInternalError(throwable="), this.f114165b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$HandleItemsAmountExceededError;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleItemsAmountExceededError implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114167b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f114168c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UniversalImage f114169d;

        public HandleItemsAmountExceededError(@k String str, @k String str2, @k UniversalImage universalImage) {
            this.f114167b = str;
            this.f114168c = str2;
            this.f114169d = universalImage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleItemsAmountExceededError)) {
                return false;
            }
            HandleItemsAmountExceededError handleItemsAmountExceededError = (HandleItemsAmountExceededError) obj;
            return L.f(this.f114167b, handleItemsAmountExceededError.f114167b) && L.f(this.f114168c, handleItemsAmountExceededError.f114168c) && L.f(this.f114169d, handleItemsAmountExceededError.f114169d);
        }

        public final int hashCode() {
            return this.f114169d.hashCode() + H.d(this.f114167b.hashCode() * 31, 31, this.f114168c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleItemsAmountExceededError(text=");
            sb2.append(this.f114167b);
            sb2.append(", title=");
            sb2.append(this.f114168c);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f114169d, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ImagesLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImagesLoaded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114170b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<Image> f114171c;

        public ImagesLoaded(@k String str, @k List<Image> list) {
            this.f114170b = str;
            this.f114171c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImagesLoaded)) {
                return false;
            }
            ImagesLoaded imagesLoaded = (ImagesLoaded) obj;
            return L.f(this.f114170b, imagesLoaded.f114170b) && L.f(this.f114171c, imagesLoaded.f114171c);
        }

        public final int hashCode() {
            return this.f114171c.hashCode() + (this.f114170b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImagesLoaded(blockId=");
            sb2.append(this.f114170b);
            sb2.append(", images=");
            return H.p(sb2, this.f114171c, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ItemMinDiscountPairsLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemMinDiscountPairsLoaded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ItemMinDiscountPair> f114172b;

        public ItemMinDiscountPairsLoaded(@k List<ItemMinDiscountPair> list) {
            this.f114172b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemMinDiscountPairsLoaded) && L.f(this.f114172b, ((ItemMinDiscountPairsLoaded) obj).f114172b);
        }

        public final int hashCode() {
            return this.f114172b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ItemMinDiscountPairsLoaded(pairs="), this.f114172b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$MetaDataLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MetaDataLoaded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Meta f114173b;

        public MetaDataLoaded(@k Meta meta) {
            this.f114173b = meta;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetaDataLoaded) && L.f(this.f114173b, ((MetaDataLoaded) obj).f114173b);
        }

        public final int hashCode() {
            return this.f114173b.hashCode();
        }

        @k
        public final String toString() {
            return "MetaDataLoaded(meta=" + this.f114173b + ')';
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$OpenSearchScreen;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenSearchScreen implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenSearchScreen f114174b = new OpenSearchScreen();

        private OpenSearchScreen() {
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$PageLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageLoaded implements CampaignsSaleInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PageLoaded f114175b = new PageLoaded();

        private PageLoaded() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF200214d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$PageLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageLoading extends TrackableLoadingStarted implements CampaignsSaleInternalAction {
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$SaleStatusLoaded;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaleStatusLoaded implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f114176b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f114177c;

        public SaleStatusLoaded(boolean z12, boolean z13) {
            this.f114176b = z12;
            this.f114177c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaleStatusLoaded)) {
                return false;
            }
            SaleStatusLoaded saleStatusLoaded = (SaleStatusLoaded) obj;
            return this.f114176b == saleStatusLoaded.f114176b && this.f114177c == saleStatusLoaded.f114177c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f114177c) + (Boolean.hashCode(this.f114176b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaleStatusLoaded(isParticipant=");
            sb2.append(this.f114176b);
            sb2.append(", isTerminated=");
            return r.x(sb2, this.f114177c, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$SetChangesMade;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetChangesMade implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f114178b;

        public SetChangesMade(boolean z12) {
            this.f114178b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetChangesMade) && this.f114178b == ((SetChangesMade) obj).f114178b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f114178b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetChangesMade(changesMade="), this.f114178b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$SetDiscount;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetDiscount implements CampaignsSaleInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetDiscount)) {
                return false;
            }
            ((SetDiscount) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "SetDiscount(uuid=null, discount=null)";
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowAlert;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAlert implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40959a f114179b;

        public ShowAlert(@k AbstractC40959a abstractC40959a) {
            this.f114179b = abstractC40959a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAlert) && L.f(this.f114179b, ((ShowAlert) obj).f114179b);
        }

        public final int hashCode() {
            return this.f114179b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowAlert(type=" + this.f114179b + ')';
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowExitSaleUxFeedbackPoll;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowExitSaleUxFeedbackPoll implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowExitSaleUxFeedbackPoll f114180b = new ShowExitSaleUxFeedbackPoll();

        private ShowExitSaleUxFeedbackPoll() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowExitSaleUxFeedbackPoll);
        }

        public final int hashCode() {
            return -912865609;
        }

        @k
        public final String toString() {
            return "ShowExitSaleUxFeedbackPoll";
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowOnDeleteBlockToast;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOnDeleteBlockToast implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C40705b f114181b;

        /* renamed from: c, reason: collision with root package name */
        public final int f114182c;

        public ShowOnDeleteBlockToast(@k C40705b c40705b, int i12) {
            this.f114181b = c40705b;
            this.f114182c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowOnDeleteBlockToast)) {
                return false;
            }
            ShowOnDeleteBlockToast showOnDeleteBlockToast = (ShowOnDeleteBlockToast) obj;
            return L.f(this.f114181b, showOnDeleteBlockToast.f114181b) && this.f114182c == showOnDeleteBlockToast.f114182c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f114182c) + (this.f114181b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowOnDeleteBlockToast(block=");
            sb2.append(this.f114181b);
            sb2.append(", index=");
            return r.t(sb2, this.f114182c, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ShowToast;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f114183b;

        public ShowToast(@k PrintableText printableText) {
            this.f114183b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f114183b, ((ShowToast) obj).f114183b);
        }

        public final int hashCode() {
            return this.f114183b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowToast(text="), this.f114183b, ')');
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$TrackClickStreamEvent;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrackClickStreamEvent implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.analytics.provider.clickstream.a f114184b;

        public TrackClickStreamEvent(@k com.avito.android.analytics.provider.clickstream.a aVar) {
            this.f114184b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackClickStreamEvent) && L.f(this.f114184b, ((TrackClickStreamEvent) obj).f114184b);
        }

        public final int hashCode() {
            return this.f114184b.hashCode();
        }

        @k
        public final String toString() {
            return "TrackClickStreamEvent(event=" + this.f114184b + ')';
        }
    }

    /* compiled from: CampaignsSaleInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction$ValidateBlocks;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidateBlocks implements CampaignsSaleInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114185b;

        public ValidateBlocks(@k String str) {
            this.f114185b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidateBlocks) && L.f(this.f114185b, ((ValidateBlocks) obj).f114185b);
        }

        public final int hashCode() {
            return this.f114185b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ValidateBlocks(editingBlockUuid="), this.f114185b, ')');
        }
    }
}
