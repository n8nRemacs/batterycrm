package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.parse.adapter.RegexDeserializer;
import com.google.gson.annotations.b;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43059p;

/* compiled from: Constraint.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/network/model/Constraint;", "Landroid/os/Parcelable;", "<init>", "()V", "Length", "NotEmpty", "Regexp", "Lcom/avito/android/beduin/network/model/Constraint$Length;", "Lcom/avito/android/beduin/network/model/Constraint$NotEmpty;", "Lcom/avito/android/beduin/network/model/Constraint$Regexp;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Constraint implements Parcelable {

    /* compiled from: Constraint.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/network/model/Constraint$Length;", "Lcom/avito/android/beduin/network/model/Constraint;", "", "min", "max", "", "errorText", "<init>", "(IILjava/lang/String;)V", "I", "e", "()I", "d", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Length extends Constraint {

        @k
        public static final Parcelable.Creator<Length> CREATOR = new a();

        @c("errorText")
        @k
        private final String errorText;

        @c("maxLength")
        private final int max;

        @c("minLength")
        private final int min;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Length> {
            @Override // android.os.Parcelable.Creator
            public final Length createFromParcel(Parcel parcel) {
                return new Length(parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Length[] newArray(int i12) {
                return new Length[i12];
            }
        }

        public Length(int i12, int i13, @k String str) {
            super(null);
            this.min = i12;
            this.max = i13;
            this.errorText = str;
        }

        @Override // com.avito.android.beduin.network.model.Constraint
        @k
        /* renamed from: c, reason: from getter */
        public final String getErrorText() {
            return this.errorText;
        }

        /* renamed from: d, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Length)) {
                return false;
            }
            Length length = (Length) obj;
            return this.min == length.min && this.max == length.max && L.f(this.errorText, length.errorText);
        }

        public final int hashCode() {
            return this.errorText.hashCode() + r.e(this.max, Integer.hashCode(this.min) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Length(min=");
            sb2.append(this.min);
            sb2.append(", max=");
            sb2.append(this.max);
            sb2.append(", errorText=");
            return C22026a.c(sb2, this.errorText, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.min);
            parcel.writeInt(this.max);
            parcel.writeString(this.errorText);
        }
    }

    /* compiled from: Constraint.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/network/model/Constraint$NotEmpty;", "Lcom/avito/android/beduin/network/model/Constraint;", "", "errorText", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotEmpty extends Constraint {

        @k
        public static final Parcelable.Creator<NotEmpty> CREATOR = new a();

        @c("errorText")
        @k
        private final String errorText;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotEmpty> {
            @Override // android.os.Parcelable.Creator
            public final NotEmpty createFromParcel(Parcel parcel) {
                return new NotEmpty(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotEmpty[] newArray(int i12) {
                return new NotEmpty[i12];
            }
        }

        public NotEmpty(@k String str) {
            super(null);
            this.errorText = str;
        }

        @Override // com.avito.android.beduin.network.model.Constraint
        @k
        /* renamed from: c, reason: from getter */
        public final String getErrorText() {
            return this.errorText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotEmpty) && L.f(this.errorText, ((NotEmpty) obj).errorText);
        }

        public final int hashCode() {
            return this.errorText.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NotEmpty(errorText="), this.errorText, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.errorText);
        }
    }

    /* compiled from: Constraint.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/beduin/network/model/Constraint$Regexp;", "Lcom/avito/android/beduin/network/model/Constraint;", "Lkotlin/text/p;", "pattern", "", "errorText", "", "passOnMatch", "<init>", "(Lkotlin/text/p;Ljava/lang/String;Z)V", "Lkotlin/text/p;", "e", "()Lkotlin/text/p;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "d", "()Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Regexp extends Constraint {

        @k
        public static final Parcelable.Creator<Regexp> CREATOR = new a();

        @c("errorText")
        @k
        private final String errorText;

        @c("passOnMatch")
        private final boolean passOnMatch;

        @c("pattern")
        @b(RegexDeserializer.class)
        @k
        private final C43059p pattern;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Regexp> {
            @Override // android.os.Parcelable.Creator
            public final Regexp createFromParcel(Parcel parcel) {
                return new Regexp((C43059p) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Regexp[] newArray(int i12) {
                return new Regexp[i12];
            }
        }

        public /* synthetic */ Regexp(C43059p c43059p, String str, boolean z12, int i12, C42822w c42822w) {
            this(c43059p, str, (i12 & 4) != 0 ? false : z12);
        }

        @Override // com.avito.android.beduin.network.model.Constraint
        @k
        /* renamed from: c, reason: from getter */
        public final String getErrorText() {
            return this.errorText;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getPassOnMatch() {
            return this.passOnMatch;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final C43059p getPattern() {
            return this.pattern;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Regexp)) {
                return false;
            }
            Regexp regexp = (Regexp) obj;
            return L.f(this.pattern, regexp.pattern) && L.f(this.errorText, regexp.errorText) && this.passOnMatch == regexp.passOnMatch;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.passOnMatch) + H.d(this.pattern.hashCode() * 31, 31, this.errorText);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Regexp(pattern=");
            sb2.append(this.pattern);
            sb2.append(", errorText=");
            sb2.append(this.errorText);
            sb2.append(", passOnMatch=");
            return r.x(sb2, this.passOnMatch, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.pattern);
            parcel.writeString(this.errorText);
            parcel.writeInt(this.passOnMatch ? 1 : 0);
        }

        public Regexp(@k C43059p c43059p, @k String str, boolean z12) {
            super(null);
            this.pattern = c43059p;
            this.errorText = str;
            this.passOnMatch = z12;
        }
    }

    public /* synthetic */ Constraint(C42822w c42822w) {
        this();
    }

    @k
    /* renamed from: c */
    public abstract String getErrorText();

    private Constraint() {
    }
}
