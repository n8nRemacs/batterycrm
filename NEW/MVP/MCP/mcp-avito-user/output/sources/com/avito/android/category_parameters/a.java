package com.avito.android.category_parameters;

import JO.m;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Entity;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AttributedDescription;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ChildrenAgesGroup;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.DateTimeIntervalParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.avito.android.remote.model.category_parameters.DateTimeRangePoint;
import com.avito.android.remote.model.category_parameters.DeliveryOnVideoUploadConfig;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.FormatterType;
import com.avito.android.remote.model.category_parameters.GroupMarkerParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.ListItemAlignment;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameterKt;
import com.avito.android.remote.model.category_parameters.OnboardingConfig;
import com.avito.android.remote.model.category_parameters.OnboardingV2;
import com.avito.android.remote.model.category_parameters.ParamButton;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.Restrictions;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter;
import com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.category_parameters.VideoParameter;
import com.avito.android.remote.model.category_parameters.VideoUploadParameter;
import com.avito.android.remote.model.category_parameters.VideoUploadParameterValue;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.WithDependency;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSelect;
import com.avito.android.remote.model.price_list.PriceListDisplayingOptions;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.C35876q3;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.validation.C36000c;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: CategoryParametersElementConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f117618a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f117619b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f117620c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117621d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f117622e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final hJ.g f117623f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final hJ.e f117624g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Q1 f117625h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f117626i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f117627j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f117628k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f117629l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f117630m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C35876q3 f117631n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C36000c f117632o;

    /* renamed from: p, reason: collision with root package name */
    public final long f117633p;

    /* renamed from: q, reason: collision with root package name */
    public final long f117634q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final List<FontParameter> f117635r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f117636s;

    /* compiled from: CategoryParametersElementConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3419a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117637a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f117638b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f117639c;

        static {
            int[] iArr = new int[ListItemAlignment.values().length];
            try {
                iArr[ListItemAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListItemAlignment.FIRST_LINE_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListItemAlignment.TWO_LINES_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListItemAlignment.MIN_HEIGHT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f117637a = iArr;
            int[] iArr2 = new int[CharParameter.InputType.values().length];
            try {
                iArr2[CharParameter.InputType.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CharParameter.InputType.VIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CharParameter.InputType.URI.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f117638b = iArr2;
            int[] iArr3 = new int[IntParameter.InputType.values().length];
            try {
                iArr3[IntParameter.InputType.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[IntParameter.InputType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f117639c = iArr3;
        }
    }

    @X41.j
    public a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC35945t1 interfaceC35945t1, Resources resources, com.avito.android.server_time.h hVar, boolean z12, boolean z13, Locale locale, boolean z14, hJ.g gVar, hJ.e eVar, Q1 q12, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, u3.l lVar, int i12, C42822w c42822w) {
        boolean z22 = (i12 & 8) != 0 ? false : z12;
        boolean z23 = (i12 & 16) != 0 ? false : z13;
        boolean z24 = (i12 & 64) != 0 ? false : z14;
        boolean z25 = (i12 & 1024) != 0 ? false : z15;
        boolean z26 = (i12 & 2048) != 0 ? false : z16;
        boolean z27 = (i12 & 4096) != 0 ? false : z17;
        boolean z28 = (i12 & 8192) != 0 ? false : z18;
        boolean z29 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z19;
        this.f117618a = resources;
        this.f117619b = hVar;
        this.f117620c = z22;
        this.f117621d = z23;
        this.f117622e = z24;
        this.f117623f = gVar;
        this.f117624g = eVar;
        this.f117625h = q12;
        this.f117626i = z25;
        this.f117627j = z26;
        this.f117628k = z27;
        this.f117629l = z28;
        this.f117630m = z29;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setGroupingUsed(false);
        this.f117631n = new C35876q3(resources, ((SimpleTestGroupWithNone) lVar.f439745a.f439749b).b());
        this.f117632o = new C36000c(numberFormat, interfaceC35945t1, locale, resources);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1960, 0, 1);
        this.f117633p = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(1) + 5, 11, 31, 23, 59, 59);
        this.f117634q = calendar2.getTimeInMillis();
        this.f117635r = C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, "gray54"));
    }

    public static ItemWithAdditionalButton.AdditionalButton B(ParamButton paramButton, String str) {
        ItemWithAdditionalButton.AdditionalButton additionalButton;
        ItemWithAdditionalButton.AdditionalButtonType additionalButtonType;
        String upperCase = paramButton.getType().toUpperCase(Locale.getDefault());
        ItemWithAdditionalButton.AdditionalButtonType[] additionalButtonTypeArrValues = ItemWithAdditionalButton.AdditionalButtonType.values();
        int length = additionalButtonTypeArrValues.length;
        int i12 = 0;
        while (true) {
            additionalButton = null;
            if (i12 >= length) {
                additionalButtonType = null;
                break;
            }
            additionalButtonType = additionalButtonTypeArrValues[i12];
            if (L.f(additionalButtonType.name(), upperCase)) {
                break;
            }
            i12++;
        }
        if (additionalButtonType != null) {
            String link = paramButton.getLink();
            ParamButton.Position position = paramButton.getPosition();
            if (position == null) {
                position = ParamButton.Position.INLINE;
            }
            additionalButton = new ItemWithAdditionalButton.AdditionalButton(additionalButtonType, link, str, position);
        }
        return additionalButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[RETURN] */
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.category_parameters.ParameterElement.A G(com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter r17) {
        /*
            java.lang.Object r0 = r17.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = r0.length()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            r3 = 0
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r17.getValue()
            java.lang.String r0 = (java.lang.String) r0
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$Displaying r4 = r17.getDisplaying()
            if (r4 == 0) goto L28
            java.lang.String r4 = r4.getAllSelectedValue()
            goto L29
        L28:
            r4 = r3
        L29:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L32
            r4 = r1
        L30:
            r0 = r3
            goto L41
        L32:
            java.lang.String r4 = ", "
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = 6
            java.util.List r0 = kotlin.text.C43066x.f0(r0, r4, r2, r5)
            r4 = r2
            goto L41
        L3f:
            r4 = r2
            goto L30
        L41:
            java.util.List r5 = r17.getValues()
            if (r5 == 0) goto Lf2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r5.next()
            r8 = r7
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$Option r8 = (com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter.Option) r8
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionWidget r8 = r8.getWidget()
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionConfig r8 = r8.getConfig()
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionDisplay r8 = r8.getDisplay()
            java.lang.Boolean r8 = r8.getHidden()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.L.f(r8, r9)
            if (r8 != 0) goto L52
            r6.add(r7)
            goto L52
        L7b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.C42745f0.q(r6, r7)
            r5.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L8a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ld8
            java.lang.Object r7 = r6.next()
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$Option r7 = (com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter.Option) r7
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionWidget r8 = r7.getWidget()
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionConfig r8 = r8.getConfig()
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionDisplay r8 = r8.getDisplay()
            if (r4 == 0) goto La7
            r16 = r1
            goto Lba
        La7:
            boolean r9 = com.avito.android.util.O2.a(r0)
            if (r9 == 0) goto Lb8
            java.lang.String r9 = r7.getId()
            boolean r9 = r0.contains(r9)
            r16 = r9
            goto Lba
        Lb8:
            r16 = r2
        Lba:
            com.avito.android.category_parameters.ParameterElement$A$a r9 = new com.avito.android.category_parameters.ParameterElement$A$a
            java.lang.String r11 = r7.getId()
            java.lang.String r12 = r7.getTitle()
            com.avito.android.remote.model.badge.SimpleBadge r13 = r8.getBadge()
            com.avito.android.remote.model.UniversalColor r14 = r8.getBackgroundColor()
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$OptionDisplayDescription r15 = r8.getDescription()
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r5.add(r9)
            goto L8a
        Ld8:
            com.avito.android.category_parameters.ParameterElement$A r0 = new com.avito.android.category_parameters.ParameterElement$A
            java.lang.String r1 = r17.getId()
            java.lang.Object r2 = r17.getValue()
            java.lang.String r2 = (java.lang.String) r2
            com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter$Displaying r4 = r17.getDisplaying()
            if (r4 == 0) goto Lee
            java.lang.String r3 = r4.getAllSelectedValue()
        Lee:
            r0.<init>(r1, r2, r3, r5)
            return r0
        Lf2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.G(com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter):com.avito.android.category_parameters.ParameterElement$A");
    }

    public static /* synthetic */ ParameterElement.C.b I(a aVar, CategoryParameter categoryParameter) {
        return aVar.H(categoryParameter, null);
    }

    public static m J(SelectParameter.Value value, boolean z12, SelectParameter.Displaying.LabelPosition labelPosition) {
        String subtitle;
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config.Displaying displaying;
        SelectParameter.Value.Widget.Config config2;
        SelectParameter.Value.Widget.Config.Displaying displaying2;
        SelectParameter.Value.Widget.Config config3;
        SelectParameter.Value.Widget.Config.Displaying displaying3;
        SelectParameter.Value.Widget.Config config4;
        SelectParameter.Value.Widget.Config.Displaying displaying4;
        SelectParameter.Value.Widget.Config config5;
        SelectParameter.Value.Widget.Config.Displaying displaying5;
        SelectParameter.Value.Widget.Config config6;
        SelectParameter.Value.Widget.Config.Hint hint;
        Color color;
        SelectParameter.Value.Widget.Config config7;
        String id2 = value.getId();
        String title = value.getTitle();
        SelectParameter.Value.Widget widget = value.getWidget();
        if (widget == null || (config7 = widget.getConfig()) == null || (subtitle = config7.getSubtitle()) == null) {
            subtitle = value.getSubtitle();
        }
        String str = subtitle;
        SelectParameter.Value.Display display = value.getDisplay();
        Integer numValueOf = (display == null || (color = display.getColor()) == null) ? null : Integer.valueOf(color.getValue());
        SelectParameter.Value.Display display2 = value.getDisplay();
        String icon = display2 != null ? display2.getIcon() : null;
        SelectParameter.Value.Widget widget2 = value.getWidget();
        DeepLink deepLink = (widget2 == null || (config6 = widget2.getConfig()) == null || (hint = config6.getHint()) == null) ? null : hint.getDeepLink();
        boolean isDisabled = value.getIsDisabled();
        SelectParameter.Value.Widget widget3 = value.getWidget();
        UniversalImage multiThemeImages = (widget3 == null || (config5 = widget3.getConfig()) == null || (displaying5 = config5.getDisplaying()) == null) ? null : displaying5.getMultiThemeImages();
        DeepLink link = value.getLink();
        SelectParameter.Value.Widget widget4 = value.getWidget();
        List<SelectParameter.Value.Paragraph> paragraphs = (widget4 == null || (config4 = widget4.getConfig()) == null || (displaying4 = config4.getDisplaying()) == null) ? null : displaying4.getParagraphs();
        SelectParameter.Value.Widget widget5 = value.getWidget();
        SelectParameter.Value.LinkButton linkButton = (widget5 == null || (config3 = widget5.getConfig()) == null || (displaying3 = config3.getDisplaying()) == null) ? null : displaying3.getLinkButton();
        SelectParameter.Value.Widget widget6 = value.getWidget();
        String description = (widget6 == null || (config2 = widget6.getConfig()) == null || (displaying2 = config2.getDisplaying()) == null) ? null : displaying2.getDescription();
        SelectParameter.Value.Widget widget7 = value.getWidget();
        return new m(id2, title, str, z12, numValueOf, deepLink, icon, isDisabled, multiThemeImages, link, false, paragraphs, linkButton, description, (widget7 == null || (config = widget7.getConfig()) == null || (displaying = config.getDisplaying()) == null) ? null : displaying.getSubtitle(), labelPosition, 1024, null);
    }

    public static ArrayList K(List list, SelectParameter.Value value, SelectParameter.Displaying.LabelPosition labelPosition) {
        List<SelectParameter.Value> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (SelectParameter.Value value2 : list2) {
            arrayList.add(J(value2, L.f(value, value2), labelPosition));
        }
        return arrayList;
    }

    public static ParameterElement.J M(VideoUploadParameter videoUploadParameter) {
        boolean z12;
        ItemWithState.State normal;
        VideoUploadParameter.Widget.Config config;
        VideoUploadParameter.Widget.Config config2;
        Boolean isDisabled;
        VideoUploadParameter.Widget.Config config3;
        VideoUploadParameter.Widget.Config config4;
        VideoUploadParameter.Widget.Config config5;
        VideoUploadParameter.Widget.Config config6;
        VideoUploadParameter.Widget.Config config7;
        VideoUploadParameter.Widget.Config config8;
        VideoUploadParameter.Widget.Config config9;
        VideoUploadParameterValue videoUploadParameterValue;
        VideoUploadParameterValue videoUploadParameterValue2;
        VideoUploadParameter.Widget.Config config10;
        VideoUploadParameter.Widget.Config config11;
        VideoUploadParameter.Widget.Config config12;
        String id2 = videoUploadParameter.getId();
        VideoUploadParameter.Widget widget = videoUploadParameter.getWidget();
        String title = (widget == null || (config12 = widget.getConfig()) == null) ? null : config12.getTitle();
        VideoUploadParameter.Widget widget2 = videoUploadParameter.getWidget();
        String description = (widget2 == null || (config11 = widget2.getConfig()) == null) ? null : config11.getDescription();
        VideoUploadParameter.Widget widget3 = videoUploadParameter.getWidget();
        AttributedDescription attributedDescription = (widget3 == null || (config10 = widget3.getConfig()) == null) ? null : config10.getAttributedDescription();
        List<? extends VideoUploadParameterValue> value = videoUploadParameter.getValue();
        String id3 = (value == null || (videoUploadParameterValue2 = (VideoUploadParameterValue) C42745f0.G(value)) == null) ? null : videoUploadParameterValue2.getId();
        List<? extends VideoUploadParameterValue> value2 = videoUploadParameter.getValue();
        Image thumbnail = (value2 == null || (videoUploadParameterValue = (VideoUploadParameterValue) C42745f0.G(value2)) == null) ? null : videoUploadParameterValue.getThumbnail();
        VideoUploadParameter.Widget widget4 = videoUploadParameter.getWidget();
        Long maxFileSize = (widget4 == null || (config9 = widget4.getConfig()) == null) ? null : config9.getMaxFileSize();
        VideoUploadParameter.Widget widget5 = videoUploadParameter.getWidget();
        Long maxDuration = (widget5 == null || (config8 = widget5.getConfig()) == null) ? null : config8.getMaxDuration();
        VideoUploadParameter.Widget widget6 = videoUploadParameter.getWidget();
        Long minDuration = (widget6 == null || (config7 = widget6.getConfig()) == null) ? null : config7.getMinDuration();
        VideoUploadParameter.Widget widget7 = videoUploadParameter.getWidget();
        Boolean isNew = (widget7 == null || (config6 = widget7.getConfig()) == null) ? null : config6.getIsNew();
        VideoUploadParameter.Widget widget8 = videoUploadParameter.getWidget();
        OnboardingConfig onboarding = (widget8 == null || (config5 = widget8.getConfig()) == null) ? null : config5.getOnboarding();
        VideoUploadParameter.Widget widget9 = videoUploadParameter.getWidget();
        OnboardingV2 onboardingV2 = (widget9 == null || (config4 = widget9.getConfig()) == null) ? null : config4.getOnboardingV2();
        VideoUploadParameter.Widget widget10 = videoUploadParameter.getWidget();
        DeliveryOnVideoUploadConfig delivery = (widget10 == null || (config3 = widget10.getConfig()) == null) ? null : config3.getDelivery();
        VideoUploadParameter.Widget widget11 = videoUploadParameter.getWidget();
        boolean zBooleanValue = (widget11 == null || (config2 = widget11.getConfig()) == null || (isDisabled = config2.getIsDisabled()) == null) ? false : isDisabled.booleanValue();
        VideoUploadParameter.Widget widget12 = videoUploadParameter.getWidget();
        String disabledText = (widget12 == null || (config = widget12.getConfig()) == null) ? null : config.getDisabledText();
        boolean z13 = z(videoUploadParameter);
        AttributedText errorMessage = videoUploadParameter.getErrorMessage();
        if (errorMessage != null) {
            normal = new ItemWithState.State.Error.ErrorWithMessage(errorMessage.getText());
            z12 = zBooleanValue;
        } else {
            z12 = zBooleanValue;
            normal = new ItemWithState.State.Normal(null, 1, null);
        }
        return new ParameterElement.J(id2, title, description, attributedDescription, id3, thumbnail, maxFileSize, maxDuration, minDuration, isNew, onboarding, onboardingV2, delivery, z12, disabledText, z13, normal);
    }

    public static List c(a aVar, UV0.a aVar2, e eVar, Set set, Theme theme, int i12) {
        if ((i12 & 2) != 0) {
            eVar = null;
        }
        if ((i12 & 4) != 0) {
            set = B0.f406639b;
        }
        if ((i12 & 16) != 0) {
            theme = null;
        }
        return aVar.b(aVar2, eVar, set, theme);
    }

    public static ArrayList d(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Entity entity = (Entity) it.next();
            if (set != null && !C42745f0.r(set, entity.getId())) {
                entity = null;
            }
            if (entity != null) {
                arrayList.add(entity);
            }
        }
        return arrayList;
    }

    public static ParameterElement.v.a e(MultiselectParameter multiselectParameter) {
        CustomPaddings customPaddings;
        CustomPaddings customPaddings2;
        MultiselectParameter.Displaying displaying = multiselectParameter.getDisplaying();
        Integer bottom = null;
        Integer top = (displaying == null || (customPaddings2 = displaying.getCustomPaddings()) == null) ? null : customPaddings2.getTop();
        MultiselectParameter.Displaying displaying2 = multiselectParameter.getDisplaying();
        if (displaying2 != null && (customPaddings = displaying2.getCustomPaddings()) != null) {
            bottom = customPaddings.getBottom();
        }
        return new ParameterElement.v.a(top, bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DisplayingOptions f(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof TextParameter) {
            return ((TextParameter) categoryParameter).getDisplayingOptions();
        }
        if (categoryParameter instanceof PriceParameter) {
            DisplayingOptions displayingOptions = ((PriceParameter) categoryParameter).getDisplayingOptions();
            if (displayingOptions != null) {
                if (displayingOptions.getFormatter() == null) {
                    displayingOptions = displayingOptions.copy(((-65) & 1) != 0 ? displayingOptions.type : null, ((-65) & 2) != 0 ? displayingOptions.masks : null, ((-65) & 4) != 0 ? displayingOptions.multiline : null, ((-65) & 8) != 0 ? displayingOptions.prefix : null, ((-65) & 16) != 0 ? displayingOptions.postfix : null, ((-65) & 32) != 0 ? displayingOptions.length : null, ((-65) & 64) != 0 ? displayingOptions.formatter : FormatterType.PRICE, ((-65) & 128) != 0 ? displayingOptions.visible : null, ((-65) & 256) != 0 ? displayingOptions.hideTitle : false, ((-65) & 512) != 0 ? displayingOptions.enabled : null, ((-65) & 1024) != 0 ? displayingOptions.defaultValue : null, ((-65) & 2048) != 0 ? displayingOptions.disableMask : null, ((-65) & 4096) != 0 ? displayingOptions.sendUncheckedValue : null, ((-65) & 8192) != 0 ? displayingOptions.subTitle : null, ((-65) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? displayingOptions.attributedSubtitle : null, ((-65) & 32768) != 0 ? displayingOptions.placeholder : null, ((-65) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? displayingOptions.editScreenTitle : null, ((-65) & 131072) != 0 ? displayingOptions.style : null, ((-65) & 262144) != 0 ? displayingOptions.addButtonTitle : null, ((-65) & 524288) != 0 ? displayingOptions.editButtonTitle : null, ((-65) & 1048576) != 0 ? displayingOptions.dialogDisplaying : null, ((-65) & 2097152) != 0 ? displayingOptions.badge : null, ((-65) & 4194304) != 0 ? displayingOptions.titleTipAction : null, ((-65) & 8388608) != 0 ? displayingOptions.titleTipText : null, ((-65) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? displayingOptions.shouldShowAlertBannerOnFocus : null, ((-65) & 33554432) != 0 ? displayingOptions.alertBannerText : null, ((-65) & 67108864) != 0 ? displayingOptions.photoWidgetWithGroups : null, ((-65) & 134217728) != 0 ? displayingOptions.priceListDisplaying : null, ((-65) & 268435456) != 0 ? displayingOptions.customPaddings : null, ((-65) & 536870912) != 0 ? displayingOptions.withClearButton : null, ((-65) & 1073741824) != 0 ? displayingOptions.toFillIn : null, ((-65) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? displayingOptions.titleStyle : null, (127 & 1) != 0 ? displayingOptions.needFormatting : null, (127 & 2) != 0 ? displayingOptions.showsAddressValue : null, (127 & 4) != 0 ? displayingOptions.clearanceValues : null, (127 & 8) != 0 ? displayingOptions.label : null, (127 & 16) != 0 ? displayingOptions.subtitle : null, (127 & 32) != 0 ? displayingOptions.universalImage : null, (127 & 64) != 0 ? displayingOptions.description : null);
                }
                return displayingOptions;
            }
        } else {
            if (categoryParameter instanceof AddressParameter) {
                return ((AddressParameter) categoryParameter).getDisplaying();
            }
            if (categoryParameter instanceof PhotoParameter) {
                return ((PhotoParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof ObjectsParameter) {
                return ((ObjectsParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof CharParameter) {
                return ((CharParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof RadiusParameter) {
                return ((RadiusParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof DistrictParameter) {
                return ((DistrictParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof MetroParameter) {
                return ((MetroParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof IntParameter) {
                return ((IntParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof VideoUploadParameter) {
                return ((VideoUploadParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof DateTimeIntervalParameter) {
                return ((DateTimeIntervalParameter) categoryParameter).getDisplayingOptions();
            }
        }
        return null;
    }

    public static ArrayList h(MultiselectParameter multiselectParameter) {
        String str;
        MultiselectParameter.Value.Widget.Config config;
        MultiselectParameter.Value.Widget.Config.Hint hint;
        Color color;
        MultiselectParameter.Value.Widget.Config config2;
        Object next;
        List<MultiselectParameter.Value> values = multiselectParameter.getValues();
        ArrayList arrayList = new ArrayList();
        for (MultiselectParameter.Value value : values) {
            Set<String> availableOptions = multiselectParameter.getAvailableOptions();
            DeepLink deepLink = null;
            m mVar = null;
            deepLink = null;
            deepLink = null;
            if (availableOptions == null || availableOptions.contains(value.getId())) {
                List<? extends String> value2 = multiselectParameter.getValue();
                if (value2 != null) {
                    Iterator<T> it = value2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (L.f((String) next, value.getId())) {
                            break;
                        }
                    }
                    str = (String) next;
                } else {
                    str = null;
                }
                boolean z12 = str != null;
                String id2 = value.getId();
                String title = value.getF119974b();
                MultiselectParameter.Value.Widget widget = value.getWidget();
                String subtitle = (widget == null || (config2 = widget.getConfig()) == null) ? null : config2.getSubtitle();
                MultiselectParameter.Value.Display display = value.getDisplay();
                Integer numValueOf = (display == null || (color = display.getColor()) == null) ? null : Integer.valueOf(color.getValue());
                MultiselectParameter.Value.Display display2 = value.getDisplay();
                String icon = display2 != null ? display2.getIcon() : null;
                MultiselectParameter.Value.Widget widget2 = value.getWidget();
                if (widget2 != null && (config = widget2.getConfig()) != null && (hint = config.getHint()) != null) {
                    deepLink = hint.getDeepLink();
                }
                mVar = new m(id2, title, subtitle, z12, numValueOf, deepLink, icon, value.isDisabled(), null, null, false, null, null, null, null, null, 65280, null);
            }
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(com.avito.android.remote.model.category_parameters.base.CategoryParameter r2) {
        /*
            boolean r0 = r2 instanceof com.avito.android.remote.model.category_parameters.base.TextParameter
            r1 = 1
            if (r0 == 0) goto L1d
            com.avito.android.remote.model.category_parameters.base.TextParameter r2 = (com.avito.android.remote.model.category_parameters.base.TextParameter) r2
            com.avito.android.remote.model.category_parameters.DisplayingOptions r2 = r2.getDisplayingOptions()
            if (r2 == 0) goto L18
            java.lang.Boolean r2 = r2.getMultiline()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.L.f(r2, r0)
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 == 0) goto L1d
            r2 = 3
            goto L1e
        L1d:
            r2 = r1
        L1e:
            int r2 = java.lang.Math.max(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.i(com.avito.android.remote.model.category_parameters.base.CategoryParameter):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static ParameterElement.DisplayType.Chips.Style j(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -758969224:
                    if (str.equals("singleLineFixed")) {
                        return ParameterElement.DisplayType.Chips.Style.f117248b;
                    }
                    break;
                case -668138801:
                    if (str.equals("multipleLines")) {
                        return ParameterElement.DisplayType.Chips.Style.f117251e;
                    }
                    break;
                case -262939895:
                    if (str.equals("singleLineStretch")) {
                        return ParameterElement.DisplayType.Chips.Style.f117249c;
                    }
                    break;
                case 1504160547:
                    if (str.equals("singleLineScrollable")) {
                        return ParameterElement.DisplayType.Chips.Style.f117250d;
                    }
                    break;
            }
        }
        return null;
    }

    public static int l(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof NumericParameter) {
            return 8194;
        }
        if (!(categoryParameter instanceof IntParameter ? true : categoryParameter instanceof PriceParameter)) {
            if (categoryParameter instanceof EmailParameter) {
                return 32;
            }
            if (categoryParameter instanceof CharParameter) {
                int i12 = C3419a.f117638b[((CharParameter) categoryParameter).getInputType().ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        return 528385;
                    }
                    if (i12 == 3) {
                        return 16;
                    }
                }
            }
            return 16385;
        }
        return 2;
    }

    public static AttributedText m(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof TextParameter) {
            return categoryParameter.getMotivation();
        }
        if (categoryParameter instanceof PhoneParameter) {
            return ((PhoneParameter) categoryParameter).getMotivation();
        }
        return null;
    }

    public static ParameterElement.VariableLengthParameter.b n(ChildrenAgesGroup childrenAgesGroup) {
        String str = childrenAgesGroup.getId() + "_header";
        String title = childrenAgesGroup.getTitle();
        DisplayingOptions displaying = childrenAgesGroup.getDisplaying();
        DeepLink titleTipAction = displaying != null ? displaying.getTitleTipAction() : null;
        Boolean boolIsNew = childrenAgesGroup.isNew();
        return new ParameterElement.VariableLengthParameter.b(str, title, ParameterElement.VariableLengthParameter.Companion.Type.f117374b, titleTipAction, boolIsNew != null ? boolIsNew.booleanValue() : false);
    }

    public static ParameterElement.VariableLengthParameter.b o(StrDurationDiscountsParameter strDurationDiscountsParameter) {
        return new ParameterElement.VariableLengthParameter.b(strDurationDiscountsParameter.getId() + "_header", strDurationDiscountsParameter.getTitle(), ParameterElement.VariableLengthParameter.Companion.Type.f117375c, null, false, 24, null);
    }

    public static boolean r(CategoryParameter categoryParameter) {
        MultiselectParameter.Displaying displaying;
        SelectParameter.Displaying displaying2;
        DisplayingOptions displayingOptionsF = f(categoryParameter);
        if (displayingOptionsF != null && displayingOptionsF.getHideTitle()) {
            return true;
        }
        SelectParameter selectParameter = categoryParameter instanceof SelectParameter ? (SelectParameter) categoryParameter : null;
        if (selectParameter != null && (displaying2 = selectParameter.getDisplaying()) != null && displaying2.getHideTitle().booleanValue()) {
            return true;
        }
        MultiselectParameter multiselectParameter = categoryParameter instanceof MultiselectParameter ? (MultiselectParameter) categoryParameter : null;
        return (multiselectParameter == null || (displaying = multiselectParameter.getDisplaying()) == null) ? false : L.f(displaying.getHideTitle(), Boolean.TRUE);
    }

    public static boolean s(WithDependency withDependency, List list) {
        ParameterSlot parameterSlot;
        Object next;
        List<String> paramsMustBeFilled = withDependency != null ? withDependency.getParamsMustBeFilled() : null;
        if ((paramsMustBeFilled != null || list != null) && paramsMustBeFilled != null) {
            for (String str : paramsMustBeFilled) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (L.f(((ParameterSlot) next).getId(), str)) {
                            break;
                        }
                    }
                    parameterSlot = (ParameterSlot) next;
                } else {
                    parameterSlot = null;
                }
                EditableParameter editableParameter = parameterSlot instanceof EditableParameter ? (EditableParameter) parameterSlot : null;
                if (editableParameter != null && !editableParameter.hasValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static ParameterElement.DisplayType v(SelectParameter.Displaying displaying) {
        String type = displaying.getType();
        C42822w c42822w = null;
        switch (type.hashCode()) {
            case -1966388509:
                if (type.equals("sellerAddresses")) {
                    return ParameterElement.DisplayType.m.f117266a;
                }
                return null;
            case -1662688601:
                if (type.equals("earlyAccess")) {
                    return ParameterElement.DisplayType.h.f117261a;
                }
                return null;
            case -1627804910:
                if (type.equals("segmented")) {
                    return ParameterElement.DisplayType.q.f117270a;
                }
                return null;
            case -1332085432:
                if (type.equals("dialog")) {
                    return ParameterElement.DisplayType.f.f117259a;
                }
                return null;
            case -1316102431:
                if (type.equals("withSuggestedOptions")) {
                    return ParameterElement.DisplayType.w.f117276a;
                }
                return null;
            case -1200026576:
                if (type.equals("selectorCardGroup")) {
                    return ParameterElement.DisplayType.s.f117272a;
                }
                return null;
            case -1183997287:
                if (!type.equals("inline")) {
                    return null;
                }
                break;
            case -675604244:
                if (type.equals("serpDisplayType")) {
                    return ParameterElement.DisplayType.u.f117274a;
                }
                return null;
            case -620399116:
                if (type.equals("bottomSheet")) {
                    return ParameterElement.DisplayType.a.f117254a;
                }
                return null;
            case -85276959:
                if (type.equals("switcher")) {
                    return ParameterElement.DisplayType.v.f117275a;
                }
                return null;
            case -28432344:
                if (type.equals("radioCards")) {
                    return ParameterElement.DisplayType.n.f117267a;
                }
                return null;
            case 2908512:
                if (type.equals("carousel")) {
                    return ParameterElement.DisplayType.d.f117257a;
                }
                return null;
            case 3321850:
                if (type.equals("link")) {
                    return ParameterElement.DisplayType.l.f117265a;
                }
                return null;
            case 5318500:
                if (type.equals("radiogroup")) {
                    return ParameterElement.DisplayType.o.f117268a;
                }
                return null;
            case 94631335:
                if (!type.equals("chips")) {
                    return null;
                }
                return new ParameterElement.DisplayType.Chips(false, j(displaying.getStyle()), 1, c42822w);
            case 224189799:
                if (type.equals("bubbles")) {
                    return ParameterElement.DisplayType.b.f117255a;
                }
                return null;
            case 812687887:
                if (type.equals("selectorCardCarousel")) {
                    return ParameterElement.DisplayType.r.f117271a;
                }
                return null;
            case 1536891843:
                if (type.equals("checkbox")) {
                    return ParameterElement.DisplayType.e.f117258a;
                }
                return null;
            case 1950789867:
                if (!type.equals("inlined")) {
                    return null;
                }
                break;
            case 1969591204:
                if (type.equals("selectorCardGroupBottomSheet")) {
                    return ParameterElement.DisplayType.t.f117273a;
                }
                return null;
            default:
                return null;
        }
        return ParameterElement.DisplayType.k.f117264a;
    }

    public static boolean z(CategoryParameter categoryParameter) {
        MultiselectParameter.Displaying displaying;
        SelectParameter.Displaying displaying2;
        DisplayingOptions displayingOptionsF = f(categoryParameter);
        if (!(displayingOptionsF != null ? L.f(displayingOptionsF.getToFillIn(), Boolean.TRUE) : false)) {
            SelectParameter selectParameter = categoryParameter instanceof SelectParameter ? (SelectParameter) categoryParameter : null;
            if (!((selectParameter == null || (displaying2 = selectParameter.getDisplaying()) == null) ? false : L.f(displaying2.getToFillIn(), Boolean.TRUE))) {
                MultiselectParameter multiselectParameter = categoryParameter instanceof MultiselectParameter ? (MultiselectParameter) categoryParameter : null;
                if (!((multiselectParameter == null || (displaying = multiselectParameter.getDisplaying()) == null) ? false : L.f(displaying.getToFillIn(), Boolean.TRUE))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    @Y61.k
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.p A(@Y61.k com.avito.android.remote.model.category_parameters.base.CategoryParameter r38, @Y61.l com.avito.android.remote.model.search.Theme r39) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.A(com.avito.android.remote.model.category_parameters.base.CategoryParameter, com.avito.android.remote.model.search.Theme):com.avito.android.category_parameters.ParameterElement$p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.collections.z0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.t C(com.avito.android.remote.model.category_parameters.MetroParameter r34) {
        /*
            r33 = this;
            java.lang.String r1 = r34.getId()
            java.lang.String r2 = r34.getTitle()
            boolean r8 = r(r34)
            boolean r9 = z(r34)
            com.avito.android.remote.model.category_parameters.DisplayingOptions r0 = r34.getDisplayingOptions()
            r3 = 1
            if (r0 == 0) goto L25
            java.lang.Boolean r0 = r0.getEnabled()
            if (r0 == 0) goto L25
            boolean r0 = r0.booleanValue()
            r12 = r33
            r6 = r0
            goto L28
        L25:
            r12 = r33
            r6 = r3
        L28:
            com.avito.android.validation.c r0 = r12.f117632o
            r4 = r34
            java.lang.String r5 = r0.a(r4)
            java.util.List r0 = r34.get_value()
            r7 = 0
            if (r0 == 0) goto L96
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.C42745f0.q(r0, r11)
            r10.<init>(r11)
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L97
            java.lang.Object r11 = r0.next()
            com.avito.android.remote.model.Metro r11 = (com.avito.android.remote.model.Metro) r11
            java.lang.Object r13 = r34.getValue()
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L63
            boolean r13 = r13.contains(r11)
        L60:
            r18 = r13
            goto L65
        L63:
            r13 = 0
            goto L60
        L65:
            JO.m r13 = new JO.m
            r14 = r13
            java.lang.String r15 = r11.getId()
            java.lang.String r16 = r11.getF119974b()
            r29 = 0
            r30 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 65508(0xffe4, float:9.1796E-41)
            r32 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r10.add(r13)
            goto L48
        L96:
            r10 = r7
        L97:
            if (r10 != 0) goto L9c
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
            r10 = r0
        L9c:
            java.lang.String r11 = r33.k(r34)
            com.avito.android.remote.model.category_parameters.DisplayingOptions r0 = r34.getDisplayingOptions()
            if (r0 == 0) goto Lac
            com.avito.android.remote.model.category_parameters.CustomPaddings r0 = r0.getCustomPaddings()
            r13 = r0
            goto Lad
        Lac:
            r13 = r7
        Lad:
            com.avito.android.remote.model.text.AttributedText r0 = r34.getErrorMessage()
            if (r0 == 0) goto Lcc
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto Lcc
            int r14 = r0.length()
            if (r14 != 0) goto Lc2
            com.avito.android.items.ItemWithState$State$Error$ErrorWithoutMessage r0 = com.avito.android.items.ItemWithState.State.Error.ErrorWithoutMessage.f173898b
            goto Lc8
        Lc2:
            com.avito.android.items.ItemWithState$State$Error$ErrorWithMessage r14 = new com.avito.android.items.ItemWithState$State$Error$ErrorWithMessage
            r14.<init>(r0)
            r0 = r14
        Lc8:
            if (r0 == 0) goto Lcc
        Lca:
            r14 = r0
            goto Ld2
        Lcc:
            com.avito.android.items.ItemWithState$State$Normal r0 = new com.avito.android.items.ItemWithState$State$Normal
            r0.<init>(r7, r3, r7)
            goto Lca
        Ld2:
            java.lang.String r15 = r33.g(r34)
            com.avito.android.category_parameters.ParameterElement$t r16 = new com.avito.android.category_parameters.ParameterElement$t
            r0 = r16
            r3 = r5
            r4 = r10
            r5 = r11
            r7 = r13
            r10 = r14
            r11 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.C(com.avito.android.remote.model.category_parameters.MetroParameter):com.avito.android.category_parameters.ParameterElement$t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.q D(com.avito.android.remote.model.category_parameters.base.EditableParameter<java.lang.String> r32, com.avito.android.remote.model.category_parameters.MultigeoConfig r33) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.D(com.avito.android.remote.model.category_parameters.base.EditableParameter, com.avito.android.remote.model.category_parameters.MultigeoConfig):com.avito.android.category_parameters.ParameterElement$q");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0456, code lost:
    
        r7.add(r4);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement E(com.avito.android.remote.model.category_parameters.MultiselectParameter r38, com.avito.android.remote.model.search.Theme r39) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.E(com.avito.android.remote.model.category_parameters.MultiselectParameter, com.avito.android.remote.model.search.Theme):com.avito.android.category_parameters.ParameterElement");
    }

    public final ParameterElement.w F(ObjectsParameter objectsParameter) throws Resources.NotFoundException {
        ArrayList arrayList;
        AttributedText attributedText;
        PriceListDisplayingOptions priceListDisplaying;
        Boolean skipEmptyPreview;
        String str;
        ParameterElement.w.a bVar;
        ParameterElement.w.a cVar;
        Restrictions.Limit limit;
        Long max;
        List<? extends List<? extends ParameterSlot>> value = objectsParameter.getValue();
        boolean zBooleanValue = false;
        long size = value != null ? value.size() : 0;
        Restrictions restrictions = objectsParameter.getRestrictions();
        boolean z12 = size < ((restrictions == null || (limit = restrictions.getLimit()) == null || (max = limit.getMax()) == null) ? Long.MAX_VALUE : max.longValue());
        List<? extends List<? extends ParameterSlot>> value2 = objectsParameter.getValue();
        if (value2 != null) {
            List<? extends List<? extends ParameterSlot>> list = value2;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list2);
                boolean zHasChildError = ObjectsParameterKt.hasChildError(list2);
                DisplayingOptions displayingOptionsF = f(objectsParameter);
                String type = displayingOptionsF != null ? displayingOptionsF.getType() : null;
                boolean zF2 = L.f(type, "priceList");
                C35876q3 c35876q3 = this.f117631n;
                if (zF2) {
                    ObjectsParameter.Summary summary = objectsParameter.getSummary();
                    List<String> titles = summary != null ? summary.getTitles() : null;
                    if (titles == null) {
                        titles = C42784z0.f406748b;
                    }
                    String strO = C42745f0.O(C35876q3.b(c35876q3, titles, simpleParametersTree, null, 12), null, null, null, null, 63);
                    List<String> secondTitles = summary != null ? summary.getSecondTitles() : null;
                    if (secondTitles == null) {
                        secondTitles = C42784z0.f406748b;
                    }
                    String strO2 = C42745f0.O(C35876q3.b(c35876q3, secondTitles, simpleParametersTree, null, 12), null, null, null, null, 63);
                    List<String> subtitles = summary != null ? summary.getSubtitles() : null;
                    if (subtitles == null) {
                        subtitles = C42784z0.f406748b;
                    }
                    String string = C43066x.A0(C42745f0.O(c35876q3.a(subtitles, simpleParametersTree, summary != null ? summary.getEmptyValueSummary() : null, summary != null ? summary.getSkipValueIds() : null), null, null, null, null, 63)).toString();
                    if (C43066x.K(strO2)) {
                        strO2 = null;
                    }
                    if (strO2 != null) {
                        strO = strO2;
                    }
                    cVar = new ParameterElement.w.a.c(C43066x.A0(strO).toString(), string, zHasChildError);
                } else {
                    boolean zF3 = L.f(type, "educationList");
                    Resources resources = this.f117618a;
                    if (zF3) {
                        ObjectsParameter.Summary summary2 = objectsParameter.getSummary();
                        String string2 = resources.getString(R.string.list_separator);
                        List<String> titles2 = summary2 != null ? summary2.getTitles() : null;
                        if (titles2 == null) {
                            titles2 = C42784z0.f406748b;
                        }
                        ArrayList arrayListB = C35876q3.b(c35876q3, titles2, simpleParametersTree, null, 12);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayListB.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (!C43066x.K((String) next)) {
                                arrayList2.add(next);
                            }
                        }
                        String strO3 = C42745f0.O(arrayList2, string2, null, null, null, 62);
                        List<String> subtitles2 = summary2 != null ? summary2.getSubtitles() : null;
                        if (subtitles2 == null) {
                            subtitles2 = C42784z0.f406748b;
                        }
                        bVar = new ParameterElement.w.a.C3418a(strO3, C42745f0.O(C35876q3.b(c35876q3, subtitles2, simpleParametersTree, null, 12), null, null, null, null, 63), zHasChildError);
                    } else {
                        ObjectsParameter.Summary summary3 = objectsParameter.getSummary();
                        List<String> titles3 = summary3 != null ? summary3.getTitles() : null;
                        if (titles3 == null) {
                            titles3 = C42784z0.f406748b;
                        }
                        ArrayList arrayListB2 = C35876q3.b(c35876q3, titles3, simpleParametersTree, null, 12);
                        List<String> subtitles3 = summary3 != null ? summary3.getSubtitles() : null;
                        if (subtitles3 == null) {
                            subtitles3 = C42784z0.f406748b;
                        }
                        ArrayList arrayListB3 = C35876q3.b(c35876q3, subtitles3, simpleParametersTree, null, 12);
                        if (arrayListB2.isEmpty()) {
                            str = "";
                        } else {
                            Iterator it3 = arrayListB2.iterator();
                            if (!it3.hasNext()) {
                                throw new UnsupportedOperationException("Empty collection can't be reduced.");
                            }
                            Object next2 = it3.next();
                            while (it3.hasNext()) {
                                String str2 = (String) it3.next();
                                next2 = (String) next2;
                                if (str2.length() > 0) {
                                    next2 = resources.getString(R.string.object_row, next2, str2);
                                }
                            }
                            str = (String) next2;
                        }
                        bVar = new ParameterElement.w.a.b(str, (String) C42745f0.G(arrayListB3), (String) C42745f0.K(1, arrayListB3), zHasChildError);
                    }
                    cVar = bVar;
                }
                arrayList.add(cVar);
            }
        } else {
            arrayList = null;
        }
        List list3 = arrayList == null ? C42784z0.f406748b : arrayList;
        DisplayingOptions displayingOptions = objectsParameter.getDisplayingOptions();
        if (displayingOptions == null || (attributedText = displayingOptions.getAttributedSubtitle()) == null) {
            DisplayingOptions displayingOptions2 = objectsParameter.getDisplayingOptions();
            String subTitle = displayingOptions2 != null ? displayingOptions2.getSubTitle() : null;
            attributedText = new AttributedText(subTitle == null ? "" : subTitle, C42784z0.f406748b, 0, 4, null);
        }
        AttributedText attributedText2 = attributedText;
        String id2 = objectsParameter.getId();
        String title = objectsParameter.getTitle();
        DisplayingOptions displayingOptions3 = objectsParameter.getDisplayingOptions();
        String addButtonTitle = displayingOptions3 != null ? displayingOptions3.getAddButtonTitle() : null;
        DisplayingOptions displayingOptions4 = objectsParameter.getDisplayingOptions();
        String editButtonTitle = displayingOptions4 != null ? displayingOptions4.getEditButtonTitle() : null;
        DisplayingOptions displayingOptions5 = objectsParameter.getDisplayingOptions();
        String type2 = displayingOptions5 != null ? displayingOptions5.getType() : null;
        DisplayingOptions displayingOptions6 = objectsParameter.getDisplayingOptions();
        if (displayingOptions6 != null && (priceListDisplaying = displayingOptions6.getPriceListDisplaying()) != null && (skipEmptyPreview = priceListDisplaying.getSkipEmptyPreview()) != null) {
            zBooleanValue = skipEmptyPreview.booleanValue();
        }
        boolean z13 = zBooleanValue;
        boolean zR2 = r(objectsParameter);
        String strG = g(objectsParameter);
        AttributedText errorMessage = objectsParameter.getErrorMessage();
        return new ParameterElement.w(id2, title, attributedText2, z12, addButtonTitle, editButtonTitle, type2, list3, z13, zR2, errorMessage != null ? new ItemWithState.State.Error.ErrorWithMessage(errorMessage.getText()) : new ItemWithState.State.Normal(null, 1, null), objectsParameter.getMotivation(), strG, z(objectsParameter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe A[EDGE_INSN: B:298:0x00fe->B:63:0x00fe BREAK  A[LOOP:0: B:56:0x00e5->B:299:?]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015b  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v11, types: [com.avito.android.remote.model.text.AttributedText] */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r31v4, types: [com.avito.android.remote.model.text.AttributedText] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11, types: [com.avito.android.remote.model.category_parameters.TooltipOptions] */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r45v12 */
    /* JADX WARN: Type inference failed for: r45v13 */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r45v9, types: [com.avito.android.remote.model.category_parameters.TipIconParameters] */
    /* JADX WARN: Type inference failed for: r52v5 */
    /* JADX WARN: Type inference failed for: r52v6, types: [com.avito.android.deep_linking.links.DeepLink] */
    /* JADX WARN: Type inference failed for: r52v7 */
    /* JADX WARN: Type inference failed for: r52v8 */
    /* JADX WARN: Type inference failed for: r53v0 */
    /* JADX WARN: Type inference failed for: r53v1 */
    /* JADX WARN: Type inference failed for: r53v3 */
    /* JADX WARN: Type inference failed for: r53v5 */
    /* JADX WARN: Type inference failed for: r53v6, types: [com.avito.android.remote.model.text.AttributedText] */
    /* JADX WARN: Type inference failed for: r53v7 */
    /* JADX WARN: Type inference failed for: r55v5 */
    /* JADX WARN: Type inference failed for: r55v6, types: [com.avito.android.remote.model.category_parameters.AddressParameter$InputStyle] */
    /* JADX WARN: Type inference failed for: r55v7 */
    /* JADX WARN: Type inference failed for: r55v8 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.avito.android.remote.model.category_parameters.SelectParameter$Displaying$LabelPosition] */
    /* JADX WARN: Type inference failed for: r5v16 */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.C.b H(@Y61.k com.avito.android.remote.model.category_parameters.base.CategoryParameter r73, @Y61.l com.avito.android.remote.model.search.Theme r74) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.H(com.avito.android.remote.model.category_parameters.base.CategoryParameter, com.avito.android.remote.model.search.Theme):com.avito.android.category_parameters.ParameterElement$C$b");
    }

    public final ParameterElement.I L(VideoParameter videoParameter) {
        String id2 = videoParameter.getId();
        String title = videoParameter.getTitle();
        String strA = this.f117632o.a(videoParameter);
        String placeholder = videoParameter.getPlaceholder();
        String strG = g(videoParameter);
        AttributedText errorMessage = videoParameter.getErrorMessage();
        ItemWithState.State errorWithMessage = errorMessage != null ? new ItemWithState.State.Error.ErrorWithMessage(errorMessage.getText()) : new ItemWithState.State.Normal(null, 1, null);
        ParamButton button = videoParameter.getButton();
        return new ParameterElement.I(id2, title, placeholder, strG, null, button != null ? B(button, videoParameter.getId()) : null, strA, errorWithMessage, 16, null);
    }

    public final AttributedText a(AttributedText attributedText, boolean z12) {
        if (!z12) {
            return attributedText;
        }
        List<Attribute> attributes = attributedText.getAttributes();
        ArrayList arrayList = new ArrayList(C42745f0.q(attributes, 10));
        for (Parcelable parcelableCopy$default : attributes) {
            boolean z13 = parcelableCopy$default instanceof DeepLinkAttribute;
            List<FontParameter> list = this.f117635r;
            if (z13) {
                DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) parcelableCopy$default;
                List<FontParameter> parameters = deepLinkAttribute.getParameters();
                if (parameters == null) {
                    parameters = C42784z0.f406748b;
                }
                parcelableCopy$default = DeepLinkAttribute.copy$default(deepLinkAttribute, null, null, null, null, null, C42745f0.h0(list, parameters), 31, null);
            } else if (parcelableCopy$default instanceof LinkAttribute) {
                LinkAttribute linkAttribute = (LinkAttribute) parcelableCopy$default;
                List<FontParameter> parameters2 = linkAttribute.getParameters();
                if (parameters2 == null) {
                    parameters2 = C42784z0.f406748b;
                }
                parcelableCopy$default = LinkAttribute.copy$default(linkAttribute, null, null, null, C42745f0.h0(list, parameters2), 7, null);
            }
            arrayList.add(parcelableCopy$default);
        }
        return AttributedText.copy$default(attributedText, null, arrayList, 0, 5, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09e1 A[PHI: r13
  0x09e1: PHI (r13v57 com.avito.android.category_parameters.ParameterElement$j) = 
  (r13v4 com.avito.android.category_parameters.ParameterElement$j)
  (r13v55 com.avito.android.category_parameters.ParameterElement$j)
 binds: [B:502:0x09df, B:516:0x0a28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0f05  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0f0f  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.avito.android.category_parameters.ParameterElement$q] */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.avito.android.category_parameters.ParameterElement$Header] */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.avito.android.category_parameters.ParameterElement$Header] */
    /* JADX WARN: Type inference failed for: r13v15, types: [com.avito.android.category_parameters.ParameterElement$l] */
    /* JADX WARN: Type inference failed for: r13v16, types: [com.avito.android.category_parameters.ParameterElement$J] */
    /* JADX WARN: Type inference failed for: r13v17, types: [com.avito.android.category_parameters.ParameterElement$I] */
    /* JADX WARN: Type inference failed for: r13v18, types: [com.avito.android.category_parameters.ParameterElement$D] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.avito.android.category_parameters.ParameterElement$g] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [com.avito.android.category_parameters.ParameterElement$t] */
    /* JADX WARN: Type inference failed for: r13v21, types: [com.avito.android.category_parameters.ParameterElement$C$b] */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.avito.android.category_parameters.ParameterElement$C$b] */
    /* JADX WARN: Type inference failed for: r13v23, types: [com.avito.android.category_parameters.ParameterElement$C$a] */
    /* JADX WARN: Type inference failed for: r13v25, types: [com.avito.android.category_parameters.ParameterElement$C$b] */
    /* JADX WARN: Type inference failed for: r13v26, types: [com.avito.android.category_parameters.ParameterElement$C$a] */
    /* JADX WARN: Type inference failed for: r13v27, types: [com.avito.android.category_parameters.ParameterElement$n] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v36, types: [com.avito.android.category_parameters.ParameterElement$e] */
    /* JADX WARN: Type inference failed for: r13v39, types: [com.avito.android.category_parameters.ParameterElement$d] */
    /* JADX WARN: Type inference failed for: r13v49, types: [com.avito.android.category_parameters.ParameterElement$d] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.avito.android.category_parameters.ParameterElement$VariableLengthParameter$b] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.avito.android.category_parameters.ParameterElement$VariableLengthParameter$b] */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.avito.android.category_parameters.ParameterElement$A] */
    /* JADX WARN: Type inference failed for: r14v11, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [com.avito.android.category_parameters.ParameterElement$z] */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.avito.android.category_parameters.ParameterElement$w] */
    /* JADX WARN: Type inference failed for: r1v46, types: [com.avito.android.category_parameters.ParameterElement$p] */
    /* JADX WARN: Type inference failed for: r1v50, types: [com.avito.android.category_parameters.ParameterElement$p] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.avito.android.remote.model.category_parameters.base.BaseParameter, com.avito.android.remote.model.category_parameters.base.CategoryParameter, com.avito.android.remote.model.category_parameters.base.EditableParameter, com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r1v56, types: [com.avito.android.category_parameters.ParameterElement$H] */
    /* JADX WARN: Type inference failed for: r1v59, types: [com.avito.android.category_parameters.ParameterElement$p] */
    /* JADX WARN: Type inference failed for: r1v65, types: [com.avito.android.category_parameters.ParameterElement$q] */
    /* JADX WARN: Type inference failed for: r1v72, types: [com.avito.android.category_parameters.ParameterElement$v] */
    /* JADX WARN: Type inference failed for: r1v75, types: [com.avito.android.category_parameters.ParameterElement] */
    /* JADX WARN: Type inference failed for: r1v83, types: [com.avito.android.category_parameters.ParameterElement$C$c] */
    /* JADX WARN: Type inference failed for: r1v89, types: [com.avito.android.category_parameters.ParameterElement$C$b] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.avito.android.category_parameters.ParameterElement$y] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r3v23, types: [com.avito.android.validation.c] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v89, types: [com.avito.android.category_parameters.ParameterElement$SelectorCardsCarousel] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.avito.android.remote.model.category_parameters.slot.Slot] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v152, types: [com.avito.android.category_parameters.ParameterElement$F] */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v160, types: [com.avito.android.items.b] */
    /* JADX WARN: Type inference failed for: r4v174, types: [com.avito.android.category_parameters.ParameterElement$k] */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r62v0, types: [com.avito.android.category_parameters.a] */
    /* JADX WARN: Type inference failed for: r6v108 */
    /* JADX WARN: Type inference failed for: r6v109 */
    /* JADX WARN: Type inference failed for: r6v110, types: [com.avito.android.category_parameters.ParameterElement$r] */
    /* JADX WARN: Type inference failed for: r7v20, types: [com.avito.android.items.b] */
    /* JADX WARN: Type inference failed for: r7v25, types: [com.avito.android.items.SwitcherItem] */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.avito.android.items.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList b(@Y61.k UV0.a r63, @Y61.l com.avito.android.category_parameters.e r64, @Y61.k java.util.Set r65, @Y61.l com.avito.android.remote.model.search.Theme r66) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 3914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.b(UV0.a, com.avito.android.category_parameters.e, java.util.Set, com.avito.android.remote.model.search.Theme):java.util.ArrayList");
    }

    @Y61.l
    public String g(@Y61.k CategoryParameter categoryParameter) {
        if ((categoryParameter instanceof EditCategoryParameter) && ((EditCategoryParameter) categoryParameter).hasError()) {
            return categoryParameter.getTitle();
        }
        if (categoryParameter instanceof ResidentialComplexSelect) {
            ResidentialComplexSelect residentialComplexSelect = (ResidentialComplexSelect) categoryParameter;
            if (residentialComplexSelect.hasError()) {
                if (!residentialComplexSelect.hasValue()) {
                    return categoryParameter.getTitle();
                }
                SelectParameter.Value selectedValue = residentialComplexSelect.getSelectedValue();
                if (selectedValue != null) {
                    return selectedValue.getTitle();
                }
                return null;
            }
        }
        if (categoryParameter instanceof EditableParameter) {
            EditableParameter editableParameter = (EditableParameter) categoryParameter;
            if (editableParameter.hasError()) {
                return editableParameter.hasValue() ? this.f117632o.a(categoryParameter) : categoryParameter.getTitle();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String k(CategoryParameter categoryParameter) {
        String placeholder;
        SectionedMultiselectParameter.Displaying displaying;
        if (!(categoryParameter instanceof HasPlaceholder)) {
            return null;
        }
        DisplayingOptions displayingOptionsF = f(categoryParameter);
        if ((displayingOptionsF != null && (placeholder = displayingOptionsF.getPlaceholder()) != null) || (placeholder = ((HasPlaceholder) categoryParameter).getPlaceholder()) != null) {
            return placeholder;
        }
        boolean z12 = categoryParameter instanceof SelectParameter ? true : categoryParameter instanceof MultiselectParameter ? true : categoryParameter instanceof SectionedMultiselectParameter;
        Resources resources = this.f117618a;
        if (!z12) {
            if (categoryParameter instanceof AddressParameter) {
                return resources.getString(R.string.placeholder_select_place);
            }
            if (categoryParameter instanceof PhoneParameter) {
                return resources.getString(R.string.placeholder_enter_phone);
            }
            if (categoryParameter instanceof PriceParameter) {
                DisplayingOptions displayingOptions = ((PriceParameter) categoryParameter).getDisplayingOptions();
                return resources.getString(R.string.placeholder_price, displayingOptions != null ? displayingOptions.getPostfix() : null);
            }
            if (categoryParameter instanceof TextParameter) {
                return resources.getString(R.string.placeholder_enter_value);
            }
            if (categoryParameter instanceof DateTimeParameter) {
                return resources.getString(R.string.placeholder_date_time);
            }
            if (categoryParameter instanceof ResidentialComplexSelect) {
                return categoryParameter.getTitle();
            }
            return null;
        }
        if (categoryParameter instanceof SelectParameter.Flat) {
            SelectParameter.Displaying displaying2 = ((SelectParameter.Flat) categoryParameter).getDisplaying();
            if (displaying2 != null) {
                placeholder = displaying2.getPlaceholder();
            }
        } else if (categoryParameter instanceof MultiselectParameter) {
            MultiselectParameter.Displaying displaying3 = ((MultiselectParameter) categoryParameter).getDisplaying();
            if (displaying3 != null) {
                placeholder = displaying3.getPlaceholder();
            }
        } else if (categoryParameter instanceof SelectParameter.Sectioned) {
            SelectParameter.Displaying displaying4 = ((SelectParameter.Sectioned) categoryParameter).getDisplaying();
            if (displaying4 != null) {
                placeholder = displaying4.getPlaceholder();
            }
        } else if ((categoryParameter instanceof SectionedMultiselectParameter) && (displaying = ((SectionedMultiselectParameter) categoryParameter).getDisplaying()) != null) {
            placeholder = displaying.getPlaceholder();
        }
        return placeholder == null ? resources.getString(R.string.placeholder_choose) : placeholder;
    }

    public final ParameterElement.C29382j p(StrEarlyBookingDiscountParameter strEarlyBookingDiscountParameter) {
        IntParameter daysParameter = strEarlyBookingDiscountParameter.getDaysParameter();
        if (daysParameter != null) {
            ParameterElement.p pVarA = A(daysParameter, null);
            IntParameter percentParameter = strEarlyBookingDiscountParameter.getPercentParameter();
            if (percentParameter != null) {
                ParameterElement.p pVarA2 = A(percentParameter, null);
                String id2 = strEarlyBookingDiscountParameter.getId();
                String title = strEarlyBookingDiscountParameter.getTitle();
                return new ParameterElement.C29382j(id2, (title == null || title.length() == 0) ? null : title, strEarlyBookingDiscountParameter.isEnabled(), pVarA, pVarA2, this.f117636s);
            }
        }
        return null;
    }

    public final ParameterElement.n q(GroupMarkerParameter groupMarkerParameter) {
        if (groupMarkerParameter.getStart()) {
            this.f117636s = groupMarkerParameter.getId();
            return new ParameterElement.n.b(groupMarkerParameter.getId() + "_start", groupMarkerParameter.getTitle(), groupMarkerParameter.getDescription(), groupMarkerParameter.getIsNew());
        }
        this.f117636s = null;
        return new ParameterElement.n.a(groupMarkerParameter.getId() + "_end", null);
    }

    public final ParameterElement.C29377e t(DateTimeParameter dateTimeParameter, boolean z12) {
        Constraint constraint;
        Boolean enabled;
        Float max;
        Float min;
        Object next;
        List<Constraint> constraints = dateTimeParameter.getConstraints();
        if (constraints != null) {
            Iterator<T> it = constraints.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Constraint) next) instanceof Constraint.Limit) {
                    break;
                }
            }
            constraint = (Constraint) next;
        } else {
            constraint = null;
        }
        Constraint.Limit limit = constraint instanceof Constraint.Limit ? (Constraint.Limit) constraint : null;
        long jFloatValue = (limit == null || (min = limit.getMin()) == null) ? this.f117633p : (long) min.floatValue();
        long jNow = (limit == null || (max = limit.getMax()) == null) ? this.f117619b.now() : (long) max.floatValue();
        boolean z13 = !dateTimeParameter.hasValue() && dateTimeParameter.hasError();
        Long timestamp = dateTimeParameter.isPresentTime() ? null : dateTimeParameter.getTimestamp();
        String id2 = dateTimeParameter.getId();
        String title = dateTimeParameter.getTitle();
        boolean z14 = (dateTimeParameter.getRequired() || z12) ? false : true;
        DateTimeParameter.PresentTimeOptions presentTime = dateTimeParameter.getPresentTime();
        String title2 = presentTime != null ? presentTime.getTitle() : null;
        boolean zIsPresentTime = dateTimeParameter.isPresentTime();
        ItemWithState.State normal = z13 ? ItemWithState.State.Error.ErrorWithoutMessage.f173898b : new ItemWithState.State.Normal(null, 1, null);
        String placeholder = dateTimeParameter.getPlaceholder();
        if (placeholder == null) {
            placeholder = k(dateTimeParameter);
        }
        String str = placeholder;
        SelectionType selectionType = dateTimeParameter.getSelectionType();
        DisplayingOptions displayingOptions = dateTimeParameter.getDisplayingOptions();
        boolean zBooleanValue = (displayingOptions == null || (enabled = displayingOptions.getEnabled()) == null) ? true : enabled.booleanValue();
        DisplayingOptions displayingOptions2 = dateTimeParameter.getDisplayingOptions();
        return new ParameterElement.C29377e(id2, title, timestamp, jFloatValue, jNow, z14, title2, zIsPresentTime, selectionType, str, zBooleanValue, displayingOptions2 != null ? displayingOptions2.getTitleTipAction() : null, null, normal, z(dateTimeParameter));
    }

    public final ParameterElement.C29377e u(DateTimeRangePoint dateTimeRangePoint, String str, DateTimeParameter.Value value, boolean z12) {
        AttributedText errorMessage = dateTimeRangePoint.getErrorMessage();
        String text = errorMessage != null ? errorMessage.getText() : null;
        String title = dateTimeRangePoint.getTitle();
        Long timestamp = value != null ? DateTimeParameterKt.toTimestamp(value) : null;
        boolean z13 = (dateTimeRangePoint.getRequired() || z12) ? false : true;
        DateTimeParameter.PresentTimeOptions presentTime = dateTimeRangePoint.getPresentTime();
        return new ParameterElement.C29377e(str, title, timestamp, this.f117633p, this.f117634q, z13, presentTime != null ? presentTime.getTitle() : null, value instanceof DateTimeParameter.Value.PresentTime, dateTimeRangePoint.getSelectionType(), null, false, null, text, text != null ? new ItemWithState.State.Error.ErrorWithMessage(text) : new ItemWithState.State.Normal(null, 1, null), false, 19968, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.collections.z0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.C29379g w(com.avito.android.remote.model.category_parameters.DistrictParameter r34) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.w(com.avito.android.remote.model.category_parameters.DistrictParameter):com.avito.android.category_parameters.ParameterElement$g");
    }

    public final ParameterElement.C.a x(SelectParameter.Flat flat, SelectParameter.Flat flat2, String str, boolean z12) {
        SelectParameter.Widget.Config config;
        Boolean readOnly;
        SelectParameter.Widget.Config config2;
        Boolean readOnly2;
        SelectParameter.Displaying displaying = flat.getDisplaying();
        ParameterElement.DisplayType displayTypeV = displaying != null ? v(displaying) : null;
        SelectParameter.Displaying displaying2 = flat.getDisplaying();
        SelectParameter.Displaying.LabelPosition labelPosition = displaying2 != null ? displaying2.getLabelPosition() : null;
        ArrayList arrayListK = K(d(flat.getValues(), flat.getAvailableOptions()), flat.getSelectedValue(), labelPosition);
        ArrayList arrayListK2 = K(d(flat2.getValues(), flat2.getAvailableOptions()), flat2.getSelectedValue(), labelPosition);
        SelectParameter.Value selectedValue = flat.getSelectedValue();
        m mVarJ = selectedValue != null ? J(selectedValue, true, labelPosition) : null;
        SelectParameter.Value selectedValue2 = flat2.getSelectedValue();
        m mVarJ2 = selectedValue2 != null ? J(selectedValue2, true, labelPosition) : null;
        SelectParameter.Displaying displaying3 = flat.getDisplaying();
        TipIconParameters tipIconParameters = displaying3 != null ? displaying3.getTipIconParameters() : null;
        SelectParameter.Displaying displaying4 = flat.getDisplaying();
        String id2 = flat.getId();
        String title = str == null ? flat.getTitle() : str;
        AttributedText subtitle = flat.getSubtitle();
        AttributedText motivation = flat.getMotivation();
        C36000c c36000c = this.f117632o;
        String strA = c36000c.a(flat);
        String strG = g(flat);
        boolean required = flat.getRequired();
        String strK = k(flat);
        boolean zR2 = r(flat);
        SelectParameter.Widget widget = flat.getWidget();
        ParameterElement.C.b bVar = new ParameterElement.C.b(id2, title, subtitle, strA, motivation, displaying4, null, mVarJ, arrayListK, displayTypeV, strG, required, true, true, strK, null, zR2, true, tipIconParameters, null, null, false, false, (widget == null || (config2 = widget.getConfig()) == null || (readOnly2 = config2.getReadOnly()) == null) ? false : readOnly2.booleanValue(), null, null, null, null, null, 0, null, null, false, -8880064, 1, null);
        String id3 = flat2.getId();
        String title2 = flat2.getTitle();
        AttributedText subtitle2 = flat2.getSubtitle();
        AttributedText motivation2 = flat2.getMotivation();
        String strA2 = c36000c.a(flat2);
        String strG2 = g(flat2);
        boolean required2 = flat2.getRequired();
        String strK2 = k(flat2);
        boolean zR3 = r(flat2);
        SelectParameter.Widget widget2 = flat.getWidget();
        return new ParameterElement.C.a(flat.getId(), bVar, new ParameterElement.C.b(id3, title2, subtitle2, strA2, motivation2, displaying4, null, mVarJ2, arrayListK2, displayTypeV, strG2, required2, true, true, strK2, null, zR3, true, tipIconParameters, null, null, false, false, (widget2 == null || (config = widget2.getConfig()) == null || (readOnly = config.getReadOnly()) == null) ? false : readOnly.booleanValue(), null, null, null, null, null, 0, null, null, false, -8880064, 1, null), z12, this.f117636s);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.category_parameters.ParameterElement.l y(com.avito.android.remote.model.category_parameters.FileUploaderParameter r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_parameters.a.y(com.avito.android.remote.model.category_parameters.FileUploaderParameter):com.avito.android.category_parameters.ParameterElement$l");
    }
}
