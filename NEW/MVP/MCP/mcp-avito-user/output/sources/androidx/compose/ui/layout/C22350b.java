package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22350b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22387u f40439a = new C22387u(a.f40441b, null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22387u f40440b = new C22387u(C1666b.f40442b, null);

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.b$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40441b = new a();

        public a() {
            super(2, kotlin.math.b.class, "min", "min(II)I", 1);
        }

        @Override // Y41.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1666b extends kotlin.jvm.internal.H implements Y41.p<Integer, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1666b f40442b = new C1666b();

        public C1666b() {
            super(2, kotlin.math.b.class, "max", "max(II)I", 1);
        }

        @Override // Y41.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
