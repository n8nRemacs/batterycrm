package com.avito.android.lib.design;

import Y61.k;
import com.avito.android.blurlayout.BlurLayout;
import com.avito.android.lib.design.input.r;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DesignSystem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f178171b;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f178173d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f178170a = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static N f178172c = b.f178176l;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static N f178174e = C5251a.f178175l;

    /* compiled from: DesignSystem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.a$a, reason: collision with other inner class name */
    public static final class C5251a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5251a f178175l = new C5251a();

        public C5251a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: DesignSystem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f178176l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@k Y41.a aVar, @k Y41.a aVar2, boolean z12, @k Y41.a aVar3, @k Y41.a aVar4) {
        if (f178171b) {
            throw new IllegalStateException("Инициализация уже выполнена");
        }
        f178173d = z12;
        f178172c = (N) aVar3;
        f178174e = (N) aVar4;
        BlurLayout.b bVar = BlurLayout.f106790f;
        com.avito.android.lib.design.b bVar2 = com.avito.android.lib.design.b.f178357l;
        bVar.getClass();
        BlurLayout.f106791g = bVar2;
        com.avito.android.lib.compose.design.shared.blur_overlay_box.a aVar5 = com.avito.android.lib.compose.design.shared.blur_overlay_box.a.f177662a;
        c cVar = c.f178658l;
        aVar5.getClass();
        com.avito.android.lib.compose.design.shared.blur_overlay_box.a.f177663b = cVar;
        TabBarLayout.f180679h.getClass();
        TabBarLayout.f180683l = aVar;
        r.f179417a.getClass();
        r.f179418b = (N) aVar2;
        f178171b = true;
    }
}
