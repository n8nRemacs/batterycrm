package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.ImageUpload;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoParameter.kt */
@s0
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002noB\u0099\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJ\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b7\u00106J¨\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b:\u0010$J\u0010\u0010;\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b;\u0010*J\u001a\u0010>\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b@\u0010*J \u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010$R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bI\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bJ\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010(R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010*R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010,R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010.\"\u0004\bS\u0010TR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bV\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\bW\u0010\u001eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\bY\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\b[\u00104R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\\\u001a\u0004\b]\u00106R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\\\u001a\u0004\b^\u00106R \u0010_\u001a\u00020\u00138\u0016X\u0096D¢\u0006\u0012\n\u0004\b_\u0010U\u0012\u0004\ba\u0010b\u001a\u0004\b`\u0010\u001eR\"\u0010c\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bc\u0010\\\u0012\u0004\be\u0010b\u001a\u0004\bd\u00106R\"\u0010f\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bf\u0010G\u0012\u0004\bh\u0010b\u001a\u0004\bg\u0010$R\"\u0010i\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bi\u0010G\u0012\u0004\bk\u0010b\u001a\u0004\bj\u0010$R\u0014\u0010m\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010$¨\u0006p"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PhotoParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "maxCount", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "_value", "", "required", "shouldUploadPhotoForCV", "suggestByPhotoMaxImages", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ILjava/util/List;Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;ZZLjava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "hasValue", "()Z", "oldValue", "newValue", "areValuesTheSame", "(Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()I", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component12", "()Ljava/lang/Boolean;", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ILjava/util/List;Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;ZZLjava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/PhotoParameter;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "I", "getMaxCount", "Ljava/util/List;", "getConstraints", "Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;", "get_value", "set_value", "(Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;)V", "Z", "getRequired", "getShouldUploadPhotoForCV", "Ljava/lang/Integer;", "getSuggestByPhotoMaxImages", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "immutable", "getImmutable", "getImmutable$annotations", "()V", "updatesForm", "getUpdatesForm", "getUpdatesForm$annotations", "hint", "getHint", "getHint$annotations", ChannelContext.Item.PLACEHOLDER, "getPlaceholder", "getPlaceholder$annotations", "getType", "type", "Companion", "ImageUploadListWrapper", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class PhotoParameter extends EditableParameter<ImageUploadListWrapper> implements HasConstraints, TextParameter, Visibility, Phantom {

    @k
    public static final String TYPE = "photos";

    @c("value")
    @l
    private ImageUploadListWrapper _value;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @l
    private final String description;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @l
    private final String hint;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @c("maxCount")
    private final int maxCount;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("shouldUploadPhotoForCV")
    private final boolean shouldUploadPhotoForCV;

    @c("suggestByPhotoMaxImages")
    @l
    private final Integer suggestByPhotoMaxImages;

    @c("title")
    @k
    private final String title;

    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<PhotoParameter> CREATOR = new Creator();

    /* compiled from: PhotoParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PhotoParameter.class.getClassLoader());
            int i12 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = a.l(PhotoParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            ImageUploadListWrapper imageUploadListWrapperCreateFromParcel = parcel.readInt() == 0 ? null : ImageUploadListWrapper.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PhotoParameter(string, string2, string3, attributedText, i12, arrayList, imageUploadListWrapperCreateFromParcel, z12, z13, numValueOf, displayingOptionsCreateFromParcel, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoParameter[] newArray(int i12) {
            return new PhotoParameter[i12];
        }
    }

    /* compiled from: PhotoParameter.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010-\u001a\u00020\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;", "", "Lcom/avito/android/remote/model/ImageUpload;", "Landroid/os/Parcelable;", "", "list", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "element", "", "contains", "(Lcom/avito/android/remote/model/ImageUpload;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lcom/avito/android/remote/model/ImageUploadResult;", "getOnlyUploaded", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/PhotoParameter$ImageUploadListWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSize", "size", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ImageUploadListWrapper implements Collection<ImageUpload>, Parcelable, Z41.a {

        @k
        public static final Parcelable.Creator<ImageUploadListWrapper> CREATOR = new Creator();

        @k
        private final List<ImageUpload> list;

        /* compiled from: PhotoParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageUploadListWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageUploadListWrapper createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ImageUploadListWrapper.class, parcel, arrayList, iL2, 1);
                }
                return new ImageUploadListWrapper(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageUploadListWrapper[] newArray(int i12) {
                return new ImageUploadListWrapper[i12];
            }
        }

        public ImageUploadListWrapper() {
            this(null, 1, null);
        }

        private final List<ImageUpload> component1() {
            return this.list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageUploadListWrapper copy$default(ImageUploadListWrapper imageUploadListWrapper, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = imageUploadListWrapper.list;
            }
            return imageUploadListWrapper.copy(list);
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public boolean add2(ImageUpload imageUpload) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends ImageUpload> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(@k ImageUpload element) {
            return this.list.contains(element);
        }

        @Override // java.util.Collection
        public boolean containsAll(@k Collection<? extends Object> elements) {
            return this.list.containsAll(elements);
        }

        @k
        public final ImageUploadListWrapper copy(@k List<? extends ImageUpload> list) {
            return new ImageUploadListWrapper(list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.util.Collection
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageUploadListWrapper) && L.f(this.list, ((ImageUploadListWrapper) other).list);
        }

        @k
        public final List<ImageUploadResult> getOnlyUploaded() {
            return C42745f0.B(this.list, ImageUploadResult.class);
        }

        public int getSize() {
            return this.list.size();
        }

        @Override // java.util.Collection
        public int hashCode() {
            return this.list.hashCode();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.list.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @k
        public Iterator<ImageUpload> iterator() {
            return this.list.iterator();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super ImageUpload> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return C42821v.a(this);
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("ImageUploadListWrapper(list="), this.list, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.list, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ImageUploadListWrapper(@k List<? extends ImageUpload> list) {
            this.list = list;
        }

        @Override // java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(ImageUpload imageUpload) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof ImageUpload) {
                return contains((ImageUpload) obj);
            }
            return false;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C42821v.b(this, tArr);
        }

        public ImageUploadListWrapper(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? C42784z0.f406748b : list);
        }
    }

    public /* synthetic */ PhotoParameter(String str, String str2, String str3, AttributedText attributedText, int i12, List list, ImageUploadListWrapper imageUploadListWrapper, boolean z12, boolean z13, Integer num, DisplayingOptions displayingOptions, Boolean bool, Boolean bool2, int i13, C42822w c42822w) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : attributedText, i12, (i13 & 32) != 0 ? new ArrayList() : list, (i13 & 64) != 0 ? new ImageUploadListWrapper(null, 1, null) : imageUploadListWrapper, (i13 & 128) != 0 ? false : z12, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? null : num, (i13 & 1024) != 0 ? null : displayingOptions, (i13 & 2048) != 0 ? Boolean.FALSE : bool, (i13 & 4096) != 0 ? Boolean.FALSE : bool2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Integer getSuggestByPhotoMaxImages() {
        return this.suggestByPhotoMaxImages;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    @l
    public final List<Constraint> component6() {
        return this.constraints;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ImageUploadListWrapper get_value() {
        return this._value;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldUploadPhotoForCV() {
        return this.shouldUploadPhotoForCV;
    }

    @k
    public final PhotoParameter copy(@k String id2, @k String title, @l String description, @l AttributedText motivation, int maxCount, @l List<? extends Constraint> constraints, @l ImageUploadListWrapper _value, boolean required, boolean shouldUploadPhotoForCV, @l Integer suggestByPhotoMaxImages, @l DisplayingOptions displayingOptions, @l Boolean visible, @l Boolean phantom) {
        return new PhotoParameter(id2, title, description, motivation, maxCount, constraints, _value, required, shouldUploadPhotoForCV, suggestByPhotoMaxImages, displayingOptions, visible, phantom);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoParameter)) {
            return false;
        }
        PhotoParameter photoParameter = (PhotoParameter) other;
        return L.f(this.id, photoParameter.id) && L.f(this.title, photoParameter.title) && L.f(this.description, photoParameter.description) && L.f(this.motivation, photoParameter.motivation) && this.maxCount == photoParameter.maxCount && L.f(this.constraints, photoParameter.constraints) && L.f(this._value, photoParameter._value) && this.required == photoParameter.required && this.shouldUploadPhotoForCV == photoParameter.shouldUploadPhotoForCV && L.f(this.suggestByPhotoMaxImages, photoParameter.suggestByPhotoMaxImages) && L.f(this.displayingOptions, photoParameter.displayingOptions) && L.f(this.visible, photoParameter.visible) && L.f(this.phantom, photoParameter.phantom);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public String getHint() {
        return this.hint;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    public final boolean getShouldUploadPhotoForCV() {
        return this.shouldUploadPhotoForCV;
    }

    @l
    public final Integer getSuggestByPhotoMaxImages() {
        return this.suggestByPhotoMaxImages;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        ImageUploadListWrapper value = getValue();
        return !(value == null || value.isEmpty());
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.motivation;
        int iE2 = r.e(this.maxCount, (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
        List<Constraint> list = this.constraints;
        int iHashCode2 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        ImageUploadListWrapper imageUploadListWrapper = this._value;
        int i12 = r.i(r.i((iHashCode2 + (imageUploadListWrapper == null ? 0 : imageUploadListWrapper.hashCode())) * 31, 31, this.required), 31, this.shouldUploadPhotoForCV);
        Integer num = this.suggestByPhotoMaxImages;
        int iHashCode3 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode4 = (iHashCode3 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", maxCount=");
        sb2.append(this.maxCount);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", shouldUploadPhotoForCV=");
        sb2.append(this.shouldUploadPhotoForCV);
        sb2.append(", suggestByPhotoMaxImages=");
        sb2.append(this.suggestByPhotoMaxImages);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        return C0.g(sb2, this.phantom, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.motivation, flags);
        parcel.writeInt(this.maxCount);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ImageUploadListWrapper imageUploadListWrapper = this._value;
        if (imageUploadListWrapper == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageUploadListWrapper.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.shouldUploadPhotoForCV ? 1 : 0);
        Integer num = this.suggestByPhotoMaxImages;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        Boolean bool = this.visible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.phantom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean areValuesTheSame(@l ImageUploadListWrapper oldValue, @l ImageUploadListWrapper newValue) {
        List arrayList;
        List arrayList2;
        if (oldValue != null) {
            arrayList = new ArrayList();
            for (ImageUpload imageUpload : oldValue) {
                if (imageUpload instanceof ImageUploadResult) {
                    arrayList.add(imageUpload);
                }
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        if (newValue != null) {
            arrayList2 = new ArrayList();
            for (ImageUpload imageUpload2 : newValue) {
                if (imageUpload2 instanceof ImageUploadResult) {
                    arrayList2.add(imageUpload2);
                }
            }
        } else {
            arrayList2 = C42784z0.f406748b;
        }
        return L.f(arrayList, arrayList2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public ImageUploadListWrapper get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l ImageUploadListWrapper imageUploadListWrapper) {
        this._value = imageUploadListWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoParameter(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, int i12, @l List<? extends Constraint> list, @l ImageUploadListWrapper imageUploadListWrapper, boolean z12, boolean z13, @l Integer num, @l DisplayingOptions displayingOptions, @l Boolean bool, @l Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.motivation = attributedText;
        this.maxCount = i12;
        this.constraints = list;
        this._value = imageUploadListWrapper;
        this.required = z12;
        this.shouldUploadPhotoForCV = z13;
        this.suggestByPhotoMaxImages = num;
        this.displayingOptions = displayingOptions;
        this.visible = bool;
        this.phantom = bool2;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getPlaceholder$annotations() {
    }

    public static /* synthetic */ void getUpdatesForm$annotations() {
    }
}
