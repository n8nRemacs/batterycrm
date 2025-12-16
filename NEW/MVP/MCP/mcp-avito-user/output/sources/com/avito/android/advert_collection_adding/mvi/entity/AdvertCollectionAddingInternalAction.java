package com.avito.android.advert_collection_adding.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionAddingInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddedToCollection", "CloseDialog", "CollectionCreated", "CollectionListLoaded", "CollectionListLoadingError", "CollectionListStartLoading", "CollectionNameChanged", "Loading", "ShowCreateCollectionScreen", "ShowError", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$AddedToCollection;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CloseDialog;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionCreated;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionListLoaded;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionListLoadingError;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionListStartLoading;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionNameChanged;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$Loading;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$ShowCreateCollectionScreen;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$ShowError;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertCollectionAddingInternalAction extends n {

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$AddedToCollection;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddedToCollection implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f81878b;

        public AddedToCollection(@k DeepLink deepLink) {
            this.f81878b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddedToCollection) && L.f(this.f81878b, ((AddedToCollection) obj).f81878b);
        }

        public final int hashCode() {
            return this.f81878b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("AddedToCollection(deepLink="), this.f81878b, ')');
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CloseDialog;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseDialog implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f81879b = new CloseDialog();

        private CloseDialog() {
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionCreated;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionCreated implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CreateAdvertCollectionResult.Created f81880b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f81881c;

        public CollectionCreated(@k CreateAdvertCollectionResult.Created created, boolean z12) {
            this.f81880b = created;
            this.f81881c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionCreated)) {
                return false;
            }
            CollectionCreated collectionCreated = (CollectionCreated) obj;
            return L.f(this.f81880b, collectionCreated.f81880b) && this.f81881c == collectionCreated.f81881c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f81881c) + (this.f81880b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionCreated(collection=");
            sb2.append(this.f81880b);
            sb2.append(", closeDialog=");
            return r.x(sb2, this.f81881c, ')');
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionListLoaded;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionListLoaded implements AdvertCollectionAddingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f81882b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f81883c;

        public CollectionListLoaded(@k ArrayList arrayList, boolean z12) {
            this.f81882b = z12;
            this.f81883c = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            if (!(obj instanceof CollectionListLoaded)) {
                return false;
            }
            CollectionListLoaded collectionListLoaded = (CollectionListLoaded) obj;
            return this.f81882b == collectionListLoaded.f81882b && this.f81883c.equals(collectionListLoaded.f81883c);
        }

        public final int hashCode() {
            return this.f81883c.hashCode() + (Boolean.hashCode(this.f81882b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionListLoaded(isFirstCollectionCreated=");
            sb2.append(this.f81882b);
            sb2.append(", items=");
            return e.p(sb2, this.f81883c, ')');
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionListLoadingError;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionListLoadingError implements AdvertCollectionAddingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f81884b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f81885c;

        public CollectionListLoadingError(@k ApiError apiError) {
            this.f81884b = apiError;
            this.f81885c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof CollectionListLoadingError) && L.f(this.f81884b, ((CollectionListLoadingError) obj).f81884b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF320446c() {
            return this.f81885c;
        }

        public final int hashCode() {
            return this.f81884b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CollectionListLoadingError(error="), this.f81884b, ')');
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionListStartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CollectionListStartLoading extends TrackableLoadingStarted implements AdvertCollectionAddingInternalAction {
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$CollectionNameChanged;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionNameChanged implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81886b;

        public CollectionNameChanged(@k String str) {
            this.f81886b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionNameChanged) && L.f(this.f81886b, ((CollectionNameChanged) obj).f81886b);
        }

        public final int hashCode() {
            return this.f81886b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CollectionNameChanged(name="), this.f81886b, ')');
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$Loading;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f81887b = new Loading();

        private Loading() {
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$ShowCreateCollectionScreen;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowCreateCollectionScreen implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowCreateCollectionScreen f81888b = new ShowCreateCollectionScreen();

        private ShowCreateCollectionScreen() {
        }
    }

    /* compiled from: AdvertCollectionAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction$ShowError;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements AdvertCollectionAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81889b;

        public ShowError(@k String str) {
            this.f81889b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f81889b, ((ShowError) obj).f81889b);
        }

        public final int hashCode() {
            return this.f81889b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(text="), this.f81889b, ')');
        }
    }
}
