package com.avito.android.lib.beduin_v2.component.input;

import android.content.Context;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AbstractC22450a;
import com.akita.compose.component.input.InputState;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputFormat;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InputCompose.kt */
@F3
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R*\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R+\u00100\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020*8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00106\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0005\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/k;", "Landroidx/compose/ui/platform/a;", "Lcom/avito/android/lib/beduin_v2/component/input/C;", "<set-?>", "j", "Landroidx/compose/runtime/y1;", "getState$_design_modules_beduin_v2_renderer_component_input", "()Lcom/avito/android/lib/beduin_v2/component/input/C;", "setState$_design_modules_beduin_v2_renderer_component_input", "(Lcom/avito/android/lib/beduin_v2/component/input/C;)V", VoiceInfo.STATE, "Lkotlin/Function1;", "", "Lkotlin/G0;", "k", "LY41/l;", "getOnTextChanged$_design_modules_beduin_v2_renderer_component_input", "()LY41/l;", "setOnTextChanged$_design_modules_beduin_v2_renderer_component_input", "(LY41/l;)V", "onTextChanged", "", "l", "getOnFocusChanged$_design_modules_beduin_v2_renderer_component_input", "setOnFocusChanged$_design_modules_beduin_v2_renderer_component_input", "onFocusChanged", "Lkotlin/Function0;", "m", "LY41/a;", "getOnIconStartClick$_design_modules_beduin_v2_renderer_component_input", "()LY41/a;", "setOnIconStartClick$_design_modules_beduin_v2_renderer_component_input", "(LY41/a;)V", "onIconStartClick", "n", "getOnIconEndClick$_design_modules_beduin_v2_renderer_component_input", "setOnIconEndClick$_design_modules_beduin_v2_renderer_component_input", "onIconEndClick", "o", "getOnDone$_design_modules_beduin_v2_renderer_component_input", "setOnDone$_design_modules_beduin_v2_renderer_component_input", "onDone", "Lcom/avito/android/lib/beduin_v2/component/input/F;", "p", "getStyle$_design_modules_beduin_v2_renderer_component_input", "()Lcom/avito/android/lib/beduin_v2/component/input/F;", "setStyle$_design_modules_beduin_v2_renderer_component_input", "(Lcom/avito/android/lib/beduin_v2/component/input/F;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "q", "getRequestKeyboard", "()Z", "setRequestKeyboard", "(Z)V", "requestKeyboard", "_design-modules_beduin-v2_renderer_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 state;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super String, G0> onTextChanged;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super Boolean, G0> onFocusChanged;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<G0> onIconStartClick;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<G0> onIconEndClick;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<G0> onDone;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 style;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 requestKeyboard;

    /* compiled from: InputCompose.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a() {
            super(2);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r18, java.lang.Integer r19) {
            /*
                Method dump skipped, instructions count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.k.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InputCompose.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            k.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: InputCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f175722l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: InputCompose.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f175723l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: InputCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f175724l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: InputCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f175725l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: InputCompose.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f175726l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    public k(@Y61.k Context context) {
        super(context, null, 0, 6, null);
        this.state = C22126m3.g(new C("", "", true, InputState.f61668b, false, false, false, AvitoInputFormat.f334458d, "", "", "", "", "", false));
        this.onTextChanged = g.f175726l;
        this.onFocusChanged = d.f175723l;
        this.onIconStartClick = f.f175725l;
        this.onIconEndClick = e.f175724l;
        this.onDone = c.f175722l;
        this.style = C22126m3.g(new F("regularMedium", null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null));
        this.requestKeyboard = C22126m3.g(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getRequestKeyboard() {
        return ((Boolean) ((C22082i3) this.requestKeyboard).getF42167b()).booleanValue();
    }

    public static final void k(k kVar) {
        kVar.setRequestKeyboard(false);
    }

    private final void setRequestKeyboard(boolean z12) {
        ((C22082i3) this.requestKeyboard).setValue(Boolean.valueOf(z12));
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(277836328);
        if ((((bE2.B(this) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(806902723, new a(), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    @Y61.l
    public final Y41.a<G0> getOnDone$_design_modules_beduin_v2_renderer_component_input() {
        return this.onDone;
    }

    @Y61.l
    public final Y41.l<Boolean, G0> getOnFocusChanged$_design_modules_beduin_v2_renderer_component_input() {
        return this.onFocusChanged;
    }

    @Y61.l
    public final Y41.a<G0> getOnIconEndClick$_design_modules_beduin_v2_renderer_component_input() {
        return this.onIconEndClick;
    }

    @Y61.l
    public final Y41.a<G0> getOnIconStartClick$_design_modules_beduin_v2_renderer_component_input() {
        return this.onIconStartClick;
    }

    @Y61.l
    public final Y41.l<String, G0> getOnTextChanged$_design_modules_beduin_v2_renderer_component_input() {
        return this.onTextChanged;
    }

    @Y61.k
    public final C getState$_design_modules_beduin_v2_renderer_component_input() {
        return (C) ((C22082i3) this.state).getF42167b();
    }

    @Y61.k
    public final F getStyle$_design_modules_beduin_v2_renderer_component_input() {
        return (F) ((C22082i3) this.style).getF42167b();
    }

    public final void l() {
        setRequestKeyboard(true);
    }

    public final void setOnDone$_design_modules_beduin_v2_renderer_component_input(@Y61.l Y41.a<G0> aVar) {
        this.onDone = aVar;
    }

    public final void setOnFocusChanged$_design_modules_beduin_v2_renderer_component_input(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        this.onFocusChanged = lVar;
    }

    public final void setOnIconEndClick$_design_modules_beduin_v2_renderer_component_input(@Y61.l Y41.a<G0> aVar) {
        this.onIconEndClick = aVar;
    }

    public final void setOnIconStartClick$_design_modules_beduin_v2_renderer_component_input(@Y61.l Y41.a<G0> aVar) {
        this.onIconStartClick = aVar;
    }

    public final void setOnTextChanged$_design_modules_beduin_v2_renderer_component_input(@Y61.l Y41.l<? super String, G0> lVar) {
        this.onTextChanged = lVar;
    }

    public final void setState$_design_modules_beduin_v2_renderer_component_input(@Y61.k C c12) {
        ((C22082i3) this.state).setValue(c12);
    }

    public final void setStyle$_design_modules_beduin_v2_renderer_component_input(@Y61.k F f12) {
        ((C22082i3) this.style).setValue(f12);
    }
}
