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
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FileUploaderParameter.kt */
@s0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 G2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002GHBU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!Jn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020%HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u00107R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b:\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\u001dR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010BR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010!R\u0014\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0016¨\u0006I"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/FileUploadParameterValue;", "", "id", "title", "", "required", "immutable", "updatesForm", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "_value", "Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget;)V", "hasValue", "()Z", "isDduFileUploader", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget;)Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "setTitle", "(Ljava/lang/String;)V", "Z", "getRequired", "getImmutable", "Ljava/lang/Boolean;", "getUpdatesForm", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget;", "getWidget", "getType", "type", "Companion", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class FileUploaderParameter extends EditableParameter<List<? extends FileUploadParameterValue>> {

    @k
    public static final String TYPE = "fileUploader";

    @c("value")
    @l
    private List<FileUploadParameterValue> _value;

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
    public static final Parcelable.Creator<FileUploaderParameter> CREATOR = new Creator();

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FileUploaderParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploaderParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FileUploaderParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(FileUploadParameterValue.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new FileUploaderParameter(string, string2, z12, z13, boolValueOf, attributedText, arrayList, parcel.readInt() != 0 ? Widget.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploaderParameter[] newArray(int i12) {
            return new FileUploaderParameter[i12];
        }
    }

    public FileUploaderParameter(@k String str, @k String str2, boolean z12, boolean z13, @l Boolean bool, @l AttributedText attributedText, @l List<FileUploadParameterValue> list, @l Widget widget) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.updatesForm = bool;
        this.motivation = attributedText;
        this._value = list;
        this.widget = widget;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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

    /* renamed from: component4, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    public final List<FileUploadParameterValue> component7() {
        return this._value;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @k
    public final FileUploaderParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l Boolean updatesForm, @l AttributedText motivation, @l List<FileUploadParameterValue> _value, @l Widget widget) {
        return new FileUploaderParameter(id2, title, required, immutable, updatesForm, motivation, _value, widget);
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
        if (!(other instanceof FileUploaderParameter)) {
            return false;
        }
        FileUploaderParameter fileUploaderParameter = (FileUploaderParameter) other;
        return L.f(this.id, fileUploaderParameter.id) && L.f(this.title, fileUploaderParameter.title) && this.required == fileUploaderParameter.required && this.immutable == fileUploaderParameter.immutable && L.f(this.updatesForm, fileUploaderParameter.updatesForm) && L.f(this.motivation, fileUploaderParameter.motivation) && L.f(this._value, fileUploaderParameter._value) && L.f(this.widget, fileUploaderParameter.widget);
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

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        Widget.Config config;
        Integer minimumFilesCount;
        List<? extends FileUploadParameterValue> value = getValue();
        if (value == null) {
            return false;
        }
        Widget widget = this.widget;
        int iIntValue = (widget == null || (config = widget.getConfig()) == null || (minimumFilesCount = config.getMinimumFilesCount()) == null) ? 0 : minimumFilesCount.intValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((FileUploadParameterValue) obj).isUploaded()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() >= iIntValue;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        Boolean bool = this.updatesForm;
        int iHashCode = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText = this.motivation;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<FileUploadParameterValue> list = this._value;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Widget widget = this.widget;
        return iHashCode3 + (widget != null ? widget.hashCode() : 0);
    }

    public final boolean isDduFileUploader() {
        Widget.Config config;
        Boolean isDduFileUploader;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null || (isDduFileUploader = config.getIsDduFileUploader()) == null) {
            return false;
        }
        return isDduFileUploader.booleanValue();
    }

    public void setTitle(@k String str) {
        this.title = str;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends FileUploadParameterValue> list) {
        set_value2((List<FileUploadParameterValue>) list);
    }

    @k
    public String toString() {
        return "FileUploaderParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", immutable=" + this.immutable + ", updatesForm=" + this.updatesForm + ", motivation=" + this.motivation + ", _value=" + this._value + ", widget=" + this.widget + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.motivation, flags);
        List<FileUploadParameterValue> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FileUploadParameterValue) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends FileUploadParameterValue> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<FileUploadParameterValue> list) {
        this._value = list;
    }

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget$Config;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget$Config;", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: FileUploaderParameter.kt */
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

        /* compiled from: FileUploaderParameter.kt */
        @d
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b\u0011\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b6\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b7\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b8\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b9\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b\u0016\u0010,¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/FileUploadApiConfig;", "api", "Lcom/avito/android/remote/model/category_parameters/FileUploadButtonConfig;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "allowMultiUploading", "", "requiredErrorMessage", "", "minimumFilesCount", "", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule;", "rules", "isRedesign", "title", "titleFileUploaded", "actionTitle", "actionDescription", "isDduFileUploader", "<init>", "(Lcom/avito/android/remote/model/category_parameters/FileUploadApiConfig;Lcom/avito/android/remote/model/category_parameters/FileUploadButtonConfig;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/FileUploadApiConfig;", "getApi", "()Lcom/avito/android/remote/model/category_parameters/FileUploadApiConfig;", "Lcom/avito/android/remote/model/category_parameters/FileUploadButtonConfig;", "getButton", "()Lcom/avito/android/remote/model/category_parameters/FileUploadButtonConfig;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "getAllowMultiUploading", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getRequiredErrorMessage", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getMinimumFilesCount", "()Ljava/lang/Integer;", "Ljava/util/List;", "getRules", "()Ljava/util/List;", "getTitle", "getTitleFileUploaded", "getActionTitle", "getActionDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("actionDescription")
            @l
            private final String actionDescription;

            @c("actionTitle")
            @l
            private final String actionTitle;

            @c("allowMultiUploading")
            @l
            private final Boolean allowMultiUploading;

            @c("api")
            @k
            private final FileUploadApiConfig api;

            @c("button")
            @k
            private final FileUploadButtonConfig button;

            @c("description")
            @l
            private final AttributedText description;

            @c("isDduFileUploader")
            @l
            private final Boolean isDduFileUploader;

            @c("isRedesign")
            @l
            private final Boolean isRedesign;

            @c("minimumFilesCount")
            @l
            private final Integer minimumFilesCount;

            @c("requiredErrorMessage")
            @l
            private final String requiredErrorMessage;

            @c("validationRules")
            @l
            private final List<FileUploadValidationRule> rules;

            @c("title")
            @l
            private final String title;

            @c("titleFileUploaded")
            @l
            private final String titleFileUploaded;

            /* compiled from: FileUploaderParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    ArrayList arrayList;
                    Boolean boolValueOf2;
                    Boolean boolValueOf3;
                    FileUploadApiConfig fileUploadApiConfigCreateFromParcel = FileUploadApiConfig.CREATOR.createFromParcel(parcel);
                    FileUploadButtonConfig fileUploadButtonConfigCreateFromParcel = FileUploadButtonConfig.CREATOR.createFromParcel(parcel);
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(Config.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    String string = parcel.readString();
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = a.l(Config.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(fileUploadApiConfigCreateFromParcel, fileUploadButtonConfigCreateFromParcel, attributedText, boolValueOf, string, numValueOf, arrayList, boolValueOf2, string2, string3, string4, string5, boolValueOf3);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config(@k FileUploadApiConfig fileUploadApiConfig, @k FileUploadButtonConfig fileUploadButtonConfig, @l AttributedText attributedText, @l Boolean bool, @l String str, @l Integer num, @l List<? extends FileUploadValidationRule> list, @l Boolean bool2, @l String str2, @l String str3, @l String str4, @l String str5, @l Boolean bool3) {
                this.api = fileUploadApiConfig;
                this.button = fileUploadButtonConfig;
                this.description = attributedText;
                this.allowMultiUploading = bool;
                this.requiredErrorMessage = str;
                this.minimumFilesCount = num;
                this.rules = list;
                this.isRedesign = bool2;
                this.title = str2;
                this.titleFileUploaded = str3;
                this.actionTitle = str4;
                this.actionDescription = str5;
                this.isDduFileUploader = bool3;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getActionDescription() {
                return this.actionDescription;
            }

            @l
            public final String getActionTitle() {
                return this.actionTitle;
            }

            @l
            public final Boolean getAllowMultiUploading() {
                return this.allowMultiUploading;
            }

            @k
            public final FileUploadApiConfig getApi() {
                return this.api;
            }

            @k
            public final FileUploadButtonConfig getButton() {
                return this.button;
            }

            @l
            public final AttributedText getDescription() {
                return this.description;
            }

            @l
            public final Integer getMinimumFilesCount() {
                return this.minimumFilesCount;
            }

            @l
            public final String getRequiredErrorMessage() {
                return this.requiredErrorMessage;
            }

            @l
            public final List<FileUploadValidationRule> getRules() {
                return this.rules;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getTitleFileUploaded() {
                return this.titleFileUploaded;
            }

            @l
            /* renamed from: isDduFileUploader, reason: from getter */
            public final Boolean getIsDduFileUploader() {
                return this.isDduFileUploader;
            }

            @l
            /* renamed from: isRedesign, reason: from getter */
            public final Boolean getIsRedesign() {
                return this.isRedesign;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.api.writeToParcel(parcel, flags);
                this.button.writeToParcel(parcel, flags);
                parcel.writeParcelable(this.description, flags);
                Boolean bool = this.allowMultiUploading;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                parcel.writeString(this.requiredErrorMessage);
                Integer num = this.minimumFilesCount;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                List<FileUploadValidationRule> list = this.rules;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                Boolean bool2 = this.isRedesign;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                parcel.writeString(this.title);
                parcel.writeString(this.titleFileUploaded);
                parcel.writeString(this.actionTitle);
                parcel.writeString(this.actionDescription);
                Boolean bool3 = this.isDduFileUploader;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool3);
                }
            }

            public /* synthetic */ Config(FileUploadApiConfig fileUploadApiConfig, FileUploadButtonConfig fileUploadButtonConfig, AttributedText attributedText, Boolean bool, String str, Integer num, List list, Boolean bool2, String str2, String str3, String str4, String str5, Boolean bool3, int i12, C42822w c42822w) {
                this(fileUploadApiConfig, fileUploadButtonConfig, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? Boolean.FALSE : bool, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : num, list, (i12 & 128) != 0 ? null : bool2, (i12 & 256) != 0 ? null : str2, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : bool3);
            }
        }
    }
}
