package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DialogInfo.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/DialogInfo;", "Landroid/os/Parcelable;", "", "controlsDirection", "", "isCancellable", "shouldShowCloseControl", "", "Lcom/avito/android/remote/model/DialogInfo$Content;", "content", "Lcom/avito/android/remote/model/DialogInfo$Control;", "controls", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getControlsDirection", "()Ljava/lang/String;", "Z", "()Z", "getShouldShowCloseControl", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getControls", "Content", "Control", "_avito-discouraged_avito-api_async-phone-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DialogInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<DialogInfo> CREATOR = new Creator();

    @c("content")
    @k
    private final List<Content> content;

    @c("controls")
    @k
    private final List<Control> controls;

    @c("controlsDirection")
    @k
    private final String controlsDirection;

    @c("isCancellable")
    private final boolean isCancellable;

    @c("shouldShowCloseControl")
    private final boolean shouldShowCloseControl;

    /* compiled from: DialogInfo.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/DialogInfo$Content;", "Landroid/os/Parcelable;", "", "type", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getText", "getStyle", "_avito-discouraged_avito-api_async-phone-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Content implements Parcelable {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("text")
        @l
        private final String text;

        @c("type")
        @k
        private final String type;

        /* compiled from: DialogInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Content> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Content createFromParcel(@k Parcel parcel) {
                return new Content(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@k String str, @l String str2, @l String str3) {
            this.type = str;
            this.text = str2;
            this.style = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @k
        public final String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.text);
            parcel.writeString(this.style);
        }
    }

    /* compiled from: DialogInfo.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/DialogInfo$Control;", "Landroid/os/Parcelable;", "", "type", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getTitle", "getStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_async-phone-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Control implements Parcelable {

        @k
        public static final Parcelable.Creator<Control> CREATOR = new Creator();

        @c("action")
        @l
        private final DeepLink action;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        /* compiled from: DialogInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Control> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Control createFromParcel(@k Parcel parcel) {
                return new Control(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Control.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Control[] newArray(int i12) {
                return new Control[i12];
            }
        }

        public Control(@k String str, @k String str2, @k String str3, @l DeepLink deepLink) {
            this.type = str;
            this.title = str2;
            this.style = str3;
            this.action = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getAction() {
            return this.action;
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            parcel.writeString(this.style);
            parcel.writeParcelable(this.action, flags);
        }
    }

    /* compiled from: DialogInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DialogInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DialogInfo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(Content.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(Control.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new DialogInfo(string, z12, z13, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DialogInfo[] newArray(int i12) {
            return new DialogInfo[i12];
        }
    }

    public DialogInfo(@k String str, boolean z12, boolean z13, @k List<Content> list, @k List<Control> list2) {
        this.controlsDirection = str;
        this.isCancellable = z12;
        this.shouldShowCloseControl = z13;
        this.content = list;
        this.controls = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<Content> getContent() {
        return this.content;
    }

    @k
    public final List<Control> getControls() {
        return this.controls;
    }

    @k
    public final String getControlsDirection() {
        return this.controlsDirection;
    }

    public final boolean getShouldShowCloseControl() {
        return this.shouldShowCloseControl;
    }

    /* renamed from: isCancellable, reason: from getter */
    public final boolean getIsCancellable() {
        return this.isCancellable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.controlsDirection);
        parcel.writeInt(this.isCancellable ? 1 : 0);
        parcel.writeInt(this.shouldShowCloseControl ? 1 : 0);
        Iterator itJ = C0.j(this.content, parcel);
        while (itJ.hasNext()) {
            ((Content) itJ.next()).writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.controls, parcel);
        while (itJ2.hasNext()) {
            ((Control) itJ2.next()).writeToParcel(parcel, flags);
        }
    }
}
