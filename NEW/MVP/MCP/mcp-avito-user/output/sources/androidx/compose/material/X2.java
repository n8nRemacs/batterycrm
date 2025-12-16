package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SwipeToDismiss.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/X2;", "Landroidx/compose/material/ka;", "Landroidx/compose/material/DismissValue;", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC21154e4
/* loaded from: classes.dex */
public final class X2 extends C21238ka<DismissValue> {

    /* compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DismissValue;", "invoke", "(Landroidx/compose/material/DismissValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<DismissValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33348l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(DismissValue dismissValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/X2$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public /* synthetic */ X2(DismissValue dismissValue, Y41.l lVar, int i12, C42822w c42822w) {
        this(dismissValue, (i12 & 2) != 0 ? a.f33348l : lVar);
    }

    public X2(@Y61.k DismissValue dismissValue, @Y61.k Y41.l<? super DismissValue, Boolean> lVar) {
        super(dismissValue, null, lVar, 2, null);
    }
}
