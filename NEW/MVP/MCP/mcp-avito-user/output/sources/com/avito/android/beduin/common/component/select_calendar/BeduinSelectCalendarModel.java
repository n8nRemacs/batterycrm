package com.avito.android.beduin.common.component.select_calendar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.input.j;
import com.avito.android.beduin.common.component.input.k;
import com.avito.android.beduin.common.component.q;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.SelectDatesTransform;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectCalendarModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002fgB\u009d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0018\u00106\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b6\u0010+J\u0012\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b7\u00108JÂ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b;\u0010$J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u00182\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020<HÖ\u0001¢\u0006\u0004\bC\u0010>J \u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020<HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0019\u0010K\u001a\u00020J2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\bK\u0010LR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bP\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bS\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010T\u001a\u0004\bU\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bZ\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\b[\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\b\\\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010]\u001a\u0004\b^\u00104R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\b_\u0010$R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010T\u001a\u0004\b`\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010a\u001a\u0004\bb\u00108R\u0014\u0010c\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "text", "", "selectedDates", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "presentationStyle", "Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$BeduinCalendarSelectionType;", "selectionType", ChannelContext.Item.PLACEHOLDER, "errorMessage", "dateFormat", "Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings;", "settings", "settingsPath", "Lcom/avito/android/beduin/network/model/Constraint;", "constraints", "", "canClear", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/ScreenStyle;Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$BeduinCalendarSelectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "validateModelByConstraints", "()Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/deep_linking/links/ScreenStyle;", "component7", "()Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$BeduinCalendarSelectionType;", "component8", "component9", "component10", "component11", "()Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings;", "component12", "component13", "component14", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/ScreenStyle;Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$BeduinCalendarSelectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/input/k;", "validateText", "(Ljava/lang/String;)Lcom/avito/android/beduin/common/component/input/k;", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getText", "Ljava/util/List;", "getSelectedDates", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "getPresentationStyle", "Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$BeduinCalendarSelectionType;", "getSelectionType", "getPlaceholder", "getErrorMessage", "getDateFormat", "Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings;", "getSettings", "getSettingsPath", "getConstraints", "Ljava/lang/Boolean;", "getCanClear", "isValid", "()Z", "Companion", "BeduinCalendarSelectionType", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectCalendarModel extends LeafBeduinModel implements q {

    @k
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    @l
    private final Boolean canClear;

    @l
    private final List<Constraint> constraints;

    @l
    private final String dateFormat;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final String errorMessage;

    @k
    private final String id;

    @l
    private final String placeholder;

    @l
    private final ScreenStyle presentationStyle;

    @l
    private final List<String> selectedDates;

    @l
    private final BeduinCalendarSelectionType selectionType;

    @l
    private final CalendarSettings settings;

    @l
    private final String settingsPath;

    @l
    private final String text;

    @l
    private final BeduinComponentTheme theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSelectCalendarModel> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinSelectCalendarModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$BeduinCalendarSelectionType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "INTERVAL", "MULTIPLE", "SINGLE_OR_INTERVAL", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BeduinCalendarSelectionType {

        @com.google.gson.annotations.c("interval")
        public static final BeduinCalendarSelectionType INTERVAL;

        @com.google.gson.annotations.c("multiple")
        public static final BeduinCalendarSelectionType MULTIPLE;

        @com.google.gson.annotations.c("single")
        public static final BeduinCalendarSelectionType SINGLE;

        @com.google.gson.annotations.c("singleOrInterval")
        public static final BeduinCalendarSelectionType SINGLE_OR_INTERVAL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ BeduinCalendarSelectionType[] f102433b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102434c;

        /* compiled from: BeduinSelectCalendarModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102435a;

            static {
                int[] iArr = new int[BeduinCalendarSelectionType.values().length];
                try {
                    iArr[BeduinCalendarSelectionType.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BeduinCalendarSelectionType.INTERVAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BeduinCalendarSelectionType.MULTIPLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BeduinCalendarSelectionType.SINGLE_OR_INTERVAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f102435a = iArr;
            }
        }

        static {
            BeduinCalendarSelectionType beduinCalendarSelectionType = new BeduinCalendarSelectionType("SINGLE", 0);
            SINGLE = beduinCalendarSelectionType;
            BeduinCalendarSelectionType beduinCalendarSelectionType2 = new BeduinCalendarSelectionType("INTERVAL", 1);
            INTERVAL = beduinCalendarSelectionType2;
            BeduinCalendarSelectionType beduinCalendarSelectionType3 = new BeduinCalendarSelectionType("MULTIPLE", 2);
            MULTIPLE = beduinCalendarSelectionType3;
            BeduinCalendarSelectionType beduinCalendarSelectionType4 = new BeduinCalendarSelectionType("SINGLE_OR_INTERVAL", 3);
            SINGLE_OR_INTERVAL = beduinCalendarSelectionType4;
            BeduinCalendarSelectionType[] beduinCalendarSelectionTypeArr = {beduinCalendarSelectionType, beduinCalendarSelectionType2, beduinCalendarSelectionType3, beduinCalendarSelectionType4};
            f102433b = beduinCalendarSelectionTypeArr;
            f102434c = kotlin.enums.c.a(beduinCalendarSelectionTypeArr);
        }

        private BeduinCalendarSelectionType(String str, int i12) {
        }

        public static BeduinCalendarSelectionType valueOf(String str) {
            return (BeduinCalendarSelectionType) Enum.valueOf(BeduinCalendarSelectionType.class, str);
        }

        public static BeduinCalendarSelectionType[] values() {
            return (BeduinCalendarSelectionType[]) f102433b.clone();
        }
    }

    /* compiled from: BeduinSelectCalendarModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel$a;", "", "<init>", "()V", "", "DEFAULT_DATE_FORMAT", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public static String a(@k LocalDate localDate, @l String str) {
            try {
                return new DateTimeFormatterBuilder().appendPattern(str).toFormatter(new Locale("ru", "RU")).format(localDate);
            } catch (Exception unused) {
                return DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT).format(localDate);
            }
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSelectCalendarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSelectCalendarModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectCalendarModel createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSelectCalendarModel.class.getClassLoader());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ScreenStyle screenStyleValueOf = parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString());
            BeduinCalendarSelectionType beduinCalendarSelectionTypeValueOf = parcel.readInt() == 0 ? null : BeduinCalendarSelectionType.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            CalendarSettings calendarSettingsCreateFromParcel = parcel.readInt() == 0 ? null : CalendarSettings.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string6;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                str = string6;
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSelectCalendarModel.class, parcel, arrayList2, iL2, 1);
                    i12 = i12;
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinSelectCalendarModel(string, displayingPredicate, beduinComponentThemeCreateFromParcel, string2, arrayListCreateStringArrayList, screenStyleValueOf, beduinCalendarSelectionTypeValueOf, string3, string4, string5, calendarSettingsCreateFromParcel, str, arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectCalendarModel[] newArray(int i12) {
            return new BeduinSelectCalendarModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectCalendarModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme beduinComponentTheme, @l String str2, @l List<String> list, @l ScreenStyle screenStyle, @l BeduinCalendarSelectionType beduinCalendarSelectionType, @l String str3, @l String str4, @l String str5, @l CalendarSettings calendarSettings, @l String str6, @l List<? extends Constraint> list2, @l Boolean bool) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.theme = beduinComponentTheme;
        this.text = str2;
        this.selectedDates = list;
        this.presentationStyle = screenStyle;
        this.selectionType = beduinCalendarSelectionType;
        this.placeholder = str3;
        this.errorMessage = str4;
        this.dateFormat = str5;
        this.settings = calendarSettings;
        this.settingsPath = str6;
        this.constraints = list2;
        this.canClear = bool;
    }

    public static /* synthetic */ BeduinSelectCalendarModel copy$default(BeduinSelectCalendarModel beduinSelectCalendarModel, String str, DisplayingPredicate displayingPredicate, BeduinComponentTheme beduinComponentTheme, String str2, List list, ScreenStyle screenStyle, BeduinCalendarSelectionType beduinCalendarSelectionType, String str3, String str4, String str5, CalendarSettings calendarSettings, String str6, List list2, Boolean bool, int i12, Object obj) {
        return beduinSelectCalendarModel.copy((i12 & 1) != 0 ? beduinSelectCalendarModel.id : str, (i12 & 2) != 0 ? beduinSelectCalendarModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinSelectCalendarModel.theme : beduinComponentTheme, (i12 & 8) != 0 ? beduinSelectCalendarModel.text : str2, (i12 & 16) != 0 ? beduinSelectCalendarModel.selectedDates : list, (i12 & 32) != 0 ? beduinSelectCalendarModel.presentationStyle : screenStyle, (i12 & 64) != 0 ? beduinSelectCalendarModel.selectionType : beduinCalendarSelectionType, (i12 & 128) != 0 ? beduinSelectCalendarModel.placeholder : str3, (i12 & 256) != 0 ? beduinSelectCalendarModel.errorMessage : str4, (i12 & 512) != 0 ? beduinSelectCalendarModel.dateFormat : str5, (i12 & 1024) != 0 ? beduinSelectCalendarModel.settings : calendarSettings, (i12 & 2048) != 0 ? beduinSelectCalendarModel.settingsPath : str6, (i12 & 4096) != 0 ? beduinSelectCalendarModel.constraints : list2, (i12 & 8192) != 0 ? beduinSelectCalendarModel.canClear : bool);
    }

    private final com.avito.android.beduin.common.component.input.k validateText(String text) {
        List list = this.constraints;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        if (text == null) {
            text = "";
        }
        return j.b(text, null, list);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, null, null, null, 16381, null);
        }
        if (transform instanceof TextTransform) {
            return copy$default(this, null, null, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, null, 16375, null).validateModelByConstraints();
        }
        if (!(transform instanceof SelectDatesTransform)) {
            return transform instanceof ErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, ((ErrorMessageTransform) transform).getErrorMessage(), null, null, null, null, null, 16127, null) : this;
        }
        ArrayList<LocalDate> arrayList = ((SelectDatesTransform) transform).f103404b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (LocalDate localDate : arrayList) {
            INSTANCE.getClass();
            arrayList2.add(Companion.a(localDate, DEFAULT_DATE_FORMAT));
        }
        return copy$default(this, null, null, null, null, arrayList2, null, null, null, null, null, null, null, null, null, 16367, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getDateFormat() {
        return this.dateFormat;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final CalendarSettings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getSettingsPath() {
        return this.settingsPath;
    }

    @l
    public final List<Constraint> component13() {
        return this.constraints;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Boolean getCanClear() {
        return this.canClear;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    public final List<String> component5() {
        return this.selectedDates;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ScreenStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinCalendarSelectionType getSelectionType() {
        return this.selectionType;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @k
    public final BeduinSelectCalendarModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme theme, @l String text, @l List<String> selectedDates, @l ScreenStyle presentationStyle, @l BeduinCalendarSelectionType selectionType, @l String placeholder, @l String errorMessage, @l String dateFormat, @l CalendarSettings settings, @l String settingsPath, @l List<? extends Constraint> constraints, @l Boolean canClear) {
        return new BeduinSelectCalendarModel(id2, displayingPredicate, theme, text, selectedDates, presentationStyle, selectionType, placeholder, errorMessage, dateFormat, settings, settingsPath, constraints, canClear);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSelectCalendarModel)) {
            return false;
        }
        BeduinSelectCalendarModel beduinSelectCalendarModel = (BeduinSelectCalendarModel) other;
        return L.f(this.id, beduinSelectCalendarModel.id) && L.f(this.displayingPredicate, beduinSelectCalendarModel.displayingPredicate) && this.theme == beduinSelectCalendarModel.theme && L.f(this.text, beduinSelectCalendarModel.text) && L.f(this.selectedDates, beduinSelectCalendarModel.selectedDates) && this.presentationStyle == beduinSelectCalendarModel.presentationStyle && this.selectionType == beduinSelectCalendarModel.selectionType && L.f(this.placeholder, beduinSelectCalendarModel.placeholder) && L.f(this.errorMessage, beduinSelectCalendarModel.errorMessage) && L.f(this.dateFormat, beduinSelectCalendarModel.dateFormat) && L.f(this.settings, beduinSelectCalendarModel.settings) && L.f(this.settingsPath, beduinSelectCalendarModel.settingsPath) && L.f(this.constraints, beduinSelectCalendarModel.constraints) && L.f(this.canClear, beduinSelectCalendarModel.canClear);
    }

    @l
    public final Boolean getCanClear() {
        return this.canClear;
    }

    @l
    public final List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final String getDateFormat() {
        return this.dateFormat;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final ScreenStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    public final List<String> getSelectedDates() {
        return this.selectedDates;
    }

    @l
    public final BeduinCalendarSelectionType getSelectionType() {
        return this.selectionType;
    }

    @l
    public final CalendarSettings getSettings() {
        return this.settings;
    }

    @l
    public final String getSettingsPath() {
        return this.settingsPath;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode3 = (iHashCode2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str = this.text;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.selectedDates;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ScreenStyle screenStyle = this.presentationStyle;
        int iHashCode6 = (iHashCode5 + (screenStyle == null ? 0 : screenStyle.hashCode())) * 31;
        BeduinCalendarSelectionType beduinCalendarSelectionType = this.selectionType;
        int iHashCode7 = (iHashCode6 + (beduinCalendarSelectionType == null ? 0 : beduinCalendarSelectionType.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateFormat;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CalendarSettings calendarSettings = this.settings;
        int iHashCode11 = (iHashCode10 + (calendarSettings == null ? 0 : calendarSettings.hashCode())) * 31;
        String str5 = this.settingsPath;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Constraint> list2 = this.constraints;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.canClear;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        String str = this.errorMessage;
        return (str == null || str.length() == 0) && L.f(validateText(this.text), k.b.f101561a);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSelectCalendarModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", selectedDates=");
        sb2.append(this.selectedDates);
        sb2.append(", presentationStyle=");
        sb2.append(this.presentationStyle);
        sb2.append(", selectionType=");
        sb2.append(this.selectionType);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", dateFormat=");
        sb2.append(this.dateFormat);
        sb2.append(", settings=");
        sb2.append(this.settings);
        sb2.append(", settingsPath=");
        sb2.append(this.settingsPath);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", canClear=");
        return C0.g(sb2, this.canClear, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    public BeduinModel validateModelByConstraints() {
        return copy$default(this, null, null, null, null, null, null, null, null, j.a(validateText(this.text)), null, null, null, null, null, 16127, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.text);
        parcel.writeStringList(this.selectedDates);
        ScreenStyle screenStyle = this.presentationStyle;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
        BeduinCalendarSelectionType beduinCalendarSelectionType = this.selectionType;
        if (beduinCalendarSelectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinCalendarSelectionType.name());
        }
        parcel.writeString(this.placeholder);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.dateFormat);
        CalendarSettings calendarSettings = this.settings;
        if (calendarSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            calendarSettings.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.settingsPath);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Boolean bool = this.canClear;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
