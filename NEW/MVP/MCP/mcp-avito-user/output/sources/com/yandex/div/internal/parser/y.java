package com.yandex.div.internal.parser;

import android.net.Uri;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.yandex.div.evaluable.types.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParsingConverters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*.\u0010\u0003\u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0001\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlin/Function1;", "Converter", "div-json_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Object, Integer> f370147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, Uri> f370148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Object, Boolean> f370149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Number, Double> f370150d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Number, Long> f370151e;

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "value", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f370152l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            if (!(obj instanceof Number)) {
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                throw new ClassCastException("Received value of wrong type");
            }
            Y41.l<Object, Integer> lVar = y.f370147a;
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 0) {
                return Boolean.FALSE;
            }
            if (iIntValue != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends N implements Y41.l<Integer, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f370153l = 0;

        static {
            new b();
        }

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(Integer num) {
            return com.yandex.div.evaluable.types.a.b(num.intValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "n", "", "invoke", "(Ljava/lang/Number;)Ljava/lang/Double;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends N implements Y41.l<Number, Double> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f370154l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Double invoke(Number number) {
            return Double.valueOf(number.doubleValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "n", "", "invoke", "(Ljava/lang/Number;)Ljava/lang/Long;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends N implements Y41.l<Number, Long> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f370155l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Long invoke(Number number) {
            return Long.valueOf(number.longValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "value", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends N implements Y41.l<Object, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f370156l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Integer invoke(Object obj) {
            if (obj instanceof String) {
                com.yandex.div.evaluable.types.a.f369990b.getClass();
                return Integer.valueOf(a.C10920a.b((String) obj));
            }
            if (obj instanceof com.yandex.div.evaluable.types.a) {
                return Integer.valueOf(((com.yandex.div.evaluable.types.a) obj).f369991a);
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "value", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class f extends N implements Y41.l<String, Uri> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f370157l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class g extends N implements Y41.l<Uri, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f370158l = 0;

        static {
            new g();
        }

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(Uri uri) {
            return uri.toString();
        }
    }

    static {
        int i12 = b.f370153l;
        f370147a = e.f370156l;
        int i13 = g.f370158l;
        f370148b = f.f370157l;
        f370149c = a.f370152l;
        f370150d = c.f370154l;
        f370151e = d.f370155l;
    }
}
