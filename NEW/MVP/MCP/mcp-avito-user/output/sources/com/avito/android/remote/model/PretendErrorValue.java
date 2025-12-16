package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PretendErrorValue.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/PretendErrorValue;", "Landroid/os/Parcelable;", "()V", "getSingleMessage", "", "AttributedMessage", "Message", "ObjectsMessages", "WithoutMessage", "Lcom/avito/android/remote/model/PretendErrorValue$AttributedMessage;", "Lcom/avito/android/remote/model/PretendErrorValue$Message;", "Lcom/avito/android/remote/model/PretendErrorValue$ObjectsMessages;", "Lcom/avito/android/remote/model/PretendErrorValue$WithoutMessage;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PretendErrorValue implements Parcelable {

    /* compiled from: PretendErrorValue.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/PretendErrorValue$AttributedMessage;", "Lcom/avito/android/remote/model/PretendErrorValue;", "Lcom/avito/android/remote/model/text/AttributedText;", "message", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/PretendErrorValue$AttributedMessage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getMessage", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AttributedMessage extends PretendErrorValue {

        @k
        public static final Parcelable.Creator<AttributedMessage> CREATOR = new Creator();

        @c("message")
        @l
        private final AttributedText message;

        /* compiled from: PretendErrorValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AttributedMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AttributedMessage createFromParcel(@k Parcel parcel) {
                return new AttributedMessage((AttributedText) parcel.readParcelable(AttributedMessage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AttributedMessage[] newArray(int i12) {
                return new AttributedMessage[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AttributedMessage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AttributedMessage copy$default(AttributedMessage attributedMessage, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = attributedMessage.message;
            }
            return attributedMessage.copy(attributedText);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AttributedText getMessage() {
            return this.message;
        }

        @k
        public final AttributedMessage copy(@l AttributedText message) {
            return new AttributedMessage(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttributedMessage) && L.f(this.message, ((AttributedMessage) other).message);
        }

        @l
        public final AttributedText getMessage() {
            return this.message;
        }

        public int hashCode() {
            AttributedText attributedText = this.message;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public String toString() {
            return a.w(new StringBuilder("AttributedMessage(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.message, flags);
        }

        public AttributedMessage(@l AttributedText attributedText) {
            super(null);
            this.message = attributedText;
        }

        public /* synthetic */ AttributedMessage(AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : attributedText);
        }
    }

    /* compiled from: PretendErrorValue.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/PretendErrorValue$Message;", "Lcom/avito/android/remote/model/PretendErrorValue;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/PretendErrorValue$Message;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Message extends PretendErrorValue {

        @k
        public static final Parcelable.Creator<Message> CREATOR = new Creator();

        @c("message")
        @l
        private final String message;

        /* compiled from: PretendErrorValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Message> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Message createFromParcel(@k Parcel parcel) {
                return new Message(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Message[] newArray(int i12) {
                return new Message[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Message() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Message copy$default(Message message, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = message.message;
            }
            return message.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final Message copy(@l String message) {
            return new Message(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Message) && L.f(this.message, ((Message) other).message);
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Message(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }

        public Message(@l String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ Message(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: PretendErrorValue.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0002\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0002\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0002\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR1\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0002\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/PretendErrorValue$ObjectsMessages;", "Lcom/avito/android/remote/model/PretendErrorValue;", "", "", "", "objectsErrorParams", "message", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Ljava/lang/String;)Lcom/avito/android/remote/model/PretendErrorValue$ObjectsMessages;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getObjectsErrorParams", "Ljava/lang/String;", "getMessage", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ObjectsMessages extends PretendErrorValue {

        @k
        public static final Parcelable.Creator<ObjectsMessages> CREATOR = new Creator();

        @l
        private final String message;

        @l
        private final Map<Integer, Map<String, PretendErrorValue>> objectsErrorParams;

        /* compiled from: PretendErrorValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ObjectsMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ObjectsMessages createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        Integer numValueOf = Integer.valueOf(parcel.readInt());
                        int i14 = parcel.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(i14);
                        int iC2 = 0;
                        while (iC2 != i14) {
                            iC2 = f.c(ObjectsMessages.class, parcel, linkedHashMap3, parcel.readString(), iC2, 1);
                        }
                        linkedHashMap2.put(numValueOf, linkedHashMap3);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ObjectsMessages(linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ObjectsMessages[] newArray(int i12) {
                return new ObjectsMessages[i12];
            }
        }

        public /* synthetic */ ObjectsMessages(Map map, String str, int i12, C42822w c42822w) {
            this(map, (i12 & 2) != 0 ? null : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ObjectsMessages copy$default(ObjectsMessages objectsMessages, Map map, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                map = objectsMessages.objectsErrorParams;
            }
            if ((i12 & 2) != 0) {
                str = objectsMessages.message;
            }
            return objectsMessages.copy(map, str);
        }

        @l
        public final Map<Integer, Map<String, PretendErrorValue>> component1() {
            return this.objectsErrorParams;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final ObjectsMessages copy(@l Map<Integer, ? extends Map<String, ? extends PretendErrorValue>> objectsErrorParams, @l String message) {
            return new ObjectsMessages(objectsErrorParams, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObjectsMessages)) {
                return false;
            }
            ObjectsMessages objectsMessages = (ObjectsMessages) other;
            return L.f(this.objectsErrorParams, objectsMessages.objectsErrorParams) && L.f(this.message, objectsMessages.message);
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @l
        public final Map<Integer, Map<String, PretendErrorValue>> getObjectsErrorParams() {
            return this.objectsErrorParams;
        }

        public int hashCode() {
            Map<Integer, Map<String, PretendErrorValue>> map = this.objectsErrorParams;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            String str = this.message;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ObjectsMessages(objectsErrorParams=");
            sb2.append(this.objectsErrorParams);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Map<Integer, Map<String, PretendErrorValue>> map = this.objectsErrorParams;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    parcel.writeInt(((Number) entry.getKey()).intValue());
                    Iterator itI = C0.i(parcel, (Map) entry.getValue());
                    while (itI.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itI.next();
                        parcel.writeString((String) entry2.getKey());
                        parcel.writeParcelable((Parcelable) entry2.getValue(), flags);
                    }
                }
            }
            parcel.writeString(this.message);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ObjectsMessages(@l Map<Integer, ? extends Map<String, ? extends PretendErrorValue>> map, @l String str) {
            super(null);
            this.objectsErrorParams = map;
            this.message = str;
        }
    }

    /* compiled from: PretendErrorValue.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/PretendErrorValue$WithoutMessage;", "Lcom/avito/android/remote/model/PretendErrorValue;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WithoutMessage extends PretendErrorValue {

        @k
        public static final WithoutMessage INSTANCE = new WithoutMessage();

        @k
        public static final Parcelable.Creator<WithoutMessage> CREATOR = new Creator();

        /* compiled from: PretendErrorValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithoutMessage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WithoutMessage createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return WithoutMessage.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WithoutMessage[] newArray(int i12) {
                return new WithoutMessage[i12];
            }
        }

        private WithoutMessage() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ PretendErrorValue(C42822w c42822w) {
        this();
    }

    @l
    public final String getSingleMessage() {
        if (this instanceof Message) {
            return ((Message) this).getMessage();
        }
        return null;
    }

    private PretendErrorValue() {
    }
}
