package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CBRLivenessResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/model/l;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "c", "Lru/cyberity/cbr/core/data/model/l$b;", "Lru/cyberity/cbr/core/data/model/l$c;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class l implements Parcelable {
    public /* synthetic */ l(C42822w c42822w) {
        this();
    }

    /* compiled from: CBRLivenessResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/data/model/l$c;", "Lru/cyberity/cbr/core/data/model/l;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "reason", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRLivenessReason;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "a", "()Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "CREATOR", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends l implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final CBRLivenessReason reason;

        /* compiled from: CBRLivenessResult.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/model/l$c$a;", "Landroid/os/Parcelable$Creator;", "Lru/cyberity/cbr/core/data/model/l$c;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "(I)[Lru/cyberity/cbr/core/data/model/l$c;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.l$c$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<c> {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@Y61.k Parcel parcel) {
                return new c(parcel);
            }

            private Companion() {
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int size) {
                return new c[size];
            }
        }

        public c(@Y61.k CBRLivenessReason cBRLivenessReason) {
            super(null);
            this.reason = cBRLivenessReason;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final CBRLivenessReason getReason() {
            return this.reason;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeSerializable(this.reason);
        }

        public c(@Y61.k Parcel parcel) {
            super(null);
            this.reason = (CBRLivenessReason) parcel.readSerializable();
        }
    }

    private l() {
    }

    /* compiled from: CBRLivenessResult.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001 B1\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/cyberity/cbr/core/data/model/l$b;", "Lru/cyberity/cbr/core/data/model/l;", "Landroid/os/Parcelable;", "", "id", "type", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "reason", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/CBRLivenessReason;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "e", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "Lru/cyberity/cbr/core/data/model/AnswerType;", "f", "Lru/cyberity/cbr/core/data/model/AnswerType;", "a", "()Lru/cyberity/cbr/core/data/model/AnswerType;", "CREATOR", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends l implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String type;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final CBRLivenessReason reason;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final AnswerType answer;

        /* compiled from: CBRLivenessResult.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/model/l$b$a;", "Landroid/os/Parcelable$Creator;", "Lru/cyberity/cbr/core/data/model/l$b;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "(I)[Lru/cyberity/cbr/core/data/model/l$b;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.l$b$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<b> {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@Y61.k Parcel parcel) {
                return new b(parcel);
            }

            private Companion() {
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int size) {
                return new b[size];
            }
        }

        public b(@Y61.l String str, @Y61.l String str2, @Y61.k CBRLivenessReason cBRLivenessReason, @Y61.l String str3) {
            super(null);
            this.id = str;
            this.type = str2;
            this.reason = cBRLivenessReason;
            this.answer = AnswerType.INSTANCE.a(str3);
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final CBRLivenessReason getReason() {
            return this.reason;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.type);
            parcel.writeSerializable(this.reason);
            AnswerType answerType = this.answer;
            parcel.writeString(answerType != null ? answerType.getValue() : null);
        }

        public /* synthetic */ b(String str, String str2, CBRLivenessReason cBRLivenessReason, String str3, int i12, C42822w c42822w) {
            this(str, str2, cBRLivenessReason, (i12 & 8) != 0 ? null : str3);
        }

        public b(@Y61.k Parcel parcel) {
            super(null);
            this.id = parcel.readString();
            this.type = parcel.readString();
            this.reason = (CBRLivenessReason) parcel.readSerializable();
            this.answer = AnswerType.INSTANCE.a(parcel.readString());
        }
    }
}
