package com.avito.android.autoteka.presentation.previewsearch.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.autoteka.items.fullScreenError.previewsearch.PreviewSearchFullScreenErrorItem;
import com.avito.android.autoteka.items.preview.PreviewItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewSearchInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HideKeyboard", "InfoMessage", "InstructionDialog", "NavigateByDeepLink", "OpenPhotoGallery", "Preview", "ServerError", "ShowKeyboard", "SuccessPurchase", "Waiting", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$HideKeyboard;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$InfoMessage;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$InstructionDialog;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$NavigateByDeepLink;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$OpenPhotoGallery;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$Preview;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$ServerError;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$ShowKeyboard;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$SuccessPurchase;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$Waiting;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaPreviewSearchInternalAction extends n {

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$HideKeyboard;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideKeyboard implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f97618b = new HideKeyboard();

        private HideKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return 1227035426;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$InfoMessage;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoMessage implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreviewSearchFullScreenErrorItem f97619b;

        public InfoMessage(@k PreviewSearchFullScreenErrorItem previewSearchFullScreenErrorItem) {
            this.f97619b = previewSearchFullScreenErrorItem;
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$InstructionDialog;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InstructionDialog implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InstructionDialog f97620b = new InstructionDialog();

        private InstructionDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InstructionDialog);
        }

        public final int hashCode() {
            return 909964093;
        }

        @k
        public final String toString() {
            return "InstructionDialog";
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$NavigateByDeepLink;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateByDeepLink implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f97621b;

        public NavigateByDeepLink(@k DeepLink deepLink) {
            this.f97621b = deepLink;
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$OpenPhotoGallery;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhotoGallery implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Image f97622b;

        public OpenPhotoGallery(@k Image image) {
            this.f97622b = image;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPhotoGallery) && L.f(this.f97622b, ((OpenPhotoGallery) obj).f97622b);
        }

        public final int hashCode() {
            return this.f97622b.hashCode();
        }

        @k
        public final String toString() {
            return c.o(new StringBuilder("OpenPhotoGallery(image="), this.f97622b, ')');
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$Preview;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Preview implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreviewItem f97623b;

        public Preview(@k PreviewItem previewItem) {
            this.f97623b = previewItem;
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$ServerError;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServerError implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97624b;

        public ServerError(@k ApiError apiError) {
            this.f97624b = apiError;
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$ShowKeyboard;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowKeyboard implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowKeyboard f97625b = new ShowKeyboard();

        private ShowKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowKeyboard);
        }

        public final int hashCode() {
            return -187161123;
        }

        @k
        public final String toString() {
            return "ShowKeyboard";
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$SuccessPurchase;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessPurchase implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SuccessPurchase f97626b = new SuccessPurchase();

        private SuccessPurchase() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SuccessPurchase);
        }

        public final int hashCode() {
            return -1962771541;
        }

        @k
        public final String toString() {
            return "SuccessPurchase";
        }
    }

    /* compiled from: AutotekaPreviewSearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$Waiting;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Waiting implements AutotekaPreviewSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f97627b;

        public Waiting(@l String str) {
            this.f97627b = str;
        }
    }
}
