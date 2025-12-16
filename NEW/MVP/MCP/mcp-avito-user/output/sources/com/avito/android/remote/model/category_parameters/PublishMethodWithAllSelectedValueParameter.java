package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.SimpleBadge;
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

/* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
@s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007IJKLMNOBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jz\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020&HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010?R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bD\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010\"R\u0014\u0010H\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0016¨\u0006P"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "id", "title", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;", Navigation.DISPLAYING, "_value", "", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Option;", "values", "", "required", "updatesForm", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;)V", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;", "getDisplaying", "get_value", "set_value", "(Ljava/lang/String;)V", "Ljava/util/List;", "getValues", "setValues", "(Ljava/util/List;)V", "Z", "getRequired", "Ljava/lang/Boolean;", "getUpdatesForm", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getType", "type", "Companion", "Displaying", "Option", "OptionConfig", "OptionDisplay", "OptionDisplayDescription", "OptionWidget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class PublishMethodWithAllSelectedValueParameter extends EditableParameter<String> {

    @k
    public static final String TYPE = "publishMethodWithAllSelectedValue";

    @c("value")
    @l
    private String _value;

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

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
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @l
    private List<Option> values;

    @k
    public static final Parcelable.Creator<PublishMethodWithAllSelectedValueParameter> CREATOR = new Creator();

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PublishMethodWithAllSelectedValueParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PublishMethodWithAllSelectedValueParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PublishMethodWithAllSelectedValueParameter(string, string2, displayingCreateFromParcel, string3, arrayList, z12, boolValueOf, parcel.readInt() != 0, (AttributedText) parcel.readParcelable(PublishMethodWithAllSelectedValueParameter.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PublishMethodWithAllSelectedValueParameter[] newArray(int i12) {
            return new PublishMethodWithAllSelectedValueParameter[i12];
        }
    }

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;", "Landroid/os/Parcelable;", "", "allSelectedValue", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Displaying;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAllSelectedValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Displaying implements Parcelable {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("allSelectedValue")
        @l
        private final String allSelectedValue;

        /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                return new Displaying(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Displaying() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Displaying copy$default(Displaying displaying, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = displaying.allSelectedValue;
            }
            return displaying.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getAllSelectedValue() {
            return this.allSelectedValue;
        }

        @k
        public final Displaying copy(@l String allSelectedValue) {
            return new Displaying(allSelectedValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Displaying) && L.f(this.allSelectedValue, ((Displaying) other).allSelectedValue);
        }

        @l
        public final String getAllSelectedValue() {
            return this.allSelectedValue;
        }

        public int hashCode() {
            String str = this.allSelectedValue;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Displaying(allSelectedValue="), this.allSelectedValue, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.allSelectedValue);
        }

        public Displaying(@l String str) {
            this.allSelectedValue = str;
        }

        public /* synthetic */ Displaying(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Option;", "Landroid/os/Parcelable;", "", "id", "title", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$Option;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;", "getWidget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("title")
        @k
        private final String title;

        @c("widget")
        @k
        private final OptionWidget widget;

        /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Option> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Option createFromParcel(@k Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString(), OptionWidget.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, @k String str2, @k OptionWidget optionWidget) {
            this.id = str;
            this.title = str2;
            this.widget = optionWidget;
        }

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, OptionWidget optionWidget, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = option.id;
            }
            if ((i12 & 2) != 0) {
                str2 = option.title;
            }
            if ((i12 & 4) != 0) {
                optionWidget = option.widget;
            }
            return option.copy(str, str2, optionWidget);
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

        @k
        /* renamed from: component3, reason: from getter */
        public final OptionWidget getWidget() {
            return this.widget;
        }

        @k
        public final Option copy(@k String id2, @k String title, @k OptionWidget widget) {
            return new Option(id2, title, widget);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.widget, option.widget);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final OptionWidget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            return this.widget.hashCode() + H.d(this.id.hashCode() * 31, 31, this.title);
        }

        @k
        public String toString() {
            return "Option(id=" + this.id + ", title=" + this.title + ", widget=" + this.widget + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            this.widget.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;", "display", "<init>", "(Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;", "copy", "(Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;", "getDisplay", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<OptionConfig> CREATOR = new Creator();

        @c("display")
        @k
        private final OptionDisplay display;

        /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionConfig createFromParcel(@k Parcel parcel) {
                return new OptionConfig(OptionDisplay.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionConfig[] newArray(int i12) {
                return new OptionConfig[i12];
            }
        }

        public OptionConfig(@k OptionDisplay optionDisplay) {
            this.display = optionDisplay;
        }

        public static /* synthetic */ OptionConfig copy$default(OptionConfig optionConfig, OptionDisplay optionDisplay, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                optionDisplay = optionConfig.display;
            }
            return optionConfig.copy(optionDisplay);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final OptionDisplay getDisplay() {
            return this.display;
        }

        @k
        public final OptionConfig copy(@k OptionDisplay display) {
            return new OptionConfig(display);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionConfig) && L.f(this.display, ((OptionConfig) other).display);
        }

        @k
        public final OptionDisplay getDisplay() {
            return this.display;
        }

        public int hashCode() {
            return this.display.hashCode();
        }

        @k
        public String toString() {
            return "OptionConfig(display=" + this.display + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.display.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;", "copy", "(Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionConfig;", "getConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionWidget implements Parcelable {

        @k
        public static final Parcelable.Creator<OptionWidget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @k
        private final OptionConfig config;

        /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionWidget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionWidget createFromParcel(@k Parcel parcel) {
                return new OptionWidget(OptionConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionWidget[] newArray(int i12) {
                return new OptionWidget[i12];
            }
        }

        public OptionWidget(@k OptionConfig optionConfig) {
            this.config = optionConfig;
        }

        public static /* synthetic */ OptionWidget copy$default(OptionWidget optionWidget, OptionConfig optionConfig, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                optionConfig = optionWidget.config;
            }
            return optionWidget.copy(optionConfig);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final OptionConfig getConfig() {
            return this.config;
        }

        @k
        public final OptionWidget copy(@k OptionConfig config) {
            return new OptionWidget(config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionWidget) && L.f(this.config, ((OptionWidget) other).config);
        }

        @k
        public final OptionConfig getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @k
        public String toString() {
            return "OptionWidget(config=" + this.config + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.config.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PublishMethodWithAllSelectedValueParameter(String str, String str2, Displaying displaying, String str3, List list, boolean z12, Boolean bool, boolean z13, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, str2, displaying, str3, list, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? Boolean.FALSE : bool, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? null : attributedText);
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

    @l
    /* renamed from: component3, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String get_value() {
        return this._value;
    }

    @l
    public final List<Option> component5() {
        return this.values;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @k
    public final PublishMethodWithAllSelectedValueParameter copy(@k String id2, @k String title, @l Displaying displaying, @l String _value, @l List<Option> values, boolean required, @l Boolean updatesForm, boolean immutable, @l AttributedText motivation) {
        return new PublishMethodWithAllSelectedValueParameter(id2, title, displaying, _value, values, required, updatesForm, immutable, motivation);
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
        if (!(other instanceof PublishMethodWithAllSelectedValueParameter)) {
            return false;
        }
        PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter = (PublishMethodWithAllSelectedValueParameter) other;
        return L.f(this.id, publishMethodWithAllSelectedValueParameter.id) && L.f(this.title, publishMethodWithAllSelectedValueParameter.title) && L.f(this.displaying, publishMethodWithAllSelectedValueParameter.displaying) && L.f(this._value, publishMethodWithAllSelectedValueParameter._value) && L.f(this.values, publishMethodWithAllSelectedValueParameter.values) && this.required == publishMethodWithAllSelectedValueParameter.required && L.f(this.updatesForm, publishMethodWithAllSelectedValueParameter.updatesForm) && this.immutable == publishMethodWithAllSelectedValueParameter.immutable && L.f(this.motivation, publishMethodWithAllSelectedValueParameter.motivation);
    }

    @l
    public final Displaying getDisplaying() {
        return this.displaying;
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
    public final List<Option> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        String value = getValue();
        return !(value == null || value.length() == 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        Displaying displaying = this.displaying;
        int iHashCode = (iD2 + (displaying == null ? 0 : displaying.hashCode())) * 31;
        String str = this._value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Option> list = this.values;
        int i12 = r.i((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.required);
        Boolean bool = this.updatesForm;
        int i13 = r.i((i12 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.immutable);
        AttributedText attributedText = this.motivation;
        return i13 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    public final void setValues(@l List<Option> list) {
        this.values = list;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PublishMethodWithAllSelectedValueParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", displaying=");
        sb2.append(this.displaying);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        return a.w(sb2, this.motivation, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        parcel.writeString(this._value);
        List<Option> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Option) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.required ? 1 : 0);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public String get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l String str) {
        this._value = str;
    }

    public PublishMethodWithAllSelectedValueParameter(@k String str, @k String str2, @l Displaying displaying, @l String str3, @l List<Option> list, boolean z12, @l Boolean bool, boolean z13, @l AttributedText attributedText) {
        this.id = str;
        this.title = str2;
        this.displaying = displaying;
        this._value = str3;
        this.values = list;
        this.required = z12;
        this.updatesForm = bool;
        this.immutable = z13;
        this.motivation = attributedText;
    }

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;", "Landroid/os/Parcelable;", "", "text", "hint", "Lcom/avito/android/remote/model/category_parameters/Link;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/Link;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/Link;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/Link;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getHint", "Lcom/avito/android/remote/model/category_parameters/Link;", "getLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionDisplayDescription implements Parcelable {

        @k
        public static final Parcelable.Creator<OptionDisplayDescription> CREATOR = new Creator();

        @c("hint")
        @l
        private final String hint;

        @c("link")
        @l
        private final Link link;

        @c("text")
        @k
        private final String text;

        /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionDisplayDescription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionDisplayDescription createFromParcel(@k Parcel parcel) {
                return new OptionDisplayDescription(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionDisplayDescription[] newArray(int i12) {
                return new OptionDisplayDescription[i12];
            }
        }

        public OptionDisplayDescription(@k String str, @l String str2, @l Link link) {
            this.text = str;
            this.hint = str2;
            this.link = link;
        }

        public static /* synthetic */ OptionDisplayDescription copy$default(OptionDisplayDescription optionDisplayDescription, String str, String str2, Link link, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = optionDisplayDescription.text;
            }
            if ((i12 & 2) != 0) {
                str2 = optionDisplayDescription.hint;
            }
            if ((i12 & 4) != 0) {
                link = optionDisplayDescription.link;
            }
            return optionDisplayDescription.copy(str, str2, link);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Link getLink() {
            return this.link;
        }

        @k
        public final OptionDisplayDescription copy(@k String text, @l String hint, @l Link link) {
            return new OptionDisplayDescription(text, hint, link);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionDisplayDescription)) {
                return false;
            }
            OptionDisplayDescription optionDisplayDescription = (OptionDisplayDescription) other;
            return L.f(this.text, optionDisplayDescription.text) && L.f(this.hint, optionDisplayDescription.hint) && L.f(this.link, optionDisplayDescription.link);
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @l
        public final Link getLink() {
            return this.link;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            String str = this.hint;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Link link = this.link;
            return iHashCode2 + (link != null ? link.hashCode() : 0);
        }

        @k
        public String toString() {
            return "OptionDisplayDescription(text=" + this.text + ", hint=" + this.hint + ", link=" + this.link + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.hint);
            Link link = this.link;
            if (link == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                link.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ OptionDisplayDescription(String str, String str2, Link link, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : link);
        }
    }

    /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/badge/SimpleBadge;", "badge", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;", "description", "", HiddenParameter.TYPE, "<init>", "(Lcom/avito/android/remote/model/badge/SimpleBadge;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;Ljava/lang/Boolean;)V", "component1", "()Lcom/avito/android/remote/model/badge/SimpleBadge;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "()Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;", "component4", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/remote/model/badge/SimpleBadge;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplay;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/badge/SimpleBadge;", "getBadge", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/category_parameters/PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription;", "getDescription", "Ljava/lang/Boolean;", "getHidden", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionDisplay implements Parcelable {

        @k
        public static final Parcelable.Creator<OptionDisplay> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("badge")
        @l
        private final SimpleBadge badge;

        @c("description")
        @l
        private final OptionDisplayDescription description;

        @c(HiddenParameter.TYPE)
        @l
        private final Boolean hidden;

        /* compiled from: PublishMethodWithAllSelectedValueParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionDisplay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionDisplay createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf = null;
                SimpleBadge simpleBadgeCreateFromParcel = parcel.readInt() == 0 ? null : SimpleBadge.CREATOR.createFromParcel(parcel);
                UniversalColor universalColor = (UniversalColor) parcel.readParcelable(OptionDisplay.class.getClassLoader());
                OptionDisplayDescription optionDisplayDescriptionCreateFromParcel = parcel.readInt() == 0 ? null : OptionDisplayDescription.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new OptionDisplay(simpleBadgeCreateFromParcel, universalColor, optionDisplayDescriptionCreateFromParcel, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionDisplay[] newArray(int i12) {
                return new OptionDisplay[i12];
            }
        }

        public OptionDisplay(@l SimpleBadge simpleBadge, @l UniversalColor universalColor, @l OptionDisplayDescription optionDisplayDescription, @l Boolean bool) {
            this.badge = simpleBadge;
            this.backgroundColor = universalColor;
            this.description = optionDisplayDescription;
            this.hidden = bool;
        }

        public static /* synthetic */ OptionDisplay copy$default(OptionDisplay optionDisplay, SimpleBadge simpleBadge, UniversalColor universalColor, OptionDisplayDescription optionDisplayDescription, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                simpleBadge = optionDisplay.badge;
            }
            if ((i12 & 2) != 0) {
                universalColor = optionDisplay.backgroundColor;
            }
            if ((i12 & 4) != 0) {
                optionDisplayDescription = optionDisplay.description;
            }
            if ((i12 & 8) != 0) {
                bool = optionDisplay.hidden;
            }
            return optionDisplay.copy(simpleBadge, universalColor, optionDisplayDescription, bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final SimpleBadge getBadge() {
            return this.badge;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final OptionDisplayDescription getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getHidden() {
            return this.hidden;
        }

        @k
        public final OptionDisplay copy(@l SimpleBadge badge, @l UniversalColor backgroundColor, @l OptionDisplayDescription description, @l Boolean hidden) {
            return new OptionDisplay(badge, backgroundColor, description, hidden);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionDisplay)) {
                return false;
            }
            OptionDisplay optionDisplay = (OptionDisplay) other;
            return L.f(this.badge, optionDisplay.badge) && L.f(this.backgroundColor, optionDisplay.backgroundColor) && L.f(this.description, optionDisplay.description) && L.f(this.hidden, optionDisplay.hidden);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final SimpleBadge getBadge() {
            return this.badge;
        }

        @l
        public final OptionDisplayDescription getDescription() {
            return this.description;
        }

        @l
        public final Boolean getHidden() {
            return this.hidden;
        }

        public int hashCode() {
            SimpleBadge simpleBadge = this.badge;
            int iHashCode = (simpleBadge == null ? 0 : simpleBadge.hashCode()) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            OptionDisplayDescription optionDisplayDescription = this.description;
            int iHashCode3 = (iHashCode2 + (optionDisplayDescription == null ? 0 : optionDisplayDescription.hashCode())) * 31;
            Boolean bool = this.hidden;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OptionDisplay(badge=");
            sb2.append(this.badge);
            sb2.append(", backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", hidden=");
            return C0.g(sb2, this.hidden, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            SimpleBadge simpleBadge = this.badge;
            if (simpleBadge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleBadge.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.backgroundColor, flags);
            OptionDisplayDescription optionDisplayDescription = this.description;
            if (optionDisplayDescription == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                optionDisplayDescription.writeToParcel(parcel, flags);
            }
            Boolean bool = this.hidden;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ OptionDisplay(SimpleBadge simpleBadge, UniversalColor universalColor, OptionDisplayDescription optionDisplayDescription, Boolean bool, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : simpleBadge, universalColor, optionDisplayDescription, bool);
        }
    }
}
