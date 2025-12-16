package com.avito.android.beduin.common.component.status_line;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: BeduinStatusLineModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0005NOPQRB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+Jv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020/HÖ\u0001¢\u0006\u0004\b6\u00101J \u0010:\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020/HÖ\u0001¢\u0006\u0004\b:\u0010;J9\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u0014H\u0002¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010$R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010&R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bH\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010+¨\u0006S"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "lineMode", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;", "lineColors", "", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$Status;", "passedStatuses", "noPassedStatuses", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;", "lineAlignment", "", "lineHorizontalSpacing", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;Ljava/lang/Float;)V", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "component4", "()Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;", "component5", "()Ljava/util/List;", "component6", "component7", "()Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;", "component8", "()Ljava/lang/Float;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;Ljava/lang/Float;)Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "apply", "(Ljava/util/List;LY41/l;)Ljava/util/List;", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "getLineMode", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;", "getLineColors", "Ljava/util/List;", "getPassedStatuses", "getNoPassedStatuses", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;", "getLineAlignment", "Ljava/lang/Float;", "getLineHorizontalSpacing", "Companion", "a", "LineAlignment", "LineColors", "LineMode", "Status", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class BeduinStatusLineModel implements BeduinModel {

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final LineAlignment lineAlignment;

    @k
    private final LineColors lineColors;

    @l
    private final Float lineHorizontalSpacing;

    @l
    private final LineMode lineMode;

    @l
    private final List<Status> noPassedStatuses;

    @l
    private final List<Status> passedStatuses;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinStatusLineModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("statusLine");

    @k
    private static final Class<BeduinStatusLineModel> model = BeduinStatusLineModel.class;

    /* compiled from: BeduinStatusLineModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "type", "", "lineShift", "<init>", "(Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;Ljava/lang/Float;)V", "component1", "()Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "component2", "()Ljava/lang/Float;", "copy", "(Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;Ljava/lang/Float;)Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "getType", "Ljava/lang/Float;", "getLineShift", "VerticalAlignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LineAlignment implements Parcelable {

        @k
        public static final Parcelable.Creator<LineAlignment> CREATOR = new a();

        @l
        private final Float lineShift;

        @k
        private final VerticalAlignment type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BeduinStatusLineModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "CENTER", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VerticalAlignment {

            @c("bottom")
            public static final VerticalAlignment BOTTOM;

            @c("center")
            public static final VerticalAlignment CENTER;

            @c("top")
            public static final VerticalAlignment TOP;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ VerticalAlignment[] f102676b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f102677c;

            static {
                VerticalAlignment verticalAlignment = new VerticalAlignment("TOP", 0);
                TOP = verticalAlignment;
                VerticalAlignment verticalAlignment2 = new VerticalAlignment("BOTTOM", 1);
                BOTTOM = verticalAlignment2;
                VerticalAlignment verticalAlignment3 = new VerticalAlignment("CENTER", 2);
                CENTER = verticalAlignment3;
                VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, verticalAlignment2, verticalAlignment3};
                f102676b = verticalAlignmentArr;
                f102677c = kotlin.enums.c.a(verticalAlignmentArr);
            }

            private VerticalAlignment(String str, int i12) {
            }

            public static VerticalAlignment valueOf(String str) {
                return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
            }

            public static VerticalAlignment[] values() {
                return (VerticalAlignment[]) f102676b.clone();
            }
        }

        /* compiled from: BeduinStatusLineModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LineAlignment> {
            @Override // android.os.Parcelable.Creator
            public final LineAlignment createFromParcel(Parcel parcel) {
                return new LineAlignment(VerticalAlignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            @Override // android.os.Parcelable.Creator
            public final LineAlignment[] newArray(int i12) {
                return new LineAlignment[i12];
            }
        }

        public LineAlignment(@k VerticalAlignment verticalAlignment, @l Float f12) {
            this.type = verticalAlignment;
            this.lineShift = f12;
        }

        public static /* synthetic */ LineAlignment copy$default(LineAlignment lineAlignment, VerticalAlignment verticalAlignment, Float f12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                verticalAlignment = lineAlignment.type;
            }
            if ((i12 & 2) != 0) {
                f12 = lineAlignment.lineShift;
            }
            return lineAlignment.copy(verticalAlignment, f12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final VerticalAlignment getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Float getLineShift() {
            return this.lineShift;
        }

        @k
        public final LineAlignment copy(@k VerticalAlignment type, @l Float lineShift) {
            return new LineAlignment(type, lineShift);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineAlignment)) {
                return false;
            }
            LineAlignment lineAlignment = (LineAlignment) other;
            return this.type == lineAlignment.type && L.f(this.lineShift, lineAlignment.lineShift);
        }

        @l
        public final Float getLineShift() {
            return this.lineShift;
        }

        @k
        public final VerticalAlignment getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Float f12 = this.lineShift;
            return iHashCode + (f12 == null ? 0 : f12.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LineAlignment(type=");
            sb2.append(this.type);
            sb2.append(", lineShift=");
            return h.d(sb2, this.lineShift, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type.name());
            Float f12 = this.lineShift;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
        }
    }

    /* compiled from: BeduinStatusLineModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "passedStatusColor", "noPassedStatusColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineColors;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getPassedStatusColor", "getNoPassedStatusColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LineColors implements Parcelable {

        @k
        public static final Parcelable.Creator<LineColors> CREATOR = new a();

        @k
        private final UniversalColor noPassedStatusColor;

        @k
        private final UniversalColor passedStatusColor;

        /* compiled from: BeduinStatusLineModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LineColors> {
            @Override // android.os.Parcelable.Creator
            public final LineColors createFromParcel(Parcel parcel) {
                return new LineColors((UniversalColor) parcel.readParcelable(LineColors.class.getClassLoader()), (UniversalColor) parcel.readParcelable(LineColors.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final LineColors[] newArray(int i12) {
                return new LineColors[i12];
            }
        }

        public LineColors(@k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.passedStatusColor = universalColor;
            this.noPassedStatusColor = universalColor2;
        }

        public static /* synthetic */ LineColors copy$default(LineColors lineColors, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = lineColors.passedStatusColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = lineColors.noPassedStatusColor;
            }
            return lineColors.copy(universalColor, universalColor2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getPassedStatusColor() {
            return this.passedStatusColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getNoPassedStatusColor() {
            return this.noPassedStatusColor;
        }

        @k
        public final LineColors copy(@k UniversalColor passedStatusColor, @k UniversalColor noPassedStatusColor) {
            return new LineColors(passedStatusColor, noPassedStatusColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineColors)) {
                return false;
            }
            LineColors lineColors = (LineColors) other;
            return L.f(this.passedStatusColor, lineColors.passedStatusColor) && L.f(this.noPassedStatusColor, lineColors.noPassedStatusColor);
        }

        @k
        public final UniversalColor getNoPassedStatusColor() {
            return this.noPassedStatusColor;
        }

        @k
        public final UniversalColor getPassedStatusColor() {
            return this.passedStatusColor;
        }

        public int hashCode() {
            return this.noPassedStatusColor.hashCode() + (this.passedStatusColor.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LineColors(passedStatusColor=");
            sb2.append(this.passedStatusColor);
            sb2.append(", noPassedStatusColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.noPassedStatusColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.passedStatusColor, flags);
            parcel.writeParcelable(this.noPassedStatusColor, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinStatusLineModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "", "", "progress", "<init>", "(Ljava/lang/String;II)V", "PASSED_NEXT_LINE_HALF", "PASSED_NEXT_LINE_QUARTER", "PASSED_NEXT_LINE_THREE_QUARTERS", "NO_PASSED_NEXT_LINE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineMode {

        @c("noPassedNextLine")
        public static final LineMode NO_PASSED_NEXT_LINE;

        @c("passedNextLineHalf")
        public static final LineMode PASSED_NEXT_LINE_HALF;

        @c("passedNextLineQuarter")
        public static final LineMode PASSED_NEXT_LINE_QUARTER;

        @c("passedNextLineThreeQuarters")
        public static final LineMode PASSED_NEXT_LINE_THREE_QUARTERS;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LineMode[] f102678c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102679d;

        /* renamed from: b, reason: collision with root package name */
        public final int f102680b;

        static {
            LineMode lineMode = new LineMode("PASSED_NEXT_LINE_HALF", 0, 50);
            PASSED_NEXT_LINE_HALF = lineMode;
            LineMode lineMode2 = new LineMode("PASSED_NEXT_LINE_QUARTER", 1, 25);
            PASSED_NEXT_LINE_QUARTER = lineMode2;
            LineMode lineMode3 = new LineMode("PASSED_NEXT_LINE_THREE_QUARTERS", 2, 75);
            PASSED_NEXT_LINE_THREE_QUARTERS = lineMode3;
            LineMode lineMode4 = new LineMode("NO_PASSED_NEXT_LINE", 3, 0);
            NO_PASSED_NEXT_LINE = lineMode4;
            LineMode[] lineModeArr = {lineMode, lineMode2, lineMode3, lineMode4};
            f102678c = lineModeArr;
            f102679d = kotlin.enums.c.a(lineModeArr);
        }

        private LineMode(String str, int i12, int i13) {
            this.f102680b = i13;
        }

        public static LineMode valueOf(String str) {
            return (LineMode) Enum.valueOf(LineMode.class, str);
        }

        public static LineMode[] values() {
            return (LineMode[]) f102678c.clone();
        }
    }

    /* compiled from: BeduinStatusLineModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$Status;", "Landroid/os/Parcelable;", "", "maxWidth", "Lcom/avito/android/beduin_models/BeduinModel;", "item", "<init>", "(Ljava/lang/Float;Lcom/avito/android/beduin_models/BeduinModel;)V", "component1", "()Ljava/lang/Float;", "component2", "()Lcom/avito/android/beduin_models/BeduinModel;", "copy", "(Ljava/lang/Float;Lcom/avito/android/beduin_models/BeduinModel;)Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$Status;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getMaxWidth", "Lcom/avito/android/beduin_models/BeduinModel;", "getItem", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Status implements Parcelable {

        @k
        public static final Parcelable.Creator<Status> CREATOR = new a();

        @k
        private final BeduinModel item;

        @l
        private final Float maxWidth;

        /* compiled from: BeduinStatusLineModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Status> {
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                return new Status(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (BeduinModel) parcel.readParcelable(Status.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i12) {
                return new Status[i12];
            }
        }

        public Status(@l Float f12, @k BeduinModel beduinModel) {
            this.maxWidth = f12;
            this.item = beduinModel;
        }

        public static /* synthetic */ Status copy$default(Status status, Float f12, BeduinModel beduinModel, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = status.maxWidth;
            }
            if ((i12 & 2) != 0) {
                beduinModel = status.item;
            }
            return status.copy(f12, beduinModel);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Float getMaxWidth() {
            return this.maxWidth;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final BeduinModel getItem() {
            return this.item;
        }

        @k
        public final Status copy(@l Float maxWidth, @k BeduinModel item) {
            return new Status(maxWidth, item);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return L.f(this.maxWidth, status.maxWidth) && L.f(this.item, status.item);
        }

        @k
        public final BeduinModel getItem() {
            return this.item;
        }

        @l
        public final Float getMaxWidth() {
            return this.maxWidth;
        }

        public int hashCode() {
            Float f12 = this.maxWidth;
            return this.item.hashCode() + ((f12 == null ? 0 : f12.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "Status(maxWidth=" + this.maxWidth + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Float f12 = this.maxWidth;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            parcel.writeParcelable(this.item, flags);
        }
    }

    /* compiled from: BeduinStatusLineModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.status_line.BeduinStatusLineModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinStatusLineModel> S() {
            return BeduinStatusLineModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinStatusLineModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinStatusLineModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinStatusLineModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinStatusLineModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinStatusLineModel.class.getClassLoader());
            LineMode lineModeValueOf = parcel.readInt() == 0 ? null : LineMode.valueOf(parcel.readString());
            LineColors lineColorsCreateFromParcel = LineColors.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(Status.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(Status.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new BeduinStatusLineModel(string, displayingPredicate, lineModeValueOf, lineColorsCreateFromParcel, arrayList, arrayList2, LineAlignment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinStatusLineModel[] newArray(int i12) {
            return new BeduinStatusLineModel[i12];
        }
    }

    public BeduinStatusLineModel(@k String str, @l DisplayingPredicate displayingPredicate, @l LineMode lineMode, @k LineColors lineColors, @l List<Status> list, @l List<Status> list2, @k LineAlignment lineAlignment, @l Float f12) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.lineMode = lineMode;
        this.lineColors = lineColors;
        this.passedStatuses = list;
        this.noPassedStatuses = list2;
        this.lineAlignment = lineAlignment;
        this.lineHorizontalSpacing = f12;
    }

    public static /* synthetic */ BeduinStatusLineModel copy$default(BeduinStatusLineModel beduinStatusLineModel, String str, DisplayingPredicate displayingPredicate, LineMode lineMode, LineColors lineColors, List list, List list2, LineAlignment lineAlignment, Float f12, int i12, Object obj) {
        return beduinStatusLineModel.copy((i12 & 1) != 0 ? beduinStatusLineModel.id : str, (i12 & 2) != 0 ? beduinStatusLineModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinStatusLineModel.lineMode : lineMode, (i12 & 8) != 0 ? beduinStatusLineModel.lineColors : lineColors, (i12 & 16) != 0 ? beduinStatusLineModel.passedStatuses : list, (i12 & 32) != 0 ? beduinStatusLineModel.noPassedStatuses : list2, (i12 & 64) != 0 ? beduinStatusLineModel.lineAlignment : lineAlignment, (i12 & 128) != 0 ? beduinStatusLineModel.lineHorizontalSpacing : f12);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        return this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final LineMode getLineMode() {
        return this.lineMode;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final LineColors getLineColors() {
        return this.lineColors;
    }

    @l
    public final List<Status> component5() {
        return this.passedStatuses;
    }

    @l
    public final List<Status> component6() {
        return this.noPassedStatuses;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final LineAlignment getLineAlignment() {
        return this.lineAlignment;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Float getLineHorizontalSpacing() {
        return this.lineHorizontalSpacing;
    }

    @k
    public final BeduinStatusLineModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l LineMode lineMode, @k LineColors lineColors, @l List<Status> passedStatuses, @l List<Status> noPassedStatuses, @k LineAlignment lineAlignment, @l Float lineHorizontalSpacing) {
        return new BeduinStatusLineModel(id2, displayingPredicate, lineMode, lineColors, passedStatuses, noPassedStatuses, lineAlignment, lineHorizontalSpacing);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinStatusLineModel)) {
            return false;
        }
        BeduinStatusLineModel beduinStatusLineModel = (BeduinStatusLineModel) other;
        return L.f(this.id, beduinStatusLineModel.id) && L.f(this.displayingPredicate, beduinStatusLineModel.displayingPredicate) && this.lineMode == beduinStatusLineModel.lineMode && L.f(this.lineColors, beduinStatusLineModel.lineColors) && L.f(this.passedStatuses, beduinStatusLineModel.passedStatuses) && L.f(this.noPassedStatuses, beduinStatusLineModel.noPassedStatuses) && L.f(this.lineAlignment, beduinStatusLineModel.lineAlignment) && L.f(this.lineHorizontalSpacing, beduinStatusLineModel.lineHorizontalSpacing);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        List<Status> list = this.passedStatuses;
        BeduinStatusLineModel beduinStatusLineModelCopy$default = null;
        List<Status> listApply = list != null ? apply(list, mapper) : null;
        List<Status> list2 = this.noPassedStatuses;
        List<Status> listApply2 = list2 != null ? apply(list2, mapper) : null;
        if (L.f(listApply, this.passedStatuses) && L.f(listApply2, this.noPassedStatuses)) {
            beduinStatusLineModelCopy$default = this;
        }
        if (beduinStatusLineModelCopy$default == null) {
            beduinStatusLineModelCopy$default = copy$default(this, null, null, null, null, listApply, listApply2, null, null, 207, null);
        }
        return (List) mapper.invoke(beduinStatusLineModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        List<Status> list = this.passedStatuses;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Status) it.next()).getItem().forEach(action);
            }
        }
        List<Status> list2 = this.noPassedStatuses;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                ((Status) it2.next()).getItem().forEach(action);
            }
        }
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final LineAlignment getLineAlignment() {
        return this.lineAlignment;
    }

    @k
    public final LineColors getLineColors() {
        return this.lineColors;
    }

    @l
    public final Float getLineHorizontalSpacing() {
        return this.lineHorizontalSpacing;
    }

    @l
    public final LineMode getLineMode() {
        return this.lineMode;
    }

    @l
    public final List<Status> getNoPassedStatuses() {
        return this.noPassedStatuses;
    }

    @l
    public final List<Status> getPassedStatuses() {
        return this.passedStatuses;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        LineMode lineMode = this.lineMode;
        int iHashCode3 = (this.lineColors.hashCode() + ((iHashCode2 + (lineMode == null ? 0 : lineMode.hashCode())) * 31)) * 31;
        List<Status> list = this.passedStatuses;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Status> list2 = this.noPassedStatuses;
        int iHashCode5 = (this.lineAlignment.hashCode() + ((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        Float f12 = this.lineHorizontalSpacing;
        return iHashCode5 + (f12 != null ? f12.hashCode() : 0);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return true;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinStatusLineModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", lineMode=");
        sb2.append(this.lineMode);
        sb2.append(", lineColors=");
        sb2.append(this.lineColors);
        sb2.append(", passedStatuses=");
        sb2.append(this.passedStatuses);
        sb2.append(", noPassedStatuses=");
        sb2.append(this.noPassedStatuses);
        sb2.append(", lineAlignment=");
        sb2.append(this.lineAlignment);
        sb2.append(", lineHorizontalSpacing=");
        return h.d(sb2, this.lineHorizontalSpacing, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        LineMode lineMode = this.lineMode;
        if (lineMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lineMode.name());
        }
        this.lineColors.writeToParcel(parcel, flags);
        List<Status> list = this.passedStatuses;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Status) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<Status> list2 = this.noPassedStatuses;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Status) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        this.lineAlignment.writeToParcel(parcel, flags);
        Float f12 = this.lineHorizontalSpacing;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
    }

    private final List<Status> apply(List<Status> list, Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar) {
        ArrayList arrayList = new ArrayList();
        for (Status status : list) {
            List<BeduinModel> listFlatMap = status.getItem().flatMap(lVar);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listFlatMap, 10));
            Iterator<T> it = listFlatMap.iterator();
            while (it.hasNext()) {
                arrayList2.add(Status.copy$default(status, null, (BeduinModel) it.next(), 1, null));
            }
            C42745f0.h(arrayList2, arrayList);
        }
        return arrayList;
    }
}
