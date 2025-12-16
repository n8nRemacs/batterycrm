package com.avito.android.remote.model.validation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceRequestStructure.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/validation/Block;", "Landroid/os/Parcelable;", "AttributedTextWrapper", "FieldWrapper", "SpacerWrapper", "Lcom/avito/android/remote/model/validation/Block$AttributedTextWrapper;", "Lcom/avito/android/remote/model/validation/Block$FieldWrapper;", "Lcom/avito/android/remote/model/validation/Block$SpacerWrapper;", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Block extends Parcelable {

    /* compiled from: EvidenceRequestStructure.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/validation/Block$AttributedTextWrapper;", "Lcom/avito/android/remote/model/validation/Block;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/validation/Block$AttributedTextWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AttributedTextWrapper implements Block {

        @k
        public static final Parcelable.Creator<AttributedTextWrapper> CREATOR = new Creator();

        @c("attributedText")
        @k
        private final AttributedText text;

        /* compiled from: EvidenceRequestStructure.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AttributedTextWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AttributedTextWrapper createFromParcel(@k Parcel parcel) {
                return new AttributedTextWrapper((AttributedText) parcel.readParcelable(AttributedTextWrapper.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AttributedTextWrapper[] newArray(int i12) {
                return new AttributedTextWrapper[i12];
            }
        }

        public AttributedTextWrapper(@k AttributedText attributedText) {
            this.text = attributedText;
        }

        public static /* synthetic */ AttributedTextWrapper copy$default(AttributedTextWrapper attributedTextWrapper, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = attributedTextWrapper.text;
            }
            return attributedTextWrapper.copy(attributedText);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final AttributedTextWrapper copy(@k AttributedText text) {
            return new AttributedTextWrapper(text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttributedTextWrapper) && L.f(this.text, ((AttributedTextWrapper) other).text);
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @k
        public String toString() {
            return a.w(new StringBuilder("AttributedTextWrapper(text="), this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.text, flags);
        }
    }

    /* compiled from: EvidenceRequestStructure.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/validation/Block$FieldWrapper;", "Lcom/avito/android/remote/model/validation/Block;", "Lcom/avito/android/remote/model/validation/Field;", "field", "<init>", "(Lcom/avito/android/remote/model/validation/Field;)V", "component1", "()Lcom/avito/android/remote/model/validation/Field;", "copy", "(Lcom/avito/android/remote/model/validation/Field;)Lcom/avito/android/remote/model/validation/Block$FieldWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/validation/Field;", "getField", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldWrapper implements Block {

        @k
        public static final Parcelable.Creator<FieldWrapper> CREATOR = new Creator();

        @c("field")
        @k
        private final Field field;

        /* compiled from: EvidenceRequestStructure.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FieldWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FieldWrapper createFromParcel(@k Parcel parcel) {
                return new FieldWrapper(Field.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FieldWrapper[] newArray(int i12) {
                return new FieldWrapper[i12];
            }
        }

        public FieldWrapper(@k Field field) {
            this.field = field;
        }

        public static /* synthetic */ FieldWrapper copy$default(FieldWrapper fieldWrapper, Field field, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                field = fieldWrapper.field;
            }
            return fieldWrapper.copy(field);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Field getField() {
            return this.field;
        }

        @k
        public final FieldWrapper copy(@k Field field) {
            return new FieldWrapper(field);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FieldWrapper) && L.f(this.field, ((FieldWrapper) other).field);
        }

        @k
        public final Field getField() {
            return this.field;
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        @k
        public String toString() {
            return "FieldWrapper(field=" + this.field + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.field.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: EvidenceRequestStructure.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/validation/Block$SpacerWrapper;", "Lcom/avito/android/remote/model/validation/Block;", "Lcom/avito/android/remote/model/validation/Spacer;", SpacerAttribute.ATTRIBUTE_TYPE, "<init>", "(Lcom/avito/android/remote/model/validation/Spacer;)V", "component1", "()Lcom/avito/android/remote/model/validation/Spacer;", "copy", "(Lcom/avito/android/remote/model/validation/Spacer;)Lcom/avito/android/remote/model/validation/Block$SpacerWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/validation/Spacer;", "getSpacer", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SpacerWrapper implements Block {

        @k
        public static final Parcelable.Creator<SpacerWrapper> CREATOR = new Creator();

        @c(SpacerAttribute.ATTRIBUTE_TYPE)
        @k
        private final Spacer spacer;

        /* compiled from: EvidenceRequestStructure.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SpacerWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SpacerWrapper createFromParcel(@k Parcel parcel) {
                return new SpacerWrapper(Spacer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SpacerWrapper[] newArray(int i12) {
                return new SpacerWrapper[i12];
            }
        }

        public SpacerWrapper(@k Spacer spacer) {
            this.spacer = spacer;
        }

        public static /* synthetic */ SpacerWrapper copy$default(SpacerWrapper spacerWrapper, Spacer spacer, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                spacer = spacerWrapper.spacer;
            }
            return spacerWrapper.copy(spacer);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Spacer getSpacer() {
            return this.spacer;
        }

        @k
        public final SpacerWrapper copy(@k Spacer spacer) {
            return new SpacerWrapper(spacer);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpacerWrapper) && L.f(this.spacer, ((SpacerWrapper) other).spacer);
        }

        @k
        public final Spacer getSpacer() {
            return this.spacer;
        }

        public int hashCode() {
            return this.spacer.hashCode();
        }

        @k
        public String toString() {
            return "SpacerWrapper(spacer=" + this.spacer + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.spacer.writeToParcel(parcel, flags);
        }
    }
}
