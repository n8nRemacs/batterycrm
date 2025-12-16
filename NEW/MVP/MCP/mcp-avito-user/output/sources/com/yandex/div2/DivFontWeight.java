package com.yandex.div2;

import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivFontWeight.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivFontWeight;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public enum DivFontWeight {
    LIGHT(FontStyleKt.LIGHT),
    MEDIUM("medium"),
    REGULAR(FontStyleKt.REGULAR),
    BOLD(FontStyleKt.BOLD);


    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f371447c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, DivFontWeight> f371448d = a.f371455l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f371454b;

    /* compiled from: DivFontWeight.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivFontWeight;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, DivFontWeight> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371455l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final DivFontWeight invoke(String str) {
            String str2 = str;
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            if (str2.equals(FontStyleKt.LIGHT)) {
                return divFontWeight;
            }
            DivFontWeight divFontWeight2 = DivFontWeight.MEDIUM;
            if (str2.equals("medium")) {
                return divFontWeight2;
            }
            DivFontWeight divFontWeight3 = DivFontWeight.REGULAR;
            if (str2.equals(FontStyleKt.REGULAR)) {
                return divFontWeight3;
            }
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            if (str2.equals(FontStyleKt.BOLD)) {
                return divFontWeight4;
            }
            return null;
        }
    }

    /* compiled from: DivFontWeight.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivFontWeight$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    DivFontWeight(String str) {
        this.f371454b = str;
    }
}
