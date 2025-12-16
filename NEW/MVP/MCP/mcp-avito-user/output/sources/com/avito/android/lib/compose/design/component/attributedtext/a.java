package com.avito.android.lib.compose.design.component.attributedtext;

import Y41.l;
import Y41.p;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AttributedText.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_compose_component_attributed-text"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.compose.design.component.attributedtext.a$a, reason: collision with other inner class name */
    public static final class C5237a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f177573l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177574m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177575n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f177576o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f177577p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f177578q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5237a(v vVar, l<? super com.avito.android.lib.design.text_view.a, G0> lVar, l<? super com.avito.android.lib.design.text_view.a, G0> lVar2, int i12, int i13, int i14) {
            super(2);
            this.f177573l = vVar;
            this.f177574m = lVar;
            this.f177575n = lVar2;
            this.f177576o = i12;
            this.f177577p = i13;
            this.f177578q = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f177577p | 1);
            l<com.avito.android.lib.design.text_view.a, G0> lVar = this.f177574m;
            a.a(this.f177573l, lVar, this.f177575n, this.f177576o, a12, iA2, this.f177578q);
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f177579l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f177580l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f177581l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177582m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i12, l<? super com.avito.android.lib.design.text_view.a, G0> lVar) {
            super(1);
            this.f177581l = i12;
            this.f177582m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            com.avito.android.lib.design.text_view.a aVar2 = aVar;
            aVar2.setTextAppearance(C35835l0.j(this.f177581l, aVar2.getContext()));
            this.f177582m.invoke(aVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177583l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AttributedText f177584m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.b f177585n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(l<? super com.avito.android.lib.design.text_view.a, G0> lVar, AttributedText attributedText, com.avito.android.util.text.b bVar) {
            super(1);
            this.f177583l = lVar;
            this.f177584m = attributedText;
            this.f177585n = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            com.avito.android.lib.design.text_view.a aVar2 = aVar;
            this.f177583l.invoke(aVar2);
            com.avito.android.util.text.j.a(aVar2, this.f177584m, this.f177585n);
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f177586l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f177587m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f177588n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177589o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177590p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f177591q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f177592r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f177593s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(AttributedText attributedText, v vVar, int i12, l<? super com.avito.android.lib.design.text_view.a, G0> lVar, l<? super com.avito.android.lib.design.text_view.a, G0> lVar2, int i13, int i14, int i15) {
            super(2);
            this.f177586l = attributedText;
            this.f177587m = vVar;
            this.f177588n = i12;
            this.f177589o = lVar;
            this.f177590p = lVar2;
            this.f177591q = i13;
            this.f177592r = i14;
            this.f177593s = i15;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f177592r | 1);
            l<com.avito.android.lib.design.text_view.a, G0> lVar = this.f177589o;
            a.b(this.f177586l, this.f177587m, this.f177588n, lVar, this.f177590p, this.f177591q, a12, iA2, this.f177593s);
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f177594l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements l<com.avito.android.lib.design.text_view.a, G0> {
        static {
            new h();
        }

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "ctx", "Lcom/avito/android/lib/design/text_view/a;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/text_view/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements l<Context, com.avito.android.lib.design.text_view.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f177595l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177596m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(int i12, l<? super com.avito.android.lib.design.text_view.a, G0> lVar) {
            super(1);
            this.f177595l = i12;
            this.f177596m = lVar;
        }

        @Override // Y41.l
        public final com.avito.android.lib.design.text_view.a invoke(Context context) {
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(new ContextThemeWrapper(context, this.f177595l), null, 0, 0, 14, null);
            this.f177596m.invoke(aVar);
            return aVar;
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.text_view.a, G0> f177597l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(l<? super com.avito.android.lib.design.text_view.a, G0> lVar) {
            super(1);
            this.f177597l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            this.f177597l.invoke(aVar);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l androidx.compose.ui.v r15, @Y61.l Y41.l<? super com.avito.android.lib.design.text_view.a, kotlin.G0> r16, @Y61.l Y41.l<? super com.avito.android.lib.design.text_view.a, kotlin.G0> r17, @j.f0 int r18, @Y61.l androidx.compose.runtime.A r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.compose.design.component.attributedtext.a.a(androidx.compose.ui.v, Y41.l, Y41.l, int, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.avito.android.remote.model.text.AttributedText r16, @Y61.l androidx.compose.ui.v r17, @j.InterfaceC42150f int r18, @Y61.l Y41.l<? super com.avito.android.lib.design.text_view.a, kotlin.G0> r19, @Y61.l Y41.l<? super com.avito.android.lib.design.text_view.a, kotlin.G0> r20, @j.f0 int r21, @Y61.l androidx.compose.runtime.A r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.compose.design.component.attributedtext.a.b(com.avito.android.remote.model.text.AttributedText, androidx.compose.ui.v, int, Y41.l, Y41.l, int, androidx.compose.runtime.A, int, int):void");
    }
}
