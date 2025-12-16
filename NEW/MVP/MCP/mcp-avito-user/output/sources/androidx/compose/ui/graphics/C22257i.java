package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.platform.AndroidComposeView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import n0.C44161a;

/* compiled from: AndroidGraphicsContext.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/i;", "Landroidx/compose/ui/graphics/l0;", "a", "b", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22257i implements InterfaceC22264l0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f39513d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f39514a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f39515b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public n0.c f39516c;

    /* compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/i$a;", "", "<init>", "()V", "", "enableLayerPersistence", "Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.i$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/i$b;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    /* renamed from: androidx.compose.ui.graphics.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f39517a = 0;

        static {
            new b();
        }
    }

    static {
        new a(null);
        f39513d = true;
    }

    public C22257i(@Y61.k AndroidComposeView androidComposeView) {
        this.f39514a = androidComposeView;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22264l0
    @Y61.k
    public final C22267c a() {
        long uniqueDrawingId;
        androidx.compose.ui.graphics.layer.g lVar;
        C22267c c22267c;
        synchronized (this.f39515b) {
            try {
                AndroidComposeView androidComposeView = this.f39514a;
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    int i13 = b.f39517a;
                    uniqueDrawingId = androidComposeView.getUniqueDrawingId();
                } else {
                    uniqueDrawingId = -1;
                }
                if (i12 >= 29) {
                    lVar = new androidx.compose.ui.graphics.layer.k(uniqueDrawingId, null, null, 6, null);
                } else if (f39513d) {
                    try {
                        lVar = new androidx.compose.ui.graphics.layer.i(this.f39514a, uniqueDrawingId, null, null, 12, null);
                    } catch (Throwable unused) {
                        f39513d = false;
                        lVar = new androidx.compose.ui.graphics.layer.l(c(this.f39514a), uniqueDrawingId, null, null, 12, null);
                    }
                } else {
                    lVar = new androidx.compose.ui.graphics.layer.l(c(this.f39514a), uniqueDrawingId, null, null, 12, null);
                }
                c22267c = new C22267c(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22267c;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22264l0
    public final void b(@Y61.k C22267c c22267c) {
        synchronized (this.f39515b) {
            if (!c22267c.f39594s) {
                c22267c.f39594s = true;
                c22267c.b();
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final C44161a c(AndroidComposeView androidComposeView) {
        n0.c cVar = this.f39516c;
        if (cVar != null) {
            return cVar;
        }
        n0.c cVar2 = new n0.c(androidComposeView.getContext());
        cVar2.setClipChildren(false);
        cVar2.setClipToPadding(false);
        cVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(cVar2, -1);
        this.f39516c = cVar2;
        return cVar2;
    }
}
