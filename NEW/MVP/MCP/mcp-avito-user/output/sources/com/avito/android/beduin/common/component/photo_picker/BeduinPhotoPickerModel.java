package com.avito.android.beduin.common.component.photo_picker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.PhotoPickerTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import j.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhotoPickerModel.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000b:;<=>?@ABCDB\u0097\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109¨\u0006E"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "staticImages", "userImages", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PickerSettings;", "pickerSettings", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$AddImageButton;", "addImageButton", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$LayoutSettings;", "layoutSettings", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageUploadParams;", "imageUploadParams", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "defaultControlButton", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints;", "constraints", "", "errorToastRes", "localId", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ErrorState;", "errorState", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PickerSettings;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$AddImageButton;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$LayoutSettings;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageUploadParams;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ErrorState;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Ljava/util/List;", "k", "()Ljava/util/List;", "l", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PickerSettings;", "j", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PickerSettings;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$AddImageButton;", "e", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$AddImageButton;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$LayoutSettings;", "i", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$LayoutSettings;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageUploadParams;", "h", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageUploadParams;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "g", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints;", "f", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints;", "ActionType", "AddImageButton", "ControlButton", "ErrorState", "ImageDeleteParams", "ImageUploadParams", "LayoutSettings", "PhotoPickerConstraints", "PhotoPickerImage", "PickerSettings", "UploadSizeImage", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPhotoPickerModel extends LeafBeduinModel implements com.avito.android.beduin.common.component.q {

    @Y61.k
    public static final Parcelable.Creator<BeduinPhotoPickerModel> CREATOR = new a();

    @com.google.gson.annotations.c("addImageButton")
    @Y61.l
    private final AddImageButton addImageButton;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final transient Integer f101912b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final transient String f101913c;

    @com.google.gson.annotations.c("constraints")
    @Y61.l
    private final PhotoPickerConstraints constraints;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final transient ErrorState f101914d;

    @com.google.gson.annotations.c("defaultControlButton")
    @Y61.l
    private final ControlButton defaultControlButton;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("imageUploadParams")
    @Y61.l
    private final ImageUploadParams imageUploadParams;

    @com.google.gson.annotations.c("layoutSettings")
    @Y61.k
    private final LayoutSettings layoutSettings;

    @com.google.gson.annotations.c("pickerSettings")
    @Y61.k
    private final PickerSettings pickerSettings;

    @com.google.gson.annotations.c("staticImages")
    @Y61.l
    private final List<PhotoPickerImage> staticImages;

    @com.google.gson.annotations.c("userImages")
    @Y61.l
    private final List<PhotoPickerImage> userImages;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ActionType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "EDIT", "DELETE", "NONE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class ActionType implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ActionType> CREATOR;

        @com.google.gson.annotations.c("delete")
        public static final ActionType DELETE;

        @com.google.gson.annotations.c("edit")
        public static final ActionType EDIT;

        @com.google.gson.annotations.c("none")
        public static final ActionType NONE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f101916b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101917c;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActionType> {
            @Override // android.os.Parcelable.Creator
            public final ActionType createFromParcel(Parcel parcel) {
                return ActionType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionType[] newArray(int i12) {
                return new ActionType[i12];
            }
        }

        static {
            ActionType actionType = new ActionType("EDIT", 0);
            EDIT = actionType;
            ActionType actionType2 = new ActionType("DELETE", 1);
            DELETE = actionType2;
            ActionType actionType3 = new ActionType("NONE", 2);
            NONE = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            f101916b = actionTypeArr;
            f101917c = kotlin.enums.c.a(actionTypeArr);
            CREATOR = new a();
        }

        private ActionType(String str, int i12) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f101916b.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$AddImageButton;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddImageButton implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AddImageButton> CREATOR = new a();

        @com.google.gson.annotations.c("onTapActions")
        @Y61.l
        private final List<BeduinAction> onTapActions;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddImageButton> {
            @Override // android.os.Parcelable.Creator
            public final AddImageButton createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(AddImageButton.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AddImageButton(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AddImageButton[] newArray(int i12) {
                return new AddImageButton[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddImageButton(@Y61.l List<? extends BeduinAction> list) {
            this.onTapActions = list;
        }

        @Y61.l
        public final List<BeduinAction> c() {
            return this.onTapActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddImageButton) && L.f(this.onTapActions, ((AddImageButton) obj).onTapActions);
        }

        public final int hashCode() {
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("AddImageButton(onTapActions="), this.onTapActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ActionType;", "actionType", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ActionType;Ljava/util/List;)V", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ActionType;", "c", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ActionType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ControlButton implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ControlButton> CREATOR = new a();

        @com.google.gson.annotations.c("actionType")
        @Y61.k
        private final ActionType actionType;

        @com.google.gson.annotations.c("onTapActions")
        @Y61.l
        private final List<BeduinAction> onTapActions;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ControlButton> {
            @Override // android.os.Parcelable.Creator
            public final ControlButton createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ActionType actionTypeCreateFromParcel = ActionType.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ControlButton.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ControlButton(actionTypeCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ControlButton[] newArray(int i12) {
                return new ControlButton[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ControlButton(@Y61.k ActionType actionType, @Y61.l List<? extends BeduinAction> list) {
            this.actionType = actionType;
            this.onTapActions = list;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        @Y61.l
        public final List<BeduinAction> d() {
            return this.onTapActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ControlButton)) {
                return false;
            }
            ControlButton controlButton = (ControlButton) obj;
            return this.actionType == controlButton.actionType && L.f(this.onTapActions, controlButton.onTapActions);
        }

        public final int hashCode() {
            int iHashCode = this.actionType.hashCode() * 31;
            List<BeduinAction> list = this.onTapActions;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ControlButton(actionType=");
            sb2.append(this.actionType);
            sb2.append(", onTapActions=");
            return H.p(sb2, this.onTapActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.actionType.writeToParcel(parcel, i12);
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ErrorState;", "Landroid/os/Parcelable;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ErrorState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f101918b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f101919c;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorState> {
            @Override // android.os.Parcelable.Creator
            public final ErrorState createFromParcel(Parcel parcel) {
                return new ErrorState(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorState[] newArray(int i12) {
                return new ErrorState[i12];
            }
        }

        public ErrorState(boolean z12, @Y61.l String str) {
            this.f101918b = z12;
            this.f101919c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorState)) {
                return false;
            }
            ErrorState errorState = (ErrorState) obj;
            return this.f101918b == errorState.f101918b && L.f(this.f101919c, errorState.f101919c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f101918b) * 31;
            String str = this.f101919c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorState(highlightBorderError=");
            sb2.append(this.f101918b);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f101919c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f101918b ? 1 : 0);
            parcel.writeString(this.f101919c);
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR-\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "Landroid/os/Parcelable;", "", "path", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "Lcom/avito/android/beduin_models/BeduinAction;", "onFailActions", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageDeleteParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ImageDeleteParams> CREATOR = new a();

        @com.google.gson.annotations.c("onFailActions")
        @Y61.l
        private final List<BeduinAction> onFailActions;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @Y61.l
        private final Map<String, Object> parameters;

        @com.google.gson.annotations.c("path")
        @Y61.k
        private final String path;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageDeleteParams> {
            @Override // android.os.Parcelable.Creator
            public final ImageDeleteParams createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                int iL2 = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = org.webrtc.h.c(ImageDeleteParams.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(ImageDeleteParams.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new ImageDeleteParams(string, linkedHashMap, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ImageDeleteParams[] newArray(int i12) {
                return new ImageDeleteParams[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ImageDeleteParams(@Y61.k String str, @Y61.l Map<String, ? extends Object> map, @Y61.l List<? extends BeduinAction> list) {
            this.path = str;
            this.parameters = map;
            this.onFailActions = list;
        }

        @Y61.l
        public final List<BeduinAction> c() {
            return this.onFailActions;
        }

        @Y61.l
        public final Map<String, Object> d() {
            return this.parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageDeleteParams)) {
                return false;
            }
            ImageDeleteParams imageDeleteParams = (ImageDeleteParams) obj;
            return L.f(this.path, imageDeleteParams.path) && L.f(this.parameters, imageDeleteParams.parameters) && L.f(this.onFailActions, imageDeleteParams.onFailActions);
        }

        @Y61.k
        public final String getPath() {
            return this.path;
        }

        public final int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            Map<String, Object> map = this.parameters;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            List<BeduinAction> list = this.onFailActions;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageDeleteParams(path=");
            sb2.append(this.path);
            sb2.append(", parameters=");
            sb2.append(this.parameters);
            sb2.append(", onFailActions=");
            return H.p(sb2, this.onFailActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.path);
            Map<String, Object> map = this.parameters;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            List<BeduinAction> list = this.onFailActions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R-\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageUploadParams;", "Landroid/os/Parcelable;", "", "path", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "Lcom/avito/android/beduin_models/BeduinAction;", "onFailActions", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$UploadSizeImage;", "size", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$UploadSizeImage;)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$UploadSizeImage;", "e", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$UploadSizeImage;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageUploadParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ImageUploadParams> CREATOR = new a();

        @com.google.gson.annotations.c("onFailActions")
        @Y61.l
        private final List<BeduinAction> onFailActions;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @Y61.l
        private final Map<String, Object> parameters;

        @com.google.gson.annotations.c("path")
        @Y61.k
        private final String path;

        @com.google.gson.annotations.c("uploadSizeImage")
        @Y61.l
        private final UploadSizeImage size;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageUploadParams> {
            @Override // android.os.Parcelable.Creator
            public final ImageUploadParams createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                ArrayList arrayList;
                String string = parcel.readString();
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = org.webrtc.h.c(ImageUploadParams.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(ImageUploadParams.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new ImageUploadParams(string, linkedHashMap, arrayList, parcel.readInt() != 0 ? UploadSizeImage.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final ImageUploadParams[] newArray(int i12) {
                return new ImageUploadParams[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ImageUploadParams(@Y61.k String str, @Y61.l Map<String, ? extends Object> map, @Y61.l List<? extends BeduinAction> list, @Y61.l UploadSizeImage uploadSizeImage) {
            this.path = str;
            this.parameters = map;
            this.onFailActions = list;
            this.size = uploadSizeImage;
        }

        @Y61.l
        public final List<BeduinAction> c() {
            return this.onFailActions;
        }

        @Y61.l
        public final Map<String, Object> d() {
            return this.parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final UploadSizeImage getSize() {
            return this.size;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageUploadParams)) {
                return false;
            }
            ImageUploadParams imageUploadParams = (ImageUploadParams) obj;
            return L.f(this.path, imageUploadParams.path) && L.f(this.parameters, imageUploadParams.parameters) && L.f(this.onFailActions, imageUploadParams.onFailActions) && L.f(this.size, imageUploadParams.size);
        }

        @Y61.k
        public final String getPath() {
            return this.path;
        }

        public final int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            Map<String, Object> map = this.parameters;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            List<BeduinAction> list = this.onFailActions;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            UploadSizeImage uploadSizeImage = this.size;
            return iHashCode3 + (uploadSizeImage != null ? uploadSizeImage.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ImageUploadParams(path=" + this.path + ", parameters=" + this.parameters + ", onFailActions=" + this.onFailActions + ", size=" + this.size + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.path);
            Map<String, Object> map = this.parameters;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            List<BeduinAction> list = this.onFailActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            UploadSizeImage uploadSizeImage = this.size;
            if (uploadSizeImage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uploadSizeImage.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$LayoutSettings;", "Landroid/os/Parcelable;", "", "_imagesPerRow", "<init>", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LayoutSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<LayoutSettings> CREATOR = new a();

        @com.google.gson.annotations.c("imagesPerRow")
        @Y61.l
        private final Integer _imagesPerRow;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LayoutSettings> {
            @Override // android.os.Parcelable.Creator
            public final LayoutSettings createFromParcel(Parcel parcel) {
                return new LayoutSettings(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutSettings[] newArray(int i12) {
                return new LayoutSettings[i12];
            }
        }

        public LayoutSettings(@Y61.l Integer num) {
            this._imagesPerRow = num;
        }

        public final int c() {
            Integer num = this._imagesPerRow;
            if (num != null) {
                return num.intValue();
            }
            return 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LayoutSettings) && L.f(this._imagesPerRow, ((LayoutSettings) obj)._imagesPerRow);
        }

        public final int hashCode() {
            Integer num = this._imagesPerRow;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.akita.compose.component.accordion.s.j(new StringBuilder("LayoutSettings(_imagesPerRow="), this._imagesPerRow, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Integer num = this._imagesPerRow;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u0012\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u0012\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PickerSettings;", "Landroid/os/Parcelable;", "", "_minImageCount", "_maxImageCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "get_minImageCount$annotations", "()V", "get_maxImageCount$annotations", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PickerSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PickerSettings> CREATOR = new a();

        @com.google.gson.annotations.c("maxImageCount")
        @Y61.l
        private final Integer _maxImageCount;

        @com.google.gson.annotations.c("minImageCount")
        @Y61.l
        private final Integer _minImageCount;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PickerSettings> {
            @Override // android.os.Parcelable.Creator
            public final PickerSettings createFromParcel(Parcel parcel) {
                return new PickerSettings(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PickerSettings[] newArray(int i12) {
                return new PickerSettings[i12];
            }
        }

        public PickerSettings(@Y61.l Integer num, @Y61.l Integer num2) {
            this._minImageCount = num;
            this._maxImageCount = num2;
        }

        public final int c() {
            Integer num = this._maxImageCount;
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }

        public final int d() {
            Integer num = this._minImageCount;
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickerSettings)) {
                return false;
            }
            PickerSettings pickerSettings = (PickerSettings) obj;
            return L.f(this._minImageCount, pickerSettings._minImageCount) && L.f(this._maxImageCount, pickerSettings._maxImageCount);
        }

        public final int hashCode() {
            Integer num = this._minImageCount;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this._maxImageCount;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PickerSettings(_minImageCount=");
            sb2.append(this._minImageCount);
            sb2.append(", _maxImageCount=");
            return com.akita.compose.component.accordion.s.j(sb2, this._maxImageCount, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Integer num = this._minImageCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this._maxImageCount;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$UploadSizeImage;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(II)V", "I", "getWidth", "()I", "getHeight", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadSizeImage implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<UploadSizeImage> CREATOR = new a();

        @com.google.gson.annotations.c("height")
        private final int height;

        @com.google.gson.annotations.c("width")
        private final int width;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UploadSizeImage> {
            @Override // android.os.Parcelable.Creator
            public final UploadSizeImage createFromParcel(Parcel parcel) {
                return new UploadSizeImage(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final UploadSizeImage[] newArray(int i12) {
                return new UploadSizeImage[i12];
            }
        }

        public UploadSizeImage(int i12, int i13) {
            this.width = i12;
            this.height = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinPhotoPickerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPhotoPickerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinPhotoPickerModel.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(PhotoPickerImage.CREATOR, parcel, arrayList3, iC3, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(PhotoPickerImage.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new BeduinPhotoPickerModel(string, displayingPredicate, arrayList, arrayList2, PickerSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AddImageButton.CREATOR.createFromParcel(parcel), LayoutSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageUploadParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ControlButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PhotoPickerConstraints.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? ErrorState.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPhotoPickerModel[] newArray(int i12) {
            return new BeduinPhotoPickerModel[i12];
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<PhotoPickerImage, PhotoPickerImage> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinModelTransform f101929l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BeduinModelTransform beduinModelTransform) {
            super(1);
            this.f101929l = beduinModelTransform;
        }

        @Override // Y41.l
        public final PhotoPickerImage invoke(PhotoPickerImage photoPickerImage) {
            PhotoPickerImage photoPickerImage2 = photoPickerImage;
            PhotoPickerTransform.UserImage userImage = (PhotoPickerTransform.UserImage) this.f101929l;
            return PhotoPickerImage.a(photoPickerImage2, userImage.f103396c, userImage.f103397d, userImage.f103398e, userImage.f103400g, userImage.f103401h, null, userImage.f103399f, null, 7076);
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<PhotoPickerImage, PhotoPickerImage> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinModelTransform f101930l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BeduinModelTransform beduinModelTransform) {
            super(1);
            this.f101930l = beduinModelTransform;
        }

        @Override // Y41.l
        public final PhotoPickerImage invoke(PhotoPickerImage photoPickerImage) {
            return PhotoPickerImage.a(photoPickerImage, null, null, null, null, null, null, ((PhotoPickerTransform.PhotoLoadingState) this.f101930l).f103394c, null, 7167);
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<PhotoPickerImage, PhotoPickerImage> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final PhotoPickerImage invoke(PhotoPickerImage photoPickerImage) {
            PhotoPickerConstraints.MinSizeConstraint minSize;
            PhotoPickerImage photoPickerImage2 = photoPickerImage;
            PhotoPickerImage.LoadingState.Error error = new PhotoPickerImage.LoadingState.Error(false);
            PhotoPickerConstraints constraints = BeduinPhotoPickerModel.this.getConstraints();
            return PhotoPickerImage.a(photoPickerImage2, null, null, null, new ControlButton(ActionType.DELETE, null), null, null, error, new ErrorState(true, (constraints == null || (minSize = constraints.getMinSize()) == null) ? null : minSize.getErrorMessage()), 3055);
        }
    }

    public /* synthetic */ BeduinPhotoPickerModel(String str, DisplayingPredicate displayingPredicate, List list, List list2, PickerSettings pickerSettings, AddImageButton addImageButton, LayoutSettings layoutSettings, ImageUploadParams imageUploadParams, ControlButton controlButton, PhotoPickerConstraints photoPickerConstraints, Integer num, String str2, ErrorState errorState, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : displayingPredicate, list, list2, pickerSettings, addImageButton, layoutSettings, imageUploadParams, controlButton, photoPickerConstraints, (i12 & 1024) != 0 ? null : num, (i12 & 2048) != 0 ? null : str2, (i12 & 4096) != 0 ? null : errorState);
    }

    public static BeduinPhotoPickerModel d(BeduinPhotoPickerModel beduinPhotoPickerModel, DisplayingPredicate displayingPredicate, ArrayList arrayList, ArrayList arrayList2, PhotoPickerConstraints photoPickerConstraints, Integer num, String str, ErrorState errorState, int i12) {
        String str2 = beduinPhotoPickerModel.id;
        DisplayingPredicate displayingPredicate2 = (i12 & 2) != 0 ? beduinPhotoPickerModel.displayingPredicate : displayingPredicate;
        List<PhotoPickerImage> list = (i12 & 4) != 0 ? beduinPhotoPickerModel.staticImages : arrayList;
        List<PhotoPickerImage> list2 = (i12 & 8) != 0 ? beduinPhotoPickerModel.userImages : arrayList2;
        PickerSettings pickerSettings = beduinPhotoPickerModel.pickerSettings;
        AddImageButton addImageButton = beduinPhotoPickerModel.addImageButton;
        LayoutSettings layoutSettings = beduinPhotoPickerModel.layoutSettings;
        ImageUploadParams imageUploadParams = beduinPhotoPickerModel.imageUploadParams;
        ControlButton controlButton = beduinPhotoPickerModel.defaultControlButton;
        PhotoPickerConstraints photoPickerConstraints2 = (i12 & 512) != 0 ? beduinPhotoPickerModel.constraints : photoPickerConstraints;
        Integer num2 = (i12 & 1024) != 0 ? beduinPhotoPickerModel.f101912b : num;
        String str3 = (i12 & 2048) != 0 ? beduinPhotoPickerModel.f101913c : str;
        ErrorState errorState2 = (i12 & 4096) != 0 ? beduinPhotoPickerModel.f101914d : errorState;
        beduinPhotoPickerModel.getClass();
        return new BeduinPhotoPickerModel(str2, displayingPredicate2, list, list2, pickerSettings, addImageButton, layoutSettings, imageUploadParams, controlButton, photoPickerConstraints2, num2, str3, errorState2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final BeduinModel apply(@Y61.k BeduinModelTransform beduinModelTransform) {
        ArrayList arrayList;
        if (beduinModelTransform instanceof DisplayPredicateTransform) {
            return d(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, null, null, null, null, null, 8189);
        }
        if (beduinModelTransform instanceof PhotoPickerTransform.UserImages) {
            return d(this, null, null, ((PhotoPickerTransform.UserImages) beduinModelTransform).f103403b, null, null, null, null, 8183);
        }
        if (beduinModelTransform instanceof PhotoPickerTransform.UserImage) {
            return l.a(this, ((PhotoPickerTransform.UserImage) beduinModelTransform).f103395b, new b(beduinModelTransform));
        }
        if (beduinModelTransform instanceof PhotoPickerTransform.PhotoLoadingState) {
            return l.a(this, ((PhotoPickerTransform.PhotoLoadingState) beduinModelTransform).f103393b, new c(beduinModelTransform));
        }
        if (!(beduinModelTransform instanceof PhotoPickerTransform.DeletePhoto)) {
            if (beduinModelTransform instanceof PhotoPickerTransform.ErrorState) {
                return d(this, null, null, null, null, null, null, ((PhotoPickerTransform.ErrorState) beduinModelTransform).f103392b, 4095);
            }
            if (!(beduinModelTransform instanceof PhotoPickerTransform.UserImageMinSizeError)) {
                return this;
            }
            return l.a(this, ((PhotoPickerTransform.UserImageMinSizeError) beduinModelTransform).f103402b, new d());
        }
        List<PhotoPickerImage> list = this.userImages;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Long l12 = ((PhotoPickerImage) obj).f101921c;
                PhotoPickerTransform.DeletePhoto deletePhoto = (PhotoPickerTransform.DeletePhoto) beduinModelTransform;
                if (l12 == null || l12.longValue() != deletePhoto.f103391b) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return d(this, null, null, arrayList, null, null, null, null, 8183);
    }

    public final boolean c() {
        Iterable iterable = this.userImages;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return true;
        }
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = ((PhotoPickerImage) it.next()).f101922d;
            if (parcelable == null) {
                parcelable = PhotoPickerImage.LoadingState.Loaded.f101927b;
            }
            if (!(parcelable instanceof PhotoPickerImage.LoadingState.Loaded)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AddImageButton getAddImageButton() {
        return this.addImageButton;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinPhotoPickerModel)) {
            return false;
        }
        BeduinPhotoPickerModel beduinPhotoPickerModel = (BeduinPhotoPickerModel) obj;
        return L.f(this.id, beduinPhotoPickerModel.id) && L.f(this.displayingPredicate, beduinPhotoPickerModel.displayingPredicate) && L.f(this.staticImages, beduinPhotoPickerModel.staticImages) && L.f(this.userImages, beduinPhotoPickerModel.userImages) && L.f(this.pickerSettings, beduinPhotoPickerModel.pickerSettings) && L.f(this.addImageButton, beduinPhotoPickerModel.addImageButton) && L.f(this.layoutSettings, beduinPhotoPickerModel.layoutSettings) && L.f(this.imageUploadParams, beduinPhotoPickerModel.imageUploadParams) && L.f(this.defaultControlButton, beduinPhotoPickerModel.defaultControlButton) && L.f(this.constraints, beduinPhotoPickerModel.constraints) && L.f(this.f101912b, beduinPhotoPickerModel.f101912b) && L.f(this.f101913c, beduinPhotoPickerModel.f101913c) && L.f(this.f101914d, beduinPhotoPickerModel.f101914d);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final PhotoPickerConstraints getConstraints() {
        return this.constraints;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final ControlButton getDefaultControlButton() {
        return this.defaultControlButton;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF102945c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF102944b() {
        return this.id;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final ImageUploadParams getImageUploadParams() {
        return this.imageUploadParams;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<PhotoPickerImage> list = this.staticImages;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotoPickerImage> list2 = this.userImages;
        int iHashCode4 = (this.pickerSettings.hashCode() + ((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        AddImageButton addImageButton = this.addImageButton;
        int iHashCode5 = (this.layoutSettings.hashCode() + ((iHashCode4 + (addImageButton == null ? 0 : addImageButton.hashCode())) * 31)) * 31;
        ImageUploadParams imageUploadParams = this.imageUploadParams;
        int iHashCode6 = (iHashCode5 + (imageUploadParams == null ? 0 : imageUploadParams.hashCode())) * 31;
        ControlButton controlButton = this.defaultControlButton;
        int iHashCode7 = (iHashCode6 + (controlButton == null ? 0 : controlButton.hashCode())) * 31;
        PhotoPickerConstraints photoPickerConstraints = this.constraints;
        int iHashCode8 = (iHashCode7 + (photoPickerConstraints == null ? 0 : photoPickerConstraints.hashCode())) * 31;
        Integer num = this.f101912b;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f101913c;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        ErrorState errorState = this.f101914d;
        return iHashCode10 + (errorState != null ? errorState.hashCode() : 0);
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final LayoutSettings getLayoutSettings() {
        return this.layoutSettings;
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        PhotoPickerConstraints.MinCountConstraint minCount;
        if (c()) {
            PhotoPickerConstraints photoPickerConstraints = this.constraints;
            if (((photoPickerConstraints == null || (minCount = photoPickerConstraints.getMinCount()) == null) ? null : minCount.a(this)) == null) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    /* renamed from: j, reason: from getter */
    public final PickerSettings getPickerSettings() {
        return this.pickerSettings;
    }

    @Y61.l
    public final List<PhotoPickerImage> k() {
        return this.staticImages;
    }

    @Y61.l
    public final List<PhotoPickerImage> l() {
        return this.userImages;
    }

    @Y61.k
    public final String toString() {
        return "BeduinPhotoPickerModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", staticImages=" + this.staticImages + ", userImages=" + this.userImages + ", pickerSettings=" + this.pickerSettings + ", addImageButton=" + this.addImageButton + ", layoutSettings=" + this.layoutSettings + ", imageUploadParams=" + this.imageUploadParams + ", defaultControlButton=" + this.defaultControlButton + ", constraints=" + this.constraints + ", errorToastRes=" + this.f101912b + ", localId=" + this.f101913c + ", errorState=" + this.f101914d + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.beduin_models.BeduinModel validateModelByConstraints() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel.validateModelByConstraints():com.avito.android.beduin_models.BeduinModel");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        List<PhotoPickerImage> list = this.staticImages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((PhotoPickerImage) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<PhotoPickerImage> list2 = this.userImages;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((PhotoPickerImage) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        this.pickerSettings.writeToParcel(parcel, i12);
        AddImageButton addImageButton = this.addImageButton;
        if (addImageButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addImageButton.writeToParcel(parcel, i12);
        }
        this.layoutSettings.writeToParcel(parcel, i12);
        ImageUploadParams imageUploadParams = this.imageUploadParams;
        if (imageUploadParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageUploadParams.writeToParcel(parcel, i12);
        }
        ControlButton controlButton = this.defaultControlButton;
        if (controlButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            controlButton.writeToParcel(parcel, i12);
        }
        PhotoPickerConstraints photoPickerConstraints = this.constraints;
        if (photoPickerConstraints == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoPickerConstraints.writeToParcel(parcel, i12);
        }
        Integer num = this.f101912b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f101913c);
        ErrorState errorState = this.f101914d;
        if (errorState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            errorState.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinCountConstraint;", "minCount", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MaxCountConstraint;", "maxCount", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinSizeConstraint;", "minSize", "<init>", "(Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinCountConstraint;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MaxCountConstraint;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinSizeConstraint;)V", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinCountConstraint;", "d", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinCountConstraint;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MaxCountConstraint;", "c", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MaxCountConstraint;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinSizeConstraint;", "e", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinSizeConstraint;", "Constraint", "MaxCountConstraint", "MinCountConstraint", "MinSizeConstraint", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PhotoPickerConstraints implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PhotoPickerConstraints> CREATOR = new a();

        @com.google.gson.annotations.c("maxCount")
        @Y61.l
        private final MaxCountConstraint maxCount;

        @com.google.gson.annotations.c("minCount")
        @Y61.l
        private final MinCountConstraint minCount;

        @com.google.gson.annotations.c("minSize")
        @Y61.l
        private final MinSizeConstraint minSize;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$Constraint;", "Landroid/os/Parcelable;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Constraint extends Parcelable {
        }

        /* compiled from: BeduinPhotoPickerModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinSizeConstraint;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$Constraint;", "", "width", "height", "", "errorMessage", "<init>", "(IILjava/lang/String;)V", "I", "getWidth", "()I", "getHeight", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MinSizeConstraint implements Constraint {

            @Y61.k
            public static final Parcelable.Creator<MinSizeConstraint> CREATOR = new a();

            @com.google.gson.annotations.c("errorMessage")
            @Y61.k
            private final String errorMessage;

            @com.google.gson.annotations.c("height")
            private final int height;

            @com.google.gson.annotations.c("width")
            private final int width;

            /* compiled from: BeduinPhotoPickerModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MinSizeConstraint> {
                @Override // android.os.Parcelable.Creator
                public final MinSizeConstraint createFromParcel(Parcel parcel) {
                    return new MinSizeConstraint(parcel.readInt(), parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MinSizeConstraint[] newArray(int i12) {
                    return new MinSizeConstraint[i12];
                }
            }

            public MinSizeConstraint(int i12, int i13, @Y61.k String str) {
                this.width = i12;
                this.height = i13;
                this.errorMessage = str;
            }

            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MinSizeConstraint)) {
                    return false;
                }
                MinSizeConstraint minSizeConstraint = (MinSizeConstraint) obj;
                return this.width == minSizeConstraint.width && this.height == minSizeConstraint.height && L.f(this.errorMessage, minSizeConstraint.errorMessage);
            }

            public final int getHeight() {
                return this.height;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int hashCode() {
                return this.errorMessage.hashCode() + androidx.appcompat.app.r.e(this.height, Integer.hashCode(this.width) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MinSizeConstraint(width=");
                sb2.append(this.width);
                sb2.append(", height=");
                sb2.append(this.height);
                sb2.append(", errorMessage=");
                return C22026a.c(sb2, this.errorMessage, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
                parcel.writeString(this.errorMessage);
            }
        }

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhotoPickerConstraints> {
            @Override // android.os.Parcelable.Creator
            public final PhotoPickerConstraints createFromParcel(Parcel parcel) {
                return new PhotoPickerConstraints(parcel.readInt() == 0 ? null : MinCountConstraint.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MaxCountConstraint.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MinSizeConstraint.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoPickerConstraints[] newArray(int i12) {
                return new PhotoPickerConstraints[i12];
            }
        }

        public PhotoPickerConstraints(@Y61.l MinCountConstraint minCountConstraint, @Y61.l MaxCountConstraint maxCountConstraint, @Y61.l MinSizeConstraint minSizeConstraint) {
            this.minCount = minCountConstraint;
            this.maxCount = maxCountConstraint;
            this.minSize = minSizeConstraint;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final MaxCountConstraint getMaxCount() {
            return this.maxCount;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final MinCountConstraint getMinCount() {
            return this.minCount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final MinSizeConstraint getMinSize() {
            return this.minSize;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhotoPickerConstraints)) {
                return false;
            }
            PhotoPickerConstraints photoPickerConstraints = (PhotoPickerConstraints) obj;
            return L.f(this.minCount, photoPickerConstraints.minCount) && L.f(this.maxCount, photoPickerConstraints.maxCount) && L.f(this.minSize, photoPickerConstraints.minSize);
        }

        public final int hashCode() {
            MinCountConstraint minCountConstraint = this.minCount;
            int iHashCode = (minCountConstraint == null ? 0 : minCountConstraint.hashCode()) * 31;
            MaxCountConstraint maxCountConstraint = this.maxCount;
            int iHashCode2 = (iHashCode + (maxCountConstraint == null ? 0 : maxCountConstraint.hashCode())) * 31;
            MinSizeConstraint minSizeConstraint = this.minSize;
            return iHashCode2 + (minSizeConstraint != null ? minSizeConstraint.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "PhotoPickerConstraints(minCount=" + this.minCount + ", maxCount=" + this.maxCount + ", minSize=" + this.minSize + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            MinCountConstraint minCountConstraint = this.minCount;
            if (minCountConstraint == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                minCountConstraint.writeToParcel(parcel, i12);
            }
            MaxCountConstraint maxCountConstraint = this.maxCount;
            if (maxCountConstraint == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                maxCountConstraint.writeToParcel(parcel, i12);
            }
            MinSizeConstraint minSizeConstraint = this.minSize;
            if (minSizeConstraint == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                minSizeConstraint.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: BeduinPhotoPickerModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MaxCountConstraint;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$Constraint;", "", "value", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "I", "c", "()I", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MaxCountConstraint implements Constraint {

            @Y61.k
            public static final Parcelable.Creator<MaxCountConstraint> CREATOR = new a();

            @com.google.gson.annotations.c("errorMessage")
            @Y61.l
            private final String errorMessage;

            @com.google.gson.annotations.c("value")
            private final int value;

            /* compiled from: BeduinPhotoPickerModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MaxCountConstraint> {
                @Override // android.os.Parcelable.Creator
                public final MaxCountConstraint createFromParcel(Parcel parcel) {
                    return new MaxCountConstraint(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MaxCountConstraint[] newArray(int i12) {
                    return new MaxCountConstraint[i12];
                }
            }

            public MaxCountConstraint(int i12, @Y61.l String str) {
                this.value = i12;
                this.errorMessage = str;
            }

            /* renamed from: c, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MaxCountConstraint)) {
                    return false;
                }
                MaxCountConstraint maxCountConstraint = (MaxCountConstraint) obj;
                return this.value == maxCountConstraint.value && L.f(this.errorMessage, maxCountConstraint.errorMessage);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.value) * 31;
                String str = this.errorMessage;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MaxCountConstraint(value=");
                sb2.append(this.value);
                sb2.append(", errorMessage=");
                return C22026a.c(sb2, this.errorMessage, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.value);
                parcel.writeString(this.errorMessage);
            }

            public /* synthetic */ MaxCountConstraint(int i12, String str, int i13, C42822w c42822w) {
                this(i12, (i13 & 2) != 0 ? null : str);
            }
        }

        /* compiled from: BeduinPhotoPickerModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$MinCountConstraint;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerConstraints$Constraint;", "", "value", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "I", "getValue", "()I", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MinCountConstraint implements Constraint {

            @Y61.k
            public static final Parcelable.Creator<MinCountConstraint> CREATOR = new a();

            @com.google.gson.annotations.c("errorMessage")
            @Y61.l
            private final String errorMessage;

            @com.google.gson.annotations.c("value")
            private final int value;

            /* compiled from: BeduinPhotoPickerModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MinCountConstraint> {
                @Override // android.os.Parcelable.Creator
                public final MinCountConstraint createFromParcel(Parcel parcel) {
                    return new MinCountConstraint(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MinCountConstraint[] newArray(int i12) {
                    return new MinCountConstraint[i12];
                }
            }

            public MinCountConstraint(int i12, @Y61.l String str) {
                this.value = i12;
                this.errorMessage = str;
            }

            @Y61.l
            public final ErrorState a(@Y61.k BeduinPhotoPickerModel beduinPhotoPickerModel) {
                List<PhotoPickerImage> listL = beduinPhotoPickerModel.l();
                if (listL == null) {
                    listL = C42784z0.f406748b;
                }
                if (listL.size() < this.value) {
                    return new ErrorState(true, this.errorMessage);
                }
                return null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MinCountConstraint)) {
                    return false;
                }
                MinCountConstraint minCountConstraint = (MinCountConstraint) obj;
                return this.value == minCountConstraint.value && L.f(this.errorMessage, minCountConstraint.errorMessage);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.value) * 31;
                String str = this.errorMessage;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MinCountConstraint(value=");
                sb2.append(this.value);
                sb2.append(", errorMessage=");
                return C22026a.c(sb2, this.errorMessage, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.value);
                parcel.writeString(this.errorMessage);
            }

            public /* synthetic */ MinCountConstraint(int i12, String str, int i13, C42822w c42822w) {
                this(i12, (i13 & 2) != 0 ? null : str);
            }
        }
    }

    public BeduinPhotoPickerModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<PhotoPickerImage> list, @Y61.l List<PhotoPickerImage> list2, @Y61.k PickerSettings pickerSettings, @Y61.l AddImageButton addImageButton, @Y61.k LayoutSettings layoutSettings, @Y61.l ImageUploadParams imageUploadParams, @Y61.l ControlButton controlButton, @Y61.l PhotoPickerConstraints photoPickerConstraints, @Y61.l @e0 Integer num, @Y61.l String str2, @Y61.l ErrorState errorState) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.staticImages = list;
        this.userImages = list2;
        this.pickerSettings = pickerSettings;
        this.addImageButton = addImageButton;
        this.layoutSettings = layoutSettings;
        this.imageUploadParams = imageUploadParams;
        this.defaultControlButton = controlButton;
        this.constraints = photoPickerConstraints;
        this.f101912b = num;
        this.f101913c = str2;
        this.f101914d = errorState;
    }

    /* compiled from: BeduinPhotoPickerModel.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u00015B²\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R-\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b4\u00100¨\u00066"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/Image;", "urls", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "imageDeleteParams", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "controlButton", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "onSuccessUploadActions", "localImage", "photoStorageId", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState;", "_loadingState", "", "isDeleted", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ErrorState;", "errorState", "<init>", "(Ljava/lang/Long;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState;ZLcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ErrorState;)V", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/Image;", "j", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/UniversalImage;", "i", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "e", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "c", "()Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ControlButton;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "f", "LoadingState", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PhotoPickerImage implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PhotoPickerImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final transient Image f101920b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final transient Long f101921c;

        @com.google.gson.annotations.c("controlButton")
        @Y61.l
        private final ControlButton controlButton;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final transient LoadingState f101922d;

        /* renamed from: e, reason: collision with root package name */
        public final transient boolean f101923e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final transient ErrorState f101924f;

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final Long id;

        @com.google.gson.annotations.c("imageDeleteParams")
        @Y61.l
        private final ImageDeleteParams imageDeleteParams;

        @com.google.gson.annotations.c("onSuccessUploadActions")
        @Y61.l
        private final List<BeduinAction> onSuccessUploadActions;

        @com.google.gson.annotations.c("onTapActions")
        @Y61.l
        private final List<BeduinAction> onTapActions;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @Y61.l
        private final Map<String, Object> parameters;

        @com.google.gson.annotations.c("universalImage")
        @Y61.l
        private final UniversalImage universalImage;

        @com.google.gson.annotations.c("urls")
        @Y61.k
        private final Image urls;

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState;", "Landroid/os/Parcelable;", "()V", "Error", "Loaded", "Loading", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState$Error;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState$Loaded;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState$Loading;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class LoadingState implements Parcelable {

            /* compiled from: BeduinPhotoPickerModel.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState$Error;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Error extends LoadingState {

                @Y61.k
                public static final Parcelable.Creator<Error> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                public final boolean f101926b;

                /* compiled from: BeduinPhotoPickerModel.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Error> {
                    @Override // android.os.Parcelable.Creator
                    public final Error createFromParcel(Parcel parcel) {
                        return new Error(parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Error[] newArray(int i12) {
                        return new Error[i12];
                    }
                }

                public Error(boolean z12) {
                    super(null);
                    this.f101926b = z12;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && this.f101926b == ((Error) obj).f101926b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f101926b);
                }

                @Y61.k
                public final String toString() {
                    return androidx.appcompat.app.r.x(new StringBuilder("Error(needRetry="), this.f101926b, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(this.f101926b ? 1 : 0);
                }
            }

            /* compiled from: BeduinPhotoPickerModel.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState$Loaded;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Loaded extends LoadingState {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Loaded f101927b = new Loaded();

                @Y61.k
                public static final Parcelable.Creator<Loaded> CREATOR = new a();

                /* compiled from: BeduinPhotoPickerModel.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Loaded> {
                    @Override // android.os.Parcelable.Creator
                    public final Loaded createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Loaded.f101927b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Loaded[] newArray(int i12) {
                        return new Loaded[i12];
                    }
                }

                public Loaded() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: BeduinPhotoPickerModel.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState$Loading;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage$LoadingState;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Loading extends LoadingState {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Loading f101928b = new Loading();

                @Y61.k
                public static final Parcelable.Creator<Loading> CREATOR = new a();

                /* compiled from: BeduinPhotoPickerModel.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Loading> {
                    @Override // android.os.Parcelable.Creator
                    public final Loading createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Loading.f101928b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Loading[] newArray(int i12) {
                        return new Loading[i12];
                    }
                }

                public Loading() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            public /* synthetic */ LoadingState(C42822w c42822w) {
                this();
            }

            public LoadingState() {
            }
        }

        /* compiled from: BeduinPhotoPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhotoPickerImage> {
            @Override // android.os.Parcelable.Creator
            public final PhotoPickerImage createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                ArrayList arrayList2;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Image image = (Image) parcel.readParcelable(PhotoPickerImage.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(PhotoPickerImage.class.getClassLoader());
                ImageDeleteParams imageDeleteParamsCreateFromParcel = parcel.readInt() == 0 ? null : ImageDeleteParams.CREATOR.createFromParcel(parcel);
                ControlButton controlButtonCreateFromParcel = parcel.readInt() == 0 ? null : ControlButton.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(PhotoPickerImage.class, parcel, arrayList3, iL2, 1);
                    }
                    arrayList = arrayList3;
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i13 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = org.webrtc.h.c(PhotoPickerImage.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                        linkedHashMap2 = linkedHashMap2;
                        i13 = i13;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList2 = new ArrayList(i14);
                    int iL3 = 0;
                    while (iL3 != i14) {
                        iL3 = com.avito.android.actions_sheet.a.l(PhotoPickerImage.class, parcel, arrayList2, iL3, 1);
                    }
                }
                return new PhotoPickerImage(lValueOf, image, universalImage, imageDeleteParamsCreateFromParcel, controlButtonCreateFromParcel, arrayList, linkedHashMap, arrayList2, (Image) parcel.readParcelable(PhotoPickerImage.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (LoadingState) parcel.readParcelable(PhotoPickerImage.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? ErrorState.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoPickerImage[] newArray(int i12) {
                return new PhotoPickerImage[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PhotoPickerImage(@Y61.l Long l12, @Y61.k Image image, @Y61.l UniversalImage universalImage, @Y61.l ImageDeleteParams imageDeleteParams, @Y61.l ControlButton controlButton, @Y61.l List<? extends BeduinAction> list, @Y61.l Map<String, ? extends Object> map, @Y61.l List<? extends BeduinAction> list2, @Y61.l Image image2, @Y61.l Long l13, @Y61.l LoadingState loadingState, boolean z12, @Y61.l ErrorState errorState) {
            this.id = l12;
            this.urls = image;
            this.universalImage = universalImage;
            this.imageDeleteParams = imageDeleteParams;
            this.controlButton = controlButton;
            this.onTapActions = list;
            this.parameters = map;
            this.onSuccessUploadActions = list2;
            this.f101920b = image2;
            this.f101921c = l13;
            this.f101922d = loadingState;
            this.f101923e = z12;
            this.f101924f = errorState;
        }

        public static PhotoPickerImage a(PhotoPickerImage photoPickerImage, Long l12, Image image, ImageDeleteParams imageDeleteParams, ControlButton controlButton, Map map, Long l13, LoadingState loadingState, ErrorState errorState, int i12) {
            Long l14 = (i12 & 1) != 0 ? photoPickerImage.id : l12;
            Image image2 = (i12 & 2) != 0 ? photoPickerImage.urls : image;
            UniversalImage universalImage = photoPickerImage.universalImage;
            ImageDeleteParams imageDeleteParams2 = (i12 & 8) != 0 ? photoPickerImage.imageDeleteParams : imageDeleteParams;
            ControlButton controlButton2 = (i12 & 16) != 0 ? photoPickerImage.controlButton : controlButton;
            List<BeduinAction> list = photoPickerImage.onTapActions;
            Map map2 = (i12 & 64) != 0 ? photoPickerImage.parameters : map;
            List<BeduinAction> list2 = photoPickerImage.onSuccessUploadActions;
            Image image3 = photoPickerImage.f101920b;
            Long l15 = (i12 & 512) != 0 ? photoPickerImage.f101921c : l13;
            LoadingState loadingState2 = (i12 & 1024) != 0 ? photoPickerImage.f101922d : loadingState;
            boolean z12 = (i12 & 2048) != 0 ? photoPickerImage.f101923e : true;
            ErrorState errorState2 = (i12 & 4096) != 0 ? photoPickerImage.f101924f : errorState;
            photoPickerImage.getClass();
            return new PhotoPickerImage(l14, image2, universalImage, imageDeleteParams2, controlButton2, list, map2, list2, image3, l15, loadingState2, z12, errorState2);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final ControlButton getControlButton() {
            return this.controlButton;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final ImageDeleteParams getImageDeleteParams() {
            return this.imageDeleteParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhotoPickerImage)) {
                return false;
            }
            PhotoPickerImage photoPickerImage = (PhotoPickerImage) obj;
            return L.f(this.id, photoPickerImage.id) && L.f(this.urls, photoPickerImage.urls) && L.f(this.universalImage, photoPickerImage.universalImage) && L.f(this.imageDeleteParams, photoPickerImage.imageDeleteParams) && L.f(this.controlButton, photoPickerImage.controlButton) && L.f(this.onTapActions, photoPickerImage.onTapActions) && L.f(this.parameters, photoPickerImage.parameters) && L.f(this.onSuccessUploadActions, photoPickerImage.onSuccessUploadActions) && L.f(this.f101920b, photoPickerImage.f101920b) && L.f(this.f101921c, photoPickerImage.f101921c) && L.f(this.f101922d, photoPickerImage.f101922d) && this.f101923e == photoPickerImage.f101923e && L.f(this.f101924f, photoPickerImage.f101924f);
        }

        @Y61.l
        public final List<BeduinAction> f() {
            return this.onSuccessUploadActions;
        }

        @Y61.l
        public final List<BeduinAction> g() {
            return this.onTapActions;
        }

        @Y61.l
        public final Map<String, Object> h() {
            return this.parameters;
        }

        public final int hashCode() {
            Long l12 = this.id;
            int iG2 = com.avito.android.actions_sheet.a.g(this.urls, (l12 == null ? 0 : l12.hashCode()) * 31, 31);
            UniversalImage universalImage = this.universalImage;
            int iHashCode = (iG2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            ImageDeleteParams imageDeleteParams = this.imageDeleteParams;
            int iHashCode2 = (iHashCode + (imageDeleteParams == null ? 0 : imageDeleteParams.hashCode())) * 31;
            ControlButton controlButton = this.controlButton;
            int iHashCode3 = (iHashCode2 + (controlButton == null ? 0 : controlButton.hashCode())) * 31;
            List<BeduinAction> list = this.onTapActions;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, Object> map = this.parameters;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            List<BeduinAction> list2 = this.onSuccessUploadActions;
            int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Image image = this.f101920b;
            int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
            Long l13 = this.f101921c;
            int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
            LoadingState loadingState = this.f101922d;
            int i12 = androidx.appcompat.app.r.i((iHashCode8 + (loadingState == null ? 0 : loadingState.hashCode())) * 31, 31, this.f101923e);
            ErrorState errorState = this.f101924f;
            return i12 + (errorState != null ? errorState.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final UniversalImage getUniversalImage() {
            return this.universalImage;
        }

        @Y61.k
        /* renamed from: j, reason: from getter */
        public final Image getUrls() {
            return this.urls;
        }

        @Y61.k
        public final String toString() {
            return "PhotoPickerImage(id=" + this.id + ", urls=" + this.urls + ", universalImage=" + this.universalImage + ", imageDeleteParams=" + this.imageDeleteParams + ", controlButton=" + this.controlButton + ", onTapActions=" + this.onTapActions + ", parameters=" + this.parameters + ", onSuccessUploadActions=" + this.onSuccessUploadActions + ", localImage=" + this.f101920b + ", photoStorageId=" + this.f101921c + ", _loadingState=" + this.f101922d + ", isDeleted=" + this.f101923e + ", errorState=" + this.f101924f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Long l12 = this.id;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeParcelable(this.urls, i12);
            parcel.writeParcelable(this.universalImage, i12);
            ImageDeleteParams imageDeleteParams = this.imageDeleteParams;
            if (imageDeleteParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageDeleteParams.writeToParcel(parcel, i12);
            }
            ControlButton controlButton = this.controlButton;
            if (controlButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                controlButton.writeToParcel(parcel, i12);
            }
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            Map<String, Object> map = this.parameters;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            List<BeduinAction> list2 = this.onSuccessUploadActions;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA2.next(), i12);
                }
            }
            parcel.writeParcelable(this.f101920b, i12);
            Long l13 = this.f101921c;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeParcelable(this.f101922d, i12);
            parcel.writeInt(this.f101923e ? 1 : 0);
            ErrorState errorState = this.f101924f;
            if (errorState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                errorState.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ PhotoPickerImage(Long l12, Image image, UniversalImage universalImage, ImageDeleteParams imageDeleteParams, ControlButton controlButton, List list, Map map, List list2, Image image2, Long l13, LoadingState loadingState, boolean z12, ErrorState errorState, int i12, C42822w c42822w) {
            this(l12, image, universalImage, (i12 & 8) != 0 ? null : imageDeleteParams, controlButton, (i12 & 32) != 0 ? null : list, map, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? null : image2, (i12 & 512) != 0 ? null : l13, (i12 & 1024) != 0 ? null : loadingState, (i12 & 2048) != 0 ? false : z12, (i12 & 4096) != 0 ? null : errorState);
        }
    }
}
