package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
@s0
/* loaded from: classes8.dex */
public final class DescriptorRendererModifier {

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Set<DescriptorRendererModifier> f409429c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Set<DescriptorRendererModifier> f409430d;

    /* renamed from: e, reason: collision with root package name */
    public static final DescriptorRendererModifier f409431e;

    /* renamed from: f, reason: collision with root package name */
    public static final DescriptorRendererModifier f409432f;

    /* renamed from: g, reason: collision with root package name */
    public static final DescriptorRendererModifier f409433g;

    /* renamed from: h, reason: collision with root package name */
    public static final DescriptorRendererModifier f409434h;

    /* renamed from: i, reason: collision with root package name */
    public static final DescriptorRendererModifier f409435i;

    /* renamed from: j, reason: collision with root package name */
    public static final DescriptorRendererModifier f409436j;

    /* renamed from: k, reason: collision with root package name */
    public static final DescriptorRendererModifier f409437k;

    /* renamed from: l, reason: collision with root package name */
    public static final DescriptorRendererModifier f409438l;

    /* renamed from: m, reason: collision with root package name */
    public static final DescriptorRendererModifier f409439m;

    /* renamed from: n, reason: collision with root package name */
    public static final DescriptorRendererModifier f409440n;

    /* renamed from: o, reason: collision with root package name */
    public static final DescriptorRendererModifier f409441o;

    /* renamed from: p, reason: collision with root package name */
    public static final DescriptorRendererModifier f409442p;

    /* renamed from: q, reason: collision with root package name */
    public static final DescriptorRendererModifier f409443q;

    /* renamed from: r, reason: collision with root package name */
    public static final DescriptorRendererModifier f409444r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ DescriptorRendererModifier[] f409445s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409446t;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f409447b;

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        DescriptorRendererModifier descriptorRendererModifier = new DescriptorRendererModifier("VISIBILITY", 0, true);
        f409431e = descriptorRendererModifier;
        DescriptorRendererModifier descriptorRendererModifier2 = new DescriptorRendererModifier("MODALITY", 1, true);
        f409432f = descriptorRendererModifier2;
        DescriptorRendererModifier descriptorRendererModifier3 = new DescriptorRendererModifier("OVERRIDE", 2, true);
        f409433g = descriptorRendererModifier3;
        DescriptorRendererModifier descriptorRendererModifier4 = new DescriptorRendererModifier("ANNOTATIONS", 3, false);
        f409434h = descriptorRendererModifier4;
        DescriptorRendererModifier descriptorRendererModifier5 = new DescriptorRendererModifier("INNER", 4, true);
        f409435i = descriptorRendererModifier5;
        DescriptorRendererModifier descriptorRendererModifier6 = new DescriptorRendererModifier("MEMBER_KIND", 5, true);
        f409436j = descriptorRendererModifier6;
        DescriptorRendererModifier descriptorRendererModifier7 = new DescriptorRendererModifier("DATA", 6, true);
        f409437k = descriptorRendererModifier7;
        DescriptorRendererModifier descriptorRendererModifier8 = new DescriptorRendererModifier("INLINE", 7, true);
        f409438l = descriptorRendererModifier8;
        DescriptorRendererModifier descriptorRendererModifier9 = new DescriptorRendererModifier("EXPECT", 8, true);
        f409439m = descriptorRendererModifier9;
        DescriptorRendererModifier descriptorRendererModifier10 = new DescriptorRendererModifier("ACTUAL", 9, true);
        f409440n = descriptorRendererModifier10;
        DescriptorRendererModifier descriptorRendererModifier11 = new DescriptorRendererModifier("CONST", 10, true);
        f409441o = descriptorRendererModifier11;
        DescriptorRendererModifier descriptorRendererModifier12 = new DescriptorRendererModifier("LATEINIT", 11, true);
        f409442p = descriptorRendererModifier12;
        DescriptorRendererModifier descriptorRendererModifier13 = new DescriptorRendererModifier("FUN", 12, true);
        f409443q = descriptorRendererModifier13;
        DescriptorRendererModifier descriptorRendererModifier14 = new DescriptorRendererModifier("VALUE", 13, true);
        f409444r = descriptorRendererModifier14;
        DescriptorRendererModifier[] descriptorRendererModifierArr = {descriptorRendererModifier, descriptorRendererModifier2, descriptorRendererModifier3, descriptorRendererModifier4, descriptorRendererModifier5, descriptorRendererModifier6, descriptorRendererModifier7, descriptorRendererModifier8, descriptorRendererModifier9, descriptorRendererModifier10, descriptorRendererModifier11, descriptorRendererModifier12, descriptorRendererModifier13, descriptorRendererModifier14};
        f409445s = descriptorRendererModifierArr;
        f409446t = kotlin.enums.c.a(descriptorRendererModifierArr);
        new a(null);
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier15 : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier15.f409447b) {
                arrayList.add(descriptorRendererModifier15);
            }
        }
        f409429c = C42745f0.P0(arrayList);
        f409430d = C42756l.l0(values());
    }

    public DescriptorRendererModifier(String str, int i12, boolean z12) {
        this.f409447b = z12;
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) f409445s.clone();
    }
}
