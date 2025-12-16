package com.avito.beduin.v2.avito.component.image.state;

import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scale.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/Scale;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Scale {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f334399d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scale f334400e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scale f334401f;

    /* renamed from: g, reason: collision with root package name */
    public static final Scale f334402g;

    /* renamed from: h, reason: collision with root package name */
    public static final Scale f334403h;

    /* renamed from: i, reason: collision with root package name */
    public static final Scale f334404i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ Scale[] f334405j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334406k;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334407b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f334408c = C42727D.c(new b());

    /* compiled from: Scale.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/Scale$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Scale a(@Y61.k String str) {
            for (Scale scale : Scale.values()) {
                if (L.f((String) scale.f334408c.getValue(), str.toLowerCase(Locale.ROOT))) {
                    return scale;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public a() {
        }
    }

    /* compiled from: Scale.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return Scale.this.f334407b.toLowerCase(Locale.ROOT);
        }
    }

    static {
        Scale scale = new Scale("None", 0, "none");
        f334400e = scale;
        Scale scale2 = new Scale("Fit", 1, "fit");
        f334401f = scale2;
        Scale scale3 = new Scale("Crop", 2, "crop");
        f334402g = scale3;
        Scale scale4 = new Scale("Inside", 3, "inside");
        f334403h = scale4;
        Scale scale5 = new Scale("FillBounds", 4, "fillBounds");
        f334404i = scale5;
        Scale[] scaleArr = {scale, scale2, scale3, scale4, scale5};
        f334405j = scaleArr;
        f334406k = kotlin.enums.c.a(scaleArr);
        f334399d = new a(null);
    }

    public Scale(String str, int i12, String str2) {
        this.f334407b = str2;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f334405j.clone();
    }
}
