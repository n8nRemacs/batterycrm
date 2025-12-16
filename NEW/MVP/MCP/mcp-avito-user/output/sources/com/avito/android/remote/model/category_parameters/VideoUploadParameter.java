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
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadParameter.kt */
@d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 P2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004:\u0002PQBq\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u008c\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+HÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u0018R\"\u0010\u0007\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u00109\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bB\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010 R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010\"\"\u0004\bG\u0010HR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010&R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bM\u0010\"R\u0014\u0010O\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0018¨\u0006R"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/VideoUploadParameterValue;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "", "id", "title", "", "required", "updatesForm", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "_value", "Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget;", "widget", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget;", "component9", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "setTitle", "(Ljava/lang/String;)V", "Z", "getRequired", "Ljava/lang/Boolean;", "getUpdatesForm", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget;", "getWidget", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getConstraints", "getType", "type", "Companion", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VideoUploadParameter extends EditableParameter<List<? extends VideoUploadParameterValue>> implements HasConstraints {

    @k
    public static final String TYPE = "videoUploader";

    @c("value")
    @l
    private List<VideoUploadParameterValue> _value;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<VideoUploadParameter> CREATOR = new Creator();

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoUploadParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoUploadParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(VideoUploadParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(VideoUploadParameterValue.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(VideoUploadParameter.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new VideoUploadParameter(string, string2, z12, boolValueOf, z13, attributedText, arrayList, widgetCreateFromParcel, displayingOptionsCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoUploadParameter[] newArray(int i12) {
            return new VideoUploadParameter[i12];
        }
    }

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget$Config;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget$Config;", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: VideoUploadParameter.kt */
        @d
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b.\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b\u0010\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b\u0013\u00101R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b8\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VideoUploadParameter$Widget$Config;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription;", "attributedDescription", "", "maxCount", "maxDuration", ValidationRule.MAX_FILE_SIZE_RULE, "minDuration", "", "required", "Lcom/avito/android/remote/model/category_parameters/OnboardingConfig;", "onboarding", "isNew", "Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig;", NotificationsSettings.Section.SECTION_DELIVERY, "isDisabled", "disabledText", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2;", "onboardingV2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AttributedDescription;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/OnboardingConfig;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/OnboardingV2;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription;", "getAttributedDescription", "()Lcom/avito/android/remote/model/category_parameters/AttributedDescription;", "Ljava/lang/Long;", "getMaxCount", "()Ljava/lang/Long;", "getMaxDuration", "getMaxFileSize", "getMinDuration", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/category_parameters/OnboardingConfig;", "getOnboarding", "()Lcom/avito/android/remote/model/category_parameters/OnboardingConfig;", "Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig;", "getDelivery", "()Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig;", "getDisabledText", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2;", "getOnboardingV2", "()Lcom/avito/android/remote/model/category_parameters/OnboardingV2;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("attributedDescription")
            @l
            private final AttributedDescription attributedDescription;

            @c(NotificationsSettings.Section.SECTION_DELIVERY)
            @l
            private final DeliveryOnVideoUploadConfig delivery;

            @c("description")
            @l
            private final String description;

            @c("disabledText")
            @l
            private final String disabledText;

            @c("isDisabled")
            @l
            private final Boolean isDisabled;

            @c("isNew")
            @l
            private final Boolean isNew;

            @c("maxCount")
            @l
            private final Long maxCount;

            @c("maxDuration")
            @l
            private final Long maxDuration;

            @c(ValidationRule.MAX_FILE_SIZE_RULE)
            @l
            private final Long maxFileSize;

            @c("minDuration")
            @l
            private final Long minDuration;

            @c("onboarding")
            @l
            private final OnboardingConfig onboarding;

            @c("onboardingV2")
            @l
            private final OnboardingV2 onboardingV2;

            @c("required")
            @l
            private final Boolean required;

            @c("title")
            @l
            private final String title;

            /* compiled from: VideoUploadParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Boolean boolValueOf3;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    AttributedDescription attributedDescriptionCreateFromParcel = parcel.readInt() == 0 ? null : AttributedDescription.CREATOR.createFromParcel(parcel);
                    Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    OnboardingConfig onboardingConfigCreateFromParcel = parcel.readInt() == 0 ? null : OnboardingConfig.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfigCreateFromParcel = parcel.readInt() == 0 ? null : DeliveryOnVideoUploadConfig.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(string, string2, attributedDescriptionCreateFromParcel, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf, onboardingConfigCreateFromParcel, boolValueOf2, deliveryOnVideoUploadConfigCreateFromParcel, boolValueOf3, parcel.readString(), parcel.readInt() != 0 ? OnboardingV2.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config(@l String str, @l String str2, @l AttributedDescription attributedDescription, @l Long l12, @l Long l13, @l Long l14, @l Long l15, @l Boolean bool, @l OnboardingConfig onboardingConfig, @l Boolean bool2, @l DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig, @l Boolean bool3, @l String str3, @l OnboardingV2 onboardingV2) {
                this.title = str;
                this.description = str2;
                this.attributedDescription = attributedDescription;
                this.maxCount = l12;
                this.maxDuration = l13;
                this.maxFileSize = l14;
                this.minDuration = l15;
                this.required = bool;
                this.onboarding = onboardingConfig;
                this.isNew = bool2;
                this.delivery = deliveryOnVideoUploadConfig;
                this.isDisabled = bool3;
                this.disabledText = str3;
                this.onboardingV2 = onboardingV2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final AttributedDescription getAttributedDescription() {
                return this.attributedDescription;
            }

            @l
            public final DeliveryOnVideoUploadConfig getDelivery() {
                return this.delivery;
            }

            @l
            public final String getDescription() {
                return this.description;
            }

            @l
            public final String getDisabledText() {
                return this.disabledText;
            }

            @l
            public final Long getMaxCount() {
                return this.maxCount;
            }

            @l
            public final Long getMaxDuration() {
                return this.maxDuration;
            }

            @l
            public final Long getMaxFileSize() {
                return this.maxFileSize;
            }

            @l
            public final Long getMinDuration() {
                return this.minDuration;
            }

            @l
            public final OnboardingConfig getOnboarding() {
                return this.onboarding;
            }

            @l
            public final OnboardingV2 getOnboardingV2() {
                return this.onboardingV2;
            }

            @l
            public final Boolean getRequired() {
                return this.required;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: isDisabled, reason: from getter */
            public final Boolean getIsDisabled() {
                return this.isDisabled;
            }

            @l
            /* renamed from: isNew, reason: from getter */
            public final Boolean getIsNew() {
                return this.isNew;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                AttributedDescription attributedDescription = this.attributedDescription;
                if (attributedDescription == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    attributedDescription.writeToParcel(parcel, flags);
                }
                Long l12 = this.maxCount;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                Long l13 = this.maxDuration;
                if (l13 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l13);
                }
                Long l14 = this.maxFileSize;
                if (l14 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l14);
                }
                Long l15 = this.minDuration;
                if (l15 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l15);
                }
                Boolean bool = this.required;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                OnboardingConfig onboardingConfig = this.onboarding;
                if (onboardingConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    onboardingConfig.writeToParcel(parcel, flags);
                }
                Boolean bool2 = this.isNew;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig = this.delivery;
                if (deliveryOnVideoUploadConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    deliveryOnVideoUploadConfig.writeToParcel(parcel, flags);
                }
                Boolean bool3 = this.isDisabled;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool3);
                }
                parcel.writeString(this.disabledText);
                OnboardingV2 onboardingV2 = this.onboardingV2;
                if (onboardingV2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    onboardingV2.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        public Widget(@l Config config) {
            this.config = config;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }
    }

    public /* synthetic */ VideoUploadParameter(String str, String str2, boolean z12, Boolean bool, boolean z13, AttributedText attributedText, List list, Widget widget, DisplayingOptions displayingOptions, List list2, int i12, C42822w c42822w) {
        this(str, str2, z12, bool, z13, attributedText, list, widget, displayingOptions, (i12 & 512) != 0 ? new ArrayList() : list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<Constraint> component10() {
        return this.constraints;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    public final List<VideoUploadParameterValue> component7() {
        return this._value;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @k
    public final VideoUploadParameter copy(@k String id2, @k String title, boolean required, @l Boolean updatesForm, boolean immutable, @l AttributedText motivation, @l List<VideoUploadParameterValue> _value, @l Widget widget, @l DisplayingOptions displayingOptions, @l List<? extends Constraint> constraints) {
        return new VideoUploadParameter(id2, title, required, updatesForm, immutable, motivation, _value, widget, displayingOptions, constraints);
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
        if (!(other instanceof VideoUploadParameter)) {
            return false;
        }
        VideoUploadParameter videoUploadParameter = (VideoUploadParameter) other;
        return L.f(this.id, videoUploadParameter.id) && L.f(this.title, videoUploadParameter.title) && this.required == videoUploadParameter.required && L.f(this.updatesForm, videoUploadParameter.updatesForm) && this.immutable == videoUploadParameter.immutable && L.f(this.motivation, videoUploadParameter.motivation) && L.f(this._value, videoUploadParameter._value) && L.f(this.widget, videoUploadParameter.widget) && L.f(this.displayingOptions, videoUploadParameter.displayingOptions) && L.f(this.constraints, videoUploadParameter.constraints);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
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

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required);
        Boolean bool = this.updatesForm;
        int i13 = r.i((i12 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i13 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<VideoUploadParameterValue> list = this._value;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Widget widget = this.widget;
        int iHashCode3 = (iHashCode2 + (widget == null ? 0 : widget.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode4 = (iHashCode3 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        List<Constraint> list2 = this.constraints;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public void setTitle(@k String str) {
        this.title = str;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends VideoUploadParameterValue> list) {
        set_value2((List<VideoUploadParameterValue>) list);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoUploadParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", widget=");
        sb2.append(this.widget);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", constraints=");
        return H.p(sb2, this.constraints, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        List<VideoUploadParameterValue> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((VideoUploadParameterValue) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        List<Constraint> list2 = this.constraints;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends VideoUploadParameterValue> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<VideoUploadParameterValue> list) {
        this._value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoUploadParameter(@k String str, @k String str2, boolean z12, @l Boolean bool, boolean z13, @l AttributedText attributedText, @l List<VideoUploadParameterValue> list, @l Widget widget, @l DisplayingOptions displayingOptions, @l List<? extends Constraint> list2) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.updatesForm = bool;
        this.immutable = z13;
        this.motivation = attributedText;
        this._value = list;
        this.widget = widget;
        this.displayingOptions = displayingOptions;
        this.constraints = list2;
    }
}
