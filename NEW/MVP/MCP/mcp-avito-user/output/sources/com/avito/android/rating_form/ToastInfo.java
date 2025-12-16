package com.avito.android.rating_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.api.remote.model.RatingFormToastPreset;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormUtils.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/ToastInfo;", "Landroid/os/Parcelable;", "a", "Position", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ToastInfo implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f247926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f247927c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f247928d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final RatingFormToastPreset f247929e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Position f247930f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f247931g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final DeepLink f247932h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f247933i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f247925j = new a(null);

    @Y61.k
    public static final Parcelable.Creator<ToastInfo> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/ToastInfo$Position;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Position {

        /* renamed from: b, reason: collision with root package name */
        public static final Position f247934b;

        /* renamed from: c, reason: collision with root package name */
        public static final Position f247935c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Position[] f247936d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247937e;

        static {
            Position position = new Position("TOP", 0);
            f247934b = position;
            Position position2 = new Position("BOTTOM", 1);
            f247935c = position2;
            Position[] positionArr = {position, position2};
            f247936d = positionArr;
            f247937e = kotlin.enums.c.a(positionArr);
        }

        public Position() {
            throw null;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) f247936d.clone();
        }
    }

    /* compiled from: RatingFormUtils.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/ToastInfo$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingFormUtils.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.ToastInfo$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C7444a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f247938a;

            static {
                int[] iArr = new int[RatingFormToastPreset.values().length];
                try {
                    iArr[RatingFormToastPreset.INVERSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RatingFormToastPreset.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RatingFormToastPreset.DEFAULT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f247938a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static com.avito.android.component.toast.f a(@Y61.k ToastInfo toastInfo) {
            RatingFormToastPreset ratingFormToastPreset = toastInfo.f247929e;
            int i12 = ratingFormToastPreset == null ? -1 : C7444a.f247938a[ratingFormToastPreset.ordinal()];
            if (i12 != -1) {
                if (i12 == 1) {
                    return f.b.f125254a;
                }
                if (i12 == 2) {
                    f.c.f125255c.getClass();
                    return f.c.a.b();
                }
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return f.a.f125253a;
        }

        public a() {
        }
    }

    /* compiled from: RatingFormUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ToastInfo> {
        @Override // android.os.Parcelable.Creator
        public final ToastInfo createFromParcel(Parcel parcel) {
            return new ToastInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : RatingFormToastPreset.valueOf(parcel.readString()), Position.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(ToastInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ToastInfo[] newArray(int i12) {
            return new ToastInfo[i12];
        }
    }

    public ToastInfo(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l RatingFormToastPreset ratingFormToastPreset, @Y61.k Position position, @Y61.l String str3, @Y61.l DeepLink deepLink, boolean z12) {
        this.f247926b = str;
        this.f247927c = str2;
        this.f247928d = num;
        this.f247929e = ratingFormToastPreset;
        this.f247930f = position;
        this.f247931g = str3;
        this.f247932h = deepLink;
        this.f247933i = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f247926b);
        parcel.writeString(this.f247927c);
        Integer num = this.f247928d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        RatingFormToastPreset ratingFormToastPreset = this.f247929e;
        if (ratingFormToastPreset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ratingFormToastPreset.name());
        }
        parcel.writeString(this.f247930f.name());
        parcel.writeString(this.f247931g);
        parcel.writeParcelable(this.f247932h, i12);
        parcel.writeInt(this.f247933i ? 1 : 0);
    }

    public /* synthetic */ ToastInfo(String str, String str2, Integer num, RatingFormToastPreset ratingFormToastPreset, Position position, String str3, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? RatingFormToastPreset.DEFAULT : ratingFormToastPreset, position, str3, deepLink, z12);
    }
}
