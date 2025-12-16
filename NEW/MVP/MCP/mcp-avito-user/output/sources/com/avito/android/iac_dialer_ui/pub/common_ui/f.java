package com.avito.android.iac_dialer_ui.pub.common_ui;

import android.annotation.SuppressLint;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import coil.compose.C27242f;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIAudioModeItemInfo.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "imageLoaded", "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public static final IacUIAudioModeItemInfoState f167491a = new IacUIAudioModeItemInfoState(new IacPiiString("Длинное предлинное название объявления, которое точно не влезет в две строки"), null, new IacPiiString("100 Р"), true);

    /* compiled from: IacUIAudioModeItemInfo.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil/compose/f$c$d;", "it", "Lkotlin/G0;", "invoke", "(Lcoil/compose/f$c$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<C27242f.c.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f167492l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f167492l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(C27242f.c.d dVar) {
            IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState = f.f167491a;
            this.f167492l.setValue(Boolean.TRUE);
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIAudioModeItemInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacUIAudioModeItemInfoState f167493l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f167494m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f167495n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f167496o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f167497p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState, Y41.a<G0> aVar, v vVar, int i12, int i13) {
            super(2);
            this.f167493l = iacUIAudioModeItemInfoState;
            this.f167494m = (N) aVar;
            this.f167495n = vVar;
            this.f167496o = i12;
            this.f167497p = i13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167496o | 1);
            ?? r12 = this.f167494m;
            IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState = this.f167493l;
            f.a(iacUIAudioModeItemInfoState, r12, this.f167495n, a12, iA2, this.f167497p);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModeItemInfoState r41, @Y61.k Y41.a<kotlin.G0> r42, @Y61.l androidx.compose.ui.v r43, @Y61.l androidx.compose.runtime.A r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.common_ui.f.a(com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModeItemInfoState, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
