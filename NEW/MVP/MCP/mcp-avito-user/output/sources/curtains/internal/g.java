package curtains.internal;

import Y41.l;
import Y61.k;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: WindowCallbackWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcurtains/internal/g;", "Lcurtains/internal/b;", "c", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class g extends curtains.internal.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f393013b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f393014c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f393015d = new c(null);

    /* compiled from: WindowCallbackWrapper.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class a extends N implements Y41.a<Field> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f393016l = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Field invoke() {
            g.f393015d.getClass();
            Class cls = (Class) g.f393013b.getValue();
            if (cls == null) {
                return null;
            }
            try {
                Field declaredField = cls.getDeclaredField("mWrapped");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: WindowCallbackWrapper.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class b extends N implements Y41.a<Class<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f393017l = new b();

        public b() {
            super(0);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
            */
        @Override // Y41.a
        public final java.lang.Class<? extends java.lang.Object> invoke() {
            /*
                r1 = this;
                java.lang.Class<androidx.appcompat.view.WindowCallbackWrapper> r0 = androidx.appcompat.view.WindowCallbackWrapper.class
                goto Lb
            L3:
                java.lang.String r0 = "android.support.v7.view.WindowCallbackWrapper"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> La
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: curtains.internal.g.b.invoke():java.lang.Object");
        }
    }

    /* compiled from: WindowCallbackWrapper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcurtains/internal/g$c;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/view/Window;", "Ljava/lang/ref/WeakReference;", "Lcurtains/internal/g;", "callbackCache", "Ljava/util/WeakHashMap;", "listenersLock", "Ljava/lang/Object;", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: WindowCallbackWrapper.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"curtains/internal/g$d", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Lcurtains/b;", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class d implements l<KeyEvent, curtains.b> {
        public d() {
            throw null;
        }

        @Override // Y41.l
        public final curtains.b invoke(KeyEvent keyEvent) {
            throw null;
        }
    }

    /* compiled from: WindowCallbackWrapper.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"curtains/internal/g$e", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lcurtains/b;", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class e implements l<MotionEvent, curtains.b> {
        public e() {
            throw null;
        }

        @Override // Y41.l
        public final curtains.b invoke(MotionEvent motionEvent) {
            throw null;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        f393013b = C42727D.b(lazyThreadSafetyMode, b.f393017l);
        f393014c = C42727D.b(lazyThreadSafetyMode, a.f393016l);
        new WeakHashMap();
    }

    @Override // curtains.internal.b, android.view.Window.Callback
    public final boolean dispatchKeyEvent(@Y61.l KeyEvent keyEvent) {
        keyEvent.getClass();
        throw null;
    }

    @Override // curtains.internal.b, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Y61.l MotionEvent motionEvent) {
        motionEvent.getClass();
        throw null;
    }

    @Override // curtains.internal.b, android.view.Window.Callback
    public final void onContentChanged() {
        throw null;
    }

    @Override // curtains.internal.b, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z12) {
        throw null;
    }
}
