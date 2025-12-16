package com.avito.android.beduin.v2.page.modal;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.modal.ModalState;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.modal.d;
import com.avito.android.lib.util.darkTheme.c;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.interaction.detached.flow.modal.a;
import com.avito.beduin.v2.render.android_view.D;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinModalFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/modal/a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f105171a = new a();

    /* compiled from: BeduinModalFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.v2.page.modal.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3140a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105172a;

        static {
            int[] iArr = new int[ModalButtonsOrientation.values().length];
            try {
                ModalButtonsOrientation.a aVar = ModalButtonsOrientation.f337340b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModalButtonsOrientation.a aVar2 = ModalButtonsOrientation.f337340b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105172a = iArr;
        }
    }

    /* compiled from: BeduinModalFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$c;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$c;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<a.c, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f105173l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f105174m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C36216a[] f105175n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f105176o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105177p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.interaction.detached.flow.modal.a f105178q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Context f105179r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f105180s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105181t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.theme.k f105182u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, C36216a[] c36216aArr, boolean z12, Y41.a<G0> aVar, com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, Context context, boolean z13, Y41.a<G0> aVar3, com.avito.beduin.v2.theme.k kVar) {
            super(2);
            this.f105173l = str;
            this.f105174m = str2;
            this.f105175n = c36216aArr;
            this.f105176o = z12;
            this.f105177p = aVar;
            this.f105178q = aVar2;
            this.f105179r = context;
            this.f105180s = z13;
            this.f105181t = aVar3;
            this.f105182u = kVar;
        }

        @Override // Y41.p
        public final G0 invoke(a.c cVar, DialogInterface dialogInterface) {
            ArrayList arrayList;
            ModalState.c cVar2;
            a.c cVar3 = cVar;
            Context context = this.f105179r;
            AttributeSet attributeSet = null;
            C36216a[] c36216aArr = this.f105175n;
            if (c36216aArr != null) {
                a.f105171a.getClass();
                ArrayList arrayList2 = new ArrayList(c36216aArr.length);
                int length = c36216aArr.length;
                int i12 = 0;
                while (i12 < length) {
                    C36216a c36216a = c36216aArr[i12];
                    Button button = new Button(context, attributeSet, 0, 0);
                    button.setStyle((VU.b) D.a(c36216a.f333940f, this.f105182u));
                    String str = c36216a.f333936b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    boolean z12 = c36216a.f333938d;
                    Y41.a<G0> aVar = c36216a.f333939e;
                    button.setState(new UU.a(c36216a.f333935a, str2, c36216a.f333937c, z12, (aVar == null || z12) ? false : true, aVar, null, null, null, false, 960, null));
                    button.setClipToPadding(false);
                    D6.G(button, c36216a.f333943i);
                    arrayList2.add(button);
                    i12++;
                    attributeSet = null;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2 = this.f105178q;
            if (aVar2 instanceof a.C10453a) {
                Uri uri = Uri.parse(c.a(context) ? ((a.C10453a) aVar2).f337346b : ((a.C10453a) aVar2).f337345a);
                a.C10453a c10453a = (a.C10453a) aVar2;
                int i13 = c10453a.f337347c;
                int i14 = c10453a.f337348d;
                cVar2 = new ModalState.c(new Image(Collections.singletonMap(new Size(i13, i14), uri)), c10453a.f337347c, i14);
            } else {
                cVar2 = null;
            }
            cVar3.a(new ModalState(this.f105173l, this.f105174m, arrayList, this.f105176o, this.f105177p, cVar2, null, null, null, this.f105180s, this.f105181t, 448, null));
            return G0.f406611a;
        }
    }

    @k
    public static com.avito.android.lib.design.modal.a a(@k Context context, @k com.avito.beduin.v2.theme.k kVar, @l String str, @l String str2, @l C36216a[] c36216aArr, @l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @l Y41.a aVar, @l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @k Y41.a aVar3) {
        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
        d.a aVar4 = d.f179720u;
        int iJ2 = C35835l0.j(R.attr.modalDefault, context);
        aVar4.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178955Z);
        com.avito.android.lib.design.modal.d dVarB = d.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        com.avito.android.lib.design.modal.d dVar = new com.avito.android.lib.design.modal.d(dVarB.f179721a, dVarB.f179722b, dVarB.f179723c, dVarB.f179724d, dVarB.f179725e, dVarB.f179726f, (modalButtonsOrientation == null ? -1 : C3140a.f105172a[modalButtonsOrientation.ordinal()]) == 1 ? 0 : 1, dVarB.f179728h, dVarB.f179729i, dVarB.f179730j, dVarB.f179731k, dVarB.f179732l, dVarB.f179733m, dVarB.f179734n, dVarB.f179735o, dVarB.f179736p, dVarB.f179737q, dVarB.f179738r, dVarB.f179739s, dVarB.f179740t);
        b bVar = new b(str, str2, c36216aArr, z12, aVar, aVar2, context, z13, aVar3, kVar);
        c5284a.getClass();
        return a.C5284a.b(context, dVar, bVar);
    }
}
