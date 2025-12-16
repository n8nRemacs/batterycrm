package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EntryPointParameter.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002@AB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b.\u0010\u0014R\"\u00100\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R \u00106\u001a\u00020\t8\u0016X\u0096D¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u00105\u001a\u0004\b8\u00109R \u0010;\u001a\u00020\t8\u0016X\u0096D¢\u0006\u0012\n\u0004\b;\u00107\u0012\u0004\b=\u00105\u001a\u0004\b<\u00109R\u0014\u0010?\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u000f¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/EntryPointParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;", "value", "", "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/EntryPointParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;", "getValue", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "()V", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "immutable", "getImmutable", "getImmutable$annotations", "getType", "type", "Companion", "EntryPointValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EntryPointParameter extends CategoryParameter implements Visibility, Phantom {

    @k
    public static final String TYPE = "entryPoint";

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("value")
    @l
    private final EntryPointValue value;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<EntryPointParameter> CREATOR = new Creator();

    /* compiled from: EntryPointParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EntryPointParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EntryPointParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            EntryPointValue entryPointValueCreateFromParcel = parcel.readInt() == 0 ? null : EntryPointValue.CREATOR.createFromParcel(parcel);
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
            return new EntryPointParameter(string, string2, entryPointValueCreateFromParcel, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EntryPointParameter[] newArray(int i12) {
            return new EntryPointParameter[i12];
        }
    }

    /* compiled from: EntryPointParameter.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;", "display", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;)Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;", "getDisplay", "Display", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class EntryPointValue implements Parcelable {

        @k
        public static final Parcelable.Creator<EntryPointValue> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("display")
        @l
        private final Display display;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: EntryPointParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EntryPointValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EntryPointValue createFromParcel(@k Parcel parcel) {
                return new EntryPointValue(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(EntryPointValue.class.getClassLoader()), parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EntryPointValue[] newArray(int i12) {
                return new EntryPointValue[i12];
            }
        }

        /* compiled from: EntryPointParameter.kt */
        @d
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/EntryPointParameter$EntryPointValue$Display;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getGradientColors", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Display implements Parcelable {

            @k
            public static final Parcelable.Creator<Display> CREATOR = new Creator();

            @c("gradientColors")
            @l
            private final List<UniversalColor> gradientColors;

            /* compiled from: EntryPointParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Display> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = a.l(Display.class, parcel, arrayList2, iL2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new Display(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display[] newArray(int i12) {
                    return new Display[i12];
                }
            }

            public Display(@l List<UniversalColor> list) {
                this.gradientColors = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Display copy$default(Display display, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = display.gradientColors;
                }
                return display.copy(list);
            }

            @l
            public final List<UniversalColor> component1() {
                return this.gradientColors;
            }

            @k
            public final Display copy(@l List<UniversalColor> gradientColors) {
                return new Display(gradientColors);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Display) && L.f(this.gradientColors, ((Display) other).gradientColors);
            }

            @l
            public final List<UniversalColor> getGradientColors() {
                return this.gradientColors;
            }

            public int hashCode() {
                List<UniversalColor> list = this.gradientColors;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @k
            public String toString() {
                return H.p(new StringBuilder("Display(gradientColors="), this.gradientColors, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                List<UniversalColor> list = this.gradientColors;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
        }

        public EntryPointValue(@l String str, @l String str2, @l DeepLink deepLink, @l Display display) {
            this.title = str;
            this.subtitle = str2;
            this.deepLink = deepLink;
            this.display = display;
        }

        public static /* synthetic */ EntryPointValue copy$default(EntryPointValue entryPointValue, String str, String str2, DeepLink deepLink, Display display, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = entryPointValue.title;
            }
            if ((i12 & 2) != 0) {
                str2 = entryPointValue.subtitle;
            }
            if ((i12 & 4) != 0) {
                deepLink = entryPointValue.deepLink;
            }
            if ((i12 & 8) != 0) {
                display = entryPointValue.display;
            }
            return entryPointValue.copy(str, str2, deepLink, display);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Display getDisplay() {
            return this.display;
        }

        @k
        public final EntryPointValue copy(@l String title, @l String subtitle, @l DeepLink deepLink, @l Display display) {
            return new EntryPointValue(title, subtitle, deepLink, display);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryPointValue)) {
                return false;
            }
            EntryPointValue entryPointValue = (EntryPointValue) other;
            return L.f(this.title, entryPointValue.title) && L.f(this.subtitle, entryPointValue.subtitle) && L.f(this.deepLink, entryPointValue.deepLink) && L.f(this.display, entryPointValue.display);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final Display getDisplay() {
            return this.display;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Display display = this.display;
            return iHashCode3 + (display != null ? display.hashCode() : 0);
        }

        @k
        public String toString() {
            return "EntryPointValue(title=" + this.title + ", subtitle=" + this.subtitle + ", deepLink=" + this.deepLink + ", display=" + this.display + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.deepLink, flags);
            Display display = this.display;
            if (display == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                display.writeToParcel(parcel, flags);
            }
        }
    }

    public /* synthetic */ EntryPointParameter(String str, String str2, EntryPointValue entryPointValue, Boolean bool, Boolean bool2, int i12, C42822w c42822w) {
        this(str, str2, entryPointValue, bool, (i12 & 16) != 0 ? Boolean.FALSE : bool2);
    }

    public static /* synthetic */ EntryPointParameter copy$default(EntryPointParameter entryPointParameter, String str, String str2, EntryPointValue entryPointValue, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = entryPointParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = entryPointParameter.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            entryPointValue = entryPointParameter.value;
        }
        EntryPointValue entryPointValue2 = entryPointValue;
        if ((i12 & 8) != 0) {
            bool = entryPointParameter.visible;
        }
        Boolean bool3 = bool;
        if ((i12 & 16) != 0) {
            bool2 = entryPointParameter.phantom;
        }
        return entryPointParameter.copy(str, str3, entryPointValue2, bool3, bool2);
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
    public final EntryPointValue getValue() {
        return this.value;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final EntryPointParameter copy(@k String id2, @k String title, @l EntryPointValue value, @l Boolean visible, @l Boolean phantom) {
        return new EntryPointParameter(id2, title, value, visible, phantom);
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
        if (!(other instanceof EntryPointParameter)) {
            return false;
        }
        EntryPointParameter entryPointParameter = (EntryPointParameter) other;
        return L.f(this.id, entryPointParameter.id) && L.f(this.title, entryPointParameter.title) && L.f(this.value, entryPointParameter.value) && L.f(this.visible, entryPointParameter.visible) && L.f(this.phantom, entryPointParameter.phantom);
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

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
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

    @l
    public final EntryPointValue getValue() {
        return this.value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        EntryPointValue entryPointValue = this.value;
        int iHashCode = (iD2 + (entryPointValue == null ? 0 : entryPointValue.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EntryPointParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        return C0.g(sb2, this.phantom, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        EntryPointValue entryPointValue = this.value;
        if (entryPointValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPointValue.writeToParcel(parcel, flags);
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

    public EntryPointParameter(@k String str, @k String str2, @l EntryPointValue entryPointValue, @l Boolean bool, @l Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.value = entryPointValue;
        this.visible = bool;
        this.phantom = bool2;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}
