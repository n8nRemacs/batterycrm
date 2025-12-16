package com.avito.android.remote.model.messenger.message;

import K51.d;
import V81.a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.parse.adapter.UriTypeAdapter;
import com.google.gson.annotations.b;
import com.google.gson.annotations.c;
import com.huawei.hms.api.FailedBinderCallBack;
import j.InterfaceC42154j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MessageBody.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Landroid/os/Parcelable;", "()V", "AppCall", "Call", "Companion", "Deleted", "File", "ImageBody", "ImageReference", "Item", "ItemReference", "Link", "LocalImage", "Location", "SystemMessageBody", "Text", "Unknown", "Video", "Voice", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Call;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Deleted;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$File;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$ImageBody;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$ImageReference;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Item;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$ItemReference;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$LocalImage;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Unknown;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Video;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Voice;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class MessageBody implements Parcelable {

    @k
    public static final String RANDOM_ID = "randomId";

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003HIJBi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0084\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020)HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020)HÖ\u0001¢\u0006\u0004\b5\u00106R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bD\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\bE\u0010\u0017R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\b\u0012\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\bG\u0010\u0017¨\u0006K"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "text", "Lcom/avito/android/remote/model/Action;", "call", FailedBinderCallBack.CALLER_ID, "", "duration", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "direction", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "status", "title", "subtitle", "", "isVideo", MessageBody.RANDOM_ID, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Action;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "component6", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Lcom/avito/android/remote/model/Action;", "getCall", "getCallId", "Ljava/lang/Long;", "getDuration", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "getDirection", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "getStatus", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "getRandomId", "Companion", "Direction", "Status", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AppCall extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String TYPE = "appCall";

        @k
        private final Action call;

        @l
        private final String callId;

        @l
        private final Direction direction;

        @l
        private final Long duration;

        @l
        private final Boolean isVideo;

        @l
        private final String randomId;

        @l
        private final Status status;

        @l
        private final String subtitle;

        @k
        private final String text;

        @l
        private final String title;

        @k
        public static final Parcelable.Creator<AppCall> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AppCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AppCall createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                Action action = (Action) parcel.readParcelable(AppCall.class.getClassLoader());
                String string2 = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Direction direction = (Direction) parcel.readParcelable(AppCall.class.getClassLoader());
                Status status = (Status) parcel.readParcelable(AppCall.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AppCall(string, action, string2, lValueOf, direction, status, string3, string4, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AppCall[] newArray(int i12) {
                return new AppCall[i12];
            }
        }

        /* compiled from: MessageBody.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "Landroid/os/Parcelable;", "()V", "Incoming", "Outgoing", "Unsupported", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Incoming;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Outgoing;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Unsupported;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Direction implements Parcelable {

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Incoming;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Incoming extends Direction {

                @k
                public static final Incoming INSTANCE = new Incoming();

                @k
                public static final Parcelable.Creator<Incoming> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Incoming> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Incoming createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Incoming.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Incoming[] newArray(int i12) {
                        return new Incoming[i12];
                    }
                }

                private Incoming() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Outgoing;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Outgoing extends Direction {

                @k
                public static final Outgoing INSTANCE = new Outgoing();

                @k
                public static final Parcelable.Creator<Outgoing> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Outgoing> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Outgoing createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Outgoing.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Outgoing[] newArray(int i12) {
                        return new Outgoing[i12];
                    }
                }

                private Outgoing() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Unsupported;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Direction$Unsupported;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Unsupported extends Direction {

                @k
                public static final Parcelable.Creator<Unsupported> CREATOR = new Creator();

                @l
                private final String name;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Unsupported> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Unsupported createFromParcel(@k Parcel parcel) {
                        return new Unsupported(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Unsupported[] newArray(int i12) {
                        return new Unsupported[i12];
                    }
                }

                public Unsupported(@l String str) {
                    super(null);
                    this.name = str;
                }

                public static /* synthetic */ Unsupported copy$default(Unsupported unsupported, String str, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = unsupported.name;
                    }
                    return unsupported.copy(str);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                @k
                public final Unsupported copy(@l String name) {
                    return new Unsupported(name);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Unsupported) && L.f(this.name, ((Unsupported) other).name);
                }

                @l
                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    String str = this.name;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @k
                public String toString() {
                    return C22026a.c(new StringBuilder("Unsupported(name="), this.name, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.name);
                }
            }

            public /* synthetic */ Direction(C42822w c42822w) {
                this();
            }

            private Direction() {
            }
        }

        /* compiled from: MessageBody.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "Landroid/os/Parcelable;", "()V", "Busy", "Canceled", "Missed", "NotDelivered", "Rejected", "Success", "Unsupported", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Busy;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Canceled;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Missed;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$NotDelivered;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Rejected;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Success;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Unsupported;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Status implements Parcelable {

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Busy;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Busy extends Status {

                @k
                public static final Busy INSTANCE = new Busy();

                @k
                public static final Parcelable.Creator<Busy> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Busy> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Busy createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Busy.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Busy[] newArray(int i12) {
                        return new Busy[i12];
                    }
                }

                private Busy() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Canceled;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Canceled extends Status {

                @k
                public static final Canceled INSTANCE = new Canceled();

                @k
                public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Canceled> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Canceled createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Canceled.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Canceled[] newArray(int i12) {
                        return new Canceled[i12];
                    }
                }

                private Canceled() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Missed;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Missed extends Status {

                @k
                public static final Missed INSTANCE = new Missed();

                @k
                public static final Parcelable.Creator<Missed> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Missed> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Missed createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Missed.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Missed[] newArray(int i12) {
                        return new Missed[i12];
                    }
                }

                private Missed() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$NotDelivered;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class NotDelivered extends Status {

                @k
                public static final NotDelivered INSTANCE = new NotDelivered();

                @k
                public static final Parcelable.Creator<NotDelivered> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<NotDelivered> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final NotDelivered createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return NotDelivered.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final NotDelivered[] newArray(int i12) {
                        return new NotDelivered[i12];
                    }
                }

                private NotDelivered() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Rejected;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Rejected extends Status {

                @k
                public static final Rejected INSTANCE = new Rejected();

                @k
                public static final Parcelable.Creator<Rejected> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Rejected> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Rejected createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Rejected.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Rejected[] newArray(int i12) {
                        return new Rejected[i12];
                    }
                }

                private Rejected() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Success;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Success extends Status {

                @k
                public static final Success INSTANCE = new Success();

                @k
                public static final Parcelable.Creator<Success> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Success> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Success createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return Success.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Success[] newArray(int i12) {
                        return new Success[i12];
                    }
                }

                private Success() {
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

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Unsupported;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall$Status$Unsupported;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Unsupported extends Status {

                @k
                public static final Parcelable.Creator<Unsupported> CREATOR = new Creator();

                @l
                private final String name;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Unsupported> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Unsupported createFromParcel(@k Parcel parcel) {
                        return new Unsupported(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Unsupported[] newArray(int i12) {
                        return new Unsupported[i12];
                    }
                }

                public Unsupported(@l String str) {
                    super(null);
                    this.name = str;
                }

                public static /* synthetic */ Unsupported copy$default(Unsupported unsupported, String str, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = unsupported.name;
                    }
                    return unsupported.copy(str);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                @k
                public final Unsupported copy(@l String name) {
                    return new Unsupported(name);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Unsupported) && L.f(this.name, ((Unsupported) other).name);
                }

                @l
                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    String str = this.name;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @k
                public String toString() {
                    return C22026a.c(new StringBuilder("Unsupported(name="), this.name, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.name);
                }
            }

            public /* synthetic */ Status(C42822w c42822w) {
                this();
            }

            private Status() {
            }
        }

        public /* synthetic */ AppCall(String str, Action action, String str2, Long l12, Direction direction, Status status, String str3, String str4, Boolean bool, String str5, int i12, C42822w c42822w) {
            this(str, action, str2, l12, direction, status, str3, str4, bool, (i12 & 512) != 0 ? null : str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Action getCall() {
            return this.call;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        public final AppCall copy(@k String text, @k Action call, @l String callId, @l Long duration, @l Direction direction, @l Status status, @l String title, @l String subtitle, @l Boolean isVideo, @l String randomId) {
            return new AppCall(text, call, callId, duration, direction, status, title, subtitle, isVideo, randomId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppCall)) {
                return false;
            }
            AppCall appCall = (AppCall) other;
            return L.f(this.text, appCall.text) && L.f(this.call, appCall.call) && L.f(this.callId, appCall.callId) && L.f(this.duration, appCall.duration) && L.f(this.direction, appCall.direction) && L.f(this.status, appCall.status) && L.f(this.title, appCall.title) && L.f(this.subtitle, appCall.subtitle) && L.f(this.isVideo, appCall.isVideo) && L.f(this.randomId, appCall.randomId);
        }

        @k
        public final Action getCall() {
            return this.call;
        }

        @l
        public final String getCallId() {
            return this.callId;
        }

        @l
        public final Direction getDirection() {
            return this.direction;
        }

        @l
        public final Long getDuration() {
            return this.duration;
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        @l
        public final Status getStatus() {
            return this.status;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = (this.call.hashCode() + (this.text.hashCode() * 31)) * 31;
            String str = this.callId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l12 = this.duration;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Direction direction = this.direction;
            int iHashCode4 = (iHashCode3 + (direction == null ? 0 : direction.hashCode())) * 31;
            Status status = this.status;
            int iHashCode5 = (iHashCode4 + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isVideo;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.randomId;
            return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
        }

        @l
        public final Boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AppCall(text=");
            sb2.append(this.text);
            sb2.append(", call=");
            sb2.append(this.call);
            sb2.append(", callId=");
            sb2.append(this.callId);
            sb2.append(", duration=");
            sb2.append(this.duration);
            sb2.append(", direction=");
            sb2.append(this.direction);
            sb2.append(", status=");
            sb2.append(this.status);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", isVideo=");
            sb2.append(this.isVideo);
            sb2.append(", randomId=");
            return C22026a.c(sb2, this.randomId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.call, flags);
            parcel.writeString(this.callId);
            Long l12 = this.duration;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeParcelable(this.direction, flags);
            parcel.writeParcelable(this.status, flags);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Boolean bool = this.isVideo;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.randomId);
        }

        public AppCall(@k String str, @k Action action, @l String str2, @l Long l12, @l Direction direction, @l Status status, @l String str3, @l String str4, @l Boolean bool, @l String str5) {
            super(null);
            this.text = str;
            this.call = action;
            this.callId = str2;
            this.duration = l12;
            this.direction = direction;
            this.status = status;
            this.title = str3;
            this.subtitle = str4;
            this.isVideo = bool;
            this.randomId = str5;
        }

        @InterfaceC42830m
        public static /* synthetic */ void getText$annotations() {
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Call;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "", "isIncoming", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/avito/android/remote/model/messenger/message/MessageBody$Call;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Call extends MessageBody {

        @k
        public static final String TYPE = "missed_call";
        private final boolean isIncoming;

        @k
        public static final Parcelable.Creator<Call> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Call> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Call createFromParcel(@k Parcel parcel) {
                return new Call(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Call[] newArray(int i12) {
                return new Call[i12];
            }
        }

        public Call(boolean z12) {
            super(null);
            this.isIncoming = z12;
        }

        public static /* synthetic */ Call copy$default(Call call, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = call.isIncoming;
            }
            return call.copy(z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsIncoming() {
            return this.isIncoming;
        }

        @k
        public final Call copy(boolean isIncoming) {
            return new Call(isIncoming);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Call) && this.isIncoming == ((Call) other).isIncoming;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isIncoming);
        }

        public final boolean isIncoming() {
            return this.isIncoming;
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("Call(isIncoming="), this.isIncoming, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isIncoming ? 1 : 0);
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u001d\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\n¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Deleted;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "text", MessageBody.RANDOM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Deleted;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getRandomId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Deleted extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String TYPE = "deleted";

        @l
        private final String randomId;

        @l
        private final String text;

        @k
        public static final Parcelable.Creator<Deleted> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Deleted> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Deleted createFromParcel(@k Parcel parcel) {
                return new Deleted(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Deleted[] newArray(int i12) {
                return new Deleted[i12];
            }
        }

        public /* synthetic */ Deleted(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Deleted copy$default(Deleted deleted, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = deleted.text;
            }
            if ((i12 & 2) != 0) {
                str2 = deleted.randomId;
            }
            return deleted.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        @k
        public final Deleted copy(@l String text, @l String randomId) {
            return new Deleted(text, randomId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deleted)) {
                return false;
            }
            Deleted deleted = (Deleted) other;
            return L.f(this.text, deleted.text) && L.f(this.randomId, deleted.randomId);
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        @l
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.randomId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Deleted(text=");
            sb2.append(this.text);
            sb2.append(", randomId=");
            return C22026a.c(sb2, this.randomId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.randomId);
        }

        public Deleted(@l String str, @l String str2) {
            super(null);
            this.text = str;
            this.randomId = str2;
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b+\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b,\u0010\u000e¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$File;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "fileId", "name", "", File.SIZE_IN_BYTES, File.MIME_TYPE, MessageBody.RANDOM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$File;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFileId", "getName", "J", "getSizeBytes", "getMimeType", "getRandomId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class File extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String FILE_ID = "fileId";

        @k
        public static final String MIME_TYPE = "mimeType";

        @k
        public static final String NAME = "name";

        @k
        public static final String SIZE_IN_BYTES = "sizeBytes";

        @k
        public static final String TYPE = "file";

        @c("fileId")
        @k
        private final String fileId;

        @c(MIME_TYPE)
        @l
        private final String mimeType;

        @c("name")
        @k
        private final String name;

        @c(MessageBody.RANDOM_ID)
        @l
        private final String randomId;

        @c(SIZE_IN_BYTES)
        private final long sizeBytes;

        @k
        public static final Parcelable.Creator<File> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<File> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final File createFromParcel(@k Parcel parcel) {
                return new File(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final File[] newArray(int i12) {
                return new File[i12];
            }
        }

        public /* synthetic */ File(String str, String str2, long j12, String str3, String str4, int i12, C42822w c42822w) {
            this(str, str2, j12, str3, (i12 & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ File copy$default(File file, String str, String str2, long j12, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = file.fileId;
            }
            if ((i12 & 2) != 0) {
                str2 = file.name;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                j12 = file.sizeBytes;
            }
            long j13 = j12;
            if ((i12 & 8) != 0) {
                str3 = file.mimeType;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                str4 = file.randomId;
            }
            return file.copy(str, str5, j13, str6, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        @k
        public final File copy(@k String fileId, @k String name, long sizeBytes, @l String mimeType, @l String randomId) {
            return new File(fileId, name, sizeBytes, mimeType, randomId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return L.f(this.fileId, file.fileId) && L.f(this.name, file.name) && this.sizeBytes == file.sizeBytes && L.f(this.mimeType, file.mimeType) && L.f(this.randomId, file.randomId);
        }

        @k
        public final String getFileId() {
            return this.fileId;
        }

        @l
        public final String getMimeType() {
            return this.mimeType;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public int hashCode() {
            int iG2 = r.g(H.d(this.fileId.hashCode() * 31, 31, this.name), 31, this.sizeBytes);
            String str = this.mimeType;
            int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.randomId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("File(fileId=");
            sb2.append(this.fileId);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", sizeBytes=");
            sb2.append(this.sizeBytes);
            sb2.append(", mimeType=");
            sb2.append(this.mimeType);
            sb2.append(", randomId=");
            return C22026a.c(sb2, this.randomId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fileId);
            parcel.writeString(this.name);
            parcel.writeLong(this.sizeBytes);
            parcel.writeString(this.mimeType);
            parcel.writeString(this.randomId);
        }

        public File(@k String str, @k String str2, long j12, @l String str3, @l String str4) {
            super(null);
            this.fileId = str;
            this.name = str2;
            this.sizeBytes = j12;
            this.mimeType = str3;
            this.randomId = str4;
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$ImageBody;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "copy", "(Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/messenger/message/MessageBody$ImageBody;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ImageBody extends MessageBody {

        @k
        public static final String TYPE = "image";

        @k
        private final Image image;

        @k
        public static final Parcelable.Creator<ImageBody> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageBody> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageBody createFromParcel(@k Parcel parcel) {
                return new ImageBody((Image) parcel.readParcelable(ImageBody.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageBody[] newArray(int i12) {
                return new ImageBody[i12];
            }
        }

        public ImageBody(@k Image image) {
            super(null);
            this.image = image;
        }

        public static /* synthetic */ ImageBody copy$default(ImageBody imageBody, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = imageBody.image;
            }
            return imageBody.copy(image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final ImageBody copy(@k Image image) {
            return new ImageBody(image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageBody) && L.f(this.image, ((ImageBody) other).image);
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @k
        public String toString() {
            return AK.c.o(new StringBuilder("ImageBody(image="), this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$ImageReference;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "", "imageId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$ImageReference;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getImageId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ImageReference extends MessageBody {

        @k
        public static final String TYPE = "image_ref";

        @k
        private final String imageId;

        @k
        public static final Parcelable.Creator<ImageReference> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageReference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageReference createFromParcel(@k Parcel parcel) {
                return new ImageReference(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageReference[] newArray(int i12) {
                return new ImageReference[i12];
            }
        }

        public ImageReference(@k String str) {
            super(null);
            this.imageId = str;
        }

        public static /* synthetic */ ImageReference copy$default(ImageReference imageReference, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = imageReference.imageId;
            }
            return imageReference.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getImageId() {
            return this.imageId;
        }

        @k
        public final ImageReference copy(@k String imageId) {
            return new ImageReference(imageId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageReference) && L.f(this.imageId, ((ImageReference) other).imageId);
        }

        @k
        public final String getImageId() {
            return this.imageId;
        }

        public int hashCode() {
            return this.imageId.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("ImageReference(imageId="), this.imageId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.imageId);
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$ItemReference;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "", "itemId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$ItemReference;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getItemId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ItemReference extends MessageBody {

        @k
        public static final String TYPE = "item_ref";

        @k
        private final String itemId;

        @k
        public static final Parcelable.Creator<ItemReference> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ItemReference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemReference createFromParcel(@k Parcel parcel) {
                return new ItemReference(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemReference[] newArray(int i12) {
                return new ItemReference[i12];
            }
        }

        public ItemReference(@k String str) {
            super(null);
            this.itemId = str;
        }

        public static /* synthetic */ ItemReference copy$default(ItemReference itemReference, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = itemReference.itemId;
            }
            return itemReference.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        @k
        public final ItemReference copy(@k String itemId) {
            return new ItemReference(itemId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemReference) && L.f(this.itemId, ((ItemReference) other).itemId);
        }

        @k
        public final String getItemId() {
            return this.itemId;
        }

        public int hashCode() {
            return this.itemId.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("ItemReference(itemId="), this.itemId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.itemId);
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002,-B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0014¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Link;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;", MessageSuggest.PREVIEW, MessageBody.RANDOM_ID, "", "urlsAreTrusted", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;Ljava/lang/String;Z)Lcom/avito/android/remote/model/messenger/message/MessageBody$Link;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;", "getPreview", "getRandomId", "Z", "getUrlsAreTrusted", "Companion", "Preview", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Link extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String TYPE = "link";

        @l
        private final Preview preview;

        @l
        private final String randomId;

        @k
        private final String url;
        private final boolean urlsAreTrusted;

        @k
        public static final Parcelable.Creator<Link> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Link createFromParcel(@k Parcel parcel) {
                return new Link(parcel.readString(), (Preview) parcel.readParcelable(Link.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Link[] newArray(int i12) {
                return new Link[i12];
            }
        }

        /* compiled from: MessageBody.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0086\bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;", "Landroid/os/Parcelable;", "()V", "image", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "imageId", "", "getImageId", "()Ljava/lang/String;", "withImage", "Image", "Snippet", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview$Image;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview$Snippet;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Preview implements Parcelable {

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJj\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b7\u0010\u001b¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview$Image;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;", "", ContextActionHandler.Link.URL, "domain", "", "trusted", "imageId", "Lcom/avito/android/remote/model/Image;", "image", VideoInfo.THUMBNAIL_URL, "", "thumbnailWidth", "thumbnailHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview$Image;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "getDomain", "Z", "getTrusted", "getImageId", "Lcom/avito/android/remote/model/Image;", "getImage", "getThumbnailUrl", "Ljava/lang/Integer;", "getThumbnailWidth", "getThumbnailHeight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Image extends Preview {

                @k
                public static final Parcelable.Creator<Image> CREATOR = new Creator();

                @k
                private final String domain;

                @l
                private final com.avito.android.remote.model.Image image;

                @l
                private final String imageId;

                @l
                private final Integer thumbnailHeight;

                @l
                private final String thumbnailUrl;

                @l
                private final Integer thumbnailWidth;
                private final boolean trusted;

                @k
                private final String url;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Image> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Image createFromParcel(@k Parcel parcel) {
                        return new Image(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (com.avito.android.remote.model.Image) parcel.readParcelable(Image.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Image[] newArray(int i12) {
                        return new Image[i12];
                    }
                }

                public Image(@k String str, @k String str2, boolean z12, @l String str3, @l com.avito.android.remote.model.Image image, @l String str4, @l Integer num, @l Integer num2) {
                    super(null);
                    this.url = str;
                    this.domain = str2;
                    this.trusted = z12;
                    this.imageId = str3;
                    this.image = image;
                    this.thumbnailUrl = str4;
                    this.thumbnailWidth = num;
                    this.thumbnailHeight = num2;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, boolean z12, String str3, com.avito.android.remote.model.Image image2, String str4, Integer num, Integer num2, int i12, Object obj) {
                    return image.copy((i12 & 1) != 0 ? image.url : str, (i12 & 2) != 0 ? image.domain : str2, (i12 & 4) != 0 ? image.trusted : z12, (i12 & 8) != 0 ? image.imageId : str3, (i12 & 16) != 0 ? image.image : image2, (i12 & 32) != 0 ? image.thumbnailUrl : str4, (i12 & 64) != 0 ? image.thumbnailWidth : num, (i12 & 128) != 0 ? image.thumbnailHeight : num2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getDomain() {
                    return this.domain;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getTrusted() {
                    return this.trusted;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final String getImageId() {
                    return this.imageId;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final com.avito.android.remote.model.Image getImage() {
                    return this.image;
                }

                @l
                /* renamed from: component6, reason: from getter */
                public final String getThumbnailUrl() {
                    return this.thumbnailUrl;
                }

                @l
                /* renamed from: component7, reason: from getter */
                public final Integer getThumbnailWidth() {
                    return this.thumbnailWidth;
                }

                @l
                /* renamed from: component8, reason: from getter */
                public final Integer getThumbnailHeight() {
                    return this.thumbnailHeight;
                }

                @k
                public final Image copy(@k String url, @k String domain, boolean trusted, @l String imageId, @l com.avito.android.remote.model.Image image, @l String thumbnailUrl, @l Integer thumbnailWidth, @l Integer thumbnailHeight) {
                    return new Image(url, domain, trusted, imageId, image, thumbnailUrl, thumbnailWidth, thumbnailHeight);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return L.f(this.url, image.url) && L.f(this.domain, image.domain) && this.trusted == image.trusted && L.f(this.imageId, image.imageId) && L.f(this.image, image.image) && L.f(this.thumbnailUrl, image.thumbnailUrl) && L.f(this.thumbnailWidth, image.thumbnailWidth) && L.f(this.thumbnailHeight, image.thumbnailHeight);
                }

                @k
                public final String getDomain() {
                    return this.domain;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Link.Preview
                @l
                public com.avito.android.remote.model.Image getImage() {
                    return this.image;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Link.Preview
                @l
                public String getImageId() {
                    return this.imageId;
                }

                @l
                public final Integer getThumbnailHeight() {
                    return this.thumbnailHeight;
                }

                @l
                public final String getThumbnailUrl() {
                    return this.thumbnailUrl;
                }

                @l
                public final Integer getThumbnailWidth() {
                    return this.thumbnailWidth;
                }

                public final boolean getTrusted() {
                    return this.trusted;
                }

                @k
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int i12 = r.i(H.d(this.url.hashCode() * 31, 31, this.domain), 31, this.trusted);
                    String str = this.imageId;
                    int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
                    com.avito.android.remote.model.Image image = this.image;
                    int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
                    String str2 = this.thumbnailUrl;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Integer num = this.thumbnailWidth;
                    int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.thumbnailHeight;
                    return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
                }

                @k
                public String toString() {
                    return C43066x.F0("Image(\n                        |   url='" + this.url + "',\n                        |   domain='" + this.domain + "',\n                        |   trusted=" + this.trusted + ",\n                        |   imageId=" + getImageId() + ",\n                        |   image=" + getImage() + ",\n                        |   thumbnailUrl=" + this.thumbnailUrl + ",\n                        |   thumbnailWidth=" + this.thumbnailWidth + ",\n                        |   thumbnailHeight=" + this.thumbnailHeight + "\n                        |)");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.url);
                    parcel.writeString(this.domain);
                    parcel.writeInt(this.trusted ? 1 : 0);
                    parcel.writeString(this.imageId);
                    parcel.writeParcelable(this.image, flags);
                    parcel.writeString(this.thumbnailUrl);
                    Integer num = this.thumbnailWidth;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    Integer num2 = this.thumbnailHeight;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                }
            }

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0098\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b@\u0010\u0015R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bC\u0010#¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview$Snippet;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview;", "", ContextActionHandler.Link.URL, ContextActionHandler.Link.DEEPLINK, "domain", "", "trusted", "title", "subtitle", "description", "imageId", "Lcom/avito/android/remote/model/Image;", "image", VideoInfo.THUMBNAIL_URL, "", "thumbnailWidth", "thumbnailHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/Image;", "component10", "component11", "()Ljava/lang/Integer;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Link$Preview$Snippet;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "getDeepLink", "getDomain", "Z", "getTrusted", "getTitle", "getSubtitle", "getDescription", "getImageId", "Lcom/avito/android/remote/model/Image;", "getImage", "getThumbnailUrl", "Ljava/lang/Integer;", "getThumbnailWidth", "getThumbnailHeight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Snippet extends Preview {

                @k
                public static final Parcelable.Creator<Snippet> CREATOR = new Creator();

                @l
                private final String deepLink;

                @l
                private final String description;

                @k
                private final String domain;

                @l
                private final com.avito.android.remote.model.Image image;

                @l
                private final String imageId;

                @l
                private final String subtitle;

                @l
                private final Integer thumbnailHeight;

                @l
                private final String thumbnailUrl;

                @l
                private final Integer thumbnailWidth;

                @k
                private final String title;
                private final boolean trusted;

                @k
                private final String url;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Snippet> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Snippet createFromParcel(@k Parcel parcel) {
                        return new Snippet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.avito.android.remote.model.Image) parcel.readParcelable(Snippet.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Snippet[] newArray(int i12) {
                        return new Snippet[i12];
                    }
                }

                public Snippet(@k String str, @l String str2, @k String str3, boolean z12, @k String str4, @l String str5, @l String str6, @l String str7, @l com.avito.android.remote.model.Image image, @l String str8, @l Integer num, @l Integer num2) {
                    super(null);
                    this.url = str;
                    this.deepLink = str2;
                    this.domain = str3;
                    this.trusted = z12;
                    this.title = str4;
                    this.subtitle = str5;
                    this.description = str6;
                    this.imageId = str7;
                    this.image = image;
                    this.thumbnailUrl = str8;
                    this.thumbnailWidth = num;
                    this.thumbnailHeight = num2;
                }

                public static /* synthetic */ Snippet copy$default(Snippet snippet, String str, String str2, String str3, boolean z12, String str4, String str5, String str6, String str7, com.avito.android.remote.model.Image image, String str8, Integer num, Integer num2, int i12, Object obj) {
                    return snippet.copy((i12 & 1) != 0 ? snippet.url : str, (i12 & 2) != 0 ? snippet.deepLink : str2, (i12 & 4) != 0 ? snippet.domain : str3, (i12 & 8) != 0 ? snippet.trusted : z12, (i12 & 16) != 0 ? snippet.title : str4, (i12 & 32) != 0 ? snippet.subtitle : str5, (i12 & 64) != 0 ? snippet.description : str6, (i12 & 128) != 0 ? snippet.imageId : str7, (i12 & 256) != 0 ? snippet.image : image, (i12 & 512) != 0 ? snippet.thumbnailUrl : str8, (i12 & 1024) != 0 ? snippet.thumbnailWidth : num, (i12 & 2048) != 0 ? snippet.thumbnailHeight : num2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @l
                /* renamed from: component10, reason: from getter */
                public final String getThumbnailUrl() {
                    return this.thumbnailUrl;
                }

                @l
                /* renamed from: component11, reason: from getter */
                public final Integer getThumbnailWidth() {
                    return this.thumbnailWidth;
                }

                @l
                /* renamed from: component12, reason: from getter */
                public final Integer getThumbnailHeight() {
                    return this.thumbnailHeight;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final String getDeepLink() {
                    return this.deepLink;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final String getDomain() {
                    return this.domain;
                }

                /* renamed from: component4, reason: from getter */
                public final boolean getTrusted() {
                    return this.trusted;
                }

                @k
                /* renamed from: component5, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component6, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @l
                /* renamed from: component7, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                @l
                /* renamed from: component8, reason: from getter */
                public final String getImageId() {
                    return this.imageId;
                }

                @l
                /* renamed from: component9, reason: from getter */
                public final com.avito.android.remote.model.Image getImage() {
                    return this.image;
                }

                @k
                public final Snippet copy(@k String url, @l String deepLink, @k String domain, boolean trusted, @k String title, @l String subtitle, @l String description, @l String imageId, @l com.avito.android.remote.model.Image image, @l String thumbnailUrl, @l Integer thumbnailWidth, @l Integer thumbnailHeight) {
                    return new Snippet(url, deepLink, domain, trusted, title, subtitle, description, imageId, image, thumbnailUrl, thumbnailWidth, thumbnailHeight);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Snippet)) {
                        return false;
                    }
                    Snippet snippet = (Snippet) other;
                    return L.f(this.url, snippet.url) && L.f(this.deepLink, snippet.deepLink) && L.f(this.domain, snippet.domain) && this.trusted == snippet.trusted && L.f(this.title, snippet.title) && L.f(this.subtitle, snippet.subtitle) && L.f(this.description, snippet.description) && L.f(this.imageId, snippet.imageId) && L.f(this.image, snippet.image) && L.f(this.thumbnailUrl, snippet.thumbnailUrl) && L.f(this.thumbnailWidth, snippet.thumbnailWidth) && L.f(this.thumbnailHeight, snippet.thumbnailHeight);
                }

                @l
                public final String getDeepLink() {
                    return this.deepLink;
                }

                @l
                public final String getDescription() {
                    return this.description;
                }

                @k
                public final String getDomain() {
                    return this.domain;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Link.Preview
                @l
                public com.avito.android.remote.model.Image getImage() {
                    return this.image;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Link.Preview
                @l
                public String getImageId() {
                    return this.imageId;
                }

                @l
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @l
                public final Integer getThumbnailHeight() {
                    return this.thumbnailHeight;
                }

                @l
                public final String getThumbnailUrl() {
                    return this.thumbnailUrl;
                }

                @l
                public final Integer getThumbnailWidth() {
                    return this.thumbnailWidth;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                public final boolean getTrusted() {
                    return this.trusted;
                }

                @k
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int iHashCode = this.url.hashCode() * 31;
                    String str = this.deepLink;
                    int iD2 = H.d(r.i(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.domain), 31, this.trusted), 31, this.title);
                    String str2 = this.subtitle;
                    int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.description;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.imageId;
                    int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    com.avito.android.remote.model.Image image = this.image;
                    int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
                    String str5 = this.thumbnailUrl;
                    int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    Integer num = this.thumbnailWidth;
                    int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.thumbnailHeight;
                    return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
                }

                @k
                public String toString() {
                    return C43066x.F0("Snippet(\n                        |   url='" + this.url + "',\n                        |   deepLink=" + this.deepLink + ",\n                        |   domain='" + this.domain + "',\n                        |   trusted=" + this.trusted + ",\n                        |   title='" + this.title + "',\n                        |   subtitle=" + this.subtitle + ",\n                        |   description=" + this.description + ",\n                        |   imageId=" + getImageId() + ",\n                        |   image=" + getImage() + ",\n                        |   thumbnailUrl=" + this.thumbnailUrl + ",\n                        |   thumbnailWidth=" + this.thumbnailWidth + ",\n                        |   thumbnailHeight=" + this.thumbnailHeight + "\n                        |)");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.url);
                    parcel.writeString(this.deepLink);
                    parcel.writeString(this.domain);
                    parcel.writeInt(this.trusted ? 1 : 0);
                    parcel.writeString(this.title);
                    parcel.writeString(this.subtitle);
                    parcel.writeString(this.description);
                    parcel.writeString(this.imageId);
                    parcel.writeParcelable(this.image, flags);
                    parcel.writeString(this.thumbnailUrl);
                    Integer num = this.thumbnailWidth;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    Integer num2 = this.thumbnailHeight;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                }
            }

            public /* synthetic */ Preview(C42822w c42822w) {
                this();
            }

            @l
            public abstract com.avito.android.remote.model.Image getImage();

            @l
            public abstract String getImageId();

            @k
            public final Preview withImage(@l com.avito.android.remote.model.Image image) {
                if (this instanceof Snippet) {
                    return Snippet.copy$default((Snippet) this, null, null, null, false, null, null, null, null, image, null, null, null, 3839, null);
                }
                if (this instanceof Image) {
                    return Image.copy$default((Image) this, null, null, false, null, image, null, null, null, 239, null);
                }
                throw new NoWhenBranchMatchedException();
            }

            private Preview() {
            }
        }

        public /* synthetic */ Link(String str, Preview preview, String str2, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : preview, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? false : z12);
        }

        public static /* synthetic */ Link copy$default(Link link, String str, Preview preview, String str2, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = link.url;
            }
            if ((i12 & 2) != 0) {
                preview = link.preview;
            }
            if ((i12 & 4) != 0) {
                str2 = link.randomId;
            }
            if ((i12 & 8) != 0) {
                z12 = link.urlsAreTrusted;
            }
            return link.copy(str, preview, str2, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Preview getPreview() {
            return this.preview;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUrlsAreTrusted() {
            return this.urlsAreTrusted;
        }

        @k
        public final Link copy(@k String url, @l Preview preview, @l String randomId, boolean urlsAreTrusted) {
            return new Link(url, preview, randomId, urlsAreTrusted);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return L.f(this.url, link.url) && L.f(this.preview, link.preview) && L.f(this.randomId, link.randomId) && this.urlsAreTrusted == link.urlsAreTrusted;
        }

        @l
        public final Preview getPreview() {
            return this.preview;
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        @k
        public final String getUrl() {
            return this.url;
        }

        public final boolean getUrlsAreTrusted() {
            return this.urlsAreTrusted;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            Preview preview = this.preview;
            int iHashCode2 = (iHashCode + (preview == null ? 0 : preview.hashCode())) * 31;
            String str = this.randomId;
            return Boolean.hashCode(this.urlsAreTrusted) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            return C43066x.F0("Link(\n                |   url='" + this.url + "',\n                |   preview=" + this.preview + ",\n                |   randomId=" + getRandomId() + ",\n                |   urlsAreTrusted=" + this.urlsAreTrusted + ",\n                |)");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.url);
            parcel.writeParcelable(this.preview, flags);
            parcel.writeString(this.randomId);
            parcel.writeInt(this.urlsAreTrusted ? 1 : 0);
        }

        public Link(@k String str, @l Preview preview, @l String str2, boolean z12) {
            super(null);
            this.url = str;
            this.preview = preview;
            this.randomId = str2;
            this.urlsAreTrusted = z12;
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$LocalImage;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Landroid/net/Uri;", SearchParamsConverterKt.SOURCE, "", "operationId", "", "uploadId", "<init>", "(Landroid/net/Uri;Ljava/lang/String;J)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "()J", "copy", "(Landroid/net/Uri;Ljava/lang/String;J)Lcom/avito/android/remote/model/messenger/message/MessageBody$LocalImage;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getSource", "Ljava/lang/String;", "getOperationId", "J", "getUploadId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LocalImage extends MessageBody {

        @k
        public static final String TYPE = "local_image";

        @k
        private final String operationId;

        @b(UriTypeAdapter.class)
        @k
        private final Uri source;
        private final long uploadId;

        @k
        public static final Parcelable.Creator<LocalImage> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LocalImage createFromParcel(@k Parcel parcel) {
                return new LocalImage((Uri) parcel.readParcelable(LocalImage.class.getClassLoader()), parcel.readString(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LocalImage[] newArray(int i12) {
                return new LocalImage[i12];
            }
        }

        public LocalImage(@k Uri uri, @k String str, long j12) {
            super(null);
            this.source = uri;
            this.operationId = str;
            this.uploadId = j12;
        }

        public static /* synthetic */ LocalImage copy$default(LocalImage localImage, Uri uri, String str, long j12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                uri = localImage.source;
            }
            if ((i12 & 2) != 0) {
                str = localImage.operationId;
            }
            if ((i12 & 4) != 0) {
                j12 = localImage.uploadId;
            }
            return localImage.copy(uri, str, j12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Uri getSource() {
            return this.source;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }

        /* renamed from: component3, reason: from getter */
        public final long getUploadId() {
            return this.uploadId;
        }

        @k
        public final LocalImage copy(@k Uri source, @k String operationId, long uploadId) {
            return new LocalImage(source, operationId, uploadId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalImage)) {
                return false;
            }
            LocalImage localImage = (LocalImage) other;
            return L.f(this.source, localImage.source) && L.f(this.operationId, localImage.operationId) && this.uploadId == localImage.uploadId;
        }

        @k
        public final String getOperationId() {
            return this.operationId;
        }

        @k
        public final Uri getSource() {
            return this.source;
        }

        public final long getUploadId() {
            return this.uploadId;
        }

        public int hashCode() {
            return Long.hashCode(this.uploadId) + H.d(this.source.hashCode() * 31, 31, this.operationId);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LocalImage(source=");
            sb2.append(this.source);
            sb2.append(", operationId=");
            sb2.append(this.operationId);
            sb2.append(", uploadId=");
            return r.u(sb2, this.uploadId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.source, flags);
            parcel.writeString(this.operationId);
            parcel.writeLong(this.uploadId);
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b,\u0010\u0011¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "latitude", "longitude", "", "title", Location.KIND, MessageBody.RANDOM_ID, "<init>", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Location;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "getLongitude", "Ljava/lang/String;", "getTitle", "getKind", "getRandomId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Location extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String KIND = "kind";

        @k
        public static final String LATITUDE = "lat";

        @k
        public static final String LONGITUDE = "lon";

        @k
        public static final String TITLE = "title";

        @k
        public static final String TYPE = "location";

        @c(KIND)
        @l
        private final String kind;

        @c("lat")
        private final double latitude;

        @c(LONGITUDE)
        private final double longitude;

        @c(MessageBody.RANDOM_ID)
        @l
        private final String randomId;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Location> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Location> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Location createFromParcel(@k Parcel parcel) {
                return new Location(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Location[] newArray(int i12) {
                return new Location[i12];
            }
        }

        public /* synthetic */ Location(double d12, double d13, String str, String str2, String str3, int i12, C42822w c42822w) {
            this(d12, d13, str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        @k
        public final Location copy(double latitude, double longitude, @k String title, @l String kind, @l String randomId) {
            return new Location(latitude, longitude, title, kind, randomId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return Double.compare(this.latitude, location.latitude) == 0 && Double.compare(this.longitude, location.longitude) == 0 && L.f(this.title, location.title) && L.f(this.kind, location.kind) && L.f(this.randomId, location.randomId);
        }

        @l
        public final String getKind() {
            return this.kind;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(e.d(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.title);
            String str = this.kind;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.randomId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Location(latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            sb2.append(this.longitude);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", kind=");
            sb2.append(this.kind);
            sb2.append(", randomId=");
            return C22026a.c(sb2, this.randomId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeDouble(this.latitude);
            parcel.writeDouble(this.longitude);
            parcel.writeString(this.title);
            parcel.writeString(this.kind);
            parcel.writeString(this.randomId);
        }

        public Location(double d12, double d13, @k String str, @l String str2, @l String str3) {
            super(null);
            this.latitude = d12;
            this.longitude = d13;
            this.title = str;
            this.kind = str2;
            this.randomId = str3;
        }
    }

    /* compiled from: MessageBody.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "()V", "ExtendedActions", "ExtendedButton", "ExtendedColor", "ExtendedContent", "ExtendedTextFields", "Platform", "Text", "Unknown", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Unknown;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SystemMessageBody extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody {

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;", "callback", "message", "call", "<init>", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;)V", "component1", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;", "getCallback", "getMessage", "getCall", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ExtendedActions implements Parcelable {

            @k
            public static final Parcelable.Creator<ExtendedActions> CREATOR = new Creator();

            @l
            private final ExtendedButton call;

            @l
            private final ExtendedButton callback;

            @l
            private final ExtendedButton message;

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtendedActions> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedActions createFromParcel(@k Parcel parcel) {
                    return new ExtendedActions(parcel.readInt() == 0 ? null : ExtendedButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExtendedButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExtendedButton.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedActions[] newArray(int i12) {
                    return new ExtendedActions[i12];
                }
            }

            public ExtendedActions(@l ExtendedButton extendedButton, @l ExtendedButton extendedButton2, @l ExtendedButton extendedButton3) {
                this.callback = extendedButton;
                this.message = extendedButton2;
                this.call = extendedButton3;
            }

            public static /* synthetic */ ExtendedActions copy$default(ExtendedActions extendedActions, ExtendedButton extendedButton, ExtendedButton extendedButton2, ExtendedButton extendedButton3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    extendedButton = extendedActions.callback;
                }
                if ((i12 & 2) != 0) {
                    extendedButton2 = extendedActions.message;
                }
                if ((i12 & 4) != 0) {
                    extendedButton3 = extendedActions.call;
                }
                return extendedActions.copy(extendedButton, extendedButton2, extendedButton3);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final ExtendedButton getCallback() {
                return this.callback;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final ExtendedButton getMessage() {
                return this.message;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final ExtendedButton getCall() {
                return this.call;
            }

            @k
            public final ExtendedActions copy(@l ExtendedButton callback, @l ExtendedButton message, @l ExtendedButton call) {
                return new ExtendedActions(callback, message, call);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExtendedActions)) {
                    return false;
                }
                ExtendedActions extendedActions = (ExtendedActions) other;
                return L.f(this.callback, extendedActions.callback) && L.f(this.message, extendedActions.message) && L.f(this.call, extendedActions.call);
            }

            @l
            public final ExtendedButton getCall() {
                return this.call;
            }

            @l
            public final ExtendedButton getCallback() {
                return this.callback;
            }

            @l
            public final ExtendedButton getMessage() {
                return this.message;
            }

            public int hashCode() {
                ExtendedButton extendedButton = this.callback;
                int iHashCode = (extendedButton == null ? 0 : extendedButton.hashCode()) * 31;
                ExtendedButton extendedButton2 = this.message;
                int iHashCode2 = (iHashCode + (extendedButton2 == null ? 0 : extendedButton2.hashCode())) * 31;
                ExtendedButton extendedButton3 = this.call;
                return iHashCode2 + (extendedButton3 != null ? extendedButton3.hashCode() : 0);
            }

            @k
            public String toString() {
                return "ExtendedActions(callback=" + this.callback + ", message=" + this.message + ", call=" + this.call + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                ExtendedButton extendedButton = this.callback;
                if (extendedButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    extendedButton.writeToParcel(parcel, flags);
                }
                ExtendedButton extendedButton2 = this.message;
                if (extendedButton2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    extendedButton2.writeToParcel(parcel, flags);
                }
                ExtendedButton extendedButton3 = this.call;
                if (extendedButton3 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    extendedButton3.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedColor;", "Landroid/os/Parcelable;", "", "color", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedColor;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ExtendedColor implements Parcelable {

            @k
            public static final Parcelable.Creator<ExtendedColor> CREATOR = new Creator();

            @c("color")
            @k
            private final String color;

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtendedColor> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedColor createFromParcel(@k Parcel parcel) {
                    return new ExtendedColor(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedColor[] newArray(int i12) {
                    return new ExtendedColor[i12];
                }
            }

            public ExtendedColor(@k String str) {
                this.color = str;
            }

            public static /* synthetic */ ExtendedColor copy$default(ExtendedColor extendedColor, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = extendedColor.color;
                }
                return extendedColor.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @k
            public final ExtendedColor copy(@k String color) {
                return new ExtendedColor(color);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExtendedColor) && L.f(this.color, ((ExtendedColor) other).color);
            }

            @k
            public final String getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("ExtendedColor(color="), this.color, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.color);
            }
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJR\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\r¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;", "Landroid/os/Parcelable;", "", "distance", "distanceInTime", "", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedColor;", "lines", "name", AddressParameter.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDistance", "getDistanceInTime", "Ljava/util/List;", "getLines", "getName", "getAddress", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ExtendedContent implements Parcelable {

            @k
            public static final Parcelable.Creator<ExtendedContent> CREATOR = new Creator();

            @l
            private final String address;

            @l
            private final String distance;

            @l
            private final String distanceInTime;

            @l
            private final List<ExtendedColor> lines;

            @l
            private final String name;

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtendedContent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedContent createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(ExtendedColor.CREATOR, parcel, arrayList, iC2, 1);
                        }
                    }
                    return new ExtendedContent(string, string2, arrayList, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedContent[] newArray(int i12) {
                    return new ExtendedContent[i12];
                }
            }

            public ExtendedContent(@l String str, @l String str2, @l List<ExtendedColor> list, @l String str3, @l String str4) {
                this.distance = str;
                this.distanceInTime = str2;
                this.lines = list;
                this.name = str3;
                this.address = str4;
            }

            public static /* synthetic */ ExtendedContent copy$default(ExtendedContent extendedContent, String str, String str2, List list, String str3, String str4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = extendedContent.distance;
                }
                if ((i12 & 2) != 0) {
                    str2 = extendedContent.distanceInTime;
                }
                String str5 = str2;
                if ((i12 & 4) != 0) {
                    list = extendedContent.lines;
                }
                List list2 = list;
                if ((i12 & 8) != 0) {
                    str3 = extendedContent.name;
                }
                String str6 = str3;
                if ((i12 & 16) != 0) {
                    str4 = extendedContent.address;
                }
                return extendedContent.copy(str, str5, list2, str6, str4);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getDistance() {
                return this.distance;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getDistanceInTime() {
                return this.distanceInTime;
            }

            @l
            public final List<ExtendedColor> component3() {
                return this.lines;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final String getAddress() {
                return this.address;
            }

            @k
            public final ExtendedContent copy(@l String distance, @l String distanceInTime, @l List<ExtendedColor> lines, @l String name, @l String address) {
                return new ExtendedContent(distance, distanceInTime, lines, name, address);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExtendedContent)) {
                    return false;
                }
                ExtendedContent extendedContent = (ExtendedContent) other;
                return L.f(this.distance, extendedContent.distance) && L.f(this.distanceInTime, extendedContent.distanceInTime) && L.f(this.lines, extendedContent.lines) && L.f(this.name, extendedContent.name) && L.f(this.address, extendedContent.address);
            }

            @l
            public final String getAddress() {
                return this.address;
            }

            @l
            public final String getDistance() {
                return this.distance;
            }

            @l
            public final String getDistanceInTime() {
                return this.distanceInTime;
            }

            @l
            public final List<ExtendedColor> getLines() {
                return this.lines;
            }

            @l
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.distance;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.distanceInTime;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<ExtendedColor> list = this.lines;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                String str3 = this.name;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.address;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ExtendedContent(distance=");
                sb2.append(this.distance);
                sb2.append(", distanceInTime=");
                sb2.append(this.distanceInTime);
                sb2.append(", lines=");
                sb2.append(this.lines);
                sb2.append(", name=");
                sb2.append(this.name);
                sb2.append(", address=");
                return C22026a.c(sb2, this.address, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.distance);
                parcel.writeString(this.distanceInTime);
                List<ExtendedColor> list = this.lines;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((ExtendedColor) itA.next()).writeToParcel(parcel, flags);
                    }
                }
                parcel.writeString(this.name);
                parcel.writeString(this.address);
            }
        }

        /* compiled from: MessageBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields;", "Landroid/os/Parcelable;", "()V", "Content", "Text", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields$Content;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields$Text;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class ExtendedTextFields implements Parcelable {

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields$Content;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields;", "", "type", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields$Content;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedContent;", "getContent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Content extends ExtendedTextFields {

                @k
                public static final Parcelable.Creator<Content> CREATOR = new Creator();

                @k
                private final ExtendedContent content;

                @k
                private final String type;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Content> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Content createFromParcel(@k Parcel parcel) {
                        return new Content(parcel.readString(), ExtendedContent.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Content[] newArray(int i12) {
                        return new Content[i12];
                    }
                }

                public Content(@k String str, @k ExtendedContent extendedContent) {
                    super(null);
                    this.type = str;
                    this.content = extendedContent;
                }

                public static /* synthetic */ Content copy$default(Content content, String str, ExtendedContent extendedContent, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = content.type;
                    }
                    if ((i12 & 2) != 0) {
                        extendedContent = content.content;
                    }
                    return content.copy(str, extendedContent);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final ExtendedContent getContent() {
                    return this.content;
                }

                @k
                public final Content copy(@k String type, @k ExtendedContent content) {
                    return new Content(type, content);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Content)) {
                        return false;
                    }
                    Content content = (Content) other;
                    return L.f(this.type, content.type) && L.f(this.content, content.content);
                }

                @k
                public final ExtendedContent getContent() {
                    return this.content;
                }

                @k
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    return this.content.hashCode() + (this.type.hashCode() * 31);
                }

                @k
                public String toString() {
                    return "Content(type=" + this.type + ", content=" + this.content + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type);
                    this.content.writeToParcel(parcel, flags);
                }
            }

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields;", "", "type", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields$Text;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/text/AttributedText;", "getContent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Text extends ExtendedTextFields {

                @k
                public static final Parcelable.Creator<Text> CREATOR = new Creator();

                @k
                private final AttributedText content;

                @k
                private final String type;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Text> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Text createFromParcel(@k Parcel parcel) {
                        return new Text(parcel.readString(), (AttributedText) parcel.readParcelable(Text.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Text[] newArray(int i12) {
                        return new Text[i12];
                    }
                }

                public Text(@k String str, @k AttributedText attributedText) {
                    super(null);
                    this.type = str;
                    this.content = attributedText;
                }

                public static /* synthetic */ Text copy$default(Text text, String str, AttributedText attributedText, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = text.type;
                    }
                    if ((i12 & 2) != 0) {
                        attributedText = text.content;
                    }
                    return text.copy(str, attributedText);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final AttributedText getContent() {
                    return this.content;
                }

                @k
                public final Text copy(@k String type, @k AttributedText content) {
                    return new Text(type, content);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return L.f(this.type, text.type) && L.f(this.content, text.content);
                }

                @k
                public final AttributedText getContent() {
                    return this.content;
                }

                @k
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    return this.content.hashCode() + (this.type.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Text(type=");
                    sb2.append(this.type);
                    sb2.append(", content=");
                    return com.avito.android.actions_sheet.a.w(sb2, this.content, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type);
                    parcel.writeParcelable(this.content, flags);
                }
            }

            public /* synthetic */ ExtendedTextFields(C42822w c42822w) {
                this();
            }

            private ExtendedTextFields() {
            }
        }

        /* compiled from: MessageBody.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00172\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "()V", Platform.CHUNKS, "", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "getChunks", "()Ljava/util/List;", Platform.CONTEXT_ACTIONS, "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "getContextActions", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "fallbackText", "", "getFallbackText", "()Ljava/lang/String;", Platform.FLOW, "getFlow", Platform.INPUT_STATE, "Lcom/avito/android/remote/model/messenger/InputState;", "getInputState", "()Lcom/avito/android/remote/model/messenger/InputState;", "Bubble", "Companion", "FromAvito", "FromUser", "ItemExtended", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromAvito;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromUser;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Platform extends SystemMessageBody {

            @k
            public static final String CHUNKS = "chunks";

            @k
            public static final String CONTEXT_ACTIONS = "contextActions";

            @k
            public static final String FALLBACK_TEXT = "text";

            @k
            public static final String FLOW = "flow";

            @k
            public static final String INPUT_STATE = "inputState";

            /* compiled from: MessageBody.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "Landroid/os/Parcelable;", "()V", "Companion", "File", "GeoLocation", "Image", "Item", "Text", "Video", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$File;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$GeoLocation;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Image;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Item;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Video;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static abstract class Bubble implements Parcelable {

                @k
                public static final String TYPE_KEY = "type";

                @k
                public static final String VALUE_KEY = "value";

                /* compiled from: MessageBody.kt */
                @Keep
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$File;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "", "fileId", "name", "", File.SIZE_IN_BYTES, "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$File;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFileId", "getName", "J", "getSizeBytes", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class File extends Bubble {

                    @k
                    public static final String TYPE = "file";

                    @k
                    private final String fileId;

                    @k
                    private final String name;
                    private final long sizeBytes;

                    @k
                    public static final Parcelable.Creator<File> CREATOR = new Creator();

                    /* compiled from: MessageBody.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<File> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final File createFromParcel(@k Parcel parcel) {
                            return new File(parcel.readString(), parcel.readString(), parcel.readLong());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final File[] newArray(int i12) {
                            return new File[i12];
                        }
                    }

                    public File(@k String str, @k String str2, long j12) {
                        super(null);
                        this.fileId = str;
                        this.name = str2;
                        this.sizeBytes = j12;
                    }

                    public static /* synthetic */ File copy$default(File file, String str, String str2, long j12, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = file.fileId;
                        }
                        if ((i12 & 2) != 0) {
                            str2 = file.name;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = file.sizeBytes;
                        }
                        return file.copy(str, str2, j12);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final String getFileId() {
                        return this.fileId;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final String getName() {
                        return this.name;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final long getSizeBytes() {
                        return this.sizeBytes;
                    }

                    @k
                    public final File copy(@k String fileId, @k String name, long sizeBytes) {
                        return new File(fileId, name, sizeBytes);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof File)) {
                            return false;
                        }
                        File file = (File) other;
                        return L.f(this.fileId, file.fileId) && L.f(this.name, file.name) && this.sizeBytes == file.sizeBytes;
                    }

                    @k
                    public final String getFileId() {
                        return this.fileId;
                    }

                    @k
                    public final String getName() {
                        return this.name;
                    }

                    public final long getSizeBytes() {
                        return this.sizeBytes;
                    }

                    public int hashCode() {
                        return Long.hashCode(this.sizeBytes) + H.d(this.fileId.hashCode() * 31, 31, this.name);
                    }

                    @k
                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("File(fileId=");
                        sb2.append(this.fileId);
                        sb2.append(", name=");
                        sb2.append(this.name);
                        sb2.append(", sizeBytes=");
                        return r.u(sb2, this.sizeBytes, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.fileId);
                        parcel.writeString(this.name);
                        parcel.writeLong(this.sizeBytes);
                    }
                }

                /* compiled from: MessageBody.kt */
                @Keep
                @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0018¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$GeoLocation;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "", "title", "", "Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "markers", "Lcom/avito/android/remote/model/messenger/geo/MarkersRequest;", "markersRequest", "<init>", "(Ljava/lang/String;[Lcom/avito/android/remote/model/messenger/geo/GeoMarker;Lcom/avito/android/remote/model/messenger/geo/MarkersRequest;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "()[Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "component3", "()Lcom/avito/android/remote/model/messenger/geo/MarkersRequest;", "copy", "(Ljava/lang/String;[Lcom/avito/android/remote/model/messenger/geo/GeoMarker;Lcom/avito/android/remote/model/messenger/geo/MarkersRequest;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$GeoLocation;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "[Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "getMarkers", "Lcom/avito/android/remote/model/messenger/geo/MarkersRequest;", "getMarkersRequest", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class GeoLocation extends Bubble {

                    @k
                    public static final String TYPE = "geo_message";

                    @l
                    private final GeoMarker[] markers;

                    @l
                    private final MarkersRequest markersRequest;

                    @k
                    private final String title;

                    @k
                    public static final Parcelable.Creator<GeoLocation> CREATOR = new Creator();

                    /* compiled from: MessageBody.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<GeoLocation> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final GeoLocation createFromParcel(@k Parcel parcel) {
                            GeoMarker[] geoMarkerArr;
                            String string = parcel.readString();
                            if (parcel.readInt() == 0) {
                                geoMarkerArr = null;
                            } else {
                                int i12 = parcel.readInt();
                                geoMarkerArr = new GeoMarker[i12];
                                for (int i13 = 0; i13 != i12; i13++) {
                                    geoMarkerArr[i13] = GeoMarker.CREATOR.createFromParcel(parcel);
                                }
                            }
                            return new GeoLocation(string, geoMarkerArr, parcel.readInt() != 0 ? MarkersRequest.CREATOR.createFromParcel(parcel) : null);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final GeoLocation[] newArray(int i12) {
                            return new GeoLocation[i12];
                        }
                    }

                    public GeoLocation(@k String str, @l GeoMarker[] geoMarkerArr, @l MarkersRequest markersRequest) {
                        super(null);
                        this.title = str;
                        this.markers = geoMarkerArr;
                        this.markersRequest = markersRequest;
                    }

                    public static /* synthetic */ GeoLocation copy$default(GeoLocation geoLocation, String str, GeoMarker[] geoMarkerArr, MarkersRequest markersRequest, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = geoLocation.title;
                        }
                        if ((i12 & 2) != 0) {
                            geoMarkerArr = geoLocation.markers;
                        }
                        if ((i12 & 4) != 0) {
                            markersRequest = geoLocation.markersRequest;
                        }
                        return geoLocation.copy(str, geoMarkerArr, markersRequest);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final String getTitle() {
                        return this.title;
                    }

                    @l
                    /* renamed from: component2, reason: from getter */
                    public final GeoMarker[] getMarkers() {
                        return this.markers;
                    }

                    @l
                    /* renamed from: component3, reason: from getter */
                    public final MarkersRequest getMarkersRequest() {
                        return this.markersRequest;
                    }

                    @k
                    public final GeoLocation copy(@k String title, @l GeoMarker[] markers, @l MarkersRequest markersRequest) {
                        return new GeoLocation(title, markers, markersRequest);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof GeoLocation)) {
                            return false;
                        }
                        GeoLocation geoLocation = (GeoLocation) other;
                        if (!L.f(this.title, geoLocation.title)) {
                            return false;
                        }
                        GeoMarker[] geoMarkerArr = this.markers;
                        if (geoMarkerArr != null) {
                            GeoMarker[] geoMarkerArr2 = geoLocation.markers;
                            if (geoMarkerArr2 == null || !Arrays.equals(geoMarkerArr, geoMarkerArr2)) {
                                return false;
                            }
                        } else if (geoLocation.markers != null) {
                            return false;
                        }
                        return L.f(this.markersRequest, geoLocation.markersRequest);
                    }

                    @l
                    public final GeoMarker[] getMarkers() {
                        return this.markers;
                    }

                    @l
                    public final MarkersRequest getMarkersRequest() {
                        return this.markersRequest;
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int iHashCode = this.title.hashCode() * 31;
                        GeoMarker[] geoMarkerArr = this.markers;
                        int iHashCode2 = (iHashCode + (geoMarkerArr != null ? Arrays.hashCode(geoMarkerArr) : 0)) * 31;
                        MarkersRequest markersRequest = this.markersRequest;
                        return iHashCode2 + (markersRequest != null ? markersRequest.hashCode() : 0);
                    }

                    @k
                    public String toString() {
                        return "GeoLocation(title=" + this.title + ", markers=" + Arrays.toString(this.markers) + ", markersRequest=" + this.markersRequest + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.title);
                        GeoMarker[] geoMarkerArr = this.markers;
                        if (geoMarkerArr == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            int length = geoMarkerArr.length;
                            parcel.writeInt(length);
                            for (int i12 = 0; i12 != length; i12++) {
                                geoMarkerArr[i12].writeToParcel(parcel, flags);
                            }
                        }
                        MarkersRequest markersRequest = this.markersRequest;
                        if (markersRequest == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            markersRequest.writeToParcel(parcel, flags);
                        }
                    }
                }

                /* compiled from: MessageBody.kt */
                @Keep
                @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Image;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "", "imageId", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Image;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getImageId", "Lcom/avito/android/remote/model/Image;", "getImage", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Image extends Bubble {

                    @k
                    public static final String TYPE = "image";

                    @l
                    private final com.avito.android.remote.model.Image image;

                    @k
                    private final String imageId;

                    @k
                    public static final Parcelable.Creator<Image> CREATOR = new Creator();

                    /* compiled from: MessageBody.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Image> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Image createFromParcel(@k Parcel parcel) {
                            return new Image(parcel.readString(), (com.avito.android.remote.model.Image) parcel.readParcelable(Image.class.getClassLoader()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Image[] newArray(int i12) {
                            return new Image[i12];
                        }
                    }

                    public Image(@k String str, @l com.avito.android.remote.model.Image image) {
                        super(null);
                        this.imageId = str;
                        this.image = image;
                    }

                    public static /* synthetic */ Image copy$default(Image image, String str, com.avito.android.remote.model.Image image2, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = image.imageId;
                        }
                        if ((i12 & 2) != 0) {
                            image2 = image.image;
                        }
                        return image.copy(str, image2);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final String getImageId() {
                        return this.imageId;
                    }

                    @l
                    /* renamed from: component2, reason: from getter */
                    public final com.avito.android.remote.model.Image getImage() {
                        return this.image;
                    }

                    @k
                    public final Image copy(@k String imageId, @l com.avito.android.remote.model.Image image) {
                        return new Image(imageId, image);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Image)) {
                            return false;
                        }
                        Image image = (Image) other;
                        return L.f(this.imageId, image.imageId) && L.f(this.image, image.image);
                    }

                    @l
                    public final com.avito.android.remote.model.Image getImage() {
                        return this.image;
                    }

                    @k
                    public final String getImageId() {
                        return this.imageId;
                    }

                    public int hashCode() {
                        int iHashCode = this.imageId.hashCode() * 31;
                        com.avito.android.remote.model.Image image = this.image;
                        return iHashCode + (image == null ? 0 : image.hashCode());
                    }

                    @k
                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("Image(imageId=");
                        sb2.append(this.imageId);
                        sb2.append(", image=");
                        return AK.c.o(sb2, this.image, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.imageId);
                        parcel.writeParcelable(this.image, flags);
                    }
                }

                /* compiled from: MessageBody.kt */
                @Keep
                @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u0019¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Item;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "", "id", "title", "priceString", Item.OLD_PRICE_STRING, "locationWithMetro", "Lcom/avito/android/remote/model/Image;", "imageBySizes", Item.URI_PATH, "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;", Item.EXTENDED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/Image;", "component7", "component8", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Item;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getPriceString", "getOldPriceString", "getLocationWithMetro", "Lcom/avito/android/remote/model/Image;", "getImageBySizes", "getUriPath", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;", "getExtended", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Item extends Bubble {

                    @k
                    public static final String EXTENDED = "extended";

                    /* renamed from: ID, reason: collision with root package name */
                    @k
                    public static final String f253878ID = "id";

                    @k
                    public static final String IMAGE_BY_SIZES = "imageBySizes";

                    @k
                    public static final String LOCATION_WITH_METRO = "locationWithMetro";

                    @k
                    public static final String OLD_PRICE_STRING = "oldPriceString";

                    @k
                    public static final String PRICE_STRING = "priceString";

                    @k
                    public static final String TITLE = "title";

                    @k
                    public static final String TYPE = "item";

                    @k
                    public static final String URI_PATH = "uriPath";

                    @l
                    private final ItemExtended extended;

                    @k
                    private final String id;

                    @l
                    private final com.avito.android.remote.model.Image imageBySizes;

                    @l
                    private final String locationWithMetro;

                    @l
                    private final String oldPriceString;

                    @k
                    private final String priceString;

                    @k
                    private final String title;

                    @k
                    private final String uriPath;

                    @k
                    public static final Parcelable.Creator<Item> CREATOR = new Creator();

                    /* compiled from: MessageBody.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Item> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Item createFromParcel(@k Parcel parcel) {
                            return new Item(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (com.avito.android.remote.model.Image) parcel.readParcelable(Item.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ItemExtended.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Item[] newArray(int i12) {
                            return new Item[i12];
                        }
                    }

                    public /* synthetic */ Item(String str, String str2, String str3, String str4, String str5, com.avito.android.remote.model.Image image, String str6, ItemExtended itemExtended, int i12, C42822w c42822w) {
                        this(str, str2, str3, str4, str5, image, str6, (i12 & 128) != 0 ? null : itemExtended);
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

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final String getPriceString() {
                        return this.priceString;
                    }

                    @l
                    /* renamed from: component4, reason: from getter */
                    public final String getOldPriceString() {
                        return this.oldPriceString;
                    }

                    @l
                    /* renamed from: component5, reason: from getter */
                    public final String getLocationWithMetro() {
                        return this.locationWithMetro;
                    }

                    @l
                    /* renamed from: component6, reason: from getter */
                    public final com.avito.android.remote.model.Image getImageBySizes() {
                        return this.imageBySizes;
                    }

                    @k
                    /* renamed from: component7, reason: from getter */
                    public final String getUriPath() {
                        return this.uriPath;
                    }

                    @l
                    /* renamed from: component8, reason: from getter */
                    public final ItemExtended getExtended() {
                        return this.extended;
                    }

                    @k
                    public final Item copy(@k String id2, @k String title, @k String priceString, @l String oldPriceString, @l String locationWithMetro, @l com.avito.android.remote.model.Image imageBySizes, @k String uriPath, @l ItemExtended extended) {
                        return new Item(id2, title, priceString, oldPriceString, locationWithMetro, imageBySizes, uriPath, extended);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Item)) {
                            return false;
                        }
                        Item item = (Item) other;
                        return L.f(this.id, item.id) && L.f(this.title, item.title) && L.f(this.priceString, item.priceString) && L.f(this.oldPriceString, item.oldPriceString) && L.f(this.locationWithMetro, item.locationWithMetro) && L.f(this.imageBySizes, item.imageBySizes) && L.f(this.uriPath, item.uriPath) && L.f(this.extended, item.extended);
                    }

                    @l
                    public final ItemExtended getExtended() {
                        return this.extended;
                    }

                    @k
                    public final String getId() {
                        return this.id;
                    }

                    @l
                    public final com.avito.android.remote.model.Image getImageBySizes() {
                        return this.imageBySizes;
                    }

                    @l
                    public final String getLocationWithMetro() {
                        return this.locationWithMetro;
                    }

                    @l
                    public final String getOldPriceString() {
                        return this.oldPriceString;
                    }

                    @k
                    public final String getPriceString() {
                        return this.priceString;
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    @k
                    public final String getUriPath() {
                        return this.uriPath;
                    }

                    public int hashCode() {
                        int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.priceString);
                        String str = this.oldPriceString;
                        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.locationWithMetro;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        com.avito.android.remote.model.Image image = this.imageBySizes;
                        int iD3 = H.d((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.uriPath);
                        ItemExtended itemExtended = this.extended;
                        return iD3 + (itemExtended != null ? itemExtended.hashCode() : 0);
                    }

                    @k
                    public String toString() {
                        return "Item(id=" + this.id + ", title=" + this.title + ", priceString=" + this.priceString + ", oldPriceString=" + this.oldPriceString + ", locationWithMetro=" + this.locationWithMetro + ", imageBySizes=" + this.imageBySizes + ", uriPath=" + this.uriPath + ", extended=" + this.extended + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.id);
                        parcel.writeString(this.title);
                        parcel.writeString(this.priceString);
                        parcel.writeString(this.oldPriceString);
                        parcel.writeString(this.locationWithMetro);
                        parcel.writeParcelable(this.imageBySizes, flags);
                        parcel.writeString(this.uriPath);
                        ItemExtended itemExtended = this.extended;
                        if (itemExtended == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            itemExtended.writeToParcel(parcel, flags);
                        }
                    }

                    public Item(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l com.avito.android.remote.model.Image image, @k String str6, @l ItemExtended itemExtended) {
                        super(null);
                        this.id = str;
                        this.title = str2;
                        this.priceString = str3;
                        this.oldPriceString = str4;
                        this.locationWithMetro = str5;
                        this.imageBySizes = image;
                        this.uriPath = str6;
                        this.extended = itemExtended;
                    }
                }

                /* compiled from: MessageBody.kt */
                @Keep
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Text;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Text extends Bubble {

                    @k
                    public static final String TYPE = "text";

                    @k
                    private final AttributedText text;

                    @k
                    public static final Parcelable.Creator<Text> CREATOR = new Creator();

                    /* compiled from: MessageBody.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Text> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Text createFromParcel(@k Parcel parcel) {
                            return new Text((AttributedText) parcel.readParcelable(Text.class.getClassLoader()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Text[] newArray(int i12) {
                            return new Text[i12];
                        }
                    }

                    public Text(@k AttributedText attributedText) {
                        super(null);
                        this.text = attributedText;
                    }

                    public static /* synthetic */ Text copy$default(Text text, AttributedText attributedText, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            attributedText = text.text;
                        }
                        return text.copy(attributedText);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final AttributedText getText() {
                        return this.text;
                    }

                    @k
                    public final Text copy(@k AttributedText text) {
                        return new Text(text);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Text) && L.f(this.text, ((Text) other).text);
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
                        return com.avito.android.actions_sheet.a.w(new StringBuilder("Text(text="), this.text, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeParcelable(this.text, flags);
                    }
                }

                /* compiled from: MessageBody.kt */
                @Keep
                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Video;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", "", Video.VIDEO_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble$Video;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getVideoId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Video extends Bubble {

                    @k
                    public static final String TYPE = "video";

                    @l
                    private final String videoId;

                    @k
                    public static final Parcelable.Creator<Video> CREATOR = new Creator();

                    /* compiled from: MessageBody.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Video> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Video createFromParcel(@k Parcel parcel) {
                            return new Video(parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Video[] newArray(int i12) {
                            return new Video[i12];
                        }
                    }

                    public Video(@l String str) {
                        super(null);
                        this.videoId = str;
                    }

                    public static /* synthetic */ Video copy$default(Video video, String str, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = video.videoId;
                        }
                        return video.copy(str);
                    }

                    @l
                    /* renamed from: component1, reason: from getter */
                    public final String getVideoId() {
                        return this.videoId;
                    }

                    @k
                    public final Video copy(@l String videoId) {
                        return new Video(videoId);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Video) && L.f(this.videoId, ((Video) other).videoId);
                    }

                    @l
                    public final String getVideoId() {
                        return this.videoId;
                    }

                    public int hashCode() {
                        String str = this.videoId;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    @k
                    public String toString() {
                        return C22026a.c(new StringBuilder("Video(videoId="), this.videoId, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.videoId);
                    }
                }

                public /* synthetic */ Bubble(C42822w c42822w) {
                    this();
                }

                private Bubble() {
                }
            }

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0017¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromAvito;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform;", "", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", Platform.CHUNKS, "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", Platform.CONTEXT_ACTIONS, "", Platform.FLOW, "fallbackText", "Lcom/avito/android/remote/model/messenger/InputState;", Platform.INPUT_STATE, "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/InputState;)V", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/messenger/InputState;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/InputState;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromAvito;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChunks", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "getContextActions", "Ljava/lang/String;", "getFlow", "getFallbackText", "Lcom/avito/android/remote/model/messenger/InputState;", "getInputState", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class FromAvito extends Platform {

                @k
                public static final String TYPE = "system/platform";

                @k
                private final List<Bubble> chunks;

                @l
                private final PlatformActions contextActions;

                @l
                private final String fallbackText;

                @l
                private final String flow;

                @l
                private final InputState inputState;

                @k
                public static final Parcelable.Creator<FromAvito> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<FromAvito> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final FromAvito createFromParcel(@k Parcel parcel) {
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(FromAvito.class, parcel, arrayList, iL2, 1);
                        }
                        return new FromAvito(arrayList, (PlatformActions) parcel.readParcelable(FromAvito.class.getClassLoader()), parcel.readString(), parcel.readString(), (InputState) parcel.readParcelable(FromAvito.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final FromAvito[] newArray(int i12) {
                        return new FromAvito[i12];
                    }
                }

                public /* synthetic */ FromAvito(List list, PlatformActions platformActions, String str, String str2, InputState inputState, int i12, C42822w c42822w) {
                    this(list, (i12 & 2) != 0 ? null : platformActions, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : inputState);
                }

                public static /* synthetic */ FromAvito copy$default(FromAvito fromAvito, List list, PlatformActions platformActions, String str, String str2, InputState inputState, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        list = fromAvito.chunks;
                    }
                    if ((i12 & 2) != 0) {
                        platformActions = fromAvito.contextActions;
                    }
                    PlatformActions platformActions2 = platformActions;
                    if ((i12 & 4) != 0) {
                        str = fromAvito.flow;
                    }
                    String str3 = str;
                    if ((i12 & 8) != 0) {
                        str2 = fromAvito.fallbackText;
                    }
                    String str4 = str2;
                    if ((i12 & 16) != 0) {
                        inputState = fromAvito.inputState;
                    }
                    return fromAvito.copy(list, platformActions2, str3, str4, inputState);
                }

                @k
                public final List<Bubble> component1() {
                    return this.chunks;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final PlatformActions getContextActions() {
                    return this.contextActions;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getFlow() {
                    return this.flow;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final String getFallbackText() {
                    return this.fallbackText;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final InputState getInputState() {
                    return this.inputState;
                }

                @k
                public final FromAvito copy(@k List<? extends Bubble> chunks, @l PlatformActions contextActions, @l String flow, @l String fallbackText, @l InputState inputState) {
                    return new FromAvito(chunks, contextActions, flow, fallbackText, inputState);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FromAvito)) {
                        return false;
                    }
                    FromAvito fromAvito = (FromAvito) other;
                    return L.f(this.chunks, fromAvito.chunks) && L.f(this.contextActions, fromAvito.contextActions) && L.f(this.flow, fromAvito.flow) && L.f(this.fallbackText, fromAvito.fallbackText) && L.f(this.inputState, fromAvito.inputState);
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @k
                public List<Bubble> getChunks() {
                    return this.chunks;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public PlatformActions getContextActions() {
                    return this.contextActions;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public String getFallbackText() {
                    return this.fallbackText;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public String getFlow() {
                    return this.flow;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public InputState getInputState() {
                    return this.inputState;
                }

                public int hashCode() {
                    int iHashCode = this.chunks.hashCode() * 31;
                    PlatformActions platformActions = this.contextActions;
                    int iHashCode2 = (iHashCode + (platformActions == null ? 0 : platformActions.hashCode())) * 31;
                    String str = this.flow;
                    int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.fallbackText;
                    int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    InputState inputState = this.inputState;
                    return iHashCode4 + (inputState != null ? inputState.hashCode() : 0);
                }

                @k
                public String toString() {
                    return C43066x.F0("Platform.FromAvito(\n                            |   chunks=[" + getChunks().size() + "]:" + getChunks() + ",\n                            |   contextActions = " + getContextActions() + ",\n                            |   flow = " + getFlow() + ",\n                            |   fallbackText = " + getFallbackText() + ",\n                            |   inputState = " + getInputState() + "\n                            |)");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Iterator itJ = C0.j(this.chunks, parcel);
                    while (itJ.hasNext()) {
                        parcel.writeParcelable((Parcelable) itJ.next(), flags);
                    }
                    parcel.writeParcelable(this.contextActions, flags);
                    parcel.writeString(this.flow);
                    parcel.writeString(this.fallbackText);
                    parcel.writeParcelable(this.inputState, flags);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public FromAvito(@k List<? extends Bubble> list, @l PlatformActions platformActions, @l String str, @l String str2, @l InputState inputState) {
                    super(null);
                    this.chunks = list;
                    this.contextActions = platformActions;
                    this.flow = str;
                    this.fallbackText = str2;
                    this.inputState = inputState;
                }
            }

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0017¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromUser;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform;", "", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$Bubble;", Platform.CHUNKS, "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", Platform.CONTEXT_ACTIONS, "", Platform.FLOW, "fallbackText", "Lcom/avito/android/remote/model/messenger/InputState;", Platform.INPUT_STATE, "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/InputState;)V", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/messenger/InputState;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/InputState;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromUser;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChunks", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "getContextActions", "Ljava/lang/String;", "getFlow", "getFallbackText", "Lcom/avito/android/remote/model/messenger/InputState;", "getInputState", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class FromUser extends Platform {

                @k
                public static final String TYPE = "system/platformFromUser";

                @k
                private final List<Bubble> chunks;

                @l
                private final PlatformActions contextActions;

                @l
                private final String fallbackText;

                @l
                private final String flow;

                @l
                private final InputState inputState;

                @k
                public static final Parcelable.Creator<FromUser> CREATOR = new Creator();

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<FromUser> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final FromUser createFromParcel(@k Parcel parcel) {
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(FromUser.class, parcel, arrayList, iL2, 1);
                        }
                        return new FromUser(arrayList, (PlatformActions) parcel.readParcelable(FromUser.class.getClassLoader()), parcel.readString(), parcel.readString(), (InputState) parcel.readParcelable(FromUser.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final FromUser[] newArray(int i12) {
                        return new FromUser[i12];
                    }
                }

                public /* synthetic */ FromUser(List list, PlatformActions platformActions, String str, String str2, InputState inputState, int i12, C42822w c42822w) {
                    this(list, (i12 & 2) != 0 ? null : platformActions, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : inputState);
                }

                public static /* synthetic */ FromUser copy$default(FromUser fromUser, List list, PlatformActions platformActions, String str, String str2, InputState inputState, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        list = fromUser.chunks;
                    }
                    if ((i12 & 2) != 0) {
                        platformActions = fromUser.contextActions;
                    }
                    PlatformActions platformActions2 = platformActions;
                    if ((i12 & 4) != 0) {
                        str = fromUser.flow;
                    }
                    String str3 = str;
                    if ((i12 & 8) != 0) {
                        str2 = fromUser.fallbackText;
                    }
                    String str4 = str2;
                    if ((i12 & 16) != 0) {
                        inputState = fromUser.inputState;
                    }
                    return fromUser.copy(list, platformActions2, str3, str4, inputState);
                }

                @k
                public final List<Bubble> component1() {
                    return this.chunks;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final PlatformActions getContextActions() {
                    return this.contextActions;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getFlow() {
                    return this.flow;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final String getFallbackText() {
                    return this.fallbackText;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final InputState getInputState() {
                    return this.inputState;
                }

                @k
                public final FromUser copy(@k List<? extends Bubble> chunks, @l PlatformActions contextActions, @l String flow, @l String fallbackText, @l InputState inputState) {
                    return new FromUser(chunks, contextActions, flow, fallbackText, inputState);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FromUser)) {
                        return false;
                    }
                    FromUser fromUser = (FromUser) other;
                    return L.f(this.chunks, fromUser.chunks) && L.f(this.contextActions, fromUser.contextActions) && L.f(this.flow, fromUser.flow) && L.f(this.fallbackText, fromUser.fallbackText) && L.f(this.inputState, fromUser.inputState);
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @k
                public List<Bubble> getChunks() {
                    return this.chunks;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public PlatformActions getContextActions() {
                    return this.contextActions;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public String getFallbackText() {
                    return this.fallbackText;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public String getFlow() {
                    return this.flow;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform
                @l
                public InputState getInputState() {
                    return this.inputState;
                }

                public int hashCode() {
                    int iHashCode = this.chunks.hashCode() * 31;
                    PlatformActions platformActions = this.contextActions;
                    int iHashCode2 = (iHashCode + (platformActions == null ? 0 : platformActions.hashCode())) * 31;
                    String str = this.flow;
                    int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.fallbackText;
                    int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    InputState inputState = this.inputState;
                    return iHashCode4 + (inputState != null ? inputState.hashCode() : 0);
                }

                @k
                public String toString() {
                    return C43066x.F0("Platform.FromUser(\n                            |   chunks=[" + getChunks().size() + "]:" + getChunks() + ",\n                            |   contextActions = " + getContextActions() + ",\n                            |   flow = " + getFlow() + ",\n                            |   fallbackText = " + getFallbackText() + ",\n                            |   inputState = " + getInputState() + "\n                            |)");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Iterator itJ = C0.j(this.chunks, parcel);
                    while (itJ.hasNext()) {
                        parcel.writeParcelable((Parcelable) itJ.next(), flags);
                    }
                    parcel.writeParcelable(this.contextActions, flags);
                    parcel.writeString(this.flow);
                    parcel.writeString(this.fallbackText);
                    parcel.writeParcelable(this.inputState, flags);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public FromUser(@k List<? extends Bubble> list, @l PlatformActions platformActions, @l String str, @l String str2, @l InputState inputState) {
                    super(null);
                    this.chunks = list;
                    this.contextActions = platformActions;
                    this.flow = str;
                    this.fallbackText = str2;
                    this.inputState = inputState;
                }
            }

            /* compiled from: MessageBody.kt */
            @Keep
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "", "Lcom/avito/android/remote/model/UniversalImage;", "images", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields;", "textFields", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;", "actions", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$ItemExtended;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getPrice", "Ljava/util/List;", "getImages", "getTextFields", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;", "getActions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class ItemExtended implements Parcelable {

                @k
                public static final Parcelable.Creator<ItemExtended> CREATOR = new Creator();

                @l
                private final ExtendedActions actions;

                @k
                private final List<UniversalImage> images;

                @l
                private final AttributedText price;

                @k
                private final List<ExtendedTextFields> textFields;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ItemExtended> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ItemExtended createFromParcel(@k Parcel parcel) {
                        AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemExtended.class.getClassLoader());
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        int iL3 = 0;
                        while (iL3 != i12) {
                            iL3 = com.avito.android.actions_sheet.a.l(ItemExtended.class, parcel, arrayList, iL3, 1);
                        }
                        int i13 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i13);
                        while (iL2 != i13) {
                            iL2 = com.avito.android.actions_sheet.a.l(ItemExtended.class, parcel, arrayList2, iL2, 1);
                        }
                        return new ItemExtended(attributedText, arrayList, arrayList2, parcel.readInt() == 0 ? null : ExtendedActions.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ItemExtended[] newArray(int i12) {
                        return new ItemExtended[i12];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public ItemExtended(@l AttributedText attributedText, @k List<UniversalImage> list, @k List<? extends ExtendedTextFields> list2, @l ExtendedActions extendedActions) {
                    this.price = attributedText;
                    this.images = list;
                    this.textFields = list2;
                    this.actions = extendedActions;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ ItemExtended copy$default(ItemExtended itemExtended, AttributedText attributedText, List list, List list2, ExtendedActions extendedActions, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        attributedText = itemExtended.price;
                    }
                    if ((i12 & 2) != 0) {
                        list = itemExtended.images;
                    }
                    if ((i12 & 4) != 0) {
                        list2 = itemExtended.textFields;
                    }
                    if ((i12 & 8) != 0) {
                        extendedActions = itemExtended.actions;
                    }
                    return itemExtended.copy(attributedText, list, list2, extendedActions);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final AttributedText getPrice() {
                    return this.price;
                }

                @k
                public final List<UniversalImage> component2() {
                    return this.images;
                }

                @k
                public final List<ExtendedTextFields> component3() {
                    return this.textFields;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final ExtendedActions getActions() {
                    return this.actions;
                }

                @k
                public final ItemExtended copy(@l AttributedText price, @k List<UniversalImage> images, @k List<? extends ExtendedTextFields> textFields, @l ExtendedActions actions) {
                    return new ItemExtended(price, images, textFields, actions);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ItemExtended)) {
                        return false;
                    }
                    ItemExtended itemExtended = (ItemExtended) other;
                    return L.f(this.price, itemExtended.price) && L.f(this.images, itemExtended.images) && L.f(this.textFields, itemExtended.textFields) && L.f(this.actions, itemExtended.actions);
                }

                @l
                public final ExtendedActions getActions() {
                    return this.actions;
                }

                @k
                public final List<UniversalImage> getImages() {
                    return this.images;
                }

                @l
                public final AttributedText getPrice() {
                    return this.price;
                }

                @k
                public final List<ExtendedTextFields> getTextFields() {
                    return this.textFields;
                }

                public int hashCode() {
                    AttributedText attributedText = this.price;
                    int iE2 = H.e(H.e((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.images), 31, this.textFields);
                    ExtendedActions extendedActions = this.actions;
                    return iE2 + (extendedActions != null ? extendedActions.hashCode() : 0);
                }

                @k
                public String toString() {
                    return "ItemExtended(price=" + this.price + ", images=" + this.images + ", textFields=" + this.textFields + ", actions=" + this.actions + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.price, flags);
                    Iterator itJ = C0.j(this.images, parcel);
                    while (itJ.hasNext()) {
                        parcel.writeParcelable((Parcelable) itJ.next(), flags);
                    }
                    Iterator itJ2 = C0.j(this.textFields, parcel);
                    while (itJ2.hasNext()) {
                        parcel.writeParcelable((Parcelable) itJ2.next(), flags);
                    }
                    ExtendedActions extendedActions = this.actions;
                    if (extendedActions == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        extendedActions.writeToParcel(parcel, flags);
                    }
                }
            }

            public /* synthetic */ Platform(C42822w c42822w) {
                this();
            }

            @k
            public abstract List<Bubble> getChunks();

            @l
            public abstract PlatformActions getContextActions();

            @l
            public abstract String getFallbackText();

            @l
            public abstract String getFlow();

            @l
            public abstract InputState getInputState();

            private Platform() {
                super(null);
            }
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Text;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Text extends SystemMessageBody {

            @k
            public static final String TYPE = "system/text";

            @k
            private final String text;

            @k
            public static final Parcelable.Creator<Text> CREATOR = new Creator();

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Text> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Text createFromParcel(@k Parcel parcel) {
                    return new Text(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Text[] newArray(int i12) {
                    return new Text[i12];
                }
            }

            public Text(@k String str) {
                super(null);
                this.text = str;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = text.text;
                }
                return text.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            public final Text copy(@k String text) {
                return new Text(text);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && L.f(this.text, ((Text) other).text);
            }

            @k
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Text(text="), this.text, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
            }
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Unknown;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Unknown extends SystemMessageBody {

            @k
            public static final String TYPE = "system/unknown";

            @k
            public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Unknown> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Unknown createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return new Unknown();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Unknown[] newArray(int i12) {
                    return new Unknown[i12];
                }
            }

            public Unknown() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return Unknown.class.equals(other != null ? other.getClass() : null);
            }

            public int hashCode() {
                return Unknown.class.hashCode();
            }

            @k
            public String toString() {
                return "Unknown()";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ SystemMessageBody(C42822w c42822w) {
            this();
        }

        private SystemMessageBody() {
            super(null);
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;", "Landroid/os/Parcelable;", "", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getStyle", "getUri", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ExtendedButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ExtendedButton> CREATOR = new Creator();

            @l
            private final DeepLink deepLink;

            @l
            private final String style;

            @l
            private final String title;

            @l
            private final String uri;

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtendedButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedButton createFromParcel(@k Parcel parcel) {
                    return new ExtendedButton(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ExtendedButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ExtendedButton[] newArray(int i12) {
                    return new ExtendedButton[i12];
                }
            }

            public ExtendedButton(@l String str, @l String str2, @l String str3, @l DeepLink deepLink) {
                this.title = str;
                this.style = str2;
                this.uri = str3;
                this.deepLink = deepLink;
            }

            public static /* synthetic */ ExtendedButton copy$default(ExtendedButton extendedButton, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = extendedButton.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = extendedButton.style;
                }
                if ((i12 & 4) != 0) {
                    str3 = extendedButton.uri;
                }
                if ((i12 & 8) != 0) {
                    deepLink = extendedButton.deepLink;
                }
                return extendedButton.copy(str, str2, str3, deepLink);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getUri() {
                return this.uri;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final ExtendedButton copy(@l String title, @l String style, @l String uri, @l DeepLink deepLink) {
                return new ExtendedButton(title, style, uri, deepLink);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExtendedButton)) {
                    return false;
                }
                ExtendedButton extendedButton = (ExtendedButton) other;
                return L.f(this.title, extendedButton.title) && L.f(this.style, extendedButton.style) && L.f(this.uri, extendedButton.uri) && L.f(this.deepLink, extendedButton.deepLink);
            }

            @l
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @l
            public final String getStyle() {
                return this.style;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getUri() {
                return this.uri;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.style;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.uri;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                DeepLink deepLink = this.deepLink;
                return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ExtendedButton(title=");
                sb2.append(this.title);
                sb2.append(", style=");
                sb2.append(this.style);
                sb2.append(", uri=");
                sb2.append(this.uri);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.style);
                parcel.writeString(this.uri);
                parcel.writeParcelable(this.deepLink, flags);
            }

            public /* synthetic */ ExtendedButton(String str, String str2, String str3, DeepLink deepLink, int i12, C42822w c42822w) {
                this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : deepLink);
            }
        }
    }

    /* compiled from: MessageBody.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Text;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "()V", "attrText", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttrText", "()Lcom/avito/android/remote/model/text/AttributedText;", SystemMessageBody.Platform.CHUNKS, "", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", "getChunks", "()Ljava/util/List;", "text", "", "getText", "()Ljava/lang/String;", "Chunk", "Reaction", "Regular", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Reaction;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Regular;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Text extends MessageBody {

        /* compiled from: MessageBody.kt */
        @s0
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", "Landroid/os/Parcelable;", "()V", "end", "", "getEnd", "()I", "endExclusive", "getEndExclusive", "length", "getLength", "start", "getStart", "Link", "Plain", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk$Link;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk$Plain;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Chunk implements Parcelable {

            /* compiled from: MessageBody.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk$Link;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", "", "start", "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk$Link;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getStart", "getEnd", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Link extends Chunk {

                @k
                public static final Parcelable.Creator<Link> CREATOR = new Creator();
                private final int end;
                private final int start;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Link> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link createFromParcel(@k Parcel parcel) {
                        return new Link(parcel.readInt(), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link[] newArray(int i12) {
                        return new Link[i12];
                    }
                }

                public Link(int i12, int i13) {
                    super(null);
                    this.start = i12;
                    this.end = i13;
                }

                public static /* synthetic */ Link copy$default(Link link, int i12, int i13, int i14, Object obj) {
                    if ((i14 & 1) != 0) {
                        i12 = link.start;
                    }
                    if ((i14 & 2) != 0) {
                        i13 = link.end;
                    }
                    return link.copy(i12, i13);
                }

                /* renamed from: component1, reason: from getter */
                public final int getStart() {
                    return this.start;
                }

                /* renamed from: component2, reason: from getter */
                public final int getEnd() {
                    return this.end;
                }

                @k
                public final Link copy(int start, int end) {
                    return new Link(start, end);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Link)) {
                        return false;
                    }
                    Link link = (Link) other;
                    return this.start == link.start && this.end == link.end;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text.Chunk
                public int getEnd() {
                    return this.end;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text.Chunk
                public int getStart() {
                    return this.start;
                }

                public int hashCode() {
                    return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Link(start=");
                    sb2.append(this.start);
                    sb2.append(", end=");
                    return r.t(sb2, this.end, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(this.start);
                    parcel.writeInt(this.end);
                }
            }

            /* compiled from: MessageBody.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk$Plain;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", "", "start", "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk$Plain;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getStart", "getEnd", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Plain extends Chunk {

                @k
                public static final Parcelable.Creator<Plain> CREATOR = new Creator();
                private final int end;
                private final int start;

                /* compiled from: MessageBody.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Plain> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Plain createFromParcel(@k Parcel parcel) {
                        return new Plain(parcel.readInt(), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Plain[] newArray(int i12) {
                        return new Plain[i12];
                    }
                }

                public Plain(int i12, int i13) {
                    super(null);
                    this.start = i12;
                    this.end = i13;
                }

                public static /* synthetic */ Plain copy$default(Plain plain, int i12, int i13, int i14, Object obj) {
                    if ((i14 & 1) != 0) {
                        i12 = plain.start;
                    }
                    if ((i14 & 2) != 0) {
                        i13 = plain.end;
                    }
                    return plain.copy(i12, i13);
                }

                /* renamed from: component1, reason: from getter */
                public final int getStart() {
                    return this.start;
                }

                /* renamed from: component2, reason: from getter */
                public final int getEnd() {
                    return this.end;
                }

                @k
                public final Plain copy(int start, int end) {
                    return new Plain(start, end);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Plain)) {
                        return false;
                    }
                    Plain plain = (Plain) other;
                    return this.start == plain.start && this.end == plain.end;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text.Chunk
                public int getEnd() {
                    return this.end;
                }

                @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text.Chunk
                public int getStart() {
                    return this.start;
                }

                public int hashCode() {
                    return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Plain(start=");
                    sb2.append(this.start);
                    sb2.append(", end=");
                    return r.t(sb2, this.end, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(this.start);
                    parcel.writeInt(this.end);
                }
            }

            public /* synthetic */ Chunk(C42822w c42822w) {
                this();
            }

            public abstract int getEnd();

            public final int getEndExclusive() {
                return getEnd() + 1;
            }

            public final int getLength() {
                return (getEnd() + 1) - getStart();
            }

            public abstract int getStart();

            private Chunk() {
            }
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Reaction;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "text", "", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", SystemMessageBody.Platform.CHUNKS, MessageBody.RANDOM_ID, "Lcom/avito/android/remote/model/text/AttributedText;", "attrText", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Reaction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getChunks", "getRandomId", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttrText", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Reaction extends Text implements ru.avito.messenger.api.entity.body.MessageBody, a {

            @k
            public static final String TEXT = "text";

            @k
            public static final String TYPE = "text/reaction";

            @l
            private final AttributedText attrText;

            @l
            private final List<Chunk> chunks;

            @c(MessageBody.RANDOM_ID)
            @l
            private final String randomId;

            @c("text")
            @k
            private final String text;

            @k
            public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Reaction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Reaction createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(Reaction.class, parcel, arrayList2, iL2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new Reaction(string, arrayList, parcel.readString(), (AttributedText) parcel.readParcelable(Reaction.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Reaction[] newArray(int i12) {
                    return new Reaction[i12];
                }
            }

            public /* synthetic */ Reaction(String str, List list, String str2, AttributedText attributedText, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : attributedText);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Reaction copy$default(Reaction reaction, String str, List list, String str2, AttributedText attributedText, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = reaction.text;
                }
                if ((i12 & 2) != 0) {
                    list = reaction.chunks;
                }
                if ((i12 & 4) != 0) {
                    str2 = reaction.randomId;
                }
                if ((i12 & 8) != 0) {
                    attributedText = reaction.attrText;
                }
                return reaction.copy(str, list, str2, attributedText);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @l
            public final List<Chunk> component2() {
                return this.chunks;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getRandomId() {
                return this.randomId;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final AttributedText getAttrText() {
                return this.attrText;
            }

            @k
            public final Reaction copy(@k String text, @l List<? extends Chunk> chunks, @l String randomId, @l AttributedText attrText) {
                return new Reaction(text, chunks, randomId, attrText);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Reaction)) {
                    return false;
                }
                Reaction reaction = (Reaction) other;
                return L.f(this.text, reaction.text) && L.f(this.chunks, reaction.chunks) && L.f(this.randomId, reaction.randomId) && L.f(this.attrText, reaction.attrText);
            }

            @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text
            @l
            public AttributedText getAttrText() {
                return this.attrText;
            }

            @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text
            @l
            public List<Chunk> getChunks() {
                return this.chunks;
            }

            @Override // V81.a
            @l
            public String getRandomId() {
                return this.randomId;
            }

            @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text
            @k
            public String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                List<Chunk> list = this.chunks;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                String str = this.randomId;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                AttributedText attributedText = this.attrText;
                return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Reaction(text=");
                sb2.append(this.text);
                sb2.append(", chunks=");
                sb2.append(this.chunks);
                sb2.append(", randomId=");
                sb2.append(this.randomId);
                sb2.append(", attrText=");
                return com.avito.android.actions_sheet.a.w(sb2, this.attrText, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
                List<Chunk> list = this.chunks;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                parcel.writeString(this.randomId);
                parcel.writeParcelable(this.attrText, flags);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Reaction(@k String str, @l List<? extends Chunk> list, @l String str2, @l AttributedText attributedText) {
                super(null);
                this.text = str;
                this.chunks = list;
                this.randomId = str2;
                this.attrText = attributedText;
            }
        }

        /* compiled from: MessageBody.kt */
        @Keep
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0016¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Regular;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text;", "", "text", "", "suggestedTemplates", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", SystemMessageBody.Platform.CHUNKS, "", "urlsAreTrusted", "Lcom/avito/android/remote/model/text/AttributedText;", "attrText", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Z", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Regular;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getSuggestedTemplates", "getChunks", "Z", "getUrlsAreTrusted", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttrText", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Regular extends Text {

            @k
            public static final String TYPE = "text";

            @l
            private final AttributedText attrText;

            @l
            private final List<Chunk> chunks;

            @l
            private final List<String> suggestedTemplates;

            @k
            private final String text;
            private final boolean urlsAreTrusted;

            @k
            public static final Parcelable.Creator<Regular> CREATOR = new Creator();

            /* compiled from: MessageBody.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Regular> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Regular createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(Regular.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    return new Regular(string, arrayListCreateStringArrayList, arrayList, parcel.readInt() != 0, (AttributedText) parcel.readParcelable(Regular.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Regular[] newArray(int i12) {
                    return new Regular[i12];
                }
            }

            public /* synthetic */ Regular(String str, List list, List list2, boolean z12, AttributedText attributedText, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : attributedText);
            }

            public static /* synthetic */ Regular copy$default(Regular regular, String str, List list, List list2, boolean z12, AttributedText attributedText, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = regular.text;
                }
                if ((i12 & 2) != 0) {
                    list = regular.suggestedTemplates;
                }
                List list3 = list;
                if ((i12 & 4) != 0) {
                    list2 = regular.chunks;
                }
                List list4 = list2;
                if ((i12 & 8) != 0) {
                    z12 = regular.urlsAreTrusted;
                }
                boolean z13 = z12;
                if ((i12 & 16) != 0) {
                    attributedText = regular.attrText;
                }
                return regular.copy(str, list3, list4, z13, attributedText);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @l
            public final List<String> component2() {
                return this.suggestedTemplates;
            }

            @l
            public final List<Chunk> component3() {
                return this.chunks;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getUrlsAreTrusted() {
                return this.urlsAreTrusted;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final AttributedText getAttrText() {
                return this.attrText;
            }

            @k
            public final Regular copy(@k String text, @l List<String> suggestedTemplates, @l List<? extends Chunk> chunks, boolean urlsAreTrusted, @l AttributedText attrText) {
                return new Regular(text, suggestedTemplates, chunks, urlsAreTrusted, attrText);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Regular)) {
                    return false;
                }
                Regular regular = (Regular) other;
                return L.f(this.text, regular.text) && L.f(this.suggestedTemplates, regular.suggestedTemplates) && L.f(this.chunks, regular.chunks) && this.urlsAreTrusted == regular.urlsAreTrusted && L.f(this.attrText, regular.attrText);
            }

            @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text
            @l
            public AttributedText getAttrText() {
                return this.attrText;
            }

            @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text
            @l
            public List<Chunk> getChunks() {
                return this.chunks;
            }

            @l
            public final List<String> getSuggestedTemplates() {
                return this.suggestedTemplates;
            }

            @Override // com.avito.android.remote.model.messenger.message.MessageBody.Text
            @k
            public String getText() {
                return this.text;
            }

            public final boolean getUrlsAreTrusted() {
                return this.urlsAreTrusted;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                List<String> list = this.suggestedTemplates;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                List<Chunk> list2 = this.chunks;
                int i12 = r.i((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.urlsAreTrusted);
                AttributedText attributedText = this.attrText;
                return i12 + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Regular(text=");
                sb2.append(this.text);
                sb2.append(", suggestedTemplates=");
                sb2.append(this.suggestedTemplates);
                sb2.append(", chunks=");
                sb2.append(this.chunks);
                sb2.append(", urlsAreTrusted=");
                sb2.append(this.urlsAreTrusted);
                sb2.append(", attrText=");
                return com.avito.android.actions_sheet.a.w(sb2, this.attrText, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
                parcel.writeStringList(this.suggestedTemplates);
                List<Chunk> list = this.chunks;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                parcel.writeInt(this.urlsAreTrusted ? 1 : 0);
                parcel.writeParcelable(this.attrText, flags);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Regular(@k String str, @l List<String> list, @l List<? extends Chunk> list2, boolean z12, @l AttributedText attributedText) {
                super(null);
                this.text = str;
                this.suggestedTemplates = list;
                this.chunks = list2;
                this.urlsAreTrusted = z12;
                this.attrText = attributedText;
            }
        }

        public /* synthetic */ Text(C42822w c42822w) {
            this();
        }

        @l
        public abstract AttributedText getAttrText();

        @l
        public abstract List<Chunk> getChunks();

        @k
        public abstract String getText();

        private Text() {
            super(null);
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\n¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Unknown;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "", "type", "fallbackText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "withFallbackText", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Unknown;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Unknown;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getFallbackText", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Unknown extends MessageBody {

        @k
        public static final String TYPE = "unknown";

        @l
        private final String fallbackText;

        @k
        private final String type;

        @k
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Unknown createFromParcel(@k Parcel parcel) {
                return new Unknown(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Unknown[] newArray(int i12) {
                return new Unknown[i12];
            }
        }

        public /* synthetic */ Unknown(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unknown.type;
            }
            if ((i12 & 2) != 0) {
                str2 = unknown.fallbackText;
            }
            return unknown.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getFallbackText() {
            return this.fallbackText;
        }

        @k
        public final Unknown copy(@k String type, @l String fallbackText) {
            return new Unknown(type, fallbackText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return L.f(this.type, unknown.type) && L.f(this.fallbackText, unknown.fallbackText);
        }

        @l
        public final String getFallbackText() {
            return this.fallbackText;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.fallbackText;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Unknown(type=");
            sb2.append(this.type);
            sb2.append(", fallbackText=");
            return C22026a.c(sb2, this.fallbackText, ')');
        }

        @InterfaceC42154j
        @k
        public final Unknown withFallbackText(@l String fallbackText) {
            return new Unknown(this.type, fallbackText);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.fallbackText);
        }

        public Unknown(@k String str, @l String str2) {
            super(null);
            this.type = str;
            this.fallbackText = str2;
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Video;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "fileId", Video.VIDEO_ID, MessageBody.RANDOM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Video;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFileId", "getVideoId", "getRandomId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Video extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String FILE_ID = "fileId";

        @k
        public static final String TYPE = "video";

        @k
        public static final String VIDEO_ID = "videoId";

        @c("fileId")
        @l
        private final String fileId;

        @c(MessageBody.RANDOM_ID)
        @l
        private final String randomId;

        @c(VIDEO_ID)
        @l
        private final String videoId;

        @k
        public static final Parcelable.Creator<Video> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Video> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Video createFromParcel(@k Parcel parcel) {
                return new Video(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Video[] newArray(int i12) {
                return new Video[i12];
            }
        }

        public /* synthetic */ Video(String str, String str2, String str3, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ Video copy$default(Video video, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = video.fileId;
            }
            if ((i12 & 2) != 0) {
                str2 = video.videoId;
            }
            if ((i12 & 4) != 0) {
                str3 = video.randomId;
            }
            return video.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getVideoId() {
            return this.videoId;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        @k
        public final Video copy(@l String fileId, @l String videoId, @l String randomId) {
            return new Video(fileId, videoId, randomId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return L.f(this.fileId, video.fileId) && L.f(this.videoId, video.videoId) && L.f(this.randomId, video.randomId);
        }

        @l
        public final String getFileId() {
            return this.fileId;
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        @l
        public final String getVideoId() {
            return this.videoId;
        }

        public int hashCode() {
            String str = this.fileId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.videoId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.randomId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Video(fileId=");
            sb2.append(this.fileId);
            sb2.append(", videoId=");
            sb2.append(this.videoId);
            sb2.append(", randomId=");
            return C22026a.c(sb2, this.randomId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fileId);
            parcel.writeString(this.videoId);
            parcel.writeString(this.randomId);
        }

        public Video(@l String str, @l String str2, @l String str3) {
            super(null);
            this.fileId = str;
            this.videoId = str2;
            this.randomId = str3;
        }
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u001d\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\n¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Voice;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", Voice.VOICE_ID, MessageBody.RANDOM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Voice;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getVoiceId", "getRandomId", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Voice extends MessageBody implements ru.avito.messenger.api.entity.body.MessageBody, a {

        @k
        public static final String FILE_ID = "fileId";

        @k
        public static final String TYPE = "voice";

        @k
        public static final String VOICE_ID = "voiceId";

        @c(MessageBody.RANDOM_ID)
        @l
        private final String randomId;

        @c(VOICE_ID)
        @l
        private final String voiceId;

        @k
        public static final Parcelable.Creator<Voice> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Voice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Voice createFromParcel(@k Parcel parcel) {
                return new Voice(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Voice[] newArray(int i12) {
                return new Voice[i12];
            }
        }

        public /* synthetic */ Voice(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Voice copy$default(Voice voice, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = voice.voiceId;
            }
            if ((i12 & 2) != 0) {
                str2 = voice.randomId;
            }
            return voice.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getVoiceId() {
            return this.voiceId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getRandomId() {
            return this.randomId;
        }

        @k
        public final Voice copy(@l String voiceId, @l String randomId) {
            return new Voice(voiceId, randomId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Voice)) {
                return false;
            }
            Voice voice = (Voice) other;
            return L.f(this.voiceId, voice.voiceId) && L.f(this.randomId, voice.randomId);
        }

        @Override // V81.a
        @l
        public String getRandomId() {
            return this.randomId;
        }

        @l
        public final String getVoiceId() {
            return this.voiceId;
        }

        public int hashCode() {
            String str = this.voiceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.randomId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Voice(voiceId=");
            sb2.append(this.voiceId);
            sb2.append(", randomId=");
            return C22026a.c(sb2, this.randomId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.voiceId);
            parcel.writeString(this.randomId);
        }

        public Voice(@l String str, @l String str2) {
            super(null);
            this.voiceId = str;
            this.randomId = str2;
        }
    }

    public /* synthetic */ MessageBody(C42822w c42822w) {
        this();
    }

    /* compiled from: MessageBody.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJT\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/MessageBody$Item;", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "", "id", ChannelContext.Item.USER_ID, "title", "Lcom/avito/android/remote/model/Image;", "image", "price", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/message/MessageBody$Item;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getUserId", "getTitle", "Lcom/avito/android/remote/model/Image;", "getImage", "getPrice", "getLocation", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Item extends MessageBody {

        @k
        public static final String TYPE = "item";

        @k
        private final String id;

        @l
        private final Image image;

        @l
        private final String location;

        @l
        private final String price;

        @k
        private final String title;

        @l
        private final String userId;

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        /* compiled from: MessageBody.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                return new Item(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Item.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public /* synthetic */ Item(String str, String str2, String str3, Image image, String str4, String str5, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : str4, (i12 & 32) == 0 ? str5 : null);
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, Image image, String str4, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = item.id;
            }
            if ((i12 & 2) != 0) {
                str2 = item.userId;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = item.title;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                image = item.image;
            }
            Image image2 = image;
            if ((i12 & 16) != 0) {
                str4 = item.price;
            }
            String str8 = str4;
            if ((i12 & 32) != 0) {
                str5 = item.location;
            }
            return item.copy(str, str6, str7, image2, str8, str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @k
        public final Item copy(@k String id2, @l String userId, @k String title, @l Image image, @l String price, @l String location) {
            return new Item(id2, userId, title, image, price, location);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return L.f(this.id, item.id) && L.f(this.userId, item.userId) && L.f(this.title, item.title) && L.f(this.image, item.image) && L.f(this.price, item.price) && L.f(this.location, item.location);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final String getLocation() {
            return this.location;
        }

        @l
        public final String getPrice() {
            return this.price;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.userId;
            int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
            Image image = this.image;
            int iHashCode2 = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
            String str2 = this.price;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.location;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Item(id=");
            sb2.append(this.id);
            sb2.append(", userId=");
            sb2.append(this.userId);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", location=");
            return C22026a.c(sb2, this.location, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.userId);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.price);
            parcel.writeString(this.location);
        }

        public Item(@k String str, @l String str2, @k String str3, @l Image image, @l String str4, @l String str5) {
            super(null);
            this.id = str;
            this.userId = str2;
            this.title = str3;
            this.image = image;
            this.price = str4;
            this.location = str5;
        }
    }

    private MessageBody() {
    }
}
