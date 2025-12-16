package com.avito.android.beduin.common.shared.tabs;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.shared.tabs.d;
import com.avito.android.lib.deprecated_design.tab.adapter.c;
import com.avito.android.lib.deprecated_design.tab.adapter.f;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabLayoutWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/shared/tabs/a;", "Lcom/avito/android/beduin/common/shared/tabs/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BeduinTabStyle f103465a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<com.avito.android.lib.deprecated_design.tab.a> f103466b = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();

    /* renamed from: c, reason: collision with root package name */
    @l
    public N f103467c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AvitoTabLayout f103468d;

    /* compiled from: BeduinTabLayoutWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.shared.tabs.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3102a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103469a;

        static {
            int[] iArr = new int[BeduinTabStyle.values().length];
            try {
                iArr[BeduinTabStyle.AVITO_TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_TABS_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_TABS_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_TABS_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_BLACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeduinTabStyle.TABS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_NON_TRANSPARENT_TABS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f103469a = iArr;
        }
    }

    /* compiled from: BeduinTabLayoutWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, f> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f103470b = new b();

        public b() {
            super(1, f.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // Y41.l
        public final f invoke(View view) {
            return new f(view);
        }
    }

    public a(@k Context context, @k BeduinTabStyle beduinTabStyle) {
        this.f103465a = beduinTabStyle;
        Integer num = beduinTabStyle.f103464b;
        AvitoTabLayout avitoTabLayout = new AvitoTabLayout(num != null ? new androidx.appcompat.view.d(context, num.intValue()) : context, null, a(beduinTabStyle), 2, null);
        avitoTabLayout.setId(R.id.beduin_tab_container);
        new ViewGroup.LayoutParams(-1, -2);
        this.f103468d = avitoTabLayout;
        avitoTabLayout.a(new c());
    }

    @InterfaceC42150f
    public static int a(BeduinTabStyle beduinTabStyle) {
        switch (C3102a.f103469a[beduinTabStyle.ordinal()]) {
            case 1:
            case 2:
                return R.attr.tabLayoutLarge;
            case 3:
                return R.attr.tabLayoutMedium;
            case 4:
                return R.attr.tabLayoutSmall;
            case 5:
                return R.attr.tabLayoutBlack;
            case 6:
            case 7:
                throw new IllegalStateException("Must be handled by BeduinChipTabLayout");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final void Qa(int i12) {
        c.i iVarJ = this.f103468d.j(i12);
        if (iVarJ != null) {
            iVarJ.b();
        }
    }

    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final ViewGroup getView() {
        return this.f103468d;
    }

    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final void mc(@k List<? extends com.avito.android.lib.deprecated_design.tab.a> list) {
        AvitoTabLayout avitoTabLayout = this.f103468d;
        if (avitoTabLayout.getTag() == null || !d.a.a(com.avito.android.lib.deprecated_design.tab.l.c(avitoTabLayout), list)) {
            UV0.c cVar = new UV0.c(list);
            com.avito.android.lib.deprecated_design.tab.adapter.k<com.avito.android.lib.deprecated_design.tab.a> kVar = this.f103466b;
            kVar.f178156a = cVar;
            c.b bVar = com.avito.android.lib.deprecated_design.tab.adapter.c.f178142f;
            Context context = avitoTabLayout.getContext();
            int iA2 = a(this.f103465a);
            b bVar2 = b.f103470b;
            bVar.getClass();
            com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, new com.avito.android.lib.deprecated_design.tab.adapter.c(kVar, context, iA2 == R.attr.tabLayoutMedium ? R.layout.tab_with_counter_redesign_medium : iA2 == R.attr.tabLayoutSmall ? R.layout.tab_with_counter_redesign_small : iA2 == R.attr.tabLayoutBlack ? R.layout.tab_with_counter_redesign_black : R.layout.tab_with_counter_redesign, bVar2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.beduin.common.shared.tabs.d
    public final void nc(@l Y41.l<? super Integer, G0> lVar) {
        this.f103467c = (N) lVar;
    }

    /* compiled from: TabLayouts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/deprecated_design/tab/g", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements c.f {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@k c.i iVar) {
            a aVar = a.this;
            ?? r02 = aVar.f103467c;
            if (r02 != 0) {
                r02.invoke(Integer.valueOf(aVar.f103468d.getSelectedTabPosition()));
            }
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@k c.i iVar) {
        }
    }
}
