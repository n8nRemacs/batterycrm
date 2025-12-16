package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ModelSpecifications.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001f !\"B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/ModelSpecifications;", "Landroid/os/Parcelable;", "", "title", "modelTitle", "Lcom/avito/android/remote/model/ModelSpecifications$Scheme;", "scheme", "", "Lcom/avito/android/remote/model/ModelSpecifications$Block;", "blocks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ModelSpecifications$Scheme;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getModelTitle", "Lcom/avito/android/remote/model/ModelSpecifications$Scheme;", "getScheme", "()Lcom/avito/android/remote/model/ModelSpecifications$Scheme;", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "Block", "Line", "Parameter", "Scheme", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ModelSpecifications implements Parcelable {

    @k
    public static final Parcelable.Creator<ModelSpecifications> CREATOR = new Creator();

    @c("blocks")
    @k
    private final List<Block> blocks;

    @c("modelTitle")
    @l
    private final String modelTitle;

    @c("scheme")
    @l
    private final Scheme scheme;

    @c("title")
    @l
    private final String title;

    /* compiled from: ModelSpecifications.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/ModelSpecifications$Block;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/ModelSpecifications$Parameter;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getParams", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Block implements Parcelable {

        @k
        public static final Parcelable.Creator<Block> CREATOR = new Creator();

        @c("params")
        @k
        private final List<Parameter> params;

        @c("title")
        @k
        private final String title;

        /* compiled from: ModelSpecifications.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Block> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Block createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Parameter.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Block(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Block[] newArray(int i12) {
                return new Block[i12];
            }
        }

        public Block(@k String str, @k List<Parameter> list) {
            this.title = str;
            this.params = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<Parameter> getParams() {
            return this.params;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.params, parcel);
            while (itJ.hasNext()) {
                ((Parameter) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ModelSpecifications.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ModelSpecifications> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelSpecifications createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Scheme schemeCreateFromParcel = parcel.readInt() == 0 ? null : Scheme.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Block.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ModelSpecifications(string, string2, schemeCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelSpecifications[] newArray(int i12) {
            return new ModelSpecifications[i12];
        }
    }

    /* compiled from: ModelSpecifications.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/ModelSpecifications$Line;", "Landroid/os/Parcelable;", "", "label", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/String;FF)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "F", "getFrom", "()F", "getTo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Line implements Parcelable {

        @k
        public static final Parcelable.Creator<Line> CREATOR = new Creator();

        @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        private final float from;

        @c("label")
        @k
        private final String label;

        @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        private final float to;

        /* compiled from: ModelSpecifications.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Line> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Line createFromParcel(@k Parcel parcel) {
                return new Line(parcel.readString(), parcel.readFloat(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Line[] newArray(int i12) {
                return new Line[i12];
            }
        }

        public Line(@k String str, float f12, float f13) {
            this.label = str;
            this.from = f12;
            this.to = f13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final float getFrom() {
            return this.from;
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        public final float getTo() {
            return this.to;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.label);
            parcel.writeFloat(this.from);
            parcel.writeFloat(this.to);
        }
    }

    /* compiled from: ModelSpecifications.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/ModelSpecifications$Parameter;", "Landroid/os/Parcelable;", "", "name", "value", "", "important", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getValue", "Ljava/lang/Boolean;", "getImportant", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Parameter implements Parcelable {

        @k
        public static final Parcelable.Creator<Parameter> CREATOR = new Creator();

        @c("important")
        @l
        private final Boolean important;

        @c("name")
        @k
        private final String name;

        @c("value")
        @k
        private final String value;

        /* compiled from: ModelSpecifications.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Parameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Parameter createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Parameter(string, string2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Parameter[] newArray(int i12) {
                return new Parameter[i12];
            }
        }

        public Parameter(@k String str, @k String str2, @l Boolean bool) {
            this.name = str;
            this.value = str2;
            this.important = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Boolean getImportant() {
            return this.important;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            Boolean bool = this.important;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: ModelSpecifications.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/ModelSpecifications$Scheme;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ModelSpecifications$Line;", "left", "top", "right", "bottom", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/ModelSpecifications$Line;Lcom/avito/android/remote/model/ModelSpecifications$Line;Lcom/avito/android/remote/model/ModelSpecifications$Line;Lcom/avito/android/remote/model/ModelSpecifications$Line;Lcom/avito/android/remote/model/Image;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ModelSpecifications$Line;", "getLeft", "()Lcom/avito/android/remote/model/ModelSpecifications$Line;", "getTop", "getRight", "getBottom", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scheme implements Parcelable {

        @k
        public static final Parcelable.Creator<Scheme> CREATOR = new Creator();

        @c("bottom")
        @l
        private final Line bottom;

        @c("image")
        @k
        private final Image image;

        @c("left")
        @l
        private final Line left;

        @c("right")
        @l
        private final Line right;

        @c("top")
        @l
        private final Line top;

        /* compiled from: ModelSpecifications.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Scheme> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Scheme createFromParcel(@k Parcel parcel) {
                return new Scheme(parcel.readInt() == 0 ? null : Line.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Line.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Line.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Line.CREATOR.createFromParcel(parcel) : null, (Image) parcel.readParcelable(Scheme.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Scheme[] newArray(int i12) {
                return new Scheme[i12];
            }
        }

        public Scheme(@l Line line, @l Line line2, @l Line line3, @l Line line4, @k Image image) {
            this.left = line;
            this.top = line2;
            this.right = line3;
            this.bottom = line4;
            this.image = image;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Line getBottom() {
            return this.bottom;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @l
        public final Line getLeft() {
            return this.left;
        }

        @l
        public final Line getRight() {
            return this.right;
        }

        @l
        public final Line getTop() {
            return this.top;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Line line = this.left;
            if (line == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                line.writeToParcel(parcel, flags);
            }
            Line line2 = this.top;
            if (line2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                line2.writeToParcel(parcel, flags);
            }
            Line line3 = this.right;
            if (line3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                line3.writeToParcel(parcel, flags);
            }
            Line line4 = this.bottom;
            if (line4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                line4.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.image, flags);
        }
    }

    public ModelSpecifications(@l String str, @l String str2, @l Scheme scheme, @k List<Block> list) {
        this.title = str;
        this.modelTitle = str2;
        this.scheme = scheme;
        this.blocks = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    @l
    public final String getModelTitle() {
        return this.modelTitle;
    }

    @l
    public final Scheme getScheme() {
        return this.scheme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.modelTitle);
        Scheme scheme = this.scheme;
        if (scheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scheme.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            ((Block) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
