package gc1;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import gc1.C40657a;
import gc1.C40660d;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.Y;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b7\b\u0081\b\u0018\u0000 U2\u00020\u0001:\u0002-#B\u0083\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dB\u0097\u0002\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b6\u0010&\u001a\u0004\b4\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010&\u001a\u0004\b8\u00109R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u0012\u0004\b<\u0010&\u001a\u0004\b;\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b>\u0010&\u001a\u0004\b=\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u0012\u0004\b@\u0010&\u001a\u0004\b?\u0010$R\"\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00107\u0012\u0004\bB\u0010&\u001a\u0004\bA\u00109R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\bD\u0010&\u001a\u0004\bC\u0010$R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\bF\u0010&\u001a\u0004\bE\u0010$R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\bH\u0010&\u001a\u0004\bG\u0010+R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\bJ\u0010&\u001a\u0004\bI\u0010$R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010K\u0012\u0004\bN\u0010&\u001a\u0004\bL\u0010MR\"\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00103\u0012\u0004\bP\u0010&\u001a\u0004\bO\u00105R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u0012\u0004\bR\u0010&\u001a\u0004\bQ\u0010$R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u0012\u0004\bT\u0010&\u001a\u0004\bS\u0010$¨\u0006V"}, d2 = {"Lgc1/c;", "", "", "buttonTitle", "title", "", "Lgc1/d;", "widgets", "badge", "initials", "icon", "", "iconSize", "Lgc1/a;", "valueClick", "value", "description", "titleIcon", "click", "valueCurrency", "currency", "logos", "divider", "", "isPaint", "space", "elementName", "widgetName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lgc1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc1/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lgc1/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc1/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getButtonTitle$annotations", "()V", "m", "getTitle$annotations", "Ljava/util/List;", "s", "()Ljava/util/List;", "getWidgets$annotations", "a", "getBadge$annotations", "j", "getInitials$annotations", "h", "getIcon$annotations", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "getIconSize$annotations", "Lgc1/a;", "p", "()Lgc1/a;", "getValueClick$annotations", "o", "getValue$annotations", "e", "getDescription$annotations", "n", "getTitleIcon$annotations", "c", "getClick$annotations", "q", "getValueCurrency$annotations", "d", "getCurrency$annotations", "k", "getLogos$annotations", "f", "getDivider$annotations", "Ljava/lang/Boolean;", "t", "()Ljava/lang/Boolean;", "isPaint$annotations", "l", "getSpace$annotations", "g", "getElementName$annotations", "r", "getWidgetName$annotations", "Companion", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* renamed from: gc1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C40659c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final KSerializer<Object>[] f396629a = {null, null, new C43401f(C40660d.a.f396632a), null, null, null, null, null, null, null, null, null, null, null, new C43401f(V0.f412822a), null, null, null, null, null};

    @com.google.gson.annotations.c("badge")
    @l
    private final String badge;

    @com.google.gson.annotations.c("buttonTitle")
    @l
    private final String buttonTitle;

    @com.google.gson.annotations.c("click")
    @l
    private final C40657a click;

    @com.google.gson.annotations.c("currency")
    @l
    private final String currency;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("divider")
    @l
    private final String divider;

    @com.google.gson.annotations.c("elementName")
    @l
    private final String elementName;

    @com.google.gson.annotations.c("icon")
    @l
    private final String icon;

    @com.google.gson.annotations.c("iconSize")
    @l
    private final Integer iconSize;

    @com.google.gson.annotations.c("initials")
    @l
    private final String initials;

    @com.google.gson.annotations.c("isPaint")
    @l
    private final Boolean isPaint;

    @com.google.gson.annotations.c("logos")
    @l
    private final List<String> logos;

    @com.google.gson.annotations.c("space")
    @l
    private final Integer space;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("titleIcon")
    @l
    private final String titleIcon;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    @com.google.gson.annotations.c("valueClick")
    @l
    private final C40657a valueClick;

    @com.google.gson.annotations.c("valueCurrency")
    @l
    private final String valueCurrency;

    @com.google.gson.annotations.c("widgetName")
    @l
    private final String widgetName;

    @com.google.gson.annotations.c("widgets")
    @l
    private final List<C40660d> widgets;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/ui/models/root/ELKDataResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lgc1/c;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: gc1.c$a */
    public static final class a implements N<C40659c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396630a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f396631b;

        static {
            a aVar = new a();
            f396630a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.ui.models.root.ELKDataResponse", aVar, 20);
            pluginGeneratedSerialDescriptor.j("buttonTitle", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("widgets", true);
            pluginGeneratedSerialDescriptor.j("badge", true);
            pluginGeneratedSerialDescriptor.j("initials", true);
            pluginGeneratedSerialDescriptor.j("icon", true);
            pluginGeneratedSerialDescriptor.j("iconSize", true);
            pluginGeneratedSerialDescriptor.j("valueClick", true);
            pluginGeneratedSerialDescriptor.j("value", true);
            pluginGeneratedSerialDescriptor.j("description", true);
            pluginGeneratedSerialDescriptor.j("titleIcon", true);
            pluginGeneratedSerialDescriptor.j("click", true);
            pluginGeneratedSerialDescriptor.j("valueCurrency", true);
            pluginGeneratedSerialDescriptor.j("currency", true);
            pluginGeneratedSerialDescriptor.j("logos", true);
            pluginGeneratedSerialDescriptor.j("divider", true);
            pluginGeneratedSerialDescriptor.j("isPaint", true);
            pluginGeneratedSerialDescriptor.j("space", true);
            pluginGeneratedSerialDescriptor.j("elementName", true);
            pluginGeneratedSerialDescriptor.j("widgetName", true);
            f396631b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            KSerializer<Object>[] kSerializerArr = C40659c.f396629a;
            V0 v02 = V0.f412822a;
            KSerializer<?> kSerializerA = L51.a.a(v02);
            KSerializer<?> kSerializerA2 = L51.a.a(v02);
            KSerializer<?> kSerializerA3 = L51.a.a(kSerializerArr[2]);
            KSerializer<?> kSerializerA4 = L51.a.a(v02);
            KSerializer<?> kSerializerA5 = L51.a.a(v02);
            KSerializer<?> kSerializerA6 = L51.a.a(v02);
            Y y12 = Y.f412835a;
            KSerializer<?> kSerializerA7 = L51.a.a(y12);
            C40657a.C11211a c11211a = C40657a.C11211a.f396500a;
            return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, kSerializerA5, kSerializerA6, kSerializerA7, L51.a.a(c11211a), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(c11211a), L51.a.a(v02), L51.a.a(v02), L51.a.a(kSerializerArr[14]), L51.a.a(v02), L51.a.a(C43407i.f412866a), L51.a.a(y12), L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            KSerializer<Object>[] kSerializerArr;
            C40657a c40657a;
            int i12;
            String str;
            String str2;
            Integer num;
            Integer num2;
            String str3;
            String str4;
            C40657a c40657a2;
            int i13;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396631b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr2 = C40659c.f396629a;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            C40657a c40657a3 = null;
            String str9 = null;
            String str10 = null;
            List list = null;
            String str11 = null;
            Boolean bool = null;
            Integer num3 = null;
            String str12 = null;
            C40657a c40657a4 = null;
            String str13 = null;
            String str14 = null;
            List list2 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            Integer num4 = null;
            int i14 = 0;
            boolean z12 = true;
            while (z12) {
                C40657a c40657a5 = c40657a4;
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                String str18 = str8;
                switch (iJ2) {
                    case -1:
                        c40657a4 = c40657a5;
                        String str19 = str12;
                        z12 = false;
                        str10 = str10;
                        str8 = str18;
                        c40657a3 = c40657a3;
                        str17 = str17;
                        num3 = num3;
                        num4 = num4;
                        str12 = str19;
                        str13 = str13;
                        list = list;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        c40657a4 = c40657a5;
                        String str20 = str12;
                        list = list;
                        c40657a = c40657a3;
                        str11 = str11;
                        str13 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str13);
                        str9 = str9;
                        str18 = str18;
                        str16 = str16;
                        str17 = str17;
                        num3 = num3;
                        i12 = 1;
                        num4 = num4;
                        str12 = str20;
                        str = str14;
                        str10 = str10;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        c40657a4 = c40657a5;
                        str2 = str12;
                        num = num4;
                        String str21 = str16;
                        str10 = str10;
                        c40657a = c40657a3;
                        str11 = str11;
                        str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str14);
                        str9 = str9;
                        str18 = str18;
                        str16 = str21;
                        str17 = str17;
                        num3 = num3;
                        i12 = 2;
                        num4 = num;
                        str12 = str2;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 2:
                        c40657a4 = c40657a5;
                        str2 = str12;
                        num = num4;
                        num2 = num3;
                        str3 = str17;
                        kSerializerArr = kSerializerArr2;
                        list2 = (List) cVarC.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr2[2], list2);
                        str = str14;
                        str9 = str9;
                        c40657a = c40657a3;
                        str11 = str11;
                        str16 = str16;
                        str18 = str18;
                        i12 = 4;
                        str17 = str3;
                        num3 = num2;
                        num4 = num;
                        str12 = str2;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 3:
                        c40657a4 = c40657a5;
                        str2 = str12;
                        num = num4;
                        num2 = num3;
                        str3 = str17;
                        kSerializerArr = kSerializerArr2;
                        str15 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str15);
                        str = str14;
                        str9 = str9;
                        c40657a = c40657a3;
                        str11 = str11;
                        str16 = str16;
                        str18 = str18;
                        i12 = 8;
                        str17 = str3;
                        num3 = num2;
                        num4 = num;
                        str12 = str2;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 4:
                        c40657a4 = c40657a5;
                        str2 = str12;
                        num = num4;
                        num2 = num3;
                        str3 = str17;
                        kSerializerArr = kSerializerArr2;
                        str = str14;
                        str9 = str9;
                        c40657a = c40657a3;
                        str16 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str16);
                        str18 = str18;
                        i12 = 16;
                        str17 = str3;
                        num3 = num2;
                        num4 = num;
                        str12 = str2;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 5:
                        c40657a4 = c40657a5;
                        str4 = str18;
                        c40657a2 = c40657a3;
                        String str22 = str12;
                        str17 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str17);
                        i12 = 32;
                        str = str14;
                        num3 = num3;
                        num4 = num4;
                        str12 = str22;
                        String str23 = str4;
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a2;
                        str18 = str23;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 6:
                        c40657a4 = c40657a5;
                        str4 = str18;
                        c40657a2 = c40657a3;
                        num4 = (Integer) cVarC.f(pluginGeneratedSerialDescriptor, 6, Y.f412835a, num4);
                        i12 = 64;
                        str = str14;
                        str12 = str12;
                        String str232 = str4;
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a2;
                        str18 = str232;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 7:
                        c40657a2 = c40657a3;
                        str4 = str18;
                        c40657a4 = (C40657a) cVarC.f(pluginGeneratedSerialDescriptor, 7, C40657a.C11211a.f396500a, c40657a5);
                        i12 = 128;
                        str = str14;
                        String str2322 = str4;
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a2;
                        str18 = str2322;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 8:
                        kSerializerArr = kSerializerArr2;
                        str = str14;
                        c40657a4 = c40657a5;
                        c40657a = c40657a3;
                        str18 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str18);
                        i12 = 256;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 9:
                        str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str6);
                        i12 = 512;
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 10:
                        str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 10, V0.f412822a, str7);
                        i12 = 1024;
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 11:
                        kSerializerArr = kSerializerArr2;
                        c40657a = (C40657a) cVarC.f(pluginGeneratedSerialDescriptor, 11, C40657a.C11211a.f396500a, c40657a3);
                        i12 = 2048;
                        str = str14;
                        c40657a4 = c40657a5;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 12:
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 4096;
                        str9 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 12, V0.f412822a, str9);
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 13:
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 8192;
                        str10 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 13, V0.f412822a, str10);
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 14:
                        List list3 = (List) cVarC.f(pluginGeneratedSerialDescriptor, 14, kSerializerArr2[14], list);
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 16384;
                        list = list3;
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 15:
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 32768;
                        str11 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 15, V0.f412822a, str11);
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 16:
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 65536;
                        bool = (Boolean) cVarC.f(pluginGeneratedSerialDescriptor, 16, C43407i.f412866a, bool);
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 17:
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 131072;
                        num3 = (Integer) cVarC.f(pluginGeneratedSerialDescriptor, 17, Y.f412835a, num3);
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 18:
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i13 = 262144;
                        str12 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 18, V0.f412822a, str12);
                        i12 = i13;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    case 19:
                        str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 19, V0.f412822a, str5);
                        i12 = 524288;
                        kSerializerArr = kSerializerArr2;
                        c40657a = c40657a3;
                        str = str14;
                        c40657a4 = c40657a5;
                        i14 |= i12;
                        c40657a3 = c40657a;
                        str14 = str;
                        str8 = str18;
                        kSerializerArr2 = kSerializerArr;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            String str24 = str10;
            String str25 = str11;
            String str26 = str12;
            String str27 = str14;
            List list4 = list2;
            String str28 = str15;
            Integer num5 = num4;
            Integer num6 = num3;
            String str29 = str17;
            String str30 = str8;
            String str31 = str16;
            String str32 = str13;
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new C40659c(i14, str32, str27, list4, str28, str31, str29, num5, c40657a4, str30, str6, str7, c40657a3, str9, str24, list, str25, bool, num6, str26, str5, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f396631b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396631b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            C40659c.u((C40659c) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc1/c$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lgc1/c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc1.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<C40659c> serializer() {
            return a.f396630a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public C40659c() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (Integer) null, (C40657a) null, (String) null, (String) null, (String) null, (C40657a) null, (String) null, (String) null, (List) null, (String) null, (Boolean) null, (Integer) null, (String) null, (String) null, 1048575, (C42822w) null);
    }

    @n
    public static final /* synthetic */ void u(C40659c c40659c, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (dVar.u() || c40659c.buttonTitle != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, c40659c.buttonTitle);
        }
        if (dVar.u() || c40659c.title != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, c40659c.title);
        }
        boolean zU2 = dVar.u();
        KSerializer<Object>[] kSerializerArr = f396629a;
        if (zU2 || c40659c.widgets != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], c40659c.widgets);
        }
        if (dVar.u() || c40659c.badge != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, c40659c.badge);
        }
        if (dVar.u() || c40659c.initials != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, c40659c.initials);
        }
        if (dVar.u() || c40659c.icon != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, c40659c.icon);
        }
        if (dVar.u() || c40659c.iconSize != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 6, Y.f412835a, c40659c.iconSize);
        }
        if (dVar.u() || c40659c.valueClick != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 7, C40657a.C11211a.f396500a, c40659c.valueClick);
        }
        if (dVar.u() || c40659c.value != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, c40659c.value);
        }
        if (dVar.u() || c40659c.description != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, c40659c.description);
        }
        if (dVar.u() || c40659c.titleIcon != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 10, V0.f412822a, c40659c.titleIcon);
        }
        if (dVar.u() || c40659c.click != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 11, C40657a.C11211a.f396500a, c40659c.click);
        }
        if (dVar.u() || c40659c.valueCurrency != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 12, V0.f412822a, c40659c.valueCurrency);
        }
        if (dVar.u() || c40659c.currency != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 13, V0.f412822a, c40659c.currency);
        }
        if (dVar.u() || c40659c.logos != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 14, kSerializerArr[14], c40659c.logos);
        }
        if (dVar.u() || c40659c.divider != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 15, V0.f412822a, c40659c.divider);
        }
        if (dVar.u() || c40659c.isPaint != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 16, C43407i.f412866a, c40659c.isPaint);
        }
        if (dVar.u() || c40659c.space != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 17, Y.f412835a, c40659c.space);
        }
        if (dVar.u() || c40659c.elementName != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 18, V0.f412822a, c40659c.elementName);
        }
        if (!dVar.u() && c40659c.widgetName == null) {
            return;
        }
        dVar.p(pluginGeneratedSerialDescriptor, 19, V0.f412822a, c40659c.widgetName);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C40657a getClick() {
        return this.click;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40659c)) {
            return false;
        }
        C40659c c40659c = (C40659c) obj;
        return L.f(this.buttonTitle, c40659c.buttonTitle) && L.f(this.title, c40659c.title) && L.f(this.widgets, c40659c.widgets) && L.f(this.badge, c40659c.badge) && L.f(this.initials, c40659c.initials) && L.f(this.icon, c40659c.icon) && L.f(this.iconSize, c40659c.iconSize) && L.f(this.valueClick, c40659c.valueClick) && L.f(this.value, c40659c.value) && L.f(this.description, c40659c.description) && L.f(this.titleIcon, c40659c.titleIcon) && L.f(this.click, c40659c.click) && L.f(this.valueCurrency, c40659c.valueCurrency) && L.f(this.currency, c40659c.currency) && L.f(this.logos, c40659c.logos) && L.f(this.divider, c40659c.divider) && L.f(this.isPaint, c40659c.isPaint) && L.f(this.space, c40659c.space) && L.f(this.elementName, c40659c.elementName) && L.f(this.widgetName, c40659c.widgetName);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getDivider() {
        return this.divider;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getElementName() {
        return this.elementName;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final int hashCode() {
        String str = this.buttonTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<C40660d> list = this.widgets;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.badge;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.initials;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.iconSize;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        C40657a c40657a = this.valueClick;
        int iHashCode8 = (iHashCode7 + (c40657a == null ? 0 : c40657a.hashCode())) * 31;
        String str6 = this.value;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.titleIcon;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C40657a c40657a2 = this.click;
        int iHashCode12 = (iHashCode11 + (c40657a2 == null ? 0 : c40657a2.hashCode())) * 31;
        String str9 = this.valueCurrency;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currency;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list2 = this.logos;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str11 = this.divider;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.isPaint;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.space;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.elementName;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.widgetName;
        return iHashCode19 + (str13 != null ? str13.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Integer getIconSize() {
        return this.iconSize;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    @l
    public final List<String> k() {
        return this.logos;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final Integer getSpace() {
        return this.space;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    @l
    /* renamed from: o, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final C40657a getValueClick() {
        return this.valueClick;
    }

    @l
    /* renamed from: q, reason: from getter */
    public final String getValueCurrency() {
        return this.valueCurrency;
    }

    @l
    /* renamed from: r, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    public final List<C40660d> s() {
        return this.widgets;
    }

    @l
    /* renamed from: t, reason: from getter */
    public final Boolean getIsPaint() {
        return this.isPaint;
    }

    @k
    public final String toString() {
        String str = this.buttonTitle;
        String str2 = this.title;
        List<C40660d> list = this.widgets;
        String str3 = this.badge;
        String str4 = this.initials;
        String str5 = this.icon;
        Integer num = this.iconSize;
        C40657a c40657a = this.valueClick;
        String str6 = this.value;
        String str7 = this.description;
        String str8 = this.titleIcon;
        C40657a c40657a2 = this.click;
        String str9 = this.valueCurrency;
        String str10 = this.currency;
        List<String> list2 = this.logos;
        String str11 = this.divider;
        Boolean bool = this.isPaint;
        Integer num2 = this.space;
        String str12 = this.elementName;
        String str13 = this.widgetName;
        StringBuilder sbB = C23088b.b("ELKDataResponse(buttonTitle=", str, ", title=", str2, ", widgets=");
        sbB.append(list);
        sbB.append(", badge=");
        sbB.append(str3);
        sbB.append(", initials=");
        m.p(sbB, str4, ", icon=", str5, ", iconSize=");
        sbB.append(num);
        sbB.append(", valueClick=");
        sbB.append(c40657a);
        sbB.append(", value=");
        m.p(sbB, str6, ", description=", str7, ", titleIcon=");
        sbB.append(str8);
        sbB.append(", click=");
        sbB.append(c40657a2);
        sbB.append(", valueCurrency=");
        m.p(sbB, str9, ", currency=", str10, ", logos=");
        sbB.append(list2);
        sbB.append(", divider=");
        sbB.append(str11);
        sbB.append(", isPaint=");
        sbB.append(bool);
        sbB.append(", space=");
        sbB.append(num2);
        sbB.append(", elementName=");
        return G.h(sbB, str12, ", widgetName=", str13, ")");
    }

    @InterfaceC42830m
    public /* synthetic */ C40659c(int i12, @v String str, @v String str2, @v List list, @v String str3, @v String str4, @v String str5, @v Integer num, @v C40657a c40657a, @v String str6, @v String str7, @v String str8, @v C40657a c40657a2, @v String str9, @v String str10, @v List list2, @v String str11, @v Boolean bool, @v Integer num2, @v String str12, @v String str13, P0 p02) {
        if ((i12 & 1) == 0) {
            this.buttonTitle = null;
        } else {
            this.buttonTitle = str;
        }
        if ((i12 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i12 & 4) == 0) {
            this.widgets = null;
        } else {
            this.widgets = list;
        }
        if ((i12 & 8) == 0) {
            this.badge = null;
        } else {
            this.badge = str3;
        }
        if ((i12 & 16) == 0) {
            this.initials = null;
        } else {
            this.initials = str4;
        }
        if ((i12 & 32) == 0) {
            this.icon = null;
        } else {
            this.icon = str5;
        }
        if ((i12 & 64) == 0) {
            this.iconSize = null;
        } else {
            this.iconSize = num;
        }
        if ((i12 & 128) == 0) {
            this.valueClick = null;
        } else {
            this.valueClick = c40657a;
        }
        if ((i12 & 256) == 0) {
            this.value = null;
        } else {
            this.value = str6;
        }
        if ((i12 & 512) == 0) {
            this.description = null;
        } else {
            this.description = str7;
        }
        if ((i12 & 1024) == 0) {
            this.titleIcon = null;
        } else {
            this.titleIcon = str8;
        }
        if ((i12 & 2048) == 0) {
            this.click = null;
        } else {
            this.click = c40657a2;
        }
        if ((i12 & 4096) == 0) {
            this.valueCurrency = null;
        } else {
            this.valueCurrency = str9;
        }
        if ((i12 & 8192) == 0) {
            this.currency = null;
        } else {
            this.currency = str10;
        }
        if ((i12 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.logos = null;
        } else {
            this.logos = list2;
        }
        if ((32768 & i12) == 0) {
            this.divider = null;
        } else {
            this.divider = str11;
        }
        if ((65536 & i12) == 0) {
            this.isPaint = null;
        } else {
            this.isPaint = bool;
        }
        if ((131072 & i12) == 0) {
            this.space = null;
        } else {
            this.space = num2;
        }
        if ((262144 & i12) == 0) {
            this.elementName = null;
        } else {
            this.elementName = str12;
        }
        if ((i12 & 524288) == 0) {
            this.widgetName = null;
        } else {
            this.widgetName = str13;
        }
    }

    public C40659c(@l String str, @l String str2, @l List<C40660d> list, @l String str3, @l String str4, @l String str5, @l Integer num, @l C40657a c40657a, @l String str6, @l String str7, @l String str8, @l C40657a c40657a2, @l String str9, @l String str10, @l List<String> list2, @l String str11, @l Boolean bool, @l Integer num2, @l String str12, @l String str13) {
        this.buttonTitle = str;
        this.title = str2;
        this.widgets = list;
        this.badge = str3;
        this.initials = str4;
        this.icon = str5;
        this.iconSize = num;
        this.valueClick = c40657a;
        this.value = str6;
        this.description = str7;
        this.titleIcon = str8;
        this.click = c40657a2;
        this.valueCurrency = str9;
        this.currency = str10;
        this.logos = list2;
        this.divider = str11;
        this.isPaint = bool;
        this.space = num2;
        this.elementName = str12;
        this.widgetName = str13;
    }

    public /* synthetic */ C40659c(String str, String str2, List list, String str3, String str4, String str5, Integer num, C40657a c40657a, String str6, String str7, String str8, C40657a c40657a2, String str9, String str10, List list2, String str11, Boolean bool, Integer num2, String str12, String str13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : c40657a, (i12 & 256) != 0 ? null : str6, (i12 & 512) != 0 ? null : str7, (i12 & 1024) != 0 ? null : str8, (i12 & 2048) != 0 ? null : c40657a2, (i12 & 4096) != 0 ? null : str9, (i12 & 8192) != 0 ? null : str10, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list2, (i12 & 32768) != 0 ? null : str11, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : bool, (i12 & 131072) != 0 ? null : num2, (i12 & 262144) != 0 ? null : str12, (i12 & 524288) != 0 ? null : str13);
    }
}
