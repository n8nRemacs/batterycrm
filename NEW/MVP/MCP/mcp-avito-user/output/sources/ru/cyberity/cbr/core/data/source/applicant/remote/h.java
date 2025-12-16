package ru.cyberity.cbr.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;

/* compiled from: QuestionnaireResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002\u00161By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B\u008d\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J(\u0010\u0016\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÇ\u0001¢\u0006\u0004\b\u0016\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010-\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010-\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00100\u001a\u0004\b<\u0010=R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010-\u0012\u0004\bA\u00100\u001a\u0004\b@\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010-\u0012\u0004\bD\u00100\u001a\u0004\bC\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010-\u0012\u0004\bG\u00100\u001a\u0004\bF\u0010\u0019R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u00100\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Landroid/os/Parcelable;", "", "id", "title", "desc", "type", "", "required", "format", ChannelContext.Item.PLACEHOLDER, "condition", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/o;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "p", "getId$annotations", "()V", "b", "x", "getTitle$annotations", "c", "l", "getDesc$annotations", "d", "z", "getType$annotations", "e", "Ljava/lang/Boolean;", "v", "()Ljava/lang/Boolean;", "getRequired$annotations", "f", "n", "getFormat$annotations", "g", "t", "getPlaceholder$annotations", "h", "j", "getCondition$annotations", "i", "Ljava/util/List;", "r", "()Ljava/util/List;", "getOptions$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class h implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String desc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Boolean required;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String format;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String placeholder;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String condition;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<o> options;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<h> CREATOR = new c();

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/Item.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/h;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<h> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433525a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433526b;

        static {
            a aVar = new a();
            f433525a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.Item", aVar, 9);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("desc", true);
            pluginGeneratedSerialDescriptor.j("type", true);
            pluginGeneratedSerialDescriptor.j("required", true);
            pluginGeneratedSerialDescriptor.j("format", true);
            pluginGeneratedSerialDescriptor.j(ChannelContext.Item.PLACEHOLDER, true);
            pluginGeneratedSerialDescriptor.j("condition", true);
            pluginGeneratedSerialDescriptor.j("options", true);
            f433526b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f331553a = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f331553a);
            Object objF = null;
            boolean z12 = true;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            Object objF7 = null;
            Object objF8 = null;
            Object objF9 = null;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(f331553a);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        objF = cVarC.f(f331553a, 0, V0.f412822a, objF);
                        i12 |= 1;
                        break;
                    case 1:
                        objF2 = cVarC.f(f331553a, 1, V0.f412822a, objF2);
                        i12 |= 2;
                        break;
                    case 2:
                        objF3 = cVarC.f(f331553a, 2, V0.f412822a, objF3);
                        i12 |= 4;
                        break;
                    case 3:
                        objF4 = cVarC.f(f331553a, 3, V0.f412822a, objF4);
                        i12 |= 8;
                        break;
                    case 4:
                        objF5 = cVarC.f(f331553a, 4, C43407i.f412866a, objF5);
                        i12 |= 16;
                        break;
                    case 5:
                        objF6 = cVarC.f(f331553a, 5, V0.f412822a, objF6);
                        i12 |= 32;
                        break;
                    case 6:
                        objF7 = cVarC.f(f331553a, 6, V0.f412822a, objF7);
                        i12 |= 64;
                        break;
                    case 7:
                        objF8 = cVarC.f(f331553a, 7, V0.f412822a, objF8);
                        i12 |= 128;
                        break;
                    case 8:
                        objF9 = cVarC.f(f331553a, 8, new C43401f(o.a.f433548a), objF9);
                        i12 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f331553a);
            return new h(i12, (String) objF, (String) objF2, (String) objF3, (String) objF4, (Boolean) objF5, (String) objF6, (String) objF7, (String) objF8, (List) objF9, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(C43407i.f412866a), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(new C43401f(o.a.f433548a))};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433526b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k h value) {
            SerialDescriptor f331553a = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f331553a);
            h.a(value, dVarC, f331553a);
            dVarC.d(f331553a);
        }
    }

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/h$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<h> serializer() {
            return a.f433525a;
        }

        private Companion() {
        }
    }

    public h() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 511, (C42822w) null);
    }

    @Y61.k
    public final h a(@Y61.l String id2, @Y61.l String title, @Y61.l String desc, @Y61.l String type, @Y61.l Boolean required, @Y61.l String format, @Y61.l String placeholder, @Y61.l String condition, @Y61.l List<o> options) {
        return new h(id2, title, desc, type, required, format, placeholder, condition, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return L.f(this.id, hVar.id) && L.f(this.title, hVar.title) && L.f(this.desc, hVar.desc) && L.f(this.type, hVar.type) && L.f(this.required, hVar.required) && L.f(this.format, hVar.format) && L.f(this.placeholder, hVar.placeholder) && L.f(this.condition, hVar.condition) && L.f(this.options, hVar.options);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.format;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.placeholder;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.condition;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<o> list = this.options;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<o> r() {
        return this.options;
    }

    @Y61.l
    /* renamed from: t, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Item(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", desc=");
        sb2.append(this.desc);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", format=");
        sb2.append(this.format);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Y61.l
    /* renamed from: v, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        parcel.writeString(this.type);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.format);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.condition);
        List<o> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((o) itA.next()).writeToParcel(parcel, flags);
        }
    }

    @Y61.l
    /* renamed from: x, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: z, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @InterfaceC42830m
    public h(int i12, @kotlinx.serialization.v String str, @kotlinx.serialization.v String str2, @kotlinx.serialization.v String str3, @kotlinx.serialization.v String str4, @kotlinx.serialization.v Boolean bool, @kotlinx.serialization.v String str5, @kotlinx.serialization.v String str6, @kotlinx.serialization.v String str7, @kotlinx.serialization.v List list, P0 p02) {
        if ((i12 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i12 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i12 & 4) == 0) {
            this.desc = null;
        } else {
            this.desc = str3;
        }
        if ((i12 & 8) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        if ((i12 & 16) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
        if ((i12 & 32) == 0) {
            this.format = null;
        } else {
            this.format = str5;
        }
        if ((i12 & 64) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str6;
        }
        if ((i12 & 128) == 0) {
            this.condition = null;
        } else {
            this.condition = str7;
        }
        if ((i12 & 256) == 0) {
            this.options = C42784z0.f406748b;
        } else {
            this.options = list;
        }
    }

    @X41.n
    public static final void a(@Y61.k h self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.id != null) {
            output.p(serialDesc, 0, V0.f412822a, self.id);
        }
        if (output.u() || self.title != null) {
            output.p(serialDesc, 1, V0.f412822a, self.title);
        }
        if (output.u() || self.desc != null) {
            output.p(serialDesc, 2, V0.f412822a, self.desc);
        }
        if (output.u() || self.type != null) {
            output.p(serialDesc, 3, V0.f412822a, self.type);
        }
        if (output.u() || self.required != null) {
            output.p(serialDesc, 4, C43407i.f412866a, self.required);
        }
        if (output.u() || self.format != null) {
            output.p(serialDesc, 5, V0.f412822a, self.format);
        }
        if (output.u() || self.placeholder != null) {
            output.p(serialDesc, 6, V0.f412822a, self.placeholder);
        }
        if (output.u() || self.condition != null) {
            output.p(serialDesc, 7, V0.f412822a, self.condition);
        }
        if (!output.u() && L.f(self.options, C42784z0.f406748b)) {
            return;
        }
        output.p(serialDesc, 8, new C43401f(o.a.f433548a), self.options);
    }

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h createFromParcel(@Y61.k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(o.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new h(string, string2, string3, string4, boolValueOf, string5, string6, string7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h[] newArray(int i12) {
            return new h[i12];
        }
    }

    public h(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Boolean bool, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l List<o> list) {
        this.id = str;
        this.title = str2;
        this.desc = str3;
        this.type = str4;
        this.required = bool;
        this.format = str5;
        this.placeholder = str6;
        this.condition = str7;
        this.options = list;
    }

    public h(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) == 0 ? str7 : null, (i12 & 256) != 0 ? C42784z0.f406748b : list);
    }
}
