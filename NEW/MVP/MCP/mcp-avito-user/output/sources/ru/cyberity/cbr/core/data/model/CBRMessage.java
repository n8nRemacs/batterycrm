package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.text.C43066x;
import kotlinx.serialization.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.p0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRMessage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage;", "", "()V", "ClientMessage", "ServerMessage", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CBRMessage {

    /* compiled from: CBRMessage.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 \u00172\u00020\u0001:\n\u0011\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "getType$annotations", "()V", "Companion", "b", "c", "d", "e", "Type", "UserVisibilityState", "f", "g", "h", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static class ClientMessage extends CBRMessage {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Type type;

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "USER_VISIBILITY_STATE", "SCREENSHOT_MADE", "COULD_NOT_MAKE_SCREENSHOT", "VERIFY_MOBILE_PHONE_TAN_SUCCESS", "CANCEL_VERIFY_MOBILE_PHONE_TAN", "VERIFY_MOBILE_PHONE_TAN_REQUESTED", "VERIFY_MOBILE_PHONE_TAN_RETRY_CODE", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public enum Type {
            USER_VISIBILITY_STATE("userVisibilityState"),
            SCREENSHOT_MADE("screenshotMade"),
            COULD_NOT_MAKE_SCREENSHOT("couldNotMakeScreenshot"),
            VERIFY_MOBILE_PHONE_TAN_SUCCESS("verifyMobilePhoneTanSuccess"),
            CANCEL_VERIFY_MOBILE_PHONE_TAN("cancelVerifyMobilePhoneTan"),
            VERIFY_MOBILE_PHONE_TAN_REQUESTED("verifyMobilePhoneTanRequested"),
            VERIFY_MOBILE_PHONE_TAN_RETRY_CODE("verifyMobilePhoneTanRetryCode");


            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            @Y61.k
            private final String value;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.Type.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<Type> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432856a = new a();

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432857b;

                static {
                    EnumDescriptor enumDescriptor = new EnumDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.Type", 7);
                    enumDescriptor.j("userVisibilityState", false);
                    enumDescriptor.j("screenshotMade", false);
                    enumDescriptor.j("couldNotMakeScreenshot", false);
                    enumDescriptor.j("verifyMobilePhoneTanSuccess", false);
                    enumDescriptor.j("cancelVerifyMobilePhoneTan", false);
                    enumDescriptor.j("verifyMobilePhoneTanRequested", false);
                    enumDescriptor.j("verifyMobilePhoneTanRetryCode", false);
                    f432857b = enumDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Type deserialize(@Y61.k Decoder decoder) {
                    return Type.values()[decoder.h(getF332717a())];
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{V0.f412822a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432857b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k Type value) {
                    encoder.g(getF332717a(), value.ordinal());
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$Type$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<Type> serializer() {
                    return a.f432856a;
                }

                private Companion() {
                }
            }

            Type(String str) {
                this.value = str;
            }

            @Y61.k
            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u0012\u0014\u0016\u001bB3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "payload", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "c", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "getPayload$annotations", "()V", "Companion", "Visibility", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class UserVisibilityState extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$Visibility;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "VISIBLE", "HIDDEN", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public enum Visibility {
                VISIBLE("visible"),
                HIDDEN(HiddenParameter.TYPE);


                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                @Y61.k
                private final String value;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.UserVisibilityState.Visibility.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$Visibility;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$Visibility;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$Visibility;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<Visibility> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432859a = new a();

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432860b;

                    static {
                        EnumDescriptor enumDescriptor = new EnumDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.UserVisibilityState.Visibility", 2);
                        enumDescriptor.j("visible", false);
                        enumDescriptor.j(HiddenParameter.TYPE, false);
                        f432860b = enumDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Visibility deserialize(@Y61.k Decoder decoder) {
                        return Visibility.values()[decoder.h(getF332717a())];
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{V0.f412822a};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432860b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k Visibility value) {
                        encoder.g(getF332717a(), value.ordinal());
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$Visibility$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$Visibility;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$UserVisibilityState$Visibility$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<Visibility> serializer() {
                        return a.f432859a;
                    }

                    private Companion() {
                    }
                }

                Visibility(String str) {
                    this.value = str;
                }

                @Y61.k
                public final String getValue() {
                    return this.value;
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.UserVisibilityState.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<UserVisibilityState> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432861a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432862b;

                static {
                    a aVar = new a();
                    f432861a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.UserVisibilityState", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", false);
                    f432862b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public UserVisibilityState deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objV2 = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV2 = cVarC.v(f332717a, 1, c.a.f432864a, objV2);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new UserVisibilityState(i12, (Type) objV, (c) objV2, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a, c.a.f432864a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432862b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k UserVisibilityState value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    UserVisibilityState.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$UserVisibilityState$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<UserVisibilityState> serializer() {
                    return a.f432861a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "", "", "seen1", "", "visibilityState", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getVisibilityState$annotations", "()V", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.k
                private final String visibilityState;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.UserVisibilityState.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432864a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432865b;

                    static {
                        a aVar = new a();
                        f432864a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.UserVisibilityState.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("visibilityState", false);
                        f432865b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        String strS = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else {
                                if (iJ2 != 0) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                strS = cVarC.s(f332717a, 0);
                                i12 = 1;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, strS, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{V0.f412822a};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432865b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$UserVisibilityState$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$UserVisibilityState$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432864a;
                    }

                    private Companion() {
                    }
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, P0 p02) {
                    if (1 == (i12 & 1)) {
                        this.visibilityState = str;
                    } else {
                        E0.b(i12, 1, a.f432864a.getF332717a());
                        throw null;
                    }
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    output.l(serialDesc, 0, self.visibilityState);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && L.f(this.visibilityState, ((c) other).visibilityState);
                }

                public int hashCode() {
                    return this.visibilityState.hashCode();
                }

                @Y61.k
                public String toString() {
                    return C22026a.c(new StringBuilder("Payload(visibilityState="), this.visibilityState, ')');
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ UserVisibilityState(int i12, @v Type type, @v c cVar, P0 p02) {
                super(i12, type, p02);
                if (3 != (i12 & 3)) {
                    E0.b(i12, 3, a.f432861a.getF332717a());
                    throw null;
                }
                this.payload = cVar;
            }

            @X41.n
            public static final void a(@Y61.k UserVisibilityState self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
                output.F(serialDesc, 1, c.a.f432864a, self.payload);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<ClientMessage> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f432866a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f432867b;

            static {
                a aVar = new a();
                f432866a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage", aVar, 1);
                pluginGeneratedSerialDescriptor.j("type", false);
                f432867b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ClientMessage deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f332717a = getF332717a();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                P0 p02 = null;
                boolean z12 = true;
                int i12 = 0;
                Object objV = null;
                while (z12) {
                    int iJ2 = cVarC.j(f332717a);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else {
                        if (iJ2 != 0) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                        i12 = 1;
                    }
                }
                cVarC.d(f332717a);
                return new ClientMessage(i12, (Type) objV, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{Type.a.f432856a};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return f432867b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k ClientMessage value) {
                SerialDescriptor f332717a = getF332717a();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                ClientMessage.a(value, dVarC, f332717a);
                dVarC.d(f332717a);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class b extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.CancelVerifyMobilePhoneTan.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<b> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432868a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432869b;

                static {
                    a aVar = new a();
                    f432868a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.CancelVerifyMobilePhoneTan", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432869b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new b(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432869b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k b value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    b.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$b$b, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<b> serializer() {
                    return a.f432868a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ b(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432868a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k b self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public b() {
                super(Type.CANCEL_VERIFY_MOBILE_PHONE_TAN);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$c;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$c, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<ClientMessage> serializer() {
                return a.f432866a;
            }

            private Companion() {
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class d extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.CouldNotMakeScreenshot.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<d> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432870a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432871b;

                static {
                    a aVar = new a();
                    f432870a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.CouldNotMakeScreenshot", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432871b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public d deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new d(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432871b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k d value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    d.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$d$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<d> serializer() {
                    return a.f432870a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ d(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432870a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k d self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public d() {
                super(Type.COULD_NOT_MAKE_SCREENSHOT);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003\u0012\u001e%B3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "payload", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "getPayload$annotations", "()V", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class e extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.ScreenshotMade.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<e> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432873a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432874b;

                static {
                    a aVar = new a();
                    f432873a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.ScreenshotMade", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", false);
                    f432874b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objV2 = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV2 = cVarC.v(f332717a, 1, c.a.f432876a, objV2);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new e(i12, (Type) objV, (c) objV2, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a, c.a.f432876a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432874b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k e value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    e.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$e$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<e> serializer() {
                    return a.f432873a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011\u001cB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getName$annotations", "()V", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String name;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.ScreenshotMade.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432876a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432877b;

                    static {
                        a aVar = new a();
                        f432876a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.ScreenshotMade.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("imageId", true);
                        f432877b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else {
                                if (iJ2 != 0) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 = 1;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{L51.a.a(V0.f412822a)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432877b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$e$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$e$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432876a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((String) null, 1, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (!output.u() && self.name == null) {
                        return;
                    }
                    output.p(serialDesc, 0, V0.f412822a, self.name);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && L.f(this.name, ((c) other).name);
                }

                public int hashCode() {
                    String str = this.name;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Y61.k
                public String toString() {
                    return C22026a.c(new StringBuilder("Payload(name="), this.name, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.name = null;
                    } else {
                        this.name = str;
                    }
                }

                public c(@Y61.l String str) {
                    this.name = str;
                }

                public /* synthetic */ c(String str, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ e(int i12, @v Type type, @v c cVar, P0 p02) {
                super(i12, type, p02);
                if (3 != (i12 & 3)) {
                    E0.b(i12, 3, a.f432873a.getF332717a());
                    throw null;
                }
                this.payload = cVar;
            }

            @X41.n
            public static final void a(@Y61.k e self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
                output.F(serialDesc, 1, c.a.f432876a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && L.f(this.payload, ((e) other).payload);
            }

            public int hashCode() {
                return this.payload.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ScreenshotMade(payload=" + this.payload + ')';
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class f extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.VerifyMobilePhoneTanRequested.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<f> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432878a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432879b;

                static {
                    a aVar = new a();
                    f432878a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.VerifyMobilePhoneTanRequested", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432879b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new f(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432879b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k f value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    f.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$f;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$f$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<f> serializer() {
                    return a.f432878a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ f(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432878a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k f self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public f() {
                super(Type.VERIFY_MOBILE_PHONE_TAN_REQUESTED);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class g extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.VerifyMobilePhoneTanRetryCode.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<g> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432880a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432881b;

                static {
                    a aVar = new a();
                    f432880a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.VerifyMobilePhoneTanRetryCode", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432881b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public g deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new g(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432881b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k g value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    g.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$g;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$g$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<g> serializer() {
                    return a.f432880a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ g(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432880a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k g self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public g() {
                super(Type.VERIFY_MOBILE_PHONE_TAN_RETRY_CODE);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class h extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ClientMessage.VerifyMobilePhoneTanSuccess.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<h> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432882a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432883b;

                static {
                    a aVar = new a();
                    f432882a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ClientMessage.VerifyMobilePhoneTanSuccess", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432883b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public h deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432856a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new h(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432856a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432883b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k h value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    h.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ClientMessage$h;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ClientMessage$h$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<h> serializer() {
                    return a.f432882a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ h(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432882a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k h self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public h() {
                super(Type.VERIFY_MOBILE_PHONE_TAN_SUCCESS);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @InterfaceC42830m
        public /* synthetic */ ClientMessage(int i12, @v Type type, P0 p02) {
            C42822w c42822w = null;
            if (1 != (i12 & 1)) {
                E0.b(i12, 1, a.f432866a.getF332717a());
                throw null;
            }
            super(c42822w);
            this.type = type;
        }

        @X41.n
        public static final void a(@Y61.k ClientMessage self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            output.F(serialDesc, 0, Type.a.f432856a, self.type);
        }

        public ClientMessage(@Y61.k Type type) {
            super(null);
            this.type = type;
        }
    }

    /* compiled from: CBRMessage.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0016\u0011\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006-"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "getType$annotations", "()V", "Companion", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "ScreenShotPayload", "p", "Type", "q", "r", "s", "t", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static class ServerMessage extends CBRMessage {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Type type;

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0003$,8BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010$\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"HÇ\u0001¢\u0006\u0004\b$\u0010%R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010&\u0012\u0004\b*\u0010+\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010&\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010)R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010&\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u0010\"\u0004\b$\u0010)R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010&\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\u0010\"\u0004\b,\u0010)R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u0010&\u0012\u0004\b6\u0010+\u001a\u0004\b5\u0010\u0010\"\u0004\b4\u0010)¨\u00069"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "Landroid/os/Parcelable;", "", "type", "idDocSubType", "country", "idDocSetType", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "l", "d", "(Ljava/lang/String;)V", "getType$annotations", "()V", "b", "j", "c", "getIdDocSubType$annotations", "f", "getCountry$annotations", "h", "getIdDocSetType$annotations", "e", "n", "getVariant$annotations", "Companion", "Variant", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @K51.d
        @w
        public static final /* data */ class ScreenShotPayload implements Parcelable {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private String type;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private String idDocSubType;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private String country;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private String idDocSetType;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private String variant;

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            @Y61.k
            public static final Parcelable.Creator<ScreenShotPayload> CREATOR = new c();

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$Variant;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "SCREENSHOT", "UPLOAD", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public enum Variant {
                SCREENSHOT("SCREENSHOT"),
                UPLOAD("UPLOAD");


                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                @Y61.k
                private final String value;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ScreenShotPayload.Variant.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$Variant;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$Variant;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$Variant;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<Variant> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432890a = new a();

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432891b;

                    static {
                        EnumDescriptor enumDescriptor = new EnumDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ScreenShotPayload.Variant", 2);
                        enumDescriptor.j("SCREENSHOT", false);
                        enumDescriptor.j("UPLOAD", false);
                        f432891b = enumDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Variant deserialize(@Y61.k Decoder decoder) {
                        return Variant.values()[decoder.h(getF332717a())];
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{V0.f412822a};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432891b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k Variant value) {
                        encoder.g(getF332717a(), value.ordinal());
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$Variant$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$Variant;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$ScreenShotPayload$Variant$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<Variant> serializer() {
                        return a.f432890a;
                    }

                    private Companion() {
                    }
                }

                Variant(String str) {
                    this.value = str;
                }

                @Y61.k
                public final String getValue() {
                    return this.value;
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ScreenShotPayload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<ScreenShotPayload> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432892a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432893b;

                static {
                    a aVar = new a();
                    f432892a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ScreenShotPayload", aVar, 5);
                    pluginGeneratedSerialDescriptor.j("type", true);
                    pluginGeneratedSerialDescriptor.j("idDocSubType", true);
                    pluginGeneratedSerialDescriptor.j("country", true);
                    pluginGeneratedSerialDescriptor.j("idDocSetType", true);
                    pluginGeneratedSerialDescriptor.j("variant", true);
                    f432893b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public ScreenShotPayload deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    Object objF = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objF2 = null;
                    Object objF3 = null;
                    Object objF4 = null;
                    Object objF5 = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                            i12 |= 1;
                        } else if (iJ2 == 1) {
                            objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                            i12 |= 2;
                        } else if (iJ2 == 2) {
                            objF3 = cVarC.f(f332717a, 2, V0.f412822a, objF3);
                            i12 |= 4;
                        } else if (iJ2 == 3) {
                            objF4 = cVarC.f(f332717a, 3, V0.f412822a, objF4);
                            i12 |= 8;
                        } else {
                            if (iJ2 != 4) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF5 = cVarC.f(f332717a, 4, V0.f412822a, objF5);
                            i12 |= 16;
                        }
                    }
                    cVarC.d(f332717a);
                    return new ScreenShotPayload(i12, (String) objF, (String) objF2, (String) objF3, (String) objF4, (String) objF5, (P0) null);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    V0 v02 = V0.f412822a;
                    return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432893b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k ScreenShotPayload value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    ScreenShotPayload.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$ScreenShotPayload$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<ScreenShotPayload> serializer() {
                    return a.f432892a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class c implements Parcelable.Creator<ScreenShotPayload> {
                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ScreenShotPayload createFromParcel(@Y61.k Parcel parcel) {
                    return new ScreenShotPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ScreenShotPayload[] newArray(int i12) {
                    return new ScreenShotPayload[i12];
                }
            }

            public ScreenShotPayload() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (C42822w) null);
            }

            @X41.n
            public static final void a(@Y61.k ScreenShotPayload self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                if (output.u() || !L.f(self.type, "")) {
                    output.p(serialDesc, 0, V0.f412822a, self.type);
                }
                if (output.u() || !L.f(self.idDocSubType, "")) {
                    output.p(serialDesc, 1, V0.f412822a, self.idDocSubType);
                }
                if (output.u() || !L.f(self.country, "")) {
                    output.p(serialDesc, 2, V0.f412822a, self.country);
                }
                if (output.u() || !L.f(self.idDocSetType, "")) {
                    output.p(serialDesc, 3, V0.f412822a, self.idDocSetType);
                }
                if (!output.u() && L.f(self.variant, "")) {
                    return;
                }
                output.p(serialDesc, 4, V0.f412822a, self.variant);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenShotPayload)) {
                    return false;
                }
                ScreenShotPayload screenShotPayload = (ScreenShotPayload) other;
                return L.f(this.type, screenShotPayload.type) && L.f(this.idDocSubType, screenShotPayload.idDocSubType) && L.f(this.country, screenShotPayload.country) && L.f(this.idDocSetType, screenShotPayload.idDocSetType) && L.f(this.variant, screenShotPayload.variant);
            }

            public int hashCode() {
                String str = this.type;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.idDocSubType;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.country;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.idDocSetType;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.variant;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ScreenShotPayload(type=");
                sb2.append(this.type);
                sb2.append(", idDocSubType=");
                sb2.append(this.idDocSubType);
                sb2.append(", country=");
                sb2.append(this.country);
                sb2.append(", idDocSetType=");
                sb2.append(this.idDocSetType);
                sb2.append(", variant=");
                return C22026a.c(sb2, this.variant, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@Y61.k Parcel parcel, int flags) {
                parcel.writeString(this.type);
                parcel.writeString(this.idDocSubType);
                parcel.writeString(this.country);
                parcel.writeString(this.idDocSetType);
                parcel.writeString(this.variant);
            }

            @InterfaceC42830m
            public /* synthetic */ ScreenShotPayload(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, P0 p02) {
                if ((i12 & 1) == 0) {
                    this.type = "";
                } else {
                    this.type = str;
                }
                if ((i12 & 2) == 0) {
                    this.idDocSubType = "";
                } else {
                    this.idDocSubType = str2;
                }
                if ((i12 & 4) == 0) {
                    this.country = "";
                } else {
                    this.country = str3;
                }
                if ((i12 & 8) == 0) {
                    this.idDocSetType = "";
                } else {
                    this.idDocSetType = str4;
                }
                if ((i12 & 16) == 0) {
                    this.variant = "";
                } else {
                    this.variant = str5;
                }
            }

            public ScreenShotPayload(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
                this.type = str;
                this.idDocSubType = str2;
                this.country = str3;
                this.idDocSetType = str4;
                this.variant = str5;
            }

            public /* synthetic */ ScreenShotPayload(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) != 0 ? "" : str5);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "MODERATOR_NAME", "COMPLETED", "READY_FOR_SCREENSHOT", "MAKE_SCREENSHOT", "CANCEL_SCREENSHOT", "UPDATE_REQUIRED_ID_DOCS", "STEP_CHANGE", "VERIFY_MOBILE_PHONE_TAN", "CANCEL_VERIFY_MOBILE_PHONE_TAN", "APPLICANT_STATUS_CHANGE", "APPLICANT_ACTION_STATUS_CHANGE", "APPLICANT_LEVEL_CHANGE", "ADDED_ID_DOC", "WELCOME", "APPLICANT_IMAGE_REVIEWED", "APPLICANT_QUEUE_STATUS", GrsBaseInfo.CountryCodeSource.UNKNOWN, "EMPTY", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public enum Type {
            MODERATOR_NAME("moderatorName"),
            COMPLETED("completed"),
            READY_FOR_SCREENSHOT("readyForScreenshot"),
            MAKE_SCREENSHOT("makeScreenshot"),
            CANCEL_SCREENSHOT("cancelScreenshot"),
            UPDATE_REQUIRED_ID_DOCS("updateRequiredIdDocs"),
            STEP_CHANGE("stepChange"),
            VERIFY_MOBILE_PHONE_TAN("verifyMobilePhoneTan"),
            CANCEL_VERIFY_MOBILE_PHONE_TAN("cancelVerifyMobilePhoneTan"),
            APPLICANT_STATUS_CHANGE("applicantStatusChange"),
            APPLICANT_ACTION_STATUS_CHANGE("applicantActionStatusChange"),
            APPLICANT_LEVEL_CHANGE("applicantLevelChange"),
            ADDED_ID_DOC("addedIdDoc"),
            WELCOME("welcome"),
            APPLICANT_IMAGE_REVIEWED("applicantImageReviewed"),
            APPLICANT_QUEUE_STATUS("applicantQueueStatus"),
            UNKNOWN("unknown"),
            EMPTY("empty");


            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            @Y61.k
            private final String type;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.Type.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<Type> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432894a = new a();

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432895b;

                static {
                    EnumDescriptor enumDescriptor = new EnumDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.Type", 18);
                    enumDescriptor.j("moderatorName", false);
                    enumDescriptor.j("completed", false);
                    enumDescriptor.j("readyForScreenshot", false);
                    enumDescriptor.j("makeScreenshot", false);
                    enumDescriptor.j("cancelScreenshot", false);
                    enumDescriptor.j("updateRequiredIdDocs", false);
                    enumDescriptor.j("stepChange", false);
                    enumDescriptor.j("verifyMobilePhoneTan", false);
                    enumDescriptor.j("cancelVerifyMobilePhoneTan", false);
                    enumDescriptor.j("applicantStatusChange", false);
                    enumDescriptor.j("applicantActionStatusChange", false);
                    enumDescriptor.j("applicantLevelChange", false);
                    enumDescriptor.j("addedIdDoc", false);
                    enumDescriptor.j("welcome", false);
                    enumDescriptor.j("applicantImageReviewed", false);
                    enumDescriptor.j("applicantQueueStatus", false);
                    enumDescriptor.j("unknown", false);
                    enumDescriptor.j("empty", false);
                    f432895b = enumDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Type deserialize(@Y61.k Decoder decoder) {
                    return Type.values()[decoder.h(getF332717a())];
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{V0.f412822a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432895b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k Type value) {
                    encoder.g(getF332717a(), value.ordinal());
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$Type$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<Type> serializer() {
                    return a.f432894a;
                }

                private Companion() {
                }
            }

            Type(String str) {
                this.type = str;
            }

            @Y61.k
            public final String getType() {
                return this.type;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<ServerMessage> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f432896a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f432897b;

            static {
                a aVar = new a();
                f432896a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage", aVar, 1);
                pluginGeneratedSerialDescriptor.j("type", false);
                f432897b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ServerMessage deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f332717a = getF332717a();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                P0 p02 = null;
                boolean z12 = true;
                int i12 = 0;
                Object objV = null;
                while (z12) {
                    int iJ2 = cVarC.j(f332717a);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else {
                        if (iJ2 != 0) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                        i12 = 1;
                    }
                }
                cVarC.d(f332717a);
                return new ServerMessage(i12, (Type) objV, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{Type.a.f432894a};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return f432897b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k ServerMessage value) {
                SerialDescriptor f332717a = getF332717a();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                ServerMessage.a(value, dVarC, f332717a);
                dVarC.d(f332717a);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class b extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.AddedIdDoc.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<b> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432899a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432900b;

                static {
                    a aVar = new a();
                    f432899a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.AddedIdDoc", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432900b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432903a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new b(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432903a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432900b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k b value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    b.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$b$b, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<b> serializer() {
                    return a.f432899a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "", "", "imageId", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getImageId$annotations", "()V", "b", "e", "getSessionId$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String imageId;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String sessionId;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.AddedIdDoc.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432903a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432904b;

                    static {
                        a aVar = new a();
                        f432903a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.AddedIdDoc.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.j("imageId", true);
                        pluginGeneratedSerialDescriptor.j("sessionId", true);
                        f432904b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        Object objF2 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 |= 1;
                            } else {
                                if (iJ2 != 1) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, (String) objF2, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(v02)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432904b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$b$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$b$c$b, reason: collision with other inner class name and from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432903a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((String) null, (String) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (output.u() || self.imageId != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.imageId);
                    }
                    if (!output.u() && self.sessionId == null) {
                        return;
                    }
                    output.p(serialDesc, 1, V0.f412822a, self.sessionId);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return L.f(this.imageId, cVar.imageId) && L.f(this.sessionId, cVar.sessionId);
                }

                public int hashCode() {
                    String str = this.imageId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.sessionId;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(imageId=");
                    sb2.append(this.imageId);
                    sb2.append(", sessionId=");
                    return C22026a.c(sb2, this.sessionId, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, @v String str2, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.imageId = null;
                    } else {
                        this.imageId = str;
                    }
                    if ((i12 & 2) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str2;
                    }
                }

                public c(@Y61.l String str, @Y61.l String str2) {
                    this.imageId = str;
                    this.sessionId = str2;
                }

                public /* synthetic */ c(String str, String str2, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k b self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432903a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && L.f(this.payload, ((b) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @Y61.k
            public String toString() {
                return "AddedIdDoc(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ b(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432899a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ b(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public b(@Y61.l c cVar) {
                super(Type.ADDED_ID_DOC);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class c extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final C12443c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantActionStatusChange.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<c> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432906a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432907b;

                static {
                    a aVar = new a();
                    f432906a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantActionStatusChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432907b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public c deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, C12443c.a.f432911a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new c(i12, (Type) objV, (C12443c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(C12443c.a.f432911a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432907b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    c.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<c> serializer() {
                    return a.f432906a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0013!B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "", "", "sessionId", "status", "newToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "getSessionId$annotations", "()V", "b", "h", "getStatus$annotations", "c", "d", "getNewToken$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$c$c, reason: collision with other inner class name */
            public static final /* data */ class C12443c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String sessionId;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String status;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String newToken;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantActionStatusChange.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$c$c$a */
                public static final class a implements N<C12443c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432911a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432912b;

                    static {
                        a aVar = new a();
                        f432911a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantActionStatusChange.Payload", aVar, 3);
                        pluginGeneratedSerialDescriptor.j("sessionId", true);
                        pluginGeneratedSerialDescriptor.j("status", true);
                        pluginGeneratedSerialDescriptor.j("newToken", true);
                        f432912b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public C12443c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        Object objF = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF2 = null;
                        Object objF3 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 |= 1;
                            } else if (iJ2 == 1) {
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                            } else {
                                if (iJ2 != 2) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF3 = cVarC.f(f332717a, 2, V0.f412822a, objF3);
                                i12 |= 4;
                            }
                        }
                        cVarC.d(f332717a);
                        return new C12443c(i12, (String) objF, (String) objF2, (String) objF3, (P0) null);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432912b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k C12443c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        C12443c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$c$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$c$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<C12443c> serializer() {
                        return a.f432911a;
                    }

                    private Companion() {
                    }
                }

                public C12443c() {
                    this((String) null, (String) null, (String) null, 7, (C42822w) null);
                }

                @X41.n
                public static final void a(@Y61.k C12443c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (output.u() || self.sessionId != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.sessionId);
                    }
                    if (output.u() || self.status != null) {
                        output.p(serialDesc, 1, V0.f412822a, self.status);
                    }
                    if (!output.u() && self.newToken == null) {
                        return;
                    }
                    output.p(serialDesc, 2, V0.f412822a, self.newToken);
                }

                @Y61.l
                /* renamed from: d, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C12443c)) {
                        return false;
                    }
                    C12443c c12443c = (C12443c) other;
                    return L.f(this.sessionId, c12443c.sessionId) && L.f(this.status, c12443c.status) && L.f(this.newToken, c12443c.newToken);
                }

                public int hashCode() {
                    String str = this.sessionId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.status;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.newToken;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(sessionId=");
                    sb2.append(this.sessionId);
                    sb2.append(", status=");
                    sb2.append(this.status);
                    sb2.append(", newToken=");
                    return C22026a.c(sb2, this.newToken, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ C12443c(int i12, @v String str, @v String str2, @v String str3, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str;
                    }
                    if ((i12 & 2) == 0) {
                        this.status = null;
                    } else {
                        this.status = str2;
                    }
                    if ((i12 & 4) == 0) {
                        this.newToken = null;
                    } else {
                        this.newToken = str3;
                    }
                }

                public C12443c(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
                    this.sessionId = str;
                    this.status = str2;
                    this.newToken = str3;
                }

                public /* synthetic */ C12443c(String str, String str2, String str3, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, C12443c.a.f432911a, self.payload);
            }

            @Y61.l
            /* renamed from: d, reason: from getter */
            public final C12443c getPayload() {
                return this.payload;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && L.f(this.payload, ((c) other).payload);
            }

            public int hashCode() {
                C12443c c12443c = this.payload;
                if (c12443c == null) {
                    return 0;
                }
                return c12443c.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ApplicantActionStatusChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ c(int i12, @v Type type, C12443c c12443c, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432906a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = c12443c;
                }
            }

            public /* synthetic */ c(C12443c c12443c, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : c12443c);
            }

            public c(@Y61.l C12443c c12443c) {
                super(Type.APPLICANT_ACTION_STATUS_CHANGE);
                this.payload = c12443c;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class d extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantImageReviewed.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<d> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432914a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432915b;

                static {
                    a aVar = new a();
                    f432914a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantImageReviewed", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432915b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public d deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432918a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new d(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432918a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432915b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k d value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    d.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$d$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<d> serializer() {
                    return a.f432914a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "", "", "newToken", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getNewToken$annotations", "()V", "b", "e", "getSessionId$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String newToken;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String sessionId;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantImageReviewed.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432918a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432919b;

                    static {
                        a aVar = new a();
                        f432918a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantImageReviewed.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.j("newToken", true);
                        pluginGeneratedSerialDescriptor.j("sessionId", true);
                        f432919b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        Object objF2 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 |= 1;
                            } else {
                                if (iJ2 != 1) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, (String) objF2, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(v02)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432919b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$d$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$d$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432918a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((String) null, (String) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (output.u() || self.newToken != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.newToken);
                    }
                    if (!output.u() && self.sessionId == null) {
                        return;
                    }
                    output.p(serialDesc, 1, V0.f412822a, self.sessionId);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return L.f(this.newToken, cVar.newToken) && L.f(this.sessionId, cVar.sessionId);
                }

                public int hashCode() {
                    String str = this.newToken;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.sessionId;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(newToken=");
                    sb2.append(this.newToken);
                    sb2.append(", sessionId=");
                    return C22026a.c(sb2, this.sessionId, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, @v String str2, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.newToken = null;
                    } else {
                        this.newToken = str;
                    }
                    if ((i12 & 2) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str2;
                    }
                }

                public c(@Y61.l String str, @Y61.l String str2) {
                    this.newToken = str;
                    this.sessionId = str2;
                }

                public /* synthetic */ c(String str, String str2, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k d self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432918a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && L.f(this.payload, ((d) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ApplicantImageReviewed(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ d(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432914a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ d(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public d(@Y61.l c cVar) {
                super(Type.APPLICANT_IMAGE_REVIEWED);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class e extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantLevelChange.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<e> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432921a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432922b;

                static {
                    a aVar = new a();
                    f432921a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantLevelChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432922b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432925a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new e(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432925a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432922b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k e value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    e.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$e$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<e> serializer() {
                    return a.f432921a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "", "", "levelName", "newToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getLevelName$annotations", "()V", "b", "e", "getNewToken$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String levelName;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String newToken;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantLevelChange.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432925a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432926b;

                    static {
                        a aVar = new a();
                        f432925a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantLevelChange.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.j("levelName", true);
                        pluginGeneratedSerialDescriptor.j("newToken", false);
                        f432926b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        Object objF2 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 |= 1;
                            } else {
                                if (iJ2 != 1) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, (String) objF2, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(v02)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432926b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$e$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$e$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432925a;
                    }

                    private Companion() {
                    }
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, @v String str2, P0 p02) {
                    if (2 != (i12 & 2)) {
                        E0.b(i12, 2, a.f432925a.getF332717a());
                        throw null;
                    }
                    if ((i12 & 1) == 0) {
                        this.levelName = null;
                    } else {
                        this.levelName = str;
                    }
                    this.newToken = str2;
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (output.u() || self.levelName != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.levelName);
                    }
                    output.p(serialDesc, 1, V0.f412822a, self.newToken);
                }

                @Y61.l
                /* renamed from: e, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return L.f(this.levelName, cVar.levelName) && L.f(this.newToken, cVar.newToken);
                }

                public int hashCode() {
                    String str = this.levelName;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.newToken;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(levelName=");
                    sb2.append(this.levelName);
                    sb2.append(", newToken=");
                    return C22026a.c(sb2, this.newToken, ')');
                }

                public c(@Y61.l String str, @Y61.l String str2) {
                    this.levelName = str;
                    this.newToken = str2;
                }

                public /* synthetic */ c(String str, String str2, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, str2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public e() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k e self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432925a, self.payload);
            }

            @Y61.l
            /* renamed from: d, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && L.f(this.payload, ((e) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ApplicantLevelChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ e(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432921a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ e(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public e(@Y61.l c cVar) {
                super(Type.APPLICANT_LEVEL_CHANGE);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class f extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantQueueStatus.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<f> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432928a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432929b;

                static {
                    a aVar = new a();
                    f432928a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantQueueStatus", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432929b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432932a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new f(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432932a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432929b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k f value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    f.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$f$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<f> serializer() {
                    return a.f432928a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0012\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f¨\u0006&"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "", "", "waitTimeSec", "queuePlace", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "getWaitTimeSec$annotations", "()V", "b", "c", "getQueuePlace$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final Long waitTimeSec;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final Long queuePlace;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantQueueStatus.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432932a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432933b;

                    static {
                        a aVar = new a();
                        f432932a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantQueueStatus.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.j("waitTimeSec", true);
                        pluginGeneratedSerialDescriptor.j("queuePlace", true);
                        f432933b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        Object objF2 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, C43412k0.f412877a, objF);
                                i12 |= 1;
                            } else {
                                if (iJ2 != 1) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF2 = cVarC.f(f332717a, 1, C43412k0.f412877a, objF2);
                                i12 |= 2;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (Long) objF, (Long) objF2, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        C43412k0 c43412k0 = C43412k0.f412877a;
                        return new KSerializer[]{L51.a.a(c43412k0), L51.a.a(c43412k0)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432933b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$f$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$f$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432932a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((Long) null, (Long) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (output.u() || self.waitTimeSec != null) {
                        output.p(serialDesc, 0, C43412k0.f412877a, self.waitTimeSec);
                    }
                    if (!output.u() && self.queuePlace == null) {
                        return;
                    }
                    output.p(serialDesc, 1, C43412k0.f412877a, self.queuePlace);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return L.f(this.waitTimeSec, cVar.waitTimeSec) && L.f(this.queuePlace, cVar.queuePlace);
                }

                public int hashCode() {
                    Long l12 = this.waitTimeSec;
                    int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
                    Long l13 = this.queuePlace;
                    return iHashCode + (l13 != null ? l13.hashCode() : 0);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(waitTimeSec=");
                    sb2.append(this.waitTimeSec);
                    sb2.append(", queuePlace=");
                    return androidx.media3.exoplayer.analytics.m.m(sb2, this.queuePlace, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v Long l12, @v Long l13, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.waitTimeSec = null;
                    } else {
                        this.waitTimeSec = l12;
                    }
                    if ((i12 & 2) == 0) {
                        this.queuePlace = null;
                    } else {
                        this.queuePlace = l13;
                    }
                }

                public c(@Y61.l Long l12, @Y61.l Long l13) {
                    this.waitTimeSec = l12;
                    this.queuePlace = l13;
                }

                public /* synthetic */ c(Long l12, Long l13, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : l13);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k f self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432932a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && L.f(this.payload, ((f) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ApplicantQueueStatus(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ f(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432928a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ f(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public f(@Y61.l c cVar) {
                super(Type.APPLICANT_QUEUE_STATUS);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class g extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantStatusChange.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<g> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432935a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432936b;

                static {
                    a aVar = new a();
                    f432935a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantStatusChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432936b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public g deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432940a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new g(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432940a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432936b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k g value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    g.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$g$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<g> serializer() {
                    return a.f432935a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0013!B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "", "", "sessionId", "status", "newToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "getSessionId$annotations", "()V", "b", "h", "getStatus$annotations", "c", "d", "getNewToken$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String sessionId;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String status;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String newToken;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ApplicantStatusChange.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432940a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432941b;

                    static {
                        a aVar = new a();
                        f432940a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ApplicantStatusChange.Payload", aVar, 3);
                        pluginGeneratedSerialDescriptor.j("sessionId", true);
                        pluginGeneratedSerialDescriptor.j("status", true);
                        pluginGeneratedSerialDescriptor.j("newToken", true);
                        f432941b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        Object objF = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF2 = null;
                        Object objF3 = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else if (iJ2 == 0) {
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 |= 1;
                            } else if (iJ2 == 1) {
                                objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                                i12 |= 2;
                            } else {
                                if (iJ2 != 2) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF3 = cVarC.f(f332717a, 2, V0.f412822a, objF3);
                                i12 |= 4;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, (String) objF2, (String) objF3, (P0) null);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        V0 v02 = V0.f412822a;
                        return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432941b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$g$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$g$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432940a;
                    }

                    private Companion() {
                    }
                }

                public c() {
                    this((String) null, (String) null, (String) null, 7, (C42822w) null);
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (output.u() || self.sessionId != null) {
                        output.p(serialDesc, 0, V0.f412822a, self.sessionId);
                    }
                    if (output.u() || self.status != null) {
                        output.p(serialDesc, 1, V0.f412822a, self.status);
                    }
                    if (!output.u() && self.newToken == null) {
                        return;
                    }
                    output.p(serialDesc, 2, V0.f412822a, self.newToken);
                }

                @Y61.l
                /* renamed from: d, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return L.f(this.sessionId, cVar.sessionId) && L.f(this.status, cVar.status) && L.f(this.newToken, cVar.newToken);
                }

                public int hashCode() {
                    String str = this.sessionId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.status;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.newToken;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(sessionId=");
                    sb2.append(this.sessionId);
                    sb2.append(", status=");
                    sb2.append(this.status);
                    sb2.append(", newToken=");
                    return C22026a.c(sb2, this.newToken, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, @v String str2, @v String str3, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str;
                    }
                    if ((i12 & 2) == 0) {
                        this.status = null;
                    } else {
                        this.status = str2;
                    }
                    if ((i12 & 4) == 0) {
                        this.newToken = null;
                    } else {
                        this.newToken = str3;
                    }
                }

                public c(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
                    this.sessionId = str;
                    this.status = str2;
                    this.newToken = str3;
                }

                public /* synthetic */ c(String str, String str2, String str3, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public g() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k g self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432940a, self.payload);
            }

            @Y61.l
            /* renamed from: d, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && L.f(this.payload, ((g) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ApplicantStatusChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ g(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432935a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ g(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public g(@Y61.l c cVar) {
                super(Type.APPLICANT_STATUS_CHANGE);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class h extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.CancelScreenshot.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<h> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432942a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432943b;

                static {
                    a aVar = new a();
                    f432942a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.CancelScreenshot", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432943b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public h deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new h(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432943b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k h value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    h.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$h;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$h$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<h> serializer() {
                    return a.f432942a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ h(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432942a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k h self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public h() {
                super(Type.CANCEL_SCREENSHOT);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class i extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.CancelVerifyMobilePhoneTan.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<i> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432944a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432945b;

                static {
                    a aVar = new a();
                    f432944a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.CancelVerifyMobilePhoneTan", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432945b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public i deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new i(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432945b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k i value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    i.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$i;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$i$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<i> serializer() {
                    return a.f432944a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ i(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432944a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k i self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public i() {
                super(Type.CANCEL_VERIFY_MOBILE_PHONE_TAN);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$j;", "", "<init>", "()V", "Lkotlinx/serialization/json/a;", "json", "", "jsonString", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "a", "(Lkotlinx/serialization/json/a;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$j, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final ServerMessage a(@Y61.k AbstractC43443a json, @Y61.k String jsonString) {
                ServerMessage fVar;
                n.c cVar;
                try {
                    if (C43066x.K(jsonString)) {
                        return new l();
                    }
                    ru.cyberity.cbr.core.data.model.m mVar = (ru.cyberity.cbr.core.data.model.m) json.d(jsonString, C.e(json.f412956b, m0.c(ru.cyberity.cbr.core.data.model.m.class)));
                    String strC = mVar.getType();
                    if (L.f(strC, Type.CANCEL_VERIFY_MOBILE_PHONE_TAN.getType())) {
                        return new i();
                    }
                    if (L.f(strC, Type.VERIFY_MOBILE_PHONE_TAN.getType())) {
                        return new s();
                    }
                    if (L.f(strC, Type.STEP_CHANGE.getType())) {
                        JsonElement jsonElementA = mVar.getPayload();
                        fVar = new p(jsonElementA != null ? (p.c) p0.a(json, jsonElementA, p.c.INSTANCE.serializer()) : null);
                    } else if (L.f(strC, Type.COMPLETED.getType())) {
                        JsonElement jsonElementA2 = mVar.getPayload();
                        fVar = new k(jsonElementA2 != null ? (k.c) p0.a(json, jsonElementA2, k.c.INSTANCE.serializer()) : null);
                    } else {
                        if (L.f(strC, Type.MODERATOR_NAME.getType())) {
                            JsonElement jsonElementA3 = mVar.getPayload();
                            if (jsonElementA3 != null && (cVar = (n.c) p0.a(json, jsonElementA3, n.c.INSTANCE.serializer())) != null) {
                                fVar = new n(cVar);
                            }
                            return new q(mVar.getType());
                        }
                        if (L.f(strC, Type.READY_FOR_SCREENSHOT.getType())) {
                            JsonElement jsonElementA4 = mVar.getPayload();
                            fVar = new o(jsonElementA4 != null ? (ScreenShotPayload) p0.a(json, jsonElementA4, ScreenShotPayload.INSTANCE.serializer()) : null);
                        } else if (L.f(strC, Type.MAKE_SCREENSHOT.getType())) {
                            JsonElement jsonElementA5 = mVar.getPayload();
                            fVar = new m(jsonElementA5 != null ? (ScreenShotPayload) p0.a(json, jsonElementA5, ScreenShotPayload.INSTANCE.serializer()) : null);
                        } else {
                            if (L.f(strC, Type.CANCEL_SCREENSHOT.getType())) {
                                return new h();
                            }
                            if (L.f(strC, Type.UPDATE_REQUIRED_ID_DOCS.getType())) {
                                return new r();
                            }
                            if (L.f(strC, Type.APPLICANT_LEVEL_CHANGE.getType())) {
                                JsonElement jsonElementA6 = mVar.getPayload();
                                fVar = new e(jsonElementA6 != null ? (e.c) p0.a(json, jsonElementA6, e.c.INSTANCE.serializer()) : null);
                            } else if (L.f(strC, Type.APPLICANT_STATUS_CHANGE.getType())) {
                                JsonElement jsonElementA7 = mVar.getPayload();
                                fVar = new g(jsonElementA7 != null ? (g.c) p0.a(json, jsonElementA7, g.c.INSTANCE.serializer()) : null);
                            } else if (L.f(strC, Type.APPLICANT_ACTION_STATUS_CHANGE.getType())) {
                                JsonElement jsonElementA8 = mVar.getPayload();
                                fVar = new c(jsonElementA8 != null ? (c.C12443c) p0.a(json, jsonElementA8, c.C12443c.INSTANCE.serializer()) : null);
                            } else {
                                if (L.f(strC, Type.WELCOME.getType())) {
                                    return new t();
                                }
                                if (L.f(strC, Type.ADDED_ID_DOC.getType())) {
                                    JsonElement jsonElementA9 = mVar.getPayload();
                                    fVar = new b(jsonElementA9 != null ? (b.c) p0.a(json, jsonElementA9, b.c.INSTANCE.serializer()) : null);
                                } else if (L.f(strC, Type.APPLICANT_IMAGE_REVIEWED.getType())) {
                                    JsonElement jsonElementA10 = mVar.getPayload();
                                    fVar = new d(jsonElementA10 != null ? (d.c) p0.a(json, jsonElementA10, d.c.INSTANCE.serializer()) : null);
                                } else {
                                    if (!L.f(strC, Type.APPLICANT_QUEUE_STATUS.getType())) {
                                        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "unknown message: ".concat(jsonString), null, 4, null);
                                        return new q(mVar.getType());
                                    }
                                    JsonElement jsonElementA11 = mVar.getPayload();
                                    fVar = new f(jsonElementA11 != null ? (f.c) p0.a(json, jsonElementA11, f.c.INSTANCE.serializer()) : null);
                                }
                            }
                        }
                    }
                    return fVar;
                } catch (Exception e12) {
                    ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Can't parse server message=".concat(jsonString), e12);
                    return new q(null);
                }
            }

            @Y61.k
            public final KSerializer<ServerMessage> serializer() {
                return a.f432896a;
            }

            private Companion() {
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0013\u0015\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "c", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class k extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.Completed.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<k> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432947a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432948b;

                static {
                    a aVar = new a();
                    f432947a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.Completed", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432948b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public k deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432950a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new k(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432950a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432948b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k k value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    k.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$k$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<k> serializer() {
                    return a.f432947a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0011\u001cB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "", "", "applicantCompleted", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "getApplicantCompleted$annotations", "()V", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final Boolean applicantCompleted;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.Completed.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432950a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432951b;

                    static {
                        a aVar = new a();
                        f432950a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.Completed.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("applicantCompleted", true);
                        f432951b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else {
                                if (iJ2 != 0) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF = cVarC.f(f332717a, 0, C43407i.f412866a, objF);
                                i12 = 1;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (Boolean) objF, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{L51.a.a(C43407i.f412866a)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432951b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$k$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$k$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432950a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((Boolean) null, 1, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (!output.u() && self.applicantCompleted == null) {
                        return;
                    }
                    output.p(serialDesc, 0, C43407i.f412866a, self.applicantCompleted);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && L.f(this.applicantCompleted, ((c) other).applicantCompleted);
                }

                public int hashCode() {
                    Boolean bool = this.applicantCompleted;
                    if (bool == null) {
                        return 0;
                    }
                    return bool.hashCode();
                }

                @Y61.k
                public String toString() {
                    return C0.g(new StringBuilder("Payload(applicantCompleted="), this.applicantCompleted, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v Boolean bool, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.applicantCompleted = null;
                    } else {
                        this.applicantCompleted = bool;
                    }
                }

                public c(@Y61.l Boolean bool) {
                    this.applicantCompleted = bool;
                }

                public /* synthetic */ c(Boolean bool, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : bool);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public k() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k k self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432950a, self.payload);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ k(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432947a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ k(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public k(@Y61.l c cVar) {
                super(Type.COMPLETED);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$l;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final class l extends ServerMessage {
            public l() {
                super(Type.EMPTY);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013\u001fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class m extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final ScreenShotPayload payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.MakeScreenshot.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<m> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432953a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432954b;

                static {
                    a aVar = new a();
                    f432953a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.MakeScreenshot", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432954b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public m deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, ScreenShotPayload.a.f432892a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new m(i12, (Type) objV, (ScreenShotPayload) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(ScreenShotPayload.a.f432892a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432954b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k m value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    m.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$m;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$m$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<m> serializer() {
                    return a.f432953a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public m() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k m self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, ScreenShotPayload.a.f432892a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof m) && L.f(this.payload, ((m) other).payload);
            }

            public int hashCode() {
                ScreenShotPayload screenShotPayload = this.payload;
                if (screenShotPayload == null) {
                    return 0;
                }
                return screenShotPayload.hashCode();
            }

            @Y61.k
            public String toString() {
                return "MakeScreenshot(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ m(int i12, @v Type type, ScreenShotPayload screenShotPayload, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432953a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = screenShotPayload;
                }
            }

            public /* synthetic */ m(ScreenShotPayload screenShotPayload, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : screenShotPayload);
            }

            public m(@Y61.l ScreenShotPayload screenShotPayload) {
                super(Type.MAKE_SCREENSHOT);
                this.payload = screenShotPayload;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class n extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ModeratorName.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<n> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432956a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432957b;

                static {
                    a aVar = new a();
                    f432956a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ModeratorName", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", false);
                    f432957b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public n deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objV2 = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV2 = cVarC.v(f332717a, 1, c.a.f432959a, objV2);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new n(i12, (Type) objV, (c) objV2, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, c.a.f432959a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432957b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k n value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    n.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$n$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<n> serializer() {
                    return a.f432956a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011\u001cB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getName$annotations", "()V", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String name;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ModeratorName.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432959a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432960b;

                    static {
                        a aVar = new a();
                        f432959a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ModeratorName.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("name", true);
                        f432960b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else {
                                if (iJ2 != 0) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 = 1;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{L51.a.a(V0.f412822a)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432960b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$n$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$n$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432959a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((String) null, 1, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (!output.u() && self.name == null) {
                        return;
                    }
                    output.p(serialDesc, 0, V0.f412822a, self.name);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && L.f(this.name, ((c) other).name);
                }

                public int hashCode() {
                    String str = this.name;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Y61.k
                public String toString() {
                    return C22026a.c(new StringBuilder("Payload(name="), this.name, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.name = null;
                    } else {
                        this.name = str;
                    }
                }

                public c(@Y61.l String str) {
                    this.name = str;
                }

                public /* synthetic */ c(String str, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ n(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (3 != (i12 & 3)) {
                    E0.b(i12, 3, a.f432956a.getF332717a());
                    throw null;
                }
                this.payload = cVar;
            }

            @X41.n
            public static final void a(@Y61.k n self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                output.F(serialDesc, 1, c.a.f432959a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof n) && L.f(this.payload, ((n) other).payload);
            }

            public int hashCode() {
                return this.payload.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ModeratorName(payload=" + this.payload + ')';
            }

            public n(@Y61.k c cVar) {
                super(Type.MODERATOR_NAME);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013\u001fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$ScreenShotPayload;", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class o extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final ScreenShotPayload payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.ReadyForScreenshot.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<o> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432962a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432963b;

                static {
                    a aVar = new a();
                    f432962a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.ReadyForScreenshot", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432963b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public o deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, ScreenShotPayload.a.f432892a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new o(i12, (Type) objV, (ScreenShotPayload) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(ScreenShotPayload.a.f432892a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432963b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k o value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    o.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$o;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$o$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<o> serializer() {
                    return a.f432962a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public o() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k o self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, ScreenShotPayload.a.f432892a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof o) && L.f(this.payload, ((o) other).payload);
            }

            public int hashCode() {
                ScreenShotPayload screenShotPayload = this.payload;
                if (screenShotPayload == null) {
                    return 0;
                }
                return screenShotPayload.hashCode();
            }

            @Y61.k
            public String toString() {
                return "ReadyForScreenshot(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ o(int i12, @v Type type, ScreenShotPayload screenShotPayload, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432962a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = screenShotPayload;
                }
            }

            public /* synthetic */ o(ScreenShotPayload screenShotPayload, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : screenShotPayload);
            }

            public o(@Y61.l ScreenShotPayload screenShotPayload) {
                super(Type.READY_FOR_SCREENSHOT);
                this.payload = screenShotPayload;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0013\u001f$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "payload", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "d", "()Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "Companion", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class p extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final c payload;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.StepChange.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<p> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432965a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432966b;

                static {
                    a aVar = new a();
                    f432965a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.StepChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("payload", true);
                    f432966b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public p deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, c.a.f432968a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new p(i12, (Type) objV, (c) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(c.a.f432968a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432966b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k p value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    p.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$p$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<p> serializer() {
                    return a.f432965a;
                }

                private Companion() {
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011\u001cB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "", "", "idDocSetType", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getIdDocSetType$annotations", "()V", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @w
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                @Y61.k
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.l
                private final String idDocSetType;

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.StepChange.Payload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                @InterfaceC42830m
                public static final class a implements N<c> {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final a f432968a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ SerialDescriptor f432969b;

                    static {
                        a aVar = new a();
                        f432968a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.StepChange.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("idDocSetType", true);
                        f432969b = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(@Y61.k Decoder decoder) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                        P0 p02 = null;
                        boolean z12 = true;
                        int i12 = 0;
                        Object objF = null;
                        while (z12) {
                            int iJ2 = cVarC.j(f332717a);
                            if (iJ2 == -1) {
                                z12 = false;
                            } else {
                                if (iJ2 != 0) {
                                    throw new UnknownFieldException(iJ2);
                                }
                                objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                                i12 = 1;
                            }
                        }
                        cVarC.d(f332717a);
                        return new c(i12, (String) objF, p02);
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{L51.a.a(V0.f412822a)};
                    }

                    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                    @Y61.k
                    /* renamed from: getDescriptor */
                    public SerialDescriptor getF332717a() {
                        return f432969b;
                    }

                    @Override // kotlinx.serialization.internal.N
                    @Y61.k
                    public KSerializer<?>[] typeParametersSerializers() {
                        return G0.f412773a;
                    }

                    @Override // kotlinx.serialization.x
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                        SerialDescriptor f332717a = getF332717a();
                        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                        c.a(value, dVarC, f332717a);
                        dVarC.d(f332717a);
                    }
                }

                /* compiled from: CBRMessage.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$p$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$p$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @Y61.k
                    public final KSerializer<c> serializer() {
                        return a.f432968a;
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this((String) null, 1, (C42822w) (0 == true ? 1 : 0));
                }

                @X41.n
                public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                    if (!output.u() && self.idDocSetType == null) {
                        return;
                    }
                    output.p(serialDesc, 0, V0.f412822a, self.idDocSetType);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && L.f(this.idDocSetType, ((c) other).idDocSetType);
                }

                public int hashCode() {
                    String str = this.idDocSetType;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Y61.k
                public String toString() {
                    return C22026a.c(new StringBuilder("Payload(idDocSetType="), this.idDocSetType, ')');
                }

                @InterfaceC42830m
                public /* synthetic */ c(int i12, @v String str, P0 p02) {
                    if ((i12 & 1) == 0) {
                        this.idDocSetType = null;
                    } else {
                        this.idDocSetType = str;
                    }
                }

                public c(@Y61.l String str) {
                    this.idDocSetType = str;
                }

                public /* synthetic */ c(String str, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public p() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k p self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.payload == null) {
                    return;
                }
                output.p(serialDesc, 1, c.a.f432968a, self.payload);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof p) && L.f(this.payload, ((p) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @Y61.k
            public String toString() {
                return "StepChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ p(int i12, @v Type type, c cVar, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432965a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ p(c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar);
            }

            public p(@Y61.l c cVar) {
                super(Type.STEP_CHANGE);
                this.payload = cVar;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u0013\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "", "messageType", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final /* data */ class q extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String messageType;

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.Unknown.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<q> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432971a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432972b;

                static {
                    a aVar = new a();
                    f432971a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.Unknown", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    pluginGeneratedSerialDescriptor.j("messageType", true);
                    f432972b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public q deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    Object objF = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else if (iJ2 == 0) {
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 |= 1;
                        } else {
                            if (iJ2 != 1) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objF = cVarC.f(f332717a, 1, V0.f412822a, objF);
                            i12 |= 2;
                        }
                    }
                    cVarC.d(f332717a);
                    return new q(i12, (Type) objV, (String) objF, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a, L51.a.a(V0.f412822a)};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432972b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k q value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    q.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$q;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$q$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<q> serializer() {
                    return a.f432971a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public q() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @X41.n
            public static final void a(@Y61.k q self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.u() && self.messageType == null) {
                    return;
                }
                output.p(serialDesc, 1, V0.f412822a, self.messageType);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof q) && L.f(this.messageType, ((q) other).messageType);
            }

            public int hashCode() {
                String str = this.messageType;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public String toString() {
                return C22026a.c(new StringBuilder("Unknown(messageType="), this.messageType, ')');
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ q(int i12, @v Type type, String str, P0 p02) {
                super(i12, type, p02);
                if (1 != (i12 & 1)) {
                    E0.b(i12, 1, a.f432971a.getF332717a());
                    throw null;
                }
                if ((i12 & 2) == 0) {
                    this.messageType = null;
                } else {
                    this.messageType = str;
                }
            }

            public /* synthetic */ q(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str);
            }

            public q(@Y61.l String str) {
                super(Type.UNKNOWN);
                this.messageType = str;
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class r extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.UpdateRequiredIdDocs.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<r> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432973a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432974b;

                static {
                    a aVar = new a();
                    f432973a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.UpdateRequiredIdDocs", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432974b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public r deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new r(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432974b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k r value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    r.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$r;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$r$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<r> serializer() {
                    return a.f432973a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ r(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432973a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k r self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public r() {
                super(Type.UPDATE_REQUIRED_ID_DOCS);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class s extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.VerifyMobilePhoneTan.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<s> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432975a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432976b;

                static {
                    a aVar = new a();
                    f432975a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.VerifyMobilePhoneTan", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432976b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public s deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new s(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432976b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k s value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    s.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$s;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$s$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<s> serializer() {
                    return a.f432975a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ s(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432975a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k s self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public s() {
                super(Type.VERIFY_MOBILE_PHONE_TAN);
            }
        }

        /* compiled from: CBRMessage.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;", "type", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$Type;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @w
        public static final class t extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            @Y61.k
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/CBRMessage.ServerMessage.Welcome.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC42830m
            public static final class a implements N<t> {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f432977a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ SerialDescriptor f432978b;

                static {
                    a aVar = new a();
                    f432977a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.Welcome", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("type", false);
                    f432978b = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public t deserialize(@Y61.k Decoder decoder) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                    P0 p02 = null;
                    boolean z12 = true;
                    int i12 = 0;
                    Object objV = null;
                    while (z12) {
                        int iJ2 = cVarC.j(f332717a);
                        if (iJ2 == -1) {
                            z12 = false;
                        } else {
                            if (iJ2 != 0) {
                                throw new UnknownFieldException(iJ2);
                            }
                            objV = cVarC.v(f332717a, 0, Type.a.f432894a, objV);
                            i12 = 1;
                        }
                    }
                    cVarC.d(f332717a);
                    return new t(i12, (Type) objV, p02);
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{Type.a.f432894a};
                }

                @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
                @Y61.k
                /* renamed from: getDescriptor */
                public SerialDescriptor getF332717a() {
                    return f432978b;
                }

                @Override // kotlinx.serialization.internal.N
                @Y61.k
                public KSerializer<?>[] typeParametersSerializers() {
                    return G0.f412773a;
                }

                @Override // kotlinx.serialization.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(@Y61.k Encoder encoder, @Y61.k t value) {
                    SerialDescriptor f332717a = getF332717a();
                    kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                    t.a(value, dVarC, f332717a);
                    dVarC.d(f332717a);
                }
            }

            /* compiled from: CBRMessage.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage$t;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$t$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public final KSerializer<t> serializer() {
                    return a.f432977a;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @InterfaceC42830m
            public /* synthetic */ t(int i12, @v Type type, P0 p02) {
                super(i12, type, p02);
                if (1 == (i12 & 1)) {
                } else {
                    E0.b(i12, 1, a.f432977a.getF332717a());
                    throw null;
                }
            }

            @X41.n
            public static final void a(@Y61.k t self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public t() {
                super(Type.WELCOME);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @InterfaceC42830m
        public /* synthetic */ ServerMessage(int i12, @v Type type, P0 p02) {
            C42822w c42822w = null;
            if (1 != (i12 & 1)) {
                E0.b(i12, 1, a.f432896a.getF332717a());
                throw null;
            }
            super(c42822w);
            this.type = type;
        }

        @X41.n
        public static final void a(@Y61.k ServerMessage self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            output.F(serialDesc, 0, Type.a.f432894a, self.type);
        }

        public ServerMessage(@Y61.k Type type) {
            super(null);
            this.type = type;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Type getType() {
            return this.type;
        }
    }

    public /* synthetic */ CBRMessage(C42822w c42822w) {
        this();
    }

    private CBRMessage() {
    }
}
