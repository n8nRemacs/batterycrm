package com.avito.android.edit_basic_info.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ky.d;

/* compiled from: EditBasicInfoInternalAction.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AvatarDeletionFailure", "AvatarDeletionStarted", "AvatarDeletionSuccess", "AvatarUploadCancel", "AvatarUploadFailure", "AvatarUploadStarted", "AvatarUploadSuccess", "Close", "CloseActionsBottomMenu", "IncorrectValuesError", "InitState", "Loading", "NameInputText", "OnSellerTypeChanged", "OnSpecificUpdated", "OnVerticalAndSpecificUpdated", "OpenAvatarMenu", "OpenAvatarPicker", "OpenSellerTypeEditor", "PersonalLinkInputText", "SavingError", "SubmitSuccess", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarDeletionFailure;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarDeletionStarted;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarDeletionSuccess;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadCancel;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadFailure;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadStarted;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadSuccess;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$Close;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$CloseActionsBottomMenu;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$IncorrectValuesError;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$InitState;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$Loading;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$NameInputText;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OnSellerTypeChanged;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OnSpecificUpdated;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OnVerticalAndSpecificUpdated;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OpenAvatarMenu;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OpenAvatarPicker;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OpenSellerTypeEditor;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$PersonalLinkInputText;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$SavingError;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$SubmitSuccess;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EditBasicInfoInternalAction extends n {

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarDeletionFailure;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarDeletionFailure implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f146131b;

        public AvatarDeletionFailure(@k Throwable th2) {
            this.f146131b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarDeletionFailure) && L.f(this.f146131b, ((AvatarDeletionFailure) obj).f146131b);
        }

        public final int hashCode() {
            return this.f146131b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("AvatarDeletionFailure(error="), this.f146131b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarDeletionStarted;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarDeletionStarted implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AvatarDeletionStarted f146132b = new AvatarDeletionStarted();

        private AvatarDeletionStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AvatarDeletionStarted);
        }

        public final int hashCode() {
            return 817402617;
        }

        @k
        public final String toString() {
            return "AvatarDeletionStarted";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarDeletionSuccess;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarDeletionSuccess implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Image f146133b;

        public AvatarDeletionSuccess(@l Image image) {
            this.f146133b = image;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarDeletionSuccess) && L.f(this.f146133b, ((AvatarDeletionSuccess) obj).f146133b);
        }

        public final int hashCode() {
            Image image = this.f146133b;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @k
        public final String toString() {
            return c.o(new StringBuilder("AvatarDeletionSuccess(newAvatarImage="), this.f146133b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadCancel;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarUploadCancel implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f146134b;

        public AvatarUploadCancel(@k Uri uri) {
            this.f146134b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarUploadCancel) && L.f(this.f146134b, ((AvatarUploadCancel) obj).f146134b);
        }

        public final int hashCode() {
            return this.f146134b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("AvatarUploadCancel(avatarUri="), this.f146134b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadFailure;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarUploadFailure implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f146135b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Uri f146136c;

        public AvatarUploadFailure(@k Uri uri, @k Throwable th2) {
            this.f146135b = th2;
            this.f146136c = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvatarUploadFailure)) {
                return false;
            }
            AvatarUploadFailure avatarUploadFailure = (AvatarUploadFailure) obj;
            return L.f(this.f146135b, avatarUploadFailure.f146135b) && L.f(this.f146136c, avatarUploadFailure.f146136c);
        }

        public final int hashCode() {
            return this.f146136c.hashCode() + (this.f146135b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarUploadFailure(error=");
            sb2.append(this.f146135b);
            sb2.append(", avatarUri=");
            return a.t(sb2, this.f146136c, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadStarted;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarUploadStarted implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f146137b;

        public AvatarUploadStarted(@k Uri uri) {
            this.f146137b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarUploadStarted) && L.f(this.f146137b, ((AvatarUploadStarted) obj).f146137b);
        }

        public final int hashCode() {
            return this.f146137b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("AvatarUploadStarted(newImageUri="), this.f146137b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$AvatarUploadSuccess;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AvatarUploadSuccess implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Image f146138b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<BasicInfoItem.AvatarAction> f146139c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ModerationStatus f146140d;

        public AvatarUploadSuccess(@l Image image, @k List<BasicInfoItem.AvatarAction> list, @l ModerationStatus moderationStatus) {
            this.f146138b = image;
            this.f146139c = list;
            this.f146140d = moderationStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvatarUploadSuccess)) {
                return false;
            }
            AvatarUploadSuccess avatarUploadSuccess = (AvatarUploadSuccess) obj;
            return L.f(this.f146138b, avatarUploadSuccess.f146138b) && L.f(this.f146139c, avatarUploadSuccess.f146139c) && L.f(this.f146140d, avatarUploadSuccess.f146140d);
        }

        public final int hashCode() {
            Image image = this.f146138b;
            int iE2 = H.e((image == null ? 0 : image.hashCode()) * 31, 31, this.f146139c);
            ModerationStatus moderationStatus = this.f146140d;
            return iE2 + (moderationStatus != null ? moderationStatus.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "AvatarUploadSuccess(avatar=" + this.f146138b + ", newActions=" + this.f146139c + ", status=" + this.f146140d + ')';
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$Close;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f146141b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1240278199;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$CloseActionsBottomMenu;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseActionsBottomMenu implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseActionsBottomMenu f146142b = new CloseActionsBottomMenu();

        private CloseActionsBottomMenu() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseActionsBottomMenu);
        }

        public final int hashCode() {
            return -165928176;
        }

        @k
        public final String toString() {
            return "CloseActionsBottomMenu";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$IncorrectValuesError;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectValuesError implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f146143b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f146144c;

        public IncorrectValuesError(@l String str, @l String str2) {
            this.f146143b = str;
            this.f146144c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IncorrectValuesError)) {
                return false;
            }
            IncorrectValuesError incorrectValuesError = (IncorrectValuesError) obj;
            return L.f(this.f146143b, incorrectValuesError.f146143b) && L.f(this.f146144c, incorrectValuesError.f146144c);
        }

        public final int hashCode() {
            String str = this.f146143b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f146144c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IncorrectValuesError(name=");
            sb2.append(this.f146143b);
            sb2.append(", personalLink=");
            return C22026a.c(sb2, this.f146144c, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$InitState;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitState f146145b = new InitState();

        private InitState() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitState);
        }

        public final int hashCode() {
            return -1649219424;
        }

        @k
        public final String toString() {
            return "InitState";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$Loading;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f146146b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1671525435;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$NameInputText;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NameInputText implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146147b;

        public NameInputText(@k String str) {
            this.f146147b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameInputText) && L.f(this.f146147b, ((NameInputText) obj).f146147b);
        }

        public final int hashCode() {
            return this.f146147b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameInputText(text="), this.f146147b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OnSellerTypeChanged;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSellerTypeChanged implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f146148b;

        public OnSellerTypeChanged(@k d dVar) {
            this.f146148b = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSellerTypeChanged) && L.f(this.f146148b, ((OnSellerTypeChanged) obj).f146148b);
        }

        public final int hashCode() {
            return this.f146148b.hashCode();
        }

        @k
        public final String toString() {
            return "OnSellerTypeChanged(type=" + this.f146148b + ')';
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OnSpecificUpdated;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSpecificUpdated implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f146149b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f146150c;

        public OnSpecificUpdated(int i12, @k String str) {
            this.f146149b = i12;
            this.f146150c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSpecificUpdated)) {
                return false;
            }
            OnSpecificUpdated onSpecificUpdated = (OnSpecificUpdated) obj;
            return this.f146149b == onSpecificUpdated.f146149b && L.f(this.f146150c, onSpecificUpdated.f146150c);
        }

        public final int hashCode() {
            return this.f146150c.hashCode() + (Integer.hashCode(this.f146149b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSpecificUpdated(specificId=");
            sb2.append(this.f146149b);
            sb2.append(", specificTitle=");
            return C22026a.c(sb2, this.f146150c, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OnVerticalAndSpecificUpdated;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnVerticalAndSpecificUpdated implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f146151b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f146152c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f146153d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f146154e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f146155f;

        public OnVerticalAndSpecificUpdated(int i12, @l Integer num, @k String str, @l String str2, boolean z12) {
            this.f146151b = i12;
            this.f146152c = str;
            this.f146153d = num;
            this.f146154e = str2;
            this.f146155f = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnVerticalAndSpecificUpdated)) {
                return false;
            }
            OnVerticalAndSpecificUpdated onVerticalAndSpecificUpdated = (OnVerticalAndSpecificUpdated) obj;
            return this.f146151b == onVerticalAndSpecificUpdated.f146151b && L.f(this.f146152c, onVerticalAndSpecificUpdated.f146152c) && L.f(this.f146153d, onVerticalAndSpecificUpdated.f146153d) && L.f(this.f146154e, onVerticalAndSpecificUpdated.f146154e) && this.f146155f == onVerticalAndSpecificUpdated.f146155f;
        }

        public final int hashCode() {
            int iD2 = H.d(Integer.hashCode(this.f146151b) * 31, 31, this.f146152c);
            Integer num = this.f146153d;
            int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f146154e;
            return Boolean.hashCode(this.f146155f) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnVerticalAndSpecificUpdated(verticalId=");
            sb2.append(this.f146151b);
            sb2.append(", verticalTitle=");
            sb2.append(this.f146152c);
            sb2.append(", specificId=");
            sb2.append(this.f146153d);
            sb2.append(", specificTitle=");
            sb2.append(this.f146154e);
            sb2.append(", hasMultipleSpecifics=");
            return r.x(sb2, this.f146155f, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OpenAvatarMenu;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAvatarMenu implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAvatarMenu f146156b = new OpenAvatarMenu();

        private OpenAvatarMenu() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAvatarMenu);
        }

        public final int hashCode() {
            return -1645083549;
        }

        @k
        public final String toString() {
            return "OpenAvatarMenu";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OpenAvatarPicker;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAvatarPicker implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAvatarPicker f146157b = new OpenAvatarPicker();

        private OpenAvatarPicker() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAvatarPicker);
        }

        public final int hashCode() {
            return -288078190;
        }

        @k
        public final String toString() {
            return "OpenAvatarPicker";
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$OpenSellerTypeEditor;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSellerTypeEditor implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f146158b;

        public OpenSellerTypeEditor(@k d dVar) {
            this.f146158b = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSellerTypeEditor) && L.f(this.f146158b, ((OpenSellerTypeEditor) obj).f146158b);
        }

        public final int hashCode() {
            return this.f146158b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSellerTypeEditor(type=" + this.f146158b + ')';
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$PersonalLinkInputText;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PersonalLinkInputText implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146159b;

        public PersonalLinkInputText(@k String str) {
            this.f146159b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PersonalLinkInputText) && L.f(this.f146159b, ((PersonalLinkInputText) obj).f146159b);
        }

        public final int hashCode() {
            return this.f146159b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PersonalLinkInputText(text="), this.f146159b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$SavingError;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavingError implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f146160b;

        public SavingError(@k Throwable th2) {
            this.f146160b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavingError) && L.f(this.f146160b, ((SavingError) obj).f146160b);
        }

        public final int hashCode() {
            return this.f146160b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SavingError(throwable="), this.f146160b, ')');
        }
    }

    /* compiled from: EditBasicInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction$SubmitSuccess;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitSuccess implements EditBasicInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f146161b;

        public SubmitSuccess(@l String str) {
            this.f146161b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitSuccess)) {
                return false;
            }
            SubmitSuccess submitSuccess = (SubmitSuccess) obj;
            submitSuccess.getClass();
            return L.f(this.f146161b, submitSuccess.f146161b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(true) * 31;
            String str = this.f146161b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SubmitSuccess(isChanged=true, message="), this.f146161b, ')');
        }
    }
}
