package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SwipeToDismissBox.kt */
@InterfaceC21537e7
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/gh;", "", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21593gh {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f36446a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C21916v<SwipeToDismissBoxValue> f36447b;

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "invoke", "(Landroidx/compose/material3/SwipeToDismissBoxValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.gh$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<SwipeToDismissBoxValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f36448l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/gh$b;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.gh$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.gh$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(C21593gh.this.f36446a.M0(C21570fh.f36350a));
        }
    }

    static {
        new b(null);
    }

    public C21593gh(@Y61.k SwipeToDismissBoxValue swipeToDismissBoxValue, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k Y41.l<? super SwipeToDismissBoxValue, Boolean> lVar, @Y61.k Y41.l<? super Float, Float> lVar2) {
        this.f36446a = dVar;
        C21758o.f36922a.getClass();
        this.f36447b = new C21916v<>(swipeToDismissBoxValue, lVar2, new c(), C21758o.f36923b, lVar);
    }

    public /* synthetic */ C21593gh(SwipeToDismissBoxValue swipeToDismissBoxValue, androidx.compose.ui.unit.d dVar, Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
        this(swipeToDismissBoxValue, dVar, (i12 & 4) != 0 ? a.f36448l : lVar, lVar2);
    }
}
